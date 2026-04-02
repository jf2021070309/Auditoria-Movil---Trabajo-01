package com.google.android.gms.internal.ads;

import android.os.Trace;
/* compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* loaded from: classes2.dex */
public final class zzamo {
    public static void zza(String str) {
        if (zzamq.zza >= 18) {
            Trace.beginSection(str);
        }
    }

    public static void zzb() {
        if (zzamq.zza >= 18) {
            Trace.endSection();
        }
    }
}
