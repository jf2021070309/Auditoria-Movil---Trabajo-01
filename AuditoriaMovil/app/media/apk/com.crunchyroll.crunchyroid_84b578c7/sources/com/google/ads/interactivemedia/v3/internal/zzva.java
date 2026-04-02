package com.google.ads.interactivemedia.v3.internal;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.ads.interactivemedia.v3:interactivemedia@@3.30.3 */
/* loaded from: classes2.dex */
public final class zzva implements Runnable {
    final Future zza;
    final zzuz zzb;

    public zzva(Future future, zzuz zzuzVar) {
        this.zza = future;
        this.zzb = zzuzVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Throwable zza;
        Future future = this.zza;
        if ((future instanceof zzwb) && (zza = zzwc.zza((zzwb) future)) != null) {
            this.zzb.zza(zza);
            return;
        }
        try {
            this.zzb.zzb(zzvd.zzc(this.zza));
        } catch (Error e) {
            e = e;
            this.zzb.zza(e);
        } catch (RuntimeException e2) {
            e = e2;
            this.zzb.zza(e);
        } catch (ExecutionException e3) {
            this.zzb.zza(e3.getCause());
        }
    }

    public final String toString() {
        zzrg zza = zzrh.zza(this);
        zza.zza(this.zzb);
        return zza.toString();
    }
}
