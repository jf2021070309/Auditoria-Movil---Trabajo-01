package com.google.android.gms.internal.p001authapi;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.auth.api.identity.BeginSignInResult;
import com.google.android.gms.common.api.Status;
/* renamed from: com.google.android.gms.internal.auth-api.zbx  reason: invalid package */
/* loaded from: classes.dex */
public abstract class zbx extends zbb implements zby {
    public zbx() {
        super("com.google.android.gms.auth.api.identity.internal.IBeginSignInCallback");
    }

    @Override // com.google.android.gms.internal.p001authapi.zbb
    public final boolean zba(int i2, Parcel parcel, Parcel parcel2, int i3) throws RemoteException {
        if (i2 == 1) {
            zbb((Status) zbc.zba(parcel, Status.CREATOR), (BeginSignInResult) zbc.zba(parcel, BeginSignInResult.CREATOR));
            return true;
        }
        return false;
    }
}
