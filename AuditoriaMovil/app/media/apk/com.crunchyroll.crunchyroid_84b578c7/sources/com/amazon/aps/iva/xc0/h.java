package com.amazon.aps.iva.xc0;
/* compiled from: specialBuiltinMembers.kt */
/* loaded from: classes4.dex */
public final class h extends j0 {
    public static final /* synthetic */ int m = 0;

    /* compiled from: specialBuiltinMembers.kt */
    /* loaded from: classes4.dex */
    public static final class a extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<com.amazon.aps.iva.oc0.b, Boolean> {
        public static final a h = new a();

        public a() {
            super(1);
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final Boolean invoke(com.amazon.aps.iva.oc0.b bVar) {
            com.amazon.aps.iva.oc0.b bVar2 = bVar;
            com.amazon.aps.iva.yb0.j.f(bVar2, "it");
            int i = h.m;
            return Boolean.valueOf(com.amazon.aps.iva.lb0.x.m0(j0.g, com.amazon.aps.iva.gd0.x.b(bVar2)));
        }
    }

    public static final com.amazon.aps.iva.oc0.v a(com.amazon.aps.iva.oc0.v vVar) {
        com.amazon.aps.iva.yb0.j.f(vVar, "functionDescriptor");
        com.amazon.aps.iva.nd0.f name = vVar.getName();
        com.amazon.aps.iva.yb0.j.e(name, "functionDescriptor.name");
        if (!b(name)) {
            return null;
        }
        return (com.amazon.aps.iva.oc0.v) com.amazon.aps.iva.ud0.b.b(vVar, a.h);
    }

    public static boolean b(com.amazon.aps.iva.nd0.f fVar) {
        com.amazon.aps.iva.yb0.j.f(fVar, "<this>");
        return j0.f.contains(fVar);
    }
}
