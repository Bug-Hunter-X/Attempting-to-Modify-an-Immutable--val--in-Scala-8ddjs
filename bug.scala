```scala
class MyClass(val value: Int) {
  def add(other: MyClass): MyClass = {
    new MyClass(this.value + other.value) 
  }
}

val obj1 = new MyClass(5)
val obj2 = new MyClass(10)
val result = obj1.add(obj2) //result is a new object
println(result.value) // this will print 15

obj1.value = 20 // this will throw compile time error as value is immutable
```