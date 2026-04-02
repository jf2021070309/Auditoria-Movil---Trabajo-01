package com.kwad.framework.filedownloader.c;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.kwad.framework.filedownloader.message.MessageSnapshot;
/* loaded from: classes.dex */
public interface a extends IInterface {

    /* renamed from: com.kwad.framework.filedownloader.c.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static abstract class AbstractBinderC0230a extends Binder implements a {

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: com.kwad.framework.filedownloader.c.a$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static class C0231a implements a {
            public static a adR;
            private IBinder mRemote;

            C0231a(IBinder iBinder) {
                this.mRemote = iBinder;
            }

            @Override // android.os.IInterface
            public final IBinder asBinder() {
                return this.mRemote;
            }

            @Override // com.kwad.framework.filedownloader.c.a
            public final void q(MessageSnapshot messageSnapshot) {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.kwad.framework.filedownloader.i.IFileDownloadIPCCallback");
                    if (messageSnapshot != null) {
                        obtain.writeInt(1);
                        messageSnapshot.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    if (this.mRemote.transact(1, obtain, null, 1) || AbstractBinderC0230a.uY() == null) {
                        return;
                    }
                    AbstractBinderC0230a.uY().q(messageSnapshot);
                } finally {
                    obtain.recycle();
                }
            }
        }

        public AbstractBinderC0230a() {
            attachInterface(this, "com.kwad.framework.filedownloader.i.IFileDownloadIPCCallback");
        }

        public static a c(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.kwad.framework.filedownloader.i.IFileDownloadIPCCallback");
            return (queryLocalInterface == null || !(queryLocalInterface instanceof a)) ? new C0231a(iBinder) : (a) queryLocalInterface;
        }

        public static a uY() {
            return C0231a.adR;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i == 1) {
                parcel.enforceInterface("com.kwad.framework.filedownloader.i.IFileDownloadIPCCallback");
                q(parcel.readInt() != 0 ? MessageSnapshot.CREATOR.createFromParcel(parcel) : null);
                return true;
            } else if (i != 1598968902) {
                return super.onTransact(i, parcel, parcel2, i2);
            } else {
                parcel2.writeString("com.kwad.framework.filedownloader.i.IFileDownloadIPCCallback");
                return true;
            }
        }
    }

    void q(MessageSnapshot messageSnapshot);
}
