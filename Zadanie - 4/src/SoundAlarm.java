public class SoundAlarm implements Alarm {
    private final Logger logger;

    public SoundAlarm(Logger logger) {
        this.logger = logger;
    }

    @Override
    public void alarmTurnOn(PinEvent event) {
        String message = "Włączono alarm dźwiękowy";
        logger.log(Severity.WARNING, event.getSafe(), message);
        System.out.println("SoundAlarm: sygnał dźwiękowy aktywny");
    }

    @Override
    public void alarmTurnOff(PinEvent event) {
        String message = "Wyłączono alarm dźwiękowy";
        logger.log(Severity.INFO, event.getSafe(), message);
        System.out.println("SoundAlarm: sygnał dźwiękowy wyłączony");
    }
}
