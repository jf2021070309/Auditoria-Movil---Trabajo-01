package com.google.android.gms.internal.ads;

import java.util.concurrent.BlockingQueue;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* loaded from: classes2.dex */
public final class zzvn implements Runnable {
    final /* synthetic */ zzwc zza;
    final /* synthetic */ zzvo zzb;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzvn(zzvo zzvoVar, zzwc zzwcVar) {
        this.zzb = zzvoVar;
        this.zza = zzwcVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        BlockingQueue blockingQueue;
        try {
            blockingQueue = this.zzb.zzc;
            blockingQueue.put(this.zza);
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
        }
    }
}
