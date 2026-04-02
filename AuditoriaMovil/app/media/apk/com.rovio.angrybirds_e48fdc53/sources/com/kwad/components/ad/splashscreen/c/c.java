package com.kwad.components.ad.splashscreen.c;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.kwad.components.ad.splashscreen.local.SplashSkipViewModel;
import com.kwad.components.ad.splashscreen.widget.SkipView;
import com.kwad.sdk.R;
import com.kwad.sdk.core.report.z;
import com.kwad.sdk.core.response.model.AdInfo;
import com.kwad.sdk.utils.bc;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: classes.dex */
public final class c extends e implements com.kwad.sdk.core.h.c {
    private TextView CK;
    private com.kwad.components.ad.splashscreen.widget.a CL;
    private AdInfo.AdPreloadInfo CM;
    private boolean CN = false;
    private View CO;
    private AdInfo sd;

    private void a(ViewGroup viewGroup, AdInfo adInfo) {
        this.CK = (TextView) viewGroup.findViewById(R.id.ksad_splash_preload_tips);
        AdInfo.AdPreloadInfo adPreloadInfo = adInfo.adPreloadInfo;
        this.CM = adPreloadInfo;
        if (adPreloadInfo == null || bc.isNullString(adPreloadInfo.preloadTips)) {
            this.CK.setVisibility(8);
            return;
        }
        this.CK.setVisibility(0);
        this.CK.setText(this.CM.preloadTips);
    }

    private SplashSkipViewModel kS() {
        SplashSkipViewModel splashSkipViewModel = new SplashSkipViewModel();
        int i = this.sd.adSplashInfo.imageDisplaySecond <= 0 ? 5 : this.sd.adSplashInfo.imageDisplaySecond;
        int min = Math.min(this.sd.adSplashInfo.videoDisplaySecond, com.kwad.sdk.core.response.b.a.G(this.sd));
        if (com.kwad.sdk.core.response.b.a.aU(this.sd)) {
            i = min;
        }
        splashSkipViewModel.skipSecond = i;
        return splashSkipViewModel;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void kT() {
        this.CS.kK();
        JSONObject jSONObject = new JSONObject();
        if (this.CS.Ch != null) {
            try {
                jSONObject.put("duration", this.CS.Ch.getCurrentPosition());
            } catch (JSONException e) {
                com.kwad.sdk.core.e.c.printStackTrace(e);
            }
        }
        z.a aVar = new z.a();
        if (this.CS.mTimerHelper != null) {
            aVar.duration = this.CS.mTimerHelper.getTime();
        }
        com.kwad.sdk.core.report.a.b(this.CS.mAdTemplate, new com.kwad.sdk.core.report.j().ch(1).cm(22).a(aVar), jSONObject);
    }

    private synchronized void kV() {
        if (!this.CN && this.CL != null) {
            if (com.kwad.sdk.core.response.b.a.ci(this.sd) && com.kwad.sdk.core.response.b.a.cj(this.sd)) {
                com.kwad.sdk.core.report.a.b(this.CS.mAdTemplate, 124, (JSONObject) null);
                this.CN = true;
            }
        }
    }

    private static boolean r(AdInfo adInfo) {
        return !com.kwad.sdk.core.response.b.a.cg(adInfo);
    }

    private void s(AdInfo adInfo) {
        this.CO = this.CS.mRootContainer.findViewById(R.id.ksad_skip_view_area);
        if (!com.kwad.sdk.core.response.b.a.ch(adInfo) || adInfo.adSplashInfo.skipButtonPosition != 0) {
            this.CO.setVisibility(8);
            return;
        }
        this.CO.setVisibility(0);
        this.CO.setOnClickListener(new View.OnClickListener() { // from class: com.kwad.components.ad.splashscreen.c.c.2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                c.this.kT();
            }
        });
        this.CO.post(new Runnable() { // from class: com.kwad.components.ad.splashscreen.c.c.3
            @Override // java.lang.Runnable
            public final void run() {
                ((View) c.this.CL).post(new Runnable() { // from class: com.kwad.components.ad.splashscreen.c.c.3.1
                    @Override // java.lang.Runnable
                    public final void run() {
                        int ac = c.this.CL.ac(35);
                        ViewGroup.LayoutParams layoutParams = c.this.CO.getLayoutParams();
                        layoutParams.width = ac + com.kwad.sdk.d.a.a.a(c.this.CS.mRootContainer.getContext(), 66.0f);
                        c.this.CO.setLayoutParams(layoutParams);
                    }
                });
            }
        });
    }

    @Override // com.kwad.sdk.core.h.c
    public final void aK() {
        com.kwad.sdk.core.e.c.d("SkipAdPresenter", "onPageVisible");
        this.CL.x(this.sd);
        kV();
    }

    @Override // com.kwad.sdk.core.h.c
    public final void aL() {
        com.kwad.sdk.core.e.c.d("SkipAdPresenter", "onPageInvisible");
        this.CL.w(this.sd);
    }

    @Override // com.kwad.components.ad.splashscreen.c.e, com.kwad.sdk.mvp.Presenter
    public final void ah() {
        super.ah();
        com.kwad.sdk.core.e.c.d("SkipAdPresenter", "onBind");
        this.sd = com.kwad.sdk.core.response.b.d.ck(this.CS.mAdTemplate);
        ViewGroup p = this.CS.p(this.sd);
        a(p, this.sd);
        this.CL = (com.kwad.components.ad.splashscreen.widget.a) p.findViewById(r(this.sd) ? R.id.ksad_splash_skip_view : R.id.ksad_splash_circle_skip_view);
        this.CL.a(kS(), this.sd);
        this.CL.setOnViewListener(new SkipView.a() { // from class: com.kwad.components.ad.splashscreen.c.c.1
            @Override // com.kwad.components.ad.splashscreen.widget.SkipView.a
            public final void Z(int i) {
                c.this.CS.Y(i);
            }

            @Override // com.kwad.components.ad.splashscreen.widget.SkipView.a
            public final void kW() {
                c.this.kT();
            }

            @Override // com.kwad.components.ad.splashscreen.widget.SkipView.a
            public final void kX() {
                c.this.kU();
            }
        });
        s(this.sd);
        this.CS.Cj.a(this);
    }

    public final void kU() {
        this.CS.mRootContainer.post(new Runnable() { // from class: com.kwad.components.ad.splashscreen.c.c.4
            @Override // java.lang.Runnable
            public final void run() {
                if (com.kwad.components.core.e.c.b.nd()) {
                    c.this.CS.mRootContainer.postDelayed(this, 1000L);
                } else {
                    c.this.CS.kI();
                }
            }
        });
    }

    @Override // com.kwad.sdk.mvp.Presenter
    public final void onUnbind() {
        super.onUnbind();
        this.CS.Cj.b(this);
        this.CL.bd();
    }
}
