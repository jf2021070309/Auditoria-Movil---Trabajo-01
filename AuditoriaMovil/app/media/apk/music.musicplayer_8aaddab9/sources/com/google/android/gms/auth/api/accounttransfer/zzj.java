package com.google.android.gms.auth.api.accounttransfer;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.auth.zzan;
import com.google.android.gms.tasks.TaskCompletionSource;
/* loaded from: classes.dex */
public class zzj<T> extends zzan {
    public final zzk<T> zzb;

    public zzj(zzk<T> zzkVar) {
        this.zzb = zzkVar;
    }

    @Override // com.google.android.gms.internal.auth.zzan, com.google.android.gms.internal.auth.zzat
    public final void zzd(Status status) {
        TaskCompletionSource<T> taskCompletionSource = this.zzb.zzb;
        int i2 = AccountTransferClient.zza;
        taskCompletionSource.setException(new AccountTransferException(status));
    }
}
