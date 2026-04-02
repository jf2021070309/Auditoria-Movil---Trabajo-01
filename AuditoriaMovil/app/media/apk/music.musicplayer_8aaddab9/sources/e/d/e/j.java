package e.d.e;

import java.io.IOException;
import java.io.StringWriter;
import java.io.Writer;
import java.lang.reflect.Type;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicLongArray;
/* loaded from: classes2.dex */
public final class j {
    public static final e.d.e.d0.a<?> a = new e.d.e.d0.a<>(Object.class);

    /* renamed from: b  reason: collision with root package name */
    public final ThreadLocal<Map<e.d.e.d0.a<?>, a<?>>> f7921b;

    /* renamed from: c  reason: collision with root package name */
    public final Map<e.d.e.d0.a<?>, z<?>> f7922c;

    /* renamed from: d  reason: collision with root package name */
    public final e.d.e.c0.g f7923d;

    /* renamed from: e  reason: collision with root package name */
    public final e.d.e.c0.z.d f7924e;

    /* renamed from: f  reason: collision with root package name */
    public final List<a0> f7925f;

    /* renamed from: g  reason: collision with root package name */
    public final boolean f7926g;

    /* renamed from: h  reason: collision with root package name */
    public final List<a0> f7927h;

    /* renamed from: i  reason: collision with root package name */
    public final List<a0> f7928i;

    /* loaded from: classes2.dex */
    public static class a<T> extends z<T> {
        public z<T> a;

        @Override // e.d.e.z
        public T a(e.d.e.e0.a aVar) throws IOException {
            z<T> zVar = this.a;
            if (zVar != null) {
                return zVar.a(aVar);
            }
            throw new IllegalStateException();
        }

        @Override // e.d.e.z
        public void b(e.d.e.e0.c cVar, T t) throws IOException {
            z<T> zVar = this.a;
            if (zVar == null) {
                throw new IllegalStateException();
            }
            zVar.b(cVar, t);
        }
    }

    public j() {
        e.d.e.c0.o oVar = e.d.e.c0.o.a;
        c cVar = c.IDENTITY;
        Map emptyMap = Collections.emptyMap();
        x xVar = x.DEFAULT;
        List<a0> emptyList = Collections.emptyList();
        List<a0> emptyList2 = Collections.emptyList();
        List emptyList3 = Collections.emptyList();
        this.f7921b = new ThreadLocal<>();
        this.f7922c = new ConcurrentHashMap();
        this.f7923d = new e.d.e.c0.g(emptyMap);
        this.f7926g = true;
        this.f7927h = emptyList;
        this.f7928i = emptyList2;
        ArrayList arrayList = new ArrayList();
        arrayList.add(e.d.e.c0.z.o.Y);
        arrayList.add(e.d.e.c0.z.h.a);
        arrayList.add(oVar);
        arrayList.addAll(emptyList3);
        arrayList.add(e.d.e.c0.z.o.D);
        arrayList.add(e.d.e.c0.z.o.f7886m);
        arrayList.add(e.d.e.c0.z.o.f7880g);
        arrayList.add(e.d.e.c0.z.o.f7882i);
        arrayList.add(e.d.e.c0.z.o.f7884k);
        z gVar = xVar == xVar ? e.d.e.c0.z.o.t : new g();
        arrayList.add(new e.d.e.c0.z.q(Long.TYPE, Long.class, gVar));
        arrayList.add(new e.d.e.c0.z.q(Double.TYPE, Double.class, new e(this)));
        arrayList.add(new e.d.e.c0.z.q(Float.TYPE, Float.class, new f(this)));
        arrayList.add(e.d.e.c0.z.o.x);
        arrayList.add(e.d.e.c0.z.o.o);
        arrayList.add(e.d.e.c0.z.o.q);
        arrayList.add(new e.d.e.c0.z.p(AtomicLong.class, new y(new h(gVar))));
        arrayList.add(new e.d.e.c0.z.p(AtomicLongArray.class, new y(new i(gVar))));
        arrayList.add(e.d.e.c0.z.o.s);
        arrayList.add(e.d.e.c0.z.o.z);
        arrayList.add(e.d.e.c0.z.o.F);
        arrayList.add(e.d.e.c0.z.o.H);
        arrayList.add(new e.d.e.c0.z.p(BigDecimal.class, e.d.e.c0.z.o.B));
        arrayList.add(new e.d.e.c0.z.p(BigInteger.class, e.d.e.c0.z.o.C));
        arrayList.add(e.d.e.c0.z.o.J);
        arrayList.add(e.d.e.c0.z.o.L);
        arrayList.add(e.d.e.c0.z.o.P);
        arrayList.add(e.d.e.c0.z.o.R);
        arrayList.add(e.d.e.c0.z.o.W);
        arrayList.add(e.d.e.c0.z.o.N);
        arrayList.add(e.d.e.c0.z.o.f7877d);
        arrayList.add(e.d.e.c0.z.c.a);
        arrayList.add(e.d.e.c0.z.o.U);
        arrayList.add(e.d.e.c0.z.l.a);
        arrayList.add(e.d.e.c0.z.k.a);
        arrayList.add(e.d.e.c0.z.o.S);
        arrayList.add(e.d.e.c0.z.a.a);
        arrayList.add(e.d.e.c0.z.o.f7875b);
        arrayList.add(new e.d.e.c0.z.b(this.f7923d));
        arrayList.add(new e.d.e.c0.z.g(this.f7923d, false));
        e.d.e.c0.z.d dVar = new e.d.e.c0.z.d(this.f7923d);
        this.f7924e = dVar;
        arrayList.add(dVar);
        arrayList.add(e.d.e.c0.z.o.Z);
        arrayList.add(new e.d.e.c0.z.j(this.f7923d, cVar, oVar, dVar));
        this.f7925f = Collections.unmodifiableList(arrayList);
    }

    public static void a(double d2) {
        if (Double.isNaN(d2) || Double.isInfinite(d2)) {
            throw new IllegalArgumentException(d2 + " is not a valid double value as per JSON specification. To override this behavior, use GsonBuilder.serializeSpecialFloatingPointValues() method.");
        }
    }

    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0062 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public <T> T b(java.lang.String r5, java.lang.Class<T> r6) throws e.d.e.w {
        /*
            Method dump skipped, instructions count: 206
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: e.d.e.j.b(java.lang.String, java.lang.Class):java.lang.Object");
    }

    public <T> z<T> c(e.d.e.d0.a<T> aVar) {
        z<T> zVar = (z<T>) this.f7922c.get(aVar);
        if (zVar != null) {
            return zVar;
        }
        Map<e.d.e.d0.a<?>, a<?>> map = this.f7921b.get();
        boolean z = false;
        if (map == null) {
            map = new HashMap<>();
            this.f7921b.set(map);
            z = true;
        }
        a<?> aVar2 = map.get(aVar);
        if (aVar2 != null) {
            return aVar2;
        }
        try {
            a<?> aVar3 = new a<>();
            map.put(aVar, aVar3);
            for (a0 a0Var : this.f7925f) {
                z<T> a2 = a0Var.a(this, aVar);
                if (a2 != null) {
                    if (aVar3.a == null) {
                        aVar3.a = a2;
                        this.f7922c.put(aVar, a2);
                        return a2;
                    }
                    throw new AssertionError();
                }
            }
            throw new IllegalArgumentException("GSON (2.8.6) cannot handle " + aVar);
        } finally {
            map.remove(aVar);
            if (z) {
                this.f7921b.remove();
            }
        }
    }

    public <T> z<T> d(a0 a0Var, e.d.e.d0.a<T> aVar) {
        if (!this.f7925f.contains(a0Var)) {
            a0Var = this.f7924e;
        }
        boolean z = false;
        for (a0 a0Var2 : this.f7925f) {
            if (z) {
                z<T> a2 = a0Var2.a(this, aVar);
                if (a2 != null) {
                    return a2;
                }
            } else if (a0Var2 == a0Var) {
                z = true;
            }
        }
        throw new IllegalArgumentException("GSON cannot serialize " + aVar);
    }

    public e.d.e.e0.c e(Writer writer) throws IOException {
        e.d.e.e0.c cVar = new e.d.e.e0.c(writer);
        cVar.f7920k = false;
        return cVar;
    }

    public String f(Object obj) {
        if (obj == null) {
            o oVar = q.a;
            StringWriter stringWriter = new StringWriter();
            try {
                g(oVar, e(stringWriter));
                return stringWriter.toString();
            } catch (IOException e2) {
                throw new p(e2);
            }
        }
        Type type = obj.getClass();
        StringWriter stringWriter2 = new StringWriter();
        try {
            h(obj, type, e(stringWriter2));
            return stringWriter2.toString();
        } catch (IOException e3) {
            throw new p(e3);
        }
    }

    public void g(o oVar, e.d.e.e0.c cVar) throws p {
        boolean z = cVar.f7917h;
        cVar.f7917h = true;
        boolean z2 = cVar.f7918i;
        cVar.f7918i = this.f7926g;
        boolean z3 = cVar.f7920k;
        cVar.f7920k = false;
        try {
            try {
                e.d.e.c0.z.o.X.b(cVar, oVar);
            } catch (IOException e2) {
                throw new p(e2);
            } catch (AssertionError e3) {
                AssertionError assertionError = new AssertionError("AssertionError (GSON 2.8.6): " + e3.getMessage());
                assertionError.initCause(e3);
                throw assertionError;
            }
        } finally {
            cVar.f7917h = z;
            cVar.f7918i = z2;
            cVar.f7920k = z3;
        }
    }

    public void h(Object obj, Type type, e.d.e.e0.c cVar) throws p {
        z c2 = c(new e.d.e.d0.a(type));
        boolean z = cVar.f7917h;
        cVar.f7917h = true;
        boolean z2 = cVar.f7918i;
        cVar.f7918i = this.f7926g;
        boolean z3 = cVar.f7920k;
        cVar.f7920k = false;
        try {
            try {
                try {
                    c2.b(cVar, obj);
                } catch (IOException e2) {
                    throw new p(e2);
                }
            } catch (AssertionError e3) {
                AssertionError assertionError = new AssertionError("AssertionError (GSON 2.8.6): " + e3.getMessage());
                assertionError.initCause(e3);
                throw assertionError;
            }
        } finally {
            cVar.f7917h = z;
            cVar.f7918i = z2;
            cVar.f7920k = z3;
        }
    }

    public String toString() {
        return "{serializeNulls:false,factories:" + this.f7925f + ",instanceCreators:" + this.f7923d + "}";
    }
}
