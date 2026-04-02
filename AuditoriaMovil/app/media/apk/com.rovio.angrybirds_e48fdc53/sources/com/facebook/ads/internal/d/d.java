package com.facebook.ads.internal.d;

import android.content.Context;
import android.util.Log;
import com.facebook.ads.internal.p.b.f;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
/* loaded from: classes2.dex */
public class d {
    private static final String a = d.class.getSimpleName();
    private static d b;
    private final Future<f> c;

    private d(final Context context) {
        this.c = Executors.newSingleThreadExecutor().submit(new Callable<f>() { // from class: com.facebook.ads.internal.d.d.1
            @Override // java.util.concurrent.Callable
            /* renamed from: a */
            public f call() {
                return new f(context);
            }
        });
    }

    public static d a(Context context) {
        if (b == null) {
            Context applicationContext = context.getApplicationContext();
            synchronized (d.class) {
                if (b == null) {
                    b = new d(applicationContext);
                }
            }
        }
        return b;
    }

    private f a() {
        try {
            return this.c.get(500L, TimeUnit.MILLISECONDS);
        } catch (InterruptedException | ExecutionException | TimeoutException e) {
            Log.e(a, "Timed out waiting for cache server.", e);
            return null;
        }
    }

    public void a(String str) {
        f a2 = a();
        if (a2 != null) {
            a2.a(str);
        }
    }

    public String b(String str) {
        f a2 = a();
        if (a2 == null) {
            return null;
        }
        return a2.b(str);
    }
}
