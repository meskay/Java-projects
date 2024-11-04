# Java-projects
Here's a sample `README.md` file for this Java program:

---

# Date Night Calculator

This Java program calculates the number of nights between two dates (arrival and departure) provided by the user. The program validates input to ensure the departure date is after the arrival date and correctly handles leap years to produce an accurate night count.

## Features

- **Date Input Validation**: Ensures valid year, month, and day input, including leap year adjustments for February.
- **Leap Year Calculation**: Accurately accounts for leap years in the night count.
- **Error Handling**: Prompts users to re-enter dates if the input is invalid or if the departure date is earlier than the arrival date.

## How It Works

1. The user is prompted to enter:
   - The arrival date (year, month, day).
   - The departure date (year, month, day).
2. The program checks if the input dates are valid:
   - Arrival and departure years must be between 2024 and 3000.
   - The departure date must be after the arrival date.
3. The program calculates the total number of nights between the two dates and outputs the result.

## Usage

1. **Compile the Program**:
   ```bash
   javac Main.java
   ```

2. **Run the Program**:
   ```bash
   java Main
   ```

3. **Enter Dates as Prompted**:
   - Enter the year within the allowed range (2024-2025 for arrival, up to 3000 for departure).
   - Enter the month as the first three letters (e.g., `Jan`, `Feb`).
   - Enter a valid day for the given month and year.

## Example Interaction

```plaintext
Please enter the date of your arrival:
Year: 2024
(Please only write the first 3 letters of the month!)
Month: Jan
Day: 15

Please enter the date of your departure:
Year: 2024
(Please only write the first 3 letters of the month!)
Month: Feb
Day: 10

Nights: 26
```

## Key Components

- **Date Validation Methods**:
  - `Year(int limit, boolean advance)`: Validates the year within a specified range.
  - `Month(String[] months)`: Ensures a valid month is entered.
  - `Day(String[] months, int[] months0, String month, int year)`: Checks that the day is within the range for the selected month.
  
- **Leap Year Calculation**:
  - `LeapYear(int year)`: Checks if a given year is a leap year for correct February day count.

## Notes

- **Booking Limits**: Arrival years can only be up to one year in advance from the current year.
- **Leap Year Support**: February will correctly have 29 days in leap years.

## Dependencies

- **Java Development Kit (JDK)**: Ensure that JDK is installed to compile and run the program.

---

