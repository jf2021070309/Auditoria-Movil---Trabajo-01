package com.facebook.ads.internal.c;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.Parcel;
import android.text.TextUtils;
import com.facebook.ads.internal.c.c;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import java.lang.reflect.Method;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.atomic.AtomicBoolean;
/* loaded from: classes2.dex */
public class a {
    public static final String a = a.class.getSimpleName();
    private final String b;
    private final boolean c;
    private final c d;

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.facebook.ads.internal.c.a$a  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static final class C0108a implements IInterface {
        private IBinder a;

        C0108a(IBinder iBinder) {
            this.a = iBinder;
        }

        public String a() {
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

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this.a;
        }

        public boolean b() {
            Parcel obtain = Parcel.obtain();
            Parcel obtain2 = Parcel.obtain();
            try {
                obtain.writeInterfaceToken("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
                obtain.writeInt(1);
                this.a.transact(2, obtain, obtain2, 0);
                obtain2.readException();
                return obtain2.readInt() != 0;
            } finally {
                obtain2.recycle();
                obtain.recycle();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes2.dex */
    public static final class b implements ServiceConnection {
        private AtomicBoolean a;
        private final BlockingQueue<IBinder> b;

        private b() {
            this.a = new AtomicBoolean(false);
            this.b = new LinkedBlockingDeque();
        }

        public IBinder a() {
            if (this.a.compareAndSet(true, true)) {
                throw new IllegalStateException("Binder already consumed");
            }
            return this.b.take();
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
    }

    /* loaded from: classes2.dex */
    public enum c {
        SHARED_PREFS,
        FB4A,
        DIRECT,
        REFLECTION,
        SERVICE
    }

    private a(String str, boolean z, c cVar) {
        this.b = str;
        this.c = z;
        this.d = cVar;
    }

    private static a a(Context context) {
        try {
            AdvertisingIdClient.Info advertisingIdInfo = AdvertisingIdClient.getAdvertisingIdInfo(context);
            if (advertisingIdInfo != null) {
                return new a(advertisingIdInfo.getId(), advertisingIdInfo.isLimitAdTrackingEnabled(), c.DIRECT);
            }
        } catch (Throwable th) {
        }
        return null;
    }

    public static a a(Context context, c.a aVar) {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            throw new IllegalStateException("Cannot get advertising info on main thread.");
        }
        if (com.facebook.ads.internal.q.a.b.a() && com.facebook.ads.internal.q.a.b.b("idfa_override")) {
            return new a(com.facebook.ads.internal.q.a.b.a("idfa_override"), false, c.DIRECT);
        }
        if (aVar == null || TextUtils.isEmpty(aVar.b)) {
            a a2 = a(context);
            if (a2 == null || TextUtils.isEmpty(a2.a())) {
                a2 = b(context);
            }
            return (a2 == null || TextUtils.isEmpty(a2.a())) ? c(context) : a2;
        }
        return new a(aVar.b, aVar.c, c.FB4A);
    }

    private static a b(Context context) {
        Object a2;
        Method a3 = d.a("com.google.android.gms.common.GooglePlayServicesUtil", "isGooglePlayServicesAvailable", Context.class);
        if (a3 == null) {
            return null;
        }
        Object a4 = d.a((Object) null, a3, context);
        if (a4 == null || ((Integer) a4).intValue() != 0) {
            return null;
        }
        Method a5 = d.a("com.google.android.gms.ads.identifier.AdvertisingIdClient", "getAdvertisingIdInfo", Context.class);
        if (a5 != null && (a2 = d.a((Object) null, a5, context)) != null) {
            Method a6 = d.a(a2.getClass(), "getId", new Class[0]);
            Method a7 = d.a(a2.getClass(), "isLimitAdTrackingEnabled", new Class[0]);
            if (a6 == null || a7 == null) {
                return null;
            }
            return new a((String) d.a(a2, a6, new Object[0]), ((Boolean) d.a(a2, a7, new Object[0])).booleanValue(), c.REFLECTION);
        }
        return null;
    }

    private static a c(Context context) {
        b bVar = new b();
        Intent intent = new Intent("com.google.android.gms.ads.identifier.service.STARS");
        intent.setPackage("com.google.android.gms");
        if (context.bindService(intent, bVar, 1)) {
            try {
                C0108a c0108a = new C0108a(bVar.a());
                return new a(c0108a.a(), c0108a.b(), c.SERVICE);
            } catch (Exception e) {
            } finally {
                context.unbindService(bVar);
            }
        }
        return null;
    }

    public String a() {
        return this.b;
    }

    public boolean b() {
        return this.c;
    }

    public c c() {
        return this.d;
    }
}
