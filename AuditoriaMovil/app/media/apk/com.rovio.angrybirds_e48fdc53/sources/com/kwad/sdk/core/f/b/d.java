package com.kwad.sdk.core.f.b;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
/* loaded from: classes.dex */
public interface d extends IInterface {

    /* loaded from: classes.dex */
    public static final class a implements d {
        private IBinder aqA;

        public a(IBinder iBinder) {
            this.aqA = iBinder;
        }

        @Override // android.os.IInterface
        public final IBinder asBinder() {
            return this.aqA;
        }

        @Override // com.kwad.sdk.core.f.b.d
        public final String getSerID(String str, String str2, String str3) {
            Parcel obtain = Parcel.obtain();
            Parcel obtain2 = Parcel.obtain();
            try {
                obtain.writeInterfaceToken("com.heytap.openid.IOpenID");
                obtain.writeString(str);
                obtain.writeString(str2);
                obtain.writeString(str3);
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

    String getSerID(String str, String str2, String str3);
}
