package e.c.a;

import com.bumptech.glide.load.ImageHeaderParser;
import e.c.a.m.r.e;
import e.c.a.m.t.n;
import e.c.a.m.t.o;
import e.c.a.m.t.p;
import e.c.a.m.t.r;
import e.c.a.m.u.h.f;
import e.c.a.p.a;
import e.c.a.p.e;
import e.c.a.p.f;
import e.c.a.s.k.a;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
/* loaded from: classes.dex */
public class g {
    public final p a;

    /* renamed from: b  reason: collision with root package name */
    public final e.c.a.p.a f5468b;

    /* renamed from: c  reason: collision with root package name */
    public final e.c.a.p.e f5469c;

    /* renamed from: d  reason: collision with root package name */
    public final e.c.a.p.f f5470d;

    /* renamed from: e  reason: collision with root package name */
    public final e.c.a.m.r.f f5471e;

    /* renamed from: f  reason: collision with root package name */
    public final e.c.a.m.u.h.f f5472f;

    /* renamed from: g  reason: collision with root package name */
    public final e.c.a.p.b f5473g;

    /* renamed from: h  reason: collision with root package name */
    public final e.c.a.p.d f5474h = new e.c.a.p.d();

    /* renamed from: i  reason: collision with root package name */
    public final e.c.a.p.c f5475i = new e.c.a.p.c();

    /* renamed from: j  reason: collision with root package name */
    public final c.i.j.c<List<Throwable>> f5476j;

    /* loaded from: classes.dex */
    public static class a extends RuntimeException {
        public a(String str) {
            super(str);
        }
    }

    /* loaded from: classes.dex */
    public static final class b extends a {
        public b() {
            super("Failed to find image header parser.");
        }
    }

    /* loaded from: classes.dex */
    public static class c extends a {
        public c(Class<?> cls, Class<?> cls2) {
            super("Failed to find any ModelLoaders for model: " + cls + " and data: " + cls2);
        }

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public c(java.lang.Object r2) {
            /*
                r1 = this;
                java.lang.String r0 = "Failed to find any ModelLoaders registered for model class: "
                java.lang.StringBuilder r0 = e.a.d.a.a.y(r0)
                java.lang.Class r2 = r2.getClass()
                r0.append(r2)
                java.lang.String r2 = r0.toString()
                r1.<init>(r2)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: e.c.a.g.c.<init>(java.lang.Object):void");
        }

        public <M> c(M m2, List<n<M, ?>> list) {
            super("Found ModelLoaders for model class: " + list + ", but none that handle this specific model instance: " + m2);
        }
    }

    /* loaded from: classes.dex */
    public static class d extends a {
        public d(Class<?> cls) {
            super("Failed to find result encoder for resource class: " + cls + ", you may need to consider registering a new Encoder for the requested type or DiskCacheStrategy.DATA/DiskCacheStrategy.NONE if caching your transformed resource is unnecessary.");
        }
    }

    /* loaded from: classes.dex */
    public static class e extends a {
        public e(Class<?> cls) {
            super("Failed to find source encoder for data class: " + cls);
        }
    }

    public g() {
        a.c cVar = new a.c(new c.i.j.e(20), new e.c.a.s.k.b(), new e.c.a.s.k.c());
        this.f5476j = cVar;
        this.a = new p(cVar);
        this.f5468b = new e.c.a.p.a();
        e.c.a.p.e eVar = new e.c.a.p.e();
        this.f5469c = eVar;
        this.f5470d = new e.c.a.p.f();
        this.f5471e = new e.c.a.m.r.f();
        this.f5472f = new e.c.a.m.u.h.f();
        this.f5473g = new e.c.a.p.b();
        List asList = Arrays.asList("Gif", "Bitmap", "BitmapDrawable");
        ArrayList arrayList = new ArrayList(asList.size());
        arrayList.addAll(asList);
        arrayList.add(0, "legacy_prepend_all");
        arrayList.add("legacy_append");
        synchronized (eVar) {
            ArrayList arrayList2 = new ArrayList(eVar.a);
            eVar.a.clear();
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                eVar.a.add((String) it.next());
            }
            Iterator it2 = arrayList2.iterator();
            while (it2.hasNext()) {
                String str = (String) it2.next();
                if (!arrayList.contains(str)) {
                    eVar.a.add(str);
                }
            }
        }
    }

    public <Data> g a(Class<Data> cls, e.c.a.m.d<Data> dVar) {
        e.c.a.p.a aVar = this.f5468b;
        synchronized (aVar) {
            aVar.a.add(new a.C0129a<>(cls, dVar));
        }
        return this;
    }

    public <TResource> g b(Class<TResource> cls, e.c.a.m.p<TResource> pVar) {
        e.c.a.p.f fVar = this.f5470d;
        synchronized (fVar) {
            fVar.a.add(new f.a<>(cls, pVar));
        }
        return this;
    }

    public <Model, Data> g c(Class<Model> cls, Class<Data> cls2, o<Model, Data> oVar) {
        p pVar = this.a;
        synchronized (pVar) {
            r rVar = pVar.a;
            synchronized (rVar) {
                r.b<?, ?> bVar = new r.b<>(cls, cls2, oVar);
                List<r.b<?, ?>> list = rVar.f5816c;
                list.add(list.size(), bVar);
            }
            pVar.f5807b.a.clear();
        }
        return this;
    }

    public <Data, TResource> g d(String str, Class<Data> cls, Class<TResource> cls2, e.c.a.m.o<Data, TResource> oVar) {
        e.c.a.p.e eVar = this.f5469c;
        synchronized (eVar) {
            eVar.a(str).add(new e.a<>(cls, cls2, oVar));
        }
        return this;
    }

    public List<ImageHeaderParser> e() {
        List<ImageHeaderParser> list;
        e.c.a.p.b bVar = this.f5473g;
        synchronized (bVar) {
            list = bVar.a;
        }
        if (list.isEmpty()) {
            throw new b();
        }
        return list;
    }

    public <Model> List<n<Model, ?>> f(Model model) {
        List<n<?, ?>> list;
        p pVar = this.a;
        Objects.requireNonNull(pVar);
        Class<?> cls = model.getClass();
        synchronized (pVar) {
            p.a.C0123a<?> c0123a = pVar.f5807b.a.get(cls);
            list = c0123a == null ? null : c0123a.a;
            if (list == null) {
                list = Collections.unmodifiableList(pVar.a.c(cls));
                if (pVar.f5807b.a.put(cls, new p.a.C0123a<>(list)) != null) {
                    throw new IllegalStateException("Already cached loaders for model: " + cls);
                }
            }
        }
        if (list.isEmpty()) {
            throw new c(model);
        }
        int size = list.size();
        List<n<Model, ?>> emptyList = Collections.emptyList();
        boolean z = true;
        for (int i2 = 0; i2 < size; i2++) {
            n<?, ?> nVar = list.get(i2);
            if (nVar.a(model)) {
                if (z) {
                    emptyList = new ArrayList<>(size - i2);
                    z = false;
                }
                emptyList.add(nVar);
            }
        }
        if (emptyList.isEmpty()) {
            throw new c(model, (List<n<Model, ?>>) list);
        }
        return emptyList;
    }

    public g g(e.a<?> aVar) {
        e.c.a.m.r.f fVar = this.f5471e;
        synchronized (fVar) {
            fVar.f5565b.put(aVar.a(), aVar);
        }
        return this;
    }

    public <TResource, Transcode> g h(Class<TResource> cls, Class<Transcode> cls2, e.c.a.m.u.h.e<TResource, Transcode> eVar) {
        e.c.a.m.u.h.f fVar = this.f5472f;
        synchronized (fVar) {
            fVar.a.add(new f.a<>(cls, cls2, eVar));
        }
        return this;
    }
}
