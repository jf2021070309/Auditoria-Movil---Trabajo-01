package com.google.gson.internal;

import com.amazon.aps.iva.q.c0;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Locale;
/* loaded from: classes4.dex */
public class PreJava9DateFormatProvider {
    private static String getDateFormatPattern(int i) {
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i == 3) {
                        return "M/d/yy";
                    }
                    throw new IllegalArgumentException(c0.a("Unknown DateFormat style: ", i));
                }
                return "MMM d, y";
            }
            return "MMMM d, y";
        }
        return "EEEE, MMMM d, y";
    }

    private static String getDatePartOfDateTimePattern(int i) {
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i == 3) {
                        return "M/d/yy";
                    }
                    throw new IllegalArgumentException(c0.a("Unknown DateFormat style: ", i));
                }
                return "MMM d, yyyy";
            }
            return "MMMM d, yyyy";
        }
        return "EEEE, MMMM d, yyyy";
    }

    private static String getTimePartOfDateTimePattern(int i) {
        if (i != 0 && i != 1) {
            if (i != 2) {
                if (i == 3) {
                    return "h:mm a";
                }
                throw new IllegalArgumentException(c0.a("Unknown DateFormat style: ", i));
            }
            return "h:mm:ss a";
        }
        return "h:mm:ss a z";
    }

    public static DateFormat getUSDateFormat(int i) {
        return new SimpleDateFormat(getDateFormatPattern(i), Locale.US);
    }

    public static DateFormat getUSDateTimeFormat(int i, int i2) {
        return new SimpleDateFormat(getDatePartOfDateTimePattern(i) + " " + getTimePartOfDateTimePattern(i2), Locale.US);
    }
}
