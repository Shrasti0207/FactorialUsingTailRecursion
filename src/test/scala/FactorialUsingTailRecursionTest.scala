import org.scalatest.funsuite.AnyFunSuite
class FactorialUsingTailRecursionTest extends AnyFunSuite{
  test("calculate factorial of the number") {
    assert(FactorialUsingTailRecursion.factorial(5,1) === 120)
  }

  test("calculate factorial if the number is 0") {
    assert(FactorialUsingTailRecursion.factorial(0, 1) === 1)
  }
}
