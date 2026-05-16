public class DogsAlarm implements Alarm {
    private final Logger logger;

    public DogsAlarm(Logger logger) {
        this.logger = logger;
    }

    @Override
    public void alarmTurnOn(PinEvent event) {
        String message = "Psy zwolnione";
        logger.log(Severity.CRITICAL, event.getSafe(), message);
        System.out.println("DogsAlarm: psy zwolnione");
    }

    @Override
    public void alarmTurnOff(PinEvent event) {
        String message = "Psy odwołane";
        logger.log(Severity.INFO, event.getSafe(), message);
        System.out.println("DogsAlarm: psy odwołane");
    }
}
