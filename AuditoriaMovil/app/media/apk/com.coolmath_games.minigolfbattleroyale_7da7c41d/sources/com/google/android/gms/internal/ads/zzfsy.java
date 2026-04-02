package com.google.android.gms.internal.ads;

import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import javax.annotation.CheckForNull;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* loaded from: classes2.dex */
public final class zzfsy<V> extends zzfrt<V> {
    @CheckForNull
    private zzfsm<V> zza;
    @CheckForNull
    private ScheduledFuture<?> zzb;

    private zzfsy(zzfsm<V> zzfsmVar) {
        if (zzfsmVar == null) {
            throw null;
        }
        this.zza = zzfsmVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ ScheduledFuture zzx(zzfsy zzfsyVar, ScheduledFuture scheduledFuture) {
        zzfsyVar.zzb = null;
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static <V> zzfsm<V> zzy(zzfsm<V> zzfsmVar, long j, TimeUnit timeUnit, ScheduledExecutorService scheduledExecutorService) {
        zzfsy zzfsyVar = new zzfsy(zzfsmVar);
        zzfsv zzfsvVar = new zzfsv(zzfsyVar);
        zzfsyVar.zzb = scheduledExecutorService.schedule(zzfsvVar, j, timeUnit);
        zzfsmVar.zze(zzfsvVar, zzfrr.INSTANCE);
        return zzfsyVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.zzfqw
    @CheckForNull
    public final String zzc() {
        zzfsm<V> zzfsmVar = this.zza;
        ScheduledFuture<?> scheduledFuture = this.zzb;
        if (zzfsmVar != null) {
            String obj = zzfsmVar.toString();
            StringBuilder sb = new StringBuilder(obj.length() + 14);
            sb.append("inputFuture=[");
            sb.append(obj);
            sb.append("]");
            String sb2 = sb.toString();
            if (scheduledFuture != null) {
                long delay = scheduledFuture.getDelay(TimeUnit.MILLISECONDS);
                if (delay > 0) {
                    StringBuilder sb3 = new StringBuilder(sb2.length() + 43);
                    sb3.append(sb2);
                    sb3.append(", remaining delay=[");
                    sb3.append(delay);
                    sb3.append(" ms]");
                    return sb3.toString();
                }
                return sb2;
            }
            return sb2;
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzfqw
    protected final void zzd() {
        zzv(this.zza);
        ScheduledFuture<?> scheduledFuture = this.zzb;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(false);
        }
        this.zza = null;
        this.zzb = null;
    }
}
