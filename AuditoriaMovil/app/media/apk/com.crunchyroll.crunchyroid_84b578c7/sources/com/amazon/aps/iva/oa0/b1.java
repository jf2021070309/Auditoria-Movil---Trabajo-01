package com.amazon.aps.iva.oa0;
/* compiled from: SingularParamsBase.java */
/* loaded from: classes4.dex */
public class b1 extends a1 {
    public final void e(y yVar) {
        if (!f1.i(yVar.b)) {
            put("aifa", yVar.b);
            return;
        }
        String str = yVar.d;
        if (!f1.i(str)) {
            put("asid", str);
        }
    }

    public b1 g(y yVar) {
        put("i", yVar.n);
        put("p", yVar.r);
        i0 i0Var = yVar.i;
        if (i0Var != null && !f1.i(i0Var.a)) {
            put("k", "sdid");
            put("u", i0Var.a);
            e(yVar);
        } else {
            String str = yVar.g;
            if (!f1.i(str)) {
                put("amid", str);
                put("k", "AMID");
                put("u", str);
                e(yVar);
            } else {
                String str2 = yVar.b;
                if (!f1.i(str2)) {
                    put("aifa", str2);
                    put("k", "AIFA");
                    put("u", str2);
                } else {
                    yVar.getClass();
                    boolean i = f1.i(null);
                    String str3 = yVar.d;
                    if (!i) {
                        put("k", "OAID");
                        put("u", null);
                        put("oaid", null);
                        if (!f1.i(str3)) {
                            put("asid", str3);
                        }
                    } else if (!f1.i(yVar.c)) {
                        put("imei", yVar.c);
                        put("k", "IMEI");
                        put("u", yVar.c);
                    } else if (!f1.i(str3)) {
                        put("k", "ASID");
                        put("u", str3);
                        put("asid", str3);
                    } else {
                        String str4 = yVar.a;
                        if (!f1.i(str4)) {
                            put("k", "ANDI");
                            put("u", str4);
                            put("andi", str4);
                        }
                    }
                }
            }
        }
        return this;
    }
}
