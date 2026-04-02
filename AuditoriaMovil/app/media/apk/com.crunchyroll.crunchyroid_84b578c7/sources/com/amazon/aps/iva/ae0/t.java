package com.amazon.aps.iva.ae0;

import com.amazon.aps.iva.ee0.m0;
/* compiled from: FlexibleTypeDeserializer.kt */
/* loaded from: classes4.dex */
public interface t {

    /* compiled from: FlexibleTypeDeserializer.kt */
    /* loaded from: classes4.dex */
    public static final class a implements t {
        public static final a a = new a();

        @Override // com.amazon.aps.iva.ae0.t
        public final com.amazon.aps.iva.ee0.e0 a(com.amazon.aps.iva.id0.p pVar, String str, m0 m0Var, m0 m0Var2) {
            com.amazon.aps.iva.yb0.j.f(pVar, "proto");
            com.amazon.aps.iva.yb0.j.f(str, "flexibleId");
            com.amazon.aps.iva.yb0.j.f(m0Var, "lowerBound");
            com.amazon.aps.iva.yb0.j.f(m0Var2, "upperBound");
            throw new IllegalArgumentException("This method should not be used.");
        }
    }

    com.amazon.aps.iva.ee0.e0 a(com.amazon.aps.iva.id0.p pVar, String str, m0 m0Var, m0 m0Var2);
}
