package c.v;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import androidx.room.MultiInstanceInvalidationService;
import c.v.c;
/* loaded from: classes.dex */
public abstract class d extends Binder implements IInterface {
    public d() {
        attachInterface(this, "androidx.room.IMultiInstanceInvalidationService");
    }

    @Override // android.os.IInterface
    public IBinder asBinder() {
        return this;
    }

    @Override // android.os.Binder
    public boolean onTransact(int i2, Parcel parcel, Parcel parcel2, int i3) throws RemoteException {
        if (i2 == 1) {
            parcel.enforceInterface("androidx.room.IMultiInstanceInvalidationService");
            int R0 = ((MultiInstanceInvalidationService.b) this).R0(c.a.s0(parcel.readStrongBinder()), parcel.readString());
            parcel2.writeNoException();
            parcel2.writeInt(R0);
            return true;
        } else if (i2 == 2) {
            parcel.enforceInterface("androidx.room.IMultiInstanceInvalidationService");
            ((MultiInstanceInvalidationService.b) this).S0(c.a.s0(parcel.readStrongBinder()), parcel.readInt());
            parcel2.writeNoException();
            return true;
        } else if (i2 != 3) {
            if (i2 != 1598968902) {
                return super.onTransact(i2, parcel, parcel2, i3);
            }
            parcel2.writeString("androidx.room.IMultiInstanceInvalidationService");
            return true;
        } else {
            parcel.enforceInterface("androidx.room.IMultiInstanceInvalidationService");
            ((MultiInstanceInvalidationService.b) this).s0(parcel.readInt(), parcel.createStringArray());
            return true;
        }
    }
}
