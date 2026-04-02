package com.google.android.gms.internal.ads;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
/* loaded from: classes.dex */
public final class zzwz {
    public static zzvl zza(zzvy zzvyVar) {
        boolean z;
        long j2;
        long j3;
        long j4;
        long j5;
        long j6;
        long currentTimeMillis = System.currentTimeMillis();
        Map<String, String> map = zzvyVar.zzc;
        if (map == null) {
            return null;
        }
        String str = map.get("Date");
        long zzb = str != null ? zzb(str) : 0L;
        String str2 = map.get("Cache-Control");
        int i2 = 0;
        if (str2 != null) {
            String[] split = str2.split(",", 0);
            int i3 = 0;
            j2 = 0;
            j3 = 0;
            while (i2 < split.length) {
                String trim = split[i2].trim();
                if (trim.equals("no-cache") || trim.equals("no-store")) {
                    return null;
                }
                if (trim.startsWith("max-age=")) {
                    try {
                        j2 = Long.parseLong(trim.substring(8));
                    } catch (Exception unused) {
                    }
                } else if (trim.startsWith("stale-while-revalidate=")) {
                    j3 = Long.parseLong(trim.substring(23));
                } else if (trim.equals("must-revalidate") || trim.equals("proxy-revalidate")) {
                    i3 = 1;
                }
                i2++;
            }
            i2 = i3;
            z = true;
        } else {
            z = false;
            j2 = 0;
            j3 = 0;
        }
        String str3 = map.get("Expires");
        long zzb2 = str3 != null ? zzb(str3) : 0L;
        String str4 = map.get("Last-Modified");
        long zzb3 = str4 != null ? zzb(str4) : 0L;
        String str5 = map.get("ETag");
        if (z) {
            j5 = currentTimeMillis + (j2 * 1000);
            if (i2 != 0) {
                j6 = j5;
            } else {
                Long.signum(j3);
                j6 = (j3 * 1000) + j5;
            }
            j4 = j6;
        } else {
            j4 = 0;
            if (zzb <= 0 || zzb2 < zzb) {
                j5 = 0;
            } else {
                j5 = currentTimeMillis + (zzb2 - zzb);
                j4 = j5;
            }
        }
        zzvl zzvlVar = new zzvl();
        zzvlVar.zza = zzvyVar.zzb;
        zzvlVar.zzb = str5;
        zzvlVar.zzf = j5;
        zzvlVar.zze = j4;
        zzvlVar.zzc = zzb;
        zzvlVar.zzd = zzb3;
        zzvlVar.zzg = map;
        zzvlVar.zzh = zzvyVar.zzd;
        return zzvlVar;
    }

    public static long zzb(String str) {
        try {
            return zzd("EEE, dd MMM yyyy HH:mm:ss zzz").parse(str).getTime();
        } catch (ParseException e2) {
            if ("0".equals(str) || "-1".equals(str)) {
                zzwo.zza("Unable to parse dateStr: %s, falling back to 0", str);
                return 0L;
            }
            zzwo.zzd(e2, "Unable to parse dateStr: %s, falling back to 0", str);
            return 0L;
        }
    }

    public static String zzc(long j2) {
        return zzd("EEE, dd MMM yyyy HH:mm:ss 'GMT'").format(new Date(j2));
    }

    private static SimpleDateFormat zzd(String str) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(str, Locale.US);
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("GMT"));
        return simpleDateFormat;
    }
}
