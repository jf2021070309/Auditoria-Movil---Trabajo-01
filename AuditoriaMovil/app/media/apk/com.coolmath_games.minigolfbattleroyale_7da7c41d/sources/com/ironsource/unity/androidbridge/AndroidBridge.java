package com.ironsource.unity.androidbridge;

import android.app.Activity;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.facebook.internal.NativeProtocol;
import com.fyber.inneractive.sdk.external.InneractiveMediationDefs;
import com.ironsource.adapters.supersonicads.SupersonicConfig;
import com.ironsource.mediationsdk.ISBannerSize;
import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.IronSourceBannerLayout;
import com.ironsource.mediationsdk.IronSourceSegment;
import com.ironsource.mediationsdk.config.ConfigFile;
import com.ironsource.mediationsdk.impressionData.ImpressionData;
import com.ironsource.mediationsdk.impressionData.ImpressionDataListener;
import com.ironsource.mediationsdk.integration.IntegrationHelper;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.model.Placement;
import com.ironsource.mediationsdk.sdk.BannerListener;
import com.ironsource.mediationsdk.sdk.ISDemandOnlyInterstitialListener;
import com.ironsource.mediationsdk.sdk.ISDemandOnlyRewardedVideoListener;
import com.ironsource.mediationsdk.sdk.InterstitialListener;
import com.ironsource.mediationsdk.sdk.OfferwallListener;
import com.ironsource.mediationsdk.sdk.RewardedVideoListener;
import com.ironsource.mediationsdk.sdk.SegmentListener;
import com.unity3d.player.UnityPlayer;
import com.vungle.warren.model.AdvertisementDBAdapter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: classes2.dex */
public class AndroidBridge implements InterstitialListener, ISDemandOnlyInterstitialListener, OfferwallListener, RewardedVideoListener, ISDemandOnlyRewardedVideoListener, SegmentListener, ImpressionDataListener {
    private static final String GitHash = "683a709b";
    private static final AndroidBridge mInstance = new AndroidBridge();
    private IronSourceBannerLayout mBanner;
    private FrameLayout mBannerContainer;
    private boolean mIsBannerLoaded;
    private boolean mIsInitBannerCalled;
    private Handler mUIHandler;
    private final String IRONSOURCE_EVENT_GAMEOBJECT = "IronSourceEvents";
    private final String ERROR_CODE = "error_code";
    private final String ERROR_DESCRIPTION = NativeProtocol.BRIDGE_ARG_ERROR_DESCRIPTION;
    private final String PLACEMENT_NAME = "placement_name";
    private final String REWARD_NAME = "reward_name";
    private final String REWARD_AMOUNT = "reward_amount";
    private final int BANNER_POSITION_TOP = 1;

    static /* synthetic */ void access$800(AndroidBridge androidBridge, String str, String str2) {
        androidBridge.sendUnityEvent(str, str2);
    }

    public static synchronized AndroidBridge getInstance() {
        AndroidBridge androidBridge;
        synchronized (AndroidBridge.class) {
            androidBridge = mInstance;
        }
        return androidBridge;
    }

    private AndroidBridge() {
        IronSource.setRewardedVideoListener(this);
        IronSource.setInterstitialListener(this);
        IronSource.setOfferwallListener(this);
        IronSource.setISDemandOnlyInterstitialListener(this);
        IronSource.setISDemandOnlyRewardedVideoListener(this);
        IronSource.addImpressionDataListener(this);
        this.mUIHandler = new Handler(Looper.getMainLooper());
        this.mBannerContainer = null;
        this.mBanner = null;
        this.mIsBannerLoaded = false;
        this.mIsInitBannerCalled = false;
    }

    public Activity getUnityActivity() {
        return UnityPlayer.currentActivity;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void sendUnityEvent(String str) {
        sendUnityEvent(str, "");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void sendUnityEvent(String str, String str2) {
        try {
            if (UnityPlayer.currentActivity == null) {
                return;
            }
            if (TextUtils.isEmpty(str2)) {
                str2 = "";
            }
            UnityPlayer.UnitySendMessage("IronSourceEvents", str, str2);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void setPluginData(String str, String str2, String str3) {
        ConfigFile.getConfigFile().setPluginData(str, str2, str3);
    }

    public String getAdvertiserId() {
        FutureTask futureTask = new FutureTask(new Callable<String>() { // from class: com.ironsource.unity.androidbridge.AndroidBridge.1
            @Override // java.util.concurrent.Callable
            public String call() throws Exception {
                return IronSource.getAdvertiserId(AndroidBridge.this.getUnityActivity());
            }
        });
        futureTask.run();
        try {
            return (String) futureTask.get(1L, TimeUnit.SECONDS);
        } catch (Exception e) {
            e.printStackTrace();
            return "";
        }
    }

    public void validateIntegration() {
        IntegrationHelper.validateIntegration(getUnityActivity());
    }

    public void shouldTrackNetworkState(boolean z) {
        IronSource.shouldTrackNetworkState(getUnityActivity(), z);
    }

    public boolean setDynamicUserId(String str) {
        return IronSource.setDynamicUserId(str);
    }

    public void setAdaptersDebug(boolean z) {
        IronSource.setAdaptersDebug(z);
    }

    public void onResume() {
        IronSource.onResume(getUnityActivity());
    }

    public void onPause() {
        IronSource.onPause(getUnityActivity());
    }

    public void setMediationSegment(String str) {
        IronSource.setMediationSegment(str);
    }

    public void setUserId(String str) {
        IronSource.setUserId(str);
    }

    public void init(String str) {
        this.mIsInitBannerCalled = true;
        IronSource.init(getUnityActivity(), str);
    }

    public void init(String str, String[] strArr) {
        ArrayList arrayList = new ArrayList();
        for (String str2 : strArr) {
            if (IronSource.AD_UNIT.REWARDED_VIDEO.toString().equalsIgnoreCase(str2)) {
                arrayList.add(IronSource.AD_UNIT.REWARDED_VIDEO);
            } else if (IronSource.AD_UNIT.INTERSTITIAL.toString().equalsIgnoreCase(str2)) {
                arrayList.add(IronSource.AD_UNIT.INTERSTITIAL);
            } else if (IronSource.AD_UNIT.OFFERWALL.toString().equalsIgnoreCase(str2)) {
                arrayList.add(IronSource.AD_UNIT.OFFERWALL);
            } else if (IronSource.AD_UNIT.BANNER.toString().equalsIgnoreCase(str2)) {
                this.mIsInitBannerCalled = true;
                arrayList.add(IronSource.AD_UNIT.BANNER);
            }
        }
        IronSource.init(getUnityActivity(), str, (IronSource.AD_UNIT[]) arrayList.toArray(new IronSource.AD_UNIT[arrayList.size()]));
    }

    public void initISDemandOnly(String str, String[] strArr) {
        ArrayList arrayList = new ArrayList();
        for (String str2 : strArr) {
            if (IronSource.AD_UNIT.REWARDED_VIDEO.toString().equalsIgnoreCase(str2)) {
                arrayList.add(IronSource.AD_UNIT.REWARDED_VIDEO);
            } else if (IronSource.AD_UNIT.INTERSTITIAL.toString().equalsIgnoreCase(str2)) {
                arrayList.add(IronSource.AD_UNIT.INTERSTITIAL);
            } else if (IronSource.AD_UNIT.OFFERWALL.toString().equalsIgnoreCase(str2)) {
                arrayList.add(IronSource.AD_UNIT.OFFERWALL);
            } else if (IronSource.AD_UNIT.BANNER.toString().equalsIgnoreCase(str2)) {
                arrayList.add(IronSource.AD_UNIT.BANNER);
            }
        }
        IronSource.initISDemandOnly(getUnityActivity().getApplicationContext(), str, (IronSource.AD_UNIT[]) arrayList.toArray(new IronSource.AD_UNIT[arrayList.size()]));
    }

    public void showRewardedVideo() {
        IronSource.showRewardedVideo();
    }

    public void showRewardedVideo(String str) {
        UnityPlayer.UnitySendMessage("IronSourceEvents", "onRewardedVideoAdRewarded", "{\"placement_reward_name\":\"Virtual Item\",\"placement_name\":\"" + str + "\",\"placement_reward_amount\":\"1\",\"placement_id\":\"7\"}");
        UnityPlayer.UnitySendMessage("IronSourceEvents", "onRewardedVideoAdClosed", "");
    }

    public boolean isRewardedVideoAvailable() {
        return true;
    }

    public boolean isRewardedVideoPlacementCapped(String str) {
        return IronSource.isRewardedVideoPlacementCapped(str);
    }

    public String getPlacementInfo(String str) {
        Placement rewardedVideoPlacementInfo = IronSource.getRewardedVideoPlacementInfo(str);
        HashMap hashMap = new HashMap();
        try {
            hashMap.put("placement_name", rewardedVideoPlacementInfo.getPlacementName());
            hashMap.put("reward_name", rewardedVideoPlacementInfo.getRewardName());
            hashMap.put("reward_amount", Integer.valueOf(rewardedVideoPlacementInfo.getRewardAmount()));
            return new JSONObject(hashMap).toString();
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public void setRewardedVideoServerParams(String str) {
        IronSource.setRewardedVideoServerParameters(getHashMapFromJsonString(str));
    }

    public void clearRewardedVideoServerParams() {
        IronSource.clearRewardedVideoServerParameters();
    }

    public void showISDemandOnlyRewardedVideo(String str) {
        IronSource.showISDemandOnlyRewardedVideo(str);
    }

    public void loadISDemandOnlyRewardedVideo(String str) {
        IronSource.loadISDemandOnlyRewardedVideo(getUnityActivity(), str);
    }

    public boolean isISDemandOnlyRewardedVideoAvailable(String str) {
        return IronSource.isISDemandOnlyRewardedVideoAvailable(str);
    }

    public void loadInterstitial() {
        IronSource.loadInterstitial();
    }

    public void showInterstitial() {
        IronSource.showInterstitial();
    }

    public void showInterstitial(String str) {
        IronSource.showInterstitial(str);
    }

    public boolean isInterstitialReady() {
        return IronSource.isInterstitialReady();
    }

    public boolean isInterstitialPlacementCapped(String str) {
        return IronSource.isInterstitialPlacementCapped(str);
    }

    public void loadISDemandOnlyInterstitial(String str) {
        IronSource.loadISDemandOnlyInterstitial(getUnityActivity(), str);
    }

    public void showISDemandOnlyInterstitial(String str) {
        IronSource.showISDemandOnlyInterstitial(str);
    }

    public boolean isISDemandOnlyInterstitialReady(String str) {
        return IronSource.isISDemandOnlyInterstitialReady(str);
    }

    public void showOfferwall() {
        IronSource.showOfferwall();
    }

    public void showOfferwall(String str) {
        IronSource.showOfferwall(str);
    }

    public boolean isOfferwallAvailable() {
        return IronSource.isOfferwallAvailable();
    }

    public void getOfferwallCredits() {
        IronSource.getOfferwallCredits();
    }

    public void loadBanner(String str, int i, int i2, int i3, String str2) {
        synchronized (mInstance) {
            if (this.mIsInitBannerCalled && !this.mIsBannerLoaded) {
                this.mIsBannerLoaded = true;
                loadAndShowBanner(str, i, i2, i3, str2);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.ironsource.unity.androidbridge.AndroidBridge$2  reason: invalid class name */
    /* loaded from: classes2.dex */
    public class AnonymousClass2 implements Runnable {
        final /* synthetic */ String val$description;
        final /* synthetic */ int val$height;
        final /* synthetic */ String val$placementName;
        final /* synthetic */ int val$position;
        final /* synthetic */ int val$width;

        AnonymousClass2(String str, int i, int i2, int i3, String str2) {
            this.val$description = str;
            this.val$width = i;
            this.val$height = i2;
            this.val$position = i3;
            this.val$placementName = str2;
        }

        @Override // java.lang.Runnable
        public void run() {
            synchronized (AndroidBridge.mInstance) {
                try {
                    if (AndroidBridge.this.mBannerContainer == null) {
                        AndroidBridge.this.mBannerContainer = new FrameLayout(UnityPlayer.currentActivity);
                        AndroidBridge.this.mBannerContainer.setBackgroundColor(0);
                        UnityPlayer.currentActivity.addContentView(AndroidBridge.this.mBannerContainer, new FrameLayout.LayoutParams(-1, -1));
                    }
                    AndroidBridge.this.mBanner = IronSource.createBanner(AndroidBridge.this.getUnityActivity(), AndroidBridge.this.getBannerSize(this.val$description, this.val$width, this.val$height));
                    FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
                    layoutParams.gravity = this.val$position == 1 ? 48 : 80;
                    AndroidBridge.this.mBannerContainer.addView(AndroidBridge.this.mBanner, layoutParams);
                    AndroidBridge.this.mBanner.setOnHierarchyChangeListener(new ViewGroup.OnHierarchyChangeListener() { // from class: com.ironsource.unity.androidbridge.AndroidBridge.2.1
                        @Override // android.view.ViewGroup.OnHierarchyChangeListener
                        public void onChildViewRemoved(View view, View view2) {
                        }

                        @Override // android.view.ViewGroup.OnHierarchyChangeListener
                        public void onChildViewAdded(View view, View view2) {
                            if (AndroidBridge.this.mBanner != null) {
                                AndroidBridge.this.mBanner.setVisibility(8);
                            }
                            AndroidBridge.this.mUIHandler.post(new Runnable() { // from class: com.ironsource.unity.androidbridge.AndroidBridge.2.1.1
                                @Override // java.lang.Runnable
                                public void run() {
                                    synchronized (AndroidBridge.mInstance) {
                                        if (AndroidBridge.this.mBanner != null) {
                                            AndroidBridge.this.mBanner.setVisibility(0);
                                        }
                                        AndroidBridge.this.mBannerContainer.requestLayout();
                                    }
                                }
                            });
                        }
                    });
                    AndroidBridge.this.mBanner.setBannerListener(new BannerListener() { // from class: com.ironsource.unity.androidbridge.AndroidBridge.2.2
                        @Override // com.ironsource.mediationsdk.sdk.BannerListener
                        public void onBannerAdLoaded() {
                            AndroidBridge.this.sendUnityEvent("onBannerAdLoaded");
                        }

                        @Override // com.ironsource.mediationsdk.sdk.BannerListener
                        public void onBannerAdLoadFailed(IronSourceError ironSourceError) {
                            AndroidBridge.this.mUIHandler.post(new Runnable() { // from class: com.ironsource.unity.androidbridge.AndroidBridge.2.2.1
                                @Override // java.lang.Runnable
                                public void run() {
                                    synchronized (AndroidBridge.mInstance) {
                                        AndroidBridge.this.mBannerContainer.removeAllViews();
                                        if (AndroidBridge.this.mBanner != null) {
                                            AndroidBridge.this.mBanner = null;
                                        }
                                        AndroidBridge.this.mIsBannerLoaded = false;
                                    }
                                }
                            });
                            AndroidBridge.this.sendUnityEvent("onBannerAdLoadFailed", AndroidBridge.this.parseErrorToEvent(ironSourceError));
                        }

                        @Override // com.ironsource.mediationsdk.sdk.BannerListener
                        public void onBannerAdClicked() {
                            AndroidBridge.this.sendUnityEvent("onBannerAdClicked");
                        }

                        @Override // com.ironsource.mediationsdk.sdk.BannerListener
                        public void onBannerAdScreenPresented() {
                            AndroidBridge.this.sendUnityEvent("onBannerAdScreenPresented");
                        }

                        @Override // com.ironsource.mediationsdk.sdk.BannerListener
                        public void onBannerAdScreenDismissed() {
                            AndroidBridge.this.sendUnityEvent("onBannerAdScreenDismissed");
                        }

                        @Override // com.ironsource.mediationsdk.sdk.BannerListener
                        public void onBannerAdLeftApplication() {
                            AndroidBridge.this.sendUnityEvent("onBannerAdLeftApplication");
                        }
                    });
                    if (this.val$placementName != null) {
                        IronSource.loadBanner(AndroidBridge.this.mBanner, this.val$placementName);
                    } else {
                        IronSource.loadBanner(AndroidBridge.this.mBanner);
                    }
                }
            }
        }
    }

    private void loadAndShowBanner(String str, int i, int i2, int i3, String str2) {
        this.mUIHandler.post(new AnonymousClass2(str, i, i2, i3, str2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public ISBannerSize getBannerSize(String str, int i, int i2) {
        if (str.equals("CUSTOM")) {
            return new ISBannerSize(i, i2);
        }
        if (str.equals("SMART")) {
            return ISBannerSize.SMART;
        }
        if (str.equals("RECTANGLE")) {
            return ISBannerSize.RECTANGLE;
        }
        if (str.equals("LARGE")) {
            return ISBannerSize.LARGE;
        }
        return ISBannerSize.BANNER;
    }

    public void destroyBanner() {
        synchronized (mInstance) {
            this.mUIHandler.post(new Runnable() { // from class: com.ironsource.unity.androidbridge.AndroidBridge.3
                @Override // java.lang.Runnable
                public void run() {
                    synchronized (AndroidBridge.mInstance) {
                        try {
                            AndroidBridge.this.mBannerContainer.removeAllViews();
                            if (AndroidBridge.this.mBanner != null) {
                                IronSource.destroyBanner(AndroidBridge.this.mBanner);
                                AndroidBridge.this.mBanner = null;
                            }
                            AndroidBridge.this.mBannerContainer.setVisibility(0);
                        } catch (Exception unused) {
                        }
                        AndroidBridge.this.mIsBannerLoaded = false;
                    }
                }
            });
        }
    }

    public void displayBanner() {
        synchronized (mInstance) {
            this.mUIHandler.post(new Runnable() { // from class: com.ironsource.unity.androidbridge.AndroidBridge.4
                @Override // java.lang.Runnable
                public void run() {
                    synchronized (AndroidBridge.mInstance) {
                        try {
                            if (AndroidBridge.this.mBannerContainer != null) {
                                AndroidBridge.this.mBannerContainer.setVisibility(0);
                            }
                        } catch (Exception unused) {
                        }
                    }
                }
            });
        }
    }

    public void hideBanner() {
        synchronized (mInstance) {
            this.mUIHandler.post(new Runnable() { // from class: com.ironsource.unity.androidbridge.AndroidBridge.5
                @Override // java.lang.Runnable
                public void run() {
                    synchronized (AndroidBridge.mInstance) {
                        try {
                            if (AndroidBridge.this.mBannerContainer != null) {
                                AndroidBridge.this.mBannerContainer.setVisibility(8);
                            }
                        } catch (Exception unused) {
                        }
                    }
                }
            });
        }
    }

    public boolean isBannerPlacementCapped(String str) {
        return IronSource.isBannerPlacementCapped(str);
    }

    public void setSegment(String str) {
        try {
            IronSource.setSegmentListener(this);
            JSONObject jSONObject = new JSONObject(str);
            IronSourceSegment ironSourceSegment = new IronSourceSegment();
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                if (next.equals("age")) {
                    ironSourceSegment.setAge(jSONObject.optInt(next));
                } else if (next.equals(InneractiveMediationDefs.KEY_GENDER)) {
                    ironSourceSegment.setGender(jSONObject.optString(next));
                } else if (next.equals("level")) {
                    ironSourceSegment.setLevel(jSONObject.optInt(next));
                } else if (next.equals("isPaying")) {
                    ironSourceSegment.setIsPaying(jSONObject.optInt(next) != 0);
                } else if (next.equals("userCreationDate")) {
                    ironSourceSegment.setUserCreationDate(jSONObject.optLong(next));
                } else if (next.equals("segmentName")) {
                    ironSourceSegment.setSegmentName(jSONObject.optString(next));
                } else if (next.equals(IronSourceSegment.IAPT)) {
                    ironSourceSegment.setIAPTotal(jSONObject.optDouble(next));
                } else {
                    ironSourceSegment.setCustom(next, jSONObject.optString(next));
                }
            }
            IronSource.setSegment(ironSourceSegment);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void setConsent(boolean z) {
        IronSource.setConsent(z);
    }

    public void setMetaData(String str, String str2) {
        IronSource.setMetaData(str, str2);
    }

    public void setMetaData(String str, String[] strArr) {
        ArrayList arrayList = new ArrayList();
        for (String str2 : strArr) {
            arrayList.add(str2);
        }
        IronSource.setMetaData(str, arrayList);
    }

    public void setAdRevenueData(String str, String str2) {
        IronSource.setAdRevenueData(str, new JSONObject(getHashMapFromJsonString(str2)));
    }

    @Override // com.ironsource.mediationsdk.sdk.RewardedVideoListener
    public void onRewardedVideoAdOpened() {
        sendUnityEvent("onRewardedVideoAdOpened", "");
    }

    @Override // com.ironsource.mediationsdk.sdk.RewardedVideoListener
    public void onRewardedVideoAdClosed() {
        sendUnityEvent("onRewardedVideoAdClosed", "");
    }

    @Override // com.ironsource.mediationsdk.sdk.RewardedVideoListener
    public void onRewardedVideoAvailabilityChanged(boolean z) {
        sendUnityEvent("onRewardedVideoAvailabilityChanged", String.valueOf(z));
    }

    @Override // com.ironsource.mediationsdk.sdk.RewardedVideoListener
    public void onRewardedVideoAdStarted() {
        sendUnityEvent("onRewardedVideoAdStarted", "");
    }

    @Override // com.ironsource.mediationsdk.sdk.RewardedVideoListener
    public void onRewardedVideoAdEnded() {
        sendUnityEvent("onRewardedVideoAdEnded", "");
    }

    @Override // com.ironsource.mediationsdk.sdk.RewardedVideoListener
    public void onRewardedVideoAdRewarded(Placement placement) {
        HashMap hashMap = new HashMap();
        try {
            hashMap.put(AdvertisementDBAdapter.AdvertisementColumns.COLUMN_PLACEMENT_ID, String.valueOf(placement.getPlacementId()));
            hashMap.put("placement_name", placement.getPlacementName());
            hashMap.put("placement_reward_amount", String.valueOf(placement.getRewardAmount()));
            hashMap.put("placement_reward_name", placement.getRewardName());
            sendUnityEvent("onRewardedVideoAdRewarded", new JSONObject(hashMap).toString());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override // com.ironsource.mediationsdk.sdk.RewardedVideoListener
    public void onRewardedVideoAdShowFailed(IronSourceError ironSourceError) {
        if (ironSourceError != null) {
            sendUnityEvent("onRewardedVideoAdShowFailed", parseErrorToEvent(ironSourceError.getErrorCode(), ironSourceError.getErrorMessage()));
        } else {
            sendUnityEvent("onRewardedVideoAdShowFailed", "");
        }
    }

    @Override // com.ironsource.mediationsdk.sdk.RewardedVideoListener
    public void onRewardedVideoAdClicked(Placement placement) {
        HashMap hashMap = new HashMap();
        try {
            hashMap.put(AdvertisementDBAdapter.AdvertisementColumns.COLUMN_PLACEMENT_ID, String.valueOf(placement.getPlacementId()));
            hashMap.put("placement_name", placement.getPlacementName());
            hashMap.put("placement_reward_amount", String.valueOf(placement.getRewardAmount()));
            hashMap.put("placement_reward_name", placement.getRewardName());
            sendUnityEvent("onRewardedVideoAdClicked", new JSONObject(hashMap).toString());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override // com.ironsource.mediationsdk.sdk.ISDemandOnlyRewardedVideoListener
    public void onRewardedVideoAdLoadSuccess(String str) {
        sendUnityEvent("onRewardedVideoAdLoadedDemandOnly", str);
    }

    @Override // com.ironsource.mediationsdk.sdk.ISDemandOnlyRewardedVideoListener
    public void onRewardedVideoAdLoadFailed(String str, IronSourceError ironSourceError) {
        sendUnityEvent("onRewardedVideoAdLoadFailedDemandOnly", Arrays.toString(ironSourceError != null ? new String[]{str, parseErrorToEvent(ironSourceError.getErrorCode(), ironSourceError.getErrorMessage())} : new String[]{str, ""}));
    }

    @Override // com.ironsource.mediationsdk.sdk.ISDemandOnlyRewardedVideoListener
    public void onRewardedVideoAdOpened(String str) {
        sendUnityEvent("onRewardedVideoAdOpenedDemandOnly", str);
    }

    @Override // com.ironsource.mediationsdk.sdk.ISDemandOnlyRewardedVideoListener
    public void onRewardedVideoAdClosed(String str) {
        sendUnityEvent("onRewardedVideoAdClosedDemandOnly", str);
    }

    @Override // com.ironsource.mediationsdk.sdk.ISDemandOnlyRewardedVideoListener
    public void onRewardedVideoAdRewarded(String str) {
        sendUnityEvent("onRewardedVideoAdRewardedDemandOnly", str);
    }

    @Override // com.ironsource.mediationsdk.sdk.ISDemandOnlyRewardedVideoListener
    public void onRewardedVideoAdShowFailed(String str, IronSourceError ironSourceError) {
        sendUnityEvent("onRewardedVideoAdShowFailedDemandOnly", Arrays.toString(ironSourceError != null ? new String[]{str, parseErrorToEvent(ironSourceError.getErrorCode(), ironSourceError.getErrorMessage())} : new String[]{str, ""}));
    }

    @Override // com.ironsource.mediationsdk.sdk.ISDemandOnlyRewardedVideoListener
    public void onRewardedVideoAdClicked(String str) {
        sendUnityEvent("onRewardedVideoAdClickedDemandOnly", str);
    }

    @Override // com.ironsource.mediationsdk.sdk.InterstitialListener
    public void onInterstitialAdReady() {
        sendUnityEvent("onInterstitialAdReady", "");
    }

    @Override // com.ironsource.mediationsdk.sdk.InterstitialListener
    public void onInterstitialAdLoadFailed(IronSourceError ironSourceError) {
        if (ironSourceError != null) {
            sendUnityEvent("onInterstitialAdLoadFailed", parseErrorToEvent(ironSourceError.getErrorCode(), ironSourceError.getErrorMessage()));
        } else {
            sendUnityEvent("onInterstitialAdLoadFailed", "");
        }
    }

    @Override // com.ironsource.mediationsdk.sdk.InterstitialListener
    public void onInterstitialAdOpened() {
        sendUnityEvent("onInterstitialAdOpened", "");
    }

    @Override // com.ironsource.mediationsdk.sdk.InterstitialListener
    public void onInterstitialAdClosed() {
        sendUnityEvent("onInterstitialAdClosed", "");
    }

    @Override // com.ironsource.mediationsdk.sdk.InterstitialListener
    public void onInterstitialAdShowSucceeded() {
        sendUnityEvent("onInterstitialAdShowSucceeded", "");
    }

    @Override // com.ironsource.mediationsdk.sdk.InterstitialListener
    public void onInterstitialAdShowFailed(IronSourceError ironSourceError) {
        if (ironSourceError != null) {
            sendUnityEvent("onInterstitialAdShowFailed", parseErrorToEvent(ironSourceError.getErrorCode(), ironSourceError.getErrorMessage()));
        } else {
            sendUnityEvent("onInterstitialAdShowFailed", "");
        }
    }

    @Override // com.ironsource.mediationsdk.sdk.InterstitialListener
    public void onInterstitialAdClicked() {
        sendUnityEvent("onInterstitialAdClicked", "");
    }

    @Override // com.ironsource.mediationsdk.sdk.ISDemandOnlyInterstitialListener
    public void onInterstitialAdReady(String str) {
        sendUnityEvent("onInterstitialAdReadyDemandOnly", str);
    }

    @Override // com.ironsource.mediationsdk.sdk.ISDemandOnlyInterstitialListener
    public void onInterstitialAdLoadFailed(String str, IronSourceError ironSourceError) {
        sendUnityEvent("onInterstitialAdLoadFailedDemandOnly", Arrays.toString(ironSourceError != null ? new String[]{str, parseErrorToEvent(ironSourceError.getErrorCode(), ironSourceError.getErrorMessage())} : new String[]{str, ""}));
    }

    @Override // com.ironsource.mediationsdk.sdk.ISDemandOnlyInterstitialListener
    public void onInterstitialAdOpened(String str) {
        sendUnityEvent("onInterstitialAdOpenedDemandOnly", str);
    }

    @Override // com.ironsource.mediationsdk.sdk.ISDemandOnlyInterstitialListener
    public void onInterstitialAdClosed(String str) {
        sendUnityEvent("onInterstitialAdClosedDemandOnly", str);
    }

    @Override // com.ironsource.mediationsdk.sdk.ISDemandOnlyInterstitialListener
    public void onInterstitialAdShowFailed(String str, IronSourceError ironSourceError) {
        sendUnityEvent("onInterstitialAdShowFailedDemandOnly", Arrays.toString(ironSourceError != null ? new String[]{str, parseErrorToEvent(ironSourceError.getErrorCode(), ironSourceError.getErrorMessage())} : new String[]{str, ""}));
    }

    @Override // com.ironsource.mediationsdk.sdk.ISDemandOnlyInterstitialListener
    public void onInterstitialAdClicked(String str) {
        sendUnityEvent("onInterstitialAdClickedDemandOnly", str);
    }

    @Override // com.ironsource.mediationsdk.sdk.OfferwallListener
    public void onOfferwallAvailable(boolean z) {
        sendUnityEvent("onOfferwallAvailable", String.valueOf(z));
    }

    @Override // com.ironsource.mediationsdk.sdk.OfferwallListener
    public void onOfferwallOpened() {
        sendUnityEvent("onOfferwallOpened", "");
    }

    @Override // com.ironsource.mediationsdk.sdk.OfferwallListener
    public void onOfferwallShowFailed(IronSourceError ironSourceError) {
        if (ironSourceError != null) {
            sendUnityEvent("onOfferwallShowFailed", parseErrorToEvent(ironSourceError.getErrorCode(), ironSourceError.getErrorMessage()));
        } else {
            sendUnityEvent("onOfferwallShowFailed", "");
        }
    }

    @Override // com.ironsource.mediationsdk.sdk.OfferwallListener
    public boolean onOfferwallAdCredited(int i, int i2, boolean z) {
        HashMap hashMap = new HashMap();
        try {
            hashMap.put("credits", String.valueOf(i));
            hashMap.put("totalCredits", String.valueOf(i2));
            hashMap.put("totalCreditsFlag", String.valueOf(z));
            sendUnityEvent("onOfferwallAdCredited", new JSONObject(hashMap).toString());
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return true;
        }
    }

    @Override // com.ironsource.mediationsdk.sdk.OfferwallListener
    public void onGetOfferwallCreditsFailed(IronSourceError ironSourceError) {
        if (ironSourceError != null) {
            sendUnityEvent("onGetOfferwallCreditsFailed", parseErrorToEvent(ironSourceError.getErrorCode(), ironSourceError.getErrorMessage()));
        } else {
            sendUnityEvent("onGetOfferwallCreditsFailed", "");
        }
    }

    @Override // com.ironsource.mediationsdk.sdk.OfferwallListener
    public void onOfferwallClosed() {
        sendUnityEvent("onOfferwallClosed", "");
    }

    public void setLanguage(String str) {
        SupersonicConfig.getConfigObj().setLanguage(str);
    }

    public void setClientSideCallbacks(boolean z) {
        SupersonicConfig.getConfigObj().setClientSideCallbacks(z);
    }

    public void setRewardedVideoCustomParams(String str) {
        SupersonicConfig.getConfigObj().setRewardedVideoCustomParams(getHashMapFromJsonString(str));
    }

    public void setOfferwallCustomParams(String str) {
        SupersonicConfig.getConfigObj().setOfferwallCustomParams(getHashMapFromJsonString(str));
    }

    public HashMap<String, String> getHashMapFromJsonString(String str) {
        HashMap<String, String> hashMap = new HashMap<>();
        try {
            JSONObject jSONObject = new JSONObject(str);
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                hashMap.put(next, jSONObject.getString(next));
            }
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return hashMap;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String parseErrorToEvent(IronSourceError ironSourceError) {
        return ironSourceError == null ? "" : parseErrorToEvent(ironSourceError.getErrorCode(), ironSourceError.getErrorMessage());
    }

    public String parseErrorToEvent(int i, String str) {
        HashMap hashMap = new HashMap();
        try {
            hashMap.put("error_code", String.valueOf(i));
            hashMap.put(NativeProtocol.BRIDGE_ARG_ERROR_DESCRIPTION, str);
            return new JSONObject(hashMap).toString();
        } catch (Exception e) {
            e.printStackTrace();
            return "";
        }
    }

    @Override // com.ironsource.mediationsdk.sdk.SegmentListener
    public void onSegmentReceived(String str) {
        sendUnityEvent("onSegmentReceived", str);
    }

    @Override // com.ironsource.mediationsdk.impressionData.ImpressionDataListener
    public void onImpressionSuccess(ImpressionData impressionData) {
        sendUnityEvent("onImpressionSuccess", impressionData.getAllData().toString());
    }
}
