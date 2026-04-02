package com.google.android.gms.auth.api.signin.internal;

import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
/* loaded from: classes.dex */
public final class zbh extends zba {
    public final /* synthetic */ zbi zba;

    public zbh(zbi zbiVar) {
        this.zba = zbiVar;
    }

    @Override // com.google.android.gms.auth.api.signin.internal.zba, com.google.android.gms.auth.api.signin.internal.zbr
    public final void zbc(Status status) throws RemoteException {
        this.zba.setResult((zbi) status);
    }
}
