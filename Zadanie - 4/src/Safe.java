import java.util.ArrayList;
import java.util.List;

public class Safe implements EventSource {
    public final List<Alarm> alarms = new ArrayList<>();
    private String pin = "1234";

    public void addAlarm(Alarm alarm) {
        alarms.add(alarm);
    }

    public void removeAlarm(Alarm alarm) {
        alarms.remove(alarm);
    }

    public void enterPin(String pin) {
        if (this.pin.equals(pin)) {
            correctPin();
        } else {
            wrongPin();
        }
    }

    private void wrongPin() {
        PinEvent event = new PinEvent(this);
        for (Alarm a : alarms) {
            a.alarmTurnOn(event);
        }
    }

    private void correctPin() {
        PinEvent event = new PinEvent(this);
        for (Alarm a : alarms) {
            a.alarmTurnOff(event);
        }
    }
}
