package com.knoldus

object Driver extends App{
  private val sumOfListObject = new SumOfList
  private val inputList = List(2, 5, 7, 55, 3)
  //calling method calculateSumOfNumbers with inputList as input and storing it in resultOfSUm
  private val resultOfSum = {
    sumOfListObject.calculateSumOfNumbers(inputList)
  }
  println("Result of sum of numbers is = " + resultOfSum)
}
