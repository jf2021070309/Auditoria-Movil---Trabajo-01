package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* loaded from: classes2.dex */
public final class zzfta extends zzfsl {
    final /* synthetic */ zzftb zza;
    private final Callable zzb;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzfta(zzftb zzftbVar, Callable callable) {
        this.zza = zzftbVar;
        if (callable == null) {
            throw null;
        }
        this.zzb = callable;
    }

    @Override // com.google.android.gms.internal.ads.zzfsl
    final Object zza() throws Exception {
        return this.zzb.call();
    }

    @Override // com.google.android.gms.internal.ads.zzfsl
    final String zzc() {
        return this.zzb.toString();
    }

    @Override // com.google.android.gms.internal.ads.zzfsl
    final boolean zzd() {
        return this.zza.isDone();
    }

    @Override // com.google.android.gms.internal.ads.zzfsl
    final void zzf(Object obj) {
        this.zza.zzp(obj);
    }

    @Override // com.google.android.gms.internal.ads.zzfsl
    final void zzg(Throwable th) {
        this.zza.zzq(th);
    }
}
