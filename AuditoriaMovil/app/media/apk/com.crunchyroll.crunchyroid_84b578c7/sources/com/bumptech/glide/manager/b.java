package com.bumptech.glide.manager;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import androidx.fragment.app.h;
import com.amazon.aps.iva.ad.e;
import com.amazon.aps.iva.ad.f;
import com.amazon.aps.iva.ec.g;
import com.amazon.aps.iva.hd.l;
import com.amazon.aps.iva.j0.d1;
import com.amazon.aps.iva.uc.s;
/* compiled from: RequestManagerRetriever.java */
/* loaded from: classes.dex */
public final class b implements Handler.Callback {
    public static final a f = new a();
    public volatile g b;
    public final InterfaceC0948b c;
    public final f d;
    public final com.bumptech.glide.manager.a e;

    /* compiled from: RequestManagerRetriever.java */
    /* loaded from: classes.dex */
    public class a implements InterfaceC0948b {
    }

    /* compiled from: RequestManagerRetriever.java */
    /* renamed from: com.bumptech.glide.manager.b$b  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public interface InterfaceC0948b {
    }

    public b(InterfaceC0948b interfaceC0948b) {
        f bVar;
        new com.amazon.aps.iva.x.a();
        interfaceC0948b = interfaceC0948b == null ? f : interfaceC0948b;
        this.c = interfaceC0948b;
        this.e = new com.bumptech.glide.manager.a(interfaceC0948b);
        if (s.f && s.e) {
            bVar = new e();
        } else {
            bVar = new com.amazon.aps.iva.u0.b(7);
        }
        this.d = bVar;
    }

    public static Activity a(Context context) {
        if (context instanceof Activity) {
            return (Activity) context;
        }
        if (context instanceof ContextWrapper) {
            return a(((ContextWrapper) context).getBaseContext());
        }
        return null;
    }

    public final g b(Context context) {
        boolean z;
        boolean z2;
        boolean z3;
        if (context != null) {
            char[] cArr = l.a;
            if (Looper.myLooper() == Looper.getMainLooper()) {
                z = true;
            } else {
                z = false;
            }
            if (z && !(context instanceof Application)) {
                if (context instanceof h) {
                    h hVar = (h) context;
                    if (Looper.myLooper() == Looper.getMainLooper()) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    if (!z2) {
                        return b(hVar.getApplicationContext());
                    }
                    if (!hVar.isDestroyed()) {
                        this.d.a(hVar);
                        Activity a2 = a(hVar);
                        if (a2 != null && a2.isFinishing()) {
                            z3 = false;
                        } else {
                            z3 = true;
                        }
                        return this.e.a(hVar, com.bumptech.glide.a.a(hVar.getApplicationContext()), hVar.getLifecycle(), hVar.getSupportFragmentManager(), z3);
                    }
                    throw new IllegalArgumentException("You cannot start a load for a destroyed activity");
                } else if (context instanceof ContextWrapper) {
                    ContextWrapper contextWrapper = (ContextWrapper) context;
                    if (contextWrapper.getBaseContext().getApplicationContext() != null) {
                        return b(contextWrapper.getBaseContext());
                    }
                }
            }
            if (this.b == null) {
                synchronized (this) {
                    if (this.b == null) {
                        com.bumptech.glide.a a3 = com.bumptech.glide.a.a(context.getApplicationContext());
                        InterfaceC0948b interfaceC0948b = this.c;
                        com.amazon.aps.iva.hb.e eVar = new com.amazon.aps.iva.hb.e(4);
                        d1 d1Var = new d1();
                        Context applicationContext = context.getApplicationContext();
                        ((a) interfaceC0948b).getClass();
                        this.b = new g(a3, eVar, d1Var, applicationContext);
                    }
                }
            }
            return this.b;
        }
        throw new IllegalArgumentException("You cannot start a load on a null Context");
    }

    @Override // android.os.Handler.Callback
    @Deprecated
    public final boolean handleMessage(Message message) {
        return false;
    }
}
