package com.google.android.gms.auth.api.accounttransfer;

import android.os.RemoteException;
import com.google.android.gms.internal.auth.zzau;
import com.google.android.gms.internal.auth.zzax;
/* loaded from: classes.dex */
public final class zze extends zzk<byte[]> {
    public final /* synthetic */ zzax zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zze(AccountTransferClient accountTransferClient, int i2, zzax zzaxVar) {
        super(1607, null);
        this.zza = zzaxVar;
    }

    @Override // com.google.android.gms.auth.api.accounttransfer.zzk
    public final void zza(zzau zzauVar) throws RemoteException {
        zzauVar.zzg(new zzd(this, this), this.zza);
    }
}
