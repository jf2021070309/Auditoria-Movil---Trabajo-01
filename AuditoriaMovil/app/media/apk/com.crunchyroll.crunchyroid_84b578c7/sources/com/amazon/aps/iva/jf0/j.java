package com.amazon.aps.iva.jf0;

import okhttp3.Call;
import okhttp3.ResponseBody;
/* compiled from: HttpServiceMethod.java */
/* loaded from: classes4.dex */
public abstract class j<ResponseT, ReturnT> extends c0<ReturnT> {
    public final z a;
    public final Call.Factory b;
    public final f<ResponseBody, ResponseT> c;

    /* compiled from: HttpServiceMethod.java */
    /* loaded from: classes4.dex */
    public static final class a<ResponseT, ReturnT> extends j<ResponseT, ReturnT> {
        public final com.amazon.aps.iva.jf0.c<ResponseT, ReturnT> d;

        public a(z zVar, Call.Factory factory, f<ResponseBody, ResponseT> fVar, com.amazon.aps.iva.jf0.c<ResponseT, ReturnT> cVar) {
            super(zVar, factory, fVar);
            this.d = cVar;
        }

        @Override // com.amazon.aps.iva.jf0.j
        public final Object c(s sVar, Object[] objArr) {
            return this.d.b(sVar);
        }
    }

    /* compiled from: HttpServiceMethod.java */
    /* loaded from: classes4.dex */
    public static final class b<ResponseT> extends j<ResponseT, Object> {
        public final com.amazon.aps.iva.jf0.c<ResponseT, com.amazon.aps.iva.jf0.b<ResponseT>> d;
        public final boolean e;

        public b(z zVar, Call.Factory factory, f fVar, com.amazon.aps.iva.jf0.c cVar) {
            super(zVar, factory, fVar);
            this.d = cVar;
            this.e = false;
        }

        @Override // com.amazon.aps.iva.jf0.j
        public final Object c(s sVar, Object[] objArr) {
            com.amazon.aps.iva.jf0.b bVar = (com.amazon.aps.iva.jf0.b) this.d.b(sVar);
            com.amazon.aps.iva.ob0.d dVar = (com.amazon.aps.iva.ob0.d) objArr[objArr.length - 1];
            try {
                if (this.e) {
                    com.amazon.aps.iva.se0.n nVar = new com.amazon.aps.iva.se0.n(1, com.amazon.aps.iva.a60.b.s(dVar));
                    nVar.w(new m(bVar));
                    bVar.n(new o(nVar));
                    Object q = nVar.q();
                    com.amazon.aps.iva.pb0.a aVar = com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED;
                    return q;
                }
                com.amazon.aps.iva.se0.n nVar2 = new com.amazon.aps.iva.se0.n(1, com.amazon.aps.iva.a60.b.s(dVar));
                nVar2.w(new l(bVar));
                bVar.n(new n(nVar2));
                Object q2 = nVar2.q();
                com.amazon.aps.iva.pb0.a aVar2 = com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED;
                return q2;
            } catch (Exception e) {
                return r.a(e, dVar);
            }
        }
    }

    /* compiled from: HttpServiceMethod.java */
    /* loaded from: classes4.dex */
    public static final class c<ResponseT> extends j<ResponseT, Object> {
        public final com.amazon.aps.iva.jf0.c<ResponseT, com.amazon.aps.iva.jf0.b<ResponseT>> d;

        public c(z zVar, Call.Factory factory, f<ResponseBody, ResponseT> fVar, com.amazon.aps.iva.jf0.c<ResponseT, com.amazon.aps.iva.jf0.b<ResponseT>> cVar) {
            super(zVar, factory, fVar);
            this.d = cVar;
        }

        @Override // com.amazon.aps.iva.jf0.j
        public final Object c(s sVar, Object[] objArr) {
            com.amazon.aps.iva.jf0.b bVar = (com.amazon.aps.iva.jf0.b) this.d.b(sVar);
            com.amazon.aps.iva.ob0.d dVar = (com.amazon.aps.iva.ob0.d) objArr[objArr.length - 1];
            try {
                com.amazon.aps.iva.se0.n nVar = new com.amazon.aps.iva.se0.n(1, com.amazon.aps.iva.a60.b.s(dVar));
                nVar.w(new p(bVar));
                bVar.n(new q(nVar));
                Object q = nVar.q();
                com.amazon.aps.iva.pb0.a aVar = com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED;
                return q;
            } catch (Exception e) {
                return r.a(e, dVar);
            }
        }
    }

    public j(z zVar, Call.Factory factory, f<ResponseBody, ResponseT> fVar) {
        this.a = zVar;
        this.b = factory;
        this.c = fVar;
    }

    @Override // com.amazon.aps.iva.jf0.c0
    public final ReturnT a(Object[] objArr) {
        return (ReturnT) c(new s(this.a, objArr, this.b, this.c), objArr);
    }

    public abstract Object c(s sVar, Object[] objArr);
}
