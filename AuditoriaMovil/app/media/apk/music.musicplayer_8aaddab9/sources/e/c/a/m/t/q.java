package e.c.a.m.t;

import e.c.a.m.r.d;
import e.c.a.m.t.n;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
/* loaded from: classes.dex */
public class q<Model, Data> implements n<Model, Data> {
    public final List<n<Model, Data>> a;

    /* renamed from: b  reason: collision with root package name */
    public final c.i.j.c<List<Throwable>> f5808b;

    /* loaded from: classes.dex */
    public static class a<Data> implements e.c.a.m.r.d<Data>, d.a<Data> {
        public final List<e.c.a.m.r.d<Data>> a;

        /* renamed from: b  reason: collision with root package name */
        public final c.i.j.c<List<Throwable>> f5809b;

        /* renamed from: c  reason: collision with root package name */
        public int f5810c;

        /* renamed from: d  reason: collision with root package name */
        public e.c.a.f f5811d;

        /* renamed from: e  reason: collision with root package name */
        public d.a<? super Data> f5812e;

        /* renamed from: f  reason: collision with root package name */
        public List<Throwable> f5813f;

        /* renamed from: g  reason: collision with root package name */
        public boolean f5814g;

        public a(List<e.c.a.m.r.d<Data>> list, c.i.j.c<List<Throwable>> cVar) {
            this.f5809b = cVar;
            if (list.isEmpty()) {
                throw new IllegalArgumentException("Must not be empty.");
            }
            this.a = list;
            this.f5810c = 0;
        }

        @Override // e.c.a.m.r.d
        public Class<Data> a() {
            return this.a.get(0).a();
        }

        @Override // e.c.a.m.r.d
        public void b() {
            List<Throwable> list = this.f5813f;
            if (list != null) {
                this.f5809b.a(list);
            }
            this.f5813f = null;
            for (e.c.a.m.r.d<Data> dVar : this.a) {
                dVar.b();
            }
        }

        @Override // e.c.a.m.r.d.a
        public void c(Exception exc) {
            List<Throwable> list = this.f5813f;
            Objects.requireNonNull(list, "Argument must not be null");
            list.add(exc);
            g();
        }

        @Override // e.c.a.m.r.d
        public void cancel() {
            this.f5814g = true;
            for (e.c.a.m.r.d<Data> dVar : this.a) {
                dVar.cancel();
            }
        }

        @Override // e.c.a.m.r.d
        public e.c.a.m.a d() {
            return this.a.get(0).d();
        }

        @Override // e.c.a.m.r.d
        public void e(e.c.a.f fVar, d.a<? super Data> aVar) {
            this.f5811d = fVar;
            this.f5812e = aVar;
            this.f5813f = this.f5809b.b();
            this.a.get(this.f5810c).e(fVar, this);
            if (this.f5814g) {
                cancel();
            }
        }

        @Override // e.c.a.m.r.d.a
        public void f(Data data) {
            if (data != null) {
                this.f5812e.f(data);
            } else {
                g();
            }
        }

        public final void g() {
            if (this.f5814g) {
                return;
            }
            if (this.f5810c < this.a.size() - 1) {
                this.f5810c++;
                e(this.f5811d, this.f5812e);
                return;
            }
            Objects.requireNonNull(this.f5813f, "Argument must not be null");
            this.f5812e.c(new e.c.a.m.s.r("Fetch failed", new ArrayList(this.f5813f)));
        }
    }

    public q(List<n<Model, Data>> list, c.i.j.c<List<Throwable>> cVar) {
        this.a = list;
        this.f5808b = cVar;
    }

    @Override // e.c.a.m.t.n
    public boolean a(Model model) {
        for (n<Model, Data> nVar : this.a) {
            if (nVar.a(model)) {
                return true;
            }
        }
        return false;
    }

    @Override // e.c.a.m.t.n
    public n.a<Data> b(Model model, int i2, int i3, e.c.a.m.m mVar) {
        n.a<Data> b2;
        int size = this.a.size();
        ArrayList arrayList = new ArrayList(size);
        e.c.a.m.k kVar = null;
        for (int i4 = 0; i4 < size; i4++) {
            n<Model, Data> nVar = this.a.get(i4);
            if (nVar.a(model) && (b2 = nVar.b(model, i2, i3, mVar)) != null) {
                kVar = b2.a;
                arrayList.add(b2.f5806c);
            }
        }
        if (arrayList.isEmpty() || kVar == null) {
            return null;
        }
        return new n.a<>(kVar, new a(arrayList, this.f5808b));
    }

    public String toString() {
        StringBuilder y = e.a.d.a.a.y("MultiModelLoader{modelLoaders=");
        y.append(Arrays.toString(this.a.toArray()));
        y.append('}');
        return y.toString();
    }
}
