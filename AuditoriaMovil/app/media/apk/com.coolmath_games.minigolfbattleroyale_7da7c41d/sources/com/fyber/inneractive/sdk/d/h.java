package com.fyber.inneractive.sdk.d;

import android.text.TextUtils;
import com.fyber.inneractive.sdk.activities.InneractiveInternalBrowserActivity;
import com.fyber.inneractive.sdk.config.IAConfigManager;
import com.fyber.inneractive.sdk.config.enums.UnitDisplayType;
import com.fyber.inneractive.sdk.config.u;
import com.fyber.inneractive.sdk.config.y;
import com.fyber.inneractive.sdk.d.g;
import com.fyber.inneractive.sdk.external.ImpressionData;
import com.fyber.inneractive.sdk.external.InneractiveAdRenderer;
import com.fyber.inneractive.sdk.external.InneractiveAdRequest;
import com.fyber.inneractive.sdk.external.InneractiveAdSpot;
import com.fyber.inneractive.sdk.external.InneractiveAdViewEventsListenerWithImpressionData;
import com.fyber.inneractive.sdk.external.InneractiveFullscreenAdEventsListenerWithImpressionData;
import com.fyber.inneractive.sdk.external.InneractiveUnitController;
import com.fyber.inneractive.sdk.external.InneractiveUnitController.EventsListener;
import com.fyber.inneractive.sdk.h.ae;
import com.fyber.inneractive.sdk.h.n;
import com.fyber.inneractive.sdk.util.IAlog;
import com.fyber.inneractive.sdk.util.ab;
/* loaded from: classes.dex */
public abstract class h<AdContent extends g, EventsListener extends InneractiveUnitController.EventsListener> implements InneractiveInternalBrowserActivity.InternalBrowserListener, InneractiveAdRenderer {
    protected InneractiveAdSpot a;
    protected AdContent b;
    protected EventsListener c;
    private Runnable j;
    boolean d = false;
    protected boolean e = false;
    protected boolean f = false;
    private boolean h = false;
    private boolean i = false;
    protected boolean g = true;

    @Override // com.fyber.inneractive.sdk.external.InneractiveAdRenderer
    public boolean canRefreshAd() {
        return true;
    }

    public boolean q() {
        return false;
    }

    public int r() {
        return -1;
    }

    public int s() {
        return -1;
    }

    static /* synthetic */ boolean a(h hVar) {
        hVar.g = true;
        return true;
    }

    static /* synthetic */ Runnable b(h hVar) {
        hVar.j = null;
        return null;
    }

    @Override // com.fyber.inneractive.sdk.external.InneractiveAdRenderer
    public void initialize(InneractiveAdSpot inneractiveAdSpot) {
        this.a = inneractiveAdSpot;
        this.b = (AdContent) inneractiveAdSpot.getAdContent();
        this.c = (EventsListener) inneractiveAdSpot.getSelectedUnitController().getEventsListener();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Removed duplicated region for block: B:21:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00dd  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.fyber.inneractive.sdk.util.u.a a(android.content.Context r18, java.lang.String r19, com.fyber.inneractive.sdk.util.aj r20) {
        /*
            Method dump skipped, instructions count: 700
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.d.h.a(android.content.Context, java.lang.String, com.fyber.inneractive.sdk.util.aj):com.fyber.inneractive.sdk.util.u$a");
    }

    @Override // com.fyber.inneractive.sdk.activities.InneractiveInternalBrowserActivity.InternalBrowserListener
    public void onApplicationInBackground() {
        o();
        f_();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void f_() {
        this.i = false;
        this.h = false;
    }

    @Override // com.fyber.inneractive.sdk.activities.InneractiveInternalBrowserActivity.InternalBrowserListener
    public void onInternalBrowserDismissed() {
        IAlog.b("onInternalBrowserDismissed callback called", new Object[0]);
        if (this.d) {
            this.d = false;
            InneractiveInternalBrowserActivity.setInternalBrowserListener(null);
        }
        if (this.c != null) {
            IAlog.b("%sCalling external interface onAdWillCloseInternalBrowser", IAlog.a(this));
            this.c.onAdWillCloseInternalBrowser(this.a);
        }
        f_();
    }

    @Override // com.fyber.inneractive.sdk.external.InneractiveAdRenderer
    public void destroy() {
        if (this.d) {
            InneractiveInternalBrowserActivity.setInternalBrowserListener(null);
            this.d = false;
        }
        if (this.j != null) {
            com.fyber.inneractive.sdk.util.m.a().removeCallbacks(this.j);
            this.j = null;
        }
        this.b = null;
        this.c = null;
        this.a = null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void m() {
        com.fyber.inneractive.sdk.j.e f;
        if (this.f || this.c == null) {
            return;
        }
        IAlog.b("%sCalling external interface onAdImpression", IAlog.a(this));
        this.c.onAdImpression(this.a);
        AdContent adcontent = this.b;
        if (adcontent != null && (f = adcontent.f()) != null) {
            y n = IAConfigManager.n();
            if (n != null) {
                UnitDisplayType unitDisplayType = f.r;
                n.a(unitDisplayType, "LAST_DOMAIN_SHOWED", f.c());
                n.a(unitDisplayType, "LAST_APP_BUNDLE_ID", f.C);
                if (unitDisplayType != UnitDisplayType.REWARDED && f.v != null && f.v.getVideo() != null && f.v.getVideo().isSkippable()) {
                    n.a(unitDisplayType, "LAST_VAST_SKIPED");
                }
                n.a(unitDisplayType, "LAST_VAST_CLICKED_TYPE", "LAST_CLICKED");
            }
            ab m = IAConfigManager.m();
            u h = this.b.h();
            ImpressionData impressionData = f.v;
            if (h != null && m.a != null) {
                m.a.onImpression(h.b(), h.a(), impressionData);
            }
            EventsListener eventslistener = this.c;
            if (eventslistener instanceof InneractiveFullscreenAdEventsListenerWithImpressionData) {
                ((InneractiveFullscreenAdEventsListenerWithImpressionData) eventslistener).onAdImpression(this.a, f.v);
            } else if (eventslistener instanceof InneractiveAdViewEventsListenerWithImpressionData) {
                ((InneractiveAdViewEventsListenerWithImpressionData) eventslistener).onAdImpression(this.a, f.v);
            }
        }
        this.f = true;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void n() {
        com.fyber.inneractive.sdk.j.e f;
        if (this.c != null) {
            IAlog.b("%sCalling external interface onAdClicked", IAlog.a(this));
            this.c.onAdClicked(this.a);
        }
        AdContent adcontent = this.b;
        if (adcontent == null || (f = adcontent.f()) == null) {
            return;
        }
        IAConfigManager.n().a(f.r, "LAST_CLICKED", "1");
    }

    public final void o() {
        if (this.c != null) {
            IAlog.b("%sCalling external interface onAdWillOpenExternalApp", IAlog.a(this));
            this.c.onAdWillOpenExternalApp(this.a);
        }
        f_();
    }

    public final void a(String str) {
        if (this.h) {
            return;
        }
        this.h = true;
        com.fyber.inneractive.sdk.h.m mVar = com.fyber.inneractive.sdk.h.m.VAST_EVENT_COMPANION_CLICKED;
        AdContent adcontent = this.b;
        InneractiveAdRequest g = adcontent != null ? adcontent.g() : null;
        AdContent adcontent2 = this.b;
        com.fyber.inneractive.sdk.j.e f = adcontent2 != null ? adcontent2.f() : null;
        AdContent adcontent3 = this.b;
        n.a aVar = new n.a(mVar, g, f, adcontent3 != null ? adcontent3.i().b() : null);
        n.b bVar = new n.b();
        if (str == null) {
            str = "na";
        }
        aVar.a(bVar.a("mime", str));
        aVar.b(null);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void g_() {
        AdContent adcontent = this.b;
        if (adcontent == null || adcontent.f() == null) {
            return;
        }
        String str = this.b.f().t;
        if (TextUtils.isEmpty(str)) {
            return;
        }
        IAlog.a("%sfiring rewarded completion!", IAlog.a(this));
        IAlog.a(IAlog.b, "AD_REWARDED_COMPLETION", new Object[0]);
        b(str);
    }

    public final void b(final String str) {
        final long currentTimeMillis = System.currentTimeMillis();
        IAConfigManager.h().a(new ae(new com.fyber.inneractive.sdk.h.r<String>() { // from class: com.fyber.inneractive.sdk.d.h.2
            @Override // com.fyber.inneractive.sdk.h.r
            public final /* synthetic */ void a(String str2, Exception exc, boolean z) {
                String str3 = str2;
                IAlog.a(IAlog.b, "Hit Request - %s", str);
                IAlog.b("Hit Request: Hitting URL finished: %s", str);
                if (exc == null) {
                    IAlog.b("Hit Request: Hitting URL response code: %s", str3);
                } else {
                    IAlog.b("Hit Request: Hitting URL failed: %s", exc);
                }
                IAlog.b("Hit Request: Url hit took %s millis", Long.valueOf(System.currentTimeMillis() - currentTimeMillis));
            }
        }, str));
    }

    public final void a(InneractiveUnitController.AdDisplayError adDisplayError) {
        String simpleName = adDisplayError.getClass().getSimpleName();
        String message = adDisplayError.getMessage();
        AdContent adcontent = this.b;
        InneractiveAdRequest inneractiveAdRequest = adcontent != null ? adcontent.f : null;
        AdContent adcontent2 = this.b;
        com.fyber.inneractive.sdk.h.o.a(simpleName, message, inneractiveAdRequest, adcontent2 != null ? adcontent2.f() : null);
        if (this.c != null) {
            IAlog.b("%sCalling external interface onAdEnteredErrorState: %s", IAlog.a(this), adDisplayError.getMessage());
            this.c.onAdEnteredErrorState(this.a, adDisplayError);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static void a(int i, com.fyber.inneractive.sdk.a.a.a.b bVar) {
        IAConfigManager.n().a(bVar, i);
    }

    private boolean a() {
        AdContent adcontent = this.b;
        if (adcontent != null) {
            return adcontent.a_();
        }
        return true;
    }

    public final void a(com.fyber.inneractive.sdk.j.e eVar) {
        String str = eVar.n;
        if (str == null || str.trim().length() <= 0) {
            return;
        }
        IAlog.a("%sfiring impression!", IAlog.a(this));
        IAlog.a(IAlog.b, "AD_IMPRESSION", new Object[0]);
        b(str);
    }

    public final void b(com.fyber.inneractive.sdk.j.e eVar) {
        String str = eVar.o;
        if (str == null || str.trim().length() <= 0) {
            return;
        }
        IAlog.a(IAlog.b, "AD_CLICKED", new Object[0]);
        b(str);
    }
}
