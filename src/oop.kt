fun main() {
var Iman=Human("Yahya",18,70)
    Iman.eat(3)
    Iman.speak("I love swimming and reading novels")
    Iman.birthday()
    var Yahya=User("Iman","Muthoni","muthoniyahya@gmail.com","0115626974",6029)
    println(Yahya.firstName)
    println(Yahya.email)
}
class Human(var name:String,var age:Int,var weight:Int){
    fun eat(foodWeight:Int){
        println("I am eating 3 kgs of food")
        weight=weight+foodWeight
        println(weight)
    }
    fun speak(speech:String){
        println("I love swimming and reading novels")

    }
    fun birthday(){
        age=age+1
        println(age)}
}
data class User(var firstName:String,var lastName:String,var email:String,var phoneNumber:String,var pass:Int){

}