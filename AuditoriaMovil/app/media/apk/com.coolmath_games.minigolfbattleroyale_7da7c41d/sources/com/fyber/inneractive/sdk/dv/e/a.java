package com.fyber.inneractive.sdk.dv.e;

import android.app.Activity;
import com.fyber.inneractive.sdk.config.a.s;
import com.fyber.inneractive.sdk.config.u;
import com.fyber.inneractive.sdk.dv.f;
import com.fyber.inneractive.sdk.util.l;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.FullScreenContentCallback;
import com.google.android.gms.ads.LoadAdError;
import com.google.android.gms.ads.OnUserEarnedRewardListener;
import com.google.android.gms.ads.rewarded.RewardItem;
import com.google.android.gms.ads.rewarded.RewardedAd;
import com.google.android.gms.ads.rewarded.RewardedAdLoadCallback;
/* loaded from: classes.dex */
public final class a extends com.fyber.inneractive.sdk.a<RewardedAd> {
    private final RewardedAdLoadCallback e;
    private final FullScreenContentCallback l;
    private final OnUserEarnedRewardListener m;

    @Override // com.fyber.inneractive.sdk.d.g
    public final boolean a_() {
        return true;
    }

    public a(u uVar, s sVar, f fVar) {
        super(uVar, sVar, fVar);
        this.e = new RewardedAdLoadCallback() { // from class: com.fyber.inneractive.sdk.dv.e.a.1
            @Override // com.google.android.gms.ads.AdLoadCallback
            public final /* synthetic */ void onAdLoaded(RewardedAd rewardedAd) {
                RewardedAd rewardedAd2 = rewardedAd;
                if (a.this.b != null) {
                    a.this.d = rewardedAd2;
                    a.this.a();
                    a.this.b.c();
                }
            }

            @Override // com.google.android.gms.ads.AdLoadCallback
            public final void onAdFailedToLoad(LoadAdError loadAdError) {
                if (a.this.b != null) {
                    a.this.b.d();
                }
            }
        };
        this.l = new FullScreenContentCallback() { // from class: com.fyber.inneractive.sdk.dv.e.a.2
            @Override // com.google.android.gms.ads.FullScreenContentCallback
            public final void onAdDismissedFullScreenContent() {
                if (a.this.a != null) {
                    a.this.a.d();
                }
            }

            @Override // com.google.android.gms.ads.FullScreenContentCallback
            public final void onAdImpression() {
                if (a.this.a != null) {
                    a.this.a.b();
                }
            }
        };
        this.m = new OnUserEarnedRewardListener() { // from class: com.fyber.inneractive.sdk.dv.e.a.3
            @Override // com.google.android.gms.ads.OnUserEarnedRewardListener
            public final void onUserEarnedReward(RewardItem rewardItem) {
                if (a.this.a != null) {
                    a.this.a.c();
                }
            }
        };
    }

    @Override // com.fyber.inneractive.sdk.a
    public final void a(com.fyber.inneractive.sdk.dv.d.a aVar, Activity activity) {
        this.a = aVar;
        if (this.d != 0) {
            ((RewardedAd) this.d).setFullScreenContentCallback(this.l);
            ((RewardedAd) this.d).show(activity, this.m);
        }
    }

    @Override // com.fyber.inneractive.sdk.dv.a, com.fyber.inneractive.sdk.d.g
    public final boolean d() {
        return this.d != 0;
    }

    @Override // com.fyber.inneractive.sdk.dv.a
    public final void a(AdRequest adRequest, com.fyber.inneractive.sdk.dv.c cVar) {
        super.a(adRequest, cVar);
        RewardedAd.load(l.p(), "FyberRewarded", adRequest, this.e);
    }
}
