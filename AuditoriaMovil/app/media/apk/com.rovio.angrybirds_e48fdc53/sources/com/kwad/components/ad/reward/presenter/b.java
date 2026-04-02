package com.kwad.components.ad.reward.presenter;

import android.graphics.BitmapFactory;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import com.kwad.sdk.R;
import com.kwad.sdk.core.imageloader.KSImageLoader;
import com.kwad.sdk.core.imageloader.core.DisplayImageOptionsCompat;
import com.kwad.sdk.core.imageloader.core.decode.DecodedResult;
import com.kwad.sdk.core.imageloader.core.listener.SimpleImageLoadingListener;
import com.kwad.sdk.core.imageloader.utils.BlurUtils;
import com.kwad.sdk.core.response.model.AdInfo;
import com.kwad.sdk.core.response.model.AdTemplate;
import com.kwad.sdk.utils.ai;
import java.io.InputStream;
/* loaded from: classes.dex */
public class b extends a {
    private ImageView sc;
    private AdInfo sd;

    public b(AdInfo adInfo) {
        this.sd = adInfo;
    }

    private static void a(ImageView imageView, String str, AdTemplate adTemplate) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        KSImageLoader.loadImage(imageView, str, adTemplate, new DisplayImageOptionsCompat.Builder().setBlurRadius(50).build(), new SimpleImageLoadingListener() { // from class: com.kwad.components.ad.reward.presenter.b.1
            @Override // com.kwad.sdk.core.imageloader.core.listener.SimpleImageLoadingListener, com.kwad.sdk.core.imageloader.core.listener.ImageLoadingListener
            public final boolean onDecode(String str2, InputStream inputStream, DecodedResult decodedResult) {
                decodedResult.mBitmap = BlurUtils.stackBlur(BitmapFactory.decodeStream(inputStream), 50, false);
                return true;
            }

            @Override // com.kwad.sdk.core.imageloader.core.listener.SimpleImageLoadingListener, com.kwad.sdk.core.imageloader.core.listener.ImageLoadingListener
            public final void onLoadingComplete(String str2, View view, DecodedResult decodedResult) {
            }
        });
    }

    @Override // com.kwad.components.ad.reward.presenter.a, com.kwad.sdk.mvp.Presenter
    public final void ah() {
        super.ah();
        AdTemplate adTemplate = this.qB.mAdTemplate;
        if (hz() || adTemplate.adInfoList.size() <= 0) {
            return;
        }
        String P = com.kwad.sdk.core.response.b.a.P(adTemplate.adInfoList.get(0));
        this.sc.setVisibility(hB());
        try {
            a(this.sc, P, adTemplate);
        } catch (Throwable th) {
            com.kwad.sdk.core.e.c.printStackTrace(th);
        }
    }

    protected int hA() {
        return R.id.ksad_blur_video_cover;
    }

    protected int hB() {
        getContext();
        if (!com.kwad.components.ad.reward.j.u(this.qB.mAdTemplate) || ai.IK()) {
            if (!com.kwad.components.ad.reward.j.t(this.qB.mAdTemplate) || ai.IK()) {
                if ((!com.kwad.sdk.core.response.b.d.cx(this.qB.mAdTemplate) || ai.IK()) && !com.kwad.components.ad.reward.j.g(this.sd)) {
                    return (com.kwad.sdk.core.response.b.a.co(this.sd) && com.kwad.components.ad.reward.a.b.gR() && !ai.IK()) ? 0 : 8;
                }
                return 0;
            }
            return 0;
        }
        return 0;
    }

    @Override // com.kwad.sdk.mvp.Presenter
    public final void onCreate() {
        super.onCreate();
        this.sc = (ImageView) findViewById(hA());
    }
}
