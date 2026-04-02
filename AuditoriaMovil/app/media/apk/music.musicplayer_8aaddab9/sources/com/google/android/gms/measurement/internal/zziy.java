package com.google.android.gms.measurement.internal;
/* loaded from: classes2.dex */
public final class zziy extends zzam {
    public final /* synthetic */ zzjo zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zziy(zzjo zzjoVar, zzgq zzgqVar) {
        super(zzgqVar);
        this.zza = zzjoVar;
    }

    @Override // com.google.android.gms.measurement.internal.zzam
    public final void zzc() {
        zzjo zzjoVar = this.zza;
        zzjoVar.zzg();
        if (zzjoVar.zzL()) {
            zzjoVar.zzs.zzay().zzj().zza("Inactivity, disconnecting from the service");
            zzjoVar.zzs();
        }
    }
}
