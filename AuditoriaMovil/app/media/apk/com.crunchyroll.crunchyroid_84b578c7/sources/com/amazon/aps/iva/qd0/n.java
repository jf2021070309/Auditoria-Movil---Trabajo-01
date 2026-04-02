package com.amazon.aps.iva.qd0;

import com.amazon.aps.iva.e4.l1;
import com.amazon.aps.iva.ee0.b1;
import com.amazon.aps.iva.ee0.c1;
import com.amazon.aps.iva.ee0.e0;
import com.amazon.aps.iva.ee0.u1;
import com.amazon.aps.iva.fe0.d;
import com.amazon.aps.iva.fe0.e;
import com.amazon.aps.iva.fe0.f;
import com.amazon.aps.iva.lb0.x;
import com.amazon.aps.iva.oc0.b0;
import com.amazon.aps.iva.oc0.n0;
import com.amazon.aps.iva.oc0.p0;
import com.amazon.aps.iva.oc0.q0;
import com.amazon.aps.iva.oc0.y0;
import com.amazon.aps.iva.qd0.j;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.ServiceLoader;
/* compiled from: OverridingUtil.java */
/* loaded from: classes4.dex */
public final class n {
    public static final List<j> e = x.X0(ServiceLoader.load(j.class, j.class.getClassLoader()));
    public static final n f;
    public static final a g;
    public final com.amazon.aps.iva.fe0.f a;
    public final com.amazon.aps.iva.fe0.e b;
    public final d.a c;
    public final com.amazon.aps.iva.xb0.p<e0, e0, Boolean> d;

    /* compiled from: OverridingUtil.java */
    /* loaded from: classes4.dex */
    public static class a implements d.a {
        public static /* synthetic */ void b(int i) {
            Object[] objArr = new Object[3];
            if (i != 1) {
                objArr[0] = "a";
            } else {
                objArr[0] = "b";
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/resolve/OverridingUtil$1";
            objArr[2] = "equals";
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        @Override // com.amazon.aps.iva.fe0.d.a
        public final boolean a(c1 c1Var, c1 c1Var2) {
            if (c1Var != null) {
                if (c1Var2 != null) {
                    return c1Var.equals(c1Var2);
                }
                b(1);
                throw null;
            }
            b(0);
            throw null;
        }
    }

    /* compiled from: OverridingUtil.java */
    /* loaded from: classes4.dex */
    public static /* synthetic */ class b {
        public static final /* synthetic */ int[] a;
        public static final /* synthetic */ int[] b;
        public static final /* synthetic */ int[] c;

        static {
            int[] iArr = new int[b0.values().length];
            c = iArr;
            try {
                iArr[b0.FINAL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                c[b0.SEALED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                c[b0.OPEN.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                c[b0.ABSTRACT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            int[] iArr2 = new int[c.a.values().length];
            b = iArr2;
            try {
                iArr2[c.a.OVERRIDABLE.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                b[c.a.CONFLICT.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                b[c.a.INCOMPATIBLE.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            int[] iArr3 = new int[j.b.values().length];
            a = iArr3;
            try {
                iArr3[j.b.OVERRIDABLE.ordinal()] = 1;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                a[j.b.CONFLICT.ordinal()] = 2;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                a[j.b.INCOMPATIBLE.ordinal()] = 3;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                a[j.b.UNKNOWN.ordinal()] = 4;
            } catch (NoSuchFieldError unused11) {
            }
        }
    }

    /* compiled from: OverridingUtil.java */
    /* loaded from: classes4.dex */
    public static class c {
        public static final c b = new c(a.OVERRIDABLE, "SUCCESS");
        public final a a;

        /* compiled from: OverridingUtil.java */
        /* loaded from: classes4.dex */
        public enum a {
            OVERRIDABLE,
            INCOMPATIBLE,
            CONFLICT
        }

        public c(a aVar, String str) {
            if (aVar != null) {
                this.a = aVar;
            } else {
                a(3);
                throw null;
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:24:0x0038  */
        /* JADX WARN: Removed duplicated region for block: B:25:0x003b  */
        /* JADX WARN: Removed duplicated region for block: B:26:0x0040  */
        /* JADX WARN: Removed duplicated region for block: B:27:0x0045  */
        /* JADX WARN: Removed duplicated region for block: B:29:0x0049  */
        /* JADX WARN: Removed duplicated region for block: B:35:0x005a  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public static /* synthetic */ void a(int r10) {
            /*
                r0 = 4
                r1 = 3
                r2 = 2
                r3 = 1
                if (r10 == r3) goto Lf
                if (r10 == r2) goto Lf
                if (r10 == r1) goto Lf
                if (r10 == r0) goto Lf
                java.lang.String r4 = "@NotNull method %s.%s must not return null"
                goto L11
            Lf:
                java.lang.String r4 = "Argument for @NotNull parameter '%s' of %s.%s must not be null"
            L11:
                if (r10 == r3) goto L1b
                if (r10 == r2) goto L1b
                if (r10 == r1) goto L1b
                if (r10 == r0) goto L1b
                r5 = r2
                goto L1c
            L1b:
                r5 = r1
            L1c:
                java.lang.Object[] r5 = new java.lang.Object[r5]
                java.lang.String r6 = "success"
                java.lang.String r7 = "kotlin/reflect/jvm/internal/impl/resolve/OverridingUtil$OverrideCompatibilityInfo"
                r8 = 0
                if (r10 == r3) goto L31
                if (r10 == r2) goto L31
                if (r10 == r1) goto L2e
                if (r10 == r0) goto L31
                r5[r8] = r7
                goto L35
            L2e:
                r5[r8] = r6
                goto L35
            L31:
                java.lang.String r9 = "debugMessage"
                r5[r8] = r9
            L35:
                switch(r10) {
                    case 1: goto L45;
                    case 2: goto L45;
                    case 3: goto L45;
                    case 4: goto L45;
                    case 5: goto L40;
                    case 6: goto L3b;
                    default: goto L38;
                }
            L38:
                r5[r3] = r6
                goto L47
            L3b:
                java.lang.String r6 = "getDebugMessage"
                r5[r3] = r6
                goto L47
            L40:
                java.lang.String r6 = "getResult"
                r5[r3] = r6
                goto L47
            L45:
                r5[r3] = r7
            L47:
                if (r10 == r3) goto L5a
                if (r10 == r2) goto L55
                if (r10 == r1) goto L50
                if (r10 == r0) goto L50
                goto L5e
            L50:
                java.lang.String r6 = "<init>"
                r5[r2] = r6
                goto L5e
            L55:
                java.lang.String r6 = "conflict"
                r5[r2] = r6
                goto L5e
            L5a:
                java.lang.String r6 = "incompatible"
                r5[r2] = r6
            L5e:
                java.lang.String r4 = java.lang.String.format(r4, r5)
                if (r10 == r3) goto L70
                if (r10 == r2) goto L70
                if (r10 == r1) goto L70
                if (r10 == r0) goto L70
                java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
                r10.<init>(r4)
                goto L75
            L70:
                java.lang.IllegalArgumentException r10 = new java.lang.IllegalArgumentException
                r10.<init>(r4)
            L75:
                throw r10
            */
            throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.qd0.n.c.a(int):void");
        }

        public static c b(String str) {
            return new c(a.CONFLICT, str);
        }

        public static c d(String str) {
            return new c(a.INCOMPATIBLE, str);
        }

        public final a c() {
            a aVar = this.a;
            if (aVar != null) {
                return aVar;
            }
            a(5);
            throw null;
        }
    }

    static {
        a aVar = new a();
        g = aVar;
        f = new n(aVar, f.a.a, e.a.a);
    }

    public n(d.a aVar, f.a aVar2, e.a aVar3) {
        if (aVar != null) {
            if (aVar2 != null) {
                if (aVar3 != null) {
                    this.c = aVar;
                    this.a = aVar2;
                    this.b = aVar3;
                    this.d = null;
                    return;
                }
                a(7);
                throw null;
            }
            a(6);
            throw null;
        }
        a(5);
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:107:0x01b0  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x01b6  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x01bc  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x01c2  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x01c8  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x01ce  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x01d2  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x01d6  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x01da  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x01e0  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x01e4  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x01ea  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x01f0  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x01f6  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x01fb  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0200  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0205  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x020a  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x020f  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0214  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0219  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x021e  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0221  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0226  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0229  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x022c  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0231  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x0234  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x0239  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x023c  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x0241  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x0246  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x024b  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x0255 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:151:0x0268  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0035 A[FALL_THROUGH] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0058 A[FALL_THROUGH] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0146  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x014b  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0150  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0155  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x016f A[ADDED_TO_REGION] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static /* synthetic */ void a(int r24) {
        /*
            Method dump skipped, instructions count: 1322
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.qd0.n.a(int):void");
    }

    public static boolean b(e0 e0Var, e0 e0Var2, b1 b1Var) {
        boolean z;
        if (e0Var != null) {
            if (e0Var2 != null) {
                if (l1.D(e0Var) && l1.D(e0Var2)) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    return true;
                }
                return com.amazon.aps.iva.ee0.e.e(b1Var, e0Var.L0(), e0Var2.L0());
            }
            a(47);
            throw null;
        }
        a(46);
        throw null;
    }

    public static void c(com.amazon.aps.iva.oc0.b bVar, LinkedHashSet linkedHashSet) {
        if (bVar != null) {
            if (bVar.getKind().isReal()) {
                linkedHashSet.add(bVar);
                return;
            } else if (!bVar.k().isEmpty()) {
                for (com.amazon.aps.iva.oc0.b bVar2 : bVar.k()) {
                    c(bVar2, linkedHashSet);
                }
                return;
            } else {
                throw new IllegalStateException("No overridden descriptors found for (fake override) " + bVar);
            }
        }
        a(17);
        throw null;
    }

    public static ArrayList d(com.amazon.aps.iva.oc0.a aVar) {
        q0 M = aVar.M();
        ArrayList arrayList = new ArrayList();
        if (M != null) {
            arrayList.add(M.getType());
        }
        for (com.amazon.aps.iva.oc0.c1 c1Var : aVar.f()) {
            arrayList.add(c1Var.getType());
        }
        return arrayList;
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x0166, code lost:
        r11 = ((com.amazon.aps.iva.oc0.b) s(r10, new com.amazon.aps.iva.qd0.o())).e0(r11, r1, r0, com.amazon.aps.iva.oc0.b.a.FAKE_OVERRIDE);
        r12.r(r11, r10);
        r12.c(r11);
     */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x017d, code lost:
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x015f, code lost:
        if (r2 == false) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x0161, code lost:
        r0 = com.amazon.aps.iva.oc0.q.h;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x0164, code lost:
        r0 = com.amazon.aps.iva.oc0.q.g;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void e(java.util.Collection r10, com.amazon.aps.iva.oc0.e r11, com.amazon.aps.iva.qd0.m r12) {
        /*
            Method dump skipped, instructions count: 406
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.qd0.n.e(java.util.Collection, com.amazon.aps.iva.oc0.e, com.amazon.aps.iva.qd0.m):void");
    }

    public static ArrayList g(Object obj, LinkedList linkedList, com.amazon.aps.iva.xb0.l lVar, com.amazon.aps.iva.xb0.l lVar2) {
        if (obj != null) {
            if (lVar != null) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(obj);
                com.amazon.aps.iva.oc0.a aVar = (com.amazon.aps.iva.oc0.a) lVar.invoke(obj);
                Iterator it = linkedList.iterator();
                while (it.hasNext()) {
                    Object next = it.next();
                    com.amazon.aps.iva.oc0.a aVar2 = (com.amazon.aps.iva.oc0.a) lVar.invoke(next);
                    if (obj == next) {
                        it.remove();
                    } else {
                        c.a j = j(aVar, aVar2);
                        if (j == c.a.OVERRIDABLE) {
                            arrayList.add(next);
                            it.remove();
                        } else if (j == c.a.CONFLICT) {
                            lVar2.invoke(next);
                            it.remove();
                        }
                    }
                }
                return arrayList;
            }
            a(101);
            throw null;
        }
        a(99);
        throw null;
    }

    public static c i(com.amazon.aps.iva.oc0.a aVar, com.amazon.aps.iva.oc0.a aVar2) {
        boolean z;
        boolean z2;
        c cVar;
        if (aVar != null) {
            if (aVar2 != null) {
                boolean z3 = aVar instanceof com.amazon.aps.iva.oc0.v;
                if ((z3 && !(aVar2 instanceof com.amazon.aps.iva.oc0.v)) || (((z = aVar instanceof n0)) && !(aVar2 instanceof n0))) {
                    return c.d("Member kind mismatch");
                }
                if (!z3 && !z) {
                    throw new IllegalArgumentException("This type of CallableDescriptor cannot be checked for overridability: " + aVar);
                } else if (!aVar.getName().equals(aVar2.getName())) {
                    return c.d("Name mismatch");
                } else {
                    boolean z4 = true;
                    if (aVar.M() == null) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    if (aVar2.M() != null) {
                        z4 = false;
                    }
                    if (z2 != z4) {
                        cVar = c.d("Receiver presence mismatch");
                    } else if (aVar.f().size() != aVar2.f().size()) {
                        cVar = c.d("Value parameter number mismatch");
                    } else {
                        cVar = null;
                    }
                    if (cVar == null) {
                        return null;
                    }
                    return cVar;
                }
            }
            a(41);
            throw null;
        }
        a(40);
        throw null;
    }

    public static c.a j(com.amazon.aps.iva.oc0.a aVar, com.amazon.aps.iva.oc0.a aVar2) {
        n nVar = f;
        c.a c2 = nVar.l(aVar2, aVar, null).c();
        c.a c3 = nVar.l(aVar, aVar2, null).c();
        c.a aVar3 = c.a.OVERRIDABLE;
        if (c2 != aVar3 || c3 != aVar3) {
            c.a aVar4 = c.a.CONFLICT;
            if (c2 != aVar4 && c3 != aVar4) {
                return c.a.INCOMPATIBLE;
            }
            return aVar4;
        }
        return aVar3;
    }

    public static boolean k(com.amazon.aps.iva.oc0.a aVar, com.amazon.aps.iva.oc0.a aVar2) {
        boolean z;
        if (aVar != null) {
            if (aVar2 != null) {
                e0 returnType = aVar.getReturnType();
                e0 returnType2 = aVar2.getReturnType();
                if (!p(aVar, aVar2)) {
                    return false;
                }
                b1 f2 = f.f(aVar.getTypeParameters(), aVar2.getTypeParameters());
                if (aVar instanceof com.amazon.aps.iva.oc0.v) {
                    return o(aVar, returnType, aVar2, returnType2, f2);
                }
                if (aVar instanceof n0) {
                    n0 n0Var = (n0) aVar;
                    n0 n0Var2 = (n0) aVar2;
                    p0 setter = n0Var.getSetter();
                    p0 setter2 = n0Var2.getSetter();
                    if (setter != null && setter2 != null) {
                        z = p(setter, setter2);
                    } else {
                        z = true;
                    }
                    if (!z) {
                        return false;
                    }
                    if (n0Var.L() && n0Var2.L()) {
                        return com.amazon.aps.iva.ee0.e.e(f2, returnType.L0(), returnType2.L0());
                    }
                    if ((!n0Var.L() && n0Var2.L()) || !o(aVar, returnType, aVar2, returnType2, f2)) {
                        return false;
                    }
                    return true;
                }
                throw new IllegalArgumentException("Unexpected callable: " + aVar.getClass());
            }
            a(68);
            throw null;
        }
        a(67);
        throw null;
    }

    public static boolean o(com.amazon.aps.iva.oc0.a aVar, e0 e0Var, com.amazon.aps.iva.oc0.a aVar2, e0 e0Var2, b1 b1Var) {
        if (aVar != null) {
            if (e0Var != null) {
                if (aVar2 != null) {
                    if (e0Var2 != null) {
                        com.amazon.aps.iva.ee0.e eVar = com.amazon.aps.iva.ee0.e.a;
                        u1 L0 = e0Var.L0();
                        u1 L02 = e0Var2.L0();
                        com.amazon.aps.iva.yb0.j.f(L0, "subType");
                        com.amazon.aps.iva.yb0.j.f(L02, "superType");
                        return com.amazon.aps.iva.ee0.e.i(eVar, b1Var, L0, L02);
                    }
                    a(76);
                    throw null;
                }
                a(75);
                throw null;
            }
            a(74);
            throw null;
        }
        a(73);
        throw null;
    }

    public static boolean p(com.amazon.aps.iva.oc0.o oVar, com.amazon.aps.iva.oc0.o oVar2) {
        if (oVar != null) {
            if (oVar2 != null) {
                Integer b2 = com.amazon.aps.iva.oc0.q.b(oVar.getVisibility(), oVar2.getVisibility());
                if (b2 != null && b2.intValue() < 0) {
                    return false;
                }
                return true;
            }
            a(70);
            throw null;
        }
        a(69);
        throw null;
    }

    public static boolean q(com.amazon.aps.iva.oc0.a aVar, com.amazon.aps.iva.oc0.a aVar2) {
        if (aVar != null) {
            if (aVar2 != null) {
                boolean equals = aVar.equals(aVar2);
                g gVar = g.a;
                if (!equals && gVar.a(aVar.a(), aVar2.a(), false, true)) {
                    return true;
                }
                com.amazon.aps.iva.oc0.a a2 = aVar2.a();
                int i = i.a;
                LinkedHashSet<com.amazon.aps.iva.oc0.a> linkedHashSet = new LinkedHashSet();
                i.b(aVar.a(), linkedHashSet);
                for (com.amazon.aps.iva.oc0.a aVar3 : linkedHashSet) {
                    if (gVar.a(a2, aVar3, false, true)) {
                        return true;
                    }
                }
                return false;
            }
            a(14);
            throw null;
        }
        a(13);
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:56:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00f6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void r(com.amazon.aps.iva.oc0.b r6, com.amazon.aps.iva.xb0.l<com.amazon.aps.iva.oc0.b, com.amazon.aps.iva.kb0.q> r7) {
        /*
            Method dump skipped, instructions count: 293
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.qd0.n.r(com.amazon.aps.iva.oc0.b, com.amazon.aps.iva.xb0.l):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static <H> H s(Collection<H> collection, com.amazon.aps.iva.xb0.l<H, com.amazon.aps.iva.oc0.a> lVar) {
        H h;
        boolean z;
        if (lVar != 0) {
            if (collection.size() == 1) {
                H h2 = (H) x.s0(collection);
                if (h2 != null) {
                    return h2;
                }
                a(80);
                throw null;
            }
            ArrayList arrayList = new ArrayList(2);
            ArrayList arrayList2 = new ArrayList(com.amazon.aps.iva.lb0.r.Y(collection));
            for (H h3 : collection) {
                arrayList2.add(lVar.invoke(h3));
            }
            H h4 = (H) x.s0(collection);
            com.amazon.aps.iva.oc0.a aVar = (com.amazon.aps.iva.oc0.a) lVar.invoke(h4);
            for (H h5 : collection) {
                com.amazon.aps.iva.oc0.a aVar2 = (com.amazon.aps.iva.oc0.a) lVar.invoke(h5);
                if (aVar2 != null) {
                    Iterator it = arrayList2.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            if (!k(aVar2, (com.amazon.aps.iva.oc0.a) it.next())) {
                                z = false;
                                break;
                            }
                        } else {
                            z = true;
                            break;
                        }
                    }
                    if (z) {
                        arrayList.add(h5);
                    }
                    if (k(aVar2, aVar) && !k(aVar, aVar2)) {
                        h4 = h5;
                    }
                } else {
                    a(71);
                    throw null;
                }
            }
            if (arrayList.isEmpty()) {
                if (h4 != null) {
                    return h4;
                }
                a(81);
                throw null;
            } else if (arrayList.size() == 1) {
                H h6 = (H) x.s0(arrayList);
                if (h6 != null) {
                    return h6;
                }
                a(82);
                throw null;
            } else {
                Iterator it2 = arrayList.iterator();
                while (true) {
                    if (it2.hasNext()) {
                        h = (H) it2.next();
                        if (!com.amazon.aps.iva.dg.b.x(((com.amazon.aps.iva.oc0.a) lVar.invoke(h)).getReturnType())) {
                            break;
                        }
                    } else {
                        h = null;
                        break;
                    }
                }
                if (h != null) {
                    return h;
                }
                H h7 = (H) x.s0(arrayList);
                if (h7 != null) {
                    return h7;
                }
                a(84);
                throw null;
            }
        }
        a(79);
        throw null;
    }

    public final b1 f(List<y0> list, List<y0> list2) {
        if (list != null) {
            if (list2 != null) {
                if (list.isEmpty()) {
                    t tVar = new t(null, this.c, this.a, this.b, this.d);
                    com.amazon.aps.iva.xb0.p<e0, e0, Boolean> pVar = tVar.e;
                    com.amazon.aps.iva.fe0.f fVar = tVar.c;
                    com.amazon.aps.iva.fe0.e eVar = tVar.d;
                    if (pVar == null) {
                        com.amazon.aps.iva.yb0.j.f(eVar, "kotlinTypePreparator");
                        com.amazon.aps.iva.yb0.j.f(fVar, "kotlinTypeRefiner");
                        return new b1(true, true, tVar, eVar, fVar);
                    }
                    return new s(tVar, eVar, fVar);
                }
                HashMap hashMap = new HashMap();
                for (int i = 0; i < list.size(); i++) {
                    hashMap.put(list.get(i).h(), list2.get(i).h());
                }
                t tVar2 = new t(hashMap, this.c, this.a, this.b, this.d);
                com.amazon.aps.iva.xb0.p<e0, e0, Boolean> pVar2 = tVar2.e;
                com.amazon.aps.iva.fe0.f fVar2 = tVar2.c;
                com.amazon.aps.iva.fe0.e eVar2 = tVar2.d;
                if (pVar2 == null) {
                    com.amazon.aps.iva.yb0.j.f(eVar2, "kotlinTypePreparator");
                    com.amazon.aps.iva.yb0.j.f(fVar2, "kotlinTypeRefiner");
                    return new b1(true, true, tVar2, eVar2, fVar2);
                }
                return new s(tVar2, eVar2, fVar2);
            }
            a(43);
            throw null;
        }
        a(42);
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:84:0x0080 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0074 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void h(com.amazon.aps.iva.nd0.f r18, java.util.Collection r19, java.util.Collection r20, com.amazon.aps.iva.oc0.e r21, com.amazon.aps.iva.qd0.m r22) {
        /*
            Method dump skipped, instructions count: 356
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.qd0.n.h(com.amazon.aps.iva.nd0.f, java.util.Collection, java.util.Collection, com.amazon.aps.iva.oc0.e, com.amazon.aps.iva.qd0.m):void");
    }

    public final c l(com.amazon.aps.iva.oc0.a aVar, com.amazon.aps.iva.oc0.a aVar2, com.amazon.aps.iva.oc0.e eVar) {
        if (aVar != null) {
            if (aVar2 != null) {
                c m = m(aVar, aVar2, eVar, false);
                if (m != null) {
                    return m;
                }
                a(21);
                throw null;
            }
            a(20);
            throw null;
        }
        a(19);
        throw null;
    }

    public final c m(com.amazon.aps.iva.oc0.a aVar, com.amazon.aps.iva.oc0.a aVar2, com.amazon.aps.iva.oc0.e eVar, boolean z) {
        boolean z2;
        if (aVar != null) {
            if (aVar2 != null) {
                c n = n(aVar, aVar2, z);
                if (n.c() == c.a.OVERRIDABLE) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                List<j> list = e;
                for (j jVar : list) {
                    if (jVar.b() != j.a.CONFLICTS_ONLY && (!z2 || jVar.b() != j.a.SUCCESS_ONLY)) {
                        int i = b.a[jVar.a(aVar, aVar2, eVar).ordinal()];
                        if (i != 1) {
                            if (i != 2) {
                                if (i == 3) {
                                    return c.d("External condition");
                                }
                            } else {
                                return c.b("External condition failed");
                            }
                        } else {
                            z2 = true;
                        }
                    }
                }
                if (!z2) {
                    return n;
                }
                for (j jVar2 : list) {
                    if (jVar2.b() == j.a.CONFLICTS_ONLY) {
                        int i2 = b.a[jVar2.a(aVar, aVar2, eVar).ordinal()];
                        if (i2 != 1) {
                            if (i2 != 2) {
                                if (i2 == 3) {
                                    return c.d("External condition");
                                }
                            } else {
                                return c.b("External condition failed");
                            }
                        } else {
                            throw new IllegalStateException("Contract violation in " + jVar2.getClass().getName() + " condition. It's not supposed to end with success");
                        }
                    }
                }
                c cVar = c.b;
                if (cVar != null) {
                    return cVar;
                }
                c.a(0);
                throw null;
            }
            a(23);
            throw null;
        }
        a(22);
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:0x00b1, code lost:
        r15.remove();
     */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00c1 A[LOOP:1: B:20:0x005b->B:42:0x00c1, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:91:0x00ba A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.amazon.aps.iva.qd0.n.c n(com.amazon.aps.iva.oc0.a r18, com.amazon.aps.iva.oc0.a r19, boolean r20) {
        /*
            Method dump skipped, instructions count: 363
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.qd0.n.n(com.amazon.aps.iva.oc0.a, com.amazon.aps.iva.oc0.a, boolean):com.amazon.aps.iva.qd0.n$c");
    }
}
