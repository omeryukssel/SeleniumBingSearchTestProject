# Selenium Bing Search Test Project

[![Java](https://img.shields.io/badge/Java-8+-orange.svg)](https://www.java.com/)
[![Selenium WebDriver](https://img.shields.io/badge/Selenium%20WebDriver-4.x-blue.svg)](https://www.selenium.dev/)
[![JUnit 5](https://img.shields.io/badge/JUnit-5-green.svg)](https://junit.org/junit5/)
[![Maven](https://img.shields.io/badge/Maven-3.x-red.svg)](https://maven.apache.org/)
[![License: MIT](https://img.shields.io/badge/License-MIT-yellow.svg)](https://opensource.org/licenses/MIT)

This project is a simple automation test that uses Selenium WebDriver to search for "Selenium Java" on the Bing search engine and prints the titles of the first 5 search results to the console. It serves as a basic example of using Selenium and JUnit 5 for web automation.

## ✨ Features

- 🔍 Automatically searches for **"Selenium Java"** on the Bing search engine.
- 📃 Retrieves and prints the titles of the **first 5 search results** to the console.
- 🛠️ Simulates browser interactions using **Selenium WebDriver**.
- ✅ Organizes and manages test scenarios with **JUnit 5**.
- 📦 Easily manages project dependencies using **Maven**.

## ⚙️ Requirements

To run this project, you need to have the following software installed on your system:

- **Java Development Kit (JDK)**: Version 8 or later ([Java Download Link](https://www.oracle.com/java/technologies/javase-downloads.html))
- **Selenium WebDriver**: Automatically managed through project dependencies.
- **ChromeDriver**: WebDriver for the Google Chrome browser. ([ChromeDriver Download Link](https://chromedriver.chromium.org/downloads)) After downloading, you need to add the ChromeDriver to your system's PATH or place it in the project directory.
- **JUnit 5**: Automatically managed through project dependencies.
- **Apache Maven**: For managing project dependencies and running tests ([Maven Download Link](https://maven.apache.org/download.cgi)).

## 🛠️ Setup and Execution

1.  **Clone the Repository:**

    ```bash
    git clone [https://github.com/yourusername/your-project-name.git](https://github.com/yourusername/your-project-name.git)
    cd your-project-name
    ```

    **(Note:** Replace `https://github.com/yourusername/your-project-name.git` with your actual GitHub project URL.)

2.  **Install Dependencies:**

    Navigate to the project directory and use Maven to download the dependencies:

    ```bash
    mvn clean install
    ```

3.  **ChromeDriver Setup:**

    - Download the ChromeDriver that matches your Chrome browser version from the [ChromeDriver Download Link](https://chromedriver.chromium.org/downloads).
    - Add the downloaded `chromedriver` executable to your system's PATH environment variable or copy it to the root directory of your project.

4.  **Run the Tests:**

    Use the following Maven command to execute the tests:

    ```bash
    mvn test
    ```

    This command will run the JUnit tests, perform the search on Bing, and print the first 5 results to the console.

## 🧪 Test Steps

When the project is executed, the following steps are performed automatically:

1.  Opens the Google Chrome browser and navigates to the Bing homepage (`https://www.bing.com/`).
2.  Locates the search input field.
3.  Enters the text **"Selenium Java"** into the search field.
4.  Initiates the search by pressing the Enter key.
5.  Finds the titles of the first 5 search results on the search results page.
6.  Prints the found titles to the terminal (console).
7.  Closes the browser window.

## 🚀 Technologies Used

This project was developed using the following technologies:

- **Selenium WebDriver**: A powerful automation library for testing web applications.
- **JUnit 5**: A modern testing framework for writing and running unit tests in Java.
- **Java**: The programming language in which the application is developed.
- **Maven**: A build automation and dependency management tool for Java projects.

## 🤝 Contributing

If you'd like to contribute to this project, please follow these steps:

1.  **Fork** the project to your own GitHub account.
2.  Create a new development branch (`git checkout -b new-feature`).
3.  Make your changes and commit them (`git commit -am 'Add new feature'`).
4.  Push your changes to your remote repository (`git push origin new-feature`).
5.  Submit a **Pull Request** (PR) to the original project on GitHub.

Thank you for your contributions!

## 📄 License

This project is licensed under the **MIT License**. You can find the full text of the license in the [LICENSE](https://opensource.org/licenses/MIT) file.

