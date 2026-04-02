package com.kwad.components.ad.splashscreen.c.a;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.kwad.components.ad.splashscreen.widget.CloseCountDownView;
import com.kwad.sdk.R;
import com.kwad.sdk.core.report.j;
import com.kwad.sdk.core.report.z;
import org.json.JSONObject;
/* loaded from: classes.dex */
public final class c extends com.kwad.components.ad.splashscreen.c.e implements View.OnClickListener, com.kwad.sdk.widget.c {
    private CloseCountDownView Ep;
    private ViewGroup Eq;
    private ViewGroup Er;
    private ImageView Es;
    private TextView Et;
    private TextView Eu;
    private CloseCountDownView.a Ev = new CloseCountDownView.a() { // from class: com.kwad.components.ad.splashscreen.c.a.c.1
        @Override // com.kwad.components.ad.splashscreen.widget.CloseCountDownView.a
        public final void dL() {
            z.a aVar = new z.a();
            if (c.this.CS.mTimerHelper != null) {
                aVar.duration = c.this.CS.mTimerHelper.getTime();
            }
            com.kwad.sdk.core.report.a.b(c.this.CS.mAdTemplate, new j().ch(1).a(aVar).cm(6), (JSONObject) null);
            c.this.CS.kK();
        }

        @Override // com.kwad.components.ad.splashscreen.widget.CloseCountDownView.a
        public final void kX() {
            z.a aVar = new z.a();
            if (c.this.CS.mTimerHelper != null) {
                aVar.duration = c.this.CS.mTimerHelper.getTime();
            }
            com.kwad.sdk.core.report.a.b(c.this.CS.mAdTemplate, new j().ch(14).a(aVar).cm(6), (JSONObject) null);
            c.this.CS.kO();
        }
    };

    private void s(View view) {
        if (view == this.Eq) {
            this.CS.c(2, view.getContext(), 104, 2);
        } else if (view == this.Er) {
            this.CS.c(2, view.getContext(), 26, 1);
        } else if (view == this.Es) {
            this.CS.c(2, view.getContext(), 15, 2);
        } else if (view == this.Et) {
            this.CS.c(2, view.getContext(), 16, 2);
        } else if (view == this.Eu) {
            this.CS.c(2, view.getContext(), 17, 2);
        }
    }

    @Override // com.kwad.sdk.widget.c
    public final void a(View view) {
        s(view);
    }

    @Override // com.kwad.components.ad.splashscreen.c.e, com.kwad.sdk.mvp.Presenter
    public final void ah() {
        super.ah();
        this.Ep.setOnViewClickListener(this.Ev);
        this.Er.setOnClickListener(this);
        new com.kwad.sdk.widget.f(this.Er.getContext(), this.Er, this);
        if (com.kwad.sdk.core.response.b.b.cL(com.kwad.sdk.core.response.b.d.ck(this.CS.mAdTemplate))) {
            this.Eq.setOnClickListener(this);
            this.Es.setOnClickListener(this);
            this.Et.setOnClickListener(this);
            this.Eu.setOnClickListener(this);
            new com.kwad.sdk.widget.f(this.Er.getContext(), this.Eq, this);
            new com.kwad.sdk.widget.f(this.Er.getContext(), this.Es, this);
            new com.kwad.sdk.widget.f(this.Er.getContext(), this.Et, this);
            new com.kwad.sdk.widget.f(this.Er.getContext(), this.Eu, this);
        }
    }

    @Override // com.kwad.sdk.widget.c
    public final void b(View view) {
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        s(view);
    }

    @Override // com.kwad.sdk.mvp.Presenter
    public final void onCreate() {
        super.onCreate();
        this.Ep = (CloseCountDownView) findViewById(R.id.ksad_ad_endcard_close_root);
        this.Eq = (ViewGroup) findViewById(R.id.ksad_splash_end_card_giftbox_view);
        this.Er = (ViewGroup) findViewById(R.id.ksad_splash_endcard_actionbar);
        this.Es = (ImageView) findViewById(R.id.ksad_ad_endcard_icon);
        this.Et = (TextView) findViewById(R.id.ksad_ad_endcard_appname);
        this.Eu = (TextView) findViewById(R.id.ksad_ad_endcard_appdesc);
    }
}
