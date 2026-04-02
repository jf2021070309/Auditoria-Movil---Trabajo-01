package com.google.android.gms.internal.measurement;

import android.os.RemoteException;
import com.google.android.gms.common.internal.Preconditions;
/* loaded from: classes2.dex */
public final class zzcw extends zzdt {
    public final /* synthetic */ long zza;
    public final /* synthetic */ zzee zzb;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzcw(zzee zzeeVar, long j2) {
        super(zzeeVar, true);
        this.zzb = zzeeVar;
        this.zza = j2;
    }

    @Override // com.google.android.gms.internal.measurement.zzdt
    public final void zza() throws RemoteException {
        zzcc zzccVar;
        zzccVar = this.zzb.zzj;
        ((zzcc) Preconditions.checkNotNull(zzccVar)).setSessionTimeoutDuration(this.zza);
    }
}
