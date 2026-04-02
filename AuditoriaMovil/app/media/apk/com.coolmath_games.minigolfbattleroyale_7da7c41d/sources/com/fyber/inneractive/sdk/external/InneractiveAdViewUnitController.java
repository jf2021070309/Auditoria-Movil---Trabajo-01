package com.fyber.inneractive.sdk.external;

import android.view.View;
import android.view.ViewGroup;
import com.fyber.inneractive.sdk.activities.InneractiveFullscreenAdActivity;
import com.fyber.inneractive.sdk.c.b;
import com.fyber.inneractive.sdk.c.d;
import com.fyber.inneractive.sdk.config.enums.UnitDisplayType;
import com.fyber.inneractive.sdk.config.o;
import com.fyber.inneractive.sdk.config.u;
import com.fyber.inneractive.sdk.config.w;
import com.fyber.inneractive.sdk.d.i;
import com.fyber.inneractive.sdk.d.n;
import com.fyber.inneractive.sdk.d.p;
import com.fyber.inneractive.sdk.e.b;
import com.fyber.inneractive.sdk.e.c;
import com.fyber.inneractive.sdk.util.IAlog;
import com.fyber.inneractive.sdk.util.q;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
/* loaded from: classes.dex */
public class InneractiveAdViewUnitController extends p<InneractiveAdViewEventsListener> implements InneractiveFullscreenAdActivity.FullScreenRendererProvider, i.a {
    public static final int DISABLED_REFRESH_INTERVAL = -1;
    Set<InneractiveAdRenderer> a;
    boolean b;
    private View c;
    private int d;
    protected int mAdContentHeight;
    protected int mAdContentWidth;

    @Override // com.fyber.inneractive.sdk.d.p
    public boolean supportsRefresh() {
        return true;
    }

    public InneractiveAdViewUnitController() {
        this.b = false;
        this.mAdContentWidth = -1;
        this.mAdContentHeight = -1;
        this.d = 0;
        this.a = new HashSet();
    }

    public InneractiveAdViewUnitController(int i) {
        this();
        if (i >= 30) {
            IAlog.b("InneractiveAdViewUnitController: Overriding remote config refresh interval to: %d", Integer.valueOf(i));
            this.d = i;
            return;
        }
        IAlog.b("InneractiveAdViewUnitController: Overriding remote config refresh interval - value too low. Setting to default: %d -> %d", Integer.valueOf(i), 30);
        this.d = 30;
    }

    public InneractiveAdViewUnitController(boolean z) {
        this();
        if (z) {
            this.d = -1;
        }
    }

    @Override // com.fyber.inneractive.sdk.d.p
    public boolean supports(InneractiveAdSpot inneractiveAdSpot) {
        u h = inneractiveAdSpot.getAdContent().h();
        if (h.d() != null) {
            return false;
        }
        o h2 = h.h();
        if (h2 != null) {
            if (UnitDisplayType.BANNER.equals(h2.a()) || UnitDisplayType.MRECT.equals(h2.a())) {
                return true;
            }
            if (UnitDisplayType.INTERSTITIAL.equals(h2.a())) {
                return !inneractiveAdSpot.getCurrentProcessedRequest().getAllowFullscreen();
            }
        }
        w g = h.g();
        return g != null && (UnitDisplayType.LANDSCAPE.equals(g.h()) || UnitDisplayType.SQUARE.equals(g.h()) || UnitDisplayType.MRECT.equals(g.h()));
    }

    @Override // com.fyber.inneractive.sdk.activities.InneractiveFullscreenAdActivity.FullScreenRendererProvider
    public c getFullscreenRenderer() {
        c a = d.b.a.a((InneractiveAdSpot) q.a(this.mAdSpot));
        this.a.add(a);
        return a;
    }

    @Override // com.fyber.inneractive.sdk.d.p, com.fyber.inneractive.sdk.external.InneractiveUnitController
    public InneractiveContentController getSelectedContentController() {
        return this.mSelectedContentController;
    }

    @Override // com.fyber.inneractive.sdk.d.p, com.fyber.inneractive.sdk.external.InneractiveUnitController
    public void destroy() {
        this.b = true;
        for (InneractiveAdRenderer inneractiveAdRenderer : new HashSet(this.a)) {
            inneractiveAdRenderer.destroy();
        }
        this.a.clear();
        this.c = null;
        super.destroy();
    }

    public void bindView(ViewGroup viewGroup) {
        IAlog.b("%sPPPP bindView called with parent: %s", logPrefix(), viewGroup);
        InneractiveAdSpot adSpot = getAdSpot();
        if (adSpot == null) {
            IAlog.d("InneractiveFullscreenUnitController was not attached to an ad spot", new Object[0]);
            return;
        }
        IAlog.b("%sPPPP bindView spot is %s", logPrefix(), adSpot);
        for (InneractiveAdRenderer inneractiveAdRenderer : new HashSet(this.a)) {
            if (inneractiveAdRenderer instanceof b) {
                b bVar = (b) inneractiveAdRenderer;
                if (bVar.a((View) viewGroup)) {
                    bVar.d();
                    IAlog.b("%sPPPP bindAdToRenderer returning an already attached renderer %s", logPrefix(), bVar);
                    return;
                }
            }
        }
        this.c = viewGroup;
        b a = b.C0039b.a.a(adSpot);
        int i = this.d;
        if (i != 0) {
            a.a(i);
        }
        if (a == null) {
            IAlog.d("%sCould not find a renderer for the given spot! Did you add the appropriate module to your project?", logPrefix());
            return;
        }
        a.initialize(adSpot);
        selectContentController();
        a.a(viewGroup);
        this.a.add(a);
        IAlog.b("%sPPPP bindView created renderer %s", logPrefix(), a);
    }

    public void unbindView(View view) {
        if (this.c != view) {
            IAlog.d("%s unbindView invoked with incorrect view, was - %s received - %s", logPrefix(), this.c, view);
        } else {
            this.c = null;
        }
        IAlog.b("%sPPPP unbindView called with %s", logPrefix(), view);
        IAlog.b("%sPPPP spot is %s", logPrefix(), this.mAdSpot);
        for (InneractiveAdRenderer inneractiveAdRenderer : new HashSet(this.a)) {
            if (inneractiveAdRenderer instanceof com.fyber.inneractive.sdk.e.b) {
                com.fyber.inneractive.sdk.e.b bVar = (com.fyber.inneractive.sdk.e.b) inneractiveAdRenderer;
                if (bVar.a(view)) {
                    IAlog.b("%sPPPP unbindView unbinding renderer %s", logPrefix(), inneractiveAdRenderer);
                    bVar.e();
                    this.a.remove(bVar);
                    return;
                }
            }
        }
    }

    public void refreshAd() {
        IAlog.b("InneractiveFullscreenUnitController refreshAd called", new Object[0]);
        InneractiveAdSpot inneractiveAdSpot = (InneractiveAdSpot) q.a(this.mAdSpot);
        if (inneractiveAdSpot == null || !(inneractiveAdSpot instanceof n)) {
            return;
        }
        ((n) inneractiveAdSpot).a(this);
    }

    @Override // com.fyber.inneractive.sdk.d.i.a
    public void onAdRefreshed(InneractiveAdSpot inneractiveAdSpot) {
        com.fyber.inneractive.sdk.e.b bVar;
        Iterator it = new HashSet(this.a).iterator();
        while (true) {
            if (!it.hasNext()) {
                bVar = null;
                break;
            }
            InneractiveAdRenderer inneractiveAdRenderer = (InneractiveAdRenderer) it.next();
            if (inneractiveAdRenderer instanceof com.fyber.inneractive.sdk.e.b) {
                bVar = (com.fyber.inneractive.sdk.e.b) inneractiveAdRenderer;
                if (bVar.a(inneractiveAdSpot.getAdContent())) {
                    break;
                }
            }
        }
        if (bVar != null) {
            bVar.a((ViewGroup) null);
        } else {
            onAdRefreshFailed(inneractiveAdSpot, InneractiveErrorCode.SDK_INTERNAL_ERROR);
        }
        try {
            if (inneractiveAdSpot instanceof i) {
                IAlog.a(IAlog.b, "%s %s", "AD_REFRESH", ((i) inneractiveAdSpot).g.c.f.k());
            }
        } catch (Exception unused) {
        }
        IAlog.b("InneractiveFullscreenUnitController onAdRefreshed called", new Object[0]);
    }

    @Override // com.fyber.inneractive.sdk.d.i.a
    public void onAdRefreshFailed(InneractiveAdSpot inneractiveAdSpot, InneractiveErrorCode inneractiveErrorCode) {
        for (InneractiveAdRenderer inneractiveAdRenderer : new HashSet(this.a)) {
            if (inneractiveAdRenderer instanceof com.fyber.inneractive.sdk.e.b) {
                ((com.fyber.inneractive.sdk.e.b) inneractiveAdRenderer).c();
                return;
            }
        }
    }

    public void unbindFullscreenRenderer(c cVar) {
        IAlog.b("%sremoving full screen ad renderer %s", logPrefix(), cVar);
        Set<InneractiveAdRenderer> set = this.a;
        if (set != null) {
            set.remove(cVar);
        }
        if (this.b) {
            return;
        }
        for (InneractiveAdRenderer inneractiveAdRenderer : new HashSet(this.a)) {
            if (inneractiveAdRenderer instanceof com.fyber.inneractive.sdk.e.b) {
                ((com.fyber.inneractive.sdk.e.b) inneractiveAdRenderer).f();
                if (this.mEventsListener != 0 && this.mAdSpot != null && this.mAdSpot.get() != null) {
                    ((InneractiveAdViewEventsListener) this.mEventsListener).onAdCollapsed(this.mAdSpot.get());
                }
            }
        }
    }

    @Override // com.fyber.inneractive.sdk.d.p
    public boolean canRefreshAd() {
        if (supportsRefresh()) {
            for (InneractiveAdRenderer inneractiveAdRenderer : this.a) {
                if (!inneractiveAdRenderer.canRefreshAd()) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }

    public int getAdContentWidth() {
        int g;
        for (InneractiveAdRenderer inneractiveAdRenderer : this.a) {
            if ((inneractiveAdRenderer instanceof com.fyber.inneractive.sdk.e.b) && (g = ((com.fyber.inneractive.sdk.e.b) inneractiveAdRenderer).g()) > 0) {
                return g;
            }
        }
        return this.mAdContentWidth;
    }

    public int getAdContentHeight() {
        int h;
        for (InneractiveAdRenderer inneractiveAdRenderer : this.a) {
            if ((inneractiveAdRenderer instanceof com.fyber.inneractive.sdk.e.b) && (h = ((com.fyber.inneractive.sdk.e.b) inneractiveAdRenderer).h()) > 0) {
                return h;
            }
        }
        return this.mAdContentHeight;
    }
}
