# DemoProject - REST API Testing with Java

This project demonstrates REST API testing using Java, Maven, REST Assured, TestNG, and JCommander. It includes examples of API calls, JSON parsing, data validation, and command-line argument parsing.

## Prerequisites

Before running this project, ensure you have the following installed:

1. **Java JDK 14 or higher**
   - Download from [Oracle JDK](https://www.oracle.com/java/technologies/downloads/) or [OpenJDK](https://openjdk.java.net/)
   - Verify installation: `java -version`

2. **Maven 3.6+**
   - **macOS**: `brew install maven`
   - **Windows**: Download from [Maven website](https://maven.apache.org/download.cgi)
   - **Linux**: `sudo apt install maven` (Ubuntu/Debian) or `sudo yum install maven` (CentOS/RHEL)
   - Verify installation: `mvn -version`

## Project Structure

```
DemoProject/
├── src/
│   ├── Basics.java                 # Main API testing example
│   ├── ComplexCourses.java         # JSON parsing and validation example
│   ├── SumValidation.java          # TestNG test for sum validation
│   └── files/
│       ├── payload.java            # JSON payloads for API requests
│       └── ReUsableMethods.java    # Utility methods
├── pom.xml                         # Maven configuration
└── README.md                       # This file
```

## Installation & Setup

1. **Clone or download the project**
   ```bash
   cd /path/to/your/project
   ```

2. **Verify Maven is working**
   ```bash
   mvn -version
   ```

3. **Build the project**
   ```bash
   mvn clean install
   ```

## How to Run

### Option 1: Run Basics.java (API Testing Example)

This example demonstrates:
- Adding a place via POST request
- Updating the place address via PUT request
- Retrieving the place details via GET request
- Validating responses

```bash
mvn exec:java -Dexec.mainClass="Basics"
```

**Expected Output:**
- API request/response logs
- Place ID extraction
- Address update confirmation
- Final address validation

### Option 2: Run ComplexCourses.java (JSON Parsing Example)

This example demonstrates:
- Parsing complex JSON structures
- Extracting data from nested objects and arrays
- Data validation and calculations

```bash
mvn exec:java -Dexec.mainClass="ComplexCourses"
```

**Expected Output:**
- Number of courses: 3
- Purchase amount: 910
- Course details with prices
- RPA course copies: 10
- Total calculation validation

### Option 3: Run SumValidation.java (TestNG Test Example)

This example demonstrates:
- TestNG test for sum validation

```bash
mvn exec:java -Dexec.mainClass="SumValidation"
```

**Expected Output:**
- Sum validation result

### Option 4: Run All Tests (if using TestNG)

```bash
mvn test
```

## Project Features

### 1. API Testing (Basics.java)
- **REST Assured** for API testing
- **JSON Path** for response parsing
- **Hamcrest** for assertions
- **TestNG** for test framework

### 2. JSON Processing (ComplexCourses.java)
- Complex JSON structure parsing
- Array iteration and data extraction
- Mathematical calculations and validation
- Conditional logic for specific data retrieval

### 3. Payload Management (payload.java)
- Centralized JSON payloads
- Reusable request bodies
- Mock data for testing

### 4. Test Automation (SumValidation.java)
- TestNG test for sum validation

### 5. Command-Line Argument Parsing (JCommander)
- JCommander is included as a dependency for command-line argument parsing

## Dependencies

The project uses the following main dependencies (defined in `pom.xml`):

- **REST Assured 4.4.0**: API testing framework
- **TestNG 7.4.0**: Testing framework
- **Hamcrest 2.2**: Assertion library
- **Maven Compiler Plugin**: Java 14 compilation
- **JCommander**: Command-line argument parsing

## Troubleshooting

### Common Issues

1. **"command not found: mvn"**
   - Install Maven using the instructions above
   - Ensure Maven is in your PATH

2. **Java version issues**
   - Ensure you have Java 14+ installed
   - Check with: `java -version`

3. **Build failures**
   - Run `mvn clean install` to rebuild
   - Check for network connectivity (Maven downloads dependencies)

4. **API test failures**
   - The API endpoints might be updated
   - Check the server version in the code
   - Verify the API is accessible

### Getting Help

If you encounter issues:

1. Check the console output for error messages
2. Verify all prerequisites are installed
3. Ensure you have internet connectivity for Maven dependencies
4. Check that the API endpoints are still accessible

## API Endpoints Used

The project tests the following endpoints:
- `POST /maps/api/place/add/json` - Add a new place
- `PUT /maps/api/place/update/json` - Update place details
- `GET /maps/api/place/get/json` - Retrieve place details

## Contributing

To add new features or fix issues:

1. Create a new branch
2. Make your changes
3. Test thoroughly
4. Submit a pull request

## License

This project is for educational purposes and demonstrates REST API testing concepts. 