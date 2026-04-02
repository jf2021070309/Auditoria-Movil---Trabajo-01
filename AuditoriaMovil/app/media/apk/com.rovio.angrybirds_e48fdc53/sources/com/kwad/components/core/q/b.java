package com.kwad.components.core.q;

import com.kwad.sdk.api.core.SpeedLimitApi;
import java.io.InputStream;
import java.util.Collections;
import java.util.Set;
import java.util.WeakHashMap;
/* loaded from: classes.dex */
public class b {
    private static volatile b Qt;
    private static volatile int Qu = 204800;
    static volatile boolean Qv = true;
    static volatile boolean Qw = false;
    static volatile Set<c> Qx = Collections.synchronizedSet(Collections.newSetFromMap(new WeakHashMap()));

    public static synchronized void a(c cVar) {
        synchronized (b.class) {
            if (Qx.contains(cVar)) {
                Qx.remove(cVar);
            }
        }
    }

    public static void e(boolean z, int i) {
        if (i > 0) {
            Qu = i * 1024;
        }
        Qv = z;
    }

    public static b pN() {
        if (Qt == null) {
            synchronized (b.class) {
                if (Qt == null) {
                    Qt = new b();
                }
            }
        }
        return Qt;
    }

    public static boolean pO() {
        return Qv;
    }

    public static int pP() {
        return Qu / 1024;
    }

    public static void register() {
        try {
            com.kwad.sdk.service.b.b(SpeedLimitApi.class, a.class);
        } catch (Throwable th) {
        }
    }

    private static synchronized InputStream wrap(InputStream inputStream) {
        c cVar;
        synchronized (b.class) {
            cVar = new c(inputStream, Qu / (Qx.size() + 1));
            Qx.add(cVar);
        }
        return cVar;
    }

    public static InputStream wrapInputStream(InputStream inputStream) {
        return wrap(inputStream);
    }

    public final synchronized int pQ() {
        int i;
        i = 0;
        try {
            for (c cVar : Qx) {
                i += (int) cVar.pR();
            }
        } catch (Exception e) {
        }
        return i;
    }
}
