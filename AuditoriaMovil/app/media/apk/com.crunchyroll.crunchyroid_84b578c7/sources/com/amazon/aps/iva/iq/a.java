package com.amazon.aps.iva.iq;

import com.amazon.aps.iva.lb0.a0;
import com.amazon.aps.iva.mq.e;
import com.amazon.aps.iva.yb0.j;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArraySet;
/* compiled from: Logger.kt */
/* loaded from: classes2.dex */
public final class a {
    public final e a;
    public final ConcurrentHashMap<String, Object> b = new ConcurrentHashMap<>();
    public final CopyOnWriteArraySet<String> c = new CopyOnWriteArraySet<>();

    public a(e eVar) {
        this.a = eVar;
    }

    public static void a(a aVar, String str, Throwable th, int i) {
        a0 a0Var = null;
        if ((i & 2) != 0) {
            th = null;
        }
        if ((i & 4) != 0) {
            a0Var = a0.b;
        }
        aVar.getClass();
        j.f(str, "message");
        j.f(a0Var, "attributes");
        c(aVar, 6, str, th, a0Var);
    }

    public static void b(a aVar, String str) {
        a0 a0Var = a0.b;
        aVar.getClass();
        j.f(str, "message");
        c(aVar, 4, str, null, a0Var);
    }

    public static void c(a aVar, int i, String str, Throwable th, Map map) {
        aVar.getClass();
        j.f(str, "message");
        j.f(map, "localAttributes");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.putAll(aVar.b);
        linkedHashMap.putAll(map);
        aVar.a.e(i, str, th, linkedHashMap, aVar.c, null);
    }

    public static void e(a aVar, String str, IllegalArgumentException illegalArgumentException, int i) {
        a0 a0Var = null;
        if ((i & 2) != 0) {
            illegalArgumentException = null;
        }
        if ((i & 4) != 0) {
            a0Var = a0.b;
        }
        aVar.getClass();
        j.f(str, "message");
        j.f(a0Var, "attributes");
        c(aVar, 5, str, illegalArgumentException, a0Var);
    }

    public final void d(int i, String str, Throwable th, Map<String, ? extends Object> map) {
        j.f(str, "message");
        j.f(map, "attributes");
        c(this, i, str, th, map);
    }
}
