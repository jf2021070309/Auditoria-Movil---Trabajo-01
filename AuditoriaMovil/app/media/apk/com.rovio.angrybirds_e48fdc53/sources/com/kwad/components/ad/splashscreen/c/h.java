package com.kwad.components.ad.splashscreen.c;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.net.Uri;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.bytedance.msdk.adapter.pangle.PangleAdapterUtils;
import com.kwad.components.ad.splashscreen.SplashPreloadManager;
import com.kwad.sdk.R;
import com.kwad.sdk.core.imageloader.KSImageLoader;
import com.kwad.sdk.core.imageloader.core.assist.FailReason;
import com.kwad.sdk.core.imageloader.core.decode.DecodedResult;
import com.kwad.sdk.core.imageloader.core.listener.ImageLoadingListener;
import com.kwad.sdk.core.imageloader.utils.BlurUtils;
import com.kwad.sdk.core.response.model.AdInfo;
import com.kwad.sdk.core.response.model.AdTemplate;
import com.kwad.sdk.core.threads.GlobalThreadPools;
import java.io.File;
import java.io.InputStream;
/* loaded from: classes.dex */
public final class h extends e {
    private ImageView CV;
    private ImageView CW;
    private boolean CX = false;
    private AdInfo mAdInfo;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.kwad.components.ad.splashscreen.c.h$1  reason: invalid class name */
    /* loaded from: classes.dex */
    public final class AnonymousClass1 implements ImageLoadingListener {
        AnonymousClass1() {
        }

        @Override // com.kwad.sdk.core.imageloader.core.listener.ImageLoadingListener
        public final boolean onDecode(String str, InputStream inputStream, DecodedResult decodedResult) {
            return false;
        }

        @Override // com.kwad.sdk.core.imageloader.core.listener.ImageLoadingListener
        public final void onLoadingCancelled(String str, View view) {
        }

        @Override // com.kwad.sdk.core.imageloader.core.listener.ImageLoadingListener
        public final void onLoadingComplete(String str, View view, final DecodedResult decodedResult) {
            h.this.CW.setVisibility(0);
            GlobalThreadPools.CQ().submit(new Runnable() { // from class: com.kwad.components.ad.splashscreen.c.h.1.1
                @Override // java.lang.Runnable
                public final void run() {
                    final Bitmap stackBlur = BlurUtils.stackBlur(decodedResult.mBitmap, 20, false);
                    h.this.CW.post(new Runnable() { // from class: com.kwad.components.ad.splashscreen.c.h.1.1.1
                        @Override // java.lang.Runnable
                        public final void run() {
                            h.this.CW.setImageDrawable(new BitmapDrawable(h.this.getContext().getResources(), stackBlur));
                        }
                    });
                }
            });
        }

        @Override // com.kwad.sdk.core.imageloader.core.listener.ImageLoadingListener
        public final void onLoadingFailed(String str, View view, FailReason failReason) {
            if (h.this.CX) {
                return;
            }
            h.this.CS.g(0, "load image error");
        }

        @Override // com.kwad.sdk.core.imageloader.core.listener.ImageLoadingListener
        public final void onLoadingStarted(String str, View view) {
        }
    }

    private void a(final ImageView imageView) {
        ((FrameLayout) this.CS.mRootContainer.findViewById(R.id.splash_play_card_view)).setClipChildren(false);
        imageView.post(new Runnable() { // from class: com.kwad.components.ad.splashscreen.c.h.4
            @Override // java.lang.Runnable
            public final void run() {
                float width = imageView.getWidth() / 1080.0f;
                float f = width * 2340.0f;
                float height = imageView.getHeight();
                float f2 = (f - height) / 2.0f;
                float f3 = f - (((width * 880.0f) * 1152.0f) / 880.0f);
                float f4 = (f3 * 0.5589225f) - f2;
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) imageView.getLayoutParams();
                marginLayoutParams.topMargin = (int) (((f4 - ((0.44107744f * f3) - f2)) / 2.0f) - (height * 0.03f));
                imageView.setLayoutParams(marginLayoutParams);
            }
        });
    }

    private void a(final ImageView imageView, final AdInfo adInfo) {
        ((FrameLayout) this.CS.mRootContainer.findViewById(R.id.splash_play_card_view)).setClipChildren(false);
        final AdInfo.CutRuleInfo bT = com.kwad.sdk.core.response.b.a.bT(adInfo);
        imageView.post(new Runnable() { // from class: com.kwad.components.ad.splashscreen.c.h.3
            @Override // java.lang.Runnable
            public final void run() {
                int height = imageView.getHeight();
                int width = imageView.getWidth();
                double d = com.kwad.sdk.core.response.b.a.aM(adInfo).width;
                double d2 = bT.picHeight;
                double d3 = bT.viewTopMargin;
                double d4 = bT.safeAreaHeight;
                if (d2 <= PangleAdapterUtils.CPM_DEFLAUT_VALUE || d4 <= PangleAdapterUtils.CPM_DEFLAUT_VALUE) {
                    return;
                }
                double d5 = width / d;
                double d6 = d3 / (d2 - d4);
                double d7 = d3 * d5;
                double d8 = (d2 * d5) - height;
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) imageView.getLayoutParams();
                marginLayoutParams.topMargin = (int) (((d8 / 2.0d) - (d7 - (d7 - (d6 * d8)))) * 2.0d);
                imageView.setLayoutParams(marginLayoutParams);
            }
        });
    }

    private void k(String str, int i) {
        ImageView imageView;
        AdTemplate adTemplate;
        ImageLoadingListener imageLoadingListener;
        if (i == 0) {
            this.CV.setScaleType(ImageView.ScaleType.CENTER_CROP);
            this.CV.setVisibility(0);
            imageView = this.CV;
            adTemplate = this.CS.mAdTemplate;
            imageLoadingListener = new AnonymousClass1();
        } else {
            this.CW.setVisibility(0);
            if (com.kwad.sdk.core.config.d.a(com.kwad.components.ad.splashscreen.b.a.CE)) {
                a(this.CW, this.mAdInfo);
            } else {
                a(this.CW);
            }
            imageView = this.CW;
            adTemplate = this.CS.mAdTemplate;
            imageLoadingListener = new ImageLoadingListener() { // from class: com.kwad.components.ad.splashscreen.c.h.2
                @Override // com.kwad.sdk.core.imageloader.core.listener.ImageLoadingListener
                public final boolean onDecode(String str2, InputStream inputStream, DecodedResult decodedResult) {
                    return false;
                }

                @Override // com.kwad.sdk.core.imageloader.core.listener.ImageLoadingListener
                public final void onLoadingCancelled(String str2, View view) {
                }

                @Override // com.kwad.sdk.core.imageloader.core.listener.ImageLoadingListener
                public final void onLoadingComplete(String str2, View view, DecodedResult decodedResult) {
                }

                @Override // com.kwad.sdk.core.imageloader.core.listener.ImageLoadingListener
                public final void onLoadingFailed(String str2, View view, FailReason failReason) {
                    if (h.this.CX) {
                        return;
                    }
                    h.this.CS.g(0, "load image error");
                }

                @Override // com.kwad.sdk.core.imageloader.core.listener.ImageLoadingListener
                public final void onLoadingStarted(String str2, View view) {
                }
            };
        }
        KSImageLoader.loadImage(imageView, str, adTemplate, imageLoadingListener);
    }

    @Override // com.kwad.components.ad.splashscreen.c.e, com.kwad.sdk.mvp.Presenter
    public final void ah() {
        super.ah();
        this.CW = (ImageView) this.CS.mRootContainer.findViewById(R.id.ksad_splash_background);
        this.CV = (ImageView) this.CS.mRootContainer.findViewById(R.id.ksad_splash_foreground);
        AdInfo ck = com.kwad.sdk.core.response.b.d.ck(this.CS.mAdTemplate);
        this.mAdInfo = ck;
        String str = com.kwad.sdk.core.response.b.a.aM(ck).materialUrl;
        this.CW.setVisibility(0);
        int i = com.kwad.sdk.core.response.b.a.aM(this.mAdInfo).source;
        if (getContext() != null) {
            SplashPreloadManager.kD();
            File X = SplashPreloadManager.X(this.mAdInfo.adPreloadInfo.preloadId);
            if (X != null && X.exists() && X.length() > 0) {
                str = Uri.fromFile(X).toString();
            }
            k(str, i);
        }
    }

    @Override // com.kwad.sdk.mvp.Presenter
    public final void onDestroy() {
        super.onDestroy();
        this.CX = true;
    }

    @Override // com.kwad.sdk.mvp.Presenter
    public final void onUnbind() {
        super.onUnbind();
    }
}
