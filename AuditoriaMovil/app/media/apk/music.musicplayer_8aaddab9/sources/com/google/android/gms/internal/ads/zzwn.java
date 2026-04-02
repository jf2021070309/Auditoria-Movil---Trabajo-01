package com.google.android.gms.internal.ads;

import android.os.SystemClock;
import java.util.ArrayList;
import java.util.List;
/* loaded from: classes.dex */
public final class zzwn {
    public static final boolean zza = zzwo.zzb;
    private final List<zzwm> zzb = new ArrayList();
    private boolean zzc = false;

    public final void finalize() throws Throwable {
        if (this.zzc) {
            return;
        }
        zzb("Request on the loose");
        zzwo.zzc("Marker log finalized without finish() - uncaught exit point for request", new Object[0]);
    }

    public final synchronized void zza(String str, long j2) {
        if (this.zzc) {
            throw new IllegalStateException("Marker added to finished log");
        }
        this.zzb.add(new zzwm(str, j2, SystemClock.elapsedRealtime()));
    }

    public final synchronized void zzb(String str) {
        List<zzwm> list;
        long j2;
        this.zzc = true;
        if (this.zzb.size() == 0) {
            j2 = 0;
        } else {
            j2 = this.zzb.get(list.size() - 1).zzc - this.zzb.get(0).zzc;
        }
        if (j2 <= 0) {
            return;
        }
        long j3 = this.zzb.get(0).zzc;
        zzwo.zzb("(%-4d ms) %s", Long.valueOf(j2), str);
        for (zzwm zzwmVar : this.zzb) {
            long j4 = zzwmVar.zzc;
            zzwo.zzb("(+%-4d) [%2d] %s", Long.valueOf(j4 - j3), Long.valueOf(zzwmVar.zzb), zzwmVar.zza);
            j3 = j4;
        }
    }
}
