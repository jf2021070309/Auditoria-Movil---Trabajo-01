package com.amazon.aps.iva.uc0;

import java.lang.reflect.Method;
/* compiled from: ReflectJavaClass.kt */
/* loaded from: classes4.dex */
public final class p extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<Method, Boolean> {
    public final /* synthetic */ r h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(r rVar) {
        super(1);
        this.h = rVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0045, code lost:
        if (r5 != false) goto L16;
     */
    @Override // com.amazon.aps.iva.xb0.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Boolean invoke(java.lang.reflect.Method r5) {
        /*
            r4 = this;
            java.lang.reflect.Method r5 = (java.lang.reflect.Method) r5
            boolean r0 = r5.isSynthetic()
            r1 = 0
            if (r0 == 0) goto La
            goto L48
        La:
            com.amazon.aps.iva.uc0.r r0 = r4.h
            boolean r0 = r0.u()
            r2 = 1
            if (r0 == 0) goto L47
            java.lang.String r0 = r5.getName()
            java.lang.String r3 = "values"
            boolean r3 = com.amazon.aps.iva.yb0.j.a(r0, r3)
            if (r3 == 0) goto L2d
            java.lang.Class[] r5 = r5.getParameterTypes()
            java.lang.String r0 = "method.parameterTypes"
            com.amazon.aps.iva.yb0.j.e(r5, r0)
            int r5 = r5.length
            if (r5 != 0) goto L44
            r5 = r2
            goto L45
        L2d:
            java.lang.String r3 = "valueOf"
            boolean r0 = com.amazon.aps.iva.yb0.j.a(r0, r3)
            if (r0 == 0) goto L44
            java.lang.Class[] r5 = r5.getParameterTypes()
            java.lang.Class[] r0 = new java.lang.Class[r2]
            java.lang.Class<java.lang.String> r3 = java.lang.String.class
            r0[r1] = r3
            boolean r5 = java.util.Arrays.equals(r5, r0)
            goto L45
        L44:
            r5 = r1
        L45:
            if (r5 != 0) goto L48
        L47:
            r1 = r2
        L48:
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r1)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.uc0.p.invoke(java.lang.Object):java.lang.Object");
    }
}
