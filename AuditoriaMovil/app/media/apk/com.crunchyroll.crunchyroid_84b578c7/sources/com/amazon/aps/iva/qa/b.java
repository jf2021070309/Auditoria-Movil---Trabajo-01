package com.amazon.aps.iva.qa;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
/* compiled from: IMessageListener.java */
/* loaded from: classes.dex */
public abstract class b extends Binder implements IInterface {
    public b() {
        attachInterface(this, "com.amazon.aiondec.api.IMessageListener");
    }

    @Override // android.os.Binder
    public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i != 1598968902) {
            if (i != 1) {
                return super.onTransact(i, parcel, parcel2, i2);
            }
            parcel.enforceInterface("com.amazon.aiondec.api.IMessageListener");
            ((com.amazon.aps.iva.za.a) this).a.a(parcel.readString());
            return true;
        }
        parcel2.writeString("com.amazon.aiondec.api.IMessageListener");
        return true;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this;
    }
}
