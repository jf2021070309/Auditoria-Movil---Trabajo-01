package com.google.android.gms.auth.api.accounttransfer;

import android.os.RemoteException;
import com.google.android.gms.internal.auth.zzau;
import com.google.android.gms.internal.auth.zzbb;
/* loaded from: classes.dex */
public final class zzh extends zzm {
    public final /* synthetic */ zzbb zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzh(AccountTransferClient accountTransferClient, int i2, zzbb zzbbVar) {
        super(1609);
        this.zza = zzbbVar;
    }

    @Override // com.google.android.gms.auth.api.accounttransfer.zzk
    public final void zza(zzau zzauVar) throws RemoteException {
        zzauVar.zze(this.zzc, this.zza);
    }
}
