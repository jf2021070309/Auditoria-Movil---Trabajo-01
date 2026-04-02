package com.amazon.aps.iva.di;

import com.amazon.aps.iva.ab.x;
import com.amazon.aps.iva.e.w;
import com.amazon.aps.iva.ee0.f1;
import com.amazon.aps.iva.ez.g;
import com.amazon.aps.iva.i5.v;
import com.amazon.aps.iva.kb0.q;
import com.amazon.aps.iva.lb0.r;
import com.amazon.aps.iva.ot.a;
import com.amazon.aps.iva.se0.g0;
import com.ellation.crunchyroll.model.music.MusicGenre;
import com.ellation.crunchyroll.model.music.MusicVideo;
import com.ellation.crunchyroll.ui.labels.LabelUiModelKt;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
/* compiled from: FeaturedMusicViewModel.kt */
/* loaded from: classes.dex */
public final class p extends com.amazon.aps.iva.ez.b implements n {
    public final e b;
    public final com.amazon.aps.iva.at.d c;
    public final com.amazon.aps.iva.yh.c d;
    public final com.amazon.aps.iva.xb0.a<String> e;
    public final ArrayList f;
    public d g;
    public final v<com.amazon.aps.iva.ez.g<List<com.amazon.aps.iva.ei.i>>> h;

    /* compiled from: FeaturedMusicViewModel.kt */
    @com.amazon.aps.iva.qb0.e(c = "com.crunchyroll.music.featuredmusic.FeaturedMusicViewModelImpl$loadMusicData$1", f = "FeaturedMusicViewModel.kt", l = {57}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    public static final class a extends com.amazon.aps.iva.qb0.i implements com.amazon.aps.iva.xb0.p<g0, com.amazon.aps.iva.ob0.d<? super q>, Object> {
        public int h;
        public final /* synthetic */ String j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String str, com.amazon.aps.iva.ob0.d<? super a> dVar) {
            super(2, dVar);
            this.j = str;
        }

        @Override // com.amazon.aps.iva.qb0.a
        public final com.amazon.aps.iva.ob0.d<q> create(Object obj, com.amazon.aps.iva.ob0.d<?> dVar) {
            return new a(this.j, dVar);
        }

        @Override // com.amazon.aps.iva.xb0.p
        public final Object invoke(g0 g0Var, com.amazon.aps.iva.ob0.d<? super q> dVar) {
            return ((a) create(g0Var, dVar)).invokeSuspend(q.a);
        }

        @Override // com.amazon.aps.iva.qb0.a
        public final Object invokeSuspend(Object obj) {
            com.amazon.aps.iva.pb0.a aVar = com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED;
            int i = this.h;
            p pVar = p.this;
            try {
                if (i != 0) {
                    if (i == 1) {
                        x.i0(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    x.i0(obj);
                    e eVar = pVar.b;
                    String str = this.j;
                    this.h = 1;
                    obj = eVar.a(str, this);
                    if (obj == aVar) {
                        return aVar;
                    }
                }
                v<com.amazon.aps.iva.ez.g<List<com.amazon.aps.iva.ei.i>>> vVar = pVar.h;
                List<MusicVideo> list = (List) obj;
                ArrayList arrayList = new ArrayList(r.Y(list));
                for (MusicVideo musicVideo : list) {
                    arrayList.add(p.O8(pVar, musicVideo));
                }
                vVar.k(new g.c(p.N8(pVar, arrayList), null));
            } catch (IOException e) {
                com.amazon.aps.iva.e4.e.g(null, e, pVar.h);
            }
            return q.a;
        }
    }

    public p() {
        throw null;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(e eVar, com.amazon.aps.iva.at.f fVar, com.amazon.aps.iva.yh.d dVar) {
        super(new com.amazon.aps.iva.wy.j[0]);
        com.amazon.aps.iva.yb0.j.f(eVar, "interactor");
        o oVar = o.h;
        com.amazon.aps.iva.yb0.j.f(oVar, "generateAdapterId");
        this.b = eVar;
        this.c = fVar;
        this.d = dVar;
        this.e = oVar;
        ArrayList arrayList = new ArrayList(20);
        for (int i = 0; i < 20; i++) {
            arrayList.add(new com.amazon.aps.iva.ei.j(this.e.invoke()));
        }
        this.f = arrayList;
        this.h = new v<>();
    }

    public static final ArrayList N8(p pVar, ArrayList arrayList) {
        String invoke;
        pVar.getClass();
        ArrayList arrayList2 = new ArrayList(r.Y(arrayList));
        int i = 0;
        for (Object obj : arrayList) {
            int i2 = i + 1;
            if (i >= 0) {
                com.amazon.aps.iva.fi.a aVar = (com.amazon.aps.iva.fi.a) obj;
                ArrayList arrayList3 = pVar.f;
                if (i < arrayList3.size()) {
                    invoke = ((com.amazon.aps.iva.ei.j) arrayList3.get(i)).a;
                } else {
                    invoke = pVar.e.invoke();
                }
                arrayList2.add(new com.amazon.aps.iva.ei.h(aVar, invoke));
                i = i2;
            } else {
                f1.S();
                throw null;
            }
        }
        return arrayList2;
    }

    public static final com.amazon.aps.iva.fi.a O8(p pVar, MusicVideo musicVideo) {
        String str;
        pVar.getClass();
        String id = musicVideo.getId();
        com.amazon.aps.iva.yh.c cVar = pVar.d;
        String b = cVar.b(musicVideo);
        String a2 = cVar.a(musicVideo);
        String c = cVar.c(musicVideo);
        com.amazon.aps.iva.pe0.b p0 = x.p0(musicVideo.getImages().getThumbnails());
        long seconds = TimeUnit.MILLISECONDS.toSeconds(musicVideo.getDurationMs());
        MusicGenre musicGenre = (MusicGenre) com.amazon.aps.iva.lb0.x.v0(musicVideo.getGenres());
        if (musicGenre != null) {
            str = musicGenre.getDisplayValue();
        } else {
            str = null;
        }
        com.amazon.aps.iva.at.d dVar = pVar.c;
        return new com.amazon.aps.iva.fi.a(id, b, a2, c, p0, seconds, str, a.c.a(dVar.b(musicVideo)), x.p0(dVar.a(musicVideo)), LabelUiModelKt.toLabelUiModel$default(musicVideo, false, 1, null), musicVideo.getType(), false);
    }

    @Override // com.amazon.aps.iva.di.n
    public final void O3() {
        String str;
        d dVar = this.g;
        if (dVar != null && (str = dVar.b) != null) {
            com.amazon.aps.iva.ez.h.c(this.h, this.f);
            com.amazon.aps.iva.se0.i.d(w.D(this), null, null, new a(str, null), 3);
        }
    }

    @Override // com.amazon.aps.iva.di.n
    public final v P6() {
        return this.h;
    }

    @Override // com.amazon.aps.iva.di.n
    public final void x5(d dVar) {
        com.amazon.aps.iva.yb0.j.f(dVar, "input");
        if (this.g == null) {
            this.g = dVar;
            O3();
        }
    }
}
