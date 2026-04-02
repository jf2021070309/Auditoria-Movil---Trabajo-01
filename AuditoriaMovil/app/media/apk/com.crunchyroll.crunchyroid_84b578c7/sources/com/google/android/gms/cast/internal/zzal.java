package com.google.android.gms.cast.internal;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-cast@@21.4.0 */
/* loaded from: classes2.dex */
public final class zzal implements zzas {
    final /* synthetic */ zzas zza;
    final /* synthetic */ zzaq zzb;

    public zzal(zzaq zzaqVar, zzas zzasVar) {
        this.zzb = zzaqVar;
        this.zza = zzasVar;
    }

    @Override // com.google.android.gms.cast.internal.zzas
    public final void zza(String str, long j, int i, Object obj, long j2, long j3) {
        this.zzb.zzx = null;
        zzas zzasVar = this.zza;
        if (zzasVar != null) {
            zzasVar.zza(str, j, i, obj, j2, j3);
        }
    }

    @Override // com.google.android.gms.cast.internal.zzas
    public final void zzb(String str, long j, long j2, long j3) {
        zzas zzasVar = this.zza;
        if (zzasVar != null) {
            zzasVar.zzb(str, j, j2, j3);
        }
    }
}
