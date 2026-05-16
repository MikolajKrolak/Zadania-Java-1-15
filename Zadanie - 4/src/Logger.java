public interface Logger {
    void setLogLevel(Severity severity);
    Severity getLogLevel();
    void log(Severity severity, EventSource source, String message);
}