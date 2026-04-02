package e.c.a.p;

import e.c.a.m.o;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/* loaded from: classes.dex */
public class e {
    public final List<String> a = new ArrayList();

    /* renamed from: b  reason: collision with root package name */
    public final Map<String, List<a<?, ?>>> f5978b = new HashMap();

    /* loaded from: classes.dex */
    public static class a<T, R> {
        public final Class<T> a;

        /* renamed from: b  reason: collision with root package name */
        public final Class<R> f5979b;

        /* renamed from: c  reason: collision with root package name */
        public final o<T, R> f5980c;

        public a(Class<T> cls, Class<R> cls2, o<T, R> oVar) {
            this.a = cls;
            this.f5979b = cls2;
            this.f5980c = oVar;
        }

        public boolean a(Class<?> cls, Class<?> cls2) {
            return this.a.isAssignableFrom(cls) && cls2.isAssignableFrom(this.f5979b);
        }
    }

    public final synchronized List<a<?, ?>> a(String str) {
        List<a<?, ?>> list;
        if (!this.a.contains(str)) {
            this.a.add(str);
        }
        list = this.f5978b.get(str);
        if (list == null) {
            list = new ArrayList<>();
            this.f5978b.put(str, list);
        }
        return list;
    }

    public synchronized <T, R> List<Class<R>> b(Class<T> cls, Class<R> cls2) {
        ArrayList arrayList;
        arrayList = new ArrayList();
        for (String str : this.a) {
            List<a<?, ?>> list = this.f5978b.get(str);
            if (list != null) {
                for (a<?, ?> aVar : list) {
                    if (aVar.a(cls, cls2) && !arrayList.contains(aVar.f5979b)) {
                        arrayList.add(aVar.f5979b);
                    }
                }
            }
        }
        return arrayList;
    }
}
