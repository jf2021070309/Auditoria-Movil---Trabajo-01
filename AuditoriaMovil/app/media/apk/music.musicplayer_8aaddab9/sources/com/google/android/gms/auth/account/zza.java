package com.google.android.gms.auth.account;

import android.accounts.Account;
import android.os.Parcel;
import android.os.RemoteException;
/* loaded from: classes.dex */
public abstract class zza extends com.google.android.gms.internal.auth.zzb implements zzb {
    public zza() {
        super("com.google.android.gms.auth.account.IWorkAccountCallback");
    }

    @Override // com.google.android.gms.internal.auth.zzb
    public final boolean zza(int i2, Parcel parcel, Parcel parcel2, int i3) throws RemoteException {
        if (i2 == 1) {
            zzb((Account) com.google.android.gms.internal.auth.zzc.zza(parcel, Account.CREATOR));
        } else if (i2 != 2) {
            return false;
        } else {
            zzc(com.google.android.gms.internal.auth.zzc.zze(parcel));
        }
        return true;
    }
}
