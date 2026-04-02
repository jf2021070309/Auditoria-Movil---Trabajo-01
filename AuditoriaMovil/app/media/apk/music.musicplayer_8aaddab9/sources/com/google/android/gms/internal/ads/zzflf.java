package com.google.android.gms.internal.ads;
/* loaded from: classes.dex */
public final class zzflf {
    public static String zza(String str) {
        int length = str.length();
        int i2 = 0;
        while (i2 < length) {
            if (zzd(str.charAt(i2))) {
                char[] charArray = str.toCharArray();
                while (i2 < length) {
                    char c2 = charArray[i2];
                    if (zzd(c2)) {
                        charArray[i2] = (char) (c2 ^ ' ');
                    }
                    i2++;
                }
                return String.valueOf(charArray);
            }
            i2++;
        }
        return str;
    }

    public static String zzb(String str) {
        int length = str.length();
        int i2 = 0;
        while (i2 < length) {
            if (zzc(str.charAt(i2))) {
                char[] charArray = str.toCharArray();
                while (i2 < length) {
                    char c2 = charArray[i2];
                    if (zzc(c2)) {
                        charArray[i2] = (char) (c2 ^ ' ');
                    }
                    i2++;
                }
                return String.valueOf(charArray);
            }
            i2++;
        }
        return str;
    }

    public static boolean zzc(char c2) {
        return c2 >= 'a' && c2 <= 'z';
    }

    public static boolean zzd(char c2) {
        return c2 >= 'A' && c2 <= 'Z';
    }

    public static boolean zze(CharSequence charSequence, CharSequence charSequence2) {
        int zzf;
        int length = "content-length".length();
        if (charSequence2 == "content-length") {
            return true;
        }
        if (length == charSequence2.length()) {
            for (int i2 = 0; i2 < length; i2++) {
                char charAt = "content-length".charAt(i2);
                char charAt2 = charSequence2.charAt(i2);
                if (charAt != charAt2 && ((zzf = zzf(charAt)) >= 26 || zzf != zzf(charAt2))) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }

    private static int zzf(char c2) {
        return (char) ((c2 | ' ') - 97);
    }
}
