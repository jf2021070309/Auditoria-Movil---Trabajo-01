package com.kwad.components.ad.reward.widget.actionbar;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.kwad.components.ad.widget.AppScoreView;
import com.kwad.components.core.e.d.a;
import com.kwad.components.core.page.widget.TextProgressBar;
import com.kwad.sdk.R;
import com.kwad.sdk.api.KsAppDownloadListener;
import com.kwad.sdk.core.imageloader.KSImageLoader;
import com.kwad.sdk.core.response.b.d;
import com.kwad.sdk.core.response.model.AdInfo;
import com.kwad.sdk.core.response.model.AdTemplate;
import com.kwad.sdk.m.l;
import com.kwad.sdk.widget.c;
import com.kwad.sdk.widget.f;
/* loaded from: classes.dex */
public class ActionBarAppLandscape extends LinearLayout implements c {
    private AppScoreView Bh;
    private TextProgressBar Bi;
    private View Bj;
    private a Bk;
    private KsAppDownloadListener cn;
    private ImageView du;
    private TextView dv;
    private TextView dx;
    private TextView eo;
    private AdInfo mAdInfo;
    private AdTemplate mAdTemplate;
    private com.kwad.components.core.e.d.c mApkDownloadHelper;

    /* loaded from: classes.dex */
    public interface a {
        void O(boolean z);
    }

    public ActionBarAppLandscape(Context context) {
        this(context, null);
    }

    public ActionBarAppLandscape(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ActionBarAppLandscape(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        initView();
    }

    private void b(View view, final boolean z) {
        com.kwad.components.core.e.d.a.a(new a.C0197a(view.getContext()).S(this.mAdTemplate).b(this.mApkDownloadHelper).al(view == this.Bi).ao(view == this.Bj ? 1 : 2).a(new a.b() { // from class: com.kwad.components.ad.reward.widget.actionbar.ActionBarAppLandscape.2
            @Override // com.kwad.components.core.e.d.a.b
            public final void onAdClicked() {
                if (ActionBarAppLandscape.this.Bk != null) {
                    ActionBarAppLandscape.this.Bk.O(z);
                }
            }
        }));
    }

    private KsAppDownloadListener getAppDownloadListener() {
        if (this.cn == null) {
            this.cn = new com.kwad.sdk.core.download.a.a() { // from class: com.kwad.components.ad.reward.widget.actionbar.ActionBarAppLandscape.1
                @Override // com.kwad.sdk.api.KsAppDownloadListener
                public final void onDownloadFailed() {
                    ActionBarAppLandscape.this.Bi.e(com.kwad.sdk.core.response.b.a.aw(ActionBarAppLandscape.this.mAdInfo), 0);
                    ActionBarAppLandscape.this.Bj.setVisibility(0);
                }

                @Override // com.kwad.sdk.api.KsAppDownloadListener
                public final void onDownloadFinished() {
                    ActionBarAppLandscape.this.Bi.e(com.kwad.sdk.core.response.b.a.aQ(ActionBarAppLandscape.this.mAdTemplate), 0);
                    ActionBarAppLandscape.this.Bj.setVisibility(0);
                }

                @Override // com.kwad.sdk.api.KsAppDownloadListener
                public final void onIdle() {
                    ActionBarAppLandscape.this.Bi.e(com.kwad.sdk.core.response.b.a.aw(ActionBarAppLandscape.this.mAdInfo), 0);
                    ActionBarAppLandscape.this.Bj.setVisibility(0);
                }

                @Override // com.kwad.sdk.api.KsAppDownloadListener
                public final void onInstalled() {
                    ActionBarAppLandscape.this.Bi.e(com.kwad.sdk.core.response.b.a.U(ActionBarAppLandscape.this.mAdInfo), 0);
                    ActionBarAppLandscape.this.Bj.setVisibility(0);
                }

                @Override // com.kwad.sdk.core.download.a.a
                public final void onPaused(int i) {
                    ActionBarAppLandscape.this.Bi.e(com.kwad.sdk.core.response.b.a.cw(i), i);
                    ActionBarAppLandscape.this.Bj.setVisibility(8);
                }

                @Override // com.kwad.sdk.api.KsAppDownloadListener
                public final void onProgressUpdate(int i) {
                    ActionBarAppLandscape.this.Bi.e(com.kwad.sdk.core.response.b.a.cv(i), i);
                    ActionBarAppLandscape.this.Bj.setVisibility(8);
                }
            };
        }
        return this.cn;
    }

    private void initView() {
        l.inflate(getContext(), R.layout.ksad_video_actionbar_app_landscape, this);
        this.du = (ImageView) findViewById(R.id.ksad_app_icon);
        this.dv = (TextView) findViewById(R.id.ksad_app_title);
        this.eo = (TextView) findViewById(R.id.ksad_app_desc);
        this.Bh = (AppScoreView) findViewById(R.id.ksad_app_score);
        this.dx = (TextView) findViewById(R.id.ksad_app_download_count);
        TextProgressBar textProgressBar = (TextProgressBar) findViewById(R.id.ksad_app_download_btn);
        this.Bi = textProgressBar;
        textProgressBar.setTextDimen(com.kwad.sdk.d.a.a.a(getContext(), 16.0f));
        this.Bi.setTextColor(-1);
        this.Bj = findViewById(R.id.ksad_download_bar_cover);
    }

    private void kn() {
        float as = com.kwad.sdk.core.response.b.a.as(this.mAdInfo);
        boolean z = as >= 3.0f;
        if (z) {
            this.Bh.setScore(as);
            this.Bh.setVisibility(0);
        }
        String ar = com.kwad.sdk.core.response.b.a.ar(this.mAdInfo);
        boolean isEmpty = true ^ TextUtils.isEmpty(ar);
        if (isEmpty) {
            this.dx.setText(ar);
            this.dx.setVisibility(0);
        }
        if (isEmpty || z) {
            this.eo.setVisibility(8);
            return;
        }
        this.eo.setText(com.kwad.sdk.core.response.b.a.an(this.mAdInfo));
        this.Bh.setVisibility(8);
        this.dx.setVisibility(8);
        this.eo.setVisibility(0);
    }

    @Override // com.kwad.sdk.widget.c
    public final void a(View view) {
        b(view, true);
    }

    public final void a(AdTemplate adTemplate, com.kwad.components.core.e.d.c cVar, a aVar) {
        this.mAdTemplate = adTemplate;
        AdInfo ck = d.ck(adTemplate);
        this.mAdInfo = ck;
        this.Bk = aVar;
        this.mApkDownloadHelper = cVar;
        KSImageLoader.loadAppIcon(this.du, com.kwad.sdk.core.response.b.a.bQ(ck), adTemplate, 12);
        this.dv.setText(com.kwad.sdk.core.response.b.a.bO(this.mAdInfo));
        kn();
        this.Bi.e(com.kwad.sdk.core.response.b.a.aw(this.mAdInfo), 0);
        com.kwad.components.core.e.d.c cVar2 = this.mApkDownloadHelper;
        if (cVar2 != null) {
            cVar2.b(getAppDownloadListener());
        }
        setClickable(true);
        new f(this, this);
        new f(this.Bj, this);
    }

    @Override // com.kwad.sdk.widget.c
    public final void b(View view) {
        if (com.kwad.sdk.core.response.b.c.bZ(this.mAdTemplate)) {
            b(view, false);
        }
    }
}
