package com.google.android.gms.auth.api.accounttransfer;

import android.os.RemoteException;
import com.google.android.gms.common.api.internal.TaskApiCall;
import com.google.android.gms.internal.auth.zzap;
import com.google.android.gms.internal.auth.zzau;
import com.google.android.gms.tasks.TaskCompletionSource;
/* loaded from: classes.dex */
public abstract class zzk<T> extends TaskApiCall<zzap, T> {
    public TaskCompletionSource<T> zzb;

    public /* synthetic */ zzk(int i2, zzb zzbVar) {
        super(null, false, i2);
    }

    @Override // com.google.android.gms.common.api.internal.TaskApiCall
    public final /* bridge */ /* synthetic */ void doExecute(zzap zzapVar, TaskCompletionSource taskCompletionSource) throws RemoteException {
        this.zzb = taskCompletionSource;
        zza((zzau) zzapVar.getService());
    }

    public abstract void zza(zzau zzauVar) throws RemoteException;
}
