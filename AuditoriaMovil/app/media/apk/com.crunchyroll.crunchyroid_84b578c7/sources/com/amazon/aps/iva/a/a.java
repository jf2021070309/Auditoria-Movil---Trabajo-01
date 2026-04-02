package com.amazon.aps.iva.a;

import android.app.Notification;
import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
/* compiled from: INotificationSideChannel.java */
/* loaded from: classes.dex */
public interface a extends IInterface {
    public static final String c = "android$support$v4$app$INotificationSideChannel".replace('$', '.');

    /* compiled from: INotificationSideChannel.java */
    /* renamed from: com.amazon.aps.iva.a.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static abstract class AbstractBinderC0091a extends Binder implements a {
        public static final /* synthetic */ int a = 0;

        /* compiled from: INotificationSideChannel.java */
        /* renamed from: com.amazon.aps.iva.a.a$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static class C0092a implements a {
            public final IBinder a;

            public C0092a(IBinder iBinder) {
                this.a = iBinder;
            }

            @Override // android.os.IInterface
            public final IBinder asBinder() {
                return this.a;
            }

            @Override // com.amazon.aps.iva.a.a
            public final void l0(String str, int i, String str2, Notification notification) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(a.c);
                    obtain.writeString(str);
                    obtain.writeInt(i);
                    obtain.writeString(str2);
                    if (notification != null) {
                        obtain.writeInt(1);
                        notification.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.a.transact(1, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }
        }
    }

    void l0(String str, int i, String str2, Notification notification) throws RemoteException;
}
