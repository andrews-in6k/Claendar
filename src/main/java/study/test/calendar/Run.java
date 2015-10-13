package study.test.calendar;

import java.io.PrintStream;
import java.time.LocalDate;

public class Run {

    private static LocalDate date = LocalDate.now();

    public static void main(String[] args) {
        CalendarMonth calendarMonth = new CalendarMonth(date);

        PrintStream printStream = new PrintStream(System.out);

        Printer printer = new ANSIPrinter(date, printStream);

        printer.beginPrint();
        printer.printCalendar(calendarMonth);
        printer.endPrint();
    }

}
