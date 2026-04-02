package com.google.android.gms.auth.api.accounttransfer;
/* loaded from: classes.dex */
public final class zzf extends zzj<DeviceMetaData> {
    public final /* synthetic */ zzg zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzf(zzg zzgVar, zzk zzkVar) {
        super(zzkVar);
        this.zza = zzgVar;
    }

    @Override // com.google.android.gms.internal.auth.zzan, com.google.android.gms.internal.auth.zzat
    public final void zzc(DeviceMetaData deviceMetaData) {
        this.zza.zzb.setResult(deviceMetaData);
    }
}
