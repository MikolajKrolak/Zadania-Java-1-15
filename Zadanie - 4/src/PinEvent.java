import java.util.Date;

public class PinEvent {
    private final Safe safe;
    public final Date eventDate;

    public PinEvent(Safe safe) {
        this.safe = safe;
        this.eventDate = new Date();
    }

    public Safe getSafe() {
        return safe;
    }

    @Override
    public String toString() {
        return "PinEvent[safe=" + safe + ", eventDate=" + eventDate + "]";
    }
}