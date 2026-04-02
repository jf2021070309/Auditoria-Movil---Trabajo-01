package com.amazon.aps.iva.v4;

import com.amazon.aps.iva.v4.f0;
import java.nio.charset.Charset;
import java.util.concurrent.ConcurrentHashMap;
/* compiled from: Protobuf.java */
/* loaded from: classes.dex */
public final class a1 {
    public static final a1 c = new a1();
    public final ConcurrentHashMap b = new ConcurrentHashMap();
    public final h0 a = new h0();

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v6, types: [com.amazon.aps.iva.v4.t0] */
    /* JADX WARN: Type inference failed for: r4v8, types: [com.amazon.aps.iva.v4.t0] */
    public final <T> e1<T> a(Class<T> cls) {
        s0 p;
        s0 s0Var;
        Class<?> cls2;
        Charset charset = y.a;
        if (cls != null) {
            ConcurrentHashMap concurrentHashMap = this.b;
            e1<T> e1Var = (e1) concurrentHashMap.get(cls);
            if (e1Var == null) {
                h0 h0Var = this.a;
                h0Var.getClass();
                Class<?> cls3 = f1.a;
                if (!w.class.isAssignableFrom(cls) && (cls2 = f1.a) != null && !cls2.isAssignableFrom(cls)) {
                    throw new IllegalArgumentException("Message classes must extend GeneratedMessageV3 or GeneratedMessageLite");
                }
                n0 messageInfoFor = h0Var.a.messageInfoFor(cls);
                if (messageInfoFor.isMessageSetWireFormat()) {
                    if (w.class.isAssignableFrom(cls)) {
                        s0Var = new t0(f1.d, r.a, messageInfoFor.getDefaultInstance());
                    } else {
                        k1<?, ?> k1Var = f1.b;
                        p<?> pVar = r.b;
                        if (pVar != null) {
                            s0Var = new t0(k1Var, pVar, messageInfoFor.getDefaultInstance());
                        } else {
                            throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
                        }
                    }
                    p = s0Var;
                } else {
                    boolean z = true;
                    if (w.class.isAssignableFrom(cls)) {
                        if (messageInfoFor.getSyntax() != z0.PROTO2) {
                            z = false;
                        }
                        if (z) {
                            p = s0.p(messageInfoFor, w0.b, f0.b, f1.d, r.a, m0.b);
                        } else {
                            p = s0.p(messageInfoFor, w0.b, f0.b, f1.d, null, m0.b);
                        }
                    } else {
                        if (messageInfoFor.getSyntax() != z0.PROTO2) {
                            z = false;
                        }
                        if (z) {
                            u0 u0Var = w0.a;
                            f0.a aVar = f0.a;
                            k1<?, ?> k1Var2 = f1.b;
                            p<?> pVar2 = r.b;
                            if (pVar2 != null) {
                                p = s0.p(messageInfoFor, u0Var, aVar, k1Var2, pVar2, m0.a);
                            } else {
                                throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
                            }
                        } else {
                            p = s0.p(messageInfoFor, w0.a, f0.a, f1.c, null, m0.a);
                        }
                    }
                }
                e1<T> e1Var2 = (e1) concurrentHashMap.putIfAbsent(cls, p);
                if (e1Var2 != null) {
                    return e1Var2;
                }
                return p;
            }
            return e1Var;
        }
        throw new NullPointerException("messageType");
    }
}
