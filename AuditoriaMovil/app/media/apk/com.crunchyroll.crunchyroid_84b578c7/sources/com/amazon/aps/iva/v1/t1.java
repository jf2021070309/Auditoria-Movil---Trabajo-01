package com.amazon.aps.iva.v1;
/* compiled from: InspectableValue.kt */
/* loaded from: classes.dex */
public final class t1 {
    public static final a a = a.h;
    public static final boolean b = false;

    /* compiled from: InspectableValue.kt */
    /* loaded from: classes.dex */
    public static final class a extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<v1, com.amazon.aps.iva.kb0.q> {
        public static final a h = new a();

        public a() {
            super(1);
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final com.amazon.aps.iva.kb0.q invoke(v1 v1Var) {
            com.amazon.aps.iva.yb0.j.f(v1Var, "$this$null");
            return com.amazon.aps.iva.kb0.q.a;
        }
    }

    public static final com.amazon.aps.iva.a1.f a(com.amazon.aps.iva.a1.f fVar, com.amazon.aps.iva.xb0.l<? super v1, com.amazon.aps.iva.kb0.q> lVar, com.amazon.aps.iva.a1.f fVar2) {
        com.amazon.aps.iva.yb0.j.f(fVar, "<this>");
        com.amazon.aps.iva.yb0.j.f(lVar, "inspectorInfo");
        com.amazon.aps.iva.yb0.j.f(fVar2, "wrapped");
        s1 s1Var = new s1(lVar);
        return fVar.o(s1Var).o(fVar2).o(s1Var.d);
    }
}
