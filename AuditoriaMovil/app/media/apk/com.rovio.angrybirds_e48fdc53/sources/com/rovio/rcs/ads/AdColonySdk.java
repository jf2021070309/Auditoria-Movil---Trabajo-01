package com.rovio.rcs.ads;

import android.util.Log;
import com.adcolony.sdk.AdColony;
import com.adcolony.sdk.AdColonyAppOptions;
import com.adcolony.sdk.AdColonyInterstitial;
import com.adcolony.sdk.AdColonyInterstitialListener;
import com.adcolony.sdk.AdColonyZone;
import com.rovio.fusion.Globals;
import com.rovio.rcs.ads.AdsSdk;
import java.util.HashMap;
/* loaded from: classes4.dex */
class AdColonySdk extends AdsSdkBase {
    private static final String TAG = "AdColonySdk";
    private static boolean m_isConfigured = false;
    private String b;
    private AdColonyInterstitial c;
    private AdColonyInterstitialListener d;
    private boolean e;

    AdColonySdk() {
    }

    public static AdsSdkBase createSdk(AdsSdk.AdType adType) {
        return new AdColonySdk();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.rovio.rcs.ads.AdsSdkBase
    public void a(HashMap<String, String> hashMap) {
        String str = hashMap.get("appId");
        String str2 = hashMap.get("zoneId");
        String str3 = hashMap.get("store");
        String[] split = str2 != null ? str2.split("[\\s,]+") : new String[0];
        if (str == null || str.isEmpty()) {
            Log.e(TAG, "Invalid configuration");
            if (this.a != null) {
                this.a.onAdError(AdsSdkConstants.ERROR_INVALID_CONFIG);
                this.a.onAdReady(false);
            }
        } else if (split.length == 0) {
            Log.e(TAG, "Failed to parse zones configuration");
            if (this.a != null) {
                this.a.onAdError(AdsSdkConstants.ERROR_PARSE_ERROR);
                this.a.onAdReady(false);
            }
        } else {
            this.b = split[0];
            this.d = new AdColonyInterstitialListener() { // from class: com.rovio.rcs.ads.AdColonySdk.1
                @Override // com.adcolony.sdk.AdColonyInterstitialListener
                public void onRequestNotFilled(AdColonyZone adColonyZone) {
                    if (adColonyZone.getZoneID().equals(AdColonySdk.this.b) && AdColonySdk.this.a != null) {
                        AdColonySdk.this.c = null;
                        AdColonySdk.this.a.onAdError(AdsSdkConstants.ERROR_NO_FILL);
                        AdColonySdk.this.a.onAdReady(false);
                    }
                }

                @Override // com.adcolony.sdk.AdColonyInterstitialListener
                public void onRequestFilled(AdColonyInterstitial adColonyInterstitial) {
                }

                @Override // com.adcolony.sdk.AdColonyInterstitialListener
                public void onOpened(AdColonyInterstitial adColonyInterstitial) {
                    if (adColonyInterstitial.getZoneID().equals(AdColonySdk.this.b)) {
                        AdColonySdk.this.e = true;
                        if (AdColonySdk.this.a != null) {
                            AdColonySdk.this.a.onAdShown();
                        }
                    }
                }

                @Override // com.adcolony.sdk.AdColonyInterstitialListener
                public void onClosed(AdColonyInterstitial adColonyInterstitial) {
                    if (adColonyInterstitial.getZoneID().equals(AdColonySdk.this.b)) {
                        AdColonySdk.this.e = false;
                        if (AdColonySdk.this.a != null) {
                            AdColonySdk.this.a.onAdHidden(true);
                        }
                    }
                }

                @Override // com.adcolony.sdk.AdColonyInterstitialListener
                public void onExpiring(AdColonyInterstitial adColonyInterstitial) {
                    if (adColonyInterstitial.getZoneID().equals(AdColonySdk.this.b) && !AdColonySdk.this.e && AdColonySdk.this.a != null) {
                        AdColonySdk.this.a.onAdError(AdsSdkConstants.ERROR_EXPIRED);
                        AdColonySdk.this.a.onAdReady(false);
                    }
                }

                @Override // com.adcolony.sdk.AdColonyInterstitialListener
                public void onClicked(AdColonyInterstitial adColonyInterstitial) {
                    if (adColonyInterstitial.getZoneID().equals(AdColonySdk.this.b) && AdColonySdk.this.e && AdColonySdk.this.a != null) {
                        AdColonySdk.this.a.onClick();
                    }
                }
            };
            if (!m_isConfigured) {
                m_isConfigured = true;
                this.c = null;
                AdColonyAppOptions appVersion = new AdColonyAppOptions().setAppVersion("1.0");
                if (str3 != null && str3.equals("amazon")) {
                    appVersion.setOriginStore(str3);
                } else {
                    appVersion.setOriginStore("google");
                }
                AdColony.configure(Globals.getActivity(), appVersion, str, split);
                AdColony.requestInterstitial(this.b, this.d);
                return;
            }
            AdColony.requestInterstitial(this.b, this.d);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.rovio.rcs.ads.AdsSdkBase
    public void a() {
        if (this.a != null) {
            boolean z = this.c != null;
            if (!z) {
                this.a.onAdError(AdsSdkConstants.ERROR_WATCHDOG);
            }
            this.a.onAdReady(z);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.rovio.rcs.ads.AdsSdkBase
    public void b() {
        if (this.c != null) {
            this.c.show();
        } else if (this.a != null) {
            this.a.onAdError(AdsSdkConstants.ERROR_SHOW_FAILED);
            this.a.onAdHidden(false);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.rovio.rcs.ads.AdsSdkBase
    public void c() {
        if (this.c != null) {
            this.c.cancel();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.rovio.rcs.ads.AdsSdkBase
    public void d() {
        if (this.c != null) {
            this.c.destroy();
        }
    }
}
