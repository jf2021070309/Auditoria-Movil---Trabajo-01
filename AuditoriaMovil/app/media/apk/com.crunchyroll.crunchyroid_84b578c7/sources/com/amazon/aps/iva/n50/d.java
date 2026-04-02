package com.amazon.aps.iva.n50;

import androidx.lifecycle.p;
import com.amazon.aps.iva.ab.x;
import com.amazon.aps.iva.e.w;
import com.amazon.aps.iva.ez.g;
import com.amazon.aps.iva.ez.h;
import com.amazon.aps.iva.i5.v;
import com.amazon.aps.iva.kb0.q;
import com.amazon.aps.iva.n50.e;
import com.amazon.aps.iva.qb0.i;
import com.amazon.aps.iva.se0.c2;
import com.amazon.aps.iva.se0.g0;
import com.amazon.aps.iva.yb0.j;
import com.ellation.crunchyroll.api.etp.contentreviews.model.ContentRating;
import com.ellation.crunchyroll.api.etp.contentreviews.model.ContentRatingBody;
import com.ellation.crunchyroll.api.etp.contentreviews.model.ContentRatingContainer;
import java.io.IOException;
import org.apache.commons.codec.binary.BaseNCodec;
/* compiled from: ContentRatingViewModelImpl.kt */
/* loaded from: classes2.dex */
public final class d extends com.amazon.aps.iva.ez.b implements c {
    public final p b;
    public final com.amazon.aps.iva.n50.a c;
    public c2 d;
    public com.amazon.aps.iva.m50.b e;
    public final v<g<ContentRatingContainer>> f;
    public final v<com.amazon.aps.iva.ez.d<g<e>>> g;

    /* compiled from: ContentRatingViewModelImpl.kt */
    @com.amazon.aps.iva.qb0.e(c = "com.ellation.crunchyroll.showrating.contentrating.ContentRatingViewModelImpl$loadRatingData$1", f = "ContentRatingViewModelImpl.kt", l = {56}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class a extends i implements com.amazon.aps.iva.xb0.p<g0, com.amazon.aps.iva.ob0.d<? super q>, Object> {
        public d h;
        public int i;

        public a(com.amazon.aps.iva.ob0.d<? super a> dVar) {
            super(2, dVar);
        }

        @Override // com.amazon.aps.iva.qb0.a
        public final com.amazon.aps.iva.ob0.d<q> create(Object obj, com.amazon.aps.iva.ob0.d<?> dVar) {
            return new a(dVar);
        }

        @Override // com.amazon.aps.iva.xb0.p
        public final Object invoke(g0 g0Var, com.amazon.aps.iva.ob0.d<? super q> dVar) {
            return ((a) create(g0Var, dVar)).invokeSuspend(q.a);
        }

        @Override // com.amazon.aps.iva.qb0.a
        public final Object invokeSuspend(Object obj) {
            d dVar;
            com.amazon.aps.iva.pb0.a aVar = com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED;
            int i = this.i;
            d dVar2 = d.this;
            try {
                if (i != 0) {
                    if (i == 1) {
                        dVar = this.h;
                        x.i0(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    x.i0(obj);
                    com.amazon.aps.iva.n50.a aVar2 = dVar2.c;
                    com.amazon.aps.iva.m50.b bVar = dVar2.e;
                    this.h = dVar2;
                    this.i = 1;
                    obj = aVar2.F(bVar, this);
                    if (obj == aVar) {
                        return aVar;
                    }
                    dVar = dVar2;
                }
                d.N8(dVar, (ContentRatingContainer) obj);
            } catch (IOException e) {
                ContentRatingContainer contentRatingContainer = (ContentRatingContainer) dVar2.b.b("rating_data");
                v<g<ContentRatingContainer>> vVar = dVar2.f;
                if (contentRatingContainer == null) {
                    com.amazon.aps.iva.e4.e.g(null, e, vVar);
                } else {
                    vVar.k(new g.c(contentRatingContainer, null));
                }
            }
            return q.a;
        }
    }

    /* compiled from: ContentRatingViewModelImpl.kt */
    @com.amazon.aps.iva.qb0.e(c = "com.ellation.crunchyroll.showrating.contentrating.ContentRatingViewModelImpl$updateRating$1", f = "ContentRatingViewModelImpl.kt", l = {BaseNCodec.MIME_CHUNK_SIZE}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class b extends i implements com.amazon.aps.iva.xb0.p<g0, com.amazon.aps.iva.ob0.d<? super q>, Object> {
        public d h;
        public int i;
        public final /* synthetic */ ContentRating k;
        public final /* synthetic */ ContentRating l;
        public final /* synthetic */ ContentRatingContainer m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(ContentRating contentRating, ContentRating contentRating2, ContentRatingContainer contentRatingContainer, com.amazon.aps.iva.ob0.d<? super b> dVar) {
            super(2, dVar);
            this.k = contentRating;
            this.l = contentRating2;
            this.m = contentRatingContainer;
        }

        @Override // com.amazon.aps.iva.qb0.a
        public final com.amazon.aps.iva.ob0.d<q> create(Object obj, com.amazon.aps.iva.ob0.d<?> dVar) {
            return new b(this.k, this.l, this.m, dVar);
        }

        @Override // com.amazon.aps.iva.xb0.p
        public final Object invoke(g0 g0Var, com.amazon.aps.iva.ob0.d<? super q> dVar) {
            return ((b) create(g0Var, dVar)).invokeSuspend(q.a);
        }

        @Override // com.amazon.aps.iva.qb0.a
        public final Object invokeSuspend(Object obj) {
            d dVar;
            Object obj2;
            com.amazon.aps.iva.pb0.a aVar = com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED;
            int i = this.i;
            d dVar2 = d.this;
            try {
                if (i != 0) {
                    if (i == 1) {
                        dVar = this.h;
                        x.i0(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    x.i0(obj);
                    com.amazon.aps.iva.n50.a aVar2 = dVar2.c;
                    com.amazon.aps.iva.m50.b bVar = dVar2.e;
                    ContentRatingBody contentRatingBody = new ContentRatingBody(this.k);
                    this.h = dVar2;
                    this.i = 1;
                    obj = aVar2.w(bVar, contentRatingBody, this);
                    if (obj == aVar) {
                        return aVar;
                    }
                    dVar = dVar2;
                }
                d.N8(dVar, (ContentRatingContainer) obj);
                if (this.l == ContentRating.NONE) {
                    obj2 = e.a.a;
                } else {
                    obj2 = e.b.a;
                }
                dVar2.g.k(new com.amazon.aps.iva.ez.d<>(new g.c(obj2, null)));
            } catch (IOException e) {
                d.N8(dVar2, this.m);
                dVar2.g.k(new com.amazon.aps.iva.ez.d<>(new g.a(null, e)));
            }
            return q.a;
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public d(androidx.lifecycle.p r4, com.amazon.aps.iva.m50.b r5) {
        /*
            r3 = this;
            com.amazon.aps.iva.m50.c r0 = com.amazon.aps.iva.e4.l1.b
            if (r0 == 0) goto L47
            com.ellation.crunchyroll.api.etp.contentreviews.ContentReviewsService r0 = r0.a
            java.lang.String r1 = "reviewsService"
            com.amazon.aps.iva.yb0.j.f(r0, r1)
            com.amazon.aps.iva.n50.b r1 = new com.amazon.aps.iva.n50.b
            r1.<init>(r0)
            java.lang.String r0 = "savedStateHandle"
            com.amazon.aps.iva.yb0.j.f(r4, r0)
            r0 = 1
            com.amazon.aps.iva.wy.j[] r0 = new com.amazon.aps.iva.wy.j[r0]
            r2 = 0
            r0[r2] = r1
            r3.<init>(r0)
            r3.b = r4
            r3.c = r1
            java.lang.String r0 = "rating_input"
            if (r5 != 0) goto L30
            java.lang.Object r1 = r4.b(r0)
            com.amazon.aps.iva.yb0.j.c(r1)
            com.amazon.aps.iva.m50.b r1 = (com.amazon.aps.iva.m50.b) r1
            goto L31
        L30:
            r1 = r5
        L31:
            r3.e = r1
            com.amazon.aps.iva.i5.v r1 = new com.amazon.aps.iva.i5.v
            r1.<init>()
            r3.f = r1
            com.amazon.aps.iva.i5.v r1 = new com.amazon.aps.iva.i5.v
            r1.<init>()
            r3.g = r1
            if (r5 == 0) goto L46
            r4.d(r5, r0)
        L46:
            return
        L47:
            java.lang.String r4 = "dependencies"
            com.amazon.aps.iva.yb0.j.m(r4)
            r4 = 0
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.n50.d.<init>(androidx.lifecycle.p, com.amazon.aps.iva.m50.b):void");
    }

    public static final void N8(d dVar, ContentRatingContainer contentRatingContainer) {
        dVar.f.k(new g.c(contentRatingContainer, null));
        dVar.b.d(contentRatingContainer, "rating_data");
    }

    @Override // com.amazon.aps.iva.n50.c
    public final void g0(ContentRating contentRating) {
        g.c cVar;
        ContentRatingContainer contentRatingContainer;
        ContentRating userContentRating;
        j.f(contentRating, "newRating");
        v<g<ContentRatingContainer>> vVar = this.f;
        g<ContentRatingContainer> d = vVar.d();
        if (d instanceof g.c) {
            cVar = (g.c) d;
        } else {
            cVar = null;
        }
        if (cVar == null || (contentRatingContainer = (ContentRatingContainer) cVar.a) == null || (userContentRating = contentRatingContainer.getUserContentRating()) == contentRating) {
            return;
        }
        h.c(vVar, null);
        com.amazon.aps.iva.se0.i.d(w.D(this), null, null, new b(contentRating, userContentRating, contentRatingContainer, null), 3);
    }

    @Override // com.amazon.aps.iva.n50.c
    public final void m(com.amazon.aps.iva.m50.b bVar) {
        j.f(bVar, "showRatingInput");
        this.e = bVar;
        h.c(this.f, null);
        c2 c2Var = this.d;
        if (c2Var != null) {
            c2Var.a(null);
        }
        this.d = com.amazon.aps.iva.se0.i.d(w.D(this), null, null, new a(null), 3);
    }
}
