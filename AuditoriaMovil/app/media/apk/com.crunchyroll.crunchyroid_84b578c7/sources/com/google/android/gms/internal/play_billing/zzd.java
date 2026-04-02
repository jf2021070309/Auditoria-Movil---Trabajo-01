package com.google.android.gms.internal.play_billing;

import android.os.IBinder;
import android.os.IInterface;
/* compiled from: com.android.billingclient:billing@@6.0.1 */
/* loaded from: classes3.dex */
public abstract class zzd extends zzi implements zze {
    public static zze zzn(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.android.vending.billing.IInAppBillingService");
        if (queryLocalInterface instanceof zze) {
            return (zze) queryLocalInterface;
        }
        return new zzc(iBinder);
    }
}
