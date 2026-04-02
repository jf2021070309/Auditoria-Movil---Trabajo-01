package e.d.b.c.a;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import e.d.b.a.b;
import e.d.b.a.c;
/* loaded from: classes.dex */
public interface a extends IInterface {

    /* renamed from: e.d.b.c.a.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static abstract class AbstractBinderC0137a extends b implements a {
        public static final /* synthetic */ int a = 0;

        /* renamed from: e.d.b.c.a.a$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static class C0138a extends e.d.b.a.a implements a {
            public C0138a(IBinder iBinder) {
                super(iBinder);
            }

            @Override // e.d.b.c.a.a
            public final Bundle S(Bundle bundle) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                obtain.writeInterfaceToken("com.google.android.finsky.externalreferrer.IGetInstallReferrerService");
                int i2 = c.a;
                obtain.writeInt(1);
                bundle.writeToParcel(obtain, 0);
                obtain = Parcel.obtain();
                try {
                    this.a.transact(1, obtain, obtain, 0);
                    obtain.readException();
                    obtain.recycle();
                    return (Bundle) (obtain.readInt() == 0 ? null : (Parcelable) Bundle.CREATOR.createFromParcel(obtain));
                } catch (RuntimeException e2) {
                    throw e2;
                } finally {
                    obtain.recycle();
                }
            }
        }
    }

    Bundle S(Bundle bundle) throws RemoteException;
}
