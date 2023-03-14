object FactorialUsingTailRecursion extends App{
    def factorial(inputNumber: Int , accumulator: Int): Int = {
      if(inputNumber==0)
          accumulator
      else
          factorial(inputNumber-1, inputNumber * accumulator)
    }
}
