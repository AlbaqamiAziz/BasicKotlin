fun main(args: Array<String>){
    val num = 3
    print("Guess a number between 0 and 10 : ")

    try {
        val guess = readLine()!!.toInt()
        if(guess >= 0 && guess <= 10 ){
            if(guess == num){
                println("You got it!")
            } else {
                println("Wrong guess. the answer was " + num )
            }
        }else {
            println("Please enter numbers between 0 and 10")
        }
        println("Game Over..")
    } catch (e: Exception) {
        println("Please enter numbers only")
    }

}