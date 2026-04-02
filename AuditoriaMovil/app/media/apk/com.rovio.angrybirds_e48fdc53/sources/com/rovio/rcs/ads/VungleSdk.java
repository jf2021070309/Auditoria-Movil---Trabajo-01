package com.rovio.rcs.ads;

import android.os.Build;
import android.util.Log;
import com.rovio.fusion.Globals;
import com.rovio.rcs.ads.AdsSdk;
import com.vungle.publisher.AdConfig;
import com.vungle.publisher.Orientation;
import com.vungle.publisher.VungleAdEventListener;
import com.vungle.publisher.VungleInitListener;
import com.vungle.publisher.VunglePub;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes4.dex */
public class VungleSdk extends AdsSdkBase implements VungleAdEventListener {
    private static final String TAG = VungleSdk.class.getSimpleName();
    private static GlobalVungleEventListener s_globalListener = null;
    private static boolean s_isVunglePaused = false;
    private static State s_vungleState = State.NOT_INITED;
    private VunglePub b = null;
    private String c = null;
    private boolean d = false;
    private Integer e;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes4.dex */
    public enum State {
        NOT_INITED,
        INITED,
        PENDING_INIT
    }

    VungleSdk() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes4.dex */
    public static class GlobalVungleEventListener implements VungleAdEventListener {
        private HashSet<VungleSdk> a;
        private VungleAdEventListener b;

        private GlobalVungleEventListener() {
            this.a = new HashSet<>();
            this.b = null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void a(VungleSdk vungleSdk) {
            if (vungleSdk != null && this.b == null) {
                this.b = vungleSdk;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void b(VungleSdk vungleSdk) {
            if (vungleSdk == this.b) {
                this.b = null;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void c(VungleSdk vungleSdk) {
            if (vungleSdk != null) {
                this.a.add(vungleSdk);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void d(VungleSdk vungleSdk) {
            if (vungleSdk != null) {
                this.a.remove(vungleSdk);
            }
            if (this.a.isEmpty()) {
                this.b = null;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void a() {
            Iterator<VungleSdk> it = this.a.iterator();
            while (it.hasNext()) {
                it.next().f();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void b() {
            Iterator<VungleSdk> it = this.a.iterator();
            while (it.hasNext()) {
                it.next().g();
            }
        }

        @Override // com.vungle.publisher.VungleAdEventListener
        public void onAdEnd(String str, boolean z, boolean z2) {
            if (this.b != null) {
                this.b.onAdEnd(str, z, z2);
            }
        }

        @Override // com.vungle.publisher.VungleAdEventListener
        public void onAdStart(String str) {
            if (this.b != null) {
                this.b.onAdStart(str);
            }
        }

        @Override // com.vungle.publisher.VungleAdEventListener
        public void onUnableToPlayAd(String str, String str2) {
            Iterator<VungleSdk> it = this.a.iterator();
            while (it.hasNext()) {
                it.next().onUnableToPlayAd(str, str2);
            }
            this.b = null;
        }

        @Override // com.vungle.publisher.VungleAdEventListener
        public void onAdAvailabilityUpdate(String str, boolean z) {
            Iterator<VungleSdk> it = this.a.iterator();
            while (it.hasNext()) {
                it.next().onAdAvailabilityUpdate(str, z);
            }
        }
    }

    private boolean a(String str, String[] strArr) {
        s_vungleState = State.PENDING_INIT;
        try {
            this.b.init(Globals.getActivity(), str, strArr, new VungleInitListener() { // from class: com.rovio.rcs.ads.VungleSdk.1
                @Override // com.vungle.publisher.VungleInitListener
                public void onSuccess() {
                    AdConfig globalAdConfig = VungleSdk.this.b.getGlobalAdConfig();
                    if (globalAdConfig != null) {
                        globalAdConfig.setOrientation(Orientation.autoRotate);
                    }
                    Log.d(VungleSdk.TAG, "Vungle SDK initialized");
                    State unused = VungleSdk.s_vungleState = State.INITED;
                    VungleSdk.s_globalListener.a();
                }

                @Override // com.vungle.publisher.VungleInitListener
                public void onFailure(Throwable th) {
                    Log.d(VungleSdk.TAG, "Vungle SDK initialize failed");
                    State unused = VungleSdk.s_vungleState = State.NOT_INITED;
                    VungleSdk.s_globalListener.b();
                }
            });
            this.b.clearAndSetEventListeners(s_globalListener);
            return true;
        } catch (Exception e) {
            s_vungleState = State.NOT_INITED;
            Log.w(TAG, String.format("An error has occurred while initializing Vungle SDK. %s", e.getMessage()));
            return false;
        }
    }

    public static AdsSdkBase createSdk(AdsSdk.AdType adType) {
        Log.d(TAG, "Creating VungleSdk instance");
        return new VungleSdk();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.rovio.rcs.ads.AdsSdkBase
    public void a(HashMap<String, String> hashMap) {
        if (Build.VERSION.SDK_INT < 19) {
            if (this.a != null) {
                this.a.onAdError(AdsSdkConstants.ERROR_INTERNAL.code(), "android version");
                this.a.onAdReady(false);
                return;
            }
            return;
        }
        String str = hashMap.get("appId");
        if (str == null || str.isEmpty()) {
            if (this.a != null) {
                this.a.onAdError(AdsSdkConstants.ERROR_INVALID_CONFIG);
                this.a.onAdReady(false);
                return;
            }
            return;
        }
        String str2 = hashMap.get("zoneId");
        String str3 = hashMap.get("sessionDepth");
        this.e = Integer.valueOf((str3 == null || str3.length() <= 0) ? 0 : Integer.valueOf(str3).intValue());
        String[] split = str2 != null ? str2.split("[\\s,]+") : new String[0];
        if (split.length == 0) {
            Log.e(TAG, "Failed to parse zones configuration");
            if (this.a != null) {
                this.a.onAdError(AdsSdkConstants.ERROR_PARSE_ERROR);
                this.a.onAdReady(false);
                return;
            }
            return;
        }
        if (s_globalListener == null) {
            s_globalListener = new GlobalVungleEventListener();
        }
        s_globalListener.c(this);
        this.c = split[0];
        this.b = VunglePub.getInstance();
        if (s_vungleState == State.NOT_INITED) {
            if (!a(str, split) && this.a != null) {
                this.a.onAdError(AdsSdkConstants.ERROR_LOADING_FAILED);
                this.a.onAdReady(false);
            }
        } else if (s_vungleState == State.INITED && this.b.isAdPlayable(this.c) && this.a != null) {
            this.a.onAdReady(true);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void f() {
        this.b.loadAd(this.c);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void g() {
        if (this.a != null) {
            this.a.onAdError(AdsSdkConstants.ERROR_LOADING_FAILED);
            this.a.onAdReady(false);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.rovio.rcs.ads.AdsSdkBase
    public void a() {
        boolean isAdPlayable = this.b.isAdPlayable(this.c);
        if (this.a != null) {
            if (!isAdPlayable) {
                this.a.onAdError(AdsSdkConstants.ERROR_WATCHDOG);
            }
            this.a.onAdReady(isAdPlayable);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.rovio.rcs.ads.AdsSdkBase
    public void b() {
        if (s_globalListener == null || this.b == null || !this.b.isAdPlayable(this.c)) {
            if (this.a != null) {
                this.a.onAdError(AdsSdkConstants.ERROR_SHOW_FAILED);
                this.a.onAdReady(false);
                return;
            }
            return;
        }
        Log.d(TAG, "showing ad");
        s_globalListener.a(this);
        AdConfig adConfig = new AdConfig();
        adConfig.setOrdinalViewCount(this.e.intValue());
        this.b.playAd(this.c, adConfig);
        this.d = true;
        if (this.a != null) {
            this.a.onAdShown();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.rovio.rcs.ads.AdsSdkBase
    public void c() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.rovio.rcs.ads.AdsSdkBase
    public void d() {
        if (s_globalListener != null) {
            s_globalListener.d(this);
            s_globalListener.b(this);
        }
        this.b = null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.rovio.rcs.ads.AdsSdkBase
    public void onResume() {
        super.onResume();
        if (s_isVunglePaused && this.b != null) {
            Log.d(TAG, "resuming vungle");
            this.b.onResume();
            s_isVunglePaused = false;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.rovio.rcs.ads.AdsSdkBase
    public void onPause() {
        super.onPause();
        if (!s_isVunglePaused && this.b != null) {
            this.b.onPause();
            s_isVunglePaused = true;
        }
    }

    @Override // com.vungle.publisher.VungleAdEventListener
    public void onAdEnd(String str, boolean z, boolean z2) {
        if (str.equals(this.c)) {
            Log.d(TAG, "The user exited the ad view");
            String str2 = TAG;
            Object[] objArr = new Object[2];
            objArr[0] = str;
            objArr[1] = z ? "fully" : "partially";
            Log.d(str2, String.format("The ad %s was %s watched", objArr));
            if (this.a != null) {
                if (z2) {
                    this.a.onClick();
                }
                this.a.onAdHidden(z);
            }
            s_globalListener.b(this);
            this.d = false;
        }
    }

    @Override // com.vungle.publisher.VungleAdEventListener
    public void onAdStart(String str) {
        if (str.equals(this.c)) {
            Log.d(TAG, String.format("An ad %s is about to be shown", str));
            this.d = true;
        }
    }

    @Override // com.vungle.publisher.VungleAdEventListener
    public void onUnableToPlayAd(String str, String str2) {
        if (str.equals(this.c)) {
            Log.w(TAG, String.format("Ad playback failed for placement %s. Ad not available! %s", str, str2));
            if (this.a != null) {
                if (this.d) {
                    this.a.onAdHidden(false);
                    this.a.onAdError(AdsSdkConstants.ERROR_SHOW_FAILED);
                } else {
                    this.a.onAdReady(false);
                }
            }
            this.d = false;
        }
    }

    @Override // com.vungle.publisher.VungleAdEventListener
    public void onAdAvailabilityUpdate(String str, boolean z) {
        if (str.equals(this.c)) {
            if (z) {
                Log.d(TAG, String.format("An ad %s is cached and ready to be shown.", str));
                if (!this.d && this.a != null) {
                    this.a.onAdReady(true);
                }
            } else if (!this.d && this.a != null) {
                this.a.onAdError(AdsSdkConstants.ERROR_NO_FILL);
                this.a.onAdReady(false);
            }
        }
    }
}
