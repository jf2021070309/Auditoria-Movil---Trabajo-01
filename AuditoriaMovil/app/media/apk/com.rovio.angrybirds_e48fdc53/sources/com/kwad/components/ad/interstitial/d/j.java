package com.kwad.components.ad.interstitial.d;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import com.kwad.components.ad.interstitial.d.c;
import com.kwad.components.core.video.a;
import com.kwad.sdk.R;
import com.kwad.sdk.api.KsAdVideoPlayConfig;
import com.kwad.sdk.core.response.model.AdInfo;
import com.kwad.sdk.core.response.model.AdTemplate;
import com.kwad.sdk.widget.KSFrameLayout;
import java.util.Iterator;
import java.util.List;
import org.json.JSONObject;
/* loaded from: classes.dex */
public final class j extends b implements com.kwad.sdk.widget.c {
    private List<Integer> cr;
    private KsAdVideoPlayConfig dJ;
    private ImageView ew;
    private com.kwad.sdk.core.video.videoview.a ex;
    private KSFrameLayout jS;
    private KSFrameLayout jT;
    private c jh;
    private com.kwad.components.core.video.f le;
    protected AdInfo mAdInfo;
    private AdTemplate mAdTemplate;
    private com.kwad.components.core.e.d.c mApkDownloadHelper;
    protected Context mContext;
    private boolean mIsAudioEnable = false;
    private h kd = new h() { // from class: com.kwad.components.ad.interstitial.d.j.1
        @Override // com.kwad.components.ad.interstitial.d.h
        public final void dw() {
            try {
                j.this.le.setShowLandingPage(false);
                j.this.le.qA();
            } catch (Throwable th) {
            }
        }

        @Override // com.kwad.components.ad.interstitial.d.h
        public final void dx() {
            try {
                j.this.le.qC();
                j.this.le.setShowLandingPage(true);
            } catch (Throwable th) {
            }
        }
    };
    private final a.InterfaceC0212a eC = new a.InterfaceC0212a() { // from class: com.kwad.components.ad.interstitial.d.j.4
        /* JADX WARN: Removed duplicated region for block: B:15:0x002d  */
        @Override // com.kwad.components.core.video.a.InterfaceC0212a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final void a(int r6, com.kwad.sdk.utils.ac.a r7) {
            /*
                r5 = this;
                r0 = 2
                r1 = 1
                r2 = 0
                if (r6 == r1) goto L15
                if (r6 == r0) goto L12
                r3 = 3
                if (r6 == r3) goto Ld
                r6 = 108(0x6c, float:1.51E-43)
                goto L17
            Ld:
                r6 = 83
                r2 = r1
                r3 = r2
                goto L18
            L12:
                r6 = 82
                goto L17
            L15:
                r6 = 13
            L17:
                r3 = r0
            L18:
                com.kwad.sdk.core.report.z$b r4 = new com.kwad.sdk.core.report.z$b
                r4.<init>()
                r4.jK = r7
                r4.jI = r6
                com.kwad.components.ad.interstitial.d.j r6 = com.kwad.components.ad.interstitial.d.j.this
                com.kwad.components.ad.interstitial.d.j.e(r6)
                boolean r6 = com.kwad.sdk.utils.ai.IK()
                if (r6 == 0) goto L2d
                goto L2e
            L2d:
                r0 = r1
            L2e:
                r4.ati = r0
                com.kwad.components.core.e.d.a$a r6 = new com.kwad.components.core.e.d.a$a
                com.kwad.components.ad.interstitial.d.j r7 = com.kwad.components.ad.interstitial.d.j.this
                android.content.Context r7 = com.kwad.components.ad.interstitial.d.j.h(r7)
                r6.<init>(r7)
                com.kwad.components.ad.interstitial.d.j r7 = com.kwad.components.ad.interstitial.d.j.this
                com.kwad.sdk.core.response.model.AdTemplate r7 = com.kwad.components.ad.interstitial.d.j.c(r7)
                com.kwad.components.core.e.d.a$a r6 = r6.S(r7)
                com.kwad.components.ad.interstitial.d.j r7 = com.kwad.components.ad.interstitial.d.j.this
                com.kwad.components.core.e.d.c r7 = com.kwad.components.ad.interstitial.d.j.g(r7)
                com.kwad.components.core.e.d.a$a r6 = r6.b(r7)
                com.kwad.components.core.e.d.a$a r6 = r6.ao(r3)
                com.kwad.components.core.e.d.a$a r6 = r6.al(r2)
                com.kwad.components.core.e.d.a$a r6 = r6.an(r1)
                com.kwad.components.core.e.d.a$a r6 = r6.a(r4)
                com.kwad.components.ad.interstitial.d.j$4$1 r7 = new com.kwad.components.ad.interstitial.d.j$4$1
                r7.<init>()
                com.kwad.components.core.e.d.a$a r6 = r6.a(r7)
                com.kwad.components.core.e.d.a.a(r6)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.kwad.components.ad.interstitial.d.j.AnonymousClass4.a(int, com.kwad.sdk.utils.ac$a):void");
        }
    };

    private c.b a(View view, boolean z) {
        return new c.b(view.getContext()).k(z).a(this.jS.getTouchCoords()).y(3).z(85);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(long j) {
        int ceil = (int) Math.ceil(((float) j) / 1000.0f);
        List<Integer> list = this.cr;
        if (list == null || list.isEmpty()) {
            return;
        }
        Iterator<Integer> it = this.cr.iterator();
        while (it.hasNext()) {
            if (ceil >= it.next().intValue()) {
                com.kwad.sdk.core.report.a.a(this.mAdTemplate, ceil, (JSONObject) null);
                it.remove();
                return;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x007f, code lost:
        if (r0.a(r1, r3 * 1024, new com.kwad.sdk.core.network.a.a.C0256a()) != false) goto L28;
     */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0090 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0091  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void ec() {
        /*
            Method dump skipped, instructions count: 274
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.kwad.components.ad.interstitial.d.j.ec():void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void ed() {
        if (!this.jh.jm && this.jh.hB != null) {
            this.jh.hB.onAdClicked();
        }
        this.jh.jk = true;
        if (this.jh.jm) {
            return;
        }
        this.jh.cl();
    }

    @Override // com.kwad.sdk.widget.c
    public final void a(View view) {
        this.jh.a(a(view, true));
    }

    @Override // com.kwad.components.ad.interstitial.d.b, com.kwad.sdk.mvp.Presenter
    public final void ah() {
        super.ah();
        c cVar = (c) Gh();
        this.jh = cVar;
        this.dJ = cVar.dJ;
        AdTemplate adTemplate = this.jh.mAdTemplate;
        this.mAdTemplate = adTemplate;
        AdInfo ck = com.kwad.sdk.core.response.b.d.ck(adTemplate);
        this.mAdInfo = ck;
        this.cr = com.kwad.sdk.core.response.b.a.bd(ck);
        com.kwad.sdk.core.video.videoview.a aVar = this.jh.ex;
        this.ex = aVar;
        aVar.setTag(this.cr);
        com.kwad.components.core.video.f fVar = new com.kwad.components.core.video.f(this.mContext, this.mAdTemplate, this.ex);
        this.le = fVar;
        fVar.setDataFlowAutoStart(this.dJ.isDataFlowAutoStart());
        this.le.setAdClickListener(this.eC);
        this.le.qE();
        this.mApkDownloadHelper = this.jh.mApkDownloadHelper;
        ec();
        float dimension = getContext().getResources().getDimension(R.dimen.ksad_interstitial_card_radius);
        this.jT.setRadius(dimension, dimension, 0.0f, 0.0f);
        this.jh.a(this.kd);
    }

    @Override // com.kwad.sdk.widget.c
    public final void b(View view) {
        this.jh.a(a(view, false));
    }

    @Override // com.kwad.sdk.mvp.Presenter
    public final void onCreate() {
        super.onCreate();
        this.jS = (KSFrameLayout) getRootView().findViewById(R.id.ksad_container);
        this.jT = (KSFrameLayout) getRootView().findViewById(R.id.ksad_video_container);
        this.ew = (ImageView) getRootView().findViewById(R.id.ksad_video_first_frame_container);
        this.jT.setVisibility(4);
        this.mContext = getContext();
    }

    @Override // com.kwad.sdk.mvp.Presenter
    public final void onDestroy() {
        super.onDestroy();
    }

    @Override // com.kwad.sdk.mvp.Presenter
    public final void onUnbind() {
        super.onUnbind();
        this.jh.jr = null;
        this.jh.b(this.kd);
    }
}
