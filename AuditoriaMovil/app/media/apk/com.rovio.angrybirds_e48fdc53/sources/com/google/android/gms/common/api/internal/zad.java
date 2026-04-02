package com.google.android.gms.common.api.internal;

import android.os.DeadObjectException;
import android.os.RemoteException;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.GoogleApiManager;
import com.google.android.gms.tasks.TaskCompletionSource;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public abstract class zad<T> extends zac {
    protected final TaskCompletionSource<T> zacm;

    public zad(int i, TaskCompletionSource<T> taskCompletionSource) {
        super(i);
        this.zacm = taskCompletionSource;
    }

    protected abstract void zad(GoogleApiManager.zaa<?> zaaVar);

    @Override // com.google.android.gms.common.api.internal.zab
    public void zaa(Status status) {
        this.zacm.trySetException(new ApiException(status));
    }

    @Override // com.google.android.gms.common.api.internal.zab
    public void zaa(RuntimeException runtimeException) {
        this.zacm.trySetException(runtimeException);
    }

    @Override // com.google.android.gms.common.api.internal.zab
    public void zaa(zaab zaabVar, boolean z) {
    }

    @Override // com.google.android.gms.common.api.internal.zab
    public final void zaa(GoogleApiManager.zaa<?> zaaVar) {
        Status zaa;
        Status zaa2;
        try {
            zad(zaaVar);
        } catch (DeadObjectException e) {
            zaa2 = zab.zaa(e);
            zaa(zaa2);
            throw e;
        } catch (RemoteException e2) {
            zaa = zab.zaa(e2);
            zaa(zaa);
        } catch (RuntimeException e3) {
            zaa(e3);
        }
    }
}
