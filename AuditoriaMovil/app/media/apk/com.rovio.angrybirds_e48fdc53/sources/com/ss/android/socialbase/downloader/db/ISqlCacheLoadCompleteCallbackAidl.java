package com.ss.android.socialbase.downloader.db;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import java.util.Map;
/* loaded from: classes3.dex */
public interface ISqlCacheLoadCompleteCallbackAidl extends IInterface {
    void callback(Map map, Map map2) throws RemoteException;

    /* loaded from: classes3.dex */
    public static class Default implements ISqlCacheLoadCompleteCallbackAidl {
        @Override // com.ss.android.socialbase.downloader.db.ISqlCacheLoadCompleteCallbackAidl
        public void callback(Map map, Map map2) throws RemoteException {
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return null;
        }
    }

    /* loaded from: classes3.dex */
    public static abstract class Stub extends Binder implements ISqlCacheLoadCompleteCallbackAidl {
        private static final String DESCRIPTOR = "com.ss.android.socialbase.downloader.db.ISqlCacheLoadCompleteCallbackAidl";
        static final int TRANSACTION_callback = 1;

        public Stub() {
            attachInterface(this, DESCRIPTOR);
        }

        public static ISqlCacheLoadCompleteCallbackAidl asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface(DESCRIPTOR);
            if (queryLocalInterface != null && (queryLocalInterface instanceof ISqlCacheLoadCompleteCallbackAidl)) {
                return (ISqlCacheLoadCompleteCallbackAidl) queryLocalInterface;
            }
            return new Proxy(iBinder);
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            if (i != 1) {
                if (i == 1598968902) {
                    parcel2.writeString(DESCRIPTOR);
                    return true;
                }
                return super.onTransact(i, parcel, parcel2, i2);
            }
            parcel.enforceInterface(DESCRIPTOR);
            ClassLoader classLoader = getClass().getClassLoader();
            callback(parcel.readHashMap(classLoader), parcel.readHashMap(classLoader));
            parcel2.writeNoException();
            return true;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* loaded from: classes3.dex */
        public static class Proxy implements ISqlCacheLoadCompleteCallbackAidl {
            public static ISqlCacheLoadCompleteCallbackAidl sDefaultImpl;
            private IBinder mRemote;

            Proxy(IBinder iBinder) {
                this.mRemote = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.mRemote;
            }

            public String getInterfaceDescriptor() {
                return Stub.DESCRIPTOR;
            }

            @Override // com.ss.android.socialbase.downloader.db.ISqlCacheLoadCompleteCallbackAidl
            public void callback(Map map, Map map2) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    obtain.writeMap(map);
                    obtain.writeMap(map2);
                    if (!this.mRemote.transact(1, obtain, obtain2, 0) && Stub.getDefaultImpl() != null) {
                        Stub.getDefaultImpl().callback(map, map2);
                    } else {
                        obtain2.readException();
                    }
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }

        public static boolean setDefaultImpl(ISqlCacheLoadCompleteCallbackAidl iSqlCacheLoadCompleteCallbackAidl) {
            if (Proxy.sDefaultImpl == null && iSqlCacheLoadCompleteCallbackAidl != null) {
                Proxy.sDefaultImpl = iSqlCacheLoadCompleteCallbackAidl;
                return true;
            }
            return false;
        }

        public static ISqlCacheLoadCompleteCallbackAidl getDefaultImpl() {
            return Proxy.sDefaultImpl;
        }
    }
}
