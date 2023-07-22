# Weather-API Java Project
> This is a simple project that demonstrates how to call a Weather API using Java with the dependencies from the Maven Central Repository.
---
## Requirements
* Java Development Kit (JDK) 8 or above installed
* Integrated Development Environment (IDE) of your choice (e.g., IntelliJ, Eclipse).
---
## Dependencies
* spring-boot-starter-web: Provides the necessary components for creating HTTP classes and methods for this application.
* JSON: Allows parsing and manipulating JSON data.
* mvn: The Apache Maven build tool for managing project dependencies and build lifecycle.
---
## Data Structure
The project uses the following classes for API communication and JSON parsing:

* **URL:** To form and connect to the Weather API URL.
* **HttpURLConnection:** To open a connection to the API URL and retrieve the response.
* **BufferedReader:** To read the response data.
* **JSONObject:** To parse the JSON response.
* **StringBuilder:** To efficiently handle the response data.
* **String:** To work with strings and manipulate data.
---
## Data Flow
The **'ApiCalling'** class contains the main logic for calling the Weather API and processing the response. It exposes a method **'apiCallingMethod'** that takes the URL as an input and returns a JSON object containing the weather information.

---
## Project Summary
The Weather API Java Project is a simple application that demonstrates how to retrieve weather information for a specified URL using standard Java libraries. It does not rely on any external frameworks, making it a lightweight and straightforward solution for calling a Weather API and processing JSON data.

---
## Conclusion
The project can serve as a foundation for developers looking to integrate weather data into their Java applications without the need for complex frameworks, allowing them to focus on the core functionality and tailor the code as per their specific requirements.

Overall, this project highlights the power and versatility of the Java language and standard libraries in performing common tasks, making it a valuable resource for Java developers seeking to learn about API integration and JSON handling.
