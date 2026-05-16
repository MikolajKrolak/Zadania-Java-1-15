public class Main {
    public static void main(String[] args) {
        ConsoleLogger console = new ConsoleLogger(Severity.INFO);
        FileLogger file = new FileLogger(Severity.INFO);

        //minimalny: tylko soundalarm
        System.out.println("jeden soundalarm----------");
        Safe safe1 = new Safe();
        safe1.addAlarm(new SoundAlarm(console));
        System.out.println("zły pin 0000");
        safe1.enterPin("0000");
        System.out.println("poprawny pin 1234");
        safe1.enterPin("1234");

        //pełny: wszystkie alarmy
        System.out.println("\ncztery alarmy------------");
        Safe safe2 = new Safe();
        safe2.addAlarm(new SoundAlarm(console));
        safe2.addAlarm(new BarsAlarm(console));
        safe2.addAlarm(new PoliceAlarm(file));
        safe2.addAlarm(new DogsAlarm(file));
        System.out.println("zły pin 0000");
        safe2.enterPin("0000");
        System.out.println("poprawny pin 1234");
        safe2.enterPin("1234");

        //test poziomu
        System.out.println("\ntest: filelogger na warning--------");
        FileLogger warn = new FileLogger(Severity.WARNING);
        Safe safe3 = new Safe();
        safe3.addAlarm(new SoundAlarm(console));
        safe3.addAlarm(new PoliceAlarm(warn));
        System.out.println("zły pin 0000");
        safe3.enterPin("0000");
        System.out.println("poprawny pin 1234");
        safe3.enterPin("1234");
    }
}
