package com.knoldus

import scala.annotation.tailrec
class SumOfList {
    //Takes int of list as input and returns the sum of elements of list
     def calculateSumOfNumbers(numbers: List[Int]): Int = {
      @tailrec
      def calculateSumOfNumbersHelper(numbers: List[Int], sum: Int): Int = {
        numbers match {
          case ::(head, next) => calculateSumOfNumbersHelper(next, sum + head)
          case Nil => sum
        }
      }
      //calling tail recursive method with initial value of sum as zero
      calculateSumOfNumbersHelper(numbers, 0)
    }
}
