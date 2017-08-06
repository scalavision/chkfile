package scalavision.chkfile
import dispatch._, Defaults._

object ChkFile {
  def apply(
    targetUrl: String,
    fileName: String
  ) = {

    val svc = url(targetUrl)
    //val secureConnection = host("example.com").secure

    val shaSum: Future[String] = Http.default(svc OK as.String)




  }
}
