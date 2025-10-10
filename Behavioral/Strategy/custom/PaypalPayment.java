package Behavioral.Strategy.custom;
// Concrete strategies
public class PaypalPayment implements PaymentStrategy {

    public void pay(int amount) {
        System.out.println("Paid " + amount + " using Paypal.");
    }
}

// Library --
// Section --
// Users -- List<Books> , returned, taken
// Books -- Author, takenBy - User, takenDate, return Date,
// Issuing a book by a student --
// Return a book by student --
// User -- Student, Admin --
// Library Card -- Library

//  Section
//  Category
//  Authorization
//  Student
//  Book
//  --Reading
//