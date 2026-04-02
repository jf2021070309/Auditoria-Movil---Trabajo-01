package com.kwad.sdk.core.f.b;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
/* loaded from: classes.dex */
public interface a extends IInterface {

    /* renamed from: com.kwad.sdk.core.f.b.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C0255a implements a {
        private final IBinder aqA;

        public C0255a(IBinder iBinder) {
            this.aqA = iBinder;
        }

        @Override // android.os.IInterface
        public final IBinder asBinder() {
            return this.aqA;
        }

        public final String getID() {
            Parcel obtain = Parcel.obtain();
            Parcel obtain2 = Parcel.obtain();
            try {
                obtain.writeInterfaceToken("com.asus.msa.SupplementaryDID.IDidAidlInterface");
                this.aqA.transact(3, obtain, obtain2, 0);
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
}
