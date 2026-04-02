package com.google.android.gms.internal.ads;

import android.os.SystemClock;
import java.util.ArrayList;
import java.util.List;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* loaded from: classes2.dex */
public final class zzwn {
    public static final boolean zza = zzwo.zzb;
    private final List<zzwm> zzb = new ArrayList();
    private boolean zzc = false;

    protected final void finalize() throws Throwable {
        if (this.zzc) {
            return;
        }
        zzb("Request on the loose");
        zzwo.zzc("Marker log finalized without finish() - uncaught exit point for request", new Object[0]);
    }

    public final synchronized void zza(String str, long j) {
        if (this.zzc) {
            throw new IllegalStateException("Marker added to finished log");
        }
        this.zzb.add(new zzwm(str, j, SystemClock.elapsedRealtime()));
    }

    public final synchronized void zzb(String str) {
        List<zzwm> list;
        long j;
        this.zzc = true;
        if (this.zzb.size() == 0) {
            j = 0;
        } else {
            j = this.zzb.get(list.size() - 1).zzc - this.zzb.get(0).zzc;
        }
        if (j <= 0) {
            return;
        }
        long j2 = this.zzb.get(0).zzc;
        zzwo.zzb("(%-4d ms) %s", Long.valueOf(j), str);
        for (zzwm zzwmVar : this.zzb) {
            long j3 = zzwmVar.zzc;
            zzwo.zzb("(+%-4d) [%2d] %s", Long.valueOf(j3 - j2), Long.valueOf(zzwmVar.zzb), zzwmVar.zza);
            j2 = j3;
        }
    }
}
