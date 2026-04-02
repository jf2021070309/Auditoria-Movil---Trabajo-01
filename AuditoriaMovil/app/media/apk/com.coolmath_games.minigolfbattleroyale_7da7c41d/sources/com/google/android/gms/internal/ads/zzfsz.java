package com.google.android.gms.internal.ads;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* loaded from: classes2.dex */
public final class zzfsz extends zzfsl<zzfsm> {
    final /* synthetic */ zzftb zza;
    private final zzfrj zzb;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzfsz(zzftb zzftbVar, zzfrj zzfrjVar) {
        this.zza = zzftbVar;
        if (zzfrjVar == null) {
            throw null;
        }
        this.zzb = zzfrjVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfsl
    final /* bridge */ /* synthetic */ zzfsm zza() throws Exception {
        zzfsm zza = this.zzb.zza();
        zzflx.zzd(zza, "AsyncCallable.call returned null instead of a Future. Did you mean to return immediateFuture(null)? %s", this.zzb);
        return zza;
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
    final /* bridge */ /* synthetic */ void zzf(zzfsm zzfsmVar) {
        this.zza.zzr(zzfsmVar);
    }

    @Override // com.google.android.gms.internal.ads.zzfsl
    final void zzg(Throwable th) {
        this.zza.zzq(th);
    }
}
