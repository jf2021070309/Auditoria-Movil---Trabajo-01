package com.ironsource.sdk.f;

import com.ironsource.mediationsdk.model.e;
import com.ironsource.mediationsdk.model.q;
import com.ironsource.mediationsdk.utils.j;
import com.ironsource.mediationsdk.utils.o;
import com.ironsource.sdk.g.d;
/* loaded from: classes2.dex */
public class a {
    private e a;
    private q b;
    private o c;
    private boolean d;
    private d e;
    private com.ironsource.mediationsdk.utils.a f;
    private com.ironsource.mediationsdk.model.d g;
    private j h;
    private com.ironsource.mediationsdk.model.b i;

    /* renamed from: com.ironsource.sdk.f.a$a  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static class C0092a {
        public String a;
        public String b;
        public String c;

        public static C0092a a(d.e eVar) {
            String str;
            C0092a c0092a = new C0092a();
            if (eVar == d.e.RewardedVideo) {
                c0092a.a = "showRewardedVideo";
                c0092a.b = "onShowRewardedVideoSuccess";
                str = "onShowRewardedVideoFail";
            } else if (eVar != d.e.Interstitial) {
                if (eVar == d.e.OfferWall) {
                    c0092a.a = "showOfferWall";
                    c0092a.b = "onShowOfferWallSuccess";
                    str = "onInitOfferWallFail";
                }
                return c0092a;
            } else {
                c0092a.a = "showInterstitial";
                c0092a.b = "onShowInterstitialSuccess";
                str = "onShowInterstitialFail";
            }
            c0092a.c = str;
            return c0092a;
        }
    }

    public a() {
        this.a = new e();
    }

    public a(e eVar, q qVar, o oVar, boolean z, d dVar, com.ironsource.mediationsdk.utils.a aVar, com.ironsource.mediationsdk.model.d dVar2, j jVar, com.ironsource.mediationsdk.model.b bVar) {
        this.a = eVar;
        this.b = qVar;
        this.c = oVar;
        this.d = z;
        this.e = dVar;
        this.f = aVar;
        this.g = dVar2;
        this.h = jVar;
        this.i = bVar;
    }

    public e a() {
        return this.a;
    }

    public q b() {
        return this.b;
    }

    public o c() {
        return this.c;
    }

    public boolean d() {
        return this.d;
    }

    public d e() {
        return this.e;
    }

    public com.ironsource.mediationsdk.utils.a f() {
        return this.f;
    }

    public com.ironsource.mediationsdk.model.d g() {
        return this.g;
    }

    public j h() {
        return this.h;
    }

    public com.ironsource.mediationsdk.model.b i() {
        return this.i;
    }
}
