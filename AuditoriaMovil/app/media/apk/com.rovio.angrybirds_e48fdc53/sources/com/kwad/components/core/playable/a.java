package com.kwad.components.core.playable;

import android.content.Context;
import android.os.Build;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import com.kwad.components.core.e.d.a;
import com.kwad.components.core.e.d.c;
import com.kwad.components.core.webview.b.a.f;
import com.kwad.components.core.webview.jshandler.ae;
import com.kwad.components.core.webview.jshandler.ak;
import com.kwad.components.core.webview.jshandler.ap;
import com.kwad.components.core.webview.jshandler.ax;
import com.kwad.components.core.webview.jshandler.j;
import com.kwad.components.core.webview.jshandler.y;
import com.kwad.components.core.webview.jshandler.z;
import com.kwad.sdk.core.config.d;
import com.kwad.sdk.core.report.z;
import com.kwad.sdk.core.response.model.AdTemplate;
import com.kwad.sdk.core.view.AdBaseFrameLayout;
import com.kwad.sdk.core.webview.KsAdWebView;
import com.kwad.sdk.core.webview.b;
import com.kwad.sdk.utils.bj;
import java.lang.ref.WeakReference;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
/* loaded from: classes.dex */
public final class a implements j {
    private final KsAdWebView Pf;
    private long Pg;
    private int Ph;
    private PlayableSource Pi = PlayableSource.UNKNOWN_TRYPLAY_ENTRY_SOURCE;
    private List<ak.b> Pj = new CopyOnWriteArrayList();
    private List<KsAdWebView.d> Pk = new CopyOnWriteArrayList();
    private com.kwad.components.core.webview.a cD;
    private ap cG;
    private AdTemplate mAdTemplate;
    private c mApkDownloadHelper;
    private Context mContext;
    private AdBaseFrameLayout mRootContainer;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.kwad.components.core.playable.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static class C0210a implements ax.b {
        private final WeakReference<a> Pm;

        public C0210a(a aVar) {
            this.Pm = new WeakReference<>(aVar);
        }

        @Override // com.kwad.components.core.webview.jshandler.ax.b
        public final void P(int i) {
            a aVar = this.Pm.get();
            if (aVar != null) {
                aVar.az(i);
            }
        }
    }

    public a(KsAdWebView ksAdWebView) {
        this.Pf = ksAdWebView;
        ksAdWebView.setOnTouchListener(new View.OnTouchListener() { // from class: com.kwad.components.core.playable.a.1
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                if (motionEvent.getAction() == 0) {
                    a.this.Pg = SystemClock.elapsedRealtime();
                    a.this.Pf.getClientConfig().bk(true);
                    return false;
                }
                return false;
            }
        });
        ksAdWebView.setClientConfig(ksAdWebView.getClientConfig().cC(this.mAdTemplate).b(dd()));
        a(ksAdWebView);
    }

    private static void a(KsAdWebView ksAdWebView) {
        if (Build.VERSION.SDK_INT < 17 || !d.zK()) {
            return;
        }
        ksAdWebView.getSettings().setMediaPlaybackRequiresUserGesture(false);
    }

    private void a(b bVar, com.kwad.components.core.webview.a aVar, c cVar) {
        aVar.a(new ax(bVar, cVar, new C0210a(this)));
        aVar.a(new ak(new ak.b() { // from class: com.kwad.components.core.playable.a.3
            @Override // com.kwad.components.core.webview.jshandler.ak.b
            public final void a(ak.a aVar2) {
                a.this.Ph = aVar2.status;
                if (aVar2.status == 1 && a.this.mAdTemplate != null) {
                    com.kwad.sdk.core.report.a.aI(a.this.mAdTemplate);
                }
                for (ak.b bVar2 : a.this.Pj) {
                    bVar2.a(aVar2);
                }
            }
        }, getUrl()));
        aVar.a(new ae(bVar));
        this.cG = new ap();
        aVar.a(new z());
        aVar.a(new y(bVar));
        aVar.a(new f());
        aVar.a(this.cG);
        aVar.a(new com.kwad.components.core.webview.jshandler.f(this));
    }

    private void ay() {
        com.kwad.components.core.webview.a aVar = this.cD;
        if (aVar != null) {
            aVar.destroy();
            this.cD = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void az(int i) {
        if (getAdTemplate() == null) {
            return;
        }
        long zL = d.zL();
        if (zL <= 0 || SystemClock.elapsedRealtime() - this.Pg <= zL) {
            z.b bVar = new z.b();
            bVar.jI = i;
            bVar.jK = this.mRootContainer.getTouchCoords();
            com.kwad.components.core.e.d.a.a(new a.C0197a(this.mContext).S(this.mAdTemplate).b(this.mApkDownloadHelper).al(false).a(bVar).an(true));
        }
    }

    private KsAdWebView.d dd() {
        return new KsAdWebView.d() { // from class: com.kwad.components.core.playable.a.2
            @Override // com.kwad.sdk.core.webview.KsAdWebView.d
            public final void onPageFinished() {
                for (KsAdWebView.d dVar : a.this.Pk) {
                    dVar.onPageFinished();
                }
            }

            @Override // com.kwad.sdk.core.webview.KsAdWebView.d
            public final void onPageStart() {
                for (KsAdWebView.d dVar : a.this.Pk) {
                    dVar.onPageStart();
                }
            }

            @Override // com.kwad.sdk.core.webview.KsAdWebView.d
            public final void onReceivedHttpError(int i, String str, String str2) {
                for (KsAdWebView.d dVar : a.this.Pk) {
                    dVar.onReceivedHttpError(i, str, str2);
                }
            }
        };
    }

    private AdTemplate getAdTemplate() {
        return this.mAdTemplate;
    }

    private String getUrl() {
        AdTemplate adTemplate = this.mAdTemplate;
        return adTemplate == null ? "" : com.kwad.sdk.core.response.b.a.bB(com.kwad.sdk.core.response.b.d.ck(adTemplate));
    }

    private void oY() {
        if (com.kwad.sdk.core.response.b.a.bx(com.kwad.sdk.core.response.b.d.ck(this.mAdTemplate)) > 0) {
            bj.runOnUiThreadDelay(new Runnable() { // from class: com.kwad.components.core.playable.a.4
                @Override // java.lang.Runnable
                public final void run() {
                    a.this.Pf.getClientConfig().bk(true);
                }
            }, com.kwad.sdk.core.response.b.a.bx(com.kwad.sdk.core.response.b.d.ck(this.mAdTemplate)));
        }
        if (com.kwad.sdk.core.response.b.a.bx(com.kwad.sdk.core.response.b.d.ck(this.mAdTemplate)) == 0) {
            this.Pf.getClientConfig().bk(true);
        }
        if (com.kwad.sdk.core.response.b.a.bZ(com.kwad.sdk.core.response.b.d.ck(this.mAdTemplate)) > 0) {
            this.Pf.getClientConfig().bk(this.mAdTemplate.converted);
        }
    }

    public final void a(ak.b bVar) {
        this.Pj.add(bVar);
    }

    @Override // com.kwad.components.core.webview.jshandler.j
    public final void a(com.kwad.components.core.webview.jshandler.f fVar, String str) {
        AdTemplate adTemplate;
        if ("playableSrc".equals(str)) {
            fVar.f(this.Pi);
        }
        if (!"getAdType".equals(str) || (adTemplate = this.mAdTemplate) == null) {
            return;
        }
        fVar.aM(adTemplate.adStyle);
    }

    public final void a(AdTemplate adTemplate, AdBaseFrameLayout adBaseFrameLayout, c cVar) {
        if (this.Pf == null) {
            com.kwad.sdk.core.e.c.w("PlayableViewHelper", "registerJsBridge mPlayableView is null");
            return;
        }
        this.mContext = adBaseFrameLayout.getContext();
        this.mRootContainer = adBaseFrameLayout;
        this.mAdTemplate = adTemplate;
        this.mApkDownloadHelper = cVar;
        this.Ph = -1;
        b bVar = new b();
        bVar.setAdTemplate(adTemplate);
        bVar.mScreenOrientation = 0;
        bVar.aym = this.mRootContainer;
        bVar.MZ = this.mRootContainer;
        bVar.My = this.Pf;
        ay();
        com.kwad.components.core.webview.a aVar = new com.kwad.components.core.webview.a(this.Pf);
        this.cD = aVar;
        a(bVar, aVar, cVar);
        this.Pf.addJavascriptInterface(this.cD, "KwaiAd");
    }

    public final void a(KsAdWebView.d dVar) {
        this.Pk.add(dVar);
    }

    public final void b(ak.b bVar) {
        this.Pj.remove(bVar);
    }

    public final void e(PlayableSource playableSource) {
        if (playableSource != null) {
            this.Pi = playableSource;
        }
        if (this.Pf == null) {
            return;
        }
        oY();
        com.kwad.sdk.core.e.c.d("PlayableViewHelper", "showPlayable");
        ap apVar = this.cG;
        if (apVar != null) {
            apVar.rC();
        }
        this.Pf.setVisibility(0);
        ap apVar2 = this.cG;
        if (apVar2 != null) {
            apVar2.rD();
        }
    }

    public final long getLoadTime() {
        KsAdWebView ksAdWebView = this.Pf;
        if (ksAdWebView != null) {
            return ksAdWebView.getLoadTime();
        }
        return -1L;
    }

    public final void hJ() {
        com.kwad.sdk.core.e.c.d("PlayableViewHelper", "showPlayable");
        if (this.Pf == null) {
            return;
        }
        ap apVar = this.cG;
        if (apVar != null) {
            apVar.rE();
        }
        this.Pf.setVisibility(8);
        ap apVar2 = this.cG;
        if (apVar2 != null) {
            apVar2.rF();
        }
        this.Pf.reload();
    }

    public final void px() {
        com.kwad.components.core.webview.a aVar = this.cD;
        if (aVar != null) {
            aVar.destroy();
            this.cD = null;
        }
    }

    public final void py() {
        KsAdWebView ksAdWebView;
        if (this.mAdTemplate == null || (ksAdWebView = this.Pf) == null) {
            return;
        }
        ksAdWebView.getClientConfig().bk(false);
        String url = getUrl();
        if (!TextUtils.isEmpty(url)) {
            this.Pf.loadUrl(url);
        }
        com.kwad.sdk.core.report.a.aJ(this.mAdTemplate);
    }

    public final boolean pz() {
        return this.Pf != null && this.Ph == 1;
    }
}
