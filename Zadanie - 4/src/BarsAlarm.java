public class BarsAlarm implements Alarm {
    private final Logger logger;

    public BarsAlarm(Logger logger) {
        this.logger = logger;
    }

    @Override
    public void alarmTurnOn(PinEvent event) {
        String message = "Zamknięto kraty";
        logger.log(Severity.WARNING, event.getSafe(), message);
        System.out.println("BarsAlarm: kraty zablokowane");
    }

    @Override
    public void alarmTurnOff(PinEvent event) {
        String message = "Kraty odblokowane";
        logger.log(Severity.INFO, event.getSafe(), message);
        System.out.println("BarsAlarm: kraty odblokowane");
    }
}
