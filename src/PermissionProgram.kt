fun main(args: Array<String>){
    print("Enter your age: ")

    try {
            val age = readLine()!!.toInt()
            if(age > 20){
                println("Welcome!")
            }else {
                println("You are not old enough..")
            }
    } catch (e: Exception) {
            println("Please enter numbers only")
    }

}