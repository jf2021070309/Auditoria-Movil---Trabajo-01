package com.google.android.gms.internal.cast;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-cast-framework@@21.4.0 */
/* loaded from: classes3.dex */
public final class zzef extends zzek {
    final /* synthetic */ zzeg zza;

    public zzef(zzeg zzegVar) {
        this.zza = zzegVar;
    }

    @Override // com.google.android.gms.internal.cast.zzek
    public final void zza(long j) {
        int i;
        zzeg zzegVar = this.zza;
        i = zzegVar.zzc;
        zzegVar.zzc = i + 1;
        zzeg zzegVar2 = this.zza;
        if (!zzegVar2.zza(zzegVar2.zza) && !this.zza.zza.isStarted()) {
            zzeg zzegVar3 = this.zza;
            if (!zzeg.zze(zzegVar3)) {
                zzegVar3.zza.start();
            }
        }
    }
}
