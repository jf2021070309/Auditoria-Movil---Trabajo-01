package com.amazon.aps.iva.db;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.amazon.aps.iva.oa0.e0;
/* compiled from: ILicenseResultListener.java */
/* loaded from: classes.dex */
public abstract class a extends Binder implements IInterface {
    public a() {
        attachInterface(this, "com.android.vending.licensing.ILicenseResultListener");
    }

    @Override // android.os.Binder
    public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i != 1) {
            if (i != 1598968902) {
                return super.onTransact(i, parcel, parcel2, i2);
            }
            parcel2.writeString("com.android.vending.licensing.ILicenseResultListener");
            return true;
        }
        parcel.enforceInterface("com.android.vending.licensing.ILicenseResultListener");
        e0.this.d.a(parcel.readInt(), parcel.readString(), parcel.readString());
        return true;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this;
    }
}
