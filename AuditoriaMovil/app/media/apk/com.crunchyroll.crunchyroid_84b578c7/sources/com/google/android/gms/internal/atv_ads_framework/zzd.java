package com.google.android.gms.internal.atv_ads_framework;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import com.amazon.aps.iva.e3.a;
/* compiled from: com.google.android.tv:tv-ads@@1.0.0-alpha02 */
/* loaded from: classes3.dex */
public final class zzd {
    public static final zza zza(Context context) {
        zza zzaVar = zza.UNKNOWN;
        if (context.getPackageManager().hasSystemFeature("com.google.android.tv.custom_launcher")) {
            return zza.CUSTOM;
        }
        if (context.getPackageManager().hasSystemFeature("com.google.android.feature.AMATI_EXPERIENCE")) {
            return zza.LAUNCHER_X;
        }
        if (!context.getPackageManager().hasSystemFeature("android.software.leanback")) {
            return zzaVar;
        }
        return zza.TV_LAUNCHER;
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x00a5, code lost:
        if (r2 != 2) goto L33;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0059 A[EDGE_INSN: B:69:0x0059->B:20:0x0059 ?: BREAK  , SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final com.google.android.gms.internal.atv_ads_framework.zzae zzb(android.content.Context r14) {
        /*
            Method dump skipped, instructions count: 345
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.atv_ads_framework.zzd.zzb(android.content.Context):com.google.android.gms.internal.atv_ads_framework.zzae");
    }

    private static void zzc(zzad zzadVar, Context context, String str, String str2) {
        try {
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo(str, 0);
            if (packageInfo != null) {
                zzadVar.zza(str2, Long.toString(a.a(packageInfo)));
            }
        } catch (PackageManager.NameNotFoundException unused) {
        }
    }
}
