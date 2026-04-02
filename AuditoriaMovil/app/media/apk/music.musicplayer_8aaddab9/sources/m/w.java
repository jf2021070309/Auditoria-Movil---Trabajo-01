package m;

import j.r;
import j.v;
import java.io.IOException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;
import m.a;
/* loaded from: classes.dex */
public abstract class w<T> {

    /* loaded from: classes.dex */
    public static final class a<T> extends w<T> {
        public final Method a;

        /* renamed from: b  reason: collision with root package name */
        public final int f9884b;

        /* renamed from: c  reason: collision with root package name */
        public final m.j<T, j.c0> f9885c;

        public a(Method method, int i2, m.j<T, j.c0> jVar) {
            this.a = method;
            this.f9884b = i2;
            this.f9885c = jVar;
        }

        @Override // m.w
        public void a(y yVar, @Nullable T t) {
            if (t == null) {
                throw g0.l(this.a, this.f9884b, "Body parameter value must not be null.", new Object[0]);
            }
            try {
                yVar.f9919m = this.f9885c.a(t);
            } catch (IOException e2) {
                Method method = this.a;
                int i2 = this.f9884b;
                throw g0.m(method, e2, i2, "Unable to convert " + t + " to RequestBody", new Object[0]);
            }
        }
    }

    /* loaded from: classes.dex */
    public static final class b<T> extends w<T> {
        public final String a;

        /* renamed from: b  reason: collision with root package name */
        public final m.j<T, String> f9886b;

        /* renamed from: c  reason: collision with root package name */
        public final boolean f9887c;

        public b(String str, m.j<T, String> jVar, boolean z) {
            Objects.requireNonNull(str, "name == null");
            this.a = str;
            this.f9886b = jVar;
            this.f9887c = z;
        }

        @Override // m.w
        public void a(y yVar, @Nullable T t) throws IOException {
            String a;
            if (t == null || (a = this.f9886b.a(t)) == null) {
                return;
            }
            yVar.a(this.a, a, this.f9887c);
        }
    }

    /* loaded from: classes.dex */
    public static final class c<T> extends w<Map<String, T>> {
        public final Method a;

        /* renamed from: b  reason: collision with root package name */
        public final int f9888b;

        /* renamed from: c  reason: collision with root package name */
        public final boolean f9889c;

        public c(Method method, int i2, m.j<T, String> jVar, boolean z) {
            this.a = method;
            this.f9888b = i2;
            this.f9889c = z;
        }

        @Override // m.w
        public void a(y yVar, @Nullable Object obj) throws IOException {
            Map map = (Map) obj;
            if (map == null) {
                throw g0.l(this.a, this.f9888b, "Field map was null.", new Object[0]);
            }
            for (Map.Entry entry : map.entrySet()) {
                String str = (String) entry.getKey();
                if (str == null) {
                    throw g0.l(this.a, this.f9888b, "Field map contained null key.", new Object[0]);
                }
                Object value = entry.getValue();
                if (value == null) {
                    throw g0.l(this.a, this.f9888b, e.a.d.a.a.l("Field map contained null value for key '", str, "'."), new Object[0]);
                }
                String obj2 = value.toString();
                if (obj2 == null) {
                    Method method = this.a;
                    int i2 = this.f9888b;
                    throw g0.l(method, i2, "Field map value '" + value + "' converted to null by " + a.d.class.getName() + " for key '" + str + "'.", new Object[0]);
                }
                yVar.a(str, obj2, this.f9889c);
            }
        }
    }

    /* loaded from: classes.dex */
    public static final class d<T> extends w<T> {
        public final String a;

        /* renamed from: b  reason: collision with root package name */
        public final m.j<T, String> f9890b;

        public d(String str, m.j<T, String> jVar) {
            Objects.requireNonNull(str, "name == null");
            this.a = str;
            this.f9890b = jVar;
        }

        @Override // m.w
        public void a(y yVar, @Nullable T t) throws IOException {
            String a;
            if (t == null || (a = this.f9890b.a(t)) == null) {
                return;
            }
            yVar.b(this.a, a);
        }
    }

    /* loaded from: classes.dex */
    public static final class e<T> extends w<Map<String, T>> {
        public final Method a;

        /* renamed from: b  reason: collision with root package name */
        public final int f9891b;

        public e(Method method, int i2, m.j<T, String> jVar) {
            this.a = method;
            this.f9891b = i2;
        }

        @Override // m.w
        public void a(y yVar, @Nullable Object obj) throws IOException {
            Map map = (Map) obj;
            if (map == null) {
                throw g0.l(this.a, this.f9891b, "Header map was null.", new Object[0]);
            }
            for (Map.Entry entry : map.entrySet()) {
                String str = (String) entry.getKey();
                if (str == null) {
                    throw g0.l(this.a, this.f9891b, "Header map contained null key.", new Object[0]);
                }
                Object value = entry.getValue();
                if (value == null) {
                    throw g0.l(this.a, this.f9891b, e.a.d.a.a.l("Header map contained null value for key '", str, "'."), new Object[0]);
                }
                yVar.b(str, value.toString());
            }
        }
    }

    /* loaded from: classes.dex */
    public static final class f extends w<j.r> {
        public final Method a;

        /* renamed from: b  reason: collision with root package name */
        public final int f9892b;

        public f(Method method, int i2) {
            this.a = method;
            this.f9892b = i2;
        }

        @Override // m.w
        public void a(y yVar, @Nullable j.r rVar) throws IOException {
            j.r rVar2 = rVar;
            if (rVar2 == null) {
                throw g0.l(this.a, this.f9892b, "Headers parameter must not be null.", new Object[0]);
            }
            r.a aVar = yVar.f9914h;
            Objects.requireNonNull(aVar);
            int g2 = rVar2.g();
            for (int i2 = 0; i2 < g2; i2++) {
                aVar.b(rVar2.d(i2), rVar2.h(i2));
            }
        }
    }

    /* loaded from: classes.dex */
    public static final class g<T> extends w<T> {
        public final Method a;

        /* renamed from: b  reason: collision with root package name */
        public final int f9893b;

        /* renamed from: c  reason: collision with root package name */
        public final j.r f9894c;

        /* renamed from: d  reason: collision with root package name */
        public final m.j<T, j.c0> f9895d;

        public g(Method method, int i2, j.r rVar, m.j<T, j.c0> jVar) {
            this.a = method;
            this.f9893b = i2;
            this.f9894c = rVar;
            this.f9895d = jVar;
        }

        @Override // m.w
        public void a(y yVar, @Nullable T t) {
            if (t == null) {
                return;
            }
            try {
                yVar.c(this.f9894c, this.f9895d.a(t));
            } catch (IOException e2) {
                Method method = this.a;
                int i2 = this.f9893b;
                throw g0.l(method, i2, "Unable to convert " + t + " to RequestBody", e2);
            }
        }
    }

    /* loaded from: classes.dex */
    public static final class h<T> extends w<Map<String, T>> {
        public final Method a;

        /* renamed from: b  reason: collision with root package name */
        public final int f9896b;

        /* renamed from: c  reason: collision with root package name */
        public final m.j<T, j.c0> f9897c;

        /* renamed from: d  reason: collision with root package name */
        public final String f9898d;

        public h(Method method, int i2, m.j<T, j.c0> jVar, String str) {
            this.a = method;
            this.f9896b = i2;
            this.f9897c = jVar;
            this.f9898d = str;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // m.w
        public void a(y yVar, @Nullable Object obj) throws IOException {
            Map map = (Map) obj;
            if (map == null) {
                throw g0.l(this.a, this.f9896b, "Part map was null.", new Object[0]);
            }
            for (Map.Entry entry : map.entrySet()) {
                String str = (String) entry.getKey();
                if (str == null) {
                    throw g0.l(this.a, this.f9896b, "Part map contained null key.", new Object[0]);
                }
                Object value = entry.getValue();
                if (value == null) {
                    throw g0.l(this.a, this.f9896b, e.a.d.a.a.l("Part map contained null value for key '", str, "'."), new Object[0]);
                }
                yVar.c(j.r.f("Content-Disposition", e.a.d.a.a.l("form-data; name=\"", str, "\""), "Content-Transfer-Encoding", this.f9898d), (j.c0) this.f9897c.a(value));
            }
        }
    }

    /* loaded from: classes.dex */
    public static final class i<T> extends w<T> {
        public final Method a;

        /* renamed from: b  reason: collision with root package name */
        public final int f9899b;

        /* renamed from: c  reason: collision with root package name */
        public final String f9900c;

        /* renamed from: d  reason: collision with root package name */
        public final m.j<T, String> f9901d;

        /* renamed from: e  reason: collision with root package name */
        public final boolean f9902e;

        public i(Method method, int i2, String str, m.j<T, String> jVar, boolean z) {
            this.a = method;
            this.f9899b = i2;
            Objects.requireNonNull(str, "name == null");
            this.f9900c = str;
            this.f9901d = jVar;
            this.f9902e = z;
        }

        /* JADX WARN: Removed duplicated region for block: B:52:0x00e5  */
        /* JADX WARN: Removed duplicated region for block: B:54:0x00e8  */
        @Override // m.w
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public void a(m.y r18, @javax.annotation.Nullable T r19) throws java.io.IOException {
            /*
                Method dump skipped, instructions count: 277
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: m.w.i.a(m.y, java.lang.Object):void");
        }
    }

    /* loaded from: classes.dex */
    public static final class j<T> extends w<T> {
        public final String a;

        /* renamed from: b  reason: collision with root package name */
        public final m.j<T, String> f9903b;

        /* renamed from: c  reason: collision with root package name */
        public final boolean f9904c;

        public j(String str, m.j<T, String> jVar, boolean z) {
            Objects.requireNonNull(str, "name == null");
            this.a = str;
            this.f9903b = jVar;
            this.f9904c = z;
        }

        @Override // m.w
        public void a(y yVar, @Nullable T t) throws IOException {
            String a;
            if (t == null || (a = this.f9903b.a(t)) == null) {
                return;
            }
            yVar.d(this.a, a, this.f9904c);
        }
    }

    /* loaded from: classes.dex */
    public static final class k<T> extends w<Map<String, T>> {
        public final Method a;

        /* renamed from: b  reason: collision with root package name */
        public final int f9905b;

        /* renamed from: c  reason: collision with root package name */
        public final boolean f9906c;

        public k(Method method, int i2, m.j<T, String> jVar, boolean z) {
            this.a = method;
            this.f9905b = i2;
            this.f9906c = z;
        }

        @Override // m.w
        public void a(y yVar, @Nullable Object obj) throws IOException {
            Map map = (Map) obj;
            if (map == null) {
                throw g0.l(this.a, this.f9905b, "Query map was null", new Object[0]);
            }
            for (Map.Entry entry : map.entrySet()) {
                String str = (String) entry.getKey();
                if (str == null) {
                    throw g0.l(this.a, this.f9905b, "Query map contained null key.", new Object[0]);
                }
                Object value = entry.getValue();
                if (value == null) {
                    throw g0.l(this.a, this.f9905b, e.a.d.a.a.l("Query map contained null value for key '", str, "'."), new Object[0]);
                }
                String obj2 = value.toString();
                if (obj2 == null) {
                    Method method = this.a;
                    int i2 = this.f9905b;
                    throw g0.l(method, i2, "Query map value '" + value + "' converted to null by " + a.d.class.getName() + " for key '" + str + "'.", new Object[0]);
                }
                yVar.d(str, obj2, this.f9906c);
            }
        }
    }

    /* loaded from: classes.dex */
    public static final class l<T> extends w<T> {
        public final boolean a;

        public l(m.j<T, String> jVar, boolean z) {
            this.a = z;
        }

        @Override // m.w
        public void a(y yVar, @Nullable T t) throws IOException {
            if (t == null) {
                return;
            }
            yVar.d(t.toString(), null, this.a);
        }
    }

    /* loaded from: classes.dex */
    public static final class m extends w<v.b> {
        public static final m a = new m();

        @Override // m.w
        public void a(y yVar, @Nullable v.b bVar) throws IOException {
            v.b bVar2 = bVar;
            if (bVar2 != null) {
                v.a aVar = yVar.f9917k;
                Objects.requireNonNull(aVar);
                aVar.f9565c.add(bVar2);
            }
        }
    }

    /* loaded from: classes.dex */
    public static final class n extends w<Object> {
        public final Method a;

        /* renamed from: b  reason: collision with root package name */
        public final int f9907b;

        public n(Method method, int i2) {
            this.a = method;
            this.f9907b = i2;
        }

        @Override // m.w
        public void a(y yVar, @Nullable Object obj) {
            if (obj == null) {
                throw g0.l(this.a, this.f9907b, "@Url parameter is null.", new Object[0]);
            }
            Objects.requireNonNull(yVar);
            yVar.f9911e = obj.toString();
        }
    }

    /* loaded from: classes.dex */
    public static final class o<T> extends w<T> {
        public final Class<T> a;

        public o(Class<T> cls) {
            this.a = cls;
        }

        @Override // m.w
        public void a(y yVar, @Nullable T t) {
            yVar.f9913g.d(this.a, t);
        }
    }

    public abstract void a(y yVar, @Nullable T t) throws IOException;
}
