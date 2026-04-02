package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import e.a.d.a.a;
import java.util.Arrays;
import java.util.HashSet;
/* loaded from: classes.dex */
public final class zzfjk {
    public static boolean zza(int i2) {
        int i3 = i2 - 1;
        return i3 == 2 || i3 == 4 || i3 == 5 || i3 == 6;
    }

    /* JADX WARN: Removed duplicated region for block: B:47:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0123  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final int zzb(android.content.Context r13, com.google.android.gms.internal.ads.zzfii r14) {
        /*
            Method dump skipped, instructions count: 299
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzfjk.zzb(android.content.Context, com.google.android.gms.internal.ads.zzfii):int");
    }

    private static final void zzc(byte[] bArr, String str, Context context, zzfii zzfiiVar) {
        StringBuilder y = a.y("os.arch:");
        y.append(zzfmh.OS_ARCH.zza());
        y.append(";");
        try {
            String[] strArr = (String[]) Build.class.getField("SUPPORTED_ABIS").get(null);
            if (strArr != null) {
                y.append("supported_abis:");
                y.append(Arrays.toString(strArr));
                y.append(";");
            }
        } catch (IllegalAccessException | NoSuchFieldException unused) {
        }
        y.append("CPU_ABI:");
        y.append(Build.CPU_ABI);
        y.append(";CPU_ABI2:");
        y.append(Build.CPU_ABI2);
        y.append(";");
        if (bArr != null) {
            y.append("ELF:");
            y.append(Arrays.toString(bArr));
            y.append(";");
        }
        if (str != null) {
            a.L(y, "dbg:", str, ";");
        }
        zzfiiVar.zze(4007, y.toString());
    }

    private static final String zzd(Context context, zzfii zzfiiVar) {
        HashSet hashSet = new HashSet(Arrays.asList("i686", "armv71"));
        String zza = zzfmh.OS_ARCH.zza();
        if (TextUtils.isEmpty(zza) || !hashSet.contains(zza)) {
            try {
                String[] strArr = (String[]) Build.class.getField("SUPPORTED_ABIS").get(null);
                if (strArr != null && strArr.length > 0) {
                    return strArr[0];
                }
            } catch (IllegalAccessException e2) {
                zzfiiVar.zzc(2024, 0L, e2);
            } catch (NoSuchFieldException e3) {
                zzfiiVar.zzc(2024, 0L, e3);
            }
            String str = Build.CPU_ABI;
            return str != null ? str : Build.CPU_ABI2;
        }
        return zza;
    }
}
