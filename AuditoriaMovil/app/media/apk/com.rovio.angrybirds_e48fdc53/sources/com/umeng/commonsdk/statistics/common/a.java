package com.umeng.commonsdk.statistics.common;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.Parcel;
import android.os.RemoteException;
import java.io.IOException;
import java.util.concurrent.LinkedBlockingQueue;
/* compiled from: AdvertisingId.java */
/* loaded from: classes3.dex */
public class a {

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: AdvertisingId.java */
    /* renamed from: com.umeng.commonsdk.statistics.common.a$a  reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    public static final class C0323a {
        private final String a;
        private final boolean b;

        C0323a(String str, boolean z) {
            this.a = str;
            this.b = z;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public String b() {
            return this.a;
        }

        public boolean a() {
            return this.b;
        }
    }

    public static String a(Context context) {
        try {
            C0323a c2 = c(context);
            if (c2 != null && !c2.a()) {
                return c2.b();
            }
        } catch (Exception e) {
        }
        return null;
    }

    public static String b(Context context) {
        try {
            C0323a c2 = c(context);
            if (c2 != null) {
                return c2.b();
            }
            return null;
        } catch (Exception e) {
            return null;
        }
    }

    private static C0323a c(Context context) throws Exception {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            return null;
        }
        try {
            if (com.umeng.commonsdk.utils.b.a().a(context, "com.android.vending", 0) == null) {
                return null;
            }
            b bVar = new b();
            Intent intent = new Intent("com.google.android.gms.ads.identifier.service.START");
            intent.setPackage("com.google.android.gms");
            try {
                if (context.bindService(intent, bVar, 1)) {
                    try {
                        c cVar = new c(bVar.a());
                        boolean a = cVar.a(true);
                        String str = "";
                        if (!a) {
                            str = cVar.a();
                        }
                        return new C0323a(str, a);
                    } catch (Exception e) {
                        throw e;
                    }
                }
                throw new IOException("Google Play connection failed");
            } finally {
                context.unbindService(bVar);
            }
        } catch (Exception e2) {
            throw e2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: AdvertisingId.java */
    /* loaded from: classes3.dex */
    public static final class b implements ServiceConnection {
        boolean a;
        private final LinkedBlockingQueue<IBinder> b;

        private b() {
            this.a = false;
            this.b = new LinkedBlockingQueue<>(1);
        }

        @Override // android.content.ServiceConnection
        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            try {
                this.b.put(iBinder);
            } catch (InterruptedException e) {
            }
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName componentName) {
        }

        public IBinder a() throws InterruptedException {
            if (this.a) {
                throw new IllegalStateException();
            }
            this.a = true;
            return this.b.take();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: AdvertisingId.java */
    /* loaded from: classes3.dex */
    public static final class c implements IInterface {
        private IBinder a;

        public c(IBinder iBinder) {
            this.a = iBinder;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this.a;
        }

        public String a() throws RemoteException {
            Parcel obtain = Parcel.obtain();
            Parcel obtain2 = Parcel.obtain();
            try {
                obtain.writeInterfaceToken("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
                this.a.transact(1, obtain, obtain2, 0);
                obtain2.readException();
                return obtain2.readString();
            } finally {
                obtain2.recycle();
                obtain.recycle();
            }
        }

        public boolean a(boolean z) throws RemoteException {
            Parcel obtain = Parcel.obtain();
            Parcel obtain2 = Parcel.obtain();
            try {
                obtain.writeInterfaceToken("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
                obtain.writeInt(z ? 1 : 0);
                this.a.transact(2, obtain, obtain2, 0);
                obtain2.readException();
                return obtain2.readInt() != 0;
            } finally {
                obtain2.recycle();
                obtain.recycle();
            }
        }
    }
}
