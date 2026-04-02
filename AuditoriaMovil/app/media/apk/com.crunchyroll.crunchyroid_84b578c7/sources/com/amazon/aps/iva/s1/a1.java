package com.amazon.aps.iva.s1;

import java.util.List;
/* compiled from: SubcomposeLayout.kt */
/* loaded from: classes.dex */
public interface a1 extends f1 {
    com.amazon.aps.iva.xb0.p<f1, com.amazon.aps.iva.o2.a, e0> N0();

    List<c0> e0(Object obj);

    @Override // com.amazon.aps.iva.s1.f1
    default List<c0> m(Object obj, com.amazon.aps.iva.xb0.p<? super com.amazon.aps.iva.o0.i, ? super Integer, com.amazon.aps.iva.kb0.q> pVar) {
        return e0(obj);
    }
}
