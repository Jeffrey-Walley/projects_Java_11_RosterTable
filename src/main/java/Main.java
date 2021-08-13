// project 11 Roster Table      from Begin Coding Fast      site: https://www.youtube.com/watch?v=okPNq1FHQzs&list=PLtQo0sxRN7JKKla3_GAF05dySjyy3nINa&index=11
/*
    1- create ArrayList of ArrayLists
    2- put names for day into ArrayList
    3- put number of ArrayLists for the days into ArrayList
    4- get days scheduled for a person
 */
import java.util.ArrayList;


public class Main {
    public static void main(String[] args) {
        int days = 7;

        // ArrayList of ArrayLists
        ArrayList<ArrayList<String>> roster =
                new ArrayList<ArrayList<String>>(days);

        // each sub-arraylist
        ArrayList<String> day1 = new ArrayList<String>();
        ArrayList<String> day2 = new ArrayList<String>();
        ArrayList<String> day3 = new ArrayList<String>();
        ArrayList<String> day4 = new ArrayList<String>();
        ArrayList<String> day5 = new ArrayList<String>();
        ArrayList<String> day6 = new ArrayList<String>();
        ArrayList<String> day7 = new ArrayList<String>();


        // adding into the ArrayList
        day1.add("Jimmel");
        day1.add("Trelvyn");
        roster.add(day1);

        day2.add("Splat");
        day2.add("Ra");
        day2.add("Me");
        roster.add(day2);

        day3.add("Jimmel");
        day3.add("Isis");
        day3.add("Splat");
        roster.add(day3);

        day4.add("Ra");
        day4.add("Me");
        day4.add("Splat");
        roster.add(day4);

        day5.add("Jimmel");
        day5.add("Isis");
        day5.add("Me");
        roster.add(day5);

        day6.add("Splat");
        day6.add("Ra");
        day6.add("Trelvyn");
        roster.add(day6);

        day7.add("Trelvyn");
        day7.add("Me");

    getDays(roster, "Isis");
    getDays(roster, "Isis");
    getDays(roster, "Jimmel");
    getDays(roster, "Me");
    getDays(roster, "Ra");
    getDays(roster, "Splat");
    getDays(roster, "Trelvyn");
    }

    public static void getDays(ArrayList<ArrayList<String>> rosterTable, String name) {
        for (ArrayList<String> arrList : rosterTable) {
            for (String str : arrList) {
                if (str.contentEquals(name)) {
                    System.out.println(rosterTable.indexOf(arrList) + 1);
                }
            }
        }
    }
}
