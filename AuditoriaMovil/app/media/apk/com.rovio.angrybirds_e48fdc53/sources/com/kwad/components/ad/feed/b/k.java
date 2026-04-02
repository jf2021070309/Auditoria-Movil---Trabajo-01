package com.kwad.components.ad.feed.b;

import android.content.Context;
import android.os.SystemClock;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.kwad.components.ad.widget.DownloadProgressView;
import com.kwad.components.core.e.d.a;
import com.kwad.components.core.widget.KsLogoView;
import com.kwad.sdk.R;
import com.kwad.sdk.core.imageloader.KSImageLoader;
import com.kwad.sdk.core.page.widget.RoundAngleImageView;
import com.kwad.sdk.core.response.model.AdTemplate;
import com.kwad.sdk.widget.RatioFrameLayout;
import java.util.List;
/* loaded from: classes.dex */
public final class k extends a implements View.OnClickListener, com.kwad.sdk.widget.c {
    private TextView ek;
    private ImageView em;
    private DownloadProgressView er;
    private RoundAngleImageView ff;
    private com.kwad.components.core.e.d.c mApkDownloadHelper;
    private KsLogoView mLogoView;

    public k(Context context) {
        super(context);
    }

    private void bc() {
        this.mLogoView.ad(this.mAdTemplate);
        this.er.K(this.mAdTemplate);
        com.kwad.sdk.d.a.a.a(this, this.ek, this.ff, this.er);
        new com.kwad.sdk.widget.f(getContext(), this.ek, this);
        new com.kwad.sdk.widget.f(getContext(), this.ff, this);
        new com.kwad.sdk.widget.f(getContext(), this.er, this);
        if (com.kwad.sdk.core.response.b.a.ax(this.mAdInfo)) {
            com.kwad.components.core.e.d.c cVar = new com.kwad.components.core.e.d.c(this.mAdTemplate, null, this.er.getAppDownloadListener());
            this.mApkDownloadHelper = cVar;
            cVar.d(this.er.getAppDownloadListener());
            this.mApkDownloadHelper.setOnShowListener(this);
            this.mApkDownloadHelper.setOnDismissListener(this);
            aZ();
        }
    }

    private void c(View view, final int i) {
        if (view == this.em) {
            sp();
        } else {
            com.kwad.components.core.e.d.a.a(new a.C0197a(getContext()).am(5).an(i).S(this.mAdTemplate).b(this.mApkDownloadHelper).ao(view == this.er ? 1 : 2).al(view == this.er).a(new a.b() { // from class: com.kwad.components.ad.feed.b.k.1
                @Override // com.kwad.components.core.e.d.a.b
                public final void onAdClicked() {
                    k.this.aK(i);
                }
            }));
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
        super.b((k) adTemplate);
        this.ek.setText(com.kwad.components.ad.feed.f.c(this.mAdTemplate));
        List<String> aT = com.kwad.sdk.core.response.b.a.aT(this.mAdInfo);
        if (aT.size() > 0) {
            this.eh = SystemClock.elapsedRealtime();
            KSImageLoader.loadFeeImage(this.ff, aT.get(0), this.mAdTemplate, this.ei);
        } else {
            com.kwad.sdk.core.e.c.e("FeedTextLeftImageView", "getImageUrlList size less than one");
        }
        bc();
        this.em.setOnClickListener(this);
        setOnClickListener(this);
    }

    @Override // com.kwad.components.core.widget.b
    public final void ba() {
        this.ek = (TextView) findViewById(R.id.ksad_ad_desc);
        ((RatioFrameLayout) findViewById(R.id.ksad_image_container)).setRatio(0.6600000262260437d);
        RoundAngleImageView roundAngleImageView = (RoundAngleImageView) findViewById(R.id.ksad_ad_image);
        this.ff = roundAngleImageView;
        roundAngleImageView.setRadius(com.kwad.sdk.d.a.a.a(getContext(), 3.0f));
        this.em = (ImageView) findViewById(R.id.ksad_ad_dislike);
        this.er = (DownloadProgressView) findViewById(R.id.ksad_app_download_btn);
        this.mLogoView = (KsLogoView) findViewById(R.id.ksad_feed_logo);
    }

    @Override // com.kwad.components.core.widget.b
    public final void bd() {
        super.bd();
        com.kwad.components.core.e.d.c cVar = this.mApkDownloadHelper;
        if (cVar != null) {
            cVar.c(this.er.getAppDownloadListener());
        }
    }

    @Override // com.kwad.components.core.widget.b
    public final int getLayoutId() {
        return R.layout.ksad_feed_text_left_image;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        c(view, view == this.ek ? 25 : view == this.ff ? 100 : view == this.er ? 1 : 35);
    }
}
