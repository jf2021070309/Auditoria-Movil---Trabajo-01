package com.ss.android.downloadlib.dr.ge;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import android.text.TextUtils;
import com.kuaishou.weapon.p0.t;
import com.ss.android.downloadlib.addownload.wb;
import com.ss.android.downloadlib.dr.ge.g;
import org.json.JSONObject;
/* loaded from: classes3.dex */
public interface o extends IInterface {
    void dr(ge geVar, g gVar) throws RemoteException;

    /* loaded from: classes3.dex */
    public static abstract class dr extends Binder implements o {
        private static String dr = "";

        public static o dr(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface(dr);
            if (queryLocalInterface == null || !(queryLocalInterface instanceof o)) {
                return new C0295dr(iBinder);
            }
            return (o) queryLocalInterface;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            if (i != 1598968902) {
                ge geVar = null;
                if (i == 1) {
                    parcel.enforceInterface(dr);
                    if (parcel.readInt() != 0) {
                        geVar = ge.CREATOR.createFromParcel(parcel);
                    }
                    dr(geVar, g.dr.dr(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                }
                return super.onTransact(i, parcel, parcel2, i2);
            }
            parcel2.writeString(dr);
            return true;
        }

        /* renamed from: com.ss.android.downloadlib.dr.ge.o$dr$dr  reason: collision with other inner class name */
        /* loaded from: classes3.dex */
        private static class C0295dr implements o {
            private IBinder dr;

            C0295dr(IBinder iBinder) {
                if (TextUtils.isEmpty(dr.dr)) {
                    JSONObject ll = wb.ll();
                    String unused = dr.dr = com.ss.android.socialbase.appdownloader.bn.o.dr(ll.optString(t.k), ll.optString("s"));
                }
                this.dr = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.dr;
            }

            @Override // com.ss.android.downloadlib.dr.ge.o
            public void dr(ge geVar, g gVar) throws RemoteException {
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
                    obtain.writeStrongBinder(gVar != null ? gVar.asBinder() : null);
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
