package com.amazon.aps.iva.p8;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import androidx.room.MultiInstanceInvalidationService;
/* compiled from: IMultiInstanceInvalidationService.java */
/* loaded from: classes.dex */
public abstract class e extends Binder implements IInterface {
    public e() {
        attachInterface(this, "androidx.room.IMultiInstanceInvalidationService");
    }

    @Override // android.os.Binder
    public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        d dVar = null;
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i != 1598968902) {
                        return super.onTransact(i, parcel, parcel2, i2);
                    }
                    parcel2.writeString("androidx.room.IMultiInstanceInvalidationService");
                    return true;
                }
                parcel.enforceInterface("androidx.room.IMultiInstanceInvalidationService");
                MultiInstanceInvalidationService.b bVar = (MultiInstanceInvalidationService.b) this;
                bVar.o0(parcel.createStringArray(), parcel.readInt());
                return true;
            }
            parcel.enforceInterface("androidx.room.IMultiInstanceInvalidationService");
            IBinder readStrongBinder = parcel.readStrongBinder();
            if (readStrongBinder != null) {
                IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("androidx.room.IMultiInstanceInvalidationCallback");
                if (queryLocalInterface != null && (queryLocalInterface instanceof d)) {
                    dVar = (d) queryLocalInterface;
                } else {
                    dVar = new c(readStrongBinder);
                }
            }
            int readInt = parcel.readInt();
            MultiInstanceInvalidationService.b bVar2 = (MultiInstanceInvalidationService.b) this;
            synchronized (MultiInstanceInvalidationService.this.d) {
                MultiInstanceInvalidationService.this.d.unregister(dVar);
                MultiInstanceInvalidationService.this.c.remove(Integer.valueOf(readInt));
            }
            parcel2.writeNoException();
            return true;
        }
        parcel.enforceInterface("androidx.room.IMultiInstanceInvalidationService");
        IBinder readStrongBinder2 = parcel.readStrongBinder();
        if (readStrongBinder2 != null) {
            IInterface queryLocalInterface2 = readStrongBinder2.queryLocalInterface("androidx.room.IMultiInstanceInvalidationCallback");
            if (queryLocalInterface2 != null && (queryLocalInterface2 instanceof d)) {
                dVar = (d) queryLocalInterface2;
            } else {
                dVar = new c(readStrongBinder2);
            }
        }
        int p0 = ((MultiInstanceInvalidationService.b) this).p0(dVar, parcel.readString());
        parcel2.writeNoException();
        parcel2.writeInt(p0);
        return true;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this;
    }
}
