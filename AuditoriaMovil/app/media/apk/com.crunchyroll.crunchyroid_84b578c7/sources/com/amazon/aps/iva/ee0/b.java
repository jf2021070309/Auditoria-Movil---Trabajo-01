package com.amazon.aps.iva.ee0;

import java.util.Collection;
import java.util.Collections;
import java.util.List;
/* compiled from: AbstractClassTypeConstructor.java */
/* loaded from: classes4.dex */
public abstract class b extends h {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(com.amazon.aps.iva.de0.l lVar) {
        super(lVar);
        if (lVar != null) {
        } else {
            o(0);
            throw null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0045  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static /* synthetic */ void o(int r9) {
        /*
            r0 = 4
            r1 = 3
            r2 = 1
            if (r9 == r2) goto Lc
            if (r9 == r1) goto Lc
            if (r9 == r0) goto Lc
            java.lang.String r3 = "Argument for @NotNull parameter '%s' of %s.%s must not be null"
            goto Le
        Lc:
            java.lang.String r3 = "@NotNull method %s.%s must not return null"
        Le:
            r4 = 2
            if (r9 == r2) goto L17
            if (r9 == r1) goto L17
            if (r9 == r0) goto L17
            r5 = r1
            goto L18
        L17:
            r5 = r4
        L18:
            java.lang.Object[] r5 = new java.lang.Object[r5]
            java.lang.String r6 = "kotlin/reflect/jvm/internal/impl/types/AbstractClassTypeConstructor"
            r7 = 0
            if (r9 == r2) goto L2f
            if (r9 == r4) goto L2a
            if (r9 == r1) goto L2f
            if (r9 == r0) goto L2f
            java.lang.String r8 = "storageManager"
            r5[r7] = r8
            goto L31
        L2a:
            java.lang.String r8 = "classifier"
            r5[r7] = r8
            goto L31
        L2f:
            r5[r7] = r6
        L31:
            if (r9 == r2) goto L3f
            if (r9 == r1) goto L3a
            if (r9 == r0) goto L3a
            r5[r2] = r6
            goto L43
        L3a:
            java.lang.String r6 = "getAdditionalNeighboursInSupertypeGraph"
            r5[r2] = r6
            goto L43
        L3f:
            java.lang.String r6 = "getBuiltIns"
            r5[r2] = r6
        L43:
            if (r9 == r2) goto L54
            if (r9 == r4) goto L50
            if (r9 == r1) goto L54
            if (r9 == r0) goto L54
            java.lang.String r6 = "<init>"
            r5[r4] = r6
            goto L54
        L50:
            java.lang.String r6 = "isSameClassifier"
            r5[r4] = r6
        L54:
            java.lang.String r3 = java.lang.String.format(r3, r5)
            if (r9 == r2) goto L64
            if (r9 == r1) goto L64
            if (r9 == r0) goto L64
            java.lang.IllegalArgumentException r9 = new java.lang.IllegalArgumentException
            r9.<init>(r3)
            goto L69
        L64:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            r9.<init>(r3)
        L69:
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.ee0.b.o(int):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x004e, code lost:
        if (com.amazon.aps.iva.yb0.j.a(((com.amazon.aps.iva.oc0.f0) r0).c(), ((com.amazon.aps.iva.oc0.f0) r6).c()) != false) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x006f, code lost:
        r6 = true;
     */
    @Override // com.amazon.aps.iva.ee0.n
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean c(com.amazon.aps.iva.oc0.h r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof com.amazon.aps.iva.oc0.e
            r1 = 0
            if (r0 == 0) goto L73
            com.amazon.aps.iva.oc0.e r0 = r5.k()
            java.lang.String r2 = "first"
            com.amazon.aps.iva.yb0.j.f(r0, r2)
            com.amazon.aps.iva.nd0.f r2 = r0.getName()
            com.amazon.aps.iva.nd0.f r3 = r6.getName()
            boolean r2 = com.amazon.aps.iva.yb0.j.a(r2, r3)
            r3 = 1
            if (r2 != 0) goto L1e
            goto L64
        L1e:
            com.amazon.aps.iva.oc0.k r0 = r0.d()
            com.amazon.aps.iva.oc0.k r6 = r6.d()
        L26:
            if (r0 == 0) goto L6f
            if (r6 == 0) goto L6f
            boolean r2 = r0 instanceof com.amazon.aps.iva.oc0.c0
            if (r2 == 0) goto L31
            boolean r6 = r6 instanceof com.amazon.aps.iva.oc0.c0
            goto L70
        L31:
            boolean r2 = r6 instanceof com.amazon.aps.iva.oc0.c0
            if (r2 == 0) goto L36
            goto L64
        L36:
            boolean r2 = r0 instanceof com.amazon.aps.iva.oc0.f0
            if (r2 == 0) goto L51
            boolean r2 = r6 instanceof com.amazon.aps.iva.oc0.f0
            if (r2 == 0) goto L64
            com.amazon.aps.iva.oc0.f0 r0 = (com.amazon.aps.iva.oc0.f0) r0
            com.amazon.aps.iva.nd0.c r0 = r0.c()
            com.amazon.aps.iva.oc0.f0 r6 = (com.amazon.aps.iva.oc0.f0) r6
            com.amazon.aps.iva.nd0.c r6 = r6.c()
            boolean r6 = com.amazon.aps.iva.yb0.j.a(r0, r6)
            if (r6 == 0) goto L64
            goto L6f
        L51:
            boolean r2 = r6 instanceof com.amazon.aps.iva.oc0.f0
            if (r2 == 0) goto L56
            goto L64
        L56:
            com.amazon.aps.iva.nd0.f r2 = r0.getName()
            com.amazon.aps.iva.nd0.f r4 = r6.getName()
            boolean r2 = com.amazon.aps.iva.yb0.j.a(r2, r4)
            if (r2 != 0) goto L66
        L64:
            r6 = r1
            goto L70
        L66:
            com.amazon.aps.iva.oc0.k r0 = r0.d()
            com.amazon.aps.iva.oc0.k r6 = r6.d()
            goto L26
        L6f:
            r6 = r3
        L70:
            if (r6 == 0) goto L73
            r1 = r3
        L73:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.ee0.b.c(com.amazon.aps.iva.oc0.h):boolean");
    }

    @Override // com.amazon.aps.iva.ee0.h
    public final e0 e() {
        if (com.amazon.aps.iva.lc0.k.I(k())) {
            return null;
        }
        return j().f();
    }

    @Override // com.amazon.aps.iva.ee0.h
    public final Collection f() {
        com.amazon.aps.iva.oc0.k d = k().d();
        if (!(d instanceof com.amazon.aps.iva.oc0.e)) {
            List emptyList = Collections.emptyList();
            if (emptyList != null) {
                return emptyList;
            }
            o(3);
            throw null;
        }
        com.amazon.aps.iva.me0.c cVar = new com.amazon.aps.iva.me0.c();
        com.amazon.aps.iva.oc0.e eVar = (com.amazon.aps.iva.oc0.e) d;
        cVar.add(eVar.m());
        eVar.i0();
        return cVar;
    }

    @Override // com.amazon.aps.iva.ee0.c1
    public final com.amazon.aps.iva.lc0.k j() {
        com.amazon.aps.iva.lc0.k e = com.amazon.aps.iva.ud0.b.e(k());
        if (e != null) {
            return e;
        }
        o(1);
        throw null;
    }

    @Override // com.amazon.aps.iva.ee0.c1
    /* renamed from: p */
    public abstract com.amazon.aps.iva.oc0.e k();
}
