package com.amazon.aps.iva.be0;

import com.amazon.aps.iva.oe0.m;
import com.amazon.aps.iva.yb0.j;
/* compiled from: BuiltInSerializerProtocol.kt */
/* loaded from: classes4.dex */
public final class a extends com.amazon.aps.iva.zd0.a {
    public static final a q = new a();

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public a() {
        /*
            r14 = this;
            com.amazon.aps.iva.od0.f r1 = new com.amazon.aps.iva.od0.f
            r1.<init>()
            com.amazon.aps.iva.jd0.b.a(r1)
            com.amazon.aps.iva.od0.h$f<com.amazon.aps.iva.id0.k, java.lang.Integer> r2 = com.amazon.aps.iva.jd0.b.a
            java.lang.String r0 = "packageFqName"
            com.amazon.aps.iva.yb0.j.e(r2, r0)
            com.amazon.aps.iva.od0.h$f<com.amazon.aps.iva.id0.c, java.util.List<com.amazon.aps.iva.id0.a>> r3 = com.amazon.aps.iva.jd0.b.c
            java.lang.String r0 = "constructorAnnotation"
            com.amazon.aps.iva.yb0.j.e(r3, r0)
            com.amazon.aps.iva.od0.h$f<com.amazon.aps.iva.id0.b, java.util.List<com.amazon.aps.iva.id0.a>> r4 = com.amazon.aps.iva.jd0.b.b
            java.lang.String r0 = "classAnnotation"
            com.amazon.aps.iva.yb0.j.e(r4, r0)
            com.amazon.aps.iva.od0.h$f<com.amazon.aps.iva.id0.h, java.util.List<com.amazon.aps.iva.id0.a>> r5 = com.amazon.aps.iva.jd0.b.d
            java.lang.String r0 = "functionAnnotation"
            com.amazon.aps.iva.yb0.j.e(r5, r0)
            com.amazon.aps.iva.od0.h$f<com.amazon.aps.iva.id0.m, java.util.List<com.amazon.aps.iva.id0.a>> r6 = com.amazon.aps.iva.jd0.b.e
            java.lang.String r0 = "propertyAnnotation"
            com.amazon.aps.iva.yb0.j.e(r6, r0)
            com.amazon.aps.iva.od0.h$f<com.amazon.aps.iva.id0.m, java.util.List<com.amazon.aps.iva.id0.a>> r7 = com.amazon.aps.iva.jd0.b.f
            java.lang.String r0 = "propertyGetterAnnotation"
            com.amazon.aps.iva.yb0.j.e(r7, r0)
            com.amazon.aps.iva.od0.h$f<com.amazon.aps.iva.id0.m, java.util.List<com.amazon.aps.iva.id0.a>> r8 = com.amazon.aps.iva.jd0.b.g
            java.lang.String r0 = "propertySetterAnnotation"
            com.amazon.aps.iva.yb0.j.e(r8, r0)
            com.amazon.aps.iva.od0.h$f<com.amazon.aps.iva.id0.f, java.util.List<com.amazon.aps.iva.id0.a>> r9 = com.amazon.aps.iva.jd0.b.i
            java.lang.String r0 = "enumEntryAnnotation"
            com.amazon.aps.iva.yb0.j.e(r9, r0)
            com.amazon.aps.iva.od0.h$f<com.amazon.aps.iva.id0.m, com.amazon.aps.iva.id0.a$b$c> r10 = com.amazon.aps.iva.jd0.b.h
            java.lang.String r0 = "compileTimeValue"
            com.amazon.aps.iva.yb0.j.e(r10, r0)
            com.amazon.aps.iva.od0.h$f<com.amazon.aps.iva.id0.t, java.util.List<com.amazon.aps.iva.id0.a>> r11 = com.amazon.aps.iva.jd0.b.j
            java.lang.String r0 = "parameterAnnotation"
            com.amazon.aps.iva.yb0.j.e(r11, r0)
            com.amazon.aps.iva.od0.h$f<com.amazon.aps.iva.id0.p, java.util.List<com.amazon.aps.iva.id0.a>> r12 = com.amazon.aps.iva.jd0.b.k
            java.lang.String r0 = "typeAnnotation"
            com.amazon.aps.iva.yb0.j.e(r12, r0)
            com.amazon.aps.iva.od0.h$f<com.amazon.aps.iva.id0.r, java.util.List<com.amazon.aps.iva.id0.a>> r13 = com.amazon.aps.iva.jd0.b.l
            java.lang.String r0 = "typeParameterAnnotation"
            com.amazon.aps.iva.yb0.j.e(r13, r0)
            r0 = r14
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.be0.a.<init>():void");
    }

    public static String a(com.amazon.aps.iva.nd0.c cVar) {
        String b;
        j.f(cVar, "fqName");
        StringBuilder sb = new StringBuilder();
        sb.append(m.e0(cVar.b(), '.', '/'));
        sb.append('/');
        if (cVar.d()) {
            b = "default-package";
        } else {
            b = cVar.f().b();
            j.e(b, "fqName.shortName().asString()");
        }
        sb.append(b.concat(".kotlin_builtins"));
        return sb.toString();
    }
}
