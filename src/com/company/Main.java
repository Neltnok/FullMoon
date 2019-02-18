// Design a program that will determine when the next full moon will be based upon the current date.

// Sample output
// Today's date is: 6/28/2017
// The next full moon will be: 7/8/2017
// Wear silver or stay inside at night until 7/11/2017


// pseudo code
// full moons occur with a period of 29.5 days or 708 hours so we have to include time as well as date
// create an object to hold the current date and time

// display the current date with appropriate format of M/d/yyyy
// create an object to hold the date of the first full moon in 2019 January 20, 10:17 PM
// increment the full moon date until it falls after the current date
// display the date of the next full moon after the current date
// add 3 days to the full moon date
// display the warning message

package com.company;

import  java.time.*;
import  java.time.format.DateTimeFormatter;
import  java.time.temporal.ChronoUnit;
import java.util.Scanner;


import java.util.Scanner;

public class Main {

    // create an objec ot type scanner to handle user input
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

    // create a DateTimeFormatter object to set up the desired date format
    // used LocalDateTime object as our base as the full moons cycle every 29.5 days
    DateTimeFormatter   formatter = DateTimeFormatter.ofPattern("M/d/yyyy");

    // create a Local Date object for today's date
    LocalDateTime   today = LocalDateTime.now();

    // create a String of the desired format from the today object
    String textToday = today.format(formatter);

    // print out todays date
    System.out.println("Todays date is " + textToday);


    // create a date object that holds the date and time of the first full moon of 2019
    LocalDateTime   fullMoon = LocalDateTime.of(2019,1,20,22,17);

    // add 29.5 days to the first full Moon date until it is greater than todays date.
    // so we add the number of hours 29.5 * 24 = 708

        while (fullMoon.isBefore(today)){
            fullMoon = fullMoon.plusHours(708);
        }

        // print out the date of the next full moon
        System.out.println("The next full moon will be " + fullMoon.format(formatter));

        // add 3 days to the full Moon date
        fullMoon = fullMoon.plusDays(3);

        // print out the warning
        System.out.println("Wear silver or stay inside at night until " + fullMoon.format(formatter));


    }
}
