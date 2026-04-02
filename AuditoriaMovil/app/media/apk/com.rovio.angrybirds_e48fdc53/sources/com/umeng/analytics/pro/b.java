package com.umeng.analytics.pro;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
/* compiled from: IDeviceIdService.java */
/* loaded from: classes3.dex */
public interface b extends IInterface {
    String a() throws RemoteException;

    String a(String str) throws RemoteException;

    String b(String str) throws RemoteException;

    /* compiled from: IDeviceIdService.java */
    /* loaded from: classes3.dex */
    public static class a implements b {
        @Override // com.umeng.analytics.pro.b
        public String a() throws RemoteException {
            return null;
        }

        @Override // com.umeng.analytics.pro.b
        public String a(String str) throws RemoteException {
            return null;
        }

        @Override // com.umeng.analytics.pro.b
        public String b(String str) throws RemoteException {
            return null;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return null;
        }
    }

    /* compiled from: IDeviceIdService.java */
    /* renamed from: com.umeng.analytics.pro.b$b  reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    public static abstract class AbstractBinderC0314b extends Binder implements b {
        static final int a = 1;
        static final int b = 2;
        static final int c = 3;
        private static final String d = "com.samsung.android.deviceidservice.IDeviceIdService";

        public AbstractBinderC0314b() {
            attachInterface(this, d);
        }

        public static b a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface(d);
            if (queryLocalInterface != null && (queryLocalInterface instanceof b)) {
                return (b) queryLocalInterface;
            }
            return new a(iBinder);
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            if (i == 1) {
                parcel.enforceInterface(d);
                String a2 = a();
                parcel2.writeNoException();
                parcel2.writeString(a2);
                return true;
            } else if (i == 2) {
                parcel.enforceInterface(d);
                String a3 = a(parcel.readString());
                parcel2.writeNoException();
                parcel2.writeString(a3);
                return true;
            } else if (i != 3) {
                if (i == 1598968902) {
                    parcel2.writeString(d);
                    return true;
                }
                return super.onTransact(i, parcel, parcel2, i2);
            } else {
                parcel.enforceInterface(d);
                String b2 = b(parcel.readString());
                parcel2.writeNoException();
                parcel2.writeString(b2);
                return true;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* compiled from: IDeviceIdService.java */
        /* renamed from: com.umeng.analytics.pro.b$b$a */
        /* loaded from: classes3.dex */
        public static class a implements b {
            public static b a;
            private IBinder b;

            a(IBinder iBinder) {
                this.b = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.b;
            }

            public String b() {
                return AbstractBinderC0314b.d;
            }

            @Override // com.umeng.analytics.pro.b
            public String a() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(AbstractBinderC0314b.d);
                    if (!this.b.transact(1, obtain, obtain2, 0) && AbstractBinderC0314b.b() != null) {
                        return AbstractBinderC0314b.b().a();
                    }
                    obtain2.readException();
                    return obtain2.readString();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.umeng.analytics.pro.b
            public String a(String str) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(AbstractBinderC0314b.d);
                    obtain.writeString(str);
                    if (!this.b.transact(2, obtain, obtain2, 0) && AbstractBinderC0314b.b() != null) {
                        return AbstractBinderC0314b.b().a(str);
                    }
                    obtain2.readException();
                    return obtain2.readString();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.umeng.analytics.pro.b
            public String b(String str) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(AbstractBinderC0314b.d);
                    obtain.writeString(str);
                    if (!this.b.transact(3, obtain, obtain2, 0) && AbstractBinderC0314b.b() != null) {
                        return AbstractBinderC0314b.b().b(str);
                    }
                    obtain2.readException();
                    return obtain2.readString();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }

        public static boolean a(b bVar) {
            if (a.a == null && bVar != null) {
                a.a = bVar;
                return true;
            }
            return false;
        }

        public static b b() {
            return a.a;
        }
    }
}
