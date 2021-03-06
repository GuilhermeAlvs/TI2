/*
 * This file was generated by the Gradle 'init' task.
 *
 * This is a general purpose Gradle build.
 * Learn more about Gradle by exploring our samples at https://docs.gradle.org/7.2/samples
 */
plugins {
  java
  application
}
application {
  mainClassName = "Translate"
}
repositories {
  mavenCentral()
}
dependencies {
  compile("com.squareup.okhttp:okhttp:2.5.0")
  compile("com.google.code.gson:gson:2.8.5")
}
