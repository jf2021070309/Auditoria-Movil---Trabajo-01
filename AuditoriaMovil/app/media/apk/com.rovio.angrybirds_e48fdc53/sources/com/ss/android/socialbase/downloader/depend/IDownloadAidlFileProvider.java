package com.ss.android.socialbase.downloader.depend;

import android.net.Uri;
import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
/* loaded from: classes3.dex */
public interface IDownloadAidlFileProvider extends IInterface {
    Uri getUriForFile(String str, String str2) throws RemoteException;

    /* loaded from: classes3.dex */
    public static class Default implements IDownloadAidlFileProvider {
        @Override // com.ss.android.socialbase.downloader.depend.IDownloadAidlFileProvider
        public Uri getUriForFile(String str, String str2) throws RemoteException {
            return null;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return null;
        }
    }

    /* loaded from: classes3.dex */
    public static abstract class Stub extends Binder implements IDownloadAidlFileProvider {
        private static final String DESCRIPTOR = "com.ss.android.socialbase.downloader.depend.IDownloadAidlFileProvider";
        static final int TRANSACTION_getUriForFile = 1;

        public Stub() {
            attachInterface(this, DESCRIPTOR);
        }

        public static IDownloadAidlFileProvider asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface(DESCRIPTOR);
            if (queryLocalInterface != null && (queryLocalInterface instanceof IDownloadAidlFileProvider)) {
                return (IDownloadAidlFileProvider) queryLocalInterface;
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
            Uri uriForFile = getUriForFile(parcel.readString(), parcel.readString());
            parcel2.writeNoException();
            if (uriForFile != null) {
                parcel2.writeInt(1);
                uriForFile.writeToParcel(parcel2, 1);
            } else {
                parcel2.writeInt(0);
            }
            return true;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* loaded from: classes3.dex */
        public static class Proxy implements IDownloadAidlFileProvider {
            public static IDownloadAidlFileProvider sDefaultImpl;
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

            @Override // com.ss.android.socialbase.downloader.depend.IDownloadAidlFileProvider
            public Uri getUriForFile(String str, String str2) throws RemoteException {
                Uri uri;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    obtain.writeString(str);
                    obtain.writeString(str2);
                    if (!this.mRemote.transact(1, obtain, obtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().getUriForFile(str, str2);
                    }
                    obtain2.readException();
                    if (obtain2.readInt() != 0) {
                        uri = (Uri) Uri.CREATOR.createFromParcel(obtain2);
                    } else {
                        uri = null;
                    }
                    return uri;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }

        public static boolean setDefaultImpl(IDownloadAidlFileProvider iDownloadAidlFileProvider) {
            if (Proxy.sDefaultImpl == null && iDownloadAidlFileProvider != null) {
                Proxy.sDefaultImpl = iDownloadAidlFileProvider;
                return true;
            }
            return false;
        }

        public static IDownloadAidlFileProvider getDefaultImpl() {
            return Proxy.sDefaultImpl;
        }
    }
}
