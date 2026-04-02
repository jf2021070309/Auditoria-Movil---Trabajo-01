package com.kwad.components.ad.interstitial.d;

import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.kwad.components.ad.widget.KsPriceView;
import com.kwad.sdk.R;
import com.kwad.sdk.core.imageloader.KSImageLoader;
import com.kwad.sdk.core.response.model.AdInfo;
import com.kwad.sdk.core.response.model.AdProductInfo;
import com.kwad.sdk.core.response.model.AdTemplate;
/* loaded from: classes.dex */
public final class k extends com.kwad.components.ad.interstitial.d.b {
    private static int lk = 4;
    private c jh;
    private a li = new a();
    private b lj = new b();
    private AdInfo mAdInfo;
    private AdTemplate mAdTemplate;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class a {
        private ImageView ll;
        private TextView lm;
        private TextView ln;
        private KsPriceView lo;

        a() {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class b {
        private String appIconUrl;
        private String lp;
        private CharSequence lq;
        private String lr;
        private String ls;
        private String price;

        b() {
        }

        public final void a(CharSequence charSequence) {
            this.lq = charSequence;
        }

        public final String ef() {
            return this.lp;
        }

        public final CharSequence eg() {
            return this.lq;
        }

        public final String eh() {
            return this.lr;
        }

        public final String ei() {
            return this.ls;
        }

        public final String getAppIconUrl() {
            return this.appIconUrl;
        }

        public final String getPrice() {
            return this.price;
        }

        public final void t(String str) {
            this.appIconUrl = str;
        }

        public final void u(String str) {
            this.lp = str;
        }

        public final void v(String str) {
            this.lr = str;
        }

        public final void w(String str) {
            this.price = str;
        }

        public final void x(String str) {
            this.ls = str;
        }
    }

    private void a(a aVar, b bVar, AdInfo adInfo, AdTemplate adTemplate) {
        ImageView imageView = aVar.ll;
        if (TextUtils.isEmpty(bVar.getAppIconUrl())) {
            imageView.setVisibility(8);
        } else {
            imageView.setVisibility(0);
            if (com.kwad.sdk.core.response.b.a.bL(adInfo) == 2) {
                KSImageLoader.loadCircleIcon(imageView, bVar.getAppIconUrl(), getContext().getResources().getDrawable(R.drawable.ksad_default_app_icon));
            } else {
                imageView.setImageResource(R.drawable.ksad_default_app_icon);
                KSImageLoader.loadWithRadius(imageView, bVar.getAppIconUrl(), adTemplate, lk);
            }
        }
        aVar.lm.setText(bVar.ef());
        if (com.kwad.components.ad.interstitial.a.b.cI() && com.kwad.sdk.core.response.b.a.bL(adInfo) == 3) {
            aVar.lo.d(bVar.getPrice(), bVar.eh(), true);
            aVar.lo.setVisibility(0);
            aVar.ln.setVisibility(8);
            ee();
        } else {
            aVar.ln.setText(bVar.eg());
        }
        this.jh.ji.g(bVar.ei(), 0);
    }

    private void d(AdInfo adInfo) {
        b bVar;
        String string;
        b bVar2;
        String string2;
        if (com.kwad.sdk.core.response.b.a.bL(adInfo) == 2) {
            this.lj.t(com.kwad.sdk.core.response.b.a.ct(adInfo));
            this.lj.u(com.kwad.sdk.core.response.b.a.bP(adInfo));
            CharSequence e = com.kwad.sdk.core.response.b.a.e(adInfo, com.kwad.components.core.widget.e.Zg);
            if (TextUtils.isEmpty(e)) {
                e = com.kwad.sdk.core.response.b.a.cs(adInfo);
            }
            this.lj.a(e);
            if (com.kwad.sdk.core.response.b.a.cp(adInfo)) {
                this.lj.x(com.kwad.components.ad.d.b.V());
            } else {
                this.lj.x(com.kwad.components.ad.d.b.Y());
            }
        } else if (com.kwad.components.ad.interstitial.a.b.cI() && com.kwad.sdk.core.response.b.a.bL(adInfo) == 3) {
            AdProductInfo cy = com.kwad.sdk.core.response.b.a.cy(adInfo);
            this.lj.t(cy.icon);
            this.lj.u(cy.name);
            this.lj.v(cy.originPrice);
            this.lj.w(cy.price);
            this.lj.x(com.kwad.components.ad.d.b.W());
        } else if (com.kwad.sdk.core.response.b.a.ax(adInfo)) {
            this.lj.t(com.kwad.sdk.core.response.b.a.bQ(adInfo));
            if (!TextUtils.isEmpty(com.kwad.sdk.core.response.b.a.ao(adInfo))) {
                bVar2 = this.lj;
                string2 = com.kwad.sdk.core.response.b.a.ao(adInfo);
            } else if (TextUtils.isEmpty(adInfo.advertiserInfo.adAuthorText)) {
                bVar2 = this.lj;
                string2 = getContext().getString(R.string.ksad_ad_default_username_normal);
            } else {
                bVar2 = this.lj;
                string2 = adInfo.advertiserInfo.adAuthorText;
            }
            bVar2.u(string2);
            this.lj.a(com.kwad.sdk.core.response.b.a.an(adInfo));
            this.lj.x(com.kwad.sdk.core.response.b.a.aw(adInfo));
        } else {
            this.lj.t(com.kwad.sdk.core.response.b.a.bQ(adInfo));
            if (!TextUtils.isEmpty(com.kwad.sdk.core.response.b.a.ap(adInfo))) {
                bVar = this.lj;
                string = com.kwad.sdk.core.response.b.a.ap(adInfo);
            } else if (TextUtils.isEmpty(adInfo.advertiserInfo.adAuthorText)) {
                bVar = this.lj;
                string = getContext().getString(R.string.ksad_ad_default_username_normal);
            } else {
                bVar = this.lj;
                string = adInfo.advertiserInfo.adAuthorText;
            }
            bVar.u(string);
            this.lj.a(com.kwad.sdk.core.response.b.a.an(adInfo));
            this.lj.x(com.kwad.sdk.core.response.b.a.aw(adInfo));
        }
    }

    private void ee() {
        View findViewById = this.jh.ji.findViewById(R.id.ksad_ad_desc_layout);
        View findViewById2 = this.jh.ji.findViewById(R.id.ksad_space);
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) findViewById.getLayoutParams();
        layoutParams.weight = 2.68f;
        findViewById.setLayoutParams(layoutParams);
        findViewById2.setVisibility(8);
    }

    @Override // com.kwad.components.ad.interstitial.d.b, com.kwad.sdk.mvp.Presenter
    public final void ah() {
        super.ah();
        c cVar = (c) Gh();
        this.jh = cVar;
        this.mAdTemplate = cVar.mAdTemplate;
        this.mAdInfo = com.kwad.sdk.core.response.b.d.ck(this.jh.mAdTemplate);
        this.li.ll = (ImageView) this.jh.ji.findViewById(R.id.ksad_app_icon);
        this.li.lm = (TextView) this.jh.ji.findViewById(R.id.ksad_app_title);
        this.li.ln = (TextView) this.jh.ji.findViewById(R.id.ksad_app_desc);
        this.li.lo = (KsPriceView) this.jh.ji.findViewById(R.id.ksad_product_price);
        d(this.mAdInfo);
        a(this.li, this.lj, this.mAdInfo, this.mAdTemplate);
    }

    @Override // com.kwad.sdk.mvp.Presenter
    public final void onCreate() {
        super.onCreate();
    }

    @Override // com.kwad.sdk.mvp.Presenter
    public final void onUnbind() {
        super.onUnbind();
    }
}
