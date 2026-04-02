package com.google.android.gms.internal.games;

import android.os.RemoteException;
import com.google.android.gms.common.api.internal.TaskApiCall;
import com.google.android.gms.tasks.TaskCompletionSource;
/* compiled from: com.google.android.gms:play-services-games@@21.0.0 */
/* loaded from: classes2.dex */
public abstract class zzbe<TResult> extends TaskApiCall<com.google.android.gms.games.internal.zzf, TResult> {
    protected abstract void zzb(com.google.android.gms.games.internal.zzf zzfVar, TaskCompletionSource<TResult> taskCompletionSource) throws RemoteException;

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.common.api.internal.TaskApiCall
    public /* synthetic */ void doExecute(com.google.android.gms.games.internal.zzf zzfVar, TaskCompletionSource taskCompletionSource) throws RemoteException {
        try {
            zzb(zzfVar, taskCompletionSource);
        } catch (RemoteException | SecurityException e) {
            taskCompletionSource.trySetException(e);
        }
    }
}
