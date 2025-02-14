```scala
class MyClass[T](val value: T) {
  def myMethod(x: T): T = x match {
    case null => value
    case _ => x
  }
}

object Main extends App {
  val myInt = new MyClass(10)
  println(myInt.myMethod(null)) //Handles NullPointerException, prints 10
  val myString = new MyClass("hello")
  println(myString.myMethod(null)) //Handles NullPointerException, prints "hello"
}
```