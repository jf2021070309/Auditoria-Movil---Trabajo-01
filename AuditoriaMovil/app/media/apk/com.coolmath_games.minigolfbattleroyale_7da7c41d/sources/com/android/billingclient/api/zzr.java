package com.android.billingclient.api;

import java.util.concurrent.Future;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.android.billingclient:billing@@3.0.3 */
/* loaded from: classes.dex */
public final class zzr implements Runnable {
    final /* synthetic */ Future zza;
    final /* synthetic */ Runnable zzb;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzr(BillingClientImpl billingClientImpl, Future future, Runnable runnable) {
        this.zza = future;
        this.zzb = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.zza.isDone() || this.zza.isCancelled()) {
            return;
        }
        this.zza.cancel(true);
        com.google.android.gms.internal.play_billing.zza.zzb("BillingClient", "Async task is taking too long, cancel it!");
        Runnable runnable = this.zzb;
        if (runnable != null) {
            runnable.run();
        }
    }
}
