package com.amazon.aps.iva.oa0;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.amazon.aps.iva.oa0.d0;
import com.amazon.aps.iva.oa0.f;
import com.android.vending.licensing.ILicensingService;
import java.security.SecureRandom;
/* compiled from: LicenseChecker.java */
/* loaded from: classes4.dex */
public final class e0 implements ServiceConnection {
    public static final SecureRandom f = new SecureRandom();
    public static final com.amazon.aps.iva.b30.j g = new com.amazon.aps.iva.b30.j(d0.class.getSimpleName());
    public ILicensingService b;
    public final Context c;
    public final d0.a d;
    public final String e;

    /* compiled from: LicenseChecker.java */
    /* loaded from: classes4.dex */
    public class a extends com.amazon.aps.iva.db.a {
        public a() {
        }
    }

    public e0(Context context, f.a aVar) {
        HandlerThread handlerThread = new HandlerThread("license_checker");
        handlerThread.start();
        this.c = context;
        this.e = context.getPackageName();
        new Handler(handlerThread.getLooper());
        this.d = aVar;
    }

    public final synchronized void a() {
        ILicensingService iLicensingService = this.b;
        if (iLicensingService == null) {
            g.getClass();
            try {
                if (!this.c.bindService(new Intent("com.android.vending.licensing.ILicensingService").setPackage("com.android.vending"), this, 1)) {
                    this.d.a(-1, "Binding failed", "");
                }
            } catch (SecurityException e) {
                g.getClass();
                this.d.a(-1, String.format("Exception: %s, Message: %s", e.toString(), e.getMessage()), "");
            }
            g.getClass();
        } else {
            try {
                iLicensingService.g0(f.nextInt(), this.e, new a());
            } catch (RemoteException e2) {
                g.getClass();
                this.d.a(-1, String.format("Exception: %s, Message: %s", e2.toString(), e2.getMessage()), "");
            }
        }
    }

    @Override // android.content.ServiceConnection
    public final synchronized void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        ILicensingService c0934a;
        g.getClass();
        int i = ILicensingService.a.a;
        if (iBinder == null) {
            c0934a = null;
        } else {
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.android.vending.licensing.ILicensingService");
            if (queryLocalInterface != null && (queryLocalInterface instanceof ILicensingService)) {
                c0934a = (ILicensingService) queryLocalInterface;
            } else {
                c0934a = new ILicensingService.a.C0934a(iBinder);
            }
        }
        this.b = c0934a;
        try {
            c0934a.g0(f.nextInt(), this.e, new a());
        } catch (RemoteException e) {
            g.getClass();
            this.d.a(-1, e.toString(), "");
        }
    }

    @Override // android.content.ServiceConnection
    public final synchronized void onServiceDisconnected(ComponentName componentName) {
        g.getClass();
        this.b = null;
    }
}
