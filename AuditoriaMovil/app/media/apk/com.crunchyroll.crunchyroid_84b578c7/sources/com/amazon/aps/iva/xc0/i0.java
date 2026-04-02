package com.amazon.aps.iva.xc0;

import com.amazon.aps.iva.oc0.m0;
import com.amazon.aps.iva.oc0.n0;
import com.amazon.aps.iva.oc0.s0;
import com.amazon.aps.iva.xc0.j0;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.LinkedHashMap;
/* compiled from: specialBuiltinMembers.kt */
/* loaded from: classes4.dex */
public final class i0 {

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
            return Boolean.valueOf(com.amazon.aps.iva.gr.n.u(com.amazon.aps.iva.ud0.b.k(bVar2)));
        }
    }

    /* compiled from: specialBuiltinMembers.kt */
    /* loaded from: classes4.dex */
    public static final class b extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<com.amazon.aps.iva.oc0.b, Boolean> {
        public static final b h = new b();

        public b() {
            super(1);
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final Boolean invoke(com.amazon.aps.iva.oc0.b bVar) {
            boolean z;
            com.amazon.aps.iva.oc0.b bVar2 = bVar;
            com.amazon.aps.iva.yb0.j.f(bVar2, "it");
            int i = g.m;
            s0 s0Var = (s0) bVar2;
            if (com.amazon.aps.iva.lc0.k.A(s0Var) && com.amazon.aps.iva.ud0.b.b(s0Var, new f(s0Var)) != null) {
                z = true;
            } else {
                z = false;
            }
            return Boolean.valueOf(z);
        }
    }

    /* compiled from: specialBuiltinMembers.kt */
    /* loaded from: classes4.dex */
    public static final class c extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<com.amazon.aps.iva.oc0.b, Boolean> {
        public static final c h = new c();

        public c() {
            super(1);
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final Boolean invoke(com.amazon.aps.iva.oc0.b bVar) {
            boolean z;
            j0.b bVar2;
            com.amazon.aps.iva.oc0.b b;
            String b2;
            com.amazon.aps.iva.oc0.b bVar3 = bVar;
            com.amazon.aps.iva.yb0.j.f(bVar3, "it");
            if (com.amazon.aps.iva.lc0.k.A(bVar3)) {
                int i = h.m;
                if (j0.f.contains(bVar3.getName()) && (b = com.amazon.aps.iva.ud0.b.b(bVar3, i.h)) != null && (b2 = com.amazon.aps.iva.gd0.x.b(b)) != null) {
                    if (j0.c.contains(b2)) {
                        bVar2 = j0.b.ONE_COLLECTION_PARAMETER;
                    } else if (((j0.c) com.amazon.aps.iva.lb0.i0.S(b2, j0.e)) == j0.c.NULL) {
                        bVar2 = j0.b.OBJECT_PARAMETER_GENERIC;
                    } else {
                        bVar2 = j0.b.OBJECT_PARAMETER_NON_GENERIC;
                    }
                } else {
                    bVar2 = null;
                }
                if (bVar2 != null) {
                    z = true;
                    return Boolean.valueOf(z);
                }
            }
            z = false;
            return Boolean.valueOf(z);
        }
    }

    public static final String a(com.amazon.aps.iva.oc0.b bVar) {
        com.amazon.aps.iva.oc0.b bVar2;
        com.amazon.aps.iva.nd0.f fVar;
        com.amazon.aps.iva.nd0.f fVar2;
        if (com.amazon.aps.iva.lc0.k.A(bVar)) {
            bVar2 = b(bVar);
        } else {
            bVar2 = null;
        }
        if (bVar2 == null) {
            return null;
        }
        com.amazon.aps.iva.oc0.b k = com.amazon.aps.iva.ud0.b.k(bVar2);
        if (k instanceof n0) {
            com.amazon.aps.iva.lc0.k.A(k);
            com.amazon.aps.iva.oc0.b b2 = com.amazon.aps.iva.ud0.b.b(com.amazon.aps.iva.ud0.b.k(k), k.h);
            if (b2 == null || (fVar2 = j.a.get(com.amazon.aps.iva.ud0.b.g(b2))) == null) {
                return null;
            }
            return fVar2.b();
        } else if (!(k instanceof s0)) {
            return null;
        } else {
            int i = g.m;
            LinkedHashMap linkedHashMap = j0.j;
            String b3 = com.amazon.aps.iva.gd0.x.b((s0) k);
            if (b3 == null) {
                fVar = null;
            } else {
                fVar = (com.amazon.aps.iva.nd0.f) linkedHashMap.get(b3);
            }
            if (fVar == null) {
                return null;
            }
            return fVar.b();
        }
    }

    public static final <T extends com.amazon.aps.iva.oc0.b> T b(T t) {
        boolean z;
        com.amazon.aps.iva.yb0.j.f(t, "<this>");
        if (!j0.k.contains(t.getName()) && !j.d.contains(com.amazon.aps.iva.ud0.b.k(t).getName())) {
            return null;
        }
        if (t instanceof n0) {
            z = true;
        } else {
            z = t instanceof m0;
        }
        if (z) {
            return (T) com.amazon.aps.iva.ud0.b.b(t, a.h);
        }
        if (!(t instanceof s0)) {
            return null;
        }
        return (T) com.amazon.aps.iva.ud0.b.b(t, b.h);
    }

    public static final <T extends com.amazon.aps.iva.oc0.b> T c(T t) {
        com.amazon.aps.iva.yb0.j.f(t, "<this>");
        T t2 = (T) b(t);
        if (t2 != null) {
            return t2;
        }
        int i = h.m;
        com.amazon.aps.iva.nd0.f name = t.getName();
        com.amazon.aps.iva.yb0.j.e(name, AppMeasurementSdk.ConditionalUserProperty.NAME);
        if (!h.b(name)) {
            return null;
        }
        return (T) com.amazon.aps.iva.ud0.b.b(t, c.h);
    }

    /* JADX WARN: Code restructure failed: missing block: B:50:0x0141, code lost:
        if (r5 == null) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0143, code lost:
        r0 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0144, code lost:
        if (r0 == false) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x014b, code lost:
        return !com.amazon.aps.iva.lc0.k.A(r10);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final boolean d(com.amazon.aps.iva.oc0.e r10, com.amazon.aps.iva.oc0.b r11) {
        /*
            Method dump skipped, instructions count: 367
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.xc0.i0.d(com.amazon.aps.iva.oc0.e, com.amazon.aps.iva.oc0.b):boolean");
    }
}
