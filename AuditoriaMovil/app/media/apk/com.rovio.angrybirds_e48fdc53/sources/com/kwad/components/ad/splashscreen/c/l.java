package com.kwad.components.ad.splashscreen.c;

import android.os.SystemClock;
import android.view.View;
import android.view.ViewStub;
import android.widget.TextView;
import com.kwad.components.ad.splashscreen.h;
import com.kwad.components.ad.splashscreen.widget.KsRotateView;
import com.kwad.sdk.R;
import com.kwad.sdk.core.response.model.AdInfo;
import com.kwad.sdk.core.response.model.AdMatrixInfo;
import com.kwad.sdk.utils.bj;
import org.json.JSONObject;
/* loaded from: classes.dex */
public final class l extends i implements com.kwad.components.ad.splashscreen.g, com.kwad.sdk.core.g.a {
    private View Dm;
    private KsRotateView Dn;
    private TextView Do;
    private TextView Dp;
    private com.kwad.sdk.core.g.c Dq;
    private com.kwad.components.ad.splashscreen.d Dr;
    private Runnable Ds = new Runnable() { // from class: com.kwad.components.ad.splashscreen.c.l.4
        @Override // java.lang.Runnable
        public final void run() {
            l.this.Dq.CF();
        }
    };
    private long mStartTime;

    @Override // com.kwad.components.ad.splashscreen.g
    public final void X(int i) {
    }

    @Override // com.kwad.components.ad.splashscreen.c.i
    protected final void Z(String str) {
        TextView textView = this.Dp;
        if (textView != null) {
            textView.setText(str);
        }
    }

    @Override // com.kwad.sdk.core.g.a
    public final void ab(final String str) {
        Runnable runnable;
        long j;
        boolean sE = this.CS.Cj.sE();
        boolean nd = com.kwad.components.core.e.c.b.nd();
        if (!sE || nd) {
            runnable = this.Ds;
            j = 1800;
        } else {
            this.Dn.lK();
            if (this.CS != null) {
                this.CS.a(1, getContext(), 161, 2, new h.a() { // from class: com.kwad.components.ad.splashscreen.c.l.3
                    @Override // com.kwad.components.ad.splashscreen.h.a
                    public final void b(com.kwad.sdk.core.report.j jVar) {
                        jVar.du(str);
                    }
                });
            }
            li();
            runnable = this.Ds;
            j = 2000;
        }
        bj.a(runnable, null, j);
    }

    @Override // com.kwad.components.ad.splashscreen.c.i, com.kwad.components.ad.splashscreen.c.e, com.kwad.sdk.mvp.Presenter
    public final void ah() {
        super.ah();
        bj.postOnUiThread(new Runnable() { // from class: com.kwad.components.ad.splashscreen.c.l.2
            @Override // java.lang.Runnable
            public final void run() {
                if (l.this.CS != null) {
                    l.this.CS.Cx = SystemClock.elapsedRealtime() - l.this.mStartTime;
                }
            }
        });
        if (this.CS != null) {
            this.CS.a(this);
        }
    }

    @Override // com.kwad.components.ad.splashscreen.c.i
    protected final void initView() {
        this.mStartTime = SystemClock.elapsedRealtime();
        ViewStub viewStub = (ViewStub) findViewById(R.id.ksad_rotate_layout);
        this.Dm = viewStub != null ? viewStub.inflate() : findViewById(R.id.ksad_rotate_root);
        this.Do = (TextView) findViewById(R.id.ksad_rotate_text);
        this.Dp = (TextView) findViewById(R.id.ksad_rotate_action);
        this.Dn = (KsRotateView) findViewById(R.id.ksad_rotate_view);
    }

    @Override // com.kwad.components.ad.splashscreen.g
    public final void kF() {
        com.kwad.sdk.core.g.c cVar = this.Dq;
        if (cVar != null) {
            cVar.bj(getContext());
        }
    }

    @Override // com.kwad.components.ad.splashscreen.c.i
    protected final void lc() {
        AdInfo ck = com.kwad.sdk.core.response.b.d.ck(this.CS.mAdTemplate);
        getContext();
        com.kwad.components.ad.splashscreen.d a = com.kwad.components.ad.splashscreen.d.a(this.CS.mAdTemplate, ck, this.CS.mApkDownloadHelper, 1);
        this.Dr = a;
        TextView textView = this.Do;
        if (textView != null) {
            textView.setText(a.getTitle());
        }
        TextView textView2 = this.Dp;
        if (textView2 != null) {
            textView2.setText(this.Dr.kz());
        }
    }

    @Override // com.kwad.components.ad.splashscreen.c.i
    protected final void ld() {
        if (this.Dm == null || this.CS == null) {
            return;
        }
        this.Dm.setVisibility(0);
        com.kwad.sdk.core.report.a.b(this.CS.mAdTemplate, 184, (JSONObject) null);
        com.kwad.components.core.webview.b.d.a.se().aR(184);
    }

    @Override // com.kwad.components.ad.splashscreen.c.i
    protected final void le() {
        AdMatrixInfo.RotateInfo bI = com.kwad.sdk.core.response.b.b.bI(this.CS.mAdTemplate);
        com.kwad.sdk.core.g.c cVar = this.Dq;
        if (cVar != null) {
            cVar.a(bI);
            return;
        }
        com.kwad.sdk.core.g.c cVar2 = new com.kwad.sdk.core.g.c(bI);
        this.Dq = cVar2;
        cVar2.a(this);
    }

    @Override // com.kwad.components.ad.splashscreen.c.i
    protected final void lf() {
        this.Dq.bi(getContext());
    }

    @Override // com.kwad.components.ad.splashscreen.c.i
    protected final void lg() {
        this.Dn.post(new Runnable() { // from class: com.kwad.components.ad.splashscreen.c.l.1
            @Override // java.lang.Runnable
            public final void run() {
                l.this.Dn.lg();
            }
        });
    }

    @Override // com.kwad.sdk.core.g.a
    public final void ln() {
        com.kwad.sdk.core.report.a.aG(this.CS.mAdTemplate);
    }

    @Override // com.kwad.components.ad.splashscreen.c.i, com.kwad.sdk.mvp.Presenter
    public final void onUnbind() {
        super.onUnbind();
        com.kwad.sdk.core.e.c.d("SplashRotatePresenter", "onUnbind");
        com.kwad.sdk.core.g.c cVar = this.Dq;
        if (cVar != null) {
            cVar.bj(getContext());
        }
        if (this.CS != null) {
            this.CS.b(this);
        }
    }
}
