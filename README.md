# Time Conversion by Country (Java)

A Java program for converting the current time to different time zones based on countries. This program uses the `java.time` package introduced in Java 8 to perform time zone conversions.

## Features

- Converts the current time to 10 different countries' time zones.
- Provides a flexible framework for adding more countries and time zones.
- Uses the `java.time` package for accurate and reliable time calculations.

## Technologies Used

- **Java**: The program is written in Java, making use of the `java.time` package for date and time operations.
- **Git**: Version control system used for tracking changes in the project.
- **IDE (Integrated Development Environment)**: You can use any Java IDE such as Eclipse, IntelliJ IDEA, or Visual Studio Code to work with the project.

## Prerequisites

- Java Development Kit (JDK) 8 or later.
- An integrated development environment (IDE) for Java, such as Eclipse or IntelliJ IDEA.

## Usage

1. Clone or download this repository to your local machine:

```shell
git clone https://github.com/yourusername/time-conversion-java.git
```
Open the project in your Java IDE.

Run the TimeConversionByCountry.java file to see the current time in different countries' time zones.

The program will display the current time for the specified countries, as well as additional countries you may add.

## Adding More Countries
You can easily add more countries and their corresponding time zones to the program:

Open the TimeConversionByCountry.java file.

Locate the countryToTimeZone method.

Add a new case statement for the country you want to add and specify its corresponding time zone using the IANA Time Zone Database format.

```shell
case "NewCountry":
    return "Continent/Region";
```
In the main method, add the name of the new country to the countries array.

Run the program again to see the current time for the newly added country.
