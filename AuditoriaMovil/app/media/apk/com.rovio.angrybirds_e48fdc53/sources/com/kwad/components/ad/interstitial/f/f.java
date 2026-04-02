package com.kwad.components.ad.interstitial.f;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.kwad.components.core.page.widget.TextProgressBar;
import com.kwad.components.core.widget.KsLogoView;
import com.kwad.sdk.R;
import com.kwad.sdk.core.imageloader.KSImageLoader;
import com.kwad.sdk.core.response.model.AdInfo;
import com.kwad.sdk.core.response.model.AdProductInfo;
import com.kwad.sdk.core.response.model.AdTemplate;
import com.kwad.sdk.m.l;
import com.kwad.sdk.utils.ai;
import com.kwad.sdk.utils.bc;
import com.kwad.sdk.widget.KSFrameLayout;
/* loaded from: classes.dex */
public final class f extends KSFrameLayout implements com.kwad.sdk.widget.c {
    private ImageView du;
    private TextView eo;
    private ImageView ew;
    private KSFrameLayout jT;
    private KSFrameLayout kN;
    private String lR;
    private View lS;
    private ImageView lT;
    private TextProgressBar lU;
    private ViewGroup lV;
    private ViewGroup lW;
    private ImageView lX;
    private View lY;
    private View lZ;
    private AdTemplate mAdTemplate;
    private KsLogoView mLogoView;
    private TextView ma;
    private ImageView mb;
    private TextView mc;
    private TextView md;
    private TextView me;
    private TextProgressBar mf;
    private TextView mg;
    private g mh;
    private final a mi;
    private boolean mj;

    /* loaded from: classes.dex */
    public static class a {
        private boolean ml = false;
        private boolean mm = false;
        private int mn = 0;
        private boolean mo = true;

        public final void E(int i) {
            this.mn = i;
        }

        public final int eD() {
            return this.mn;
        }

        public final boolean eE() {
            return this.mo;
        }

        public final void v(boolean z) {
            this.ml = z;
        }

        public final void w(boolean z) {
            this.mm = z;
        }

        public final void x(boolean z) {
            this.mo = z;
        }
    }

    public f(Context context, a aVar) {
        super(context);
        this.lR = "%s秒后进入试玩页";
        this.mj = false;
        this.mi = aVar;
        l.inflate(context, aVar.eE() ? R.layout.ksad_interstitial_native_above : R.layout.ksad_interstitial_native, this);
        s(aVar.ml);
    }

    private void a(View view, int i, int i2) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        layoutParams.width = com.kwad.sdk.d.a.a.a(getContext(), i);
        layoutParams.height = com.kwad.sdk.d.a.a.a(getContext(), i2);
        view.setLayoutParams(layoutParams);
    }

    private void a(KSFrameLayout kSFrameLayout, boolean z) {
        kSFrameLayout.setClickable(true);
        new com.kwad.sdk.widget.f(kSFrameLayout, this);
        this.jT.setWidthBasedRatio(!z);
    }

    private void b(View view, boolean z) {
        g gVar;
        g gVar2;
        g gVar3 = this.mh;
        if (gVar3 != null) {
            gVar3.p(z);
            this.mh.a(this.kN);
        }
        if (view.equals(this)) {
            g gVar4 = this.mh;
            if (gVar4 != null) {
                gVar4.dM();
            }
        } else if (view.equals(this.lY)) {
            if (!(1 == this.mi.eD()) || (gVar2 = this.mh) == null) {
                return;
            }
            gVar2.dL();
        } else if (view.equals(this.mf)) {
            g gVar5 = this.mh;
            if (gVar5 != null) {
                gVar5.dN();
            }
        } else if (view.equals(this.lW)) {
            g gVar6 = this.mh;
            if (gVar6 != null) {
                gVar6.dY();
            }
        } else if (view.equals(this.lU)) {
            g gVar7 = this.mh;
            if (gVar7 != null) {
                gVar7.dO();
            }
        } else if (view.equals(this.lZ)) {
            g gVar8 = this.mh;
            if (gVar8 != null) {
                gVar8.dR();
            }
        } else if (view.equals(this.jT)) {
            g gVar9 = this.mh;
            if (gVar9 != null) {
                gVar9.dP();
            }
        } else if (view.equals(this.ew)) {
            g gVar10 = this.mh;
            if (gVar10 != null) {
                gVar10.dQ();
            }
        } else if (view.equals(this.du)) {
            g gVar11 = this.mh;
            if (gVar11 != null) {
                gVar11.dS();
            }
        } else if (view.equals(this.mc)) {
            g gVar12 = this.mh;
            if (gVar12 != null) {
                gVar12.dT();
            }
        } else if (view.equals(this.eo)) {
            g gVar13 = this.mh;
            if (gVar13 != null) {
                gVar13.dU();
            }
        } else if (view.equals(this.mb)) {
            g gVar14 = this.mh;
            if (gVar14 != null) {
                gVar14.dV();
            }
        } else if (view.equals(this.md)) {
            g gVar15 = this.mh;
            if (gVar15 != null) {
                gVar15.dW();
            }
        } else if (!view.equals(this.me) || (gVar = this.mh) == null) {
        } else {
            gVar.dX();
        }
    }

    private void d(View view, int i) {
        com.kwad.sdk.d.a.a.b(view, 0, com.kwad.sdk.d.a.a.a(getContext(), i), 0, 0);
    }

    private void ex() {
        a(this.mb, 40, 40);
        a(this.mf, 130, 30);
        this.md.setTextSize(14.0f);
        d(this.mf, 11);
        d(this.md, 7);
        d(this.me, 7);
    }

    private void s(boolean z) {
        setClickable(true);
        this.kN = (KSFrameLayout) findViewById(R.id.ksad_interstitial_native_container);
        this.jT = (KSFrameLayout) findViewById(R.id.ksad_interstitial_native_video_container);
        this.lS = findViewById(R.id.ksad_interstitial_full_bg);
        this.lT = (ImageView) findViewById(R.id.ksad_interstitial_tail_frame);
        this.ew = (ImageView) findViewById(R.id.ksad_video_first_frame_container);
        this.mLogoView = (KsLogoView) findViewById(R.id.ksad_ad_interstitial_logo);
        this.lV = (ViewGroup) findViewById(R.id.ksad_interstitial_playing);
        this.lW = (ViewGroup) findViewById(R.id.ksad_interstitial_play_end);
        this.lU = (TextProgressBar) findViewById(R.id.ksad_interstitial_download_btn);
        this.lY = findViewById(R.id.ksad_interstitial_close_outer);
        TextProgressBar textProgressBar = this.lU;
        if (textProgressBar != null) {
            textProgressBar.setTextDimen(com.kwad.sdk.d.a.a.a(getContext(), 10.0f));
            this.lU.setTextColor(-1);
        }
        this.lX = (ImageView) findViewById(R.id.ksad_interstitial_mute);
        this.ma = (TextView) findViewById(R.id.ksad_interstitial_count_down);
        this.mb = (ImageView) findViewById(R.id.ksad_interstitial_logo);
        this.md = (TextView) findViewById(R.id.ksad_interstitial_name);
        this.me = (TextView) findViewById(R.id.ksad_interstitial_desc);
        this.mf = (TextProgressBar) findViewById(R.id.ksad_app_download_btn);
        this.lZ = findViewById(R.id.ksad_ad_download_container);
        this.du = (ImageView) findViewById(R.id.ksad_app_icon);
        this.mc = (TextView) findViewById(R.id.ksad_app_title);
        this.eo = (TextView) findViewById(R.id.ksad_app_desc);
        new com.kwad.sdk.widget.f(this, this);
        new com.kwad.sdk.widget.f(this.ew, this);
        new com.kwad.sdk.widget.f(this.lU, this);
        new com.kwad.sdk.widget.f(this.mf, this);
        new com.kwad.sdk.widget.f(this.lY, this);
        new com.kwad.sdk.widget.f(this.lW, this);
        new com.kwad.sdk.widget.f(this.ma, this);
        new com.kwad.sdk.widget.f(this.lZ, this);
        new com.kwad.sdk.widget.f(this.du, this);
        new com.kwad.sdk.widget.f(this.mc, this);
        new com.kwad.sdk.widget.f(this.eo, this);
        new com.kwad.sdk.widget.f(this.mb, this);
        new com.kwad.sdk.widget.f(this.md, this);
        new com.kwad.sdk.widget.f(this.me, this);
        this.lX.setOnClickListener(new View.OnClickListener() { // from class: com.kwad.components.ad.interstitial.f.f.1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                f.this.lX.setSelected(!f.this.lX.isSelected());
                if (f.this.mh != null) {
                    f.this.mh.o(f.this.lX.isSelected());
                }
            }
        });
        this.mg = (TextView) findViewById(R.id.ksad_interstitial_playable_timer);
        a(this.jT, z);
        if (ai.IL()) {
            return;
        }
        ex();
    }

    public final void a(float f, com.kwad.sdk.core.video.videoview.a aVar) {
        this.jT.setRatio(f);
        this.jT.addView(aVar);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) aVar.getLayoutParams();
        layoutParams.topMargin = 0;
        layoutParams.width = -1;
        layoutParams.height = -1;
        layoutParams.gravity = 17;
        aVar.setLayoutParams(layoutParams);
    }

    @Override // com.kwad.sdk.widget.c
    public final void a(View view) {
        b(view, true);
    }

    public final void a(AdTemplate adTemplate, AdInfo adInfo) {
        TextView textView;
        String bO;
        TextProgressBar textProgressBar;
        String aw;
        this.mb.setImageResource(R.drawable.ksad_default_app_icon);
        if (com.kwad.sdk.core.response.b.a.bM(adInfo) == 2) {
            KSImageLoader.loadCircleIcon(this.mb, com.kwad.sdk.core.response.b.a.ct(adInfo), getContext().getResources().getDrawable(R.drawable.ksad_default_app_icon));
            this.md.setText(com.kwad.sdk.core.response.b.a.bP(adInfo));
            this.me.setText(com.kwad.sdk.core.response.b.a.an(adInfo));
            if (com.kwad.sdk.core.response.b.a.cp(adInfo)) {
                textProgressBar = this.mf;
                aw = com.kwad.components.ad.d.b.V();
            } else {
                textProgressBar = this.mf;
                aw = com.kwad.components.ad.d.b.Y();
            }
        } else if (com.kwad.components.ad.interstitial.a.b.cI() && com.kwad.sdk.core.response.b.a.bM(adInfo) == 3) {
            AdProductInfo cy = com.kwad.sdk.core.response.b.a.cy(adInfo);
            KSImageLoader.loadWithRadius(this.mb, cy.icon, adTemplate, 4);
            this.md.setText(cy.name);
            this.me.setVisibility(8);
            textProgressBar = this.mf;
            aw = com.kwad.components.ad.d.b.W();
        } else {
            if (com.kwad.sdk.core.response.b.a.ax(adInfo)) {
                KSImageLoader.loadWithRadius(this.mb, com.kwad.sdk.core.response.b.a.bQ(adInfo), adTemplate, 4);
                textView = this.md;
                bO = com.kwad.sdk.core.response.b.a.ao(adInfo);
            } else {
                KSImageLoader.loadWithRadius(this.mb, com.kwad.sdk.core.response.b.d.cp(adTemplate), adTemplate, 4);
                textView = this.md;
                bO = com.kwad.sdk.core.response.b.a.bO(adInfo);
            }
            textView.setText(bO);
            this.me.setText(com.kwad.sdk.core.response.b.a.an(adInfo));
            textProgressBar = this.mf;
            aw = com.kwad.sdk.core.response.b.a.aw(adInfo);
        }
        textProgressBar.e(aw, 0);
    }

    public final void a(String str, AdTemplate adTemplate) {
        if (bc.isNullString(str)) {
            return;
        }
        this.ew.setImageDrawable(null);
        KSImageLoader.loadImage(this.ew, str, adTemplate);
    }

    @Override // com.kwad.sdk.widget.c
    public final void b(View view) {
        if (com.kwad.sdk.core.response.b.c.bZ(this.mAdTemplate)) {
            b(view, false);
        }
    }

    public final void b(boolean z, int i) {
        TextView textView = this.mg;
        if (textView == null) {
            return;
        }
        textView.setVisibility(0);
        if (i >= 0) {
            this.mg.setText(String.format(this.lR, String.valueOf(i)));
        }
    }

    public final void b(boolean z, boolean z2) {
        ImageView imageView = this.ew;
        if (imageView != null) {
            imageView.setVisibility(z ? 0 : 8);
            this.ew.setClickable(z2);
        }
    }

    public final void eA() {
        t(false);
        this.lW.setVisibility(0);
        this.lT.setVisibility(0);
    }

    public final void eB() {
        this.lW.setVisibility(8);
        this.lT.setVisibility(8);
        t(true);
    }

    public final boolean eC() {
        ViewGroup viewGroup = this.lW;
        return viewGroup != null && viewGroup.getVisibility() == 0;
    }

    public final void ey() {
        TextView textView = this.ma;
        if (textView != null) {
            textView.setVisibility(8);
            this.mj = true;
        }
    }

    public final void ez() {
        View view = this.lY;
        if (view != null) {
            view.setVisibility(8);
        }
    }

    public final void f(int i, int i2) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) getLayoutParams();
        marginLayoutParams.width = i;
        marginLayoutParams.height = i2;
        setLayoutParams(marginLayoutParams);
    }

    public final void g(String str, int i) {
        TextProgressBar textProgressBar = this.lU;
        if (textProgressBar != null) {
            textProgressBar.e(str, 0);
        }
        TextProgressBar textProgressBar2 = this.mf;
        if (textProgressBar2 != null) {
            textProgressBar2.e(str, 0);
        }
    }

    public final View getBlurBgView() {
        return this.lS;
    }

    public final ImageView getTailFrameView() {
        return this.lT;
    }

    public final void n(AdTemplate adTemplate) {
        this.mLogoView.ad(adTemplate);
    }

    public final void setAdTemplate(AdTemplate adTemplate) {
        this.mAdTemplate = adTemplate;
    }

    public final void setViewListener(g gVar) {
        this.mh = gVar;
    }

    public final void t(boolean z) {
        ViewGroup viewGroup = this.lV;
        if (viewGroup != null) {
            viewGroup.setVisibility(z ? 0 : 8);
        }
    }

    public final void u(boolean z) {
        ImageView imageView = this.lX;
        if (imageView != null) {
            imageView.setSelected(z);
        }
    }

    public final void y(String str) {
        TextView textView = this.ma;
        if (textView == null) {
            return;
        }
        if (str != null) {
            textView.setText(str);
        }
        if (!this.mi.mm || this.mj || this.ma.getVisibility() == 0) {
            return;
        }
        this.ma.setVisibility(0);
    }
}
