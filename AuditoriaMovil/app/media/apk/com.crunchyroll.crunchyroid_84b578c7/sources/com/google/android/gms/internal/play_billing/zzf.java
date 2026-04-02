package com.google.android.gms.internal.play_billing;

import android.os.BadParcelableException;
import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;
import com.amazon.aps.iva.q.c0;
/* compiled from: com.android.billingclient:billing@@6.0.1 */
/* loaded from: classes3.dex */
public abstract class zzf extends zzi implements zzg {
    public zzf() {
        super("com.android.vending.billing.IInAppBillingServiceCallback");
    }

    @Override // com.google.android.gms.internal.play_billing.zzi
    public final boolean zzb(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i == 1) {
            Bundle bundle = (Bundle) zzj.zza(parcel, Bundle.CREATOR);
            int dataAvail = parcel.dataAvail();
            if (dataAvail <= 0) {
                zza(bundle);
                parcel2.writeNoException();
                return true;
            }
            throw new BadParcelableException(c0.a("Parcel data not fully consumed, unread size: ", dataAvail));
        }
        return false;
    }
}
