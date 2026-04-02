package com.amazon.aps.iva.sd0;

import com.amazon.aps.iva.ee0.e0;
import com.amazon.aps.iva.ee0.f1;
import com.amazon.aps.iva.ee0.m0;
import java.util.ArrayList;
import java.util.List;
/* compiled from: ConstantValueFactory.kt */
/* loaded from: classes4.dex */
public final class h {

    /* compiled from: ConstantValueFactory.kt */
    /* loaded from: classes4.dex */
    public static final class a extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<com.amazon.aps.iva.oc0.c0, e0> {
        public final /* synthetic */ com.amazon.aps.iva.lc0.l h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(com.amazon.aps.iva.lc0.l lVar) {
            super(1);
            this.h = lVar;
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final e0 invoke(com.amazon.aps.iva.oc0.c0 c0Var) {
            com.amazon.aps.iva.oc0.c0 c0Var2 = c0Var;
            com.amazon.aps.iva.yb0.j.f(c0Var2, "it");
            m0 r = c0Var2.j().r(this.h);
            com.amazon.aps.iva.yb0.j.e(r, "it.builtIns.getPrimitive…KotlinType(componentType)");
            return r;
        }
    }

    public static b a(List list, com.amazon.aps.iva.oc0.c0 c0Var, com.amazon.aps.iva.lc0.l lVar) {
        ArrayList arrayList = new ArrayList();
        for (Object obj : com.amazon.aps.iva.lb0.x.X0(list)) {
            g b = b(obj, null);
            if (b != null) {
                arrayList.add(b);
            }
        }
        if (c0Var != null) {
            m0 r = c0Var.j().r(lVar);
            com.amazon.aps.iva.yb0.j.e(r, "module.builtIns.getPrimi…KotlinType(componentType)");
            return new y(arrayList, r);
        }
        return new b(arrayList, new a(lVar));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [com.amazon.aps.iva.lb0.z] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r1v10, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r1v11, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r1v12, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r1v13, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r1v14, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r1v15, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r1v19, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r1v20, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r1v21, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r1v22, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r1v23, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r1v24, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r1v3, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r1v4, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r1v5, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r1v6, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r1v7, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r1v8, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r1v9, types: [java.util.ArrayList] */
    public static g b(Object obj, com.amazon.aps.iva.oc0.c0 c0Var) {
        if (obj instanceof Byte) {
            return new d(((Number) obj).byteValue());
        }
        if (obj instanceof Short) {
            return new w(((Number) obj).shortValue());
        }
        if (obj instanceof Integer) {
            return new m(((Number) obj).intValue());
        }
        if (obj instanceof Long) {
            return new u(((Number) obj).longValue());
        }
        if (obj instanceof Character) {
            return new e(((Character) obj).charValue());
        }
        if (obj instanceof Float) {
            return new l(((Number) obj).floatValue());
        }
        if (obj instanceof Double) {
            return new i(((Number) obj).doubleValue());
        }
        if (obj instanceof Boolean) {
            return new c(((Boolean) obj).booleanValue());
        }
        if (obj instanceof String) {
            return new x((String) obj);
        }
        boolean z = obj instanceof byte[];
        ?? r1 = com.amazon.aps.iva.lb0.z.b;
        int i = 0;
        if (z) {
            byte[] bArr = (byte[]) obj;
            com.amazon.aps.iva.yb0.j.f(bArr, "<this>");
            int length = bArr.length;
            if (length != 0) {
                if (length != 1) {
                    r1 = new ArrayList(bArr.length);
                    int length2 = bArr.length;
                    while (i < length2) {
                        r1.add(Byte.valueOf(bArr[i]));
                        i++;
                    }
                } else {
                    r1 = f1.J(Byte.valueOf(bArr[0]));
                }
            }
            return a(r1, c0Var, com.amazon.aps.iva.lc0.l.BYTE);
        } else if (obj instanceof short[]) {
            short[] sArr = (short[]) obj;
            com.amazon.aps.iva.yb0.j.f(sArr, "<this>");
            int length3 = sArr.length;
            if (length3 != 0) {
                if (length3 != 1) {
                    r1 = new ArrayList(sArr.length);
                    int length4 = sArr.length;
                    while (i < length4) {
                        r1.add(Short.valueOf(sArr[i]));
                        i++;
                    }
                } else {
                    r1 = f1.J(Short.valueOf(sArr[0]));
                }
            }
            return a(r1, c0Var, com.amazon.aps.iva.lc0.l.SHORT);
        } else if (obj instanceof int[]) {
            int[] iArr = (int[]) obj;
            com.amazon.aps.iva.yb0.j.f(iArr, "<this>");
            int length5 = iArr.length;
            ArrayList arrayList = r1;
            if (length5 != 0) {
                if (length5 != 1) {
                    arrayList = com.amazon.aps.iva.lb0.o.c0(iArr);
                } else {
                    arrayList = f1.J(Integer.valueOf(iArr[0]));
                }
            }
            return a(arrayList, c0Var, com.amazon.aps.iva.lc0.l.INT);
        } else if (obj instanceof long[]) {
            long[] jArr = (long[]) obj;
            com.amazon.aps.iva.yb0.j.f(jArr, "<this>");
            int length6 = jArr.length;
            if (length6 != 0) {
                if (length6 != 1) {
                    r1 = new ArrayList(jArr.length);
                    int length7 = jArr.length;
                    while (i < length7) {
                        r1.add(Long.valueOf(jArr[i]));
                        i++;
                    }
                } else {
                    r1 = f1.J(Long.valueOf(jArr[0]));
                }
            }
            return a(r1, c0Var, com.amazon.aps.iva.lc0.l.LONG);
        } else if (obj instanceof char[]) {
            char[] cArr = (char[]) obj;
            com.amazon.aps.iva.yb0.j.f(cArr, "<this>");
            int length8 = cArr.length;
            if (length8 != 0) {
                if (length8 != 1) {
                    r1 = new ArrayList(cArr.length);
                    int length9 = cArr.length;
                    while (i < length9) {
                        r1.add(Character.valueOf(cArr[i]));
                        i++;
                    }
                } else {
                    r1 = f1.J(Character.valueOf(cArr[0]));
                }
            }
            return a(r1, c0Var, com.amazon.aps.iva.lc0.l.CHAR);
        } else if (obj instanceof float[]) {
            float[] fArr = (float[]) obj;
            com.amazon.aps.iva.yb0.j.f(fArr, "<this>");
            int length10 = fArr.length;
            if (length10 != 0) {
                if (length10 != 1) {
                    r1 = new ArrayList(fArr.length);
                    int length11 = fArr.length;
                    while (i < length11) {
                        r1.add(Float.valueOf(fArr[i]));
                        i++;
                    }
                } else {
                    r1 = f1.J(Float.valueOf(fArr[0]));
                }
            }
            return a(r1, c0Var, com.amazon.aps.iva.lc0.l.FLOAT);
        } else if (obj instanceof double[]) {
            double[] dArr = (double[]) obj;
            com.amazon.aps.iva.yb0.j.f(dArr, "<this>");
            int length12 = dArr.length;
            if (length12 != 0) {
                if (length12 != 1) {
                    r1 = new ArrayList(dArr.length);
                    int length13 = dArr.length;
                    while (i < length13) {
                        r1.add(Double.valueOf(dArr[i]));
                        i++;
                    }
                } else {
                    r1 = f1.J(Double.valueOf(dArr[0]));
                }
            }
            return a(r1, c0Var, com.amazon.aps.iva.lc0.l.DOUBLE);
        } else if (obj instanceof boolean[]) {
            boolean[] zArr = (boolean[]) obj;
            com.amazon.aps.iva.yb0.j.f(zArr, "<this>");
            int length14 = zArr.length;
            if (length14 != 0) {
                if (length14 != 1) {
                    r1 = new ArrayList(zArr.length);
                    int length15 = zArr.length;
                    while (i < length15) {
                        r1.add(Boolean.valueOf(zArr[i]));
                        i++;
                    }
                } else {
                    r1 = f1.J(Boolean.valueOf(zArr[0]));
                }
            }
            return a(r1, c0Var, com.amazon.aps.iva.lc0.l.BOOLEAN);
        } else if (obj == null) {
            return new v();
        } else {
            return null;
        }
    }
}
