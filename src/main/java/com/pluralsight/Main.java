package com.pluralsight;

public class Main {
    public static void main(String[] args) {
        Room room = new Room(2, 99.99);

        boolean available = room.isAvailable();
        int run = 0;

        while (run <= 1) {
            if (available) {
                room.checkIn();
                available = room.isAvailable();
            } else {
                System.out.println("\nGuest is leaving.\n");
                room.checkout();
            }
            run++;
        }

        Employee employee = new Employee(1, "Gerald" , "YearUp", 20.00, 20.00);
        System.out.println(employee.getHoursWorked());
        employee.punchTimeCard(8,16);
        System.out.println(employee.getHoursWorked());
    }
}