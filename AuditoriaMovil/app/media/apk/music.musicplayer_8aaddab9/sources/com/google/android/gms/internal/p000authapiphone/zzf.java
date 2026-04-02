package com.google.android.gms.internal.p000authapiphone;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
/* renamed from: com.google.android.gms.internal.auth-api-phone.zzf  reason: invalid package */
/* loaded from: classes.dex */
public abstract class zzf extends zzb implements zzg {
    public zzf() {
        super("com.google.android.gms.auth.api.phone.internal.IOngoingSmsRequestCallback");
    }

    @Override // com.google.android.gms.internal.p000authapiphone.zzb
    public final boolean zza(int i2, Parcel parcel, Parcel parcel2, int i3) throws RemoteException {
        if (i2 == 1) {
            zzb((Status) zzc.zza(parcel, Status.CREATOR), zzc.zzc(parcel));
            return true;
        }
        return false;
    }
}
