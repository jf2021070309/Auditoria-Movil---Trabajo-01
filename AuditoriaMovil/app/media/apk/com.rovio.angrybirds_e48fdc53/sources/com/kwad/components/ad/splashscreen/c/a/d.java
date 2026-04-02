package com.kwad.components.ad.splashscreen.c.a;

import android.graphics.BitmapFactory;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.ImageView;
import android.widget.TextView;
import com.kwad.components.ad.splashscreen.widget.CloseCountDownView;
import com.kwad.components.core.widget.KsLogoView;
import com.kwad.sdk.R;
import com.kwad.sdk.core.imageloader.KSImageLoader;
import com.kwad.sdk.core.imageloader.core.DisplayImageOptionsCompat;
import com.kwad.sdk.core.imageloader.core.decode.DecodedResult;
import com.kwad.sdk.core.imageloader.core.listener.SimpleImageLoadingListener;
import com.kwad.sdk.core.imageloader.utils.BlurUtils;
import com.kwad.sdk.core.response.model.AdInfo;
import com.kwad.sdk.core.response.model.AdMatrixInfo;
import com.kwad.sdk.core.response.model.AdTemplate;
import java.io.InputStream;
import org.json.JSONObject;
/* loaded from: classes.dex */
public final class d extends com.kwad.components.ad.splashscreen.c.e implements com.kwad.sdk.core.h.c {
    private TextView EA;
    private TextView EB;
    private CloseCountDownView Ep;
    private ImageView Es;
    private TextView Et;
    private TextView Eu;
    private ViewGroup Ex;
    private ImageView Ey;
    private KsLogoView Ez;

    private static void a(ImageView imageView, String str, AdTemplate adTemplate) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        KSImageLoader.loadImage(imageView, str, adTemplate, new DisplayImageOptionsCompat.Builder().setBlurRadius(20).build(), new SimpleImageLoadingListener() { // from class: com.kwad.components.ad.splashscreen.c.a.d.2
            @Override // com.kwad.sdk.core.imageloader.core.listener.SimpleImageLoadingListener, com.kwad.sdk.core.imageloader.core.listener.ImageLoadingListener
            public final boolean onDecode(String str2, InputStream inputStream, DecodedResult decodedResult) {
                decodedResult.mBitmap = BlurUtils.stackBlur(BitmapFactory.decodeStream(inputStream), 20, false);
                return true;
            }

            @Override // com.kwad.sdk.core.imageloader.core.listener.SimpleImageLoadingListener, com.kwad.sdk.core.imageloader.core.listener.ImageLoadingListener
            public final void onLoadingComplete(String str2, View view, DecodedResult decodedResult) {
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void ac(String str) {
        this.EA.setText(str);
    }

    private void initView() {
        ViewStub viewStub = (ViewStub) findViewById(R.id.ksad_splash_endcard_view_stub);
        this.Ex = (ViewGroup) (viewStub != null ? viewStub.inflate() : findViewById(R.id.ksad_splash_end_card_native_root));
        this.Ey = (ImageView) findViewById(R.id.ksad_splash_end_card_native_bg);
        this.Es = (ImageView) findViewById(R.id.ksad_ad_endcard_icon);
        this.Et = (TextView) findViewById(R.id.ksad_ad_endcard_appname);
        this.Eu = (TextView) findViewById(R.id.ksad_ad_endcard_appdesc);
        this.Ez = (KsLogoView) findViewById(R.id.ksad_ad_endcard_logo);
        this.EA = (TextView) findViewById(R.id.ksad_ad_btn_title);
        this.EB = (TextView) findViewById(R.id.ksad_ad_btn_sub_title);
        this.Ep = (CloseCountDownView) findViewById(R.id.ksad_ad_endcard_close_root);
    }

    private void lA() {
        this.Ex.setVisibility(0);
        AdInfo ck = com.kwad.sdk.core.response.b.d.ck(this.CS.mAdTemplate);
        a(this.Ey, com.kwad.sdk.core.response.b.a.aM(ck).materialUrl, this.CS.mAdTemplate);
        this.Es.setImageResource(R.drawable.ksad_default_app_icon);
        KSImageLoader.loadAppIcon(this.Es, com.kwad.sdk.core.response.b.a.bQ(ck), this.CS.mAdTemplate, 24);
        this.Et.setText(com.kwad.sdk.core.response.b.a.bO(ck));
        this.Eu.setText(com.kwad.sdk.core.response.b.a.an(ck));
        this.Ez.ad(this.CS.mAdTemplate);
        if (com.kwad.sdk.core.response.b.a.ax(ck)) {
            u(ck);
        } else {
            this.EA.setText("点击查看");
            this.EB.setVisibility(0);
            this.EB.setText("跳转详情页/第三方应用");
        }
        this.Ep.a(ck);
    }

    private void lz() {
        if (com.kwad.sdk.core.response.b.a.ax(com.kwad.sdk.core.response.b.d.ck(this.CS.mAdTemplate))) {
            com.kwad.components.ad.splashscreen.f.a aVar = new com.kwad.components.ad.splashscreen.f.a(getContext(), this.CS.mAdTemplate) { // from class: com.kwad.components.ad.splashscreen.c.a.d.1
                @Override // com.kwad.components.ad.splashscreen.f.a
                public final void aa(String str) {
                    d.this.ac(str);
                }
            };
            if (this.CS.mApkDownloadHelper != null) {
                this.CS.mApkDownloadHelper.b(aVar);
            }
        }
    }

    private void u(AdInfo adInfo) {
        if (this.CS.mApkDownloadHelper == null) {
            return;
        }
        int nA = this.CS.mApkDownloadHelper.nA();
        AdMatrixInfo.DownloadTexts cV = com.kwad.sdk.core.response.b.b.cV(adInfo);
        String str = nA != 8 ? nA != 12 ? cV.adActionDescription : cV.openAppLabel : cV.installAppLabel;
        if (TextUtils.isEmpty(str)) {
            this.EA.setText(com.kwad.sdk.core.response.b.a.aw(adInfo));
        } else {
            this.EA.setText(str);
        }
    }

    @Override // com.kwad.sdk.core.h.c
    public final void aK() {
        this.Ep.aK();
    }

    @Override // com.kwad.sdk.core.h.c
    public final void aL() {
        this.Ep.aL();
    }

    @Override // com.kwad.components.ad.splashscreen.c.e, com.kwad.sdk.mvp.Presenter
    public final void ah() {
        super.ah();
        this.CS.Cj.a(this);
        com.kwad.sdk.core.report.a.b(this.CS.mAdTemplate, 87, (JSONObject) null);
        lz();
        lA();
    }

    @Override // com.kwad.sdk.mvp.Presenter
    public final void onCreate() {
        super.onCreate();
        initView();
    }

    @Override // com.kwad.sdk.mvp.Presenter
    public final void onUnbind() {
        super.onUnbind();
        this.Ep.bd();
        this.CS.Cj.b(this);
    }
}
