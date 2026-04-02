package com.facebook.ads.internal.o;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
/* loaded from: classes2.dex */
public class a {
    private static Map<String, Long> a = new ConcurrentHashMap();
    private static Map<String, Long> b = new ConcurrentHashMap();
    private static Map<String, String> c = new ConcurrentHashMap();

    private static long a(String str, com.facebook.ads.internal.protocol.c cVar) {
        if (a.containsKey(str)) {
            return a.get(str).longValue();
        }
        switch (cVar) {
            case BANNER:
                return 15000L;
            case INTERSTITIAL:
            case NATIVE:
            default:
                return -1000L;
        }
    }

    public static void a(long j, b bVar) {
        a.put(d(bVar), Long.valueOf(j));
    }

    public static void a(String str, b bVar) {
        c.put(d(bVar), str);
    }

    public static boolean a(b bVar) {
        String d = d(bVar);
        if (b.containsKey(d)) {
            return System.currentTimeMillis() - b.get(d).longValue() < a(d, bVar.b());
        }
        return false;
    }

    public static void b(b bVar) {
        b.put(d(bVar), Long.valueOf(System.currentTimeMillis()));
    }

    public static String c(b bVar) {
        return c.get(d(bVar));
    }

    private static String d(b bVar) {
        Object[] objArr = new Object[6];
        objArr[0] = bVar.a();
        objArr[1] = bVar.b();
        objArr[2] = bVar.c;
        objArr[3] = Integer.valueOf(bVar.c() == null ? 0 : bVar.c().a());
        objArr[4] = Integer.valueOf(bVar.c() != null ? bVar.c().b() : 0);
        objArr[5] = Integer.valueOf(bVar.d());
        return String.format("%s:%s:%s:%d:%d:%d", objArr);
    }
}
