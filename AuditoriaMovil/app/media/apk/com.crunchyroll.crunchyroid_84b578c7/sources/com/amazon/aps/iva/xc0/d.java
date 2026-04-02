package com.amazon.aps.iva.xc0;

import com.amazon.aps.iva.e4.l1;
import com.amazon.aps.iva.ee0.f1;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
/* compiled from: AnnotationQualifiersFqNames.kt */
/* loaded from: classes4.dex */
public final class d {
    public static final com.amazon.aps.iva.nd0.c a = new com.amazon.aps.iva.nd0.c("javax.annotation.meta.TypeQualifierNickname");
    public static final com.amazon.aps.iva.nd0.c b = new com.amazon.aps.iva.nd0.c("javax.annotation.meta.TypeQualifier");
    public static final com.amazon.aps.iva.nd0.c c = new com.amazon.aps.iva.nd0.c("javax.annotation.meta.TypeQualifierDefault");
    public static final com.amazon.aps.iva.nd0.c d = new com.amazon.aps.iva.nd0.c("kotlin.annotations.jvm.UnderMigration");
    public static final List<c> e;
    public static final Map<com.amazon.aps.iva.nd0.c, s> f;
    public static final LinkedHashMap g;
    public static final Set<com.amazon.aps.iva.nd0.c> h;

    static {
        c cVar = c.FIELD;
        c cVar2 = c.METHOD_RETURN_TYPE;
        c cVar3 = c.VALUE_PARAMETER;
        List<c> K = f1.K(cVar, cVar2, cVar3, c.TYPE_PARAMETER_BOUNDS, c.TYPE_USE);
        e = K;
        com.amazon.aps.iva.nd0.c cVar4 = e0.c;
        com.amazon.aps.iva.fd0.k kVar = com.amazon.aps.iva.fd0.k.NOT_NULL;
        List<c> list = K;
        Map<com.amazon.aps.iva.nd0.c, s> U = com.amazon.aps.iva.lb0.i0.U(new com.amazon.aps.iva.kb0.j(cVar4, new s(new com.amazon.aps.iva.fd0.l(kVar, false), list, false)), new com.amazon.aps.iva.kb0.j(e0.f, new s(new com.amazon.aps.iva.fd0.l(kVar, false), list, false)));
        f = U;
        g = com.amazon.aps.iva.lb0.i0.W(com.amazon.aps.iva.lb0.i0.U(new com.amazon.aps.iva.kb0.j(new com.amazon.aps.iva.nd0.c("javax.annotation.ParametersAreNullableByDefault"), new s(new com.amazon.aps.iva.fd0.l(com.amazon.aps.iva.fd0.k.NULLABLE, false), f1.J(cVar3))), new com.amazon.aps.iva.kb0.j(new com.amazon.aps.iva.nd0.c("javax.annotation.ParametersAreNonnullByDefault"), new s(new com.amazon.aps.iva.fd0.l(kVar, false), f1.J(cVar3)))), U);
        h = l1.I(e0.h, e0.i);
    }
}
