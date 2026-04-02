package com.amazon.aps.iva.xe0;

import com.amazon.aps.iva.ob0.g;
import com.amazon.aps.iva.se0.f2;
/* compiled from: ThreadContext.kt */
/* loaded from: classes4.dex */
public final class u {
    public static final s a = new s("NO_THREAD_ELEMENTS");
    public static final a b = a.h;
    public static final b c = b.h;
    public static final c d = c.h;

    /* compiled from: ThreadContext.kt */
    /* loaded from: classes4.dex */
    public static final class a extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.p<Object, g.b, Object> {
        public static final a h = new a();

        public a() {
            super(2);
        }

        @Override // com.amazon.aps.iva.xb0.p
        public final Object invoke(Object obj, g.b bVar) {
            Integer num;
            int i;
            g.b bVar2 = bVar;
            if (bVar2 instanceof f2) {
                if (obj instanceof Integer) {
                    num = (Integer) obj;
                } else {
                    num = null;
                }
                if (num != null) {
                    i = num.intValue();
                } else {
                    i = 1;
                }
                if (i == 0) {
                    return bVar2;
                }
                return Integer.valueOf(i + 1);
            }
            return obj;
        }
    }

    /* compiled from: ThreadContext.kt */
    /* loaded from: classes4.dex */
    public static final class b extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.p<f2<?>, g.b, f2<?>> {
        public static final b h = new b();

        public b() {
            super(2);
        }

        @Override // com.amazon.aps.iva.xb0.p
        public final f2<?> invoke(f2<?> f2Var, g.b bVar) {
            f2<?> f2Var2 = f2Var;
            g.b bVar2 = bVar;
            if (f2Var2 == null) {
                if (bVar2 instanceof f2) {
                    return (f2) bVar2;
                }
                return null;
            }
            return f2Var2;
        }
    }

    /* compiled from: ThreadContext.kt */
    /* loaded from: classes4.dex */
    public static final class c extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.p<x, g.b, x> {
        public static final c h = new c();

        public c() {
            super(2);
        }

        @Override // com.amazon.aps.iva.xb0.p
        public final x invoke(x xVar, g.b bVar) {
            x xVar2 = xVar;
            g.b bVar2 = bVar;
            if (bVar2 instanceof f2) {
                f2<Object> f2Var = (f2) bVar2;
                String o0 = f2Var.o0(xVar2.a);
                int i = xVar2.d;
                xVar2.b[i] = o0;
                xVar2.d = i + 1;
                xVar2.c[i] = f2Var;
            }
            return xVar2;
        }
    }

    public static final void a(com.amazon.aps.iva.ob0.g gVar, Object obj) {
        if (obj == a) {
            return;
        }
        if (obj instanceof x) {
            x xVar = (x) obj;
            f2<Object>[] f2VarArr = xVar.c;
            int length = f2VarArr.length - 1;
            if (length < 0) {
                return;
            }
            while (true) {
                int i = length - 1;
                f2<Object> f2Var = f2VarArr[length];
                com.amazon.aps.iva.yb0.j.c(f2Var);
                f2Var.H(xVar.b[length]);
                if (i >= 0) {
                    length = i;
                } else {
                    return;
                }
            }
        } else {
            Object fold = gVar.fold(null, c);
            if (fold != null) {
                ((f2) fold).H(obj);
                return;
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlinx.coroutines.ThreadContextElement<kotlin.Any?>");
        }
    }

    public static final Object b(com.amazon.aps.iva.ob0.g gVar) {
        Object fold = gVar.fold(0, b);
        com.amazon.aps.iva.yb0.j.c(fold);
        return fold;
    }

    public static final Object c(com.amazon.aps.iva.ob0.g gVar, Object obj) {
        if (obj == null) {
            obj = b(gVar);
        }
        if (obj == 0) {
            return a;
        }
        if (obj instanceof Integer) {
            return gVar.fold(new x(gVar, ((Number) obj).intValue()), d);
        }
        return ((f2) obj).o0(gVar);
    }
}
