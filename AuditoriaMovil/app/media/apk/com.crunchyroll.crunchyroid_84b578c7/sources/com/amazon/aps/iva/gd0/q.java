package com.amazon.aps.iva.gd0;

import com.amazon.aps.iva.gd0.p;
import com.amazon.aps.iva.o0.t1;
/* compiled from: methodSignatureMapping.kt */
/* loaded from: classes4.dex */
public final class q {
    public static final q a = new q();

    /* compiled from: methodSignatureMapping.kt */
    /* loaded from: classes4.dex */
    public /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[com.amazon.aps.iva.lc0.l.values().length];
            try {
                iArr[com.amazon.aps.iva.lc0.l.BOOLEAN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[com.amazon.aps.iva.lc0.l.CHAR.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[com.amazon.aps.iva.lc0.l.BYTE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[com.amazon.aps.iva.lc0.l.SHORT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[com.amazon.aps.iva.lc0.l.INT.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[com.amazon.aps.iva.lc0.l.FLOAT.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[com.amazon.aps.iva.lc0.l.LONG.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[com.amazon.aps.iva.lc0.l.DOUBLE.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            a = iArr;
        }
    }

    public static p a(String str) {
        com.amazon.aps.iva.vd0.c cVar;
        p bVar;
        boolean z;
        com.amazon.aps.iva.yb0.j.f(str, "representation");
        char charAt = str.charAt(0);
        com.amazon.aps.iva.vd0.c[] values = com.amazon.aps.iva.vd0.c.values();
        int length = values.length;
        int i = 0;
        while (true) {
            if (i < length) {
                cVar = values[i];
                if (cVar.getDesc().charAt(0) == charAt) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    break;
                }
                i++;
            } else {
                cVar = null;
                break;
            }
        }
        if (cVar != null) {
            return new p.c(cVar);
        }
        if (charAt == 'V') {
            return new p.c(null);
        }
        if (charAt == '[') {
            String substring = str.substring(1);
            com.amazon.aps.iva.yb0.j.e(substring, "this as java.lang.String).substring(startIndex)");
            bVar = new p.a(a(substring));
        } else {
            if (charAt == 'L') {
                com.amazon.aps.iva.oe0.q.k0(str, ';');
            }
            String substring2 = str.substring(1, str.length() - 1);
            com.amazon.aps.iva.yb0.j.e(substring2, "this as java.lang.String…ing(startIndex, endIndex)");
            bVar = new p.b(substring2);
        }
        return bVar;
    }

    public static String e(p pVar) {
        String desc;
        com.amazon.aps.iva.yb0.j.f(pVar, "type");
        if (pVar instanceof p.a) {
            return "[" + e(((p.a) pVar).i);
        } else if (pVar instanceof p.c) {
            com.amazon.aps.iva.vd0.c cVar = ((p.c) pVar).i;
            if (cVar == null || (desc = cVar.getDesc()) == null) {
                return "V";
            }
            return desc;
        } else if (pVar instanceof p.b) {
            return t1.b(new StringBuilder("L"), ((p.b) pVar).i, ';');
        } else {
            throw new com.amazon.aps.iva.kb0.h();
        }
    }

    public final p.b b(String str) {
        com.amazon.aps.iva.yb0.j.f(str, "internalName");
        return new p.b(str);
    }

    public final p.c c(com.amazon.aps.iva.lc0.l lVar) {
        switch (a.a[lVar.ordinal()]) {
            case 1:
                return p.a;
            case 2:
                return p.b;
            case 3:
                return p.c;
            case 4:
                return p.d;
            case 5:
                return p.e;
            case 6:
                return p.f;
            case 7:
                return p.g;
            case 8:
                return p.h;
            default:
                throw new com.amazon.aps.iva.kb0.h();
        }
    }

    public final p.b d() {
        return new p.b("java/lang/Class");
    }

    public final /* bridge */ /* synthetic */ String f(Object obj) {
        return e((p) obj);
    }
}
