package com.amazon.aps.iva.b8;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
/* compiled from: IMediaController.java */
/* loaded from: classes.dex */
public interface h extends IInterface {

    /* compiled from: IMediaController.java */
    /* loaded from: classes.dex */
    public static abstract class a extends Binder implements h {
        public static final /* synthetic */ int a = 0;

        /* compiled from: IMediaController.java */
        /* renamed from: com.amazon.aps.iva.b8.h$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static class C0134a implements h {
            public final IBinder a;

            public C0134a(IBinder iBinder) {
                this.a = iBinder;
            }

            @Override // com.amazon.aps.iva.b8.h
            public final void N(int i, Bundle bundle) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("androidx.media3.session.IMediaController");
                    obtain.writeInt(i);
                    obtain.writeInt(1);
                    bundle.writeToParcel(obtain, 0);
                    if (!this.a.transact(3002, obtain, null, 1)) {
                        int i2 = a.a;
                    }
                } finally {
                    obtain.recycle();
                }
            }

            @Override // com.amazon.aps.iva.b8.h
            public final void a(int i) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("androidx.media3.session.IMediaController");
                    obtain.writeInt(i);
                    if (!this.a.transact(3011, obtain, null, 1)) {
                        int i2 = a.a;
                    }
                } finally {
                    obtain.recycle();
                }
            }

            @Override // android.os.IInterface
            public final IBinder asBinder() {
                return this.a;
            }

            @Override // com.amazon.aps.iva.b8.h
            public final void b0(int i, Bundle bundle) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("androidx.media3.session.IMediaController");
                    obtain.writeInt(i);
                    obtain.writeInt(1);
                    bundle.writeToParcel(obtain, 0);
                    if (!this.a.transact(3009, obtain, null, 1)) {
                        int i2 = a.a;
                    }
                } finally {
                    obtain.recycle();
                }
            }

            @Override // com.amazon.aps.iva.b8.h
            public final void c0(int i, Bundle bundle) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("androidx.media3.session.IMediaController");
                    obtain.writeInt(i);
                    obtain.writeInt(1);
                    bundle.writeToParcel(obtain, 0);
                    if (!this.a.transact(3008, obtain, null, 1)) {
                        int i2 = a.a;
                    }
                } finally {
                    obtain.recycle();
                }
            }

            @Override // com.amazon.aps.iva.b8.h
            public final void d() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("androidx.media3.session.IMediaController");
                    obtain.writeInt(0);
                    if (!this.a.transact(3006, obtain, null, 1)) {
                        int i = a.a;
                    }
                } finally {
                    obtain.recycle();
                }
            }

            @Override // com.amazon.aps.iva.b8.h
            public final void d0(int i, Bundle bundle, Bundle bundle2) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("androidx.media3.session.IMediaController");
                    obtain.writeInt(i);
                    obtain.writeInt(1);
                    bundle.writeToParcel(obtain, 0);
                    obtain.writeInt(1);
                    bundle2.writeToParcel(obtain, 0);
                    if (!this.a.transact(3013, obtain, null, 1)) {
                        int i2 = a.a;
                    }
                } finally {
                    obtain.recycle();
                }
            }

            @Override // com.amazon.aps.iva.b8.h
            public final void f(int i, Bundle bundle) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("androidx.media3.session.IMediaController");
                    obtain.writeInt(i);
                    obtain.writeInt(1);
                    bundle.writeToParcel(obtain, 0);
                    if (!this.a.transact(3001, obtain, null, 1)) {
                        int i2 = a.a;
                    }
                } finally {
                    obtain.recycle();
                }
            }

            @Override // com.amazon.aps.iva.b8.h
            public final void k0(int i, Bundle bundle, boolean z) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("androidx.media3.session.IMediaController");
                    obtain.writeInt(i);
                    obtain.writeInt(1);
                    bundle.writeToParcel(obtain, 0);
                    obtain.writeInt(z ? 1 : 0);
                    if (!this.a.transact(3007, obtain, null, 1)) {
                        int i2 = a.a;
                    }
                } finally {
                    obtain.recycle();
                }
            }

            @Override // com.amazon.aps.iva.b8.h
            public final void z(int i, Bundle bundle) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("androidx.media3.session.IMediaController");
                    obtain.writeInt(i);
                    obtain.writeInt(1);
                    bundle.writeToParcel(obtain, 0);
                    if (!this.a.transact(3003, obtain, null, 1)) {
                        int i2 = a.a;
                    }
                } finally {
                    obtain.recycle();
                }
            }
        }

        public static h o0(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("androidx.media3.session.IMediaController");
            if (queryLocalInterface != null && (queryLocalInterface instanceof h)) {
                return (h) queryLocalInterface;
            }
            return new C0134a(iBinder);
        }
    }

    void N(int i, Bundle bundle) throws RemoteException;

    void a(int i) throws RemoteException;

    void b0(int i, Bundle bundle) throws RemoteException;

    void c0(int i, Bundle bundle) throws RemoteException;

    void d() throws RemoteException;

    void d0(int i, Bundle bundle, Bundle bundle2) throws RemoteException;

    void f(int i, Bundle bundle) throws RemoteException;

    void k0(int i, Bundle bundle, boolean z) throws RemoteException;

    void z(int i, Bundle bundle) throws RemoteException;
}
