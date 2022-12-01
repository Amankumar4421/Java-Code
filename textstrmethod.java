public class textstrmethod {
    public static void main(String[] args) {
        String name  = "Aman kumar";
        System.out.println(name.startsWith("Am"));
        System.out.println(name.endsWith("mar"));
        System.out.println(name.charAt(2));
        System.out.println(name.indexOf("an"));
        System.out.println(name.indexOf("a",5));
        System.out.println(name.lastIndexOf("a"));
        System.out.println(name.lastIndexOf("a",4));
        System.out.println(name.equals("Aman kumar"));
        System.out.println(name.equalsIgnoreCase("AmaN kUmar"));
    }
}
