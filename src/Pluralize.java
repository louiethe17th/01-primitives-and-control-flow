public class Pluralize {

    public static void main(String[] args) {
        int thingCount = 32;
        System.out.println("I own " + thingCount + " " + pluralize("vapes", thingCount) + ".");
    }

    public static String pluralize(String own, int thingCount) {
        if (thingCount == 0 || thingCount >= 2) {
            return (own + "s.");
        } else {
            return (own + ".");
        }
    }
}
