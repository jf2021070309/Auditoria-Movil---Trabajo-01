package com.google.android.gms.cast.internal;
/* compiled from: com.google.android.gms:play-services-cast@@21.4.0 */
/* loaded from: classes2.dex */
final class zzs implements Runnable {
    final /* synthetic */ zzw zza;
    final /* synthetic */ zzab zzb;

    public zzs(zzv zzvVar, zzw zzwVar, zzab zzabVar) {
        this.zza = zzwVar;
        this.zzb = zzabVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzw.zzI(this.zza, this.zzb);
    }
}
