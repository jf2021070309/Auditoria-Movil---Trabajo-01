package com.kwad.sdk.core.f.b;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
/* loaded from: classes.dex */
public interface f extends IInterface {

    /* loaded from: classes.dex */
    public static final class a implements f {
        private IBinder aqA;

        public a(IBinder iBinder) {
            this.aqA = iBinder;
        }

        @Override // android.os.IInterface
        public final IBinder asBinder() {
            return this.aqA;
        }

        @Override // com.kwad.sdk.core.f.b.f
        public final String getOAID() {
            Parcel obtain = Parcel.obtain();
            Parcel obtain2 = Parcel.obtain();
            try {
                obtain.writeInterfaceToken("com.bun.lib.MsaIdInterface");
                this.aqA.transact(1, obtain, obtain2, 0);
                obtain2.readException();
                String readString = obtain2.readString();
                obtain.recycle();
                obtain2.recycle();
                return readString;
            } catch (Exception e) {
                obtain.recycle();
                obtain2.recycle();
                return null;
            } catch (Throwable th) {
                obtain.recycle();
                obtain2.recycle();
                throw th;
            }
        }
    }

    String getOAID();
}
