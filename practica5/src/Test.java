public class Test {
    public static void main(String[] args) {
        Season season = Season.Summer;
        System.out.println(season);
        info(season);
        printAll();
    }
    public static void info(Season season) {
        switch (season) {
            case Summer:
                System.out.println("Лето тёплое, я люблю лето");
                break;
            case Autumn:
                System.out.println("Осень красивая, я люблю осень");
                break;
            case Winter:
                System.out.println("Зимой холодно и мокро, не люблю зиму");
                break;
            case Spring:
                System.out.println("Весной много грязи, хотя свежо, не знаю как к ней относиться");
        }
    }

    public static void printAll(){
        for (Season s : Season.values()) {
            System.out.println(s + " - " + s.getDescription());
        }
    }

}