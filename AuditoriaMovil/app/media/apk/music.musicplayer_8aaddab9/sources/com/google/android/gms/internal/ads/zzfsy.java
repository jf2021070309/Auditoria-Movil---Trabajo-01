package com.google.android.gms.internal.ads;

import e.a.d.a.a;
import java.util.Objects;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import javax.annotation.CheckForNull;
/* loaded from: classes.dex */
public final class zzfsy<V> extends zzfrt<V> {
    @CheckForNull
    private zzfsm<V> zza;
    @CheckForNull
    private ScheduledFuture<?> zzb;

    private zzfsy(zzfsm<V> zzfsmVar) {
        Objects.requireNonNull(zzfsmVar);
        this.zza = zzfsmVar;
    }

    public static /* synthetic */ ScheduledFuture zzx(zzfsy zzfsyVar, ScheduledFuture scheduledFuture) {
        zzfsyVar.zzb = null;
        return null;
    }

    public static <V> zzfsm<V> zzy(zzfsm<V> zzfsmVar, long j2, TimeUnit timeUnit, ScheduledExecutorService scheduledExecutorService) {
        zzfsy zzfsyVar = new zzfsy(zzfsmVar);
        zzfsv zzfsvVar = new zzfsv(zzfsyVar);
        zzfsyVar.zzb = scheduledExecutorService.schedule(zzfsvVar, j2, timeUnit);
        zzfsmVar.zze(zzfsvVar, zzfrr.INSTANCE);
        return zzfsyVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfqw
    @CheckForNull
    public final String zzc() {
        zzfsm<V> zzfsmVar = this.zza;
        ScheduledFuture<?> scheduledFuture = this.zzb;
        if (zzfsmVar != null) {
            String obj = zzfsmVar.toString();
            String s = a.s(new StringBuilder(obj.length() + 14), "inputFuture=[", obj, "]");
            if (scheduledFuture != null) {
                long delay = scheduledFuture.getDelay(TimeUnit.MILLISECONDS);
                if (delay > 0) {
                    StringBuilder sb = new StringBuilder(s.length() + 43);
                    sb.append(s);
                    sb.append(", remaining delay=[");
                    sb.append(delay);
                    sb.append(" ms]");
                    return sb.toString();
                }
                return s;
            }
            return s;
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzfqw
    public final void zzd() {
        zzv(this.zza);
        ScheduledFuture<?> scheduledFuture = this.zzb;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(false);
        }
        this.zza = null;
        this.zzb = null;
    }
}
