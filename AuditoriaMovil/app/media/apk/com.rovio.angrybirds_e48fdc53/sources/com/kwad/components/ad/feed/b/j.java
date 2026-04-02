package com.kwad.components.ad.feed.b;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.kwad.components.ad.feed.FeedDownloadActivityProxy;
import com.kwad.components.core.e.d.a;
import com.kwad.components.core.page.AdWebViewActivityProxy;
import com.kwad.components.core.widget.KsLogoView;
import com.kwad.sdk.R;
import com.kwad.sdk.core.imageloader.KSImageLoader;
import com.kwad.sdk.core.response.model.AdTemplate;
import com.kwad.sdk.widget.RatioFrameLayout;
import java.util.List;
/* loaded from: classes.dex */
public final class j extends a implements View.OnClickListener, com.kwad.sdk.widget.c {
    private TextView ek;
    private ImageView el;
    private ImageView em;
    private KsLogoView mLogoView;

    public j(Context context) {
        super(context);
    }

    private void c(View view, int i) {
        if (view == this.em) {
            sp();
        } else if (com.kwad.components.core.e.d.d.b(new a.C0197a(getContext()).S(this.mAdTemplate), 1) == 1) {
            aK(i);
        } else {
            boolean ax = com.kwad.sdk.core.response.b.a.ax(this.mAdInfo);
            aK(i);
            if (ax) {
                FeedDownloadActivityProxy.launch(this.mContext, this.mAdTemplate, this.XZ);
            } else {
                AdWebViewActivityProxy.launch(getContext(), this.mAdTemplate);
            }
        }
    }

    @Override // com.kwad.sdk.widget.c
    public final void a(View view) {
        onClick(view);
    }

    @Override // com.kwad.sdk.widget.c
    public final void b(View view) {
        if (com.kwad.sdk.core.response.b.c.bZ(this.mAdTemplate)) {
            c(view, 153);
        }
    }

    @Override // com.kwad.components.core.widget.b
    public final void b(AdTemplate adTemplate) {
        super.b((j) adTemplate);
        this.ek.setText(com.kwad.components.ad.feed.f.c(this.mAdTemplate));
        List<String> aT = com.kwad.sdk.core.response.b.a.aT(this.mAdInfo);
        this.mLogoView.ad(adTemplate);
        if (aT.size() > 0) {
            KSImageLoader.loadFeeImage(this.el, aT.get(0), this.mAdTemplate);
        } else {
            com.kwad.sdk.core.e.c.e("FeedTextImmerseImageView", "getImageUrlList size less than one");
        }
        com.kwad.sdk.d.a.a.a(this, this.ek, this.el, this.em);
        new com.kwad.sdk.widget.f(getContext(), this.ek, this);
        new com.kwad.sdk.widget.f(getContext(), this.el, this);
        new com.kwad.sdk.widget.f(getContext(), this.em, this);
        setOnClickListener(this);
        if (com.kwad.sdk.core.response.b.a.ax(this.mAdInfo)) {
            aZ();
        }
    }

    @Override // com.kwad.components.core.widget.b
    public final void ba() {
        ((RatioFrameLayout) findViewById(R.id.ksad_container)).setRatio(0.5600000023841858d);
        this.ek = (TextView) findViewById(R.id.ksad_ad_desc);
        this.el = (ImageView) findViewById(R.id.ksad_ad_image);
        this.em = (ImageView) findViewById(R.id.ksad_ad_dislike);
        this.mLogoView = (KsLogoView) findViewById(R.id.ksad_feed_logo);
    }

    @Override // com.kwad.components.core.widget.b
    public final int getLayoutId() {
        return R.layout.ksad_feed_text_immerse_image;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        c(view, view == this.ek ? 25 : view == this.el ? 100 : 35);
    }
}
