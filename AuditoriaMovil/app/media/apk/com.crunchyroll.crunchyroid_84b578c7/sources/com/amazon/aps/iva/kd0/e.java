package com.amazon.aps.iva.kd0;

import com.amazon.aps.iva.od0.h;
import com.amazon.aps.iva.yb0.j;
import java.util.List;
/* compiled from: ProtoBufUtil.kt */
/* loaded from: classes4.dex */
public final class e {
    /* JADX WARN: Multi-variable type inference failed */
    public static final <M extends h.d<M>, T> T a(h.d<M> dVar, h.f<M, T> fVar) {
        j.f(dVar, "<this>");
        j.f(fVar, "extension");
        if (dVar.g(fVar)) {
            return (T) dVar.f(fVar);
        }
        return null;
    }

    public static final <M extends h.d<M>, T> T b(h.d<M> dVar, h.f<M, List<T>> fVar, int i) {
        int size;
        j.f(dVar, "<this>");
        dVar.k(fVar);
        com.amazon.aps.iva.od0.g<h.e> gVar = dVar.b;
        gVar.getClass();
        h.e eVar = fVar.d;
        if (eVar.e) {
            Object e = gVar.e(eVar);
            if (e == null) {
                size = 0;
            } else {
                size = ((List) e).size();
            }
            if (i < size) {
                dVar.k(fVar);
                if (eVar.e) {
                    Object e2 = gVar.e(eVar);
                    if (e2 != null) {
                        return (T) fVar.a(((List) e2).get(i));
                    }
                    throw new IndexOutOfBoundsException();
                }
                throw new IllegalArgumentException("getRepeatedField() can only be called on repeated fields.");
            }
            return null;
        }
        throw new IllegalArgumentException("getRepeatedField() can only be called on repeated fields.");
    }
}
