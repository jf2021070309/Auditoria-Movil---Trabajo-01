package com.amazon.aps.iva.rc0;
/* compiled from: PackageViewDescriptorFactory.kt */
/* loaded from: classes4.dex */
public interface j0 {
    public static final a a = a.a;

    /* compiled from: PackageViewDescriptorFactory.kt */
    /* loaded from: classes4.dex */
    public static final class a {
        public static final /* synthetic */ a a = new a();
        public static final com.amazon.aps.iva.a9.w b = new com.amazon.aps.iva.a9.w("PackageViewDescriptorFactory");
    }

    /* compiled from: PackageViewDescriptorFactory.kt */
    /* loaded from: classes4.dex */
    public static final class b implements j0 {
        public static final b b = new b();

        @Override // com.amazon.aps.iva.rc0.j0
        public final z a(g0 g0Var, com.amazon.aps.iva.nd0.c cVar, com.amazon.aps.iva.de0.l lVar) {
            com.amazon.aps.iva.yb0.j.f(g0Var, "module");
            com.amazon.aps.iva.yb0.j.f(cVar, "fqName");
            com.amazon.aps.iva.yb0.j.f(lVar, "storageManager");
            return new z(g0Var, cVar, lVar);
        }
    }

    z a(g0 g0Var, com.amazon.aps.iva.nd0.c cVar, com.amazon.aps.iva.de0.l lVar);
}
