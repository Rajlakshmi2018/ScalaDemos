package com.demo.string

/*Scala String Interpolation Example By using s Method
The s method of string interpolation allows us to pass variable in string object.
You don't need to use + operator to format your output string. In the following example, a string variable is passed to string in the print function.
This variable is evaluated by compiler and variable is replaced by value.*/

class StringExample1{
  var pi = 3.14
  def show(){
    println(s"value of pi = $pi")
  }
}

object StringInterpolationConcatinationWithoutPlusOperator{
  def main(args:Array[String]){
    var s = new StringExample()
    s.show()
  }
}
