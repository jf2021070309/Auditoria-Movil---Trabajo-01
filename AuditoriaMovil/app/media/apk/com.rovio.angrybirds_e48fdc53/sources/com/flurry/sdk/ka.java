package com.flurry.sdk;

import android.content.Context;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.text.TextUtils;
/* loaded from: classes2.dex */
public class ka {
    private static final String e = ka.class.getSimpleName();
    private static ka f;
    public final Context a;
    public final Handler c;
    public final String d;
    private final kq h;
    public final Handler b = new Handler(Looper.getMainLooper());
    private final HandlerThread g = new HandlerThread("FlurryAgent");

    private ka(Context context, String str) {
        this.a = context.getApplicationContext();
        this.g.start();
        this.c = new Handler(this.g.getLooper());
        this.d = str;
        this.h = new kq();
    }

    public static ka a() {
        return f;
    }

    public static synchronized void a(Context context, String str) {
        synchronized (ka.class) {
            if (f != null) {
                if (!f.d.equals(str)) {
                    throw new IllegalStateException("Only one API key per application is supported!");
                }
                ko.e(e, "Flurry is already initialized");
            } else if (context == null) {
                throw new IllegalArgumentException("Context cannot be null");
            } else {
                if (TextUtils.isEmpty(str)) {
                    throw new IllegalArgumentException("API key must be specified");
                }
                ka kaVar = new ka(context, str);
                f = kaVar;
                kaVar.h.a(context);
            }
        }
    }

    public final void a(Runnable runnable) {
        this.b.post(runnable);
    }

    public final void b(Runnable runnable) {
        this.c.post(runnable);
    }

    public final void a(Runnable runnable, long j) {
        if (runnable != null) {
            this.c.postDelayed(runnable, j);
        }
    }

    public final kr a(Class<? extends kr> cls) {
        return this.h.b(cls);
    }
}
