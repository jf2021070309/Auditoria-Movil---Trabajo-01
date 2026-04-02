package i.a.i2;

import h.m.f;
import i.a.x1;
import java.util.Objects;
/* loaded from: classes2.dex */
public final class s {
    public static final q a = new q("NO_THREAD_ELEMENTS");

    /* renamed from: b  reason: collision with root package name */
    public static final h.o.b.p<Object, f.a, Object> f9081b = a.a;

    /* renamed from: c  reason: collision with root package name */
    public static final h.o.b.p<x1<?>, f.a, x1<?>> f9082c = b.a;

    /* renamed from: d  reason: collision with root package name */
    public static final h.o.b.p<v, f.a, v> f9083d = c.a;

    /* loaded from: classes2.dex */
    public static final class a extends h.o.c.k implements h.o.b.p<Object, f.a, Object> {
        public static final a a = new a();

        public a() {
            super(2);
        }

        @Override // h.o.b.p
        public Object i(Object obj, f.a aVar) {
            f.a aVar2 = aVar;
            if (aVar2 instanceof x1) {
                Integer num = obj instanceof Integer ? (Integer) obj : null;
                int intValue = num == null ? 1 : num.intValue();
                return intValue == 0 ? aVar2 : Integer.valueOf(intValue + 1);
            }
            return obj;
        }
    }

    /* loaded from: classes2.dex */
    public static final class b extends h.o.c.k implements h.o.b.p<x1<?>, f.a, x1<?>> {
        public static final b a = new b();

        public b() {
            super(2);
        }

        @Override // h.o.b.p
        public x1<?> i(x1<?> x1Var, f.a aVar) {
            x1<?> x1Var2 = x1Var;
            f.a aVar2 = aVar;
            if (x1Var2 != null) {
                return x1Var2;
            }
            if (aVar2 instanceof x1) {
                return (x1) aVar2;
            }
            return null;
        }
    }

    /* loaded from: classes2.dex */
    public static final class c extends h.o.c.k implements h.o.b.p<v, f.a, v> {
        public static final c a = new c();

        public c() {
            super(2);
        }

        @Override // h.o.b.p
        public v i(v vVar, f.a aVar) {
            v vVar2 = vVar;
            f.a aVar2 = aVar;
            if (aVar2 instanceof x1) {
                x1<Object> x1Var = (x1) aVar2;
                Object a0 = x1Var.a0(vVar2.a);
                Object[] objArr = vVar2.f9084b;
                int i2 = vVar2.f9086d;
                objArr[i2] = a0;
                x1<Object>[] x1VarArr = vVar2.f9085c;
                vVar2.f9086d = i2 + 1;
                x1VarArr[i2] = x1Var;
            }
            return vVar2;
        }
    }

    public static final void a(h.m.f fVar, Object obj) {
        if (obj == a) {
            return;
        }
        if (!(obj instanceof v)) {
            Object fold = fVar.fold(null, f9082c);
            Objects.requireNonNull(fold, "null cannot be cast to non-null type kotlinx.coroutines.ThreadContextElement<kotlin.Any?>");
            ((x1) fold).K(fVar, obj);
            return;
        }
        v vVar = (v) obj;
        int length = vVar.f9085c.length - 1;
        if (length < 0) {
            return;
        }
        while (true) {
            int i2 = length - 1;
            x1<Object> x1Var = vVar.f9085c[length];
            h.o.c.j.c(x1Var);
            x1Var.K(fVar, vVar.f9084b[length]);
            if (i2 < 0) {
                return;
            }
            length = i2;
        }
    }

    public static final Object b(h.m.f fVar, Object obj) {
        if (obj == null) {
            obj = fVar.fold(0, f9081b);
            h.o.c.j.c(obj);
        }
        return obj == 0 ? a : obj instanceof Integer ? fVar.fold(new v(fVar, ((Number) obj).intValue()), f9083d) : ((x1) obj).a0(fVar);
    }
}
