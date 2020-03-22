Aspectow Light
==============

Aspectow is an all-in-one web application server based on Aspectran.  
Aspectow Light is a lightweight version that does not support the servlet specification and is suitable for building high performance REST API services.
JBoss's [Undertow](http://undertow.io) web server is built-in.

## Running Aspectow

- Clone this repository

  ```sh
  $ git clone https://github.com/aspectran/aspectow-light.git
  ```

- Build with Maven

  ```sh
  $ cd aspectow-light
  $ mvn clean package
  ```

- Run with Aspectran Shell

  ```sh
  $ cd app/bin
  $ ./shell.sh
  ```

- Access in your browser at http://localhost:8081
