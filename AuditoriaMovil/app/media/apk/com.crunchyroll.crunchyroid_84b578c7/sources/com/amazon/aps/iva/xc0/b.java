package com.amazon.aps.iva.xc0;

import com.amazon.aps.iva.lc0.o;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.concurrent.ConcurrentHashMap;
/* compiled from: AbstractAnnotationTypeQualifierResolver.kt */
/* loaded from: classes4.dex */
public abstract class b<TAnnotation> {
    public static final LinkedHashMap c;
    public final y a;
    public final ConcurrentHashMap<Object, TAnnotation> b;

    static {
        c[] values;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (c cVar : c.values()) {
            String javaTarget = cVar.getJavaTarget();
            if (linkedHashMap.get(javaTarget) == null) {
                linkedHashMap.put(javaTarget, cVar);
            }
        }
        c = linkedHashMap;
    }

    public b(y yVar) {
        com.amazon.aps.iva.yb0.j.f(yVar, "javaTypeEnhancementState");
        this.a = yVar;
        this.b = new ConcurrentHashMap<>();
    }

    public abstract ArrayList a(Object obj, boolean z);

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:100:0x0139 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0015 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0100  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.amazon.aps.iva.xc0.z b(com.amazon.aps.iva.xc0.z r11, java.lang.Iterable<? extends TAnnotation> r12) {
        /*
            Method dump skipped, instructions count: 392
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.xc0.b.b(com.amazon.aps.iva.xc0.z, java.lang.Iterable):com.amazon.aps.iva.xc0.z");
    }

    public final com.amazon.aps.iva.fd0.l c(TAnnotation tannotation, com.amazon.aps.iva.xb0.l<? super TAnnotation, Boolean> lVar) {
        com.amazon.aps.iva.fd0.l j;
        com.amazon.aps.iva.fd0.l j2 = j(tannotation, lVar.invoke(tannotation).booleanValue());
        if (j2 != null) {
            return j2;
        }
        TAnnotation l = l(tannotation);
        if (l == null) {
            return null;
        }
        h0 k = k(tannotation);
        if (k == null) {
            k = this.a.a.a;
        }
        if (k.isIgnore() || (j = j(l, lVar.invoke(l).booleanValue())) == null) {
            return null;
        }
        return com.amazon.aps.iva.fd0.l.a(j, null, k.isWarning(), 1);
    }

    public final TAnnotation d(TAnnotation tannotation, com.amazon.aps.iva.nd0.c cVar) {
        for (TAnnotation tannotation2 : g(tannotation)) {
            if (com.amazon.aps.iva.yb0.j.a(e(tannotation2), cVar)) {
                return tannotation2;
            }
        }
        return null;
    }

    public abstract com.amazon.aps.iva.nd0.c e(TAnnotation tannotation);

    public abstract com.amazon.aps.iva.oc0.e f(Object obj);

    public abstract Iterable<TAnnotation> g(TAnnotation tannotation);

    public final boolean h(TAnnotation tannotation, com.amazon.aps.iva.nd0.c cVar) {
        Iterable<TAnnotation> g = g(tannotation);
        if ((g instanceof Collection) && ((Collection) g).isEmpty()) {
            return false;
        }
        for (TAnnotation tannotation2 : g) {
            if (com.amazon.aps.iva.yb0.j.a(e(tannotation2), cVar)) {
                return true;
            }
        }
        return false;
    }

    public final boolean i(TAnnotation tannotation) {
        com.amazon.aps.iva.yb0.j.f(tannotation, "annotation");
        TAnnotation d = d(tannotation, o.a.t);
        if (d == null) {
            return false;
        }
        ArrayList<String> a = a(d, false);
        if ((a instanceof Collection) && a.isEmpty()) {
            return false;
        }
        for (String str : a) {
            if (com.amazon.aps.iva.yb0.j.a(str, com.amazon.aps.iva.pc0.n.TYPE.name())) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x0081, code lost:
        if (r7.equals("ALWAYS") != false) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0096, code lost:
        if (r7.equals("NEVER") == false) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x009f, code lost:
        if (r7.equals("MAYBE") == false) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00a2, code lost:
        r7 = com.amazon.aps.iva.fd0.k.NULLABLE;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.amazon.aps.iva.fd0.l j(TAnnotation r7, boolean r8) {
        /*
            Method dump skipped, instructions count: 246
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.xc0.b.j(java.lang.Object, boolean):com.amazon.aps.iva.fd0.l");
    }

    public final h0 k(TAnnotation tannotation) {
        ArrayList a;
        String str;
        y yVar = this.a;
        h0 h0Var = yVar.a.c.get(e(tannotation));
        if (h0Var != null) {
            return h0Var;
        }
        TAnnotation d = d(tannotation, d.d);
        if (d != null && (a = a(d, false)) != null && (str = (String) com.amazon.aps.iva.lb0.x.u0(a)) != null) {
            h0 h0Var2 = yVar.a.b;
            if (h0Var2 == null) {
                int hashCode = str.hashCode();
                if (hashCode != -2137067054) {
                    if (hashCode != -1838656823) {
                        if (hashCode == 2656902 && str.equals("WARN")) {
                            return h0.WARN;
                        }
                    } else if (str.equals("STRICT")) {
                        return h0.STRICT;
                    }
                } else if (str.equals("IGNORE")) {
                    return h0.IGNORE;
                }
            } else {
                return h0Var2;
            }
        }
        return null;
    }

    public final TAnnotation l(TAnnotation tannotation) {
        TAnnotation tannotation2;
        com.amazon.aps.iva.yb0.j.f(tannotation, "annotation");
        if (this.a.a.d) {
            return null;
        }
        if (!com.amazon.aps.iva.lb0.x.m0(d.h, e(tannotation)) && !h(tannotation, d.b)) {
            if (!h(tannotation, d.a)) {
                return null;
            }
            ConcurrentHashMap<Object, TAnnotation> concurrentHashMap = this.b;
            com.amazon.aps.iva.oc0.e f = f(tannotation);
            TAnnotation tannotation3 = concurrentHashMap.get(f);
            if (tannotation3 == null) {
                Iterator<TAnnotation> it = g(tannotation).iterator();
                while (true) {
                    if (it.hasNext()) {
                        tannotation2 = l(it.next());
                        if (tannotation2 != null) {
                            break;
                        }
                    } else {
                        tannotation2 = null;
                        break;
                    }
                }
                if (tannotation2 == null) {
                    return null;
                }
                TAnnotation putIfAbsent = concurrentHashMap.putIfAbsent(f, tannotation2);
                if (putIfAbsent != null) {
                    return putIfAbsent;
                }
                return tannotation2;
            }
            return tannotation3;
        }
        return tannotation;
    }
}
