package com.google.android.gms.auth.api.signin.internal;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.ads.mediation.facebook.FacebookMediationAdapter;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.api.Status;
/* loaded from: classes.dex */
public abstract class zbq extends com.google.android.gms.internal.p001authapi.zbb implements zbr {
    public zbq() {
        super("com.google.android.gms.auth.api.signin.internal.ISignInCallbacks");
    }

    @Override // com.google.android.gms.internal.p001authapi.zbb
    public final boolean zba(int i2, Parcel parcel, Parcel parcel2, int i3) throws RemoteException {
        switch (i2) {
            case 101:
                zbd((GoogleSignInAccount) com.google.android.gms.internal.p001authapi.zbc.zba(parcel, GoogleSignInAccount.CREATOR), (Status) com.google.android.gms.internal.p001authapi.zbc.zba(parcel, Status.CREATOR));
                break;
            case FacebookMediationAdapter.ERROR_BANNER_SIZE_MISMATCH /* 102 */:
                zbc((Status) com.google.android.gms.internal.p001authapi.zbc.zba(parcel, Status.CREATOR));
                break;
            case FacebookMediationAdapter.ERROR_REQUIRES_ACTIVITY_CONTEXT /* 103 */:
                zbb((Status) com.google.android.gms.internal.p001authapi.zbc.zba(parcel, Status.CREATOR));
                break;
            default:
                return false;
        }
        parcel2.writeNoException();
        return true;
    }
}
