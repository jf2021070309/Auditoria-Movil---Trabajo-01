package ch.qos.logback.core.rolling.helper;

import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.spi.ContextAwareBase;
import com.google.ads.mediation.facebook.FacebookMediationAdapter;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import java.util.regex.Pattern;
/* loaded from: classes.dex */
public class RollingCalendar extends GregorianCalendar {
    public static final TimeZone GMT_TIMEZONE = TimeZone.getTimeZone("GMT");
    private static final HashMap<Character, PeriodicityType> PATTERN_LETTER_TO_PERIODICITY;
    private static final long serialVersionUID = -5937537740925066161L;
    private String datePattern;
    private PeriodicityType periodicityType;

    static {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        PATTERN_LETTER_TO_PERIODICITY = linkedHashMap;
        linkedHashMap.put('S', PeriodicityType.TOP_OF_MILLISECOND);
        linkedHashMap.put('s', PeriodicityType.TOP_OF_SECOND);
        linkedHashMap.put('m', PeriodicityType.TOP_OF_MINUTE);
        PeriodicityType periodicityType = PeriodicityType.TOP_OF_HOUR;
        linkedHashMap.put('h', periodicityType);
        linkedHashMap.put('K', periodicityType);
        linkedHashMap.put('k', periodicityType);
        linkedHashMap.put('H', periodicityType);
        linkedHashMap.put('a', PeriodicityType.HALF_DAY);
        PeriodicityType periodicityType2 = PeriodicityType.TOP_OF_DAY;
        linkedHashMap.put('u', periodicityType2);
        linkedHashMap.put('E', periodicityType2);
        linkedHashMap.put('F', periodicityType2);
        linkedHashMap.put('d', periodicityType2);
        linkedHashMap.put('D', periodicityType2);
        PeriodicityType periodicityType3 = PeriodicityType.TOP_OF_WEEK;
        linkedHashMap.put('W', periodicityType3);
        linkedHashMap.put('w', periodicityType3);
        linkedHashMap.put('M', PeriodicityType.TOP_OF_MONTH);
        linkedHashMap.put('Y', periodicityType3);
    }

    public RollingCalendar(String str) {
        this(str, GMT_TIMEZONE, Locale.US);
    }

    public RollingCalendar(String str, TimeZone timeZone, Locale locale) {
        super(timeZone, locale);
        this.periodicityType = PeriodicityType.ERRONEOUS;
        this.datePattern = str;
        this.periodicityType = computePeriodicityType();
    }

    private boolean collision(long j2) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(this.datePattern, Locale.US);
        simpleDateFormat.setTimeZone(GMT_TIMEZONE);
        return simpleDateFormat.format(new Date(0L)).equals(simpleDateFormat.format(new Date(j2)));
    }

    private void roundDownTime(Calendar calendar, String str) {
        if (str.indexOf(83) == -1) {
            calendar.roll(14, -calendar.get(14));
        }
        if (str.indexOf(115) == -1) {
            calendar.roll(13, -calendar.get(13));
        }
        if (str.indexOf(FacebookMediationAdapter.ERROR_CREATE_NATIVE_AD_FROM_BID_PAYLOAD) == -1) {
            calendar.roll(12, -calendar.get(12));
        }
        if (!Pattern.compile("[hKkH]").matcher(str).find()) {
            calendar.roll(11, -calendar.get(11));
        }
        if (!Pattern.compile("[uEFdD]").matcher(str).find()) {
            calendar.set(5, 1);
        }
        if (Pattern.compile("[MDw]").matcher(str).find()) {
            return;
        }
        calendar.set(2, 0);
    }

    public PeriodicityType computePeriodicityType() {
        if (this.datePattern != null) {
            for (Map.Entry<Character, PeriodicityType> entry : PATTERN_LETTER_TO_PERIODICITY.entrySet()) {
                if (this.datePattern.indexOf(entry.getKey().charValue()) > -1) {
                    return entry.getValue();
                }
            }
        }
        return PeriodicityType.ERRONEOUS;
    }

    public Date getEndOfNextNthPeriod(Date date, int i2) {
        int i3;
        setTime(date);
        roundDownTime(this, this.datePattern);
        switch (this.periodicityType.ordinal()) {
            case 1:
                i3 = 14;
                break;
            case 2:
                i3 = 13;
                break;
            case 3:
                i3 = 12;
                break;
            case 4:
                i3 = 11;
                break;
            case 5:
            default:
                throw new IllegalStateException("Unknown periodicity type.");
            case 6:
                i3 = 5;
                break;
            case 7:
                set(7, getFirstDayOfWeek());
                i3 = 3;
                break;
            case 8:
                i3 = 2;
                break;
        }
        add(i3, i2);
        return getTime();
    }

    public Date getNextTriggeringDate(Date date) {
        return getEndOfNextNthPeriod(date, 1);
    }

    public PeriodicityType getPeriodicityType() {
        return this.periodicityType;
    }

    public boolean isCollisionFree() {
        int ordinal = this.periodicityType.ordinal();
        if (ordinal != 4) {
            if (ordinal == 6) {
                return (collision(CoreConstants.MILLIS_IN_ONE_WEEK) || collision(2678400000L) || collision(31536000000L)) ? false : true;
            } else if (ordinal != 7) {
                return true;
            } else {
                return (collision(2937600000L) || collision(31622400000L)) ? false : true;
            }
        }
        return !collision(43200000L);
    }

    public Date normalizeDate(Date date) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        roundDownTime(calendar, this.datePattern);
        return calendar.getTime();
    }

    public void printPeriodicity(ContextAwareBase contextAwareBase) {
        String str;
        switch (this.periodicityType.ordinal()) {
            case 1:
                str = "Roll-over every millisecond.";
                break;
            case 2:
                str = "Roll-over every second.";
                break;
            case 3:
                str = "Roll-over every minute.";
                break;
            case 4:
                str = "Roll-over at the top of every hour.";
                break;
            case 5:
                str = "Roll-over at midday and midnight.";
                break;
            case 6:
                str = "Roll-over at midnight.";
                break;
            case 7:
                str = "Rollover at the start of week.";
                break;
            case 8:
                str = "Rollover at start of every month.";
                break;
            default:
                str = "Unknown periodicity.";
                break;
        }
        contextAwareBase.addInfo(str);
    }
}
