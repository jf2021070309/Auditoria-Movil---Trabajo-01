package com.amazon.aps.iva.d;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
/* compiled from: IResultReceiver.java */
/* loaded from: classes.dex */
public interface a extends IInterface {
    public static final String d = "android$support$v4$os$IResultReceiver".replace('$', '.');

    /* compiled from: IResultReceiver.java */
    /* renamed from: com.amazon.aps.iva.d.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static abstract class AbstractBinderC0185a extends Binder implements a {
        public static final /* synthetic */ int a = 0;

        /* compiled from: IResultReceiver.java */
        /* renamed from: com.amazon.aps.iva.d.a$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static class C0186a implements a {
            public final IBinder a;

            public C0186a(IBinder iBinder) {
                this.a = iBinder;
            }

            @Override // android.os.IInterface
            public final IBinder asBinder() {
                return this.a;
            }
        }

        public AbstractBinderC0185a() {
            attachInterface(this, a.d);
        }

        @Override // android.os.Binder
        public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            Object obj;
            String str = a.d;
            if (i >= 1 && i <= 16777215) {
                parcel.enforceInterface(str);
            }
            if (i == 1598968902) {
                parcel2.writeString(str);
                return true;
            } else if (i != 1) {
                return super.onTransact(i, parcel, parcel2, i2);
            } else {
                int readInt = parcel.readInt();
                Parcelable.Creator creator = Bundle.CREATOR;
                if (parcel.readInt() != 0) {
                    obj = creator.createFromParcel(parcel);
                } else {
                    obj = null;
                }
                b bVar = b.this;
                bVar.getClass();
                bVar.a(readInt, (Bundle) obj);
                return true;
            }
        }

        @Override // android.os.IInterface
        public final IBinder asBinder() {
            return this;
        }
    }
}
