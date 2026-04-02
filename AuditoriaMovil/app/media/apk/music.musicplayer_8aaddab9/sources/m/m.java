package m;

import j.d;
import javax.annotation.Nullable;
/* loaded from: classes.dex */
public abstract class m<ResponseT, ReturnT> extends d0<ReturnT> {
    public final z a;

    /* renamed from: b  reason: collision with root package name */
    public final d.a f9864b;

    /* renamed from: c  reason: collision with root package name */
    public final j<j.f0, ResponseT> f9865c;

    /* loaded from: classes2.dex */
    public static final class a<ResponseT, ReturnT> extends m<ResponseT, ReturnT> {

        /* renamed from: d  reason: collision with root package name */
        public final m.c<ResponseT, ReturnT> f9866d;

        public a(z zVar, d.a aVar, j<j.f0, ResponseT> jVar, m.c<ResponseT, ReturnT> cVar) {
            super(zVar, aVar, jVar);
            this.f9866d = cVar;
        }

        @Override // m.m
        public ReturnT c(m.b<ResponseT> bVar, Object[] objArr) {
            return this.f9866d.b(bVar);
        }
    }

    /* loaded from: classes2.dex */
    public static final class b<ResponseT> extends m<ResponseT, Object> {

        /* renamed from: d  reason: collision with root package name */
        public final m.c<ResponseT, m.b<ResponseT>> f9867d;

        public b(z zVar, d.a aVar, j<j.f0, ResponseT> jVar, m.c<ResponseT, m.b<ResponseT>> cVar, boolean z) {
            super(zVar, aVar, jVar);
            this.f9867d = cVar;
        }

        @Override // m.m
        public Object c(m.b<ResponseT> bVar, Object[] objArr) {
            m.b<ResponseT> b2 = this.f9867d.b(bVar);
            h.m.d dVar = (h.m.d) objArr[objArr.length - 1];
            try {
                i.a.k kVar = new i.a.k(e.j.d.w.P(dVar), 1);
                kVar.r(new o(b2));
                b2.h(new p(kVar));
                Object o = kVar.o();
                if (o == h.m.h.a.COROUTINE_SUSPENDED) {
                    h.o.c.j.e(dVar, "frame");
                }
                return o;
            } catch (Exception e2) {
                return e.j.d.w.L0(e2, dVar);
            }
        }
    }

    /* loaded from: classes2.dex */
    public static final class c<ResponseT> extends m<ResponseT, Object> {

        /* renamed from: d  reason: collision with root package name */
        public final m.c<ResponseT, m.b<ResponseT>> f9868d;

        public c(z zVar, d.a aVar, j<j.f0, ResponseT> jVar, m.c<ResponseT, m.b<ResponseT>> cVar) {
            super(zVar, aVar, jVar);
            this.f9868d = cVar;
        }

        @Override // m.m
        public Object c(m.b<ResponseT> bVar, Object[] objArr) {
            m.b<ResponseT> b2 = this.f9868d.b(bVar);
            h.m.d dVar = (h.m.d) objArr[objArr.length - 1];
            i.a.k kVar = new i.a.k(e.j.d.w.P(dVar), 1);
            kVar.r(new q(b2));
            b2.h(new r(kVar));
            Object o = kVar.o();
            if (o == h.m.h.a.COROUTINE_SUSPENDED) {
                h.o.c.j.e(dVar, "frame");
            }
            return o;
        }
    }

    public m(z zVar, d.a aVar, j<j.f0, ResponseT> jVar) {
        this.a = zVar;
        this.f9864b = aVar;
        this.f9865c = jVar;
    }

    @Override // m.d0
    @Nullable
    public final ReturnT a(Object[] objArr) {
        return c(new s(this.a, objArr, this.f9864b, this.f9865c), objArr);
    }

    @Nullable
    public abstract ReturnT c(m.b<ResponseT> bVar, Object[] objArr);
}
