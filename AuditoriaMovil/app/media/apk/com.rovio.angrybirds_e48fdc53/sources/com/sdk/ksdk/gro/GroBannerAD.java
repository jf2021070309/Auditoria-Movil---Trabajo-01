package com.sdk.ksdk.gro;

import android.app.Activity;
import android.content.res.Configuration;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.bytedance.msdk.api.AdError;
import com.bytedance.msdk.api.v2.GMMediationAdSdk;
import com.bytedance.msdk.api.v2.GMSettingConfigCallback;
import com.bytedance.msdk.api.v2.ad.banner.GMBannerAd;
import com.bytedance.msdk.api.v2.ad.banner.GMBannerAdListener;
import com.bytedance.msdk.api.v2.ad.banner.GMBannerAdLoadCallback;
import com.bytedance.msdk.api.v2.slot.GMAdSlotBanner;
import com.sdk.ksdk.listener.BannerListener;
import com.sdk.ksdk.util.GetResourcesUtil;
import com.sdk.ksdk.util.Var;
/* loaded from: classes3.dex */
public class GroBannerAD {
    private FrameLayout mBannerContainer;
    private GMBannerAd mBannerViewAd;

    public void loadBanner(final Activity activity, final String id, final BannerListener listener) {
        activity.runOnUiThread(new Runnable() { // from class: com.sdk.ksdk.gro.GroBannerAD.1
            @Override // java.lang.Runnable
            public void run() {
                ViewGroup view = (ViewGroup) activity.getWindow().getDecorView();
                GroBannerAD groBannerAD = GroBannerAD.this;
                Activity activity2 = activity;
                groBannerAD.mBannerContainer = (FrameLayout) View.inflate(activity2, GetResourcesUtil.getResource(activity2, "layout", "banner_layout"), view).findViewById(GetResourcesUtil.getResource(activity, "id", "banner_container"));
            }
        });
        if (GMMediationAdSdk.configLoadSuccess()) {
            loadBannerAd(activity, id, listener);
        } else {
            GMMediationAdSdk.registerConfigCallback(new GMSettingConfigCallback() { // from class: com.sdk.ksdk.gro.GroBannerAD.2
                @Override // com.bytedance.msdk.api.v2.GMSettingConfigCallback
                public void configLoad() {
                    GroBannerAD.this.loadBannerAd(activity, id, listener);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void loadBannerAd(Activity activity, String id, final BannerListener listener) {
        int widthSize;
        GMBannerAd gMBannerAd = this.mBannerViewAd;
        if (gMBannerAd != null) {
            gMBannerAd.destroy();
        }
        GMBannerAd gMBannerAd2 = new GMBannerAd(activity, id);
        this.mBannerViewAd = gMBannerAd2;
        gMBannerAd2.setAdBannerListener(new GMBannerAdListener() { // from class: com.sdk.ksdk.gro.GroBannerAD.3
            @Override // com.bytedance.msdk.api.v2.ad.banner.GMBannerAdListener
            public void onAdClicked() {
                Log.d(Var.TAG, "mBanner,onAdClicked");
                BannerListener bannerListener = listener;
                if (bannerListener != null) {
                    bannerListener.bannerClick();
                }
            }

            @Override // com.bytedance.msdk.api.v2.ad.banner.GMBannerAdListener
            public void onAdClosed() {
                Log.d(Var.TAG, "mBanner,onAdClosed");
                GroBannerAD.this.removeView();
                if (GroBannerAD.this.mBannerViewAd != null) {
                    GroBannerAD.this.mBannerViewAd.destroy();
                }
            }

            @Override // com.bytedance.msdk.api.v2.ad.banner.GMBannerAdListener
            public void onAdLeftApplication() {
                Log.d(Var.TAG, "mBanner,onAdLeftApplication");
            }

            @Override // com.bytedance.msdk.api.v2.ad.banner.GMBannerAdListener
            public void onAdOpened() {
                Log.d(Var.TAG, "mBanner,onAdOpened");
            }

            @Override // com.bytedance.msdk.api.v2.ad.banner.GMBannerAdListener
            public void onAdShow() {
                Log.d(Var.TAG, "mBanner,onAdShow");
                BannerListener bannerListener = listener;
                if (bannerListener != null) {
                    bannerListener.bannerShow();
                }
            }

            @Override // com.bytedance.msdk.api.v2.ad.banner.GMBannerAdListener
            public void onAdShowFail(AdError adError) {
                Log.d(Var.TAG, "mBanner,onAdShowFail:" + adError.toString());
                BannerListener bannerListener = listener;
                if (bannerListener != null) {
                    bannerListener.bannerError(adError.toString());
                }
            }
        });
        Configuration mConfiguration = activity.getResources().getConfiguration();
        boolean isPort = mConfiguration.orientation == 1;
        DisplayMetrics dm = activity.getResources().getDisplayMetrics();
        if (isPort) {
            widthSize = dm.widthPixels;
        } else {
            widthSize = 300;
        }
        Log.d(Var.TAG, "mBanner,widthSize:" + widthSize);
        GMAdSlotBanner slotBanner = new GMAdSlotBanner.Builder().setBannerSize(6).setImageAdSize(widthSize, 45).build();
        this.mBannerViewAd.loadAd(slotBanner, new GMBannerAdLoadCallback() { // from class: com.sdk.ksdk.gro.GroBannerAD.4
            @Override // com.bytedance.msdk.api.v2.ad.banner.GMBannerAdLoadCallback
            public void onAdFailedToLoad(AdError adError) {
                GroBannerAD.this.removeView();
            }

            @Override // com.bytedance.msdk.api.v2.ad.banner.GMBannerAdLoadCallback
            public void onAdLoaded() {
                GroBannerAD.this.showBannerAd();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void showBannerAd() {
        View view;
        if (this.mBannerViewAd != null) {
            removeView();
            if (this.mBannerViewAd.isReady() && (view = this.mBannerViewAd.getBannerView()) != null) {
                this.mBannerContainer.addView(view);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeView() {
        FrameLayout frameLayout = this.mBannerContainer;
        if (frameLayout == null) {
            return;
        }
        frameLayout.removeAllViews();
    }
}
