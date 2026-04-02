package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import android.util.Log;
import java.util.Objects;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
/* loaded from: classes.dex */
public final class zzax {
    private static final Pattern zza = Pattern.compile("bytes (\\d+)-(\\d+)/(?:\\d+|\\*)");
    private static final Pattern zzb = Pattern.compile("bytes (?:(?:\\d+-\\d+)|\\*)/(\\d+)");

    public static long zza(String str) {
        if (TextUtils.isEmpty(str)) {
            return -1L;
        }
        Matcher matcher = zzb.matcher(str);
        if (matcher.matches()) {
            String group = matcher.group(1);
            Objects.requireNonNull(group);
            return Long.parseLong(group);
        }
        return -1L;
    }

    public static long zzb(String str, String str2) {
        long j2 = -1;
        if (!TextUtils.isEmpty(str)) {
            try {
                j2 = Long.parseLong(str);
            } catch (NumberFormatException unused) {
                StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 28);
                sb.append("Unexpected Content-Length [");
                sb.append(str);
                sb.append("]");
                Log.e("HttpUtil", sb.toString());
            }
        }
        if (TextUtils.isEmpty(str2)) {
            return j2;
        }
        Matcher matcher = zza.matcher(str2);
        if (matcher.matches()) {
            try {
                String group = matcher.group(2);
                Objects.requireNonNull(group);
                long parseLong = Long.parseLong(group);
                String group2 = matcher.group(1);
                Objects.requireNonNull(group2);
                long parseLong2 = (parseLong - Long.parseLong(group2)) + 1;
                if (j2 < 0) {
                    return parseLong2;
                }
                if (j2 != parseLong2) {
                    StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 26 + String.valueOf(str2).length());
                    sb2.append("Inconsistent headers [");
                    sb2.append(str);
                    sb2.append("] [");
                    sb2.append(str2);
                    sb2.append("]");
                    Log.w("HttpUtil", sb2.toString());
                    return Math.max(j2, parseLong2);
                }
                return j2;
            } catch (NumberFormatException unused2) {
                StringBuilder sb3 = new StringBuilder(String.valueOf(str2).length() + 27);
                sb3.append("Unexpected Content-Range [");
                sb3.append(str2);
                sb3.append("]");
                Log.e("HttpUtil", sb3.toString());
                return j2;
            }
        }
        return j2;
    }
}
