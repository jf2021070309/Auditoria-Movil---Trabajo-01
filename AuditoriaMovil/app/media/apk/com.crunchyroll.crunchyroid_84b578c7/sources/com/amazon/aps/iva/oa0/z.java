package com.amazon.aps.iva.oa0;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import java.util.concurrent.LinkedBlockingQueue;
/* compiled from: ExternalAIFAHelper.java */
/* loaded from: classes4.dex */
public final class z {
    public static final /* synthetic */ int a = 0;

    /* compiled from: ExternalAIFAHelper.java */
    /* loaded from: classes4.dex */
    public interface a extends IInterface {

        /* compiled from: ExternalAIFAHelper.java */
        /* renamed from: com.amazon.aps.iva.oa0.z$a$a  reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public static abstract class AbstractBinderC0565a extends Binder implements a {
            public static final /* synthetic */ int a = 0;

            /* compiled from: ExternalAIFAHelper.java */
            /* renamed from: com.amazon.aps.iva.oa0.z$a$a$a  reason: collision with other inner class name */
            /* loaded from: classes4.dex */
            public static class C0566a implements a {
                public final IBinder a;

                public C0566a(IBinder iBinder) {
                    this.a = iBinder;
                }

                @Override // android.os.IInterface
                public final IBinder asBinder() {
                    return this.a;
                }

                @Override // com.amazon.aps.iva.oa0.z.a
                public final String getId() throws RemoteException {
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
            }
        }

        String getId() throws RemoteException;
    }

    static {
        new com.amazon.aps.iva.b30.j(z.class.getSimpleName());
    }

    public static String a(Context context) {
        a c0566a;
        b bVar = new b();
        Intent intent = new Intent("com.google.android.gms.ads.identifier.service.START");
        intent.setPackage("com.google.android.gms");
        if (context.bindService(intent, bVar, 1)) {
            try {
                if (!bVar.b) {
                    bVar.b = true;
                    IBinder iBinder = (IBinder) bVar.c.take();
                    int i = a.AbstractBinderC0565a.a;
                    if (iBinder == null) {
                        c0566a = null;
                    } else {
                        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
                        if (queryLocalInterface != null && (queryLocalInterface instanceof a)) {
                            c0566a = (a) queryLocalInterface;
                        } else {
                            c0566a = new a.AbstractBinderC0565a.C0566a(iBinder);
                        }
                    }
                    String id = c0566a.getId();
                    context.unbindService(bVar);
                    return id;
                }
                throw new IllegalStateException();
            } catch (Throwable unused) {
                context.unbindService(bVar);
                return "";
            }
        }
        return "";
    }

    /* compiled from: ExternalAIFAHelper.java */
    /* loaded from: classes4.dex */
    public static class b implements ServiceConnection {
        public boolean b = false;
        public final LinkedBlockingQueue c = new LinkedBlockingQueue();

        @Override // android.content.ServiceConnection
        public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            try {
                this.c.put(iBinder);
            } catch (InterruptedException unused) {
            }
        }

        @Override // android.content.ServiceConnection
        public final void onServiceDisconnected(ComponentName componentName) {
        }
    }
}
