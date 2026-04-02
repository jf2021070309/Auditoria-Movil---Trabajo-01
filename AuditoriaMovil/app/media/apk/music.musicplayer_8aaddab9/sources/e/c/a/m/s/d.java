package e.c.a.m.s;

import e.c.a.m.r.d;
import e.c.a.m.s.g;
import e.c.a.m.t.n;
import java.io.File;
import java.util.List;
/* loaded from: classes.dex */
public class d implements g, d.a<Object> {
    public final List<e.c.a.m.k> a;

    /* renamed from: b  reason: collision with root package name */
    public final h<?> f5628b;

    /* renamed from: c  reason: collision with root package name */
    public final g.a f5629c;

    /* renamed from: d  reason: collision with root package name */
    public int f5630d;

    /* renamed from: e  reason: collision with root package name */
    public e.c.a.m.k f5631e;

    /* renamed from: f  reason: collision with root package name */
    public List<e.c.a.m.t.n<File, ?>> f5632f;

    /* renamed from: g  reason: collision with root package name */
    public int f5633g;

    /* renamed from: h  reason: collision with root package name */
    public volatile n.a<?> f5634h;

    /* renamed from: i  reason: collision with root package name */
    public File f5635i;

    public d(h<?> hVar, g.a aVar) {
        List<e.c.a.m.k> a = hVar.a();
        this.f5630d = -1;
        this.a = a;
        this.f5628b = hVar;
        this.f5629c = aVar;
    }

    public d(List<e.c.a.m.k> list, h<?> hVar, g.a aVar) {
        this.f5630d = -1;
        this.a = list;
        this.f5628b = hVar;
        this.f5629c = aVar;
    }

    @Override // e.c.a.m.s.g
    public boolean b() {
        while (true) {
            List<e.c.a.m.t.n<File, ?>> list = this.f5632f;
            if (list != null) {
                if (this.f5633g < list.size()) {
                    this.f5634h = null;
                    boolean z = false;
                    while (!z) {
                        if (!(this.f5633g < this.f5632f.size())) {
                            break;
                        }
                        List<e.c.a.m.t.n<File, ?>> list2 = this.f5632f;
                        int i2 = this.f5633g;
                        this.f5633g = i2 + 1;
                        File file = this.f5635i;
                        h<?> hVar = this.f5628b;
                        this.f5634h = list2.get(i2).b(file, hVar.f5666e, hVar.f5667f, hVar.f5670i);
                        if (this.f5634h != null && this.f5628b.g(this.f5634h.f5806c.a())) {
                            this.f5634h.f5806c.e(this.f5628b.o, this);
                            z = true;
                        }
                    }
                    return z;
                }
            }
            int i3 = this.f5630d + 1;
            this.f5630d = i3;
            if (i3 >= this.a.size()) {
                return false;
            }
            e.c.a.m.k kVar = this.a.get(this.f5630d);
            h<?> hVar2 = this.f5628b;
            File b2 = hVar2.b().b(new e(kVar, hVar2.f5675n));
            this.f5635i = b2;
            if (b2 != null) {
                this.f5631e = kVar;
                this.f5632f = this.f5628b.f5664c.f5459c.f(b2);
                this.f5633g = 0;
            }
        }
    }

    @Override // e.c.a.m.r.d.a
    public void c(Exception exc) {
        this.f5629c.a(this.f5631e, exc, this.f5634h.f5806c, e.c.a.m.a.DATA_DISK_CACHE);
    }

    @Override // e.c.a.m.s.g
    public void cancel() {
        n.a<?> aVar = this.f5634h;
        if (aVar != null) {
            aVar.f5806c.cancel();
        }
    }

    @Override // e.c.a.m.r.d.a
    public void f(Object obj) {
        this.f5629c.d(this.f5631e, obj, this.f5634h.f5806c, e.c.a.m.a.DATA_DISK_CACHE, this.f5631e);
    }
}
