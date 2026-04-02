package com.bytedance.sdk.openadsdk;

import android.content.Context;
import android.os.Bundle;
import android.os.Looper;
import android.os.SystemClock;
import android.text.TextUtils;
import com.bytedance.sdk.openadsdk.TTCodeGroupRit;
import com.bytedance.sdk.openadsdk.api.ge;
import com.bytedance.sdk.openadsdk.api.plugin.rb;
import com.umeng.analytics.pro.o;
import java.util.Map;
/* loaded from: classes.dex */
public final class TTAdSdk {
    public static final String INITIALIZER_CLASS_NAME = "com.bytedance.sdk.openadsdk.core.AdSdkInitializerHolder";
    private static final TTInitializer dr = new rb();

    /* loaded from: classes.dex */
    public interface InitCallback {
        void fail(int i, String str);

        void success();
    }

    public static boolean isInitSuccess() {
        TTInitializer tTInitializer = dr;
        if (tTInitializer != null) {
            return tTInitializer.isInitSuccess();
        }
        return false;
    }

    public static void init(Context context, TTAdConfig tTAdConfig, InitCallback initCallback) {
        dr(context, tTAdConfig);
        Context applicationContext = context.getApplicationContext();
        TTInitializer tTInitializer = dr;
        if (tTInitializer == null) {
            initCallback.fail(o.a.d, "Load initializer failed");
        } else {
            tTInitializer.init(applicationContext, tTAdConfig, initCallback);
        }
    }

    private static void dr(Context context, TTAdConfig tTAdConfig) {
        if (tTAdConfig != null && tTAdConfig.isDebug()) {
            ge.dr();
        }
        if (Looper.getMainLooper() != Looper.myLooper()) {
            ge.dr("Wrong Thread ! Please exec TTAdSdk.init in main thread.");
        }
        dr(context, "Context is null, please check.");
        dr(tTAdConfig, "TTAdConfig is null, please check.");
        TTAppContextHolder.setContext(context);
        updateConfigAuth(tTAdConfig);
        tTAdConfig.setExtra(TTAdConstant.PANGLE_INIT_START_TIME, Long.valueOf(SystemClock.elapsedRealtime()));
        tTAdConfig.setExtra(TTAdConstant.KEY_S_C, "main");
        tTAdConfig.setExtra(TTAdConstant.KEY_L_S, true);
        tTAdConfig.setExtra(TTAdConstant.KEY_EXT_API_CODE, 999);
        Thread currentThread = Thread.currentThread();
        tTAdConfig.setExtra(TTAdConstant.KEY_T_N, currentThread.getName());
        tTAdConfig.setExtra(TTAdConstant.KEY_T_P, Integer.valueOf(currentThread.getPriority()));
    }

    public static TTAdManager getAdManager() {
        TTInitializer tTInitializer = dr;
        if (tTInitializer != null) {
            return tTInitializer.getAdManager();
        }
        return null;
    }

    public static void updateAdConfig(TTAdConfig tTAdConfig) {
        TTAdManager adManager;
        if (tTAdConfig == null || (adManager = dr.getAdManager()) == null) {
            return;
        }
        Bundle bundle = new Bundle();
        if (!TextUtils.isEmpty(tTAdConfig.getData())) {
            bundle.putString("extra_data", tTAdConfig.getData());
        }
        if (!TextUtils.isEmpty(tTAdConfig.getKeywords())) {
            bundle.putString("keywords", tTAdConfig.getKeywords());
        }
        if (!bundle.keySet().isEmpty()) {
            adManager.getExtra(AdConfig.class, bundle);
        }
    }

    public static void updateConfigAuth(TTAdConfig tTAdConfig) {
        com.bytedance.sdk.openadsdk.live.ge dr2;
        if (tTAdConfig != null && (dr2 = com.bytedance.sdk.openadsdk.live.ge.dr()) != null) {
            dr2.dr(tTAdConfig.getInjectionAuth());
        }
    }

    public static void updatePaid(boolean z) {
        TTAdManager adManager = dr.getAdManager();
        if (adManager == null) {
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putBoolean("is_paid", z);
        if (!bundle.keySet().isEmpty()) {
            adManager.getExtra(AdConfig.class, bundle);
        }
    }

    public static void getCodeGroupRit(final long j, final TTCodeGroupRit.TTCodeGroupRitListener tTCodeGroupRitListener) {
        TTInitializer tTInitializer = dr;
        if (tTInitializer != null) {
            tTInitializer.getAdManager().register(new CodeGroupRitObject() { // from class: com.bytedance.sdk.openadsdk.TTAdSdk.1
                @Override // com.bytedance.sdk.openadsdk.CodeGroupRitObject
                public long getCodeGroupId() {
                    return j;
                }

                @Override // com.bytedance.sdk.openadsdk.CodeGroupRitObject
                public TTCodeGroupRit.TTCodeGroupRitListener getListener() {
                    return tTCodeGroupRitListener;
                }
            });
        } else if (tTCodeGroupRitListener != null) {
            tTCodeGroupRitListener.onFail(o.a.d, "please init sdk first!");
        }
    }

    private static void dr(Object obj, String str) {
        if (obj == null) {
            throw new IllegalArgumentException(str);
        }
    }

    public static boolean isOnePointFiveAdType(TTNativeExpressAd tTNativeExpressAd) {
        Map<String, Object> mediaExtraInfo;
        if (tTNativeExpressAd == null) {
            mediaExtraInfo = null;
        } else {
            try {
                mediaExtraInfo = tTNativeExpressAd.getMediaExtraInfo();
            } catch (Throwable th) {
                th.printStackTrace();
                return false;
            }
        }
        if (mediaExtraInfo != null && mediaExtraInfo.containsKey("_tt_ad_type_onepointfive")) {
            return ((Boolean) mediaExtraInfo.get("_tt_ad_type_onepointfive")).booleanValue();
        }
        return false;
    }
}
