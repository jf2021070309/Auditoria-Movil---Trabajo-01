package c.v;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
/* loaded from: classes.dex */
public interface c extends IInterface {

    /* loaded from: classes.dex */
    public static abstract class a extends Binder implements c {

        /* renamed from: c.v.c$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static class C0055a implements c {
            public IBinder a;

            public C0055a(IBinder iBinder) {
                this.a = iBinder;
            }

            @Override // c.v.c
            public void D(String[] strArr) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("androidx.room.IMultiInstanceInvalidationCallback");
                    obtain.writeStringArray(strArr);
                    this.a.transact(1, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.a;
            }
        }

        public static c s0(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("androidx.room.IMultiInstanceInvalidationCallback");
            return (queryLocalInterface == null || !(queryLocalInterface instanceof c)) ? new C0055a(iBinder) : (c) queryLocalInterface;
        }
    }

    void D(String[] strArr) throws RemoteException;
}
