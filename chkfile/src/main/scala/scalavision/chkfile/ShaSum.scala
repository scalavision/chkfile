package scalavision.chkfile

object ShaSum {
  def apply(
    fileName: String,
    bitSum: String
  ) = {


    //import java.io._
    import java.math._
    import java.security._

    import better.files._
    import better.files.Dsl


    val file = Dsl.pwd / fileName
    val h = hash(file)
    println(new BigInteger(1, h).toString(16)) // Dump out hash as hex


    //TODO: Fix up all this mess using FS2 !!!

    def hash(file: File): Array[Byte] = {
      val in = file.bytes.toStream
      // "SHA-512"
      val digest = MessageDigest.getInstance(bitSum);





      val buffer = Array.ofDim[Byte](1048576) // 1 MB. I tried 4MB and it was the same

      var sizeRead = -1
      var ok = true



      Stream.iterate(in.head, buffer.size) { bytes =>
        digest.update(bytes)
      }

      in.foldLeft(digest) { (d, b) =>

      }



      while(in.hasNext) {

        if(in.size <= buffer.size) {

        } else {

          val bytes = in.foldLeft(Array.empty[Byte]) { (acc, b) =>
            b +: acc
          }

          digest.update(buffer.update(0, bytes))
        }


      }


      while(ok) {
        buffer.update(0, in.take(buffer.size).next())
        if (sizeRead == -1) ok = false
        else digest.update(buffer, 0, sizeRead)
      }



      while(ok) {
        sizeRead = in.read(buffer)
        if (sizeRead == -1) ok = false
        else digest.update(buffer, 0, sizeRead)
      }
      in.close()

      digest.digest()
    }


  }
}
