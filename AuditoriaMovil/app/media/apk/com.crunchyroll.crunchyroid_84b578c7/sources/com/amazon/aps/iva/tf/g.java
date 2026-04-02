package com.amazon.aps.iva.tf;

import com.amazon.aps.iva.ab.x;
import com.amazon.aps.iva.e.w;
import com.amazon.aps.iva.i5.v;
import com.amazon.aps.iva.kb0.q;
import com.amazon.aps.iva.qb0.i;
import com.amazon.aps.iva.se0.g0;
import com.amazon.aps.iva.uf.a;
import com.amazon.aps.iva.uf.b;
import com.amazon.aps.iva.uf.h;
import com.amazon.aps.iva.x50.t;
import com.amazon.aps.iva.xb0.p;
import com.amazon.aps.iva.yb0.j;
import com.ellation.crunchyroll.api.etp.contentreviews.model.episode.EpisodeContentRating;
import com.ellation.crunchyroll.api.etp.contentreviews.model.episode.EpisodeRateContentBody;
import com.ellation.crunchyroll.api.etp.contentreviews.model.episode.EpisodeRatingContainer;
import java.io.IOException;
/* compiled from: ContentRatingViewModel.kt */
/* loaded from: classes.dex */
public final class g extends com.amazon.aps.iva.ez.b implements f {
    public final com.amazon.aps.iva.tf.a b;
    public final v<com.amazon.aps.iva.uf.b> c;
    public final v<Boolean> d;
    public final v<com.amazon.aps.iva.ez.d<q>> e;
    public com.amazon.aps.iva.sf.e f;

    /* compiled from: ContentRatingViewModel.kt */
    /* loaded from: classes.dex */
    public /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[EpisodeContentRating.values().length];
            try {
                iArr[EpisodeContentRating.UP.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EpisodeContentRating.DOWN.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[EpisodeContentRating.NONE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            a = iArr;
        }
    }

    /* compiled from: ContentRatingViewModel.kt */
    @com.amazon.aps.iva.qb0.e(c = "com.crunchyroll.contentrating.contentrating.ContentRatingViewModelImpl$loadContentRating$1", f = "ContentRatingViewModel.kt", l = {58}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    public static final class b extends i implements p<g0, com.amazon.aps.iva.ob0.d<? super q>, Object> {
        public v h;
        public g i;
        public int j;

        public b(com.amazon.aps.iva.ob0.d<? super b> dVar) {
            super(2, dVar);
        }

        @Override // com.amazon.aps.iva.qb0.a
        public final com.amazon.aps.iva.ob0.d<q> create(Object obj, com.amazon.aps.iva.ob0.d<?> dVar) {
            return new b(dVar);
        }

        @Override // com.amazon.aps.iva.xb0.p
        public final Object invoke(g0 g0Var, com.amazon.aps.iva.ob0.d<? super q> dVar) {
            return ((b) create(g0Var, dVar)).invokeSuspend(q.a);
        }

        @Override // com.amazon.aps.iva.qb0.a
        public final Object invokeSuspend(Object obj) {
            v<com.amazon.aps.iva.uf.b> vVar;
            g gVar;
            com.amazon.aps.iva.pb0.a aVar = com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED;
            int i = this.j;
            g gVar2 = g.this;
            try {
                if (i != 0) {
                    if (i == 1) {
                        gVar = this.i;
                        vVar = this.h;
                        x.i0(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    x.i0(obj);
                    vVar = gVar2.c;
                    com.amazon.aps.iva.tf.a aVar2 = gVar2.b;
                    com.amazon.aps.iva.sf.e eVar = gVar2.f;
                    if (eVar != null) {
                        String str = eVar.a;
                        this.h = vVar;
                        this.i = gVar2;
                        this.j = 1;
                        obj = aVar2.d0(str, this);
                        if (obj == aVar) {
                            return aVar;
                        }
                        gVar = gVar2;
                    } else {
                        j.m("ratingInput");
                        throw null;
                    }
                }
                vVar.k(g.N8(gVar, (EpisodeRatingContainer) obj));
                gVar2.d.k(Boolean.TRUE);
            } catch (IOException unused) {
                gVar2.c.k(b.a.a);
            }
            return q.a;
        }
    }

    /* compiled from: ContentRatingViewModel.kt */
    @com.amazon.aps.iva.qb0.e(c = "com.crunchyroll.contentrating.contentrating.ContentRatingViewModelImpl$rate$1$1", f = "ContentRatingViewModel.kt", l = {74, 79, 84}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    public static final class c extends i implements p<g0, com.amazon.aps.iva.ob0.d<? super q>, Object> {
        public int h;
        public final /* synthetic */ com.amazon.aps.iva.uf.a i;
        public final /* synthetic */ g j;
        public final /* synthetic */ String k;
        public final /* synthetic */ b.c l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(com.amazon.aps.iva.uf.a aVar, g gVar, String str, b.c cVar, com.amazon.aps.iva.ob0.d<? super c> dVar) {
            super(2, dVar);
            this.i = aVar;
            this.j = gVar;
            this.k = str;
            this.l = cVar;
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
            v<Boolean> vVar;
            com.amazon.aps.iva.sf.e eVar;
            com.amazon.aps.iva.pb0.a aVar = com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED;
            int i = this.h;
            String str = this.k;
            g gVar = this.j;
            try {
                try {
                    if (i != 0) {
                        if (i == 1 || i == 2 || i == 3) {
                            x.i0(obj);
                        } else {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                    } else {
                        x.i0(obj);
                        com.amazon.aps.iva.uf.a aVar2 = this.i;
                        if (j.a(aVar2, a.b.a)) {
                            com.amazon.aps.iva.tf.a aVar3 = gVar.b;
                            EpisodeRateContentBody.EpisodeRateUp episodeRateUp = EpisodeRateContentBody.EpisodeRateUp.INSTANCE;
                            com.amazon.aps.iva.sf.e eVar2 = gVar.f;
                            if (eVar2 != null) {
                                String str2 = eVar2.a;
                                if (eVar2 != null) {
                                    t tVar = eVar2.c;
                                    this.h = 1;
                                    if (aVar3.a1(str2, tVar, episodeRateUp, this) == aVar) {
                                        return aVar;
                                    }
                                } else {
                                    j.m("ratingInput");
                                    throw null;
                                }
                            } else {
                                j.m("ratingInput");
                                throw null;
                            }
                        } else if (j.a(aVar2, a.C0764a.a)) {
                            com.amazon.aps.iva.tf.a aVar4 = gVar.b;
                            EpisodeRateContentBody.EpisodeRateDown episodeRateDown = EpisodeRateContentBody.EpisodeRateDown.INSTANCE;
                            com.amazon.aps.iva.sf.e eVar3 = gVar.f;
                            if (eVar3 != null) {
                                String str3 = eVar3.a;
                                if (eVar3 != null) {
                                    t tVar2 = eVar3.c;
                                    this.h = 2;
                                    if (aVar4.a1(str3, tVar2, episodeRateDown, this) == aVar) {
                                        return aVar;
                                    }
                                } else {
                                    j.m("ratingInput");
                                    throw null;
                                }
                            } else {
                                j.m("ratingInput");
                                throw null;
                            }
                        } else if (j.a(aVar2, a.c.a)) {
                            com.amazon.aps.iva.tf.a aVar5 = gVar.b;
                            com.amazon.aps.iva.sf.e eVar4 = gVar.f;
                            if (eVar4 != null) {
                                String str4 = eVar4.a;
                                if (eVar4 != null) {
                                    t tVar3 = eVar4.c;
                                    this.h = 3;
                                    if (aVar5.removeRating(str4, tVar3, this) == aVar) {
                                        return aVar;
                                    }
                                } else {
                                    j.m("ratingInput");
                                    throw null;
                                }
                            } else {
                                j.m("ratingInput");
                                throw null;
                            }
                        }
                    }
                    eVar = gVar.f;
                } catch (IOException unused) {
                    gVar.e.k(new com.amazon.aps.iva.ez.d<>(q.a));
                    com.amazon.aps.iva.sf.e eVar5 = gVar.f;
                    if (eVar5 != null) {
                        if (j.a(eVar5.a, str)) {
                            v<com.amazon.aps.iva.uf.b> vVar2 = gVar.c;
                            b.c cVar = this.l;
                            h hVar = cVar.a;
                            int i2 = cVar.b;
                            int i3 = cVar.c;
                            cVar.getClass();
                            j.f(hVar, "userRating");
                            vVar2.k(new b.c(hVar, i2, i3, false));
                        }
                        com.amazon.aps.iva.sf.e eVar6 = gVar.f;
                        if (eVar6 != null) {
                            if (j.a(eVar6.a, str)) {
                                vVar = gVar.d;
                            }
                        } else {
                            j.m("ratingInput");
                            throw null;
                        }
                    } else {
                        j.m("ratingInput");
                        throw null;
                    }
                }
                if (eVar != null) {
                    if (j.a(eVar.a, str)) {
                        vVar = gVar.d;
                        vVar.k(Boolean.TRUE);
                    }
                    return q.a;
                }
                j.m("ratingInput");
                throw null;
            } catch (Throwable th) {
                com.amazon.aps.iva.sf.e eVar7 = gVar.f;
                if (eVar7 != null) {
                    if (j.a(eVar7.a, str)) {
                        gVar.d.k(Boolean.TRUE);
                    }
                    throw th;
                }
                j.m("ratingInput");
                throw null;
            }
        }
    }

    public g(com.amazon.aps.iva.tf.b bVar) {
        super(bVar);
        this.b = bVar;
        this.c = new v<>();
        this.d = new v<>(Boolean.FALSE);
        this.e = new v<>();
    }

    public static final b.c N8(g gVar, EpisodeRatingContainer episodeRatingContainer) {
        h hVar;
        gVar.getClass();
        int rawRatingCount = episodeRatingContainer.getUp().getRawRatingCount();
        int rawRatingCount2 = episodeRatingContainer.getDown().getRawRatingCount();
        int i = a.a[episodeRatingContainer.getUserContentRating().ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i == 3) {
                    hVar = h.NOT_RATED;
                } else {
                    throw new com.amazon.aps.iva.kb0.h();
                }
            } else {
                hVar = h.DISLIKED;
            }
        } else {
            hVar = h.LIKED;
        }
        return new b.c(hVar, rawRatingCount, rawRatingCount2, false);
    }

    @Override // com.amazon.aps.iva.uf.e
    public final void B6(com.amazon.aps.iva.uf.a aVar) {
        b.c cVar;
        b.c cVar2;
        int i;
        j.f(aVar, "rating");
        v<com.amazon.aps.iva.uf.b> vVar = this.c;
        com.amazon.aps.iva.uf.b d = vVar.d();
        if (d instanceof b.c) {
            cVar = (b.c) d;
        } else {
            cVar = null;
        }
        if (cVar != null) {
            this.d.k(Boolean.FALSE);
            com.amazon.aps.iva.sf.e eVar = this.f;
            if (eVar != null) {
                String str = eVar.a;
                boolean a2 = j.a(aVar, a.b.a);
                int i2 = cVar.c;
                h hVar = cVar.a;
                int i3 = cVar.b;
                int i4 = 0;
                if (a2) {
                    h hVar2 = h.LIKED;
                    int i5 = i3 + 1;
                    if (hVar != h.NOT_RATED) {
                        i4 = 1;
                    }
                    cVar2 = new b.c(hVar2, i5, i2 - i4, true);
                } else if (j.a(aVar, a.C0764a.a)) {
                    h hVar3 = h.DISLIKED;
                    if (hVar != h.NOT_RATED) {
                        i4 = 1;
                    }
                    cVar2 = new b.c(hVar3, i3 - i4, i2 + 1, true);
                } else if (j.a(aVar, a.c.a)) {
                    h hVar4 = h.NOT_RATED;
                    if (hVar == h.LIKED) {
                        i = 1;
                    } else {
                        i = 0;
                    }
                    int i6 = i3 - i;
                    if (hVar == h.DISLIKED) {
                        i4 = 1;
                    }
                    cVar2 = new b.c(hVar4, i6, i2 - i4, true);
                } else {
                    throw new com.amazon.aps.iva.kb0.h();
                }
                vVar.k(cVar2);
                com.amazon.aps.iva.se0.i.d(w.D(this), null, null, new c(aVar, this, str, cVar, null), 3);
                return;
            }
            j.m("ratingInput");
            throw null;
        }
    }

    @Override // com.amazon.aps.iva.tf.f
    public final v<com.amazon.aps.iva.ez.d<q>> R4() {
        return this.e;
    }

    @Override // com.amazon.aps.iva.tf.f
    public final void g4(com.amazon.aps.iva.sf.e eVar) {
        j.f(eVar, "contentRatingInput");
        this.f = eVar;
        this.c.k(b.C0765b.a);
        com.amazon.aps.iva.se0.i.d(w.D(this), null, null, new b(null), 3);
    }

    @Override // com.amazon.aps.iva.tf.f
    public final v n6() {
        return this.d;
    }

    @Override // com.amazon.aps.iva.tf.f
    public final v o3() {
        return this.c;
    }
}
