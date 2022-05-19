package Ex3Part2;

public class Main {

    public static void main(String[] args) {
        MyTime time1 = new MyTime(23,59,59);
        System.out.println("getHour(): "+time1.getHour());
        System.out.println("getMinute(): "+time1.getMinute());
        System.out.println("getSecond(): "+time1.getSecond());
        System.out.println("toString(): " +time1);
        time1 = time1.nextSecond();
        time1 = time1.nextMinute();
        time1 = time1.nextHour();
        time1 = time1.nextHour();
        System.out.println("toString(): " + time1);
    }
}
