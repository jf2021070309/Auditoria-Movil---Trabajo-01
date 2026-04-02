package com.amazon.aps.iva.gd0;
/* compiled from: methodSignatureMapping.kt */
/* loaded from: classes4.dex */
public abstract class p {
    public static final c a = new c(com.amazon.aps.iva.vd0.c.BOOLEAN);
    public static final c b = new c(com.amazon.aps.iva.vd0.c.CHAR);
    public static final c c = new c(com.amazon.aps.iva.vd0.c.BYTE);
    public static final c d = new c(com.amazon.aps.iva.vd0.c.SHORT);
    public static final c e = new c(com.amazon.aps.iva.vd0.c.INT);
    public static final c f = new c(com.amazon.aps.iva.vd0.c.FLOAT);
    public static final c g = new c(com.amazon.aps.iva.vd0.c.LONG);
    public static final c h = new c(com.amazon.aps.iva.vd0.c.DOUBLE);

    /* compiled from: methodSignatureMapping.kt */
    /* loaded from: classes4.dex */
    public static final class a extends p {
        public final p i;

        public a(p pVar) {
            com.amazon.aps.iva.yb0.j.f(pVar, "elementType");
            this.i = pVar;
        }
    }

    /* compiled from: methodSignatureMapping.kt */
    /* loaded from: classes4.dex */
    public static final class b extends p {
        public final String i;

        public b(String str) {
            com.amazon.aps.iva.yb0.j.f(str, "internalName");
            this.i = str;
        }
    }

    /* compiled from: methodSignatureMapping.kt */
    /* loaded from: classes4.dex */
    public static final class c extends p {
        public final com.amazon.aps.iva.vd0.c i;

        public c(com.amazon.aps.iva.vd0.c cVar) {
            this.i = cVar;
        }
    }

    public final String toString() {
        return q.e(this);
    }
}
