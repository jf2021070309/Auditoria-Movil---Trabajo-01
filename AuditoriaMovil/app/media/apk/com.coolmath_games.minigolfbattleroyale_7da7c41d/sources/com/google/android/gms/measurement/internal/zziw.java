package com.google.android.gms.measurement.internal;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@19.0.0 */
/* loaded from: classes2.dex */
public final class zziw extends zzal {
    final /* synthetic */ zzjk zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zziw(zzjk zzjkVar, zzgp zzgpVar) {
        super(zzgpVar);
        this.zza = zzjkVar;
    }

    @Override // com.google.android.gms.measurement.internal.zzal
    public final void zza() {
        this.zza.zzs.zzau().zze().zza("Tasks have been queued for a long time");
    }
}
