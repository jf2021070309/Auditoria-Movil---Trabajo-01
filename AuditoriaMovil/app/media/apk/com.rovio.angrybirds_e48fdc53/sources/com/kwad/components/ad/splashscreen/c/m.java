package com.kwad.components.ad.splashscreen.c;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.Context;
import android.os.SystemClock;
import android.os.Vibrator;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.TextView;
import com.kwad.components.ad.splashscreen.h;
import com.kwad.components.ad.splashscreen.widget.KsShakeView;
import com.kwad.sdk.R;
import com.kwad.sdk.core.response.model.AdInfo;
import com.kwad.sdk.utils.bj;
import org.json.JSONObject;
/* loaded from: classes.dex */
public final class m extends e implements View.OnClickListener, com.kwad.components.ad.splashscreen.g, com.kwad.sdk.core.g.b, com.kwad.sdk.widget.c {
    private static long jO = 400;
    private boolean CI;
    private com.kwad.components.ad.splashscreen.f.a De;
    private com.kwad.components.ad.splashscreen.d Dr;
    private ViewGroup Dv;
    private KsShakeView Dw;
    private TextView Dx;
    private com.kwad.sdk.core.g.d dO;
    private Vibrator dP;
    private long mStartTime;

    private void lh() {
        if (this.CS != null) {
            com.kwad.components.ad.splashscreen.f.a aVar = this.De;
            if (aVar == null) {
                this.De = new com.kwad.components.ad.splashscreen.f.a(getContext(), this.CS.mAdTemplate) { // from class: com.kwad.components.ad.splashscreen.c.m.3
                    @Override // com.kwad.components.ad.splashscreen.f.a
                    public final void aa(String str) {
                        if (m.this.Dx != null) {
                            TextView textView = m.this.Dx;
                            textView.setText("或点击" + str);
                        }
                    }
                };
            } else {
                aVar.setAdTemplate(this.CS.mAdTemplate);
            }
            com.kwad.components.core.e.d.c cVar = this.CS.mApkDownloadHelper;
            if (cVar != null) {
                cVar.b(this.De);
            }
        }
    }

    private void lo() {
        TextView textView = this.Dx;
        if (textView != null) {
            textView.setText(this.Dr.kz());
        }
        KsShakeView ksShakeView = this.Dw;
        if (ksShakeView != null) {
            ksShakeView.ae(this.Dr.kA());
        }
    }

    private void lp() {
        if (this.Dv == null || this.CS == null) {
            return;
        }
        this.Dv.setVisibility(0);
        com.kwad.sdk.core.report.a.b(this.CS.mAdTemplate, 185, (JSONObject) null);
        com.kwad.components.core.webview.b.d.a.se().aR(185);
    }

    @Override // com.kwad.components.ad.splashscreen.g
    public final void X(int i) {
    }

    @Override // com.kwad.sdk.core.g.b
    public final void a(final double d) {
        boolean nd = com.kwad.components.core.e.c.b.nd();
        if (!this.CS.Cj.sE() || nd) {
            bj.a(new Runnable() { // from class: com.kwad.components.ad.splashscreen.c.m.4
                @Override // java.lang.Runnable
                public final void run() {
                    m.this.dO.CF();
                }
            }, null, 500L);
            return;
        }
        this.Dw.b(new AnimatorListenerAdapter() { // from class: com.kwad.components.ad.splashscreen.c.m.5
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public final void onAnimationEnd(Animator animator) {
                super.onAnimationEnd(animator);
                if (m.this.CS != null) {
                    m.this.CS.a(1, m.this.getContext(), 157, 2, new h.a() { // from class: com.kwad.components.ad.splashscreen.c.m.5.1
                        @Override // com.kwad.components.ad.splashscreen.h.a
                        public final void b(com.kwad.sdk.core.report.j jVar) {
                            jVar.i(d);
                        }
                    });
                }
                m.this.Dw.lL();
                bj.a(new Runnable() { // from class: com.kwad.components.ad.splashscreen.c.m.5.2
                    @Override // java.lang.Runnable
                    public final void run() {
                        com.kwad.sdk.core.e.c.d("SplashShakePresenter", "onShakeEvent openGate2");
                        m.this.dO.CF();
                    }
                }, null, 500L);
            }
        });
        bj.a(getContext(), this.dP);
    }

    @Override // com.kwad.sdk.widget.c
    public final void a(View view) {
        com.kwad.sdk.core.e.c.d("SplashShakePresenter", "onSingleTap: " + view);
        if (com.kwad.sdk.core.response.b.b.dp(com.kwad.sdk.core.response.b.d.ck(this.CS.mAdTemplate)) && this.CS != null) {
            this.CS.c(1, getContext(), 158, 1);
        }
    }

    @Override // com.kwad.sdk.core.g.b
    public final void aT() {
        com.kwad.sdk.core.report.a.aG(this.CS.mAdTemplate);
    }

    @Override // com.kwad.components.ad.splashscreen.c.e, com.kwad.sdk.mvp.Presenter
    public final void ah() {
        super.ah();
        if (this.CS == null) {
            return;
        }
        bj.postOnUiThread(new Runnable() { // from class: com.kwad.components.ad.splashscreen.c.m.1
            @Override // java.lang.Runnable
            public final void run() {
                m.this.CS.Cx = SystemClock.elapsedRealtime() - m.this.mStartTime;
            }
        });
        AdInfo ck = com.kwad.sdk.core.response.b.d.ck(this.CS.mAdTemplate);
        getContext();
        this.Dr = com.kwad.components.ad.splashscreen.d.a(this.CS.mAdTemplate, ck, this.CS.mApkDownloadHelper, 2);
        float bH = com.kwad.sdk.core.response.b.b.bH(this.CS.mAdTemplate);
        com.kwad.sdk.core.g.d dVar = this.dO;
        if (dVar == null) {
            com.kwad.sdk.core.g.d dVar2 = new com.kwad.sdk.core.g.d(bH);
            this.dO = dVar2;
            dVar2.a(this);
        } else {
            dVar.e(bH);
        }
        lo();
        if (com.kwad.sdk.core.response.b.a.ax(ck)) {
            lh();
        }
        lp();
        this.dO.bi(getContext());
        this.Dw.post(new Runnable() { // from class: com.kwad.components.ad.splashscreen.c.m.2
            @Override // java.lang.Runnable
            public final void run() {
                m.this.Dw.lL();
            }
        });
        this.CI = com.kwad.sdk.core.response.b.c.bZ(this.CS.mAdTemplate);
        new com.kwad.sdk.widget.f(this.Dw.getContext(), this.Dw, this);
        this.CS.a(this);
    }

    @Override // com.kwad.sdk.widget.c
    public final void b(View view) {
        com.kwad.sdk.core.e.c.d("SplashShakePresenter", "onSlide: enableSlickClick: " + this.CI);
        if (this.CI && this.CS != null) {
            this.CS.c(1, view.getContext(), 153, 1);
        }
    }

    @Override // com.kwad.components.ad.splashscreen.g
    public final void kF() {
        com.kwad.sdk.core.g.d dVar = this.dO;
        if (dVar != null) {
            dVar.bj(getContext());
        }
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        com.kwad.sdk.core.e.c.d("SplashShakePresenter", "onClick: " + view);
        if (!view.equals(this.Dw) || this.CS == null || this.CS.mAdTemplate == null || !com.kwad.sdk.core.response.b.b.dp(com.kwad.sdk.core.response.b.d.ck(this.CS.mAdTemplate))) {
            return;
        }
        this.CS.c(1, getContext(), 158, 1);
    }

    @Override // com.kwad.sdk.mvp.Presenter
    public final void onCreate() {
        super.onCreate();
        this.mStartTime = SystemClock.elapsedRealtime();
        Context context = getContext();
        if (context != null) {
            this.dP = (Vibrator) context.getSystemService("vibrator");
        }
        ViewStub viewStub = (ViewStub) findViewById(R.id.ksad_shake_layout);
        this.Dv = (ViewGroup) (viewStub != null ? viewStub.inflate() : findViewById(R.id.ksad_shake_root));
        this.Dx = (TextView) this.Dv.findViewById(R.id.ksad_shake_action);
        KsShakeView ksShakeView = (KsShakeView) this.Dv.findViewById(R.id.ksad_shake_view);
        this.Dw = ksShakeView;
        ksShakeView.setOnClickListener(this);
    }

    @Override // com.kwad.sdk.mvp.Presenter
    public final void onUnbind() {
        super.onUnbind();
        com.kwad.sdk.core.e.c.d("SplashShakePresenter", "onUnbind");
        if (this.CS != null) {
            this.CS.b(this);
        }
        com.kwad.sdk.core.g.d dVar = this.dO;
        if (dVar != null) {
            dVar.bj(getContext());
        }
        KsShakeView ksShakeView = this.Dw;
        if (ksShakeView != null) {
            ksShakeView.lM();
        }
    }
}
