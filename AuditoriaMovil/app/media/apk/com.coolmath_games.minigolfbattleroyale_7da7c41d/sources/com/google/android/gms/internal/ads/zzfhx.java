package com.google.android.gms.internal.ads;

import java.util.ArrayDeque;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
/* compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* loaded from: classes2.dex */
public final class zzfhx {
    private final ArrayDeque<zzfhw> zzc = new ArrayDeque<>();
    private zzfhw zzd = null;
    private final BlockingQueue<Runnable> zza = new LinkedBlockingQueue();
    private final ThreadPoolExecutor zzb = new ThreadPoolExecutor(1, 1, 1, TimeUnit.SECONDS, this.zza);

    private final void zzc() {
        zzfhw poll = this.zzc.poll();
        this.zzd = poll;
        if (poll != null) {
            poll.executeOnExecutor(this.zzb, new Object[0]);
        }
    }

    public final void zza(zzfhw zzfhwVar) {
        zzfhwVar.zzb(this);
        this.zzc.add(zzfhwVar);
        if (this.zzd == null) {
            zzc();
        }
    }

    public final void zzb(zzfhw zzfhwVar) {
        this.zzd = null;
        zzc();
    }
}
