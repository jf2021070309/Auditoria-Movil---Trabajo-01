package com.fyber.inneractive.sdk.dv.e;

import android.app.Activity;
import com.fyber.inneractive.sdk.config.a.s;
import com.fyber.inneractive.sdk.config.u;
import com.fyber.inneractive.sdk.dv.f;
import com.fyber.inneractive.sdk.util.l;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.rewarded.RewardItem;
import com.google.android.gms.ads.rewarded.RewardedAd;
import com.google.android.gms.ads.rewarded.RewardedAdCallback;
import com.google.android.gms.ads.rewarded.RewardedAdLoadCallback;
/* loaded from: classes.dex */
public final class b extends com.fyber.inneractive.sdk.a<RewardedAd> {
    private final RewardedAdLoadCallback e;
    private final RewardedAdCallback l;

    @Override // com.fyber.inneractive.sdk.d.g
    public final boolean a_() {
        return true;
    }

    public b(u uVar, s sVar, f fVar) {
        super(uVar, sVar, fVar);
        this.e = new RewardedAdLoadCallback() { // from class: com.fyber.inneractive.sdk.dv.e.b.1
            public final void onRewardedAdLoaded() {
                if (b.this.b != null) {
                    b.this.a();
                    b.this.b.c();
                }
            }

            public final void onRewardedAdFailedToLoad(int i) {
                if (b.this.b != null) {
                    b.this.b.d();
                }
            }
        };
        this.l = new RewardedAdCallback() { // from class: com.fyber.inneractive.sdk.dv.e.b.2
            public final void onRewardedAdFailedToShow(int i) {
            }

            public final void onRewardedAdOpened() {
                if (b.this.a != null) {
                    b.this.a.b();
                }
            }

            public final void onRewardedAdClosed() {
                if (b.this.a != null) {
                    b.this.a.d();
                }
            }

            public final void onUserEarnedReward(RewardItem rewardItem) {
                if (b.this.a != null) {
                    b.this.a.c();
                }
            }
        };
    }

    @Override // com.fyber.inneractive.sdk.a
    public final void a(com.fyber.inneractive.sdk.dv.d.a aVar, Activity activity) {
        this.a = aVar;
        ((RewardedAd) this.d).show(activity, this.l);
    }

    @Override // com.fyber.inneractive.sdk.dv.a, com.fyber.inneractive.sdk.d.g
    public final boolean d() {
        if (this.d != 0) {
            return ((RewardedAd) this.d).isLoaded();
        }
        return false;
    }

    /* JADX WARN: Type inference failed for: r4v1, types: [com.google.android.gms.ads.rewarded.RewardedAd, T] */
    @Override // com.fyber.inneractive.sdk.dv.a
    public final void a(AdRequest adRequest, com.fyber.inneractive.sdk.dv.c cVar) {
        super.a(adRequest, cVar);
        this.d = new RewardedAd(l.p(), "FyberRewarded");
        ((RewardedAd) this.d).loadAd(adRequest, this.e);
    }
}
