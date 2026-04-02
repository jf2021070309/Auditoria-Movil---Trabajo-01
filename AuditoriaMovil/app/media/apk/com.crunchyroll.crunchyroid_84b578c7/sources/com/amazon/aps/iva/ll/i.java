package com.amazon.aps.iva.ll;

import androidx.preference.Preference;
import androidx.preference.SwitchPreferenceCompat;
import com.amazon.aps.iva.i5.w;
/* compiled from: PlayerSettingsPresenter.kt */
/* loaded from: classes2.dex */
public final class i extends com.amazon.aps.iva.wy.b<m> implements com.amazon.aps.iva.ll.h {
    public final boolean b;
    public final com.amazon.aps.iva.ll.e c;
    public final o d;
    public final com.amazon.aps.iva.jh.g e;

    /* compiled from: PlayerSettingsPresenter.kt */
    /* loaded from: classes2.dex */
    public /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[l.values().length];
            try {
                iArr[l.AUTO_PLAY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[l.REPORT_A_PROBLEM.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            a = iArr;
        }
    }

    /* compiled from: PlayerSettingsPresenter.kt */
    /* loaded from: classes2.dex */
    public /* synthetic */ class b extends com.amazon.aps.iva.yb0.i implements com.amazon.aps.iva.xb0.l<Boolean, com.amazon.aps.iva.kb0.q> {
        public b(com.amazon.aps.iva.wy.h hVar) {
            super(1, hVar, m.class, "setAudioLanguageVisible", "setAudioLanguageVisible(Z)V", 0);
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final com.amazon.aps.iva.kb0.q invoke(Boolean bool) {
            ((m) this.receiver).t7(bool.booleanValue());
            return com.amazon.aps.iva.kb0.q.a;
        }
    }

    /* compiled from: PlayerSettingsPresenter.kt */
    /* loaded from: classes2.dex */
    public /* synthetic */ class c extends com.amazon.aps.iva.yb0.i implements com.amazon.aps.iva.xb0.l<Boolean, com.amazon.aps.iva.kb0.q> {
        public c(com.amazon.aps.iva.wy.h hVar) {
            super(1, hVar, m.class, "setVideoQualityVisible", "setVideoQualityVisible(Z)V", 0);
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final com.amazon.aps.iva.kb0.q invoke(Boolean bool) {
            ((m) this.receiver).pe(bool.booleanValue());
            return com.amazon.aps.iva.kb0.q.a;
        }
    }

    /* compiled from: PlayerSettingsPresenter.kt */
    /* loaded from: classes2.dex */
    public /* synthetic */ class d extends com.amazon.aps.iva.yb0.i implements com.amazon.aps.iva.xb0.l<Boolean, com.amazon.aps.iva.kb0.q> {
        public d(com.amazon.aps.iva.wy.h hVar) {
            super(1, hVar, m.class, "updateAutoPlay", "updateAutoPlay(Z)V", 0);
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final com.amazon.aps.iva.kb0.q invoke(Boolean bool) {
            ((m) this.receiver).Q(bool.booleanValue());
            return com.amazon.aps.iva.kb0.q.a;
        }
    }

    /* compiled from: PlayerSettingsPresenter.kt */
    /* loaded from: classes2.dex */
    public /* synthetic */ class e extends com.amazon.aps.iva.yb0.i implements com.amazon.aps.iva.xb0.l<com.amazon.aps.iva.sl.g, com.amazon.aps.iva.kb0.q> {
        public e(com.amazon.aps.iva.wy.h hVar) {
            super(1, hVar, m.class, "updateVideoQuality", "updateVideoQuality(Lcom/crunchyroll/player/settings/quality/QualitySetting;)V", 0);
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final com.amazon.aps.iva.kb0.q invoke(com.amazon.aps.iva.sl.g gVar) {
            com.amazon.aps.iva.sl.g gVar2 = gVar;
            com.amazon.aps.iva.yb0.j.f(gVar2, "p0");
            ((m) this.receiver).oc(gVar2);
            return com.amazon.aps.iva.kb0.q.a;
        }
    }

    /* compiled from: PlayerSettingsPresenter.kt */
    /* loaded from: classes2.dex */
    public static final class f extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<com.amazon.aps.iva.jh.f, com.amazon.aps.iva.kb0.q> {
        public f() {
            super(1);
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final com.amazon.aps.iva.kb0.q invoke(com.amazon.aps.iva.jh.f fVar) {
            com.amazon.aps.iva.jh.f fVar2 = fVar;
            i iVar = i.this;
            com.amazon.aps.iva.yb0.j.e(fVar2, "it");
            iVar.getView().rd(iVar.e.b(fVar2));
            return com.amazon.aps.iva.kb0.q.a;
        }
    }

    /* compiled from: PlayerSettingsPresenter.kt */
    /* loaded from: classes2.dex */
    public /* synthetic */ class g extends com.amazon.aps.iva.yb0.i implements com.amazon.aps.iva.xb0.l<String, com.amazon.aps.iva.kb0.q> {
        public g(com.amazon.aps.iva.wy.h hVar) {
            super(1, hVar, m.class, "updateAudioLanguage", "updateAudioLanguage(Ljava/lang/String;)V", 0);
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final com.amazon.aps.iva.kb0.q invoke(String str) {
            String str2 = str;
            com.amazon.aps.iva.yb0.j.f(str2, "p0");
            ((m) this.receiver).u2(str2);
            return com.amazon.aps.iva.kb0.q.a;
        }
    }

    /* compiled from: PlayerSettingsPresenter.kt */
    /* loaded from: classes2.dex */
    public static final class h implements w, com.amazon.aps.iva.yb0.f {
        public final /* synthetic */ com.amazon.aps.iva.xb0.l a;

        public h(com.amazon.aps.iva.xb0.l lVar) {
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

    public i(com.amazon.aps.iva.ll.c cVar, boolean z, com.amazon.aps.iva.ll.e eVar, o oVar, com.amazon.aps.iva.jh.h hVar) {
        super(cVar, new com.amazon.aps.iva.wy.j[0]);
        this.b = z;
        this.c = eVar;
        this.d = oVar;
        this.e = hVar;
    }

    @Override // com.amazon.aps.iva.ll.h
    public final void Z2(int i) {
        if (i == 0) {
            if (this.b) {
                getView().U();
            } else {
                getView().Oe();
            }
            getView().Da();
            return;
        }
        getView().T();
        getView().n8();
    }

    @Override // com.amazon.aps.iva.ll.h
    public final void a() {
        if (getView().sd()) {
            if (getView().S6() > 0) {
                getView().x();
            } else {
                getView().Q2();
            }
        }
    }

    @Override // com.amazon.aps.iva.ll.h
    public final void l3(Preference preference, l lVar) {
        if (lVar == l.AUTO_PLAY && (preference instanceof SwitchPreferenceCompat)) {
            this.d.Q(((SwitchPreferenceCompat) preference).O);
        }
    }

    @Override // com.amazon.aps.iva.wy.b, com.amazon.aps.iva.wy.k
    public final void onCreate() {
        com.amazon.aps.iva.ll.e eVar = this.c;
        eVar.B0().e(getView(), new h(new b(getView())));
        eVar.I3().e(getView(), new h(new c(getView())));
        if (this.b) {
            getView().U();
        }
        o oVar = this.d;
        oVar.D2().e(getView(), new h(new d(getView())));
        oVar.p().e(getView(), new h(new e(getView())));
        oVar.w().e(getView(), new h(new f()));
        oVar.h3().e(getView(), new h(new g(getView())));
    }

    @Override // com.amazon.aps.iva.wy.b, com.amazon.aps.iva.wy.k
    public final void onPause() {
        getView().c0();
    }

    @Override // com.amazon.aps.iva.wy.b, com.amazon.aps.iva.wy.k
    public final void onResume() {
        getView().d0();
    }

    @Override // com.amazon.aps.iva.ll.h
    public final void s2() {
        getView().Q2();
    }

    @Override // com.amazon.aps.iva.ll.h
    public final void u4(l lVar) {
        int i = a.a[lVar.ordinal()];
        if (i != 1) {
            if (i != 2) {
                getView().h8(lVar);
                getView().Cf(lVar.getNameResId());
            } else if (this.b) {
                getView().Q2();
                getView().M2();
            } else {
                getView().h8(lVar);
                getView().Cf(lVar.getNameResId());
            }
        }
    }
}
