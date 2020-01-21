name := "scapaPbEnum"

scalaVersion := "2.12.10"

//scalacOptions in ThisBuild ++= Seq("-Xfatal-warnings", "-Xlint")

PB.targets in Compile := Seq(scalapb.gen() -> (sourceManaged in Compile).value)

libraryDependencies ++= Seq(
  "com.thesamet.scalapb" %% "scalapb-runtime" % "0.9.6" % "protobuf",
//  "com.thesamet.scalapb" %% "scalapb-runtime-grpc" % "0.9.6",
  "com.beachape" %% "enumeratum"        % "1.5.13",
  "com.beachape" %% "enumeratum-circe"  % "1.5.22",
  "com.beachape" %% "enumeratum-json4s" % "1.5.15",
  "com.beachape" %% "enumeratum-quill"  % "1.5.15"
)
