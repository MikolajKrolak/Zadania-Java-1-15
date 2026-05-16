public class ConsoleLogger implements Logger {
    private Severity logLevel;

    public ConsoleLogger(Severity initialLevel) {
        this.logLevel = initialLevel;
    }

    @Override
    public void setLogLevel(Severity severity) {
        this.logLevel = severity;
    }

    @Override
    public Severity getLogLevel() {
        return logLevel;
    }

    @Override
    public void log(Severity severity, EventSource source, String message) {
        if (severity.compareTo(logLevel) < 0) return;

        String src = (source == null) ? "unknown" : source.getClass().getSimpleName();
        String base = src + " - " + message;

        switch (severity) {
            case INFO:
                System.out.println("INFO: " + base);
                break;
            case WARNING:
                System.out.println("WARNING: " + base);
                break;
            case CRITICAL:
                System.out.println("CRITICAL: " + base);
                break;
            case ERROR:
                System.out.println("ERROR: " + base);
                break;
            default:
                System.out.println(severity + ": " + base);
        }
    }
}