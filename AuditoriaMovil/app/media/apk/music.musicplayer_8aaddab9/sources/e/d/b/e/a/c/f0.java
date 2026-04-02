package e.d.b.e.a.c;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
/* loaded from: classes2.dex */
public class f0 implements IInterface {
    public final IBinder a;

    /* renamed from: b  reason: collision with root package name */
    public final String f6993b;

    public f0(IBinder iBinder, String str) {
        this.a = iBinder;
        this.f6993b = str;
    }

    public final void R0(int i2, Parcel parcel) throws RemoteException {
        try {
            this.a.transact(i2, parcel, null, 1);
        } finally {
            parcel.recycle();
        }
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.a;
    }

    public final Parcel s0() {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(this.f6993b);
        return obtain;
    }
}
