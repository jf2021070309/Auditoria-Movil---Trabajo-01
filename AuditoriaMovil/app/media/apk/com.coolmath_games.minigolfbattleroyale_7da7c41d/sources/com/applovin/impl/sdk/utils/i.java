package com.applovin.impl.sdk.utils;

import com.applovin.adview.AppLovinAdView;
import com.applovin.adview.AppLovinAdViewDisplayErrorCode;
import com.applovin.adview.AppLovinAdViewEventListener;
import com.applovin.impl.sdk.AppLovinAdBase;
import com.applovin.impl.sdk.r;
import com.applovin.mediation.MaxAd;
import com.applovin.mediation.MaxAdListener;
import com.applovin.mediation.MaxAdRevenueListener;
import com.applovin.mediation.MaxAdViewAdListener;
import com.applovin.mediation.MaxError;
import com.applovin.mediation.MaxReward;
import com.applovin.mediation.MaxRewardedAdListener;
import com.applovin.sdk.AppLovinAd;
import com.applovin.sdk.AppLovinAdClickListener;
import com.applovin.sdk.AppLovinAdDisplayListener;
import com.applovin.sdk.AppLovinAdRewardListener;
import com.applovin.sdk.AppLovinAdVideoPlaybackListener;
import com.applovin.sdk.AppLovinPostbackListener;
import com.applovin.sdk.AppLovinSdkUtils;
import java.util.Map;
/* loaded from: classes.dex */
public class i {
    public static void a(final AppLovinAdViewEventListener appLovinAdViewEventListener, final AppLovinAd appLovinAd, final AppLovinAdView appLovinAdView) {
        if (appLovinAd == null || appLovinAdViewEventListener == null) {
            return;
        }
        AppLovinSdkUtils.runOnUiThread(new Runnable() { // from class: com.applovin.impl.sdk.utils.i.26
            @Override // java.lang.Runnable
            public void run() {
                try {
                    AppLovinAdViewEventListener.this.adOpenedFullscreen(i.b(appLovinAd), appLovinAdView);
                } catch (Throwable th) {
                    r.c("ListenerCallbackInvoker", "Unable to notify ad event listener about fullscreen opened event", th);
                }
            }
        });
    }

    public static void a(final AppLovinAdViewEventListener appLovinAdViewEventListener, final AppLovinAd appLovinAd, final AppLovinAdView appLovinAdView, final AppLovinAdViewDisplayErrorCode appLovinAdViewDisplayErrorCode) {
        if (appLovinAd == null || appLovinAdViewEventListener == null) {
            return;
        }
        AppLovinSdkUtils.runOnUiThread(new Runnable() { // from class: com.applovin.impl.sdk.utils.i.2
            @Override // java.lang.Runnable
            public void run() {
                try {
                    AppLovinAdViewEventListener.this.adFailedToDisplay(i.b(appLovinAd), appLovinAdView, appLovinAdViewDisplayErrorCode);
                } catch (Throwable th) {
                    r.c("ListenerCallbackInvoker", "Unable to notify ad event listener about display failed event", th);
                }
            }
        });
    }

    public static void a(MaxAdListener maxAdListener, MaxAd maxAd) {
        a(maxAdListener, maxAd, false);
    }

    public static void a(MaxAdListener maxAdListener, MaxAd maxAd, MaxError maxError) {
        a(maxAdListener, maxAd, maxError, false);
    }

    public static void a(final MaxAdListener maxAdListener, final MaxAd maxAd, final MaxError maxError, boolean z) {
        if (maxAd == null || maxAdListener == null) {
            return;
        }
        AppLovinSdkUtils.runOnUiThread(z, new Runnable() { // from class: com.applovin.impl.sdk.utils.i.14
            @Override // java.lang.Runnable
            public void run() {
                try {
                    MaxAdListener.this.onAdDisplayFailed(maxAd, maxError);
                } catch (Throwable th) {
                    r.c("ListenerCallbackInvoker", "Unable to notify ad event listener about ad failing to display", th);
                }
            }
        });
    }

    public static void a(MaxAdListener maxAdListener, MaxAd maxAd, MaxReward maxReward) {
        a(maxAdListener, maxAd, maxReward, false);
    }

    public static void a(final MaxAdListener maxAdListener, final MaxAd maxAd, final MaxReward maxReward, boolean z) {
        if (maxAd == null || !(maxAdListener instanceof MaxRewardedAdListener)) {
            return;
        }
        AppLovinSdkUtils.runOnUiThread(z, new Runnable() { // from class: com.applovin.impl.sdk.utils.i.17
            @Override // java.lang.Runnable
            public void run() {
                try {
                    ((MaxRewardedAdListener) MaxAdListener.this).onUserRewarded(maxAd, maxReward);
                } catch (Throwable th) {
                    r.c("ListenerCallbackInvoker", "Unable to notify ad event listener about user being rewarded", th);
                }
            }
        });
    }

    public static void a(final MaxAdListener maxAdListener, final MaxAd maxAd, boolean z) {
        if (maxAd == null || maxAdListener == null) {
            return;
        }
        AppLovinSdkUtils.runOnUiThread(z, new Runnable() { // from class: com.applovin.impl.sdk.utils.i.7
            @Override // java.lang.Runnable
            public void run() {
                try {
                    MaxAdListener.this.onAdLoaded(maxAd);
                } catch (Throwable th) {
                    r.c("ListenerCallbackInvoker", "Unable to notify ad event listener about ad being loaded", th);
                }
            }
        });
    }

    public static void a(MaxAdListener maxAdListener, String str, MaxError maxError) {
        a(maxAdListener, str, maxError, false);
    }

    public static void a(final MaxAdListener maxAdListener, final String str, final MaxError maxError, boolean z) {
        if (str == null || maxAdListener == null) {
            return;
        }
        AppLovinSdkUtils.runOnUiThread(z, new Runnable() { // from class: com.applovin.impl.sdk.utils.i.8
            @Override // java.lang.Runnable
            public void run() {
                try {
                    MaxAdListener.this.onAdLoadFailed(str, maxError);
                } catch (Throwable th) {
                    r.c("ListenerCallbackInvoker", "Unable to notify ad event listener about ad failing to load", th);
                }
            }
        });
    }

    public static void a(MaxAdRevenueListener maxAdRevenueListener, MaxAd maxAd) {
        a(maxAdRevenueListener, maxAd, false);
    }

    public static void a(final MaxAdRevenueListener maxAdRevenueListener, final MaxAd maxAd, boolean z) {
        if (maxAd == null || maxAdRevenueListener == null) {
            return;
        }
        AppLovinSdkUtils.runOnUiThread(z, new Runnable() { // from class: com.applovin.impl.sdk.utils.i.13
            @Override // java.lang.Runnable
            public void run() {
                try {
                    MaxAdRevenueListener.this.onAdRevenuePaid(maxAd);
                } catch (Throwable th) {
                    r.c("ListenerCallbackInvoker", "Unable to notify ad event listener about ad revenue being paid", th);
                }
            }
        });
    }

    public static void a(final AppLovinAdClickListener appLovinAdClickListener, final AppLovinAd appLovinAd) {
        if (appLovinAd == null || appLovinAdClickListener == null) {
            return;
        }
        AppLovinSdkUtils.runOnUiThread(new Runnable() { // from class: com.applovin.impl.sdk.utils.i.23
            @Override // java.lang.Runnable
            public void run() {
                try {
                    AppLovinAdClickListener.this.adClicked(i.b(appLovinAd));
                } catch (Throwable th) {
                    r.c("ListenerCallbackInvoker", "Unable to notify ad event listener about ad being clicked", th);
                }
            }
        });
    }

    public static void a(final AppLovinAdDisplayListener appLovinAdDisplayListener, final AppLovinAd appLovinAd) {
        if (appLovinAd == null || appLovinAdDisplayListener == null) {
            return;
        }
        AppLovinSdkUtils.runOnUiThread(new Runnable() { // from class: com.applovin.impl.sdk.utils.i.12
            @Override // java.lang.Runnable
            public void run() {
                try {
                    AppLovinAdDisplayListener.this.adDisplayed(i.b(appLovinAd));
                } catch (Throwable th) {
                    r.c("ListenerCallbackInvoker", "Unable to notify ad event listener about ad being displayed", th);
                }
            }
        });
    }

    public static void a(final AppLovinAdDisplayListener appLovinAdDisplayListener, final String str) {
        if (appLovinAdDisplayListener instanceof com.applovin.impl.sdk.a.i) {
            AppLovinSdkUtils.runOnUiThread(new Runnable() { // from class: com.applovin.impl.sdk.utils.i.1
                @Override // java.lang.Runnable
                public void run() {
                    ((com.applovin.impl.sdk.a.i) AppLovinAdDisplayListener.this).onAdDisplayFailed(str);
                }
            });
        }
    }

    public static void a(final AppLovinAdRewardListener appLovinAdRewardListener, final AppLovinAd appLovinAd, final int i) {
        if (appLovinAd == null || appLovinAdRewardListener == null) {
            return;
        }
        AppLovinSdkUtils.runOnUiThread(new Runnable() { // from class: com.applovin.impl.sdk.utils.i.6
            @Override // java.lang.Runnable
            public void run() {
                try {
                    AppLovinAdRewardListener.this.validationRequestFailed(i.b(appLovinAd), i);
                } catch (Throwable th) {
                    r.c("ListenerCallbackInvoker", "Unable to notify ad reward listener about reward validation request failing", th);
                }
            }
        });
    }

    public static void a(final AppLovinAdRewardListener appLovinAdRewardListener, final AppLovinAd appLovinAd, final Map<String, String> map) {
        if (appLovinAd == null || appLovinAdRewardListener == null) {
            return;
        }
        AppLovinSdkUtils.runOnUiThread(new Runnable() { // from class: com.applovin.impl.sdk.utils.i.3
            @Override // java.lang.Runnable
            public void run() {
                try {
                    AppLovinAdRewardListener.this.userRewardVerified(i.b(appLovinAd), map);
                } catch (Throwable th) {
                    r.c("ListenerCallbackInvoker", "Unable to notify ad reward listener about successful reward validation request", th);
                }
            }
        });
    }

    public static void a(final AppLovinAdVideoPlaybackListener appLovinAdVideoPlaybackListener, final AppLovinAd appLovinAd) {
        if (appLovinAd == null || appLovinAdVideoPlaybackListener == null) {
            return;
        }
        AppLovinSdkUtils.runOnUiThread(new Runnable() { // from class: com.applovin.impl.sdk.utils.i.24
            @Override // java.lang.Runnable
            public void run() {
                try {
                    AppLovinAdVideoPlaybackListener.this.videoPlaybackBegan(i.b(appLovinAd));
                } catch (Throwable th) {
                    r.c("ListenerCallbackInvoker", "Unable to notify ad event listener about ad playback began", th);
                }
            }
        });
    }

    public static void a(final AppLovinAdVideoPlaybackListener appLovinAdVideoPlaybackListener, final AppLovinAd appLovinAd, final double d, final boolean z) {
        if (appLovinAd == null || appLovinAdVideoPlaybackListener == null) {
            return;
        }
        AppLovinSdkUtils.runOnUiThread(new Runnable() { // from class: com.applovin.impl.sdk.utils.i.25
            @Override // java.lang.Runnable
            public void run() {
                try {
                    AppLovinAdVideoPlaybackListener.this.videoPlaybackEnded(i.b(appLovinAd), d, z);
                } catch (Throwable th) {
                    r.c("ListenerCallbackInvoker", "Unable to notify ad event listener about ad playback ended", th);
                }
            }
        });
    }

    public static void a(final AppLovinPostbackListener appLovinPostbackListener, final String str) {
        if (appLovinPostbackListener != null) {
            AppLovinSdkUtils.runOnUiThread(new Runnable() { // from class: com.applovin.impl.sdk.utils.i.20
                @Override // java.lang.Runnable
                public void run() {
                    try {
                        AppLovinPostbackListener.this.onPostbackSuccess(str);
                    } catch (Throwable th) {
                        r.c("ListenerCallbackInvoker", "Unable to notify AppLovinPostbackListener about postback URL (" + str + ") executed", th);
                    }
                }
            });
        }
    }

    public static void a(final AppLovinPostbackListener appLovinPostbackListener, final String str, final int i) {
        if (appLovinPostbackListener != null) {
            AppLovinSdkUtils.runOnUiThread(new Runnable() { // from class: com.applovin.impl.sdk.utils.i.21
                @Override // java.lang.Runnable
                public void run() {
                    try {
                        AppLovinPostbackListener.this.onPostbackFailure(str, i);
                    } catch (Throwable th) {
                        r.c("ListenerCallbackInvoker", "Unable to notify AppLovinPostbackListener about postback URL (" + str + ") failing to execute with error code (" + i + "):", th);
                    }
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static AppLovinAd b(AppLovinAd appLovinAd) {
        AppLovinAdBase appLovinAdBase = (AppLovinAdBase) appLovinAd;
        return appLovinAdBase.getDummyAd() != null ? appLovinAdBase.getDummyAd() : appLovinAd;
    }

    public static void b(final AppLovinAdViewEventListener appLovinAdViewEventListener, final AppLovinAd appLovinAd, final AppLovinAdView appLovinAdView) {
        if (appLovinAd == null || appLovinAdViewEventListener == null) {
            return;
        }
        AppLovinSdkUtils.runOnUiThread(new Runnable() { // from class: com.applovin.impl.sdk.utils.i.27
            @Override // java.lang.Runnable
            public void run() {
                try {
                    AppLovinAdViewEventListener.this.adClosedFullscreen(i.b(appLovinAd), appLovinAdView);
                } catch (Throwable th) {
                    r.c("ListenerCallbackInvoker", "Unable to notify ad event listener about fullscreen closed event", th);
                }
            }
        });
    }

    public static void b(MaxAdListener maxAdListener, MaxAd maxAd) {
        b(maxAdListener, maxAd, false);
    }

    public static void b(final MaxAdListener maxAdListener, final MaxAd maxAd, boolean z) {
        if (maxAd == null || maxAdListener == null) {
            return;
        }
        AppLovinSdkUtils.runOnUiThread(z, new Runnable() { // from class: com.applovin.impl.sdk.utils.i.9
            @Override // java.lang.Runnable
            public void run() {
                try {
                    MaxAdListener.this.onAdDisplayed(maxAd);
                } catch (Throwable th) {
                    r.c("ListenerCallbackInvoker", "Unable to notify ad event listener about ad being displayed", th);
                }
            }
        });
    }

    public static void b(final AppLovinAdDisplayListener appLovinAdDisplayListener, final AppLovinAd appLovinAd) {
        if (appLovinAd == null || appLovinAdDisplayListener == null) {
            return;
        }
        AppLovinSdkUtils.runOnUiThread(new Runnable() { // from class: com.applovin.impl.sdk.utils.i.22
            @Override // java.lang.Runnable
            public void run() {
                try {
                    AppLovinAdDisplayListener.this.adHidden(i.b(appLovinAd));
                } catch (Throwable th) {
                    r.c("ListenerCallbackInvoker", "Unable to notify ad event listener about ad being hidden", th);
                }
            }
        });
    }

    public static void b(final AppLovinAdRewardListener appLovinAdRewardListener, final AppLovinAd appLovinAd, final Map<String, String> map) {
        if (appLovinAd == null || appLovinAdRewardListener == null) {
            return;
        }
        AppLovinSdkUtils.runOnUiThread(new Runnable() { // from class: com.applovin.impl.sdk.utils.i.4
            @Override // java.lang.Runnable
            public void run() {
                try {
                    AppLovinAdRewardListener.this.userOverQuota(i.b(appLovinAd), map);
                } catch (Throwable th) {
                    r.c("ListenerCallbackInvoker", "Unable to notify ad reward listener about exceeding quota", th);
                }
            }
        });
    }

    public static void c(final AppLovinAdViewEventListener appLovinAdViewEventListener, final AppLovinAd appLovinAd, final AppLovinAdView appLovinAdView) {
        if (appLovinAd == null || appLovinAdViewEventListener == null) {
            return;
        }
        AppLovinSdkUtils.runOnUiThread(new Runnable() { // from class: com.applovin.impl.sdk.utils.i.28
            @Override // java.lang.Runnable
            public void run() {
                try {
                    AppLovinAdViewEventListener.this.adLeftApplication(i.b(appLovinAd), appLovinAdView);
                } catch (Throwable th) {
                    r.c("ListenerCallbackInvoker", "Unable to notify ad event listener about application leave event", th);
                }
            }
        });
    }

    public static void c(MaxAdListener maxAdListener, MaxAd maxAd) {
        c(maxAdListener, maxAd, false);
    }

    public static void c(final MaxAdListener maxAdListener, final MaxAd maxAd, boolean z) {
        if (maxAd == null || maxAdListener == null) {
            return;
        }
        AppLovinSdkUtils.runOnUiThread(z, new Runnable() { // from class: com.applovin.impl.sdk.utils.i.10
            @Override // java.lang.Runnable
            public void run() {
                try {
                    MaxAdListener.this.onAdHidden(maxAd);
                } catch (Throwable th) {
                    r.c("ListenerCallbackInvoker", "Unable to notify ad event listener about ad being hidden", th);
                }
            }
        });
    }

    public static void c(final AppLovinAdRewardListener appLovinAdRewardListener, final AppLovinAd appLovinAd, final Map<String, String> map) {
        if (appLovinAd == null || appLovinAdRewardListener == null) {
            return;
        }
        AppLovinSdkUtils.runOnUiThread(new Runnable() { // from class: com.applovin.impl.sdk.utils.i.5
            @Override // java.lang.Runnable
            public void run() {
                try {
                    AppLovinAdRewardListener.this.userRewardRejected(i.b(appLovinAd), map);
                } catch (Throwable th) {
                    r.c("ListenerCallbackInvoker", "Unable to notify ad reward listener about reward validation request being rejected", th);
                }
            }
        });
    }

    public static void d(MaxAdListener maxAdListener, MaxAd maxAd) {
        d(maxAdListener, maxAd, false);
    }

    public static void d(final MaxAdListener maxAdListener, final MaxAd maxAd, boolean z) {
        if (maxAd == null || maxAdListener == null) {
            return;
        }
        AppLovinSdkUtils.runOnUiThread(z, new Runnable() { // from class: com.applovin.impl.sdk.utils.i.11
            @Override // java.lang.Runnable
            public void run() {
                try {
                    MaxAdListener.this.onAdClicked(maxAd);
                } catch (Throwable th) {
                    r.c("ListenerCallbackInvoker", "Unable to notify ad event listener about ad being clicked", th);
                }
            }
        });
    }

    public static void e(MaxAdListener maxAdListener, MaxAd maxAd) {
        e(maxAdListener, maxAd, false);
    }

    public static void e(final MaxAdListener maxAdListener, final MaxAd maxAd, boolean z) {
        if (maxAd == null || !(maxAdListener instanceof MaxRewardedAdListener)) {
            return;
        }
        AppLovinSdkUtils.runOnUiThread(z, new Runnable() { // from class: com.applovin.impl.sdk.utils.i.15
            @Override // java.lang.Runnable
            public void run() {
                try {
                    ((MaxRewardedAdListener) MaxAdListener.this).onRewardedVideoStarted(maxAd);
                } catch (Throwable th) {
                    r.c("ListenerCallbackInvoker", "Unable to notify ad event listener about rewarded video starting", th);
                }
            }
        });
    }

    public static void f(MaxAdListener maxAdListener, MaxAd maxAd) {
        f(maxAdListener, maxAd, false);
    }

    public static void f(final MaxAdListener maxAdListener, final MaxAd maxAd, boolean z) {
        if (maxAd == null || !(maxAdListener instanceof MaxRewardedAdListener)) {
            return;
        }
        AppLovinSdkUtils.runOnUiThread(z, new Runnable() { // from class: com.applovin.impl.sdk.utils.i.16
            @Override // java.lang.Runnable
            public void run() {
                try {
                    ((MaxRewardedAdListener) MaxAdListener.this).onRewardedVideoCompleted(maxAd);
                } catch (Throwable th) {
                    r.c("ListenerCallbackInvoker", "Unable to notify ad event listener about rewarded video completing", th);
                }
            }
        });
    }

    public static void g(MaxAdListener maxAdListener, MaxAd maxAd) {
        g(maxAdListener, maxAd, false);
    }

    public static void g(final MaxAdListener maxAdListener, final MaxAd maxAd, boolean z) {
        if (maxAd == null || !(maxAdListener instanceof MaxAdViewAdListener)) {
            return;
        }
        AppLovinSdkUtils.runOnUiThread(z, new Runnable() { // from class: com.applovin.impl.sdk.utils.i.18
            @Override // java.lang.Runnable
            public void run() {
                try {
                    ((MaxAdViewAdListener) MaxAdListener.this).onAdExpanded(maxAd);
                } catch (Throwable th) {
                    r.c("ListenerCallbackInvoker", "Unable to notify ad event listener about ad being expanded", th);
                }
            }
        });
    }

    public static void h(MaxAdListener maxAdListener, MaxAd maxAd) {
        h(maxAdListener, maxAd, false);
    }

    public static void h(final MaxAdListener maxAdListener, final MaxAd maxAd, boolean z) {
        if (maxAd == null || !(maxAdListener instanceof MaxAdViewAdListener)) {
            return;
        }
        AppLovinSdkUtils.runOnUiThread(z, new Runnable() { // from class: com.applovin.impl.sdk.utils.i.19
            @Override // java.lang.Runnable
            public void run() {
                try {
                    ((MaxAdViewAdListener) MaxAdListener.this).onAdCollapsed(maxAd);
                } catch (Throwable th) {
                    r.c("ListenerCallbackInvoker", "Unable to notify ad event listener about ad being collapsed", th);
                }
            }
        });
    }
}
