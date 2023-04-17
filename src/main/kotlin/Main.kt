
fun main(){
    oddNumbers()
    println(countNames(arrayOf("Marrion","Clever","Ivy","Mumo","Batoto","Bruno")))
    drinkingParty(4)
    drinkingParty(13)
    drinkingParty(20)
    multiplication()
    println(reversedString("Leleshep"))
    println(integers(arrayOf(12,7,8,10,33,28)))
//    println(countName(arrayOf()))
    println(countName(arrayOf("Milkah","Anny","Sammy","Duncan")))


}

//Create a function that prints out all the odd numbers between 1 and 100
fun oddNumbers(){
    for (i in 1 ..100){
        if (i % 3==0){
            println("odd $i")
        }

    }
}

//Create a function that takes in an array of names and returns the
//number of names longer than 5 characters
fun countNames(names:Array<String>):Int {
    var i = 0
    for (name in names) {
        if (name.length > 5) {
            i++
        }
    }
    return i
}

//You are creating a robot to serve drinks at a party. The robot is required to
//serve a glass of milk for guests under the age of 6. For guests under the age of
//15 but over the age of 6, the robot serves a bottle of fanta orange. Everybody
//else gets a bottle of coca cola. Create a function that will make these
//decisions, printing out the name of the drink each person gets according to
//their age.
fun drinkingParty(age:Int){
    when(age){
        in (1..5)-> println("glass of milk")
        in (6..14)-> println("fanta orange")
        else -> println("coca cola")
    }
}

//Write a function that prints each number from 1 to 100 on a new line. For each
//multiple of 3, print "Fizz" instead of the number. For each multiple of 5, print
//"Buzz" instead of the number. For numbers which are multiples of both 3 and
//5, print "FizzBuzz" instead of the number.
fun multiplication(){
    for (i in 1..100){
        if (i %3==0 && i%5==0){
            println("$i BizzBuzz")
        }
        else if (i %3==0){
            println("$i Fizz")
        }
        else{
            println("$i Buzz")
        }
    }
}

//Write a function that takes in a string and returns the string reversed.
fun reversedString(str: String):String{
    return str.reversed()
}

//Write a function that takes in an array of integers and
//returns the sum of all the even numbers in the array.
fun integers(arr:Array <Int>):Int{
    var sum=0
    for (i in arr){
        if (i %2==0){

        }
        sum+=i
    }
    return sum

}

//Create a function that takes in an array of names and returns the
//number of names longer than 5 characters
fun countName(names: Array<String>): Int {
    var count = 0
    for (name in names) {
        if (name.length > 5) {
            count++
        }
    }
    return count
}


