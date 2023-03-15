object FactorialUsingTailRecursion extends App{
    // function that will return factorial
    //this function will be executed recursively
  def factorial(inputNumber: Int , accumulator: Int): Int = {
    if(inputNumber < 0)
      throw new IllegalArgumentException("factorial not defined for negative values")
    else if(inputNumber==0)
      accumulator
    else
      factorial(inputNumber-1, inputNumber * accumulator)
    }
}
