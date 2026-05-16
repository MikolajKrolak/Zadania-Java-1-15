public class FileLogger implements Logger {
    private Severity logLevel;

    public FileLogger(Severity initialLevel) {
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

        System.out.println(severity + ": " + base);
        switch (severity) {
            case INFO:
                System.out.println(severity + ": " + base + " (zapisane)");
                break;
            case WARNING:
                System.out.println(severity + ": " + base + " (zapisane)");
                break;
            case ERROR:
                System.out.println(severity + ": " + base + " (zapisane)");
                break;
            case CRITICAL:
                System.out.println(severity + ": " + base + " (zapisane)");
                break;
            default:
                System.out.println(severity + ": " + base + " (zapisane)");
        }
    }
}
