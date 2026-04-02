package com.ss.android.downloadlib.dr.ge;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import android.text.TextUtils;
import com.ss.android.downloadlib.addownload.wb;
import com.umeng.analytics.pro.bg;
import org.json.JSONObject;
/* loaded from: classes3.dex */
public interface g extends IInterface {
    void dr(ge geVar) throws RemoteException;

    /* loaded from: classes3.dex */
    public static abstract class dr extends Binder implements g {
        private static String dr = "";

        public static g dr(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface(dr);
            if (queryLocalInterface == null || !(queryLocalInterface instanceof g)) {
                return new C0294dr(iBinder);
            }
            return (g) queryLocalInterface;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            if (i == 1) {
                parcel.enforceInterface(dr);
                dr(parcel.readInt() != 0 ? ge.CREATOR.createFromParcel(parcel) : null);
                parcel2.writeNoException();
                return true;
            } else if (i != 1598968902) {
                return super.onTransact(i, parcel, parcel2, i2);
            } else {
                parcel2.writeString(dr);
                return true;
            }
        }

        /* renamed from: com.ss.android.downloadlib.dr.ge.g$dr$dr  reason: collision with other inner class name */
        /* loaded from: classes3.dex */
        private static class C0294dr implements g {
            private IBinder dr;

            C0294dr(IBinder iBinder) {
                if (TextUtils.isEmpty(dr.dr)) {
                    JSONObject ll = wb.ll();
                    String unused = dr.dr = com.ss.android.socialbase.appdownloader.bn.o.dr(ll.optString(bg.aI), ll.optString("s"));
                }
                this.dr = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.dr;
            }

            @Override // com.ss.android.downloadlib.dr.ge.g
            public void dr(ge geVar) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(dr.dr);
                    if (geVar != null) {
                        obtain.writeInt(1);
                        geVar.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.dr.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }
    }
}
