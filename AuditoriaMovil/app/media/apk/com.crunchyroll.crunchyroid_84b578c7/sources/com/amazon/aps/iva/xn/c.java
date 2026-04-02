package com.amazon.aps.iva.xn;

import com.amazon.aps.iva.ab.x;
import com.amazon.aps.iva.e.z;
import com.amazon.aps.iva.kb0.q;
import com.amazon.aps.iva.oe0.m;
import com.amazon.aps.iva.se0.g0;
import com.amazon.aps.iva.xb0.p;
import com.google.android.gms.common.internal.ImagesContract;
import java.io.IOException;
/* compiled from: ContentTrickScrubbingInteractor.kt */
@com.amazon.aps.iva.qb0.e(c = "com.crunchyroll.trickscrubbing.ContentTrickScrubbingInteractorImpl$loadBifData$1", f = "ContentTrickScrubbingInteractor.kt", l = {51}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class c extends com.amazon.aps.iva.qb0.i implements p<g0, com.amazon.aps.iva.ob0.d<? super q>, Object> {
    public int h;
    public final /* synthetic */ com.amazon.aps.iva.xb0.a<q> i;
    public final /* synthetic */ d j;
    public final /* synthetic */ com.amazon.aps.iva.xb0.l<com.amazon.aps.iva.yn.a, q> k;
    public final /* synthetic */ String l;

    /* compiled from: ContentTrickScrubbingInteractor.kt */
    @com.amazon.aps.iva.qb0.e(c = "com.crunchyroll.trickscrubbing.ContentTrickScrubbingInteractorImpl$loadBifData$1$1", f = "ContentTrickScrubbingInteractor.kt", l = {52, 53}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class a extends com.amazon.aps.iva.qb0.i implements p<g0, com.amazon.aps.iva.ob0.d<? super q>, Object> {
        public int h;
        public final /* synthetic */ d i;
        public final /* synthetic */ com.amazon.aps.iva.xb0.l<com.amazon.aps.iva.yn.a, q> j;
        public final /* synthetic */ String k;

        /* compiled from: ContentTrickScrubbingInteractor.kt */
        @com.amazon.aps.iva.qb0.e(c = "com.crunchyroll.trickscrubbing.ContentTrickScrubbingInteractorImpl$loadBifData$1$1$bifData$1", f = "ContentTrickScrubbingInteractor.kt", l = {52}, m = "invokeSuspend")
        /* renamed from: com.amazon.aps.iva.xn.c$a$a  reason: collision with other inner class name */
        /* loaded from: classes2.dex */
        public static final class C0865a extends com.amazon.aps.iva.qb0.i implements p<g0, com.amazon.aps.iva.ob0.d<? super byte[]>, Object> {
            public int h;
            public final /* synthetic */ d i;
            public final /* synthetic */ String j;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0865a(d dVar, String str, com.amazon.aps.iva.ob0.d<? super C0865a> dVar2) {
                super(2, dVar2);
                this.i = dVar;
                this.j = str;
            }

            @Override // com.amazon.aps.iva.qb0.a
            public final com.amazon.aps.iva.ob0.d<q> create(Object obj, com.amazon.aps.iva.ob0.d<?> dVar) {
                return new C0865a(this.i, this.j, dVar);
            }

            @Override // com.amazon.aps.iva.xb0.p
            public final Object invoke(g0 g0Var, com.amazon.aps.iva.ob0.d<? super byte[]> dVar) {
                return ((C0865a) create(g0Var, dVar)).invokeSuspend(q.a);
            }

            @Override // com.amazon.aps.iva.qb0.a
            public final Object invokeSuspend(Object obj) {
                com.amazon.aps.iva.pb0.a aVar = com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED;
                int i = this.h;
                boolean z = true;
                if (i != 0) {
                    if (i == 1) {
                        x.i0(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    x.i0(obj);
                    this.h = 1;
                    d dVar = this.i;
                    dVar.getClass();
                    String str = this.j;
                    com.amazon.aps.iva.yb0.j.f(str, ImagesContract.URL);
                    if (!m.h0(str, "http://", false) && !m.h0(str, "https://", false)) {
                        z = false;
                    }
                    if (z) {
                        obj = dVar.d.c(str, this);
                    } else {
                        obj = dVar.c.c(str, this);
                    }
                    if (obj == aVar) {
                        return aVar;
                    }
                }
                return obj;
            }
        }

        /* compiled from: ContentTrickScrubbingInteractor.kt */
        @com.amazon.aps.iva.qb0.e(c = "com.crunchyroll.trickscrubbing.ContentTrickScrubbingInteractorImpl$loadBifData$1$1$bifFile$1", f = "ContentTrickScrubbingInteractor.kt", l = {54}, m = "invokeSuspend")
        /* loaded from: classes2.dex */
        public static final class b extends com.amazon.aps.iva.qb0.i implements p<g0, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.yn.a>, Object> {
            public int h;
            public final /* synthetic */ d i;
            public final /* synthetic */ byte[] j;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(d dVar, byte[] bArr, com.amazon.aps.iva.ob0.d<? super b> dVar2) {
                super(2, dVar2);
                this.i = dVar;
                this.j = bArr;
            }

            @Override // com.amazon.aps.iva.qb0.a
            public final com.amazon.aps.iva.ob0.d<q> create(Object obj, com.amazon.aps.iva.ob0.d<?> dVar) {
                return new b(this.i, this.j, dVar);
            }

            @Override // com.amazon.aps.iva.xb0.p
            public final Object invoke(g0 g0Var, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.yn.a> dVar) {
                return ((b) create(g0Var, dVar)).invokeSuspend(q.a);
            }

            @Override // com.amazon.aps.iva.qb0.a
            public final Object invokeSuspend(Object obj) {
                com.amazon.aps.iva.pb0.a aVar = com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED;
                int i = this.h;
                if (i != 0) {
                    if (i == 1) {
                        x.i0(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    x.i0(obj);
                    com.amazon.aps.iva.yn.c cVar = this.i.b;
                    this.h = 1;
                    obj = cVar.a(this.j);
                    if (obj == aVar) {
                        return aVar;
                    }
                }
                return obj;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(d dVar, com.amazon.aps.iva.xb0.l<? super com.amazon.aps.iva.yn.a, q> lVar, String str, com.amazon.aps.iva.ob0.d<? super a> dVar2) {
            super(2, dVar2);
            this.i = dVar;
            this.j = lVar;
            this.k = str;
        }

        @Override // com.amazon.aps.iva.qb0.a
        public final com.amazon.aps.iva.ob0.d<q> create(Object obj, com.amazon.aps.iva.ob0.d<?> dVar) {
            return new a(this.i, this.j, this.k, dVar);
        }

        @Override // com.amazon.aps.iva.xb0.p
        public final Object invoke(g0 g0Var, com.amazon.aps.iva.ob0.d<? super q> dVar) {
            return ((a) create(g0Var, dVar)).invokeSuspend(q.a);
        }

        @Override // com.amazon.aps.iva.qb0.a
        public final Object invokeSuspend(Object obj) {
            com.amazon.aps.iva.pb0.a aVar = com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED;
            int i = this.h;
            d dVar = this.i;
            if (i != 0) {
                if (i != 1) {
                    if (i == 2) {
                        x.i0(obj);
                        this.j.invoke((com.amazon.aps.iva.yn.a) obj);
                        return q.a;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                x.i0(obj);
            } else {
                x.i0(obj);
                com.amazon.aps.iva.ye0.b a = dVar.e.a();
                C0865a c0865a = new C0865a(dVar, this.k, null);
                this.h = 1;
                obj = com.amazon.aps.iva.se0.i.g(this, a, c0865a);
                if (obj == aVar) {
                    return aVar;
                }
            }
            com.amazon.aps.iva.ye0.c b2 = dVar.e.b();
            b bVar = new b(dVar, (byte[]) obj, null);
            this.h = 2;
            obj = com.amazon.aps.iva.se0.i.g(this, b2, bVar);
            if (obj == aVar) {
                return aVar;
            }
            this.j.invoke((com.amazon.aps.iva.yn.a) obj);
            return q.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public c(com.amazon.aps.iva.xb0.a<q> aVar, d dVar, com.amazon.aps.iva.xb0.l<? super com.amazon.aps.iva.yn.a, q> lVar, String str, com.amazon.aps.iva.ob0.d<? super c> dVar2) {
        super(2, dVar2);
        this.i = aVar;
        this.j = dVar;
        this.k = lVar;
        this.l = str;
    }

    @Override // com.amazon.aps.iva.qb0.a
    public final com.amazon.aps.iva.ob0.d<q> create(Object obj, com.amazon.aps.iva.ob0.d<?> dVar) {
        return new c(this.i, this.j, this.k, this.l, dVar);
    }

    @Override // com.amazon.aps.iva.xb0.p
    public final Object invoke(g0 g0Var, com.amazon.aps.iva.ob0.d<? super q> dVar) {
        return ((c) create(g0Var, dVar)).invokeSuspend(q.a);
    }

    @Override // com.amazon.aps.iva.qb0.a
    public final Object invokeSuspend(Object obj) {
        com.amazon.aps.iva.pb0.a aVar = com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED;
        int i = this.h;
        try {
            if (i != 0) {
                if (i == 1) {
                    x.i0(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                x.i0(obj);
                a aVar2 = new a(this.j, this.k, this.l, null);
                this.h = 1;
                if (z.p(aVar2, this) == aVar) {
                    return aVar;
                }
            }
        } catch (IOException unused) {
            this.i.invoke();
        }
        return q.a;
    }
}
