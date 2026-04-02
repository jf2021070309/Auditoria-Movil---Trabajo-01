package j.i0.g;

import j.d0;
import j.n;
import j.t;
import j.z;
import java.io.IOException;
import java.util.List;
/* loaded from: classes2.dex */
public final class f implements t.a {
    public final List<t> a;

    /* renamed from: b  reason: collision with root package name */
    public final j.i0.f.g f9325b;

    /* renamed from: c  reason: collision with root package name */
    public final c f9326c;

    /* renamed from: d  reason: collision with root package name */
    public final j.i0.f.c f9327d;

    /* renamed from: e  reason: collision with root package name */
    public final int f9328e;

    /* renamed from: f  reason: collision with root package name */
    public final z f9329f;

    /* renamed from: g  reason: collision with root package name */
    public final j.d f9330g;

    /* renamed from: h  reason: collision with root package name */
    public final n f9331h;

    /* renamed from: i  reason: collision with root package name */
    public final int f9332i;

    /* renamed from: j  reason: collision with root package name */
    public final int f9333j;

    /* renamed from: k  reason: collision with root package name */
    public final int f9334k;

    /* renamed from: l  reason: collision with root package name */
    public int f9335l;

    public f(List<t> list, j.i0.f.g gVar, c cVar, j.i0.f.c cVar2, int i2, z zVar, j.d dVar, n nVar, int i3, int i4, int i5) {
        this.a = list;
        this.f9327d = cVar2;
        this.f9325b = gVar;
        this.f9326c = cVar;
        this.f9328e = i2;
        this.f9329f = zVar;
        this.f9330g = dVar;
        this.f9331h = nVar;
        this.f9332i = i3;
        this.f9333j = i4;
        this.f9334k = i5;
    }

    public d0 a(z zVar) throws IOException {
        return b(zVar, this.f9325b, this.f9326c, this.f9327d);
    }

    public d0 b(z zVar, j.i0.f.g gVar, c cVar, j.i0.f.c cVar2) throws IOException {
        if (this.f9328e < this.a.size()) {
            this.f9335l++;
            if (this.f9326c != null && !this.f9327d.k(zVar.a)) {
                StringBuilder y = e.a.d.a.a.y("network interceptor ");
                y.append(this.a.get(this.f9328e - 1));
                y.append(" must retain the same host and port");
                throw new IllegalStateException(y.toString());
            }
            if (this.f9326c != null && this.f9335l > 1) {
                StringBuilder y2 = e.a.d.a.a.y("network interceptor ");
                y2.append(this.a.get(this.f9328e - 1));
                y2.append(" must call proceed() exactly once");
                throw new IllegalStateException(y2.toString());
            }
            List<t> list = this.a;
            int i2 = this.f9328e;
            f fVar = new f(list, gVar, cVar, cVar2, i2 + 1, zVar, this.f9330g, this.f9331h, this.f9332i, this.f9333j, this.f9334k);
            t tVar = list.get(i2);
            d0 a = tVar.a(fVar);
            if (cVar != null && this.f9328e + 1 < this.a.size() && fVar.f9335l != 1) {
                throw new IllegalStateException("network interceptor " + tVar + " must call proceed() exactly once");
            } else if (a == null) {
                throw new NullPointerException("interceptor " + tVar + " returned null");
            } else if (a.f9212g != null) {
                return a;
            } else {
                throw new IllegalStateException("interceptor " + tVar + " returned a response with no body");
            }
        }
        throw new AssertionError();
    }
}
