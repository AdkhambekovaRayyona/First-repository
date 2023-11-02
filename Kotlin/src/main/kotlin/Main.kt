import java.sql.Time
import java.util.SimpleTimeZone

//fun main() {
//    val dog = Animal(); dog.sound = "gaf-gaf"; dog.meal = "meat"
//    val cat = Animal(); cat.meal = "mouse"; cat.sound = "meow"
//    dog.eat(); cat.eat()
//    dog.makeSound(); cat.makeSound()
//}
//
//class Animal {
//    var meal = ""
//    var sound = ""
//    fun eat() {
//        println("I am eating $meal")
//    }
//
//    fun makeSound() {
//        println("I am ${sound}ing")
//    }


//    val tashkent = Province(); tashkent.maydoni = "30000"; tashkent.aholi = "545132"; tashkent.nomi="Toshkent"
//    val andijan = Province(); andijan.maydoni = "32555"; andijan.aholi = "68745"; andijan.nomi="Andijon"
//    val fergana = Province(); fergana.maydoni = "85412"; fergana.aholi = "65412"; fergana.nomi = "Farg'ona"
//    val samarkand = Province(); samarkand.maydoni = "98542"; samarkand.aholi = "65123"; samarkand.nomi="Samarqand"
//    val navoiy = Province(); navoiy.maydoni = "65412"; navoiy.aholi = "85435"; navoiy.nomi="Navoiy"
//    val namangan = Province(); namangan.maydoni = "414565"; namangan.aholi = "54125"; namangan.nomi="Namangan"
//    val bukhara = Province(); bukhara.maydoni = "954125"; bukhara.aholi = "542684"; bukhara.nomi="Buxoro"
//    val jizzakh = Province(); jizzakh.maydoni = "642245"; jizzakh.aholi = "9874563"; jizzakh.nomi="Jizzax"
//    val termiz = Province(); termiz.maydoni = "8412684"; termiz.aholi = "651265"; termiz.nomi="Termiz"
//
//    tashkent.maydoni(); andijan.maydoni(); fergana.maydoni(); samarkand.maydoni(); navoiy.maydoni();
//    namangan.maydoni(); bukhara.maydoni(); jizzakh.maydoni(); termiz.maydoni()
//
//    tashkent.aholi(); andijan.aholi(); fergana.aholi(); samarkand.aholi(); navoiy.aholi();
//    namangan.aholi(); bukhara.aholi(); jizzakh.aholi(); termiz.aholi()
//}
// class Province {
//     var nomi=""
//     var maydoni = ""
//     var aholi = ""
//     fun maydoni() {
//         println("$nomi maydoni $maydoni")
//     }
//     fun aholi() {
//         println("$nomi aholi $aholi")
//     }
//    val dilshod = Person(
//        "dilshod",
//        "fghjrc",
//        20,
//        "qwsdef",
//        "reading book"
//    )
//
//    val hp = Laptop(16, 512, 15.6, "Envy", 1100.0f)
//    val macBookPro = Laptop(16, 512, 14.2, "Pro", 1850.0f)
//    val macBookAir = Laptop(8, 256, 13.3, "Air", 950.0f)
//
//    println(hp.model)
//    println(macBookPro.model)
//    println(macBookAir.model)
//
//}
//
//    data class Person(
//        val surname: String,
//        val name: String,
//        val age: Int,
//        val adress: String,
//        val hobby: String
//    )
//
//
//    data class Laptop(
//        val ram: Int,
//        val rom: Int,
//        val displey: Double,
//        val model: String,
//        val price: Float
////    )
//data class Person(
//        val job: Job,
//        val family: Family,
//        val car : Car
//)
//
//data class Job(
//    val salary: Float,
//    val name: String,
//    val time: Int
//)
//
//data class Family(
//    val parents: Int,
//    val sister: Int,
//    val brother: Int,
//
//)
//
//data class Car(
//    val model: String,
//    val price: Float,
//    val color: String
//)
//
//fun main() {
//    val person = Person(
//        Job(5000.0f, "developer", 5),
//        Family(1, 1, 1),
//        Car("MALIBU 2", 35000.0f, "white")
//    )
//
//
//    println(person.family)

//
//    data class Temperature(
//        val tempInCelsius: Double,
//        val pressure: Int,
//        val humidity: Int
//    ) {
//        fun getAsFahrenheit(): Double {
//            return tempInCelsius * 1.8 + 32
//        }
//    }
//
//    fun getAsKelvin(): Double {
//        return tempInCelsius + 273.15
//    }
//
//
//fun main() {
//
//    val temperature = Temperature(20.0, 1000, 50)
//    println(temperature.tempInCelsius)
//    println(temperature.getAsFahrentheit())
//    println(temperature.getAsKelvin())
//
//    val water = Water(20, 10)
//    println(water.standard())
//
//    val marriage = Marriage(Skincolor.African, Skincolor.White)
//    println(marriage.getChild())
//
//    val color = Gradient(Color.Red, Color, Black)
//    color.primaryColor
//    color.secondaryColor
//    println(color.mix())
//}
// data class Water(
//     val hot: Int,
//     val cold: Int
// ){
//     fun standard(): Int{
//         return(hot+cold)/ 2
//     }
// }
// enum class SkinColor{
//     White, Black, Asian , Mandarin, African, Eskimos
// }
// data class Marriage(
//     val wife: SkinColor,
//     val husband: SkinColor
// ){
//     fun getChild(): SkinColor{
//     return if (wife == SkinColor.White && husband== SkinColor.Black) SkinColor.African
//     else if (wife == SkinColor.Mandarin && husband == SkinColor.Asian )SkinColor.Asian
//     else if (wife== SkinColor.White && husband == SkinColor.White)SkinColor.White
//     else SkinColor.African
// }
//
//}
// enum class Colour {
//     Red, Blue , Green, Black
// }
//
//data class Gradient(
//    val primaryColor: Colour,
//    val secondaryColor:Colour
//)
//{
//    fun mix():String{
//        return if (primaryColor== Colour.Green && secondaryColor== Colour.Blue)"Cyan"
//        else if (primaryColor == Colour.Red && secondaryColor == Colour.Black)"Dark Red"
//        else "Unknown"
//
//    }
//}
/*
data class Book(
var title: String,
var author: String,
var year: Int
)

fun getAsXML():String {
    println(title.getAsXML)
}

*/

/* Class constructor*/

//class Person(val name: String, val age: Int )
// fun greet(){
//   println("Hello, My name is $name!")
//  }
//fun getYearOfBirth()= 2023-age
//
//fun main(){
//val person = Person("John", 25)
//  println(person.getYearOfBirth)
// }

/* Order taking app */

//class Menu(val onemeal: String,twomeal:String, threemeal:String, var bill: Int ) {
//
//    takingapp(name: Palov): this(name,bill:5){
//        println("Secondary takingapp")
//    }
//    constructor(name: Palov): this(name,bill:5){
//        println("Secondary constructor")
//    }
//
//        println("$bill for your bill")
//    }
//    fun giveYouBill()= 5-bill
//}
//
//fun main(){
//    val menu = Menu("Palov", "nothing","nothing", 5)
//    println(menu.giveYouBill())
//
//    val menu1 = Menu("Palov","kebab","nothing",  5)
//    println(menu1.giveYouBill())
//
//    val menu2 = Menu("Palov","kebab","lagman",  5)
//    println(menu2.giveYouBill())
//}


//fun main() {
//    "Islom".printLastCharacter()
//    "Hello World".printLastCharacter()
//    30.0.percent(20.0).print()
//}
//
//fun Double.print() {
//    println(this)
//}
//
//fun Double.percent(percent: Double): Double {
//    return this / 100 * percent
//}
//
//
//fun String.printLastCharacter() {
//    println(this[this.lastIndex])
//}


//
//fun main() {
//    println(30 percent 20)
//    println(100 add 10)
//}
//
//
//infix fun Int.percent(percent: Int): Int {
//    return (this / 100.0 * percent).toInt()
//}
//
//infix fun Int.add(b: Int): Int {
//    return this + b
//}
//-----------1------------
//fun main (){
//      50.0. divide (20.0).print()
//}
//
// infix fun Double.divide(divide:Double):Double {
//    return this / 40.0
//}


//
//
//          //-----------2---------
//fun main(){
//    var user= readln()
//              println(user == "Hello World")
//
//
//}
//             //-------------3----------
//
//fun main () {
//    val letter = "a,b,c,d,e"
//    if ()
//}

//fun main (){
//    val dog = Dog()
//    dog.eat("bone")
//    dog.makeSound("gaff")
//}
//
//open class Animal{
//    fun eat (meal: String){
//        println("I am eating $meal")
//    }
//
//    fun makeSound(sound: String){
//        println("I am ${sound}ing")
//    }
//}
//
//class Dog : Animal(){
//
//}

//open class Shape{
//    open fun calculateArea(a:Int,b:Int):Int{
//        return 0
//    }
//}
// class Rectangle : Shape() {
//     override fun calculateArea(a: Int, b:Int):Int{
//         return a * b
//     }
// }
//
//class Triangle : Shape(){
//    override fun calculateArea(a:Int, b:Int):Int{
//        return a * b/2
//    }
//}
//
//
//fun main (){
//    val triangle = Triangle()
//    println(triangle.calculateArea(5,4))
//
//    val rectangle = Rectangle()
//    println(rectangle.calculateArea(5,4))
//}

//-----------------------------20.072023------------------------
// when   walk
//  fun main (){
//      val data = readln().toInt()
//      when (data){
//          10-> println("It is 10")
//          20-> println("It is 20")
//          else -> println("It is not 10")
//      }
//  }

//fun main (){    xatoooooo
//    walk(100)
//}
//fun walk(number:Int){
//    if(number>24){
//        println("True")
//        walk(number/2)
//    }
//    else println("False")






//fun main() {
//    val numbers = intArrayOf(1, 2, 3, 4, 5, 6, 7, 8, 9,10)
//    val sum = sumOfEvenIndexedNumbers(numbers)
//    println("Sum even numbers:$sum")
//
////fun sumOfEvenNumbers ( numbers:IntArray):Int {
////    var sum = 0
////    for (number in numbers) {
////        if (number % 2 == 0) {
////            sum += number
////        }
////    }
////    return sum
////}
//fun sumOfEvenIndexedNumbers(numbers:IntArray):Int{
//    var sum = 0:
//    for (i in 0..<numbers.size/2){
//        sum+=numbers[i *3]
//    }
//    return sum
//}

//val name: String = "nate"
//var greeting : String? = null
//
//fun main() {
//    val greetingToPrint = if(greeting != null) greeting else "Hi"
//
//    println(greetingToPrint)
//    println(name)
//
//
//}

//fun getGreeting():String
//
//fun main (){
//    println("hello")
//}

//import javax.swing.JOptionPane.showInputDialog as input
//import javax.swing.JOptionPane.showConfirmDialog as confirm
//
//fun main(){
//    val data = input (null,"What is your name?")
//    confirm(null, "Hello $data")
//}

//import javax.swing.JOptionPane
//import javax.swing.JOptionPane.showInputDialog as input
//import javax.swing.JOptionPane.showConfirmDialog as confirm
//
//fun main(){
//    val data = input(
//        null,
//        "Welcome to our restaruant! What kind of dish do you want\n"+
//     "1) Turkish dish\n"+
//     "2) Europe dish\n"+
//                "3) Steake"
//    )
//
//when (data.toInt()){
//    1 -> confirm(null, "You want to eat Turkish dish")
//    2 -> confirm(null,"You want to eat Europe dish")
//    3 -> confirm(null,"You want to eat Steake")
//    else -> JOptionPane.showMessageDialog(null,"You entered wrong number")}
//}
//
//val data = JOptionPane.showInputDialog()
//
//
//    }
//
//}


















