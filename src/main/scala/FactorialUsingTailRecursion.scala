object FactorialUsingTailRecursion extends App{
    def factorial(inputNumber: Int , accumulator: Int): Int = {
      if(inputNumber < 0)
        throw new IllegalArgumentException("factorial not defined for negative values")
      if(inputNumber==0)
          accumulator
      else
          factorial(inputNumber-1, inputNumber * accumulator)
    }
}
