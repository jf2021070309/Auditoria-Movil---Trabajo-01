package com.amazon.aps.iva.sd0;

import com.amazon.aps.iva.ee0.e0;
/* compiled from: constantValues.kt */
/* loaded from: classes4.dex */
public abstract class k extends g<com.amazon.aps.iva.kb0.q> {

    /* compiled from: constantValues.kt */
    /* loaded from: classes4.dex */
    public static final class a extends k {
        public final String b;

        public a(String str) {
            this.b = str;
        }

        @Override // com.amazon.aps.iva.sd0.g
        public final e0 a(com.amazon.aps.iva.oc0.c0 c0Var) {
            com.amazon.aps.iva.yb0.j.f(c0Var, "module");
            return com.amazon.aps.iva.ge0.k.c(com.amazon.aps.iva.ge0.j.ERROR_CONSTANT_VALUE, this.b);
        }

        @Override // com.amazon.aps.iva.sd0.g
        public final String toString() {
            return this.b;
        }
    }

    public k() {
        super(com.amazon.aps.iva.kb0.q.a);
    }

    @Override // com.amazon.aps.iva.sd0.g
    public final com.amazon.aps.iva.kb0.q b() {
        throw new UnsupportedOperationException();
    }
}
