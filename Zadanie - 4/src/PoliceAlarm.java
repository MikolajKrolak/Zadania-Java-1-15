public class PoliceAlarm implements Alarm {
    private final Logger logger;

    public PoliceAlarm(Logger logger) {
        this.logger = logger;
    }

    @Override
    public void alarmTurnOn(PinEvent event) {
        String message = "Błędny PIN - powiadomiono policję";
        logger.log(Severity.CRITICAL, event.getSafe(), message);
        System.out.println("PoliceAlarm: alarm włączony");
    }

    @Override
    public void alarmTurnOff(PinEvent event) {
        String message = "PIN poprawny - policja odwołana";
        logger.log(Severity.INFO, event.getSafe(), message);
        System.out.println("PoliceAlarm: alarm wyłączony");
    }
}
