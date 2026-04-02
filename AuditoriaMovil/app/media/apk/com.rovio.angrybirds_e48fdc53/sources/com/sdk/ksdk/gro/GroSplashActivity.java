package com.sdk.ksdk.gro;

import android.app.Activity;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.widget.FrameLayout;
import com.bytedance.msdk.adapter.util.UIUtils;
import com.bytedance.msdk.api.AdError;
import com.bytedance.msdk.api.v2.GMNetworkRequestInfo;
import com.bytedance.msdk.api.v2.ad.splash.GMSplashAd;
import com.bytedance.msdk.api.v2.ad.splash.GMSplashAdListener;
import com.bytedance.msdk.api.v2.ad.splash.GMSplashAdLoadCallback;
import com.bytedance.msdk.api.v2.slot.GMAdSlotSplash;
import com.sdk.ksdk.util.GetResourcesUtil;
import com.sdk.ksdk.util.Var;
/* loaded from: classes3.dex */
public class GroSplashActivity extends Activity {
    public static final String EXTRA_FORCE_LOAD_BOTTOM = "extra_force_load_bottom";
    private static final String TAG = "AppConst.TAG_PRE" + GroSplashActivity.class.getSimpleName();
    private String mAdUnitId = "";
    private GMSplashAdLoadCallback mGMSplashAdLoadCallback;
    private GMSplashAd mSplashAd;
    private GMSplashAdListener mSplashAdListener;
    private FrameLayout mSplashContainer;

    @Override // android.app.Activity
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().addFlags(2621440);
        setContentView(GetResourcesUtil.getResource(this, "layout", "activity_splash_gro"));
        this.mSplashContainer = (FrameLayout) findViewById(GetResourcesUtil.getResource(this, "id", "splash_container"));
        String stringExtra = getIntent().getStringExtra(Var.KEY_SPLASH_AD_UNIT_ID);
        this.mAdUnitId = stringExtra;
        if (TextUtils.isEmpty(stringExtra)) {
            finish();
        }
        initListener();
        initAdLoader();
        loadSplashAd();
    }

    public void initListener() {
        this.mGMSplashAdLoadCallback = new GMSplashAdLoadCallback() { // from class: com.sdk.ksdk.gro.GroSplashActivity.1
            @Override // com.bytedance.msdk.api.v2.ad.splash.GMSplashAdLoadCallback
            public void onSplashAdLoadFail(AdError adError) {
                String str = GroSplashActivity.TAG;
                Log.e(str, "load splash ad error : " + adError.code + ", " + adError.message);
                GroSplashActivity.this.goToMainActivity();
            }

            @Override // com.bytedance.msdk.api.v2.ad.splash.GMSplashAdLoadCallback
            public void onSplashAdLoadSuccess() {
                Log.e(GroSplashActivity.TAG, "load splash ad success ");
                GroSplashActivity.this.mSplashAd.showAd(GroSplashActivity.this.mSplashContainer);
            }

            @Override // com.bytedance.msdk.api.v2.ad.splash.GMSplashAdLoadCallback
            public void onAdLoadTimeout() {
            }
        };
        this.mSplashAdListener = new GMSplashAdListener() { // from class: com.sdk.ksdk.gro.GroSplashActivity.2
            @Override // com.bytedance.msdk.api.v2.ad.splash.GMSplashAdListener
            public void onAdClicked() {
                Log.d(GroSplashActivity.TAG, "onAdClicked");
            }

            @Override // com.bytedance.msdk.api.v2.ad.splash.GMSplashAdListener
            public void onAdShow() {
                Log.d(GroSplashActivity.TAG, "onAdShow");
            }

            @Override // com.bytedance.msdk.api.v2.ad.splash.GMSplashAdListener
            public void onAdShowFail(AdError adError) {
                Log.d(GroSplashActivity.TAG, "onAdShowFail");
            }

            @Override // com.bytedance.msdk.api.v2.ad.splash.GMSplashAdListener
            public void onAdSkip() {
                Log.d(GroSplashActivity.TAG, "onAdSkip");
                GroSplashActivity.this.goToMainActivity();
            }

            @Override // com.bytedance.msdk.api.v2.ad.splash.GMSplashAdListener
            public void onAdDismiss() {
                Log.d(GroSplashActivity.TAG, "onAdDismiss");
                GroSplashActivity.this.goToMainActivity();
            }
        };
    }

    public void initAdLoader() {
    }

    public void loadSplashAd() {
        GMSplashAd gMSplashAd = new GMSplashAd(this, this.mAdUnitId);
        this.mSplashAd = gMSplashAd;
        gMSplashAd.setAdSplashListener(this.mSplashAdListener);
        GMAdSlotSplash adSlot = new GMAdSlotSplash.Builder().setImageAdSize(UIUtils.getScreenWidth(this), UIUtils.getScreenHeight(this)).build();
        GMNetworkRequestInfo networkRequestInfo = SplashUtils.getGMNetworkRequestInfo();
        this.mSplashAd.loadAd(adSlot, networkRequestInfo, this.mGMSplashAdLoadCallback);
    }

    @Override // android.app.Activity
    protected void onDestroy() {
        super.onDestroy();
        GMSplashAd gMSplashAd = this.mSplashAd;
        if (gMSplashAd != null) {
            gMSplashAd.destroy();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void goToMainActivity() {
        finish();
    }
}
