package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
/* compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* loaded from: classes2.dex */
final class zzfso implements Executor {
    final /* synthetic */ Executor zza;
    final /* synthetic */ zzfqw zzb;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzfso(Executor executor, zzfqw zzfqwVar) {
        this.zza = executor;
        this.zzb = zzfqwVar;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        try {
            this.zza.execute(runnable);
        } catch (RejectedExecutionException e) {
            this.zzb.zzq(e);
        }
    }
}
