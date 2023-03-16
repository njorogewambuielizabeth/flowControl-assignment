fun main() {
numbers()
    humanNames(arrayOf("Cat","Hippopotumus","lion","zebras"))
    differentDrinks(4)
    differentDrinks(13)
    differentDrinks(21)
    fizzing()

}
fun numbers(){

    for(m in  1..100)
        if (m %2 !=0){
    println(m)

} }
fun humanNames(names:Array<String>):Int{
    var read = 0
    for (name in names){
        if (name.length>5){
            read++
        }
    }
    return read

}
fun differentDrinks(age:Int){
    when{
        age <6 -> println("get a glass of milk")
        age <15 -> println("get a bottle of fanta orange")
        else -> println("get a bottle of cocacola")
    }

}
fun fizzing(){
    for (v in 1..100){
        when{
            v % 3 ==0 && v % 5 ==0 -> println("fizzBuzz")
            v % 3 ==0 -> println("Fizz")

            v % 5 ==0 -> println("Buzz")
            else -> println(v)
        }
    }
}