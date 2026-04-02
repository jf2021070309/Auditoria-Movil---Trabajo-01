package com.google.android.gms.internal.cast;
/* compiled from: com.google.android.gms:play-services-cast@@21.4.0 */
/* loaded from: classes3.dex */
public final class zzes {
    public static String zza(String str) {
        int length = str.length();
        int i = 0;
        while (i < length) {
            if (zzb(str.charAt(i))) {
                char[] charArray = str.toCharArray();
                while (i < length) {
                    char c = charArray[i];
                    if (zzb(c)) {
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

    public static boolean zzb(char c) {
        if (c >= 'a' && c <= 'z') {
            return true;
        }
        return false;
    }
}
