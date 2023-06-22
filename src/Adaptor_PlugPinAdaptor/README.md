# PlugPinAdaptor | Adaptor Design Pattern

## Introduction

This project is a simple example of Adaptor Design Pattern. Here, we have 2 types of pins (square and round) and only one type of socket(square). We want to connect the square pin to the round socket. So, we use an adaptor to convert the square pin to a round pin.
<br>
The adaptor Class extends the RoundPin class and has a SquarePin object as a field. The adaptor class implements the RoundPin interface and overrides the getRadius method. The getRadius method returns the radius of the square pin.

## Getting Started

To use this code, you need to have a Java IDE installed on your machine. I used InteliJ IDE for Java Developers. You can download it from [here](https://www.jetbrains.com/idea/download/#section=windows).
Also, you need to have Java installed on your machine. You can download it from [here](https://www.java.com/en/download/).

## Running the tests

To run the tests, you need to run the main method in the Main class.
