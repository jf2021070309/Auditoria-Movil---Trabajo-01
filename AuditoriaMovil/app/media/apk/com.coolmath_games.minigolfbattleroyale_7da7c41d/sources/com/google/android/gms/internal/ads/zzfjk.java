package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import java.util.Arrays;
import java.util.HashSet;
/* compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* loaded from: classes2.dex */
public final class zzfjk {
    public static boolean zza(int i) {
        int i2 = i - 1;
        return i2 == 2 || i2 == 4 || i2 == 5 || i2 == 6;
    }

    /* JADX WARN: Removed duplicated region for block: B:47:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0122  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final int zzb(android.content.Context r13, com.google.android.gms.internal.ads.zzfii r14) {
        /*
            Method dump skipped, instructions count: 298
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzfjk.zzb(android.content.Context, com.google.android.gms.internal.ads.zzfii):int");
    }

    private static final void zzc(byte[] bArr, String str, Context context, zzfii zzfiiVar) {
        StringBuilder sb = new StringBuilder();
        sb.append("os.arch:");
        sb.append(zzfmh.OS_ARCH.zza());
        sb.append(";");
        try {
            String[] strArr = (String[]) Build.class.getField("SUPPORTED_ABIS").get(null);
            if (strArr != null) {
                sb.append("supported_abis:");
                sb.append(Arrays.toString(strArr));
                sb.append(";");
            }
        } catch (IllegalAccessException | NoSuchFieldException unused) {
        }
        sb.append("CPU_ABI:");
        sb.append(Build.CPU_ABI);
        sb.append(";CPU_ABI2:");
        sb.append(Build.CPU_ABI2);
        sb.append(";");
        if (bArr != null) {
            sb.append("ELF:");
            sb.append(Arrays.toString(bArr));
            sb.append(";");
        }
        if (str != null) {
            sb.append("dbg:");
            sb.append(str);
            sb.append(";");
        }
        zzfiiVar.zze(4007, sb.toString());
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
            } catch (IllegalAccessException e) {
                zzfiiVar.zzc(2024, 0L, e);
            } catch (NoSuchFieldException e2) {
                zzfiiVar.zzc(2024, 0L, e2);
            }
            return Build.CPU_ABI != null ? Build.CPU_ABI : Build.CPU_ABI2;
        }
        return zza;
    }
}
