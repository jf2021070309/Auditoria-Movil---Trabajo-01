package com.google.android.gms.internal.measurement;

import android.os.RemoteException;
import com.google.android.gms.common.internal.Preconditions;
/* loaded from: classes2.dex */
public final class zzdl extends zzdt {
    public final /* synthetic */ zzbz zza;
    public final /* synthetic */ int zzb;
    public final /* synthetic */ zzee zzc;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzdl(zzee zzeeVar, zzbz zzbzVar, int i2) {
        super(zzeeVar, true);
        this.zzc = zzeeVar;
        this.zza = zzbzVar;
        this.zzb = i2;
    }

    @Override // com.google.android.gms.internal.measurement.zzdt
    public final void zza() throws RemoteException {
        zzcc zzccVar;
        zzccVar = this.zzc.zzj;
        ((zzcc) Preconditions.checkNotNull(zzccVar)).getTestFlag(this.zza, this.zzb);
    }

    @Override // com.google.android.gms.internal.measurement.zzdt
    public final void zzb() {
        this.zza.zzd(null);
    }
}
