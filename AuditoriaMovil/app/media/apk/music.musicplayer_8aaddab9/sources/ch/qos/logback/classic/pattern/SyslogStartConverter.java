package ch.qos.logback.classic.pattern;

import ch.qos.logback.classic.spi.ILoggingEvent;
import ch.qos.logback.classic.util.LevelToSyslogSeverity;
import ch.qos.logback.core.net.SyslogAppenderBase;
import java.text.DateFormatSymbols;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
/* loaded from: classes.dex */
public class SyslogStartConverter extends ClassicConverter {
    public int facility;
    public SimpleDateFormat simpleMonthFormat;
    public SimpleDateFormat simpleTimeFormat;
    public long lastTimestamp = -1;
    public String timesmapStr = null;
    private final Calendar calendar = Calendar.getInstance(Locale.US);
    public final String localHostName = "localhost";

    private String computeTimeStampString(long j2) {
        String str;
        synchronized (this) {
            if (j2 / 1000 != this.lastTimestamp) {
                this.lastTimestamp = j2 / 1000;
                Date date = new Date(j2);
                this.calendar.setTime(date);
                this.timesmapStr = String.format(Locale.US, "%s %2d %s", this.simpleMonthFormat.format(date), Integer.valueOf(this.calendar.get(5)), this.simpleTimeFormat.format(date));
            }
            str = this.timesmapStr;
        }
        return str;
    }

    @Override // ch.qos.logback.core.pattern.Converter
    public String convert(ILoggingEvent iLoggingEvent) {
        StringBuilder sb = new StringBuilder();
        int i2 = this.facility;
        sb.append("<");
        sb.append(LevelToSyslogSeverity.convert(iLoggingEvent) + i2);
        sb.append(">");
        sb.append(computeTimeStampString(iLoggingEvent.getTimeStamp()));
        sb.append(' ');
        sb.append("localhost");
        sb.append(' ');
        return sb.toString();
    }

    @Override // ch.qos.logback.core.pattern.DynamicConverter, ch.qos.logback.core.spi.LifeCycle
    public void start() {
        boolean z;
        String firstOption = getFirstOption();
        if (firstOption == null) {
            addError("was expecting a facility string as an option");
            return;
        }
        this.facility = SyslogAppenderBase.facilityStringToint(firstOption);
        try {
            Locale locale = Locale.US;
            this.simpleMonthFormat = new SimpleDateFormat("MMM", locale);
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("HH:mm:ss", locale);
            this.simpleTimeFormat = simpleDateFormat;
            simpleDateFormat.setDateFormatSymbols(new DateFormatSymbols(locale));
            this.simpleMonthFormat.setDateFormatSymbols(new DateFormatSymbols(locale));
            z = false;
        } catch (IllegalArgumentException e2) {
            addError("Could not instantiate SimpleDateFormat", e2);
            z = true;
        }
        if (z) {
            return;
        }
        super.start();
    }
}
