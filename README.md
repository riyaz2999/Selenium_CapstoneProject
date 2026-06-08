# Selenium Automation Project

## Overview

This project automates UI elements on a practice website using Selenium WebDriver with Java. It demonstrates handling of forms, date pickers, file uploads, alerts, and advanced user interactions.

---

## Project Structure

```
Selenium_CapstoneProject
│
├── src
│   └── main
│       └── java
│           └── riyaz_wipro
│               └── CapstoneProject
│                   └── MainCapstone.java
│
├── .gitignore
└── README.md
```

---

## File Breakdown

MainCapstone.java

* Main automation script
* Covers all UI interactions in one execution flow

---

## Features Implemented

Form Handling

* Input fields: name, email, phone, address

Selection Handling

* Radio buttons
* Checkboxes
* Dropdowns

Date Pickers

* Standard input date
* Read-only field using JavaScriptExecutor
* Date range picker using JavaScript

File Upload

* Single file upload
* Multiple file upload

User Actions

* Double click
* Mouse hover
* Drag and drop
* Slider movement

Alerts Handling

* Simple alert
* Confirm alert
* Prompt alert

JavaScript Execution

* Scroll down
* Scroll up

---

## Tech Stack

* Java
* Selenium WebDriver
* WebDriverManager
* ChromeDriver

---

## How to Run

1. Clone the repository
2. Open in Eclipse or IntelliJ
3. Run MainCapstone.java

---

## Test Cases with Screenshots

| #  | Test ID | Element           | Action Description                              | Expected Result              | Screenshot          |
| -- | ------- | ----------------- | ----------------------------------------------- | ---------------------------- | ------------------- |
| 1  | TC01    | Name field        | Enter text using sendKeys                       | Name entered successfully    | ![TC01](./tc01.png) |
| 2  | TC02    | Email field       | Enter text using sendKeys                       | Email entered successfully   | ![TC02](./tc02.png) |
| 3  | TC03    | Phone field       | Enter text using sendKeys                       | Phone number entered         | ![TC03](./tc03.png) |
| 4  | TC04    | Address textarea  | Enter text using sendKeys                       | Address entered              | ![TC04](./tc04.png) |
| 5  | TC05    | Gender radio      | Click if not already selected                   | Gender selected              | ![TC05](./tc05.png) |
| 6  | TC06    | Days checkboxes   | Select Monday, Wednesday, Friday                | Checkboxes selected          | ![TC06](./tc06.png) |
| 7  | TC07    | Dropdowns         | Select Country, Color, Animal                   | Values selected correctly    | ![TC07](./tc07.png) |
| 8  | TC08    | Date Picker 1 & 2 | Set dates using sendKeys and JavaScriptExecutor | Dates set correctly          | ![TC08](./tc08.png) |
| 9  | TC09    | Date Picker 3     | Set start and end date using JavaScript         | Date range set correctly     | ![TC09](./tc09.png) |
| 10 | TC10    | File upload       | Upload file using sendKeys                      | File uploaded successfully   | ![TC10](./tc10.png) |
| 11 | TC11    | Slider            | Move slider using arrow keys                    | Slider moved                 | ![TC11](./tc11.png) |
| 12 | TC12    | Simple alert      | Accept alert                                    | Alert handled                | ![TC12](./tc12.png) |
| 13 | TC13    | Confirm alert     | Accept confirmation                             | Alert handled                | ![TC13](./tc13.png) |
| 14 | TC14    | Prompt alert      | Enter text and accept                           | Input submitted              | ![TC14](./tc14.png) |
| 15 | TC15    | Mouse hover       | Hover and click “Mobiles”                       | Menu option selected         | ![TC15](./tc15.png) |
| 16 | TC16    | Double click      | Copy text from Field1 to Field2                 | Text copied successfully     | ![TC16](./tc16.png) |
| 17 | TC17    | Drag and Drop     | Drag source element to target                   | Element dropped successfully | ![TC17](./tc17.png) |
| 18 | TC18    | Scroll Down       | Scroll to bottom using JavaScriptExecutor       | Page scrolled to bottom      | ![TC18](./tc18.png) |
| 19 | TC19    | Scroll Up         | Scroll to top using JavaScriptExecutor          | Page scrolled to top         | ![TC19](./tc19.png) |

---

## Key Learning

* Handling different types of date pickers
* Working with dynamic elements
* Using JavaScriptExecutor for edge cases
* Performing advanced UI interactions
* Structuring Selenium automation projects

---

## Author

Riyaz Shaik
