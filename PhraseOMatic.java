package beersong;

public class PhraseOMatic<rand1> {
    public static void main(String[] args) {
        String[] Months = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
        String[] Day = {"1st", "2nd", "3rd", "4th", "5th", "6th", "7th", "8th", "9th", "10th", "11th", "12th", "13th", "14th", "15th", "16th", "17th", "18th", "19th", "20th", "21st", "22nd", "23rd", "24th", "25th", "26th", "27th", "28th", "29th"};
        String[] Year = {"2021", "2020", "2019", "2018", "2017", "2016", "2015", "2014", "2013", "2012", "2010", "2009"};
        int oneLength = Months.length;
        int twoLength = Day.length;
        int threeLength = Year.length;
        int rand1 = (int) (Math.random() * oneLength);
        int rand2 = (int) (Math.random() * twoLength);
        int rand3 = (int) (Math.random() * threeLength);
        String phrase = Months[rand1] + " " + Day[rand2] + " " + Year[rand3];

        System.out.println("I've decided that today is" + " " + phrase);
    }
}

