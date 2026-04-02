package e.d.e.c0.z;

import e.d.e.a0;
import e.d.e.c0.t;
import e.d.e.e0.a;
import e.d.e.w;
import e.d.e.z;
import java.io.IOException;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.Properties;
/* loaded from: classes2.dex */
public final class g implements a0 {
    public final e.d.e.c0.g a;

    /* renamed from: b  reason: collision with root package name */
    public final boolean f7848b;

    /* loaded from: classes2.dex */
    public final class a<K, V> extends z<Map<K, V>> {
        public final z<K> a;

        /* renamed from: b  reason: collision with root package name */
        public final z<V> f7849b;

        /* renamed from: c  reason: collision with root package name */
        public final t<? extends Map<K, V>> f7850c;

        public a(e.d.e.j jVar, Type type, z<K> zVar, Type type2, z<V> zVar2, t<? extends Map<K, V>> tVar) {
            this.a = new n(jVar, zVar, type);
            this.f7849b = new n(jVar, zVar2, type2);
            this.f7850c = tVar;
        }

        @Override // e.d.e.z
        public Object a(e.d.e.e0.a aVar) throws IOException {
            e.d.e.e0.b g0 = aVar.g0();
            if (g0 == e.d.e.e0.b.NULL) {
                aVar.a0();
                return null;
            }
            Map<K, V> a = this.f7850c.a();
            if (g0 == e.d.e.e0.b.BEGIN_ARRAY) {
                aVar.a();
                while (aVar.y()) {
                    aVar.a();
                    K a2 = this.a.a(aVar);
                    if (a.put(a2, this.f7849b.a(aVar)) != null) {
                        throw new w("duplicate key: " + a2);
                    }
                    aVar.m();
                }
                aVar.m();
            } else {
                aVar.f();
                while (aVar.y()) {
                    Objects.requireNonNull((a.C0172a) e.d.e.c0.q.a);
                    if (aVar instanceof e) {
                        e eVar = (e) aVar;
                        eVar.n0(e.d.e.e0.b.NAME);
                        Map.Entry entry = (Map.Entry) ((Iterator) eVar.o0()).next();
                        eVar.q0(entry.getValue());
                        eVar.q0(new e.d.e.t((String) entry.getKey()));
                    } else {
                        int i2 = aVar.f7905i;
                        if (i2 == 0) {
                            i2 = aVar.i();
                        }
                        if (i2 == 13) {
                            aVar.f7905i = 9;
                        } else if (i2 == 12) {
                            aVar.f7905i = 8;
                        } else if (i2 != 14) {
                            StringBuilder y = e.a.d.a.a.y("Expected a name but was ");
                            y.append(aVar.g0());
                            y.append(aVar.B());
                            throw new IllegalStateException(y.toString());
                        } else {
                            aVar.f7905i = 10;
                        }
                    }
                    K a3 = this.a.a(aVar);
                    if (a.put(a3, this.f7849b.a(aVar)) != null) {
                        throw new w("duplicate key: " + a3);
                    }
                }
                aVar.r();
            }
            return a;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // e.d.e.z
        public void b(e.d.e.e0.c cVar, Object obj) throws IOException {
            String str;
            Map map = (Map) obj;
            if (map == null) {
                cVar.y();
            } else if (!g.this.f7848b) {
                cVar.h();
                for (Map.Entry<K, V> entry : map.entrySet()) {
                    cVar.u(String.valueOf(entry.getKey()));
                    this.f7849b.b(cVar, entry.getValue());
                }
                cVar.r();
            } else {
                ArrayList arrayList = new ArrayList(map.size());
                ArrayList arrayList2 = new ArrayList(map.size());
                int i2 = 0;
                boolean z = false;
                for (Map.Entry<K, V> entry2 : map.entrySet()) {
                    z<K> zVar = this.a;
                    K key = entry2.getKey();
                    Objects.requireNonNull(zVar);
                    try {
                        f fVar = new f();
                        zVar.b(fVar, key);
                        if (!fVar.f7847n.isEmpty()) {
                            throw new IllegalStateException("Expected one JSON element but was " + fVar.f7847n);
                        }
                        e.d.e.o oVar = fVar.p;
                        arrayList.add(oVar);
                        arrayList2.add(entry2.getValue());
                        Objects.requireNonNull(oVar);
                        z |= (oVar instanceof e.d.e.l) || (oVar instanceof e.d.e.r);
                    } catch (IOException e2) {
                        throw new e.d.e.p(e2);
                    }
                }
                if (z) {
                    cVar.f();
                    int size = arrayList.size();
                    while (i2 < size) {
                        cVar.f();
                        o.X.b(cVar, (e.d.e.o) arrayList.get(i2));
                        this.f7849b.b(cVar, arrayList2.get(i2));
                        cVar.m();
                        i2++;
                    }
                    cVar.m();
                    return;
                }
                cVar.h();
                int size2 = arrayList.size();
                while (i2 < size2) {
                    e.d.e.o oVar2 = (e.d.e.o) arrayList.get(i2);
                    Objects.requireNonNull(oVar2);
                    if (oVar2 instanceof e.d.e.t) {
                        e.d.e.t a = oVar2.a();
                        Object obj2 = a.a;
                        if (obj2 instanceof Number) {
                            str = String.valueOf(a.c());
                        } else if (obj2 instanceof Boolean) {
                            str = Boolean.toString(a.b());
                        } else if (!(obj2 instanceof String)) {
                            throw new AssertionError();
                        } else {
                            str = a.d();
                        }
                    } else if (!(oVar2 instanceof e.d.e.q)) {
                        throw new AssertionError();
                    } else {
                        str = "null";
                    }
                    cVar.u(str);
                    this.f7849b.b(cVar, arrayList2.get(i2));
                    i2++;
                }
                cVar.r();
            }
        }
    }

    public g(e.d.e.c0.g gVar, boolean z) {
        this.a = gVar;
        this.f7848b = z;
    }

    @Override // e.d.e.a0
    public <T> z<T> a(e.d.e.j jVar, e.d.e.d0.a<T> aVar) {
        Type[] actualTypeArguments;
        Type type = aVar.f7896b;
        if (Map.class.isAssignableFrom(aVar.a)) {
            Class<?> e2 = e.d.e.c0.a.e(type);
            if (type == Properties.class) {
                actualTypeArguments = new Type[]{String.class, String.class};
            } else {
                Type f2 = e.d.e.c0.a.f(type, e2, Map.class);
                actualTypeArguments = f2 instanceof ParameterizedType ? ((ParameterizedType) f2).getActualTypeArguments() : new Type[]{Object.class, Object.class};
            }
            Type type2 = actualTypeArguments[0];
            return new a(jVar, actualTypeArguments[0], (type2 == Boolean.TYPE || type2 == Boolean.class) ? o.f7879f : jVar.c(new e.d.e.d0.a<>(type2)), actualTypeArguments[1], jVar.c(new e.d.e.d0.a<>(actualTypeArguments[1])), this.a.a(aVar));
        }
        return null;
    }
}
