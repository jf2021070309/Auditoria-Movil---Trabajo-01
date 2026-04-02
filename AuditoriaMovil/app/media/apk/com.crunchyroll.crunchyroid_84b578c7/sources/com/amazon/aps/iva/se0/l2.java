package com.amazon.aps.iva.se0;
/* compiled from: CoroutineContext.kt */
/* loaded from: classes4.dex */
public final class l2<T> extends com.amazon.aps.iva.xe0.p<T> {
    public final ThreadLocal<com.amazon.aps.iva.kb0.j<com.amazon.aps.iva.ob0.g, Object>> e;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public l2(com.amazon.aps.iva.ob0.d r3, com.amazon.aps.iva.ob0.g r4) {
        /*
            r2 = this;
            com.amazon.aps.iva.se0.m2 r0 = com.amazon.aps.iva.se0.m2.b
            com.amazon.aps.iva.ob0.g$b r1 = r4.get(r0)
            if (r1 != 0) goto Ld
            com.amazon.aps.iva.ob0.g r0 = r4.plus(r0)
            goto Le
        Ld:
            r0 = r4
        Le:
            r2.<init>(r3, r0)
            java.lang.ThreadLocal r0 = new java.lang.ThreadLocal
            r0.<init>()
            r2.e = r0
            com.amazon.aps.iva.ob0.g r3 = r3.getContext()
            com.amazon.aps.iva.ob0.e$a r1 = com.amazon.aps.iva.ob0.e.a.b
            com.amazon.aps.iva.ob0.g$b r3 = r3.get(r1)
            boolean r3 = r3 instanceof com.amazon.aps.iva.se0.d0
            if (r3 != 0) goto L36
            r3 = 0
            java.lang.Object r3 = com.amazon.aps.iva.xe0.u.c(r4, r3)
            com.amazon.aps.iva.xe0.u.a(r4, r3)
            com.amazon.aps.iva.kb0.j r1 = new com.amazon.aps.iva.kb0.j
            r1.<init>(r4, r3)
            r0.set(r1)
        L36:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.se0.l2.<init>(com.amazon.aps.iva.ob0.d, com.amazon.aps.iva.ob0.g):void");
    }

    @Override // com.amazon.aps.iva.xe0.p, com.amazon.aps.iva.se0.o1
    public final void y(Object obj) {
        ThreadLocal<com.amazon.aps.iva.kb0.j<com.amazon.aps.iva.ob0.g, Object>> threadLocal = this.e;
        com.amazon.aps.iva.kb0.j<com.amazon.aps.iva.ob0.g, Object> jVar = threadLocal.get();
        l2<?> l2Var = null;
        if (jVar != null) {
            com.amazon.aps.iva.xe0.u.a(jVar.b, jVar.c);
            threadLocal.set(null);
        }
        Object z = com.amazon.aps.iva.aq.k.z(obj);
        com.amazon.aps.iva.ob0.d<T> dVar = this.d;
        com.amazon.aps.iva.ob0.g context = dVar.getContext();
        Object c = com.amazon.aps.iva.xe0.u.c(context, null);
        if (c != com.amazon.aps.iva.xe0.u.a) {
            l2Var = b0.c(dVar, context, c);
        }
        try {
            dVar.resumeWith(z);
            com.amazon.aps.iva.kb0.q qVar = com.amazon.aps.iva.kb0.q.a;
        } finally {
            if (l2Var == null || l2Var.y0()) {
                com.amazon.aps.iva.xe0.u.a(context, c);
            }
        }
    }

    public final boolean y0() {
        ThreadLocal<com.amazon.aps.iva.kb0.j<com.amazon.aps.iva.ob0.g, Object>> threadLocal = this.e;
        if (threadLocal.get() == null) {
            return false;
        }
        threadLocal.set(null);
        return true;
    }
}
