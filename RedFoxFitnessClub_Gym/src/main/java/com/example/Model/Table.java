package com.example.Model;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Stream;

import javax.swing.JFrame;
import javax.swing.JTable;

public class Table {
    public void displayTimeTable() {
        JFrame frame = new JFrame();

        String[] columnNames = { " ", "Mon", "Tues", "Wed", "Thur", "Fri" };

        Object[][] data = {
                { " ", "Mon", "Tues", "Wed", "Thur", "Fri" },
                { "8am to 9am", " Zumba(Ashley)", "Yoga(Chris) ", "Yoga(Chris))", "Yoga(Chris)", "Zumba(Ashley)",
                        "Yoga(Chris)", "Yoga(Chris)" },
                { "9am to 10am", " ", " ", "Cardio(Albert)", "Cardio(Albert)", "Cardio(Albert)", "Zumba(Ashley)",
                        "Zumba(Ashley)" },
                { "11am to 12pm", "Zumba(Elena) ", "Zumba(Elena) ", "Zumba(Elena)", "Yoga(Dipti)", "Yoga(Dipti)",
                        "Cardio(Albert)", "Yoga(Dipti)" },
                { "Cardio()", "", "", "", "", "", "" },
        };
        JTable table = new JTable(data, columnNames);

        frame.add(table);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800, 400);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }

    public void simpleTable() {
        boolean leftJustifiedRows = false;

        /*
         * Table to print in console in 2-dimensional array. Each sub-array is a row.
         */
        String[][] table = new String[][] {
                { " ", "Mon", "Tues", "Wed", "Thur", "Fri", "Sat", "Sun" },
                { "8am to 9am", "Zumba(Ashley)", "Yoga(Chris)", "Yoga(Chris))", "Yoga(Chris)", "Zumba(Ashley)",
                        "Yoga(Chris)", "Yoga(Chris)" },
                { "9am to 10am", "", "", "Cardio(Albert)", "Cardio(Albert)", "Cardio(Albert)", "Zumba(Ashley)", "" },
                { "11am to 12pm", "Zumba(Elena)", "Zumba(Elena)", "Zumba(Elena)", "Yoga(Dipti)", "Yoga(Dipti)",
                        "Cardio(Albert)", "Yoga(Dipti)" },
                { "2pm to 3pm", "Cardio(John)", "Cardio(John)", "Cardio(John)", "Zumba(Elena)", "Cardio(Mark)",
                        "Yoga(Dipti)", "Cardio(Mark)" },
                { "5pm to 6pm", "Yoga(Sara)", "Yoga(Sara)", "Yoga(Sara)", "Yoga(Sara)", "Yoga(Sara)", "Zumba(Laurie)",
                        "Zumba(Laurie)" },
                { "7pm to 8pm", "Zumba(Simon)", "Zumba(Simon)", "Cardio(Mark)", "Zumba(Laurie)", "Zumba(Laurie)", " ",
                        " " },
                { "8pm to 9pm", "Cardio(Mark)", "Cardio(Cat)", "Zumba(Simon)", "Cardio(Cat)", "Cardio(Cat)", " ", " " },
        };

        Map<Integer, Integer> columnLengths = new HashMap<>();
        Arrays.stream(table).forEach(a -> Stream.iterate(0, (i -> i < a.length), (i -> ++i)).forEach(i -> {
            if (columnLengths.get(i) == null) {
                columnLengths.put(i, 0);
            }
            if (columnLengths.get(i) < a[i].length()) {
                columnLengths.put(i, a[i].length());
            }
        }));
        // System.out.println("columnLengths = " + columnLengths);

        /*
         * Prepare format String
         */
        final StringBuilder formatString = new StringBuilder("");
        String flag = leftJustifiedRows ? "-" : "";
        columnLengths.entrySet().stream().forEach(e -> formatString.append("| %" + flag + e.getValue() + "s "));
        formatString.append("|\n");
        // System.out.println("formatString = " + formatString.toString());

        /*
         * Print table
         */
        Stream.iterate(0, (i -> i < table.length), (i -> ++i))
                .forEach(a -> System.out.printf(formatString.toString(), table[a]));
    }
}