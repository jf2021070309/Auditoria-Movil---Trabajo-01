package com.kwad.components.ad.feed.b;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.kwad.components.ad.widget.DownloadProgressView;
import com.kwad.components.core.e.d.a;
import com.kwad.components.core.widget.KsLogoView;
import com.kwad.sdk.R;
import com.kwad.sdk.core.imageloader.KSImageLoader;
import com.kwad.sdk.core.response.model.AdInfo;
import com.kwad.sdk.core.response.model.AdTemplate;
import com.kwad.sdk.widget.RatioFrameLayout;
import java.util.List;
/* loaded from: classes.dex */
public abstract class b extends a implements View.OnClickListener, com.kwad.sdk.widget.c {
    private TextView dC;
    protected ImageView du;
    protected TextView dv;
    protected TextView ek;
    protected ImageView el;
    protected ImageView em;
    protected RatioFrameLayout en;
    protected TextView eo;
    private TextView ep;
    private View eq;
    protected DownloadProgressView er;
    protected com.kwad.components.core.e.d.c mApkDownloadHelper;
    protected KsLogoView mLogoView;

    public b(Context context) {
        super(context);
    }

    private void a(View view, final int i) {
        if (view == this.em) {
            sp();
            return;
        }
        aY();
        com.kwad.components.core.e.d.a.a(new a.C0197a(getContext()).S(this.mAdTemplate).am(5).an(i).b(this.mApkDownloadHelper).ao(view == this.er ? 1 : 2).al(view == this.er).a(new a.b() { // from class: com.kwad.components.ad.feed.b.b.2
            @Override // com.kwad.components.core.e.d.a.b
            public final void onAdClicked() {
                b.this.aK(i);
            }
        }));
    }

    private void bb() {
        findViewById(R.id.ksad_ad_h5_container).setVisibility(0);
        findViewById(R.id.ksad_ad_download_container).setVisibility(8);
        this.ep = (TextView) findViewById(R.id.ksad_h5_desc);
        this.dC = (TextView) findViewById(R.id.ksad_h5_open_btn);
        this.eq = findViewById(R.id.ksad_h5_open_cover);
        this.ep.setText(com.kwad.components.ad.feed.f.c(this.mAdTemplate));
        this.dC.setText(com.kwad.sdk.core.response.b.a.aw(this.mAdInfo));
        this.eq.setOnClickListener(this);
        this.ep.setOnClickListener(this);
        this.dC.setOnClickListener(this);
        new com.kwad.sdk.widget.f(getContext(), this.eq, this);
        new com.kwad.sdk.widget.f(getContext(), this.ep, this);
        new com.kwad.sdk.widget.f(getContext(), this.dC, this);
    }

    private void bc() {
        findViewById(R.id.ksad_ad_download_container).setVisibility(0);
        findViewById(R.id.ksad_ad_h5_container).setVisibility(8);
        this.du = (ImageView) findViewById(R.id.ksad_app_icon);
        this.dv = (TextView) findViewById(R.id.ksad_app_title);
        TextView textView = (TextView) findViewById(R.id.ksad_app_desc);
        this.eo = textView;
        com.kwad.sdk.d.a.a.a(this, this.du, this.dv, textView);
        new com.kwad.sdk.widget.f(getContext(), this.du, this);
        new com.kwad.sdk.widget.f(getContext(), this.dv, this);
        new com.kwad.sdk.widget.f(getContext(), this.eo, this);
        this.dv.setText(com.kwad.sdk.core.response.b.a.ao(this.mAdInfo));
        this.du.setImageResource(R.drawable.ksad_default_app_icon);
        KSImageLoader.loadAppIcon(this.du, com.kwad.sdk.core.response.b.a.bQ(this.mAdInfo), this.mAdTemplate, 8);
        this.eo.setText(com.kwad.components.ad.feed.f.c(this.mAdTemplate));
        aZ();
        this.er.K(this.mAdTemplate);
        this.er.setOnClickListener(this);
        com.kwad.components.core.e.d.c cVar = new com.kwad.components.core.e.d.c(this.mAdTemplate, null, this.er.getAppDownloadListener());
        this.mApkDownloadHelper = cVar;
        cVar.d(this.er.getAppDownloadListener());
        this.mApkDownloadHelper.setOnShowListener(this);
        this.mApkDownloadHelper.setOnDismissListener(this);
        new com.kwad.sdk.widget.f(getContext(), this.er, this);
    }

    @Override // com.kwad.sdk.widget.c
    public final void a(View view) {
        onClick(view);
    }

    @Override // com.kwad.sdk.widget.c
    public final void b(View view) {
        if (com.kwad.sdk.core.response.b.c.bZ(this.mAdTemplate)) {
            a(view, 153);
        }
    }

    @Override // com.kwad.components.core.widget.b
    public final void b(final AdTemplate adTemplate) {
        super.b((b) adTemplate);
        this.ek.setText(com.kwad.components.ad.feed.f.c(this.mAdTemplate));
        this.mLogoView.ad(adTemplate);
        this.el.post(new Runnable() { // from class: com.kwad.components.ad.feed.b.b.1
            @Override // java.lang.Runnable
            public final void run() {
                AdInfo ck = com.kwad.sdk.core.response.b.d.ck(adTemplate);
                if (com.kwad.sdk.core.response.b.a.aM(ck).height > com.kwad.sdk.core.response.b.a.aM(ck).width) {
                    ViewGroup.LayoutParams layoutParams = b.this.en.getLayoutParams();
                    layoutParams.width = b.this.getWidth() / 2;
                    b.this.en.setRatio(1.7857142686843872d);
                    b.this.en.setLayoutParams(layoutParams);
                }
                List<String> aT = com.kwad.sdk.core.response.b.a.aT(b.this.mAdInfo);
                if (aT.size() > 0) {
                    KSImageLoader.loadFeeImage(b.this.el, aT.get(0), b.this.mAdTemplate, b.this.ei);
                } else {
                    com.kwad.sdk.core.e.c.e("BaseFeedTextImageView", "getImageUrlList size less than one");
                }
            }
        });
        if (com.kwad.sdk.core.response.b.a.ax(this.mAdInfo)) {
            bc();
        } else {
            bb();
        }
        com.kwad.sdk.d.a.a.a(this, this.ek, this.el, this.em);
        new com.kwad.sdk.widget.f(getContext(), this.ek, this);
        new com.kwad.sdk.widget.f(getContext(), this.el, this);
        new com.kwad.sdk.widget.f(getContext(), this.em, this);
        setOnClickListener(this);
    }

    @Override // com.kwad.components.core.widget.b
    public final void ba() {
        this.ek = (TextView) findViewById(R.id.ksad_ad_desc);
        RatioFrameLayout ratioFrameLayout = (RatioFrameLayout) findViewById(R.id.ksad_image_container);
        this.en = ratioFrameLayout;
        ratioFrameLayout.setRatio(0.5600000023841858d);
        this.el = (ImageView) findViewById(R.id.ksad_ad_image);
        this.em = (ImageView) findViewById(R.id.ksad_ad_dislike);
        this.mLogoView = (KsLogoView) findViewById(R.id.ksad_ad_dislike_logo);
        this.er = (DownloadProgressView) findViewById(R.id.ksad_app_download_btn);
    }

    @Override // com.kwad.components.core.widget.b
    public final void bd() {
        super.bd();
        com.kwad.components.core.e.d.c cVar = this.mApkDownloadHelper;
        if (cVar != null) {
            cVar.c(this.er.getAppDownloadListener());
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        a(view, view == this.ek ? 25 : view == this.el ? 100 : (view == this.er || view == this.dC || view == this.eq) ? 1 : view == this.du ? 13 : view == this.dv ? 14 : (view == this.eo || view == this.ep) ? 101 : 35);
    }
}
