package com.google.ads.interactivemedia.v3.internal;

import java.util.concurrent.Callable;
import java.util.concurrent.Executors;
import java.util.concurrent.RunnableFuture;
/* compiled from: com.google.ads.interactivemedia.v3:interactivemedia@@3.30.3 */
/* loaded from: classes2.dex */
final class zzvz extends zzuu implements RunnableFuture {
    private volatile zzvp zza;

    public zzvz(Callable callable) {
        this.zza = new zzvy(this, callable);
    }

    public static zzvz zzp(Runnable runnable, Object obj) {
        return new zzvz(Executors.callable(runnable, obj));
    }

    @Override // java.util.concurrent.RunnableFuture, java.lang.Runnable
    public final void run() {
        zzvp zzvpVar = this.zza;
        if (zzvpVar != null) {
            zzvpVar.run();
        }
        this.zza = null;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzub
    public final String zza() {
        zzvp zzvpVar = this.zza;
        if (zzvpVar != null) {
            return e.e("task=[", zzvpVar.toString(), "]");
        }
        return super.zza();
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzub
    public final void zzb() {
        zzvp zzvpVar;
        if (zzo() && (zzvpVar = this.zza) != null) {
            zzvpVar.zzh();
        }
        this.zza = null;
    }
}
