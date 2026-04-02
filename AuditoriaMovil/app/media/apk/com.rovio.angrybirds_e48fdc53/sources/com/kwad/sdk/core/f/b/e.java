package com.kwad.sdk.core.f.b;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
/* loaded from: classes.dex */
public interface e extends IInterface {

    /* loaded from: classes.dex */
    public static class a implements e {
        private IBinder aqB;

        public a(IBinder iBinder) {
            this.aqB = iBinder;
        }

        @Override // android.os.IInterface
        public final IBinder asBinder() {
            return this.aqB;
        }

        public final String getID() {
            Parcel obtain = Parcel.obtain();
            Parcel obtain2 = Parcel.obtain();
            try {
                obtain.writeInterfaceToken("com.samsung.android.deviceidservice.IDeviceIdService");
                this.aqB.transact(1, obtain, obtain2, 0);
                obtain2.readException();
                String readString = obtain2.readString();
                obtain2.recycle();
                obtain.recycle();
                return readString;
            } catch (Exception e) {
                obtain2.recycle();
                obtain.recycle();
                return null;
            } catch (Throwable th) {
                obtain2.recycle();
                obtain.recycle();
                throw th;
            }
        }
    }
}
