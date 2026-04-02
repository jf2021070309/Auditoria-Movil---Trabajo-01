package com.amazon.aps.iva.ee0;

import com.amazon.aps.iva.ke0.v;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
/* compiled from: TypeAttributes.kt */
/* loaded from: classes4.dex */
public final class a1 extends com.amazon.aps.iva.ke0.e<y0<?>, y0<?>> {
    public static final a c = new a(0);
    public static final a1 d = new a1(com.amazon.aps.iva.lb0.z.b);

    /* compiled from: TypeAttributes.kt */
    /* loaded from: classes4.dex */
    public static final class a extends com.amazon.aps.iva.ke0.v<y0<?>, y0<?>> {
        public a(int i) {
        }

        public static a1 c(List list) {
            if (list.isEmpty()) {
                return a1.d;
            }
            return new a1(list);
        }

        @Override // com.amazon.aps.iva.ke0.v
        public final int a(ConcurrentHashMap concurrentHashMap, String str, v.a aVar) {
            int intValue;
            com.amazon.aps.iva.yb0.j.f(concurrentHashMap, "<this>");
            Integer num = (Integer) concurrentHashMap.get(str);
            if (num == null) {
                synchronized (concurrentHashMap) {
                    Integer num2 = (Integer) concurrentHashMap.get(str);
                    if (num2 == null) {
                        Object invoke = aVar.invoke(str);
                        concurrentHashMap.putIfAbsent(str, Integer.valueOf(((Number) invoke).intValue()));
                        num2 = (Integer) invoke;
                    }
                    com.amazon.aps.iva.yb0.j.e(num2, "this[key] ?: compute(key…is.putIfAbsent(key, it) }");
                    intValue = num2.intValue();
                }
                return intValue;
            }
            return num.intValue();
        }
    }

    public a1() {
        throw null;
    }

    public a1(List<? extends y0<?>> list) {
        for (y0<?> y0Var : list) {
            com.amazon.aps.iva.fc0.d<? extends Object> b = y0Var.b();
            com.amazon.aps.iva.yb0.j.f(b, "tClass");
            int b2 = c.b(b);
            int b3 = this.b.b();
            if (b3 != 0) {
                if (b3 == 1) {
                    com.amazon.aps.iva.zb0.a aVar = this.b;
                    com.amazon.aps.iva.yb0.j.d(aVar, "null cannot be cast to non-null type org.jetbrains.kotlin.util.OneElementArrayMap<T of org.jetbrains.kotlin.util.AttributeArrayOwner>");
                    com.amazon.aps.iva.ke0.r rVar = (com.amazon.aps.iva.ke0.r) aVar;
                    if (rVar.c == b2) {
                        this.b = new com.amazon.aps.iva.ke0.r(y0Var, b2);
                    } else {
                        com.amazon.aps.iva.ke0.d dVar = new com.amazon.aps.iva.ke0.d();
                        this.b = dVar;
                        dVar.d(rVar.c, rVar.b);
                    }
                }
                this.b.d(b2, y0Var);
            } else {
                this.b = new com.amazon.aps.iva.ke0.r(y0Var, b2);
            }
        }
    }
}
