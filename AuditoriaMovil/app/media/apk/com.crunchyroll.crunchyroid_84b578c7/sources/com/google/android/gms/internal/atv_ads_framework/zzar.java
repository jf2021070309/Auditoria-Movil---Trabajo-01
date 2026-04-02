package com.google.android.gms.internal.atv_ads_framework;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
/* compiled from: com.google.android.tv:tv-ads@@1.0.0-alpha02 */
/* loaded from: classes3.dex */
public final class zzar {
    private static final Set zza = zzb("http", "https", "mailto", "ftp");
    private static final Set zzb = zzb("audio/3gpp2", "audio/3gpp", "audio/aac", "audio/midi", "audio/mp3", "audio/mp4", "audio/mpeg", "audio/oga", "audio/ogg", "audio/opus", "audio/x-m4a", "audio/x-matroska", "audio/x-wav", "audio/wav", "audio/webm", "image/bmp", "image/gif", "image/jpeg", "image/jpg", "image/png", "image/svg+xml", "image/tiff", "image/webp", "image/x-icon", "video/mpeg", "video/mp4", "video/ogg", "video/webm", "video/x-matroska");
    private static final Set zzc = Collections.emptySet();

    public static String zza(String str, String str2) {
        char charAt;
        int i;
        char charAt2;
        char charAt3;
        Set<zzaq> set = zzc;
        String lowerCase = str.toLowerCase();
        for (String str3 : zza) {
            if (lowerCase.startsWith(String.valueOf(str3).concat(":"))) {
                return str;
            }
        }
        if (lowerCase.startsWith("data:")) {
            String lowerCase2 = str.toLowerCase();
            if (lowerCase2.startsWith("data:") && lowerCase2.length() > 5) {
                int i2 = 5;
                while (i2 < lowerCase2.length() && (charAt3 = lowerCase2.charAt(i2)) != ';' && charAt3 != ',') {
                    i2++;
                }
                if (zzb.contains(lowerCase2.substring(5, i2)) && lowerCase2.startsWith(";base64,", i2) && (i = i2 + 8) < lowerCase2.length()) {
                    while (i < lowerCase2.length() && (charAt2 = lowerCase2.charAt(i)) != '=') {
                        if ((charAt2 < 'a' || charAt2 > 'z') && !((charAt2 >= '0' && charAt2 <= '9') || charAt2 == '+' || charAt2 == '/')) {
                            break;
                        }
                        i++;
                    }
                    while (i < lowerCase2.length()) {
                        if (lowerCase2.charAt(i) == '=') {
                            i++;
                        }
                    }
                    return str;
                }
            }
        } else {
            for (zzaq zzaqVar : set) {
                if (lowerCase.startsWith(String.valueOf(zzaqVar.name().toLowerCase().replace('_', '-')).concat(":"))) {
                    return str;
                }
            }
            for (int i3 = 0; i3 < str.length() && (charAt = str.charAt(i3)) != '#' && charAt != '/'; i3++) {
                if (charAt != ':') {
                    if (charAt == '?') {
                        return str;
                    }
                }
            }
            return str;
        }
        return "about:invalid#zTvAdsFrameworkz";
    }

    private static final Set zzb(String... strArr) {
        HashSet hashSet = new HashSet();
        for (String str : strArr) {
            hashSet.add(str);
        }
        return Collections.unmodifiableSet(hashSet);
    }
}
