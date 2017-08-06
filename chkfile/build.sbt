// give the user a nice default project!
lazy val root = (project in file(".")).
  settings(
    inThisBuild(List(
      organization := "scalavision",
      scalaVersion := "2.12.3",
      libraryDependencies ++= Seq(
        "net.databinder.dispatch" %% "dispatch-core"    % "0.13.1"
        ,"co.fs2"                 %% "fs2-core" % "0.9.6"
        ,"co.fs2"                 %% "fs2-io" % "0.9.6"
        ,"ch.qos.logback"          %  "logback-classic" % "1.2.3"
        ,"org.specs2"           %% "specs2-core"        % "3.9.4"
        ,"com.lihaoyi"          %% "sourcecode"         % "0.1.4"
        ,"com.lihaoyi"          %% "pprint"             % "0.5.2"
        ,"com.lihaoyi"          %% "fastparse"          % "0.4.3"
        ,"org.typelevel"        %% "cats"               % "0.9.0"
        ,"co.fs2"               %% "fs2-core"           % "0.9.7"
        ,"co.fs2"               %% "fs2-io"             % "0.9.7"
        ,"com.github.pathikrit" %% "better-files"       % "3.0.0"
        ,"org.scalacheck"       %% "scalacheck"         % "1.13.4"
      )
    )),
    name := "ChkFile"
  )
