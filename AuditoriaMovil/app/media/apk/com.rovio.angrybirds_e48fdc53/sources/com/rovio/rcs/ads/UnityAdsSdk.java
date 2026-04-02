package com.rovio.rcs.ads;

import android.util.Log;
import com.bytedance.android.live.base.api.push.model.PushUIConfig;
import com.rovio.fusion.Globals;
import com.rovio.rcs.ads.AdsSdk;
import com.unity3d.ads.UnityAds;
import com.unity3d.ads.mediation.IUnityAdsExtendedListener;
import com.unity3d.ads.metadata.MediationMetaData;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Timer;
import java.util.TimerTask;
/* loaded from: classes4.dex */
class UnityAdsSdk extends AdsSdkBase implements IUnityAdsExtendedListener {
    private static final String TAG = "UnityAdsSdk";
    private static SdkListener m_sdkListener = null;
    private static final int s_timerPeriod = 2000;
    private static final int s_timerStartDelay = 5000;
    private Timer b = null;
    private boolean c = false;
    private boolean d = false;
    private String e;
    private Integer f;
    private boolean g;
    private boolean h;

    UnityAdsSdk() {
    }

    /* loaded from: classes4.dex */
    class SdkListener implements IUnityAdsExtendedListener {
        private ArrayList<IUnityAdsExtendedListener> b = new ArrayList<>();

        SdkListener() {
        }

        void a(IUnityAdsExtendedListener iUnityAdsExtendedListener) {
            this.b.add(iUnityAdsExtendedListener);
        }

        void b(IUnityAdsExtendedListener iUnityAdsExtendedListener) {
            this.b.remove(iUnityAdsExtendedListener);
        }

        @Override // com.unity3d.ads.IUnityAdsListener
        public void onUnityAdsReady(String str) {
            Iterator<IUnityAdsExtendedListener> it = this.b.iterator();
            while (it.hasNext()) {
                it.next().onUnityAdsReady(str);
            }
        }

        @Override // com.unity3d.ads.IUnityAdsListener
        public void onUnityAdsStart(String str) {
            Iterator<IUnityAdsExtendedListener> it = this.b.iterator();
            while (it.hasNext()) {
                it.next().onUnityAdsStart(str);
            }
        }

        @Override // com.unity3d.ads.IUnityAdsListener
        public void onUnityAdsFinish(String str, UnityAds.FinishState finishState) {
            Iterator<IUnityAdsExtendedListener> it = this.b.iterator();
            while (it.hasNext()) {
                it.next().onUnityAdsFinish(str, finishState);
            }
        }

        @Override // com.unity3d.ads.IUnityAdsListener
        public void onUnityAdsError(UnityAds.UnityAdsError unityAdsError, String str) {
            Iterator<IUnityAdsExtendedListener> it = this.b.iterator();
            while (it.hasNext()) {
                it.next().onUnityAdsError(unityAdsError, str);
            }
        }

        @Override // com.unity3d.ads.mediation.IUnityAdsExtendedListener
        public void onUnityAdsClick(String str) {
            Iterator<IUnityAdsExtendedListener> it = this.b.iterator();
            while (it.hasNext()) {
                it.next().onUnityAdsClick(str);
            }
        }

        @Override // com.unity3d.ads.mediation.IUnityAdsExtendedListener
        public void onUnityAdsPlacementStateChanged(String str, UnityAds.PlacementState placementState, UnityAds.PlacementState placementState2) {
            Iterator<IUnityAdsExtendedListener> it = this.b.iterator();
            while (it.hasNext()) {
                it.next().onUnityAdsPlacementStateChanged(str, placementState, placementState2);
            }
        }
    }

    public static AdsSdkBase createSdk(AdsSdk.AdType adType) {
        return new UnityAdsSdk();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.rovio.rcs.ads.AdsSdkBase
    public void a(HashMap<String, String> hashMap) {
        String str = hashMap.get("appId");
        this.e = hashMap.get("zoneId");
        String str2 = hashMap.get("sessionDepth");
        this.f = Integer.valueOf((str2 == null || str2.length() <= 0) ? 0 : Integer.valueOf(str2).intValue());
        if (str == null || this.e == null) {
            Log.e(TAG, "Invalid configuration");
            if (this.a != null) {
                this.a.onAdError(AdsSdkConstants.ERROR_INVALID_CONFIG);
                this.a.onAdReady(false);
                return;
            }
            return;
        }
        this.h = false;
        if (m_sdkListener == null) {
            m_sdkListener = new SdkListener();
            m_sdkListener.a(this);
            String str3 = hashMap.get("rovioSdkVersion");
            MediationMetaData mediationMetaData = new MediationMetaData(Globals.getActivity());
            mediationMetaData.setName("Rovio");
            if (str3 != null && str3.length() > 0) {
                mediationMetaData.setVersion(str3);
            }
            mediationMetaData.commit();
            UnityAds.initialize(Globals.getActivity(), str, m_sdkListener);
        } else {
            m_sdkListener.a(this);
            if (this.a != null && UnityAds.isReady(this.e)) {
                a(true);
            }
        }
        this.b = new Timer();
        this.b.schedule(new TimerTask() { // from class: com.rovio.rcs.ads.UnityAdsSdk.1
            @Override // java.util.TimerTask, java.lang.Runnable
            public void run() {
                UnityAdsSdk.this.g();
            }
        }, PushUIConfig.dismissTime, 2000L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.rovio.rcs.ads.AdsSdkBase
    public void a() {
        boolean isReady = UnityAds.isReady(this.e);
        if (this.a != null) {
            if (!isReady) {
                this.a.onAdError(AdsSdkConstants.ERROR_WATCHDOG);
            }
            a(isReady);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.rovio.rcs.ads.AdsSdkBase
    public void b() {
        if (UnityAds.isReady(this.e)) {
            this.g = true;
            if (this.f.intValue() > 0) {
                MediationMetaData mediationMetaData = new MediationMetaData(Globals.getActivity());
                mediationMetaData.setOrdinal(this.f.intValue());
                mediationMetaData.commit();
                this.f = 0;
            }
            UnityAds.show(Globals.getActivity(), this.e);
            return;
        }
        Log.e(TAG, "Failed to show - placement not ready");
        this.g = false;
        if (this.a != null) {
            this.a.onAdError(AdsSdkConstants.ERROR_SHOW_FAILED);
            this.a.onAdHidden(false);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.rovio.rcs.ads.AdsSdkBase
    public void c() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.rovio.rcs.ads.AdsSdkBase
    public void d() {
        f();
        if (m_sdkListener != null) {
            m_sdkListener.b(this);
        }
    }

    @Override // com.unity3d.ads.IUnityAdsListener
    public void onUnityAdsReady(String str) {
        if (!this.g && str.equals(this.e) && this.a != null && !this.h) {
            a(true);
        }
    }

    @Override // com.unity3d.ads.IUnityAdsListener
    public void onUnityAdsStart(String str) {
        if (this.g && str.equals(this.e) && this.a != null) {
            this.a.onAdShown();
        }
    }

    @Override // com.unity3d.ads.IUnityAdsListener
    public void onUnityAdsFinish(String str, UnityAds.FinishState finishState) {
        if (str.equals(this.e)) {
            if (this.g) {
                this.g = false;
                this.h = true;
                if (this.a != null) {
                    this.a.onAdHidden(finishState == UnityAds.FinishState.COMPLETED);
                }
            } else if (!UnityAds.isReady(this.e)) {
                a(false);
            }
        }
    }

    @Override // com.unity3d.ads.mediation.IUnityAdsExtendedListener
    public void onUnityAdsClick(String str) {
        if (this.a != null && this.g && str.equals(this.e)) {
            this.a.onClick();
        }
    }

    @Override // com.unity3d.ads.IUnityAdsListener
    public void onUnityAdsError(UnityAds.UnityAdsError unityAdsError, String str) {
        if (this.a != null) {
            this.a.onAdError(unityAdsError.ordinal(), str);
        }
        if (this.g) {
            this.g = false;
            this.h = false;
            if (this.a != null) {
                this.a.onAdHidden(false);
            }
        } else if (this.a != null) {
            this.a.onAdReady(false);
        }
    }

    @Override // com.unity3d.ads.mediation.IUnityAdsExtendedListener
    public void onUnityAdsPlacementStateChanged(String str, UnityAds.PlacementState placementState, UnityAds.PlacementState placementState2) {
    }

    @Override // com.rovio.rcs.ads.AdsSdkBase
    public void onResume() {
    }

    @Override // com.rovio.rcs.ads.AdsSdkBase
    public void onPause() {
    }

    private synchronized void a(boolean z) {
        if (!this.c || this.d != z) {
            this.c = true;
            this.d = z;
            f();
            if (this.a != null) {
                this.a.onAdReady(z);
            }
        }
    }

    private synchronized void f() {
        if (this.b != null) {
            this.b.cancel();
            this.b.purge();
            this.b = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void g() {
        UnityAds.PlacementState placementState = UnityAds.getPlacementState(this.e);
        switch (placementState) {
            case READY:
                a(true);
                return;
            case NO_FILL:
                Log.e(TAG, "Placement failed with state: " + placementState.toString());
                if (this.a != null) {
                    this.a.onAdError(AdsSdkConstants.ERROR_NO_FILL);
                }
                a(false);
                return;
            case DISABLED:
                if (this.a != null) {
                    this.a.onAdError(AdsSdkConstants.ERROR_INVALID_CONFIG);
                }
                a(false);
                return;
            default:
                return;
        }
    }
}
