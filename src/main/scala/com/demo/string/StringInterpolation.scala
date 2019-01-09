package com.demo.string
/*
Starting in Scala 2.10.0, Scala offers a new mechanism to create strings from your data.
It is called string interpolation.
String interpolation allows users to embed variable references directly in processed string literals.
Scala provides three string interpolation methods: s, f and raw.
*/
class StringDemo{
  var pi = 3.14
  def show(){
    println("value of pi = "+pi)
  }
}
object StringInterpolation{
  def main(args:Array[String]){
    var s = new StringDemo()
    s.show()
  }
}
