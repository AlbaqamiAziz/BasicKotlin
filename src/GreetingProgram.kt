fun main(){
    print("Enter your name: ")
    var name = readLine()
    println("Hello $name, welcome to my program!")

    var msg = "Hello user, welcome to my program!"
    println(msg.replace("user","$name"))
}