// SRP stands for Single Responsibility Principle and suggests us that there should'n be more than one reason for a class to change.

/**
 * File: Restaurant_Good.kt
 * Purpose: Demonstrates a violation of the Single Responsibility Principle (SRP)
 * 
 * Description:
 * This example shows that there is a dedicated class for a single responsibilities such as 
 * taking orders, preparing food, serving food — violating SRP.
 * 
 * Author: Ishu Sharma
 * Date: May 5th, 2025
 */

class Manager {

    // creating the invoice
    fun createInvoice () {
        println("Manager Creating Invoice.")
    }

}

class Waiter {

    // taking orders from customer
    fun takeOrder () {
        println("Waiter Taking Order.")
    }

    // serving the food for the order
    fun serveFood () {
        println("Waiter Serving Food.")
    }

}

class Chef {

    // preparing the food for the order
    fun prepareFood () {
        println("Chef Preparing Food.")
    }

}

fun main () {

    val waiter = Waiter()
    waiter.takeOrder()

    val chef = Chef()
    chef.prepareFood()

    waiter.serveFood()
    
    val manager = Manager()
    manager.createInvoice()

}