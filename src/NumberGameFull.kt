import kotlin.random.Random

fun main(){
    val num = Random.nextInt(11)
    var count = "" // count winning times by a string var instead of int
    println("type 'quit' at any point to exit the game ")

    while(count.length != 3) {

        print("Guess a number between 0 and 10 : ")
        val guess = readLine()
        when {
            guess == "quit" -> break
        }
        try {
            val tempGuess = guess!!.toInt()
            when {
                tempGuess >= 0 && tempGuess <= 10 -> {
                    when {
                        tempGuess == num -> {
                            println("You got it!")
                            count += "l"
                        }
                        else -> println("Wrong guess. the answer was " + num)
                    }
                }
                else -> println("Please enter numbers between 0 and 10")
            }
            println("Game Over..")
        } catch (e: Exception) {
            println("Please enter numbers only")
        }

    }

}