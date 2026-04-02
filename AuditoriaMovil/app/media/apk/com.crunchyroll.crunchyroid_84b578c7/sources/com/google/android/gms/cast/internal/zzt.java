package com.google.android.gms.cast.internal;
/* compiled from: com.google.android.gms:play-services-cast@@21.4.0 */
/* loaded from: classes2.dex */
final class zzt implements Runnable {
    final /* synthetic */ zzw zza;
    final /* synthetic */ zza zzb;

    public zzt(zzv zzvVar, zzw zzwVar, zza zzaVar) {
        this.zza = zzwVar;
        this.zzb = zzaVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzw.zzH(this.zza, this.zzb);
    }
}
