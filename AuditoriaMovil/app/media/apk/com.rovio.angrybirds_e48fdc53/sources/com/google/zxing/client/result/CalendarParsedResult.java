package com.google.zxing.client.result;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.TimeZone;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
/* loaded from: classes2.dex */
public final class CalendarParsedResult extends ParsedResult {
    private static final Pattern a = Pattern.compile("P(?:(\\d+)W)?(?:(\\d+)D)?(?:T(?:(\\d+)H)?(?:(\\d+)M)?(?:(\\d+)S)?)?");
    private static final long[] b = {604800000, 86400000, 3600000, 60000, 1000};
    private static final Pattern c = Pattern.compile("[0-9]{8}(T[0-9]{6}Z?)?");
    private final String d;
    private final Date e;
    private final boolean f;
    private final Date g;
    private final boolean h;
    private final String i;
    private final String j;
    private final String[] k;
    private final String l;
    private final double m;
    private final double n;

    public CalendarParsedResult(String str, String str2, String str3, String str4, String str5, String str6, String[] strArr, String str7, double d, double d2) {
        super(ParsedResultType.CALENDAR);
        this.d = str;
        try {
            this.e = a(str2);
            if (str3 == null) {
                long a2 = a((CharSequence) str4);
                this.g = a2 < 0 ? null : new Date(a2 + this.e.getTime());
            } else {
                try {
                    this.g = a(str3);
                } catch (ParseException e) {
                    throw new IllegalArgumentException(e.toString());
                }
            }
            this.f = str2.length() == 8;
            this.h = str3 != null && str3.length() == 8;
            this.i = str5;
            this.j = str6;
            this.k = strArr;
            this.l = str7;
            this.m = d;
            this.n = d2;
        } catch (ParseException e2) {
            throw new IllegalArgumentException(e2.toString());
        }
    }

    public String getSummary() {
        return this.d;
    }

    public Date getStart() {
        return this.e;
    }

    public boolean isStartAllDay() {
        return this.f;
    }

    public Date getEnd() {
        return this.g;
    }

    public boolean isEndAllDay() {
        return this.h;
    }

    public String getLocation() {
        return this.i;
    }

    public String getOrganizer() {
        return this.j;
    }

    public String[] getAttendees() {
        return this.k;
    }

    public String getDescription() {
        return this.l;
    }

    public double getLatitude() {
        return this.m;
    }

    public double getLongitude() {
        return this.n;
    }

    @Override // com.google.zxing.client.result.ParsedResult
    public String getDisplayResult() {
        StringBuilder sb = new StringBuilder(100);
        maybeAppend(this.d, sb);
        maybeAppend(a(this.f, this.e), sb);
        maybeAppend(a(this.h, this.g), sb);
        maybeAppend(this.i, sb);
        maybeAppend(this.j, sb);
        maybeAppend(this.k, sb);
        maybeAppend(this.l, sb);
        return sb.toString();
    }

    private static Date a(String str) {
        if (!c.matcher(str).matches()) {
            throw new ParseException(str, 0);
        }
        if (str.length() == 8) {
            return a().parse(str);
        }
        if (str.length() == 16 && str.charAt(15) == 'Z') {
            Date parse = b().parse(str.substring(0, 15));
            GregorianCalendar gregorianCalendar = new GregorianCalendar();
            long time = parse.getTime() + gregorianCalendar.get(15);
            gregorianCalendar.setTime(new Date(time));
            return new Date(time + gregorianCalendar.get(16));
        }
        return b().parse(str);
    }

    private static String a(boolean z, Date date) {
        DateFormat dateTimeInstance;
        if (date == null) {
            return null;
        }
        if (z) {
            dateTimeInstance = DateFormat.getDateInstance(2);
        } else {
            dateTimeInstance = DateFormat.getDateTimeInstance(2, 2);
        }
        return dateTimeInstance.format(date);
    }

    private static long a(CharSequence charSequence) {
        long j = -1;
        if (charSequence != null) {
            Matcher matcher = a.matcher(charSequence);
            if (matcher.matches()) {
                j = 0;
                for (int i = 0; i < b.length; i++) {
                    String group = matcher.group(i + 1);
                    if (group != null) {
                        j += Integer.parseInt(group) * b[i];
                    }
                }
            }
        }
        return j;
    }

    private static DateFormat a() {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyyMMdd", Locale.ENGLISH);
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("GMT"));
        return simpleDateFormat;
    }

    private static DateFormat b() {
        return new SimpleDateFormat("yyyyMMdd'T'HHmmss", Locale.ENGLISH);
    }
}
