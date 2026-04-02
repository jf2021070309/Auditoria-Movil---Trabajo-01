package com.amazon.aps.iva.oc0;
/* compiled from: findClassInModule.kt */
/* loaded from: classes4.dex */
public final class u {

    /* compiled from: findClassInModule.kt */
    /* loaded from: classes4.dex */
    public /* synthetic */ class a extends com.amazon.aps.iva.yb0.h implements com.amazon.aps.iva.xb0.l<com.amazon.aps.iva.nd0.b, com.amazon.aps.iva.nd0.b> {
        public static final a b = new a();

        public a() {
            super(1);
        }

        @Override // com.amazon.aps.iva.yb0.b, com.amazon.aps.iva.fc0.c
        public final String getName() {
            return "getOuterClassId";
        }

        @Override // com.amazon.aps.iva.yb0.b
        public final com.amazon.aps.iva.fc0.f getOwner() {
            return com.amazon.aps.iva.yb0.e0.a(com.amazon.aps.iva.nd0.b.class);
        }

        @Override // com.amazon.aps.iva.yb0.b
        public final String getSignature() {
            return "getOuterClassId()Lorg/jetbrains/kotlin/name/ClassId;";
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final com.amazon.aps.iva.nd0.b invoke(com.amazon.aps.iva.nd0.b bVar) {
            com.amazon.aps.iva.nd0.b bVar2 = bVar;
            com.amazon.aps.iva.yb0.j.f(bVar2, "p0");
            return bVar2.g();
        }
    }

    /* compiled from: findClassInModule.kt */
    /* loaded from: classes4.dex */
    public static final class b extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<com.amazon.aps.iva.nd0.b, Integer> {
        public static final b h = new b();

        public b() {
            super(1);
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final Integer invoke(com.amazon.aps.iva.nd0.b bVar) {
            com.amazon.aps.iva.yb0.j.f(bVar, "it");
            return 0;
        }
    }

    public static final e a(c0 c0Var, com.amazon.aps.iva.nd0.b bVar) {
        com.amazon.aps.iva.yb0.j.f(c0Var, "<this>");
        com.amazon.aps.iva.yb0.j.f(bVar, "classId");
        h b2 = b(c0Var, bVar);
        if (b2 instanceof e) {
            return (e) b2;
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0152  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final com.amazon.aps.iva.oc0.h b(com.amazon.aps.iva.oc0.c0 r9, com.amazon.aps.iva.nd0.b r10) {
        /*
            Method dump skipped, instructions count: 340
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.oc0.u.b(com.amazon.aps.iva.oc0.c0, com.amazon.aps.iva.nd0.b):com.amazon.aps.iva.oc0.h");
    }

    public static final e c(c0 c0Var, com.amazon.aps.iva.nd0.b bVar, e0 e0Var) {
        com.amazon.aps.iva.yb0.j.f(c0Var, "<this>");
        com.amazon.aps.iva.yb0.j.f(bVar, "classId");
        com.amazon.aps.iva.yb0.j.f(e0Var, "notFoundClasses");
        e a2 = a(c0Var, bVar);
        if (a2 != null) {
            return a2;
        }
        return e0Var.a(bVar, com.amazon.aps.iva.ne0.s.f0(com.amazon.aps.iva.ne0.s.b0(com.amazon.aps.iva.ne0.k.R(bVar, a.b), b.h)));
    }
}
