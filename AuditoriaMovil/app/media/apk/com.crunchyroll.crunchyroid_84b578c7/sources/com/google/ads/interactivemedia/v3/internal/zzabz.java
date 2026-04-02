package com.google.ads.interactivemedia.v3.internal;

import java.util.TimeZone;
/* compiled from: com.google.ads.interactivemedia.v3:interactivemedia@@3.30.3 */
/* loaded from: classes2.dex */
public final class zzabz {
    private static final TimeZone zza = TimeZone.getTimeZone("UTC");

    /* JADX WARN: Removed duplicated region for block: B:59:0x00e6 A[Catch: IllegalArgumentException | IndexOutOfBoundsException | NumberFormatException -> 0x01d5, NumberFormatException -> 0x01d7, IndexOutOfBoundsException -> 0x01d9, TryCatch #2 {IllegalArgumentException | IndexOutOfBoundsException | NumberFormatException -> 0x01d5, blocks: (B:3:0x0004, B:5:0x0016, B:6:0x0018, B:8:0x0024, B:9:0x0026, B:11:0x0035, B:13:0x003b, B:17:0x0055, B:19:0x0065, B:20:0x0067, B:22:0x0073, B:23:0x0075, B:25:0x007b, B:29:0x0085, B:34:0x0095, B:36:0x009d, B:37:0x00a1, B:39:0x00a7, B:44:0x00b4, B:46:0x00bb, B:57:0x00e0, B:59:0x00e6, B:61:0x00ed, B:85:0x019b, B:66:0x00f9, B:67:0x0114, B:68:0x0115, B:70:0x011f, B:71:0x0130, B:73:0x013d, B:76:0x0146, B:78:0x0165, B:81:0x0174, B:82:0x0196, B:84:0x0199, B:87:0x01cd, B:88:0x01d4, B:50:0x00cb, B:51:0x00ce, B:45:0x00b7), top: B:104:0x0004 }] */
    /* JADX WARN: Removed duplicated region for block: B:87:0x01cd A[Catch: IllegalArgumentException | IndexOutOfBoundsException | NumberFormatException -> 0x01d5, NumberFormatException -> 0x01d7, IndexOutOfBoundsException -> 0x01d9, TryCatch #2 {IllegalArgumentException | IndexOutOfBoundsException | NumberFormatException -> 0x01d5, blocks: (B:3:0x0004, B:5:0x0016, B:6:0x0018, B:8:0x0024, B:9:0x0026, B:11:0x0035, B:13:0x003b, B:17:0x0055, B:19:0x0065, B:20:0x0067, B:22:0x0073, B:23:0x0075, B:25:0x007b, B:29:0x0085, B:34:0x0095, B:36:0x009d, B:37:0x00a1, B:39:0x00a7, B:44:0x00b4, B:46:0x00bb, B:57:0x00e0, B:59:0x00e6, B:61:0x00ed, B:85:0x019b, B:66:0x00f9, B:67:0x0114, B:68:0x0115, B:70:0x011f, B:71:0x0130, B:73:0x013d, B:76:0x0146, B:78:0x0165, B:81:0x0174, B:82:0x0196, B:84:0x0199, B:87:0x01cd, B:88:0x01d4, B:50:0x00cb, B:51:0x00ce, B:45:0x00b7), top: B:104:0x0004 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.util.Date zza(java.lang.String r17, java.text.ParsePosition r18) throws java.text.ParseException {
        /*
            Method dump skipped, instructions count: 533
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.ads.interactivemedia.v3.internal.zzabz.zza(java.lang.String, java.text.ParsePosition):java.util.Date");
    }

    private static int zzb(String str, int i, int i2) throws NumberFormatException {
        int i3;
        int i4;
        if (i >= 0 && i2 <= str.length() && i <= i2) {
            if (i < i2) {
                i4 = i + 1;
                int digit = Character.digit(str.charAt(i), 10);
                if (digit >= 0) {
                    i3 = -digit;
                } else {
                    throw new NumberFormatException("Invalid number: ".concat(String.valueOf(str.substring(i, i2))));
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
                    throw new NumberFormatException("Invalid number: ".concat(String.valueOf(str.substring(i, i2))));
                }
            }
            return -i3;
        }
        throw new NumberFormatException(str);
    }

    private static boolean zzc(String str, int i, char c) {
        if (i < str.length() && str.charAt(i) == c) {
            return true;
        }
        return false;
    }
}
