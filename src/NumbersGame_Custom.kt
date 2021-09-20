import kotlin.random.Random

fun main(){
    val num = Random.nextInt(11)
        try {
            print("Enter your first number: ")
            val fiestNumber = readLine()!!.toInt()
            print("Enter your second number: ")
            val secondNumber = readLine()!!.toInt()
            var result = fiestNumber - num + secondNumber
            println("$fiestNumber - x +  $secondNumber == $result")
            print("What is X?: ")
            val guess = readLine()!!.toInt()
            when {
                guess >= 0 && guess <= 10 -> {
                    when {
                        guess == num -> {
                            println("You got it!")
                        }
                        else -> println("Wrong guess. the answer was " + num)
                    }
                }
                else -> println("Please enter numbers between 0 and 10")
            }
            println("Game Finished..")
        } catch (e: Exception) {
            println("Please enter numbers only")
        }


}