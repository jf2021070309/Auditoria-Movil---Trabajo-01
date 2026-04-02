package com.fyber.inneractive.sdk.external;

import android.app.Activity;
import com.fyber.inneractive.sdk.activities.InneractiveFullscreenAdActivity;
import com.fyber.inneractive.sdk.c.a;
import com.fyber.inneractive.sdk.c.d;
import com.fyber.inneractive.sdk.config.enums.UnitDisplayType;
import com.fyber.inneractive.sdk.config.o;
import com.fyber.inneractive.sdk.config.u;
import com.fyber.inneractive.sdk.config.w;
import com.fyber.inneractive.sdk.d.g;
import com.fyber.inneractive.sdk.d.j;
import com.fyber.inneractive.sdk.d.p;
import com.fyber.inneractive.sdk.e.c;
import com.fyber.inneractive.sdk.external.InneractiveUnitController;
import com.fyber.inneractive.sdk.h.m;
import com.fyber.inneractive.sdk.h.n;
import com.fyber.inneractive.sdk.util.IAlog;
import com.fyber.inneractive.sdk.util.q;
/* loaded from: classes.dex */
public class InneractiveFullscreenUnitController extends p<InneractiveFullscreenAdEventsListener> implements InneractiveFullscreenAdActivity.FullScreenRendererProvider, InneractiveFullscreenAdActivity.OnInneractiveFullscreenAdDestroyListener {
    private InneractiveFullScreenAdRewardedListener b;
    protected c mRenderer;
    private boolean a = false;
    private final c.b c = new c.b() { // from class: com.fyber.inneractive.sdk.external.InneractiveFullscreenUnitController.1
        @Override // com.fyber.inneractive.sdk.e.c.b
        public final void a() {
            j jVar = (j) q.a(InneractiveFullscreenUnitController.this.mAdSpot);
            if (InneractiveFullscreenUnitController.this.b == null || jVar == null) {
                return;
            }
            InneractiveFullscreenUnitController.this.b.onAdRewarded(jVar);
        }
    };

    @Override // com.fyber.inneractive.sdk.d.p
    public boolean supportsRefresh() {
        return false;
    }

    @Override // com.fyber.inneractive.sdk.d.p
    public boolean supports(InneractiveAdSpot inneractiveAdSpot) {
        u h = inneractiveAdSpot.getAdContent().h();
        if (h.d() != null) {
            return false;
        }
        o h2 = h.h();
        if (h2 == null || !UnitDisplayType.INTERSTITIAL.equals(h2.a())) {
            w g = h.g();
            return g != null && (UnitDisplayType.REWARDED.equals(g.h()) || UnitDisplayType.INTERSTITIAL.equals(g.h()) || UnitDisplayType.VERTICAL.equals(g.h()));
        }
        return true;
    }

    public boolean isAvailable() {
        j jVar = (j) q.a(this.mAdSpot);
        return jVar != null && jVar.isReady();
    }

    @Override // com.fyber.inneractive.sdk.activities.InneractiveFullscreenAdActivity.FullScreenRendererProvider
    public c getFullscreenRenderer() {
        return this.mRenderer;
    }

    public void show(Activity activity) {
        if (activity == null) {
            IAlog.d("show() called with a null activity", new Object[0]);
        } else if (!this.a) {
            InneractiveAdSpot adSpot = getAdSpot();
            if (adSpot == null) {
                IAlog.d("InneractiveFullscreenUnitController was not attached to an ad spot", new Object[0]);
                return;
            }
            g adContent = adSpot.getAdContent();
            if (adContent != null) {
                new n.a(m.IA_PUBLISHER_REQUESTED_SHOW, adContent.g(), adContent.f(), adContent.i().b()).b(null);
            }
            if (!adSpot.isReady()) {
                if (this.mEventsListener != 0) {
                    ((InneractiveFullscreenAdEventsListener) this.mEventsListener).onAdEnteredErrorState(adSpot, new AdExpiredError("Ad Expired"));
                    return;
                }
                return;
            }
            if (this.mRenderer == null) {
                this.mRenderer = d.b.a.a(getAdSpot());
            }
            selectContentController();
            a.a(adContent).a(activity, adSpot, adSpot.getLocalUniqueId());
            this.a = true;
            c cVar = this.mRenderer;
            if (cVar != null) {
                cVar.a(this.c);
            }
        } else {
            IAlog.d("InneractiveFullscreenUnitController->show(android.content.Context) called while an ad is already showing", new Object[0]);
        }
    }

    /* loaded from: classes.dex */
    public static class AdExpiredError extends InneractiveUnitController.AdDisplayError {
        AdExpiredError(String str) {
            super(str);
        }
    }

    @Override // com.fyber.inneractive.sdk.d.p, com.fyber.inneractive.sdk.external.InneractiveUnitController
    public void destroy() {
        c cVar = this.mRenderer;
        if (cVar != null) {
            cVar.destroy();
            this.mRenderer = null;
        }
        super.destroy();
    }

    @Override // com.fyber.inneractive.sdk.activities.InneractiveFullscreenAdActivity.OnInneractiveFullscreenAdDestroyListener
    public void onActivityDestroyed(InneractiveFullscreenAdActivity inneractiveFullscreenAdActivity) {
        this.a = false;
    }

    public InneractiveFullScreenAdRewardedListener getRewardedListener() {
        return this.b;
    }

    public void setRewardedListener(InneractiveFullScreenAdRewardedListener inneractiveFullScreenAdRewardedListener) {
        this.b = inneractiveFullScreenAdRewardedListener;
    }
}
