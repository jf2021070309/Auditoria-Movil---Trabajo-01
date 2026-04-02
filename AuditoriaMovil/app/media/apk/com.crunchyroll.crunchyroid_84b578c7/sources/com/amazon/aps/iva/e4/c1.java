package com.amazon.aps.iva.e4;

import com.amazon.aps.iva.e4.g0;
import java.nio.charset.Charset;
import java.util.concurrent.ConcurrentHashMap;
/* compiled from: Protobuf.java */
/* loaded from: classes.dex */
public final class c1 {
    public static final c1 c = new c1();
    public final ConcurrentHashMap b = new ConcurrentHashMap();
    public final i0 a = new i0();

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v6, types: [com.amazon.aps.iva.e4.v0] */
    /* JADX WARN: Type inference failed for: r4v8, types: [com.amazon.aps.iva.e4.v0] */
    public final <T> g1<T> a(Class<T> cls) {
        u0 p;
        u0 u0Var;
        Class<?> cls2;
        Charset charset = z.a;
        if (cls != null) {
            ConcurrentHashMap concurrentHashMap = this.b;
            g1<T> g1Var = (g1) concurrentHashMap.get(cls);
            if (g1Var == null) {
                i0 i0Var = this.a;
                i0Var.getClass();
                Class<?> cls3 = h1.a;
                if (!x.class.isAssignableFrom(cls) && (cls2 = h1.a) != null && !cls2.isAssignableFrom(cls)) {
                    throw new IllegalArgumentException("Message classes must extend GeneratedMessage or GeneratedMessageLite");
                }
                o0 messageInfoFor = i0Var.a.messageInfoFor(cls);
                if (messageInfoFor.isMessageSetWireFormat()) {
                    if (x.class.isAssignableFrom(cls)) {
                        u0Var = new v0(h1.d, s.a, messageInfoFor.getDefaultInstance());
                    } else {
                        n1<?, ?> n1Var = h1.b;
                        q<?> qVar = s.b;
                        if (qVar != null) {
                            u0Var = new v0(n1Var, qVar, messageInfoFor.getDefaultInstance());
                        } else {
                            throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
                        }
                    }
                    p = u0Var;
                } else {
                    boolean z = true;
                    if (x.class.isAssignableFrom(cls)) {
                        if (messageInfoFor.getSyntax() != b1.PROTO2) {
                            z = false;
                        }
                        if (z) {
                            p = u0.p(messageInfoFor, y0.b, g0.b, h1.d, s.a, n0.b);
                        } else {
                            p = u0.p(messageInfoFor, y0.b, g0.b, h1.d, null, n0.b);
                        }
                    } else {
                        if (messageInfoFor.getSyntax() != b1.PROTO2) {
                            z = false;
                        }
                        if (z) {
                            w0 w0Var = y0.a;
                            g0.a aVar = g0.a;
                            n1<?, ?> n1Var2 = h1.b;
                            q<?> qVar2 = s.b;
                            if (qVar2 != null) {
                                p = u0.p(messageInfoFor, w0Var, aVar, n1Var2, qVar2, n0.a);
                            } else {
                                throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
                            }
                        } else {
                            p = u0.p(messageInfoFor, y0.a, g0.a, h1.c, null, n0.a);
                        }
                    }
                }
                g1<T> g1Var2 = (g1) concurrentHashMap.putIfAbsent(cls, p);
                if (g1Var2 != null) {
                    return g1Var2;
                }
                return p;
            }
            return g1Var;
        }
        throw new NullPointerException("messageType");
    }
}
