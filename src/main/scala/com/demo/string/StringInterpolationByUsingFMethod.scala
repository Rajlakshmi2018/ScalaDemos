package com.demo.string

/*Scala String Interpolation Example By using f Method
The f method is used to format your string output.
It is like printf function of c language which is used to produce formatted output.
You can pass your variables of any type in the print function.*/

class StringExample{
  var s1 = "Scala string example"
  var version = 2.12
  def show(){
    println(f"This is $s1%s, scala version is $version%2.2f")
  }
}


object StringInterpolationByUsingFMethod{
  def main(args:Array[String]){
    var s = new StringExample()
    s.show()
  }
}