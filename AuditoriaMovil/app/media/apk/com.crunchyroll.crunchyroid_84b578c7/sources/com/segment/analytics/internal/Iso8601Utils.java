package com.segment.analytics.internal;

import com.amazon.aps.iva.oa.a;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.TimeZone;
/* loaded from: classes4.dex */
final class Iso8601Utils {
    static final String GMT_ID = "GMT";
    static final TimeZone TIMEZONE_Z = TimeZone.getTimeZone(GMT_ID);

    private static boolean checkOffset(String str, int i, char c) {
        if (i < str.length() && str.charAt(i) == c) {
            return true;
        }
        return false;
    }

    public static String format(Date date) {
        GregorianCalendar gregorianCalendar = new GregorianCalendar(TIMEZONE_Z, Locale.US);
        gregorianCalendar.setTime(date);
        StringBuilder sb = new StringBuilder(24);
        padInt(sb, gregorianCalendar.get(1), 4);
        sb.append('-');
        padInt(sb, gregorianCalendar.get(2) + 1, 2);
        sb.append('-');
        padInt(sb, gregorianCalendar.get(5), 2);
        sb.append('T');
        padInt(sb, gregorianCalendar.get(11), 2);
        sb.append(':');
        padInt(sb, gregorianCalendar.get(12), 2);
        sb.append(':');
        padInt(sb, gregorianCalendar.get(13), 2);
        sb.append('.');
        padInt(sb, gregorianCalendar.get(14), 3);
        sb.append('Z');
        return sb.toString();
    }

    public static String formatNanos(Date date) {
        GregorianCalendar gregorianCalendar = new GregorianCalendar(TIMEZONE_Z, Locale.US);
        gregorianCalendar.setTime(date);
        StringBuilder sb = new StringBuilder(30);
        padInt(sb, gregorianCalendar.get(1), 4);
        sb.append('-');
        padInt(sb, gregorianCalendar.get(2) + 1, 2);
        sb.append('-');
        padInt(sb, gregorianCalendar.get(5), 2);
        sb.append('T');
        padInt(sb, gregorianCalendar.get(11), 2);
        sb.append(':');
        padInt(sb, gregorianCalendar.get(12), 2);
        sb.append(':');
        padInt(sb, gregorianCalendar.get(13), 2);
        sb.append('.');
        if (date instanceof NanoDate) {
            padLong(sb, ((NanoDate) date).nanos() % 1000000000, 9);
        } else {
            padLong(sb, gregorianCalendar.get(14), 9);
        }
        sb.append('Z');
        return sb.toString();
    }

    private static int indexOfNonDigit(String str, int i) {
        while (i < str.length()) {
            char charAt = str.charAt(i);
            if (charAt >= '0' && charAt <= '9') {
                i++;
            } else {
                return i;
            }
        }
        return str.length();
    }

    private static void padInt(StringBuilder sb, int i, int i2) {
        String num = Integer.toString(i);
        for (int length = i2 - num.length(); length > 0; length--) {
            sb.append('0');
        }
        sb.append(num);
    }

    private static void padLong(StringBuilder sb, long j, int i) {
        String l = Long.toString(j);
        sb.append(l);
        for (int length = i - l.length(); length > 0; length--) {
            sb.append('0');
        }
    }

    public static Date parse(String str) {
        int i;
        int i2;
        int i3;
        int i4;
        TimeZone timeZone;
        int i5;
        char charAt;
        int min;
        int i6 = 4;
        try {
            int parseInt = parseInt(str, 0, 4);
            if (checkOffset(str, 4, '-')) {
                i6 = 5;
            }
            int i7 = i6 + 2;
            int parseInt2 = parseInt(str, i6, i7);
            if (checkOffset(str, i7, '-')) {
                i7++;
            }
            int i8 = i7 + 2;
            int parseInt3 = parseInt(str, i7, i8);
            boolean checkOffset = checkOffset(str, i8, 'T');
            if (!checkOffset && str.length() <= i8) {
                return new GregorianCalendar(parseInt, parseInt2 - 1, parseInt3).getTime();
            }
            if (checkOffset) {
                int i9 = i8 + 1;
                int i10 = i9 + 2;
                int parseInt4 = parseInt(str, i9, i10);
                if (checkOffset(str, i10, ':')) {
                    i10++;
                }
                int i11 = i10 + 2;
                i4 = parseInt(str, i10, i11);
                if (checkOffset(str, i11, ':')) {
                    i11++;
                }
                if (str.length() > i11 && (charAt = str.charAt(i11)) != 'Z' && charAt != '+' && charAt != '-') {
                    int i12 = i11 + 2;
                    i = parseInt(str, i11, i12);
                    if (i > 59 && i < 63) {
                        i = 59;
                    }
                    if (checkOffset(str, i12, '.')) {
                        int i13 = i12 + 1;
                        int indexOfNonDigit = indexOfNonDigit(str, i13 + 1);
                        int parseInt5 = parseInt(str, i13, Math.min(indexOfNonDigit, i13 + 3));
                        i2 = parseInt4;
                        i5 = i4;
                        i3 = (int) (Math.pow(10.0d, 3 - (min - i13)) * parseInt5);
                        i8 = indexOfNonDigit;
                    } else {
                        i2 = parseInt4;
                        i8 = i12;
                        i3 = 0;
                    }
                } else {
                    i2 = parseInt4;
                    i5 = i4;
                    i3 = 0;
                    i = 0;
                    i8 = i11;
                }
                i4 = i5;
            } else {
                i = 0;
                i2 = 0;
                i3 = 0;
                i4 = 0;
            }
            if (str.length() > i8) {
                char charAt2 = str.charAt(i8);
                if (charAt2 == 'Z') {
                    timeZone = TIMEZONE_Z;
                } else {
                    if (charAt2 != '+' && charAt2 != '-') {
                        throw new IndexOutOfBoundsException("Invalid time zone indicator '" + charAt2 + "'");
                    }
                    String substring = str.substring(i8);
                    if (!"+0000".equals(substring) && !"+00:00".equals(substring)) {
                        String str2 = GMT_ID + substring;
                        TimeZone timeZone2 = TimeZone.getTimeZone(str2);
                        String id = timeZone2.getID();
                        if (!id.equals(str2) && !id.replace(":", "").equals(str2)) {
                            throw new IndexOutOfBoundsException("Mismatching time zone indicator: " + str2 + " given, resolves to " + timeZone2.getID());
                        }
                        timeZone = timeZone2;
                    }
                    timeZone = TIMEZONE_Z;
                }
                GregorianCalendar gregorianCalendar = new GregorianCalendar(timeZone);
                gregorianCalendar.setLenient(false);
                gregorianCalendar.set(1, parseInt);
                gregorianCalendar.set(2, parseInt2 - 1);
                gregorianCalendar.set(5, parseInt3);
                gregorianCalendar.set(11, i2);
                gregorianCalendar.set(12, i4);
                gregorianCalendar.set(13, i);
                gregorianCalendar.set(14, i3);
                return gregorianCalendar.getTime();
            }
            throw new IllegalArgumentException("No time zone indicator");
        } catch (IllegalArgumentException | IndexOutOfBoundsException e) {
            throw new RuntimeException(a.a("Not an RFC 3339 date: ", str), e);
        }
    }

    private static int parseInt(String str, int i, int i2) throws NumberFormatException {
        int i3;
        int i4;
        if (i >= 0 && i2 <= str.length() && i <= i2) {
            if (i < i2) {
                i4 = i + 1;
                int digit = Character.digit(str.charAt(i), 10);
                if (digit >= 0) {
                    i3 = -digit;
                } else {
                    throw new NumberFormatException("Invalid number: " + str.substring(i, i2));
                }
            } else {
                i3 = 0;
                i4 = i;
            }
            while (i4 < i2) {
                int i5 = i4 + 1;
                int digit2 = Character.digit(str.charAt(i4), 10);
                if (digit2 >= 0) {
                    i3 = (i3 * 10) - digit2;
                    i4 = i5;
                } else {
                    throw new NumberFormatException("Invalid number: " + str.substring(i, i2));
                }
            }
            return -i3;
        }
        throw new NumberFormatException(str);
    }

    public static NanoDate parseWithNanos(String str) {
        int i;
        int i2;
        int i3;
        int i4;
        TimeZone timeZone;
        int i5;
        char charAt;
        int min;
        int i6 = 4;
        try {
            int parseInt = parseInt(str, 0, 4);
            if (checkOffset(str, 4, '-')) {
                i6 = 5;
            }
            int i7 = i6 + 2;
            int parseInt2 = parseInt(str, i6, i7);
            if (checkOffset(str, i7, '-')) {
                i7++;
            }
            int i8 = i7 + 2;
            int parseInt3 = parseInt(str, i7, i8);
            boolean checkOffset = checkOffset(str, i8, 'T');
            if (!checkOffset && str.length() <= i8) {
                return new NanoDate(new GregorianCalendar(parseInt, parseInt2 - 1, parseInt3).getTime());
            }
            if (checkOffset) {
                int i9 = i8 + 1;
                int i10 = i9 + 2;
                int parseInt4 = parseInt(str, i9, i10);
                if (checkOffset(str, i10, ':')) {
                    i10++;
                }
                int i11 = i10 + 2;
                i4 = parseInt(str, i10, i11);
                if (checkOffset(str, i11, ':')) {
                    i11++;
                }
                if (str.length() > i11 && (charAt = str.charAt(i11)) != 'Z' && charAt != '+' && charAt != '-') {
                    int i12 = i11 + 2;
                    i = parseInt(str, i11, i12);
                    if (i > 59 && i < 63) {
                        i = 59;
                    }
                    if (checkOffset(str, i12, '.')) {
                        int i13 = i12 + 1;
                        int indexOfNonDigit = indexOfNonDigit(str, i13 + 1);
                        int parseInt5 = parseInt(str, i13, Math.min(indexOfNonDigit, i13 + 9));
                        i2 = parseInt4;
                        i5 = i4;
                        i3 = (int) (Math.pow(10.0d, 9 - (min - i13)) * parseInt5);
                        i8 = indexOfNonDigit;
                    } else {
                        i2 = parseInt4;
                        i8 = i12;
                        i3 = 0;
                    }
                } else {
                    i2 = parseInt4;
                    i5 = i4;
                    i3 = 0;
                    i = 0;
                    i8 = i11;
                }
                i4 = i5;
            } else {
                i = 0;
                i2 = 0;
                i3 = 0;
                i4 = 0;
            }
            if (str.length() > i8) {
                char charAt2 = str.charAt(i8);
                if (charAt2 == 'Z') {
                    timeZone = TIMEZONE_Z;
                } else {
                    if (charAt2 != '+' && charAt2 != '-') {
                        throw new IndexOutOfBoundsException("Invalid time zone indicator '" + charAt2 + "'");
                    }
                    String substring = str.substring(i8);
                    if (!"+0000".equals(substring) && !"+00:00".equals(substring)) {
                        String str2 = GMT_ID + substring;
                        TimeZone timeZone2 = TimeZone.getTimeZone(str2);
                        String id = timeZone2.getID();
                        if (!id.equals(str2) && !id.replace(":", "").equals(str2)) {
                            throw new IndexOutOfBoundsException("Mismatching time zone indicator: " + str2 + " given, resolves to " + timeZone2.getID());
                        }
                        timeZone = timeZone2;
                    }
                    timeZone = TIMEZONE_Z;
                }
                GregorianCalendar gregorianCalendar = new GregorianCalendar(timeZone);
                gregorianCalendar.setLenient(false);
                gregorianCalendar.set(1, parseInt);
                gregorianCalendar.set(2, parseInt2 - 1);
                gregorianCalendar.set(5, parseInt3);
                gregorianCalendar.set(11, i2);
                gregorianCalendar.set(12, i4);
                gregorianCalendar.set(13, i);
                gregorianCalendar.set(14, 0);
                return new NanoDate((gregorianCalendar.getTime().getTime() * 1000000) + i3);
            }
            throw new IllegalArgumentException("No time zone indicator");
        } catch (IllegalArgumentException | IndexOutOfBoundsException e) {
            throw new RuntimeException(a.a("Not an RFC 3339 date: ", str), e);
        }
    }
}
