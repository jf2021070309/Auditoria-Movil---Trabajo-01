package com.amazon.aps.iva.oc0;

import com.amazon.aps.iva.e4.l1;
import com.amazon.aps.iva.ke0.o;
import com.amazon.aps.iva.oc0.f1;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.ServiceLoader;
import java.util.Set;
/* compiled from: DescriptorVisibilities.java */
/* loaded from: classes4.dex */
public final class q {
    public static final d a;
    public static final e b;
    public static final f c;
    public static final g d;
    public static final h e;
    public static final i f;
    public static final j g;
    public static final k h;
    public static final l i;
    public static final Set<r> j;
    public static final Map<r, Integer> k;
    public static final h l;
    public static final a m;
    public static final b n;
    @Deprecated
    public static final c o;
    public static final com.amazon.aps.iva.ke0.o p;
    public static final HashMap q;

    /* compiled from: DescriptorVisibilities.java */
    /* loaded from: classes4.dex */
    public static class a implements com.amazon.aps.iva.yd0.g {
        @Override // com.amazon.aps.iva.yd0.g
        public final com.amazon.aps.iva.ee0.e0 getType() {
            throw new IllegalStateException("This method should not be called");
        }
    }

    /* compiled from: DescriptorVisibilities.java */
    /* loaded from: classes4.dex */
    public static class b implements com.amazon.aps.iva.yd0.g {
        @Override // com.amazon.aps.iva.yd0.g
        public final com.amazon.aps.iva.ee0.e0 getType() {
            throw new IllegalStateException("This method should not be called");
        }
    }

    /* compiled from: DescriptorVisibilities.java */
    /* loaded from: classes4.dex */
    public static class c implements com.amazon.aps.iva.yd0.g {
        @Override // com.amazon.aps.iva.yd0.g
        public final com.amazon.aps.iva.ee0.e0 getType() {
            throw new IllegalStateException("This method should not be called");
        }
    }

    /* compiled from: DescriptorVisibilities.java */
    /* loaded from: classes4.dex */
    public static class d extends p {
        public d(f1.e eVar) {
            super(eVar);
        }

        public static /* synthetic */ void e(int i) {
            Object[] objArr = new Object[3];
            if (i != 1) {
                if (i != 2) {
                    objArr[0] = "descriptor";
                } else {
                    objArr[0] = "from";
                }
            } else {
                objArr[0] = "what";
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/DescriptorVisibilities$1";
            if (i != 1 && i != 2) {
                objArr[2] = "hasContainingSourceFile";
            } else {
                objArr[2] = "isVisible";
            }
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r5v0, types: [com.amazon.aps.iva.oc0.o, com.amazon.aps.iva.oc0.k] */
        /* JADX WARN: Type inference failed for: r5v1, types: [com.amazon.aps.iva.oc0.k] */
        /* JADX WARN: Type inference failed for: r5v2, types: [com.amazon.aps.iva.oc0.k] */
        /* JADX WARN: Type inference failed for: r5v4, types: [com.amazon.aps.iva.oc0.k] */
        @Override // com.amazon.aps.iva.oc0.r
        public final boolean c(b bVar, o oVar, com.amazon.aps.iva.oc0.k kVar) {
            boolean z;
            if (kVar != null) {
                if (com.amazon.aps.iva.qd0.i.t(oVar)) {
                    if (com.amazon.aps.iva.qd0.i.f(kVar) != u0.a) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (z) {
                        return q.d(oVar, kVar);
                    }
                }
                if (oVar instanceof com.amazon.aps.iva.oc0.j) {
                    ((com.amazon.aps.iva.oc0.j) oVar).d();
                }
                while (oVar != 0) {
                    oVar = oVar.d();
                    if (oVar instanceof com.amazon.aps.iva.oc0.e) {
                        if (!com.amazon.aps.iva.qd0.i.l(oVar)) {
                            break;
                        }
                    }
                    if (oVar instanceof f0) {
                        break;
                    }
                }
                if (oVar == 0) {
                    return false;
                }
                while (kVar != null) {
                    if (oVar == kVar) {
                        return true;
                    }
                    if (kVar instanceof f0) {
                        if ((oVar instanceof f0) && oVar.c().equals(((f0) kVar).c()) && com.amazon.aps.iva.qd0.i.d(kVar).equals(com.amazon.aps.iva.qd0.i.d(oVar))) {
                            return true;
                        }
                        return false;
                    }
                    kVar = kVar.d();
                }
                return false;
            }
            e(2);
            throw null;
        }
    }

    /* compiled from: DescriptorVisibilities.java */
    /* loaded from: classes4.dex */
    public static class e extends p {
        public e(f1.f fVar) {
            super(fVar);
        }

        public static /* synthetic */ void e(int i) {
            Object[] objArr = new Object[3];
            if (i != 1) {
                objArr[0] = "what";
            } else {
                objArr[0] = "from";
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/DescriptorVisibilities$2";
            objArr[2] = "isVisible";
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        @Override // com.amazon.aps.iva.oc0.r
        public final boolean c(b bVar, o oVar, com.amazon.aps.iva.oc0.k kVar) {
            com.amazon.aps.iva.oc0.k i;
            if (kVar != null) {
                if (q.a.c(bVar, oVar, kVar)) {
                    if (bVar == q.n) {
                        return true;
                    }
                    if (bVar != q.m && (i = com.amazon.aps.iva.qd0.i.i(oVar, com.amazon.aps.iva.oc0.e.class, true)) != null && (bVar instanceof com.amazon.aps.iva.yd0.i)) {
                        return ((com.amazon.aps.iva.yd0.i) bVar).q().a().equals(i.a());
                    }
                }
                return false;
            }
            e(1);
            throw null;
        }
    }

    /* compiled from: DescriptorVisibilities.java */
    /* loaded from: classes4.dex */
    public static class f extends p {
        public f(f1.g gVar) {
            super(gVar);
        }

        public static /* synthetic */ void e(int i) {
            Object[] objArr = new Object[3];
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        objArr[0] = "what";
                    } else {
                        objArr[0] = "fromClass";
                    }
                } else {
                    objArr[0] = "whatDeclaration";
                }
            } else {
                objArr[0] = "from";
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/DescriptorVisibilities$3";
            if (i != 2 && i != 3) {
                objArr[2] = "isVisible";
            } else {
                objArr[2] = "doesReceiverFitForProtectedVisibility";
            }
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        /* JADX WARN: Code restructure failed: missing block: B:41:0x0070, code lost:
            if (com.amazon.aps.iva.ee0.w.a(r0) == false) goto L40;
         */
        @Override // com.amazon.aps.iva.oc0.r
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final boolean c(com.amazon.aps.iva.oc0.q.b r7, com.amazon.aps.iva.oc0.o r8, com.amazon.aps.iva.oc0.k r9) {
            /*
                r6 = this;
                r0 = 0
                r1 = 1
                if (r9 == 0) goto L84
                java.lang.Class<com.amazon.aps.iva.oc0.e> r2 = com.amazon.aps.iva.oc0.e.class
                com.amazon.aps.iva.oc0.k r3 = com.amazon.aps.iva.qd0.i.i(r8, r2, r1)
                com.amazon.aps.iva.oc0.e r3 = (com.amazon.aps.iva.oc0.e) r3
                r4 = 0
                com.amazon.aps.iva.oc0.k r9 = com.amazon.aps.iva.qd0.i.i(r9, r2, r4)
                com.amazon.aps.iva.oc0.e r9 = (com.amazon.aps.iva.oc0.e) r9
                if (r9 != 0) goto L16
                return r4
            L16:
                if (r3 == 0) goto L2d
                boolean r5 = com.amazon.aps.iva.qd0.i.l(r3)
                if (r5 == 0) goto L2d
                com.amazon.aps.iva.oc0.k r3 = com.amazon.aps.iva.qd0.i.i(r3, r2, r1)
                com.amazon.aps.iva.oc0.e r3 = (com.amazon.aps.iva.oc0.e) r3
                if (r3 == 0) goto L2d
                boolean r3 = com.amazon.aps.iva.qd0.i.r(r9, r3)
                if (r3 == 0) goto L2d
                return r1
            L2d:
                com.amazon.aps.iva.oc0.o r3 = com.amazon.aps.iva.qd0.i.v(r8)
                com.amazon.aps.iva.oc0.k r2 = com.amazon.aps.iva.qd0.i.i(r3, r2, r1)
                com.amazon.aps.iva.oc0.e r2 = (com.amazon.aps.iva.oc0.e) r2
                if (r2 != 0) goto L3a
                return r4
            L3a:
                boolean r2 = com.amazon.aps.iva.qd0.i.r(r9, r2)
                if (r2 == 0) goto L7b
                com.amazon.aps.iva.oc0.q$c r2 = com.amazon.aps.iva.oc0.q.o
                if (r7 != r2) goto L45
                goto L78
            L45:
                boolean r2 = r3 instanceof com.amazon.aps.iva.oc0.b
                if (r2 != 0) goto L4a
                goto L72
            L4a:
                boolean r2 = r3 instanceof com.amazon.aps.iva.oc0.j
                if (r2 == 0) goto L4f
                goto L72
            L4f:
                com.amazon.aps.iva.oc0.q$b r2 = com.amazon.aps.iva.oc0.q.n
                if (r7 != r2) goto L54
                goto L72
            L54:
                com.amazon.aps.iva.oc0.q$a r2 = com.amazon.aps.iva.oc0.q.m
                if (r7 == r2) goto L78
                if (r7 != 0) goto L5b
                goto L78
            L5b:
                boolean r2 = r7 instanceof com.amazon.aps.iva.yd0.h
                if (r2 == 0) goto L74
                r0 = r7
                com.amazon.aps.iva.yd0.h r0 = (com.amazon.aps.iva.yd0.h) r0
                com.amazon.aps.iva.ee0.e0 r0 = r0.b()
                boolean r2 = com.amazon.aps.iva.qd0.i.s(r0, r9)
                if (r2 != 0) goto L72
                boolean r0 = com.amazon.aps.iva.ee0.w.a(r0)
                if (r0 == 0) goto L78
            L72:
                r4 = r1
                goto L78
            L74:
                r7.getType()
                throw r0
            L78:
                if (r4 == 0) goto L7b
                return r1
            L7b:
                com.amazon.aps.iva.oc0.k r9 = r9.d()
                boolean r7 = r6.c(r7, r8, r9)
                return r7
            L84:
                e(r1)
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.oc0.q.f.c(com.amazon.aps.iva.oc0.q$b, com.amazon.aps.iva.oc0.o, com.amazon.aps.iva.oc0.k):boolean");
        }
    }

    /* compiled from: DescriptorVisibilities.java */
    /* loaded from: classes4.dex */
    public static class g extends p {
        public g(f1.b bVar) {
            super(bVar);
        }

        public static /* synthetic */ void e(int i) {
            Object[] objArr = new Object[3];
            if (i != 1) {
                objArr[0] = "what";
            } else {
                objArr[0] = "from";
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/DescriptorVisibilities$4";
            objArr[2] = "isVisible";
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        @Override // com.amazon.aps.iva.oc0.r
        public final boolean c(b bVar, o oVar, com.amazon.aps.iva.oc0.k kVar) {
            if (kVar != null) {
                if (!com.amazon.aps.iva.qd0.i.d(kVar).v(com.amazon.aps.iva.qd0.i.d(oVar))) {
                    return false;
                }
                q.p.a(oVar, kVar);
                return true;
            }
            e(1);
            throw null;
        }
    }

    /* compiled from: DescriptorVisibilities.java */
    /* loaded from: classes4.dex */
    public static class h extends p {
        public h(f1.h hVar) {
            super(hVar);
        }

        public static /* synthetic */ void e(int i) {
            Object[] objArr = new Object[3];
            if (i != 1) {
                objArr[0] = "what";
            } else {
                objArr[0] = "from";
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/DescriptorVisibilities$5";
            objArr[2] = "isVisible";
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        @Override // com.amazon.aps.iva.oc0.r
        public final boolean c(b bVar, o oVar, com.amazon.aps.iva.oc0.k kVar) {
            if (kVar != null) {
                return true;
            }
            e(1);
            throw null;
        }
    }

    /* compiled from: DescriptorVisibilities.java */
    /* loaded from: classes4.dex */
    public static class i extends p {
        public i(f1.d dVar) {
            super(dVar);
        }

        public static /* synthetic */ void e(int i) {
            Object[] objArr = new Object[3];
            if (i != 1) {
                objArr[0] = "what";
            } else {
                objArr[0] = "from";
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/DescriptorVisibilities$6";
            objArr[2] = "isVisible";
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        @Override // com.amazon.aps.iva.oc0.r
        public final boolean c(b bVar, o oVar, com.amazon.aps.iva.oc0.k kVar) {
            if (kVar == null) {
                e(1);
                throw null;
            }
            throw new IllegalStateException("This method shouldn't be invoked for LOCAL visibility");
        }
    }

    /* compiled from: DescriptorVisibilities.java */
    /* loaded from: classes4.dex */
    public static class j extends p {
        public j(f1.a aVar) {
            super(aVar);
        }

        public static /* synthetic */ void e(int i) {
            Object[] objArr = new Object[3];
            if (i != 1) {
                objArr[0] = "what";
            } else {
                objArr[0] = "from";
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/DescriptorVisibilities$7";
            objArr[2] = "isVisible";
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        @Override // com.amazon.aps.iva.oc0.r
        public final boolean c(b bVar, o oVar, com.amazon.aps.iva.oc0.k kVar) {
            if (kVar == null) {
                e(1);
                throw null;
            }
            throw new IllegalStateException("Visibility is unknown yet");
        }
    }

    /* compiled from: DescriptorVisibilities.java */
    /* loaded from: classes4.dex */
    public static class k extends p {
        public k(f1.c cVar) {
            super(cVar);
        }

        public static /* synthetic */ void e(int i) {
            Object[] objArr = new Object[3];
            if (i != 1) {
                objArr[0] = "what";
            } else {
                objArr[0] = "from";
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/DescriptorVisibilities$8";
            objArr[2] = "isVisible";
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        @Override // com.amazon.aps.iva.oc0.r
        public final boolean c(b bVar, o oVar, com.amazon.aps.iva.oc0.k kVar) {
            if (kVar != null) {
                return false;
            }
            e(1);
            throw null;
        }
    }

    /* compiled from: DescriptorVisibilities.java */
    /* loaded from: classes4.dex */
    public static class l extends p {
        public l(f1.i iVar) {
            super(iVar);
        }

        public static /* synthetic */ void e(int i) {
            Object[] objArr = new Object[3];
            if (i != 1) {
                objArr[0] = "what";
            } else {
                objArr[0] = "from";
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/DescriptorVisibilities$9";
            objArr[2] = "isVisible";
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        @Override // com.amazon.aps.iva.oc0.r
        public final boolean c(b bVar, o oVar, com.amazon.aps.iva.oc0.k kVar) {
            if (kVar != null) {
                return false;
            }
            e(1);
            throw null;
        }
    }

    static {
        com.amazon.aps.iva.ke0.o oVar;
        d dVar = new d(f1.e.c);
        a = dVar;
        e eVar = new e(f1.f.c);
        b = eVar;
        f fVar = new f(f1.g.c);
        c = fVar;
        g gVar = new g(f1.b.c);
        d = gVar;
        h hVar = new h(f1.h.c);
        e = hVar;
        i iVar = new i(f1.d.c);
        f = iVar;
        j jVar = new j(f1.a.c);
        g = jVar;
        k kVar = new k(f1.c.c);
        h = kVar;
        l lVar = new l(f1.i.c);
        i = lVar;
        j = Collections.unmodifiableSet(l1.I(dVar, eVar, gVar, iVar));
        HashMap hashMap = new HashMap(6);
        hashMap.put(eVar, 0);
        hashMap.put(dVar, 0);
        hashMap.put(gVar, 1);
        hashMap.put(fVar, 1);
        hashMap.put(hVar, 2);
        k = Collections.unmodifiableMap(hashMap);
        l = hVar;
        m = new a();
        n = new b();
        o = new c();
        Iterator it = ServiceLoader.load(com.amazon.aps.iva.ke0.o.class, com.amazon.aps.iva.ke0.o.class.getClassLoader()).iterator();
        if (it.hasNext()) {
            oVar = (com.amazon.aps.iva.ke0.o) it.next();
        } else {
            oVar = o.a.a;
        }
        p = oVar;
        q = new HashMap();
        f(dVar);
        f(eVar);
        f(fVar);
        f(gVar);
        f(hVar);
        f(iVar);
        f(jVar);
        f(kVar);
        f(lVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0080  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static /* synthetic */ void a(int r8) {
        /*
            r0 = 16
            if (r8 == r0) goto L7
            java.lang.String r1 = "Argument for @NotNull parameter '%s' of %s.%s must not be null"
            goto L9
        L7:
            java.lang.String r1 = "@NotNull method %s.%s must not return null"
        L9:
            r2 = 3
            r3 = 2
            if (r8 == r0) goto Lf
            r4 = r2
            goto L10
        Lf:
            r4 = r3
        L10:
            java.lang.Object[] r4 = new java.lang.Object[r4]
            java.lang.String r5 = "kotlin/reflect/jvm/internal/impl/descriptors/DescriptorVisibilities"
            r6 = 1
            r7 = 0
            if (r8 == r6) goto L3a
            if (r8 == r2) goto L3a
            r2 = 5
            if (r8 == r2) goto L3a
            r2 = 7
            if (r8 == r2) goto L3a
            switch(r8) {
                case 9: goto L3a;
                case 10: goto L35;
                case 11: goto L30;
                case 12: goto L35;
                case 13: goto L30;
                case 14: goto L2b;
                case 15: goto L2b;
                case 16: goto L28;
                default: goto L23;
            }
        L23:
            java.lang.String r2 = "what"
            r4[r7] = r2
            goto L3e
        L28:
            r4[r7] = r5
            goto L3e
        L2b:
            java.lang.String r2 = "visibility"
            r4[r7] = r2
            goto L3e
        L30:
            java.lang.String r2 = "second"
            r4[r7] = r2
            goto L3e
        L35:
            java.lang.String r2 = "first"
            r4[r7] = r2
            goto L3e
        L3a:
            java.lang.String r2 = "from"
            r4[r7] = r2
        L3e:
            java.lang.String r2 = "toDescriptorVisibility"
            if (r8 == r0) goto L45
            r4[r6] = r5
            goto L47
        L45:
            r4[r6] = r2
        L47:
            switch(r8) {
                case 2: goto L70;
                case 3: goto L70;
                case 4: goto L6b;
                case 5: goto L6b;
                case 6: goto L66;
                case 7: goto L66;
                case 8: goto L61;
                case 9: goto L61;
                case 10: goto L5c;
                case 11: goto L5c;
                case 12: goto L57;
                case 13: goto L57;
                case 14: goto L52;
                case 15: goto L4f;
                case 16: goto L74;
                default: goto L4a;
            }
        L4a:
            java.lang.String r2 = "isVisible"
            r4[r3] = r2
            goto L74
        L4f:
            r4[r3] = r2
            goto L74
        L52:
            java.lang.String r2 = "isPrivate"
            r4[r3] = r2
            goto L74
        L57:
            java.lang.String r2 = "compare"
            r4[r3] = r2
            goto L74
        L5c:
            java.lang.String r2 = "compareLocal"
            r4[r3] = r2
            goto L74
        L61:
            java.lang.String r2 = "findInvisibleMember"
            r4[r3] = r2
            goto L74
        L66:
            java.lang.String r2 = "inSameFile"
            r4[r3] = r2
            goto L74
        L6b:
            java.lang.String r2 = "isVisibleWithAnyReceiver"
            r4[r3] = r2
            goto L74
        L70:
            java.lang.String r2 = "isVisibleIgnoringReceiver"
            r4[r3] = r2
        L74:
            java.lang.String r1 = java.lang.String.format(r1, r4)
            if (r8 == r0) goto L80
            java.lang.IllegalArgumentException r8 = new java.lang.IllegalArgumentException
            r8.<init>(r1)
            goto L85
        L80:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            r8.<init>(r1)
        L85:
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.oc0.q.a(int):void");
    }

    public static Integer b(r rVar, r rVar2) {
        if (rVar != null) {
            if (rVar2 != null) {
                Integer a2 = rVar.a().a(rVar2.a());
                if (a2 != null) {
                    return a2;
                }
                Integer a3 = rVar2.a().a(rVar.a());
                if (a3 == null) {
                    return null;
                }
                return Integer.valueOf(-a3.intValue());
            }
            a(13);
            throw null;
        }
        a(12);
        throw null;
    }

    public static o c(b bVar, o oVar, com.amazon.aps.iva.oc0.k kVar) {
        o c2;
        if (oVar != null) {
            if (kVar != null) {
                for (o oVar2 = (o) oVar.a(); oVar2 != null && oVar2.getVisibility() != f; oVar2 = (o) com.amazon.aps.iva.qd0.i.i(oVar2, o.class, true)) {
                    if (!oVar2.getVisibility().c(bVar, oVar2, kVar)) {
                        return oVar2;
                    }
                }
                if (!(oVar instanceof com.amazon.aps.iva.rc0.r0) || (c2 = c(bVar, ((com.amazon.aps.iva.rc0.r0) oVar).P(), kVar)) == null) {
                    return null;
                }
                return c2;
            }
            a(9);
            throw null;
        }
        a(8);
        throw null;
    }

    public static boolean d(com.amazon.aps.iva.oc0.k kVar, com.amazon.aps.iva.oc0.k kVar2) {
        if (kVar2 != null) {
            u0 f2 = com.amazon.aps.iva.qd0.i.f(kVar2);
            if (f2 != u0.a) {
                return f2.equals(com.amazon.aps.iva.qd0.i.f(kVar));
            }
            return false;
        }
        a(7);
        throw null;
    }

    public static boolean e(r rVar) {
        if (rVar != null) {
            if (rVar != a && rVar != b) {
                return false;
            }
            return true;
        }
        a(14);
        throw null;
    }

    public static void f(p pVar) {
        q.put(pVar.a, pVar);
    }

    public static r g(g1 g1Var) {
        if (g1Var != null) {
            r rVar = (r) q.get(g1Var);
            if (rVar != null) {
                return rVar;
            }
            throw new IllegalArgumentException("Inapplicable visibility: " + g1Var);
        }
        a(15);
        throw null;
    }
}
