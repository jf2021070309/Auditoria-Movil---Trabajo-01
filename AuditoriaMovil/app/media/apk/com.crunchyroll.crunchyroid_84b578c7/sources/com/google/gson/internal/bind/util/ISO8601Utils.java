package com.google.gson.internal.bind.util;

import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.TimeZone;
/* loaded from: classes4.dex */
public class ISO8601Utils {
    private static final String UTC_ID = "UTC";
    private static final TimeZone TIMEZONE_UTC = TimeZone.getTimeZone(UTC_ID);

    private static boolean checkOffset(String str, int i, char c) {
        if (i < str.length() && str.charAt(i) == c) {
            return true;
        }
        return false;
    }

    public static String format(Date date) {
        return format(date, false, TIMEZONE_UTC);
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

    /* JADX WARN: Removed duplicated region for block: B:102:0x01d9  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00de A[Catch: IllegalArgumentException -> 0x01b7, NumberFormatException -> 0x01b9, IndexOutOfBoundsException -> 0x01bb, TRY_LEAVE, TryCatch #3 {IllegalArgumentException -> 0x01b7, IndexOutOfBoundsException -> 0x01bb, NumberFormatException -> 0x01b9, blocks: (B:3:0x000c, B:5:0x001e, B:6:0x0020, B:8:0x002c, B:9:0x002e, B:11:0x003d, B:13:0x0043, B:17:0x005b, B:19:0x006b, B:20:0x006d, B:22:0x0079, B:23:0x007b, B:25:0x0081, B:29:0x008b, B:34:0x009b, B:36:0x00a3, B:49:0x00d8, B:51:0x00de, B:88:0x01a7, B:90:0x01af, B:91:0x01b6, B:41:0x00bd, B:42:0x00c0), top: B:108:0x000c }] */
    /* JADX WARN: Removed duplicated region for block: B:90:0x01af A[Catch: IllegalArgumentException -> 0x01b7, NumberFormatException -> 0x01b9, IndexOutOfBoundsException -> 0x01bb, TryCatch #3 {IllegalArgumentException -> 0x01b7, IndexOutOfBoundsException -> 0x01bb, NumberFormatException -> 0x01b9, blocks: (B:3:0x000c, B:5:0x001e, B:6:0x0020, B:8:0x002c, B:9:0x002e, B:11:0x003d, B:13:0x0043, B:17:0x005b, B:19:0x006b, B:20:0x006d, B:22:0x0079, B:23:0x007b, B:25:0x0081, B:29:0x008b, B:34:0x009b, B:36:0x00a3, B:49:0x00d8, B:51:0x00de, B:88:0x01a7, B:90:0x01af, B:91:0x01b6, B:41:0x00bd, B:42:0x00c0), top: B:108:0x000c }] */
    /* JADX WARN: Removed duplicated region for block: B:98:0x01be  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x01c0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.util.Date parse(java.lang.String r18, java.text.ParsePosition r19) throws java.text.ParseException {
        /*
            Method dump skipped, instructions count: 527
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.gson.internal.bind.util.ISO8601Utils.parse(java.lang.String, java.text.ParsePosition):java.util.Date");
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

    public static String format(Date date, boolean z) {
        return format(date, z, TIMEZONE_UTC);
    }

    public static String format(Date date, boolean z, TimeZone timeZone) {
        GregorianCalendar gregorianCalendar = new GregorianCalendar(timeZone, Locale.US);
        gregorianCalendar.setTime(date);
        StringBuilder sb = new StringBuilder(19 + (z ? 4 : 0) + (timeZone.getRawOffset() == 0 ? 1 : 6));
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
        if (z) {
            sb.append('.');
            padInt(sb, gregorianCalendar.get(14), 3);
        }
        int offset = timeZone.getOffset(gregorianCalendar.getTimeInMillis());
        if (offset != 0) {
            int i = offset / 60000;
            int abs = Math.abs(i / 60);
            int abs2 = Math.abs(i % 60);
            sb.append(offset >= 0 ? '+' : '-');
            padInt(sb, abs, 2);
            sb.append(':');
            padInt(sb, abs2, 2);
        } else {
            sb.append('Z');
        }
        return sb.toString();
    }
}
