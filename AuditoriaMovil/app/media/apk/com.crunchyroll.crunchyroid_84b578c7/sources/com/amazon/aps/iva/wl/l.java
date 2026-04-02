package com.amazon.aps.iva.wl;

import com.amazon.aps.iva.i5.w;
import java.util.List;
/* compiled from: SubtitlesSettingsPresenter.kt */
/* loaded from: classes2.dex */
public final class l extends com.amazon.aps.iva.wy.b<m> implements k {
    public final o b;
    public final com.amazon.aps.iva.jh.g c;

    /* compiled from: SubtitlesSettingsPresenter.kt */
    /* loaded from: classes2.dex */
    public /* synthetic */ class a extends com.amazon.aps.iva.yb0.i implements com.amazon.aps.iva.xb0.l<List<? extends com.amazon.aps.iva.jh.f>, com.amazon.aps.iva.kb0.q> {
        public a(com.amazon.aps.iva.wy.h hVar) {
            super(1, hVar, m.class, "showSubtitlesOptions", "showSubtitlesOptions(Ljava/util/List;)V", 0);
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final com.amazon.aps.iva.kb0.q invoke(List<? extends com.amazon.aps.iva.jh.f> list) {
            List<? extends com.amazon.aps.iva.jh.f> list2 = list;
            com.amazon.aps.iva.yb0.j.f(list2, "p0");
            ((m) this.receiver).e7(list2);
            return com.amazon.aps.iva.kb0.q.a;
        }
    }

    /* compiled from: SubtitlesSettingsPresenter.kt */
    /* loaded from: classes2.dex */
    public /* synthetic */ class b extends com.amazon.aps.iva.yb0.i implements com.amazon.aps.iva.xb0.l<com.amazon.aps.iva.jh.f, com.amazon.aps.iva.kb0.q> {
        public b(com.amazon.aps.iva.wy.h hVar) {
            super(1, hVar, m.class, "selectSubtitlesOption", "selectSubtitlesOption(Lcom/crunchyroll/languageoptions/LanguageOption;)V", 0);
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final com.amazon.aps.iva.kb0.q invoke(com.amazon.aps.iva.jh.f fVar) {
            com.amazon.aps.iva.jh.f fVar2 = fVar;
            com.amazon.aps.iva.yb0.j.f(fVar2, "p0");
            ((m) this.receiver).e4(fVar2);
            return com.amazon.aps.iva.kb0.q.a;
        }
    }

    /* compiled from: SubtitlesSettingsPresenter.kt */
    /* loaded from: classes2.dex */
    public static final class c implements w, com.amazon.aps.iva.yb0.f {
        public final /* synthetic */ com.amazon.aps.iva.xb0.l a;

        public c(com.amazon.aps.iva.xb0.l lVar) {
            this.a = lVar;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof w) || !(obj instanceof com.amazon.aps.iva.yb0.f)) {
                return false;
            }
            return com.amazon.aps.iva.yb0.j.a(this.a, ((com.amazon.aps.iva.yb0.f) obj).getFunctionDelegate());
        }

        @Override // com.amazon.aps.iva.yb0.f
        public final com.amazon.aps.iva.kb0.a<?> getFunctionDelegate() {
            return this.a;
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        @Override // com.amazon.aps.iva.i5.w
        public final /* synthetic */ void onChanged(Object obj) {
            this.a.invoke(obj);
        }
    }

    public l(j jVar, o oVar, com.amazon.aps.iva.jh.h hVar) {
        super(jVar, new com.amazon.aps.iva.wy.j[0]);
        this.b = oVar;
        this.c = hVar;
    }

    @Override // com.amazon.aps.iva.wl.k
    public final CharSequence L5(com.amazon.aps.iva.jh.f fVar) {
        com.amazon.aps.iva.yb0.j.f(fVar, "option");
        return this.c.b(fVar);
    }

    @Override // com.amazon.aps.iva.wl.k
    public final void U5(com.amazon.aps.iva.jh.f fVar) {
        boolean z;
        com.amazon.aps.iva.yb0.j.f(fVar, "selectedOption");
        if (!(fVar instanceof com.amazon.aps.iva.jh.m) && !(fVar instanceof com.amazon.aps.iva.jh.b)) {
            z = false;
        } else {
            z = true;
        }
        String a2 = fVar.a();
        o oVar = this.b;
        oVar.C3(a2, z);
        oVar.O(fVar.a());
        getView().O();
    }

    @Override // com.amazon.aps.iva.wy.b, com.amazon.aps.iva.wy.k
    public final void onCreate() {
        o oVar = this.b;
        oVar.S2().e(getView(), new c(new a(getView())));
        oVar.w().e(getView(), new c(new b(getView())));
    }
}
