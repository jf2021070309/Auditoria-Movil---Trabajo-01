package com.amazon.aps.iva.xc0;

import com.amazon.aps.iva.oc0.q;
import java.util.HashMap;
/* compiled from: JavaDescriptorVisibilities.java */
/* loaded from: classes4.dex */
public final class t {
    public static final a a;
    public static final b b;
    public static final c c;
    public static final HashMap d;

    /* compiled from: JavaDescriptorVisibilities.java */
    /* loaded from: classes4.dex */
    public static class a extends com.amazon.aps.iva.oc0.p {
        public a(com.amazon.aps.iva.sc0.a aVar) {
            super(aVar);
        }

        public static /* synthetic */ void e(int i) {
            Object[] objArr = new Object[3];
            if (i != 1) {
                objArr[0] = "what";
            } else {
                objArr[0] = "from";
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/load/java/JavaDescriptorVisibilities$1";
            objArr[2] = "isVisible";
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        @Override // com.amazon.aps.iva.oc0.r
        public final boolean c(q.b bVar, com.amazon.aps.iva.oc0.o oVar, com.amazon.aps.iva.oc0.k kVar) {
            if (kVar != null) {
                return t.c(oVar, kVar);
            }
            e(1);
            throw null;
        }
    }

    /* compiled from: JavaDescriptorVisibilities.java */
    /* loaded from: classes4.dex */
    public static class b extends com.amazon.aps.iva.oc0.p {
        public b(com.amazon.aps.iva.sc0.c cVar) {
            super(cVar);
        }

        public static /* synthetic */ void e(int i) {
            Object[] objArr = new Object[3];
            if (i != 1) {
                objArr[0] = "what";
            } else {
                objArr[0] = "from";
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/load/java/JavaDescriptorVisibilities$2";
            objArr[2] = "isVisible";
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        @Override // com.amazon.aps.iva.oc0.r
        public final boolean c(q.b bVar, com.amazon.aps.iva.oc0.o oVar, com.amazon.aps.iva.oc0.k kVar) {
            if (kVar != null) {
                return t.b(bVar, oVar, kVar);
            }
            e(1);
            throw null;
        }
    }

    /* compiled from: JavaDescriptorVisibilities.java */
    /* loaded from: classes4.dex */
    public static class c extends com.amazon.aps.iva.oc0.p {
        public c(com.amazon.aps.iva.sc0.b bVar) {
            super(bVar);
        }

        public static /* synthetic */ void e(int i) {
            Object[] objArr = new Object[3];
            if (i != 1) {
                objArr[0] = "what";
            } else {
                objArr[0] = "from";
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/load/java/JavaDescriptorVisibilities$3";
            objArr[2] = "isVisible";
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        @Override // com.amazon.aps.iva.oc0.r
        public final boolean c(q.b bVar, com.amazon.aps.iva.oc0.o oVar, com.amazon.aps.iva.oc0.k kVar) {
            if (kVar != null) {
                return t.b(bVar, oVar, kVar);
            }
            e(1);
            throw null;
        }
    }

    static {
        a aVar = new a(com.amazon.aps.iva.sc0.a.c);
        a = aVar;
        b bVar = new b(com.amazon.aps.iva.sc0.c.c);
        b = bVar;
        c cVar = new c(com.amazon.aps.iva.sc0.b.c);
        c = cVar;
        HashMap hashMap = new HashMap();
        d = hashMap;
        hashMap.put(aVar.a, aVar);
        hashMap.put(bVar.a, bVar);
        hashMap.put(cVar.a, cVar);
    }

    public static /* synthetic */ void a(int i) {
        String str;
        int i2;
        if (i != 5 && i != 6) {
            str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        } else {
            str = "@NotNull method %s.%s must not return null";
        }
        if (i != 5 && i != 6) {
            i2 = 3;
        } else {
            i2 = 2;
        }
        Object[] objArr = new Object[i2];
        switch (i) {
            case 1:
                objArr[0] = "from";
                break;
            case 2:
                objArr[0] = "first";
                break;
            case 3:
                objArr[0] = "second";
                break;
            case 4:
                objArr[0] = "visibility";
                break;
            case 5:
            case 6:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/load/java/JavaDescriptorVisibilities";
                break;
            default:
                objArr[0] = "what";
                break;
        }
        if (i != 5 && i != 6) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/load/java/JavaDescriptorVisibilities";
        } else {
            objArr[1] = "toDescriptorVisibility";
        }
        if (i != 2 && i != 3) {
            if (i != 4) {
                if (i != 5 && i != 6) {
                    objArr[2] = "isVisibleForProtectedAndPackage";
                }
            } else {
                objArr[2] = "toDescriptorVisibility";
            }
        } else {
            objArr[2] = "areInSamePackage";
        }
        String format = String.format(str, objArr);
        if (i == 5 || i == 6) {
            throw new IllegalStateException(format);
        }
    }

    public static boolean b(q.b bVar, com.amazon.aps.iva.oc0.o oVar, com.amazon.aps.iva.oc0.k kVar) {
        if (kVar != null) {
            if (c(com.amazon.aps.iva.qd0.i.v(oVar), kVar)) {
                return true;
            }
            return com.amazon.aps.iva.oc0.q.c.c(bVar, oVar, kVar);
        }
        a(1);
        throw null;
    }

    public static boolean c(com.amazon.aps.iva.oc0.k kVar, com.amazon.aps.iva.oc0.k kVar2) {
        if (kVar != null) {
            if (kVar2 != null) {
                com.amazon.aps.iva.oc0.f0 f0Var = (com.amazon.aps.iva.oc0.f0) com.amazon.aps.iva.qd0.i.i(kVar, com.amazon.aps.iva.oc0.f0.class, false);
                com.amazon.aps.iva.oc0.f0 f0Var2 = (com.amazon.aps.iva.oc0.f0) com.amazon.aps.iva.qd0.i.i(kVar2, com.amazon.aps.iva.oc0.f0.class, false);
                if (f0Var2 == null || f0Var == null || !f0Var.c().equals(f0Var2.c())) {
                    return false;
                }
                return true;
            }
            a(3);
            throw null;
        }
        a(2);
        throw null;
    }
}
