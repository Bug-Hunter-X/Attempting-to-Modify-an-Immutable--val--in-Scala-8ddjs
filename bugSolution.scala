```scala
class MyClass(var value: Int) {
  def add(other: MyClass): MyClass = {
    new MyClass(this.value + other.value) 
  }
}

val obj1 = new MyClass(5)
val obj2 = new MyClass(10)
val result = obj1.add(obj2)
println(result.value) // this will print 15

obj1.value = 20 // this is now valid because value is mutable
println(obj1.value) // this will print 20
```