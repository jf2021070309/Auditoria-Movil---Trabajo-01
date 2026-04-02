package com.android.vending.licensing;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.amazon.aps.iva.oa0.e0;
/* loaded from: classes.dex */
public interface ILicensingService extends IInterface {

    /* loaded from: classes.dex */
    public static abstract class a extends Binder implements ILicensingService {
        public static final /* synthetic */ int a = 0;

        /* renamed from: com.android.vending.licensing.ILicensingService$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static class C0934a implements ILicensingService {
            public final IBinder a;

            public C0934a(IBinder iBinder) {
                this.a = iBinder;
            }

            @Override // android.os.IInterface
            public final IBinder asBinder() {
                return this.a;
            }

            @Override // com.android.vending.licensing.ILicensingService
            public final void g0(long j, String str, e0.a aVar) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.android.vending.licensing.ILicensingService");
                    obtain.writeLong(j);
                    obtain.writeString(str);
                    obtain.writeStrongBinder(aVar);
                    this.a.transact(1, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }
        }
    }

    void g0(long j, String str, e0.a aVar) throws RemoteException;
}
