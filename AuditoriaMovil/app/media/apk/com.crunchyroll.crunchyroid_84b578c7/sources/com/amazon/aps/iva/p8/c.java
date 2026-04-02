package com.amazon.aps.iva.p8;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
/* compiled from: IMultiInstanceInvalidationCallback.java */
/* loaded from: classes.dex */
public final class c implements d {
    public final IBinder a;

    public c(IBinder iBinder) {
        this.a = iBinder;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.a;
    }

    @Override // com.amazon.aps.iva.p8.d
    public final void e(String[] strArr) throws RemoteException {
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("androidx.room.IMultiInstanceInvalidationCallback");
            obtain.writeStringArray(strArr);
            this.a.transact(1, obtain, null, 1);
        } finally {
            obtain.recycle();
        }
    }
}
