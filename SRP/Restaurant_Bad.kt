// SRP stands for Single Responsibility Principle and suggests us that there should'n be more than one reason for a class to change.

/**
 * File: Restaurant_Bad.kt
 * Purpose: Demonstrates a violation of the Single Responsibility Principle (SRP)
 * 
 * Description:
 * This example shows a class that handles multiple responsibilities such as 
 * taking orders, preparing food, serving food — violating SRP.
 * 
 * Author: Ishu Sharma
 * Date: May 5th, 2025
 */

class RestaurantManager {

    // taking orders from customer
    fun takeOrder () {
        println("Manager Taking Order.")
    }

    // preparing the food for the order
    fun prepareFood () {
        println("Manager Preparing Food.")
    }

    // serving the food for the order
    fun serveFood () {
        println("Manager Serving Food.")
    }

    // creating the invoice
    fun createInvoice () {
        println("Manager Creating Invoice.")
    }

}

fun main () {

    val manager = RestaurantManager()

    manager.takeOrder()
    manager.prepareFood()
    manager.serveFood()
    manager.createInvoice()

}