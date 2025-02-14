```scala
class MyClass[T](val value: T) {
  def myMethod(x: T): T = {
    if (x == null) {
      value  //This will throw a NullPointerException if T is a primitive type like Int
    } else {
      x
    }
  }
}

object Main extends App {
  val myInt = new MyClass(10)
  println(myInt.myMethod(null))
}
```