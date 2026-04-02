package ch.qos.logback.core.util;

import e.a.d.a.a;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
/* loaded from: classes.dex */
public class Duration {
    public static final long DAYS_COEFFICIENT = 86400000;
    private static final int DOUBLE_GROUP = 1;
    private static final String DOUBLE_PART = "([0-9]*(.[0-9]+)?)";
    private static final Pattern DURATION_PATTERN = Pattern.compile("([0-9]*(.[0-9]+)?)\\s*(|milli(second)?|second(e)?|minute|hour|day)s?", 2);
    public static final long HOURS_COEFFICIENT = 3600000;
    public static final long MINUTES_COEFFICIENT = 60000;
    public static final long SECONDS_COEFFICIENT = 1000;
    private static final int UNIT_GROUP = 3;
    private static final String UNIT_PART = "(|milli(second)?|second(e)?|minute|hour|day)s?";
    public final long millis;

    public Duration(long j2) {
        this.millis = j2;
    }

    public static Duration buildByDays(double d2) {
        return new Duration((long) (d2 * 8.64E7d));
    }

    public static Duration buildByHours(double d2) {
        return new Duration((long) (d2 * 3600000.0d));
    }

    public static Duration buildByMilliseconds(double d2) {
        return new Duration((long) d2);
    }

    public static Duration buildByMinutes(double d2) {
        return new Duration((long) (d2 * 60000.0d));
    }

    public static Duration buildBySeconds(double d2) {
        return new Duration((long) (d2 * 1000.0d));
    }

    public static Duration buildUnbounded() {
        return new Duration(Long.MAX_VALUE);
    }

    public static Duration valueOf(String str) {
        Matcher matcher = DURATION_PATTERN.matcher(str);
        if (matcher.matches()) {
            String group = matcher.group(1);
            String group2 = matcher.group(3);
            double doubleValue = Double.valueOf(group).doubleValue();
            if (group2.equalsIgnoreCase("milli") || group2.equalsIgnoreCase("millisecond") || group2.length() == 0) {
                return buildByMilliseconds(doubleValue);
            }
            if (group2.equalsIgnoreCase("second") || group2.equalsIgnoreCase("seconde")) {
                return buildBySeconds(doubleValue);
            }
            if (group2.equalsIgnoreCase("minute")) {
                return buildByMinutes(doubleValue);
            }
            if (group2.equalsIgnoreCase("hour")) {
                return buildByHours(doubleValue);
            }
            if (group2.equalsIgnoreCase("day")) {
                return buildByDays(doubleValue);
            }
            throw new IllegalStateException(a.k("Unexpected ", group2));
        }
        throw new IllegalArgumentException(a.l("String value [", str, "] is not in the expected format."));
    }

    public long getMilliseconds() {
        return this.millis;
    }

    public String toString() {
        StringBuilder sb;
        String str;
        long j2 = this.millis;
        if (j2 < 1000) {
            sb = new StringBuilder();
            sb.append(this.millis);
            str = " milliseconds";
        } else if (j2 < 60000) {
            sb = new StringBuilder();
            sb.append(this.millis / 1000);
            str = " seconds";
        } else {
            int i2 = (j2 > 3600000L ? 1 : (j2 == 3600000L ? 0 : -1));
            sb = new StringBuilder();
            if (i2 < 0) {
                sb.append(this.millis / 60000);
                str = " minutes";
            } else {
                sb.append(this.millis / 3600000);
                str = " hours";
            }
        }
        sb.append(str);
        return sb.toString();
    }
}
