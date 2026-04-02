package com.amazon.aps.iva.lp;

import android.content.Context;
import com.amazon.aps.iva.a9.k0;
import com.amazon.aps.iva.aq.j;
import com.amazon.aps.iva.aq.k;
import com.amazon.aps.iva.aq.m;
import com.amazon.aps.iva.kp.h;
import com.amazon.aps.iva.lb0.z;
import com.google.android.gms.cast.CredentialsData;
import java.lang.ref.WeakReference;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import okhttp3.CipherSuite;
import okhttp3.OkHttpClient;
/* compiled from: CoreFeature.kt */
/* loaded from: classes2.dex */
public final class a {
    public static ScheduledThreadPoolExecutor A;
    public static ExecutorService B;
    public static List<String> C;
    public static com.amazon.aps.iva.aq.a D;
    public static final long a;
    public static final long b;
    public static final CipherSuite[] c;
    public static final AtomicBoolean d;
    public static WeakReference<Context> e;
    public static com.amazon.aps.iva.l9.a f;
    public static com.amazon.aps.iva.rp.c g;
    public static m h;
    public static com.amazon.aps.iva.cq.c i;
    public static com.amazon.aps.iva.xp.a j;
    public static com.amazon.aps.iva.oq.b k;
    public static OkHttpClient l;
    public static com.amazon.aps.iva.x90.c m;
    public static String n;
    public static String o;
    public static com.amazon.aps.iva.aq.b p;
    public static String q;
    public static String r;
    public static String s;
    public static String t;
    public static boolean u;
    public static int v;
    public static String w;
    public static String x;
    public static h y;
    public static com.amazon.aps.iva.br.b z;

    static {
        TimeUnit timeUnit = TimeUnit.SECONDS;
        a = timeUnit.toMillis(45L);
        b = timeUnit.toMillis(5L);
        c = new CipherSuite[]{CipherSuite.TLS_AES_128_GCM_SHA256, CipherSuite.TLS_AES_256_GCM_SHA384, CipherSuite.TLS_CHACHA20_POLY1305_SHA256, CipherSuite.TLS_ECDHE_RSA_WITH_AES_128_GCM_SHA256, CipherSuite.TLS_ECDHE_RSA_WITH_AES_256_GCM_SHA384, CipherSuite.TLS_ECDHE_ECDSA_WITH_AES_128_GCM_SHA256, CipherSuite.TLS_ECDHE_ECDSA_WITH_AES_256_GCM_SHA384, CipherSuite.TLS_ECDHE_RSA_WITH_AES_128_CBC_SHA256, CipherSuite.TLS_ECDHE_RSA_WITH_AES_256_CBC_SHA384, CipherSuite.TLS_RSA_WITH_AES_128_CBC_SHA256, CipherSuite.TLS_RSA_WITH_AES_256_CBC_SHA256};
        d = new AtomicBoolean(false);
        e = new WeakReference<>(null);
        f = new com.amazon.aps.iva.l9.a((List) z.b);
        g = new com.amazon.aps.iva.ff0.b();
        h = new k();
        i = new com.amazon.aps.iva.cq.b();
        j = new com.amazon.aps.iva.ff0.b();
        k = new k0();
        n = "";
        o = "";
        p = new j();
        q = "";
        r = CredentialsData.CREDENTIALS_TYPE_ANDROID;
        s = "1.14.1";
        u = true;
        v = 100;
        w = "";
        x = "";
        com.amazon.aps.iva.kp.a aVar = com.amazon.aps.iva.kp.a.SMALL;
        y = h.AVERAGE;
        z = new com.amazon.aps.iva.n1.c();
    }

    public static com.amazon.aps.iva.aq.a a() {
        com.amazon.aps.iva.aq.a aVar = D;
        if (aVar != null) {
            return aVar;
        }
        com.amazon.aps.iva.yb0.j.m("androidInfoProvider");
        throw null;
    }

    public static OkHttpClient b() {
        OkHttpClient okHttpClient = l;
        if (okHttpClient != null) {
            return okHttpClient;
        }
        com.amazon.aps.iva.yb0.j.m("okHttpClient");
        throw null;
    }

    public static ExecutorService c() {
        ExecutorService executorService = B;
        if (executorService != null) {
            return executorService;
        }
        com.amazon.aps.iva.yb0.j.m("persistenceExecutorService");
        throw null;
    }
}
