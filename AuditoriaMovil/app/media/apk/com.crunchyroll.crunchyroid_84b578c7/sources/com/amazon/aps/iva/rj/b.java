package com.amazon.aps.iva.rj;

import android.content.Context;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.amazon.aps.iva.ab.x;
import com.amazon.aps.iva.kb0.q;
import com.amazon.aps.iva.mf0.a;
import com.amazon.aps.iva.p6.a;
import com.amazon.aps.iva.pj.b;
import com.amazon.aps.iva.q5.b0;
import com.amazon.aps.iva.sj.a;
import com.amazon.aps.iva.ve0.i0;
import com.amazon.aps.iva.ve0.v0;
import com.google.ads.interactivemedia.v3.api.Ad;
import com.google.ads.interactivemedia.v3.api.AdErrorEvent;
import com.google.ads.interactivemedia.v3.api.AdEvent;
import java.util.List;
/* compiled from: AdsHelper.kt */
/* loaded from: classes.dex */
public final class b implements AdEvent.AdEventListener, AdErrorEvent.AdErrorListener, com.amazon.aps.iva.yl.a {
    public final Context a;
    public final com.amazon.aps.iva.kk.a b;
    public final com.amazon.aps.iva.oj.a c;
    public final com.amazon.aps.iva.yl.d d;
    public final a e;
    public FrameLayout f;
    public com.amazon.aps.iva.yl.c g;
    public com.amazon.aps.iva.qk.a h;
    public com.amazon.aps.iva.a6.m i;
    public final v0 j;
    public final i0 k;
    public androidx.media3.ui.d l;
    public final com.amazon.aps.iva.jk.i m;

    /* compiled from: AdsHelper.kt */
    /* loaded from: classes.dex */
    public static final class a implements a.b {
        public com.amazon.aps.iva.sj.b a;

        @Override // com.amazon.aps.iva.p6.a.b
        public final com.amazon.aps.iva.sj.b a(b0.a aVar) {
            return this.a;
        }
    }

    /* compiled from: AdsHelper.kt */
    /* renamed from: com.amazon.aps.iva.rj.b$b  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public /* synthetic */ class C0681b {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[AdEvent.AdEventType.values().length];
            iArr[AdEvent.AdEventType.LOADED.ordinal()] = 1;
            iArr[AdEvent.AdEventType.RESUMED.ordinal()] = 2;
            iArr[AdEvent.AdEventType.STARTED.ordinal()] = 3;
            iArr[AdEvent.AdEventType.COMPLETED.ordinal()] = 4;
            iArr[AdEvent.AdEventType.PAUSED.ordinal()] = 5;
            iArr[AdEvent.AdEventType.AD_BUFFERING.ordinal()] = 6;
            iArr[AdEvent.AdEventType.AD_PROGRESS.ordinal()] = 7;
            iArr[AdEvent.AdEventType.CONTENT_RESUME_REQUESTED.ordinal()] = 8;
            iArr[AdEvent.AdEventType.TAPPED.ordinal()] = 9;
            a = iArr;
        }
    }

    /* compiled from: AdsHelper.kt */
    /* loaded from: classes.dex */
    public static final class c extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<com.amazon.aps.iva.nk.c, com.amazon.aps.iva.nk.c> {
        public static final c h = new c();

        public c() {
            super(1);
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final com.amazon.aps.iva.nk.c invoke(com.amazon.aps.iva.nk.c cVar) {
            com.amazon.aps.iva.nk.c cVar2 = cVar;
            com.amazon.aps.iva.yb0.j.f(cVar2, "$this$set");
            return com.amazon.aps.iva.nk.c.a(cVar2, false, null, null, com.amazon.aps.iva.nk.b.ERROR, 6);
        }
    }

    /* compiled from: AdsHelper.kt */
    /* loaded from: classes.dex */
    public static final class d extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<com.amazon.aps.iva.nk.c, com.amazon.aps.iva.nk.c> {
        public final /* synthetic */ AdEvent h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(AdEvent adEvent) {
            super(1);
            this.h = adEvent;
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final com.amazon.aps.iva.nk.c invoke(com.amazon.aps.iva.nk.c cVar) {
            com.amazon.aps.iva.nk.c cVar2 = cVar;
            com.amazon.aps.iva.yb0.j.f(cVar2, "$this$set");
            return com.amazon.aps.iva.nk.c.a(cVar2, false, com.amazon.aps.iva.aq.k.K(this.h.getAd()), null, null, 13);
        }
    }

    /* compiled from: AdsHelper.kt */
    /* loaded from: classes.dex */
    public static final class e extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<com.amazon.aps.iva.nk.c, com.amazon.aps.iva.nk.c> {
        public final /* synthetic */ AdEvent h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(AdEvent adEvent) {
            super(1);
            this.h = adEvent;
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final com.amazon.aps.iva.nk.c invoke(com.amazon.aps.iva.nk.c cVar) {
            com.amazon.aps.iva.nk.c cVar2 = cVar;
            com.amazon.aps.iva.yb0.j.f(cVar2, "$this$set");
            return com.amazon.aps.iva.nk.c.a(cVar2, false, com.amazon.aps.iva.aq.k.K(this.h.getAd()), null, com.amazon.aps.iva.nk.b.PLAYING, 5);
        }
    }

    /* compiled from: AdsHelper.kt */
    /* loaded from: classes.dex */
    public static final class f extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<com.amazon.aps.iva.nk.c, com.amazon.aps.iva.nk.c> {
        public final /* synthetic */ AdEvent h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(AdEvent adEvent) {
            super(1);
            this.h = adEvent;
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final com.amazon.aps.iva.nk.c invoke(com.amazon.aps.iva.nk.c cVar) {
            com.amazon.aps.iva.nk.c cVar2 = cVar;
            com.amazon.aps.iva.yb0.j.f(cVar2, "$this$set");
            return com.amazon.aps.iva.nk.c.a(cVar2, true, com.amazon.aps.iva.aq.k.K(this.h.getAd()), null, com.amazon.aps.iva.nk.b.PLAYING, 4);
        }
    }

    /* compiled from: AdsHelper.kt */
    /* loaded from: classes.dex */
    public static final class g extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<com.amazon.aps.iva.nk.c, com.amazon.aps.iva.nk.c> {
        public static final g h = new g();

        public g() {
            super(1);
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final com.amazon.aps.iva.nk.c invoke(com.amazon.aps.iva.nk.c cVar) {
            com.amazon.aps.iva.nk.c cVar2 = cVar;
            com.amazon.aps.iva.yb0.j.f(cVar2, "$this$set");
            return com.amazon.aps.iva.nk.c.a(cVar2, false, null, null, com.amazon.aps.iva.nk.b.PAUSED, 7);
        }
    }

    /* compiled from: AdsHelper.kt */
    /* loaded from: classes.dex */
    public static final class h extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<com.amazon.aps.iva.nk.c, com.amazon.aps.iva.nk.c> {
        public static final h h = new h();

        public h() {
            super(1);
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final com.amazon.aps.iva.nk.c invoke(com.amazon.aps.iva.nk.c cVar) {
            com.amazon.aps.iva.nk.c cVar2 = cVar;
            com.amazon.aps.iva.yb0.j.f(cVar2, "$this$set");
            return com.amazon.aps.iva.nk.c.a(cVar2, false, null, null, com.amazon.aps.iva.nk.b.BUFFERING, 7);
        }
    }

    /* compiled from: AdsHelper.kt */
    /* loaded from: classes.dex */
    public static final class i extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<com.amazon.aps.iva.nk.c, com.amazon.aps.iva.nk.c> {
        public final /* synthetic */ AdEvent h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(AdEvent adEvent) {
            super(1);
            this.h = adEvent;
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final com.amazon.aps.iva.nk.c invoke(com.amazon.aps.iva.nk.c cVar) {
            com.amazon.aps.iva.nk.c cVar2 = cVar;
            com.amazon.aps.iva.yb0.j.f(cVar2, "$this$set");
            return com.amazon.aps.iva.nk.c.a(cVar2, true, com.amazon.aps.iva.aq.k.K(this.h.getAd()), null, com.amazon.aps.iva.nk.b.PLAYING, 4);
        }
    }

    /* compiled from: AdsHelper.kt */
    /* loaded from: classes.dex */
    public static final class j extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<com.amazon.aps.iva.nk.c, com.amazon.aps.iva.nk.c> {
        public static final j h = new j();

        public j() {
            super(1);
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final com.amazon.aps.iva.nk.c invoke(com.amazon.aps.iva.nk.c cVar) {
            com.amazon.aps.iva.nk.c cVar2 = cVar;
            com.amazon.aps.iva.yb0.j.f(cVar2, "$this$set");
            return com.amazon.aps.iva.nk.c.a(cVar2, false, null, null, com.amazon.aps.iva.nk.b.COMPLETE, 7);
        }
    }

    /* compiled from: AdsHelper.kt */
    /* loaded from: classes.dex */
    public static final class k extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<Boolean, q> {
        public k() {
            super(1);
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final q invoke(Boolean bool) {
            defpackage.i.C(b.this.j, new com.amazon.aps.iva.rj.c(bool.booleanValue()));
            return q.a;
        }
    }

    /* compiled from: AdsHelper.kt */
    /* loaded from: classes.dex */
    public static final class l extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<List<? extends Long>, q> {
        public l() {
            super(1);
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final q invoke(List<? extends Long> list) {
            List<? extends Long> list2 = list;
            com.amazon.aps.iva.yb0.j.f(list2, "it");
            b bVar = b.this;
            if (!com.amazon.aps.iva.yb0.j.a(((com.amazon.aps.iva.nk.c) bVar.j.getValue()).d, list2)) {
                a.C0515a c0515a = com.amazon.aps.iva.mf0.a.a;
                c0515a.a("AdCuePoints are being set: " + list2, new Object[0]);
                defpackage.i.C(bVar.j, new com.amazon.aps.iva.rj.d(list2));
            }
            return q.a;
        }
    }

    /* compiled from: AdsHelper.kt */
    /* loaded from: classes.dex */
    public static final class m extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a<q> {
        public m() {
            super(0);
        }

        @Override // com.amazon.aps.iva.xb0.a
        public final q invoke() {
            b.this.b();
            return q.a;
        }
    }

    public b(Context context, com.amazon.aps.iva.kk.a aVar, com.amazon.aps.iva.oj.a aVar2, com.amazon.aps.iva.yl.d dVar) {
        com.amazon.aps.iva.yb0.j.f(context, "context");
        com.amazon.aps.iva.yb0.j.f(aVar, "playerAdConfiguration");
        this.a = context;
        this.b = aVar;
        this.c = aVar2;
        this.d = dVar;
        this.e = new a();
        v0 e2 = x.e(new com.amazon.aps.iva.nk.c(null, 15));
        this.j = e2;
        this.k = com.amazon.aps.iva.dg.b.h(e2);
        this.m = new com.amazon.aps.iva.jk.i(new k(), new l(), new m());
    }

    @Override // com.amazon.aps.iva.yl.a
    public final void a() {
        com.amazon.aps.iva.sj.a aVar;
        a.b bVar;
        com.amazon.aps.iva.sj.b bVar2 = this.e.a;
        if (bVar2 != null && (aVar = bVar2.m) != null && aVar.v != null && (bVar = aVar.F) != null) {
            aVar.D = 0;
            aVar.A = aVar.A.g(bVar.a, bVar.b);
            aVar.C0();
            aVar.v.skip();
        }
    }

    public final void b() {
        this.j.setValue(new com.amazon.aps.iva.nk.c(null, 15));
    }

    @Override // com.amazon.aps.iva.yl.a
    public final void discardAdBreak() {
        com.amazon.aps.iva.sj.a aVar;
        a.b bVar;
        com.amazon.aps.iva.sj.b bVar2 = this.e.a;
        if (bVar2 != null && (aVar = bVar2.m) != null && aVar.v != null && (bVar = aVar.F) != null) {
            aVar.D = 0;
            aVar.A = aVar.A.h(bVar.a);
            aVar.C0();
            aVar.v.discardAdBreak();
        }
    }

    @Override // com.google.ads.interactivemedia.v3.api.AdErrorEvent.AdErrorListener
    public final void onAdError(AdErrorEvent adErrorEvent) {
        com.amazon.aps.iva.yb0.j.f(adErrorEvent, "event");
        a.C0515a c0515a = com.amazon.aps.iva.mf0.a.a;
        c0515a.a("AdErrorEvent " + adErrorEvent.getError(), new Object[0]);
        defpackage.i.C(this.j, c.h);
    }

    @Override // com.google.ads.interactivemedia.v3.api.AdEvent.AdEventListener
    public final void onAdEvent(AdEvent adEvent) {
        androidx.media3.ui.d dVar;
        ViewGroup adViewGroup;
        com.amazon.aps.iva.yb0.j.f(adEvent, "event");
        a.C0515a c0515a = com.amazon.aps.iva.mf0.a.a;
        c0515a.a("AdEvent: " + adEvent, new Object[0]);
        if (this.b.k && (dVar = this.l) != null && (adViewGroup = dVar.getAdViewGroup()) != null) {
            int childCount = adViewGroup.getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                adViewGroup.getChildAt(i2).setVisibility(8);
            }
        }
        int i3 = C0681b.a[adEvent.getType().ordinal()];
        com.amazon.aps.iva.oj.a aVar = this.c;
        v0 v0Var = this.j;
        switch (i3) {
            case 1:
                defpackage.i.C(v0Var, new d(adEvent));
                return;
            case 2:
                if (((com.amazon.aps.iva.nk.c) v0Var.getValue()).e == com.amazon.aps.iva.nk.b.PAUSED) {
                    defpackage.i.C(v0Var, new e(adEvent));
                    return;
                }
                return;
            case 3:
                Ad ad = adEvent.getAd();
                com.amazon.aps.iva.yb0.j.e(ad, "it.ad");
                if (this.l != null && this.i != null && this.g != null) {
                    String adSystem = ad.getAdSystem();
                    com.amazon.aps.iva.yb0.j.e(adSystem, "ad.adSystem");
                    if (com.amazon.aps.iva.oe0.q.i0(adSystem, "trueX", true)) {
                        String description = ad.getDescription();
                        com.amazon.aps.iva.yb0.j.e(description, "ad.description");
                        com.amazon.aps.iva.yl.c cVar = this.g;
                        if (cVar != null) {
                            FrameLayout frameLayout = this.f;
                            com.amazon.aps.iva.yb0.j.d(frameLayout, "null cannot be cast to non-null type android.view.ViewGroup");
                            cVar.a(frameLayout, description);
                        }
                    }
                }
                com.amazon.aps.iva.yb0.j.e(adEvent.getAd(), "it.ad");
                if (this.l != null) {
                    com.amazon.aps.iva.a6.m mVar = this.i;
                }
                defpackage.i.C(v0Var, new f(adEvent));
                aVar.b(b.class.getSimpleName(), new b.a(adEvent.getAd().getAdPodInfo().getPodIndex(), adEvent.getAd().getAdPodInfo().getAdPosition(), adEvent.getAd().getAdPodInfo().getTimeOffset(), adEvent.getAd().getDuration()));
                return;
            case 4:
                if (this.h != null) {
                    com.amazon.aps.iva.yb0.j.e(adEvent.getAd(), "it.ad");
                    return;
                }
                return;
            case 5:
                if (((com.amazon.aps.iva.nk.c) v0Var.getValue()).e == com.amazon.aps.iva.nk.b.PLAYING) {
                    defpackage.i.C(v0Var, g.h);
                    return;
                }
                return;
            case 6:
                defpackage.i.C(v0Var, h.h);
                return;
            case 7:
                if (((com.amazon.aps.iva.nk.c) v0Var.getValue()).e == com.amazon.aps.iva.nk.b.BUFFERING) {
                    defpackage.i.C(v0Var, new i(adEvent));
                    return;
                }
                return;
            case 8:
                defpackage.i.C(v0Var, j.h);
                return;
            case 9:
                aVar.b(b.class.getSimpleName(), b.C0619b.a);
                return;
            default:
                return;
        }
    }
}
