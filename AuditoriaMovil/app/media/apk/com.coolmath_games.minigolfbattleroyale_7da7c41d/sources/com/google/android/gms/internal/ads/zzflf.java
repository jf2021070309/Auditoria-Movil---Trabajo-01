package com.google.android.gms.internal.ads;
/* compiled from: com.google.android.gms:play-services-ads-lite@@20.5.0 */
/* loaded from: classes2.dex */
public final class zzflf {
    public static String zza(String str) {
        int length = str.length();
        int i = 0;
        while (i < length) {
            if (zzd(str.charAt(i))) {
                char[] charArray = str.toCharArray();
                while (i < length) {
                    char c = charArray[i];
                    if (zzd(c)) {
                        charArray[i] = (char) (c ^ ' ');
                    }
                    i++;
                }
                return String.valueOf(charArray);
            }
            i++;
        }
        return str;
    }

    public static String zzb(String str) {
        int length = str.length();
        int i = 0;
        while (i < length) {
            if (zzc(str.charAt(i))) {
                char[] charArray = str.toCharArray();
                while (i < length) {
                    char c = charArray[i];
                    if (zzc(c)) {
                        charArray[i] = (char) (c ^ ' ');
                    }
                    i++;
                }
                return String.valueOf(charArray);
            }
            i++;
        }
        return str;
    }

    public static boolean zzc(char c) {
        return c >= 'a' && c <= 'z';
    }

    public static boolean zzd(char c) {
        return c >= 'A' && c <= 'Z';
    }

    public static boolean zze(CharSequence charSequence, CharSequence charSequence2) {
        int zzf;
        int length = "content-length".length();
        if (charSequence2 == "content-length") {
            return true;
        }
        if (length == charSequence2.length()) {
            for (int i = 0; i < length; i++) {
                char charAt = "content-length".charAt(i);
                char charAt2 = charSequence2.charAt(i);
                if (charAt != charAt2 && ((zzf = zzf(charAt)) >= 26 || zzf != zzf(charAt2))) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }

    private static int zzf(char c) {
        return (char) ((c | ' ') - 97);
    }
}
