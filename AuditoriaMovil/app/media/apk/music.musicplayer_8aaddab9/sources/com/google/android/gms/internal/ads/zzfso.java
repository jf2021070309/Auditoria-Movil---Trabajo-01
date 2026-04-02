package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
/* loaded from: classes.dex */
public final class zzfso implements Executor {
    public final /* synthetic */ Executor zza;
    public final /* synthetic */ zzfqw zzb;

    public zzfso(Executor executor, zzfqw zzfqwVar) {
        this.zza = executor;
        this.zzb = zzfqwVar;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        try {
            this.zza.execute(runnable);
        } catch (RejectedExecutionException e2) {
            this.zzb.zzq(e2);
        }
    }
}
