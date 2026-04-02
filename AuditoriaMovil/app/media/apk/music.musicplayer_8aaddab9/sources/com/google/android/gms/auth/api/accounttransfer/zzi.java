package com.google.android.gms.auth.api.accounttransfer;

import android.os.RemoteException;
import com.google.android.gms.internal.auth.zzau;
import com.google.android.gms.internal.auth.zzav;
/* loaded from: classes.dex */
public final class zzi extends zzm {
    public final /* synthetic */ zzav zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzi(AccountTransferClient accountTransferClient, int i2, zzav zzavVar) {
        super(1610);
        this.zza = zzavVar;
    }

    @Override // com.google.android.gms.auth.api.accounttransfer.zzk
    public final void zza(zzau zzauVar) throws RemoteException {
        zzauVar.zzf(this.zzc, this.zza);
    }
}
