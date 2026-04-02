package com.amazon.aps.iva.rc;

import com.amazon.aps.iva.lc.d;
import com.amazon.aps.iva.rc.o;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
/* compiled from: MultiModelLoader.java */
/* loaded from: classes.dex */
public final class r<Model, Data> implements o<Model, Data> {
    public final List<o<Model, Data>> a;
    public final com.amazon.aps.iva.o3.d<List<Throwable>> b;

    /* compiled from: MultiModelLoader.java */
    /* loaded from: classes.dex */
    public static class a<Data> implements com.amazon.aps.iva.lc.d<Data>, d.a<Data> {
        public final List<com.amazon.aps.iva.lc.d<Data>> b;
        public final com.amazon.aps.iva.o3.d<List<Throwable>> c;
        public int d;
        public com.amazon.aps.iva.ec.c e;
        public d.a<? super Data> f;
        public List<Throwable> g;
        public boolean h;

        public a(ArrayList arrayList, com.amazon.aps.iva.o3.d dVar) {
            this.c = dVar;
            if (!arrayList.isEmpty()) {
                this.b = arrayList;
                this.d = 0;
                return;
            }
            throw new IllegalArgumentException("Must not be empty.");
        }

        @Override // com.amazon.aps.iva.lc.d
        public final Class<Data> a() {
            return this.b.get(0).a();
        }

        @Override // com.amazon.aps.iva.lc.d
        public final void b() {
            List<Throwable> list = this.g;
            if (list != null) {
                this.c.a(list);
            }
            this.g = null;
            for (com.amazon.aps.iva.lc.d<Data> dVar : this.b) {
                dVar.b();
            }
        }

        @Override // com.amazon.aps.iva.lc.d.a
        public final void c(Exception exc) {
            List<Throwable> list = this.g;
            defpackage.i.l(list);
            list.add(exc);
            g();
        }

        @Override // com.amazon.aps.iva.lc.d
        public final void cancel() {
            this.h = true;
            for (com.amazon.aps.iva.lc.d<Data> dVar : this.b) {
                dVar.cancel();
            }
        }

        @Override // com.amazon.aps.iva.lc.d
        public final void d(com.amazon.aps.iva.ec.c cVar, d.a<? super Data> aVar) {
            this.e = cVar;
            this.f = aVar;
            this.g = this.c.b();
            this.b.get(this.d).d(cVar, this);
            if (this.h) {
                cancel();
            }
        }

        @Override // com.amazon.aps.iva.lc.d
        public final com.amazon.aps.iva.kc.a e() {
            return this.b.get(0).e();
        }

        @Override // com.amazon.aps.iva.lc.d.a
        public final void f(Data data) {
            if (data != null) {
                this.f.f(data);
            } else {
                g();
            }
        }

        public final void g() {
            if (this.h) {
                return;
            }
            if (this.d < this.b.size() - 1) {
                this.d++;
                d(this.e, this.f);
                return;
            }
            defpackage.i.l(this.g);
            this.f.c(new com.amazon.aps.iva.nc.r("Fetch failed", new ArrayList(this.g)));
        }
    }

    public r(ArrayList arrayList, com.amazon.aps.iva.o3.d dVar) {
        this.a = arrayList;
        this.b = dVar;
    }

    @Override // com.amazon.aps.iva.rc.o
    public final o.a<Data> buildLoadData(Model model, int i, int i2, com.amazon.aps.iva.kc.h hVar) {
        o.a<Data> buildLoadData;
        List<o<Model, Data>> list = this.a;
        int size = list.size();
        ArrayList arrayList = new ArrayList(size);
        com.amazon.aps.iva.kc.f fVar = null;
        for (int i3 = 0; i3 < size; i3++) {
            o<Model, Data> oVar = list.get(i3);
            if (oVar.handles(model) && (buildLoadData = oVar.buildLoadData(model, i, i2, hVar)) != null) {
                arrayList.add(buildLoadData.c);
                fVar = buildLoadData.a;
            }
        }
        if (arrayList.isEmpty() || fVar == null) {
            return null;
        }
        return new o.a<>(fVar, new a(arrayList, this.b));
    }

    @Override // com.amazon.aps.iva.rc.o
    public final boolean handles(Model model) {
        for (o<Model, Data> oVar : this.a) {
            if (oVar.handles(model)) {
                return true;
            }
        }
        return false;
    }

    public final String toString() {
        return "MultiModelLoader{modelLoaders=" + Arrays.toString(this.a.toArray()) + '}';
    }
}
