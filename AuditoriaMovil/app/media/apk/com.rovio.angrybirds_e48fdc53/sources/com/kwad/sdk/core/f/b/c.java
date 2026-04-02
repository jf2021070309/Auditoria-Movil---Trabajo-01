package com.kwad.sdk.core.f.b;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
/* loaded from: classes.dex */
public interface c extends IInterface {

    /* loaded from: classes.dex */
    public static final class a implements c {
        private IBinder aqA;

        public a(IBinder iBinder) {
            this.aqA = iBinder;
        }

        @Override // android.os.IInterface
        public final IBinder asBinder() {
            return this.aqA;
        }

        @Override // com.kwad.sdk.core.f.b.c
        public final String getOaid() {
            Parcel obtain = Parcel.obtain();
            Parcel obtain2 = Parcel.obtain();
            try {
                obtain.writeInterfaceToken("com.zui.deviceidservice.IDeviceidInterface");
                this.aqA.transact(1, obtain, obtain2, 0);
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

    String getOaid();
}
