# Aspectow Light Edition

Aspectow Light Edition is a streamlined, lightweight version of the Aspectow server, specifically optimized for building high-performance REST API services. By removing the traditional servlet specification, this edition offers a minimal footprint and faster startup times, making it an excellent choice for microservices and other RESTful applications.

It is built on the Aspectran framework and includes JBoss Undertow, a high-performance web server, providing a solid foundation for your services.

## Key Features

- **Lightweight and Fast**: Optimized for REST APIs with a minimal runtime footprint.
- **No Servlet Specification**: A streamlined core without the overhead of the full servlet stack.
- **High-Performance Core**: Powered by JBoss Undertow for a fast and efficient web server.
- **Built on Aspectran**: Leverages the powerful AOP and IoC features of the Aspectran framework.
- **Ideal for Microservices**: Perfect for building fast, scalable microservices.

## Requirements

- Java 21 or later
- Maven 3.6.3 or later

## Building from Source

Follow these steps to build Aspectow Light Edition from the source code:

1.  **Clone the repository:**
    ```sh
    git clone https://github.com/aspectran/aspectow-light.git
    ```

2.  **Navigate to the project directory:**
    ```sh
    cd aspectow-light
    ```

3.  **Build the project with Maven:**
    This will compile the source code and package the application.
    ```sh
    mvn clean package
    ```

## Running the Server

Once the project is built, you can start the server using the Aspectran Shell.

1.  **Navigate to the `bin` directory:**
    ```sh
    cd app/bin
    ```

2.  **Start the Aspectran Shell:**
    ```sh
    ./shell.sh
    ```
    This will launch an interactive shell for managing the server.

3.  **Access the application:**
    Once the server is running, you can access the default web application in your browser at [http://localhost:8081](http://localhost:8081).

## Contributing

We welcome contributions! If you'd like to contribute, please fork the repository and submit a pull request. For major changes, please open an issue to discuss your ideas.

## License

Aspectow Light Edition is licensed under the [Apache License 2.0](LICENSE.txt).
