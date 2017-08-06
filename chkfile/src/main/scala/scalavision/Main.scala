package scalavision


/**

import java.io._
import java.math._
import java.security._


val file = new File(args(0))
val h = hash(file)
println(new BigInteger(1, h).toString(16)) // Dump out hash as hex


def hash(file: File): Array[Byte] = {
  val in = new BufferedInputStream(new FileInputStream(file))
  val digest = MessageDigest.getInstance("SHA-512");
  val buffer = Array.ofDim[Byte](1048576) // 1 MB. I tried 4MB and it was the same
  var sizeRead = -1
  var ok = true
  while(ok) {
    sizeRead = in.read(buffer)
    if (sizeRead == -1) ok = false
    else digest.update(buffer, 0, sizeRead)
  }
  in.close()

  digest.digest()
}
  */

object Main extends App {
  println("Hello, World!")
}
