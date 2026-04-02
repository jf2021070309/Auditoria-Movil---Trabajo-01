package com.amazon.aps.iva.xc0;
/* compiled from: JavaNullabilityAnnotationSettings.kt */
/* loaded from: classes4.dex */
public final class w {
    public static final com.amazon.aps.iva.nd0.c a;
    public static final com.amazon.aps.iva.nd0.c[] b;
    public static final g0 c;
    public static final x d;

    static {
        com.amazon.aps.iva.nd0.c cVar = new com.amazon.aps.iva.nd0.c("org.jspecify.nullness");
        com.amazon.aps.iva.nd0.c cVar2 = new com.amazon.aps.iva.nd0.c("org.jspecify.annotations");
        a = cVar2;
        com.amazon.aps.iva.nd0.c cVar3 = new com.amazon.aps.iva.nd0.c("io.reactivex.rxjava3.annotations");
        com.amazon.aps.iva.nd0.c cVar4 = new com.amazon.aps.iva.nd0.c("org.checkerframework.checker.nullness.compatqual");
        String b2 = cVar3.b();
        b = new com.amazon.aps.iva.nd0.c[]{new com.amazon.aps.iva.nd0.c(b2.concat(".Nullable")), new com.amazon.aps.iva.nd0.c(b2.concat(".NonNull"))};
        com.amazon.aps.iva.nd0.c cVar5 = new com.amazon.aps.iva.nd0.c("org.jetbrains.annotations");
        x xVar = x.d;
        com.amazon.aps.iva.kb0.j jVar = new com.amazon.aps.iva.kb0.j(cVar5, xVar);
        com.amazon.aps.iva.kb0.j jVar2 = new com.amazon.aps.iva.kb0.j(new com.amazon.aps.iva.nd0.c("androidx.annotation"), xVar);
        com.amazon.aps.iva.kb0.j jVar3 = new com.amazon.aps.iva.kb0.j(new com.amazon.aps.iva.nd0.c("android.support.annotation"), xVar);
        com.amazon.aps.iva.kb0.j jVar4 = new com.amazon.aps.iva.kb0.j(new com.amazon.aps.iva.nd0.c("android.annotation"), xVar);
        com.amazon.aps.iva.kb0.j jVar5 = new com.amazon.aps.iva.kb0.j(new com.amazon.aps.iva.nd0.c("com.android.annotations"), xVar);
        com.amazon.aps.iva.kb0.j jVar6 = new com.amazon.aps.iva.kb0.j(new com.amazon.aps.iva.nd0.c("org.eclipse.jdt.annotation"), xVar);
        com.amazon.aps.iva.kb0.j jVar7 = new com.amazon.aps.iva.kb0.j(new com.amazon.aps.iva.nd0.c("org.checkerframework.checker.nullness.qual"), xVar);
        com.amazon.aps.iva.kb0.j jVar8 = new com.amazon.aps.iva.kb0.j(cVar4, xVar);
        com.amazon.aps.iva.kb0.j jVar9 = new com.amazon.aps.iva.kb0.j(new com.amazon.aps.iva.nd0.c("javax.annotation"), xVar);
        com.amazon.aps.iva.kb0.j jVar10 = new com.amazon.aps.iva.kb0.j(new com.amazon.aps.iva.nd0.c("edu.umd.cs.findbugs.annotations"), xVar);
        com.amazon.aps.iva.kb0.j jVar11 = new com.amazon.aps.iva.kb0.j(new com.amazon.aps.iva.nd0.c("io.reactivex.annotations"), xVar);
        com.amazon.aps.iva.nd0.c cVar6 = new com.amazon.aps.iva.nd0.c("androidx.annotation.RecentlyNullable");
        h0 h0Var = h0.WARN;
        com.amazon.aps.iva.kb0.j jVar12 = new com.amazon.aps.iva.kb0.j(cVar6, new x(h0Var, 4));
        com.amazon.aps.iva.kb0.j jVar13 = new com.amazon.aps.iva.kb0.j(new com.amazon.aps.iva.nd0.c("androidx.annotation.RecentlyNonNull"), new x(h0Var, 4));
        com.amazon.aps.iva.kb0.j jVar14 = new com.amazon.aps.iva.kb0.j(new com.amazon.aps.iva.nd0.c("lombok"), xVar);
        com.amazon.aps.iva.kb0.d dVar = new com.amazon.aps.iva.kb0.d(9, 0);
        h0 h0Var2 = h0.STRICT;
        c = new g0(com.amazon.aps.iva.lb0.i0.U(jVar, jVar2, jVar3, jVar4, jVar5, jVar6, jVar7, jVar8, jVar9, jVar10, jVar11, jVar12, jVar13, jVar14, new com.amazon.aps.iva.kb0.j(cVar, new x(h0Var, dVar, h0Var2)), new com.amazon.aps.iva.kb0.j(cVar2, new x(h0Var, new com.amazon.aps.iva.kb0.d(9, 0), h0Var2)), new com.amazon.aps.iva.kb0.j(cVar3, new x(h0Var, new com.amazon.aps.iva.kb0.d(8, 0), h0Var2))));
        d = new x(h0Var, 4);
    }
}
