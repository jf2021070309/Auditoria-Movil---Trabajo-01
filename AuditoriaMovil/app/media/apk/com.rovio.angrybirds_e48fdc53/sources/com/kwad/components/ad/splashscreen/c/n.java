package com.kwad.components.ad.splashscreen.c;

import android.os.SystemClock;
import android.view.ViewStub;
import android.widget.ImageView;
import android.widget.TextView;
import com.facebook.internal.FacebookRequestErrorClassification;
import com.kwad.components.ad.splashscreen.h;
import com.kwad.components.ad.splashscreen.widget.KsSplashSlidePathView;
import com.kwad.sdk.R;
import com.kwad.sdk.core.report.z;
import com.kwad.sdk.core.response.model.AdInfo;
import com.kwad.sdk.core.response.model.AdMatrixInfo;
import com.kwad.sdk.core.view.AdBaseFrameLayout;
import com.kwad.sdk.utils.bj;
import org.json.JSONObject;
/* loaded from: classes.dex */
public final class n extends e {
    private AdMatrixInfo.SplashSlideInfo DA;
    private TextView DB;
    private ImageView DC;
    private com.kwad.components.ad.splashscreen.widget.c DD;
    private KsSplashSlidePathView DE;
    private com.kwad.components.core.e.d.c DF;
    private double DG;
    private com.kwad.components.ad.splashscreen.f.a De;
    private TextView gS;
    private AdInfo mAdInfo;
    private AdBaseFrameLayout mRootContainer;
    private long mStartTime;

    /* JADX WARN: Removed duplicated region for block: B:17:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0071  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void initView() {
        /*
            r3 = this;
            com.kwad.sdk.core.response.model.AdInfo r0 = r3.mAdInfo
            com.kwad.sdk.core.response.model.AdMatrixInfo r0 = r0.adMatrixInfo
            com.kwad.sdk.core.response.model.AdMatrixInfo$AdDataV2 r0 = r0.adDataV2
            com.kwad.sdk.core.response.model.AdMatrixInfo$SplashInfo r0 = r0.splashInfo
            com.kwad.sdk.core.response.model.AdMatrixInfo$AdInteractionInfo r0 = r0.interactionInfo
            com.kwad.sdk.core.response.model.AdMatrixInfo$SplashSlideInfo r0 = r0.slideInfo
            r3.DA = r0
            int r0 = r0.convertDistance
            double r0 = (double) r0
            r3.DG = r0
            com.kwad.sdk.core.response.model.AdMatrixInfo$SplashSlideInfo r0 = r3.DA
            int r0 = r0.style
            com.kwad.components.ad.splashscreen.widget.c r1 = new com.kwad.components.ad.splashscreen.widget.c
            android.content.Context r2 = r3.getContext()
            r1.<init>(r2, r0)
            r3.DD = r1
            android.widget.ImageView r2 = r3.DC
            r2.setImageDrawable(r1)
            android.widget.ImageView r1 = r3.DC
            com.kwad.components.ad.splashscreen.c.n$3 r2 = new com.kwad.components.ad.splashscreen.c.n$3
            r2.<init>()
            r1.post(r2)
            com.kwad.sdk.core.response.model.AdMatrixInfo$SplashSlideInfo r1 = r3.DA
            java.lang.String r1 = r1.title
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 != 0) goto L45
            android.widget.TextView r0 = r3.gS
            com.kwad.sdk.core.response.model.AdMatrixInfo$SplashSlideInfo r1 = r3.DA
            java.lang.String r1 = r1.title
        L41:
            r0.setText(r1)
            goto L5d
        L45:
            if (r0 == 0) goto L58
            r1 = 1
            if (r0 == r1) goto L53
            r1 = 2
            if (r0 == r1) goto L4e
            goto L5d
        L4e:
            android.widget.TextView r0 = r3.gS
            java.lang.String r1 = "向右滑动"
            goto L41
        L53:
            android.widget.TextView r0 = r3.gS
            java.lang.String r1 = "向左滑动"
            goto L41
        L58:
            android.widget.TextView r0 = r3.gS
            java.lang.String r1 = "向上滑动"
            goto L41
        L5d:
            com.kwad.sdk.core.response.model.AdMatrixInfo$SplashSlideInfo r0 = r3.DA
            java.lang.String r0 = r0.subtitle
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L71
            android.widget.TextView r0 = r3.DB
            com.kwad.sdk.core.response.model.AdMatrixInfo$SplashSlideInfo r1 = r3.DA
            java.lang.String r1 = r1.subtitle
            r0.setText(r1)
            return
        L71:
            com.kwad.sdk.core.response.model.AdInfo r0 = r3.mAdInfo
            boolean r0 = com.kwad.sdk.core.response.b.a.ax(r0)
            if (r0 == 0) goto L8f
            com.kwad.components.ad.splashscreen.h r0 = r3.CS
            com.kwad.sdk.core.response.model.AdTemplate r0 = r0.mAdTemplate
            com.kwad.sdk.core.response.model.AdInfo r1 = r3.mAdInfo
            com.kwad.components.core.e.d.c r2 = r3.DF
            int r2 = r2.nA()
            java.lang.String r0 = com.kwad.components.ad.splashscreen.d.a(r0, r1, r2)
            android.widget.TextView r1 = r3.DB
            r1.setText(r0)
            return
        L8f:
            android.widget.TextView r0 = r3.DB
            java.lang.String r1 = "跳转详情页或者第三方应用"
            r0.setText(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.kwad.components.ad.splashscreen.c.n.initView():void");
    }

    private void lq() {
        com.kwad.components.ad.splashscreen.f.a aVar = this.De;
        if (aVar != null) {
            aVar.setAdTemplate(this.CS.mAdTemplate);
            return;
        }
        com.kwad.components.ad.splashscreen.f.a aVar2 = new com.kwad.components.ad.splashscreen.f.a(getContext(), this.CS.mAdTemplate) { // from class: com.kwad.components.ad.splashscreen.c.n.4
            @Override // com.kwad.components.ad.splashscreen.f.a
            public final void aa(String str) {
                n.this.DB.setText(str);
            }
        };
        this.De = aVar2;
        this.DF.b(aVar2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void lr() {
        if (this.DA != null) {
            z.b bVar = new z.b();
            bVar.cu(this.DA.style);
            com.kwad.sdk.core.report.a.a(this.CS.mAdTemplate, (int) FacebookRequestErrorClassification.EC_INVALID_TOKEN, bVar, (JSONObject) null);
            com.kwad.components.core.webview.b.d.a.se().aR(FacebookRequestErrorClassification.EC_INVALID_TOKEN);
        }
    }

    @Override // com.kwad.components.ad.splashscreen.c.e, com.kwad.sdk.mvp.Presenter
    public final void ah() {
        super.ah();
        if (this.CS == null) {
            return;
        }
        bj.postOnUiThread(new Runnable() { // from class: com.kwad.components.ad.splashscreen.c.n.2
            @Override // java.lang.Runnable
            public final void run() {
                n.this.CS.Cx = SystemClock.elapsedRealtime() - n.this.mStartTime;
            }
        });
        this.mAdInfo = com.kwad.sdk.core.response.b.d.ck(this.CS.mAdTemplate);
        this.DF = this.CS.mApkDownloadHelper;
        initView();
        if (com.kwad.sdk.core.response.b.a.ax(this.mAdInfo)) {
            lq();
        }
    }

    @Override // com.kwad.sdk.mvp.Presenter
    public final void onCreate() {
        super.onCreate();
        this.mStartTime = SystemClock.elapsedRealtime();
        ((ViewStub) findViewById(R.id.ksad_slide_layout)).inflate();
        this.gS = (TextView) findViewById(R.id.ksad_splash_slide_title);
        this.DB = (TextView) findViewById(R.id.ksad_splash_slide_actiontext);
        this.DC = (ImageView) findViewById(R.id.ksad_splash_slideView);
        this.mRootContainer = (AdBaseFrameLayout) findViewById(R.id.ksad_splash_root_container);
        KsSplashSlidePathView ksSplashSlidePathView = (KsSplashSlidePathView) ((ViewStub) findViewById(R.id.ksad_splash_slideTouchView)).inflate();
        this.DE = ksSplashSlidePathView;
        ksSplashSlidePathView.setOnSlideTouchListener(new KsSplashSlidePathView.a() { // from class: com.kwad.components.ad.splashscreen.c.n.1
            @Override // com.kwad.components.ad.splashscreen.widget.KsSplashSlidePathView.a
            public final void a(float f, float f2, float f3, float f4) {
                final float b = com.kwad.sdk.d.a.a.b(n.this.getContext(), (float) Math.sqrt(Math.pow(f3 - f, 2.0d) + Math.pow(f4 - f2, 2.0d)));
                if (b < n.this.DG || n.this.CS == null) {
                    return;
                }
                n.this.CS.a(1, n.this.getContext(), 153, 2, new h.a() { // from class: com.kwad.components.ad.splashscreen.c.n.1.1
                    @Override // com.kwad.components.ad.splashscreen.h.a
                    public final void b(com.kwad.sdk.core.report.j jVar) {
                        jVar.cn(n.this.DA.style);
                        jVar.co((int) b);
                    }
                });
            }

            @Override // com.kwad.components.ad.splashscreen.widget.KsSplashSlidePathView.a
            public final void ls() {
                if (!com.kwad.components.ad.splashscreen.h.m(n.this.mAdInfo) || n.this.CS == null) {
                    return;
                }
                n.this.CS.c(1, n.this.getContext(), 53, 2);
            }
        });
    }
}
