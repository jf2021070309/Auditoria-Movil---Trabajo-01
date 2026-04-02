package com.bytedance.msdk.api.v2;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import android.util.Log;
import bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.a;
import bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.b;
import bykvm_19do.bykvm_19do.bykvm_if122.bykvm_int108.bykvm_if122.c;
import bykvm_19do.bykvm_19do.bykvm_if122.bykvm_try19.a0;
import bykvm_19do.bykvm_19do.bykvm_if122.bykvm_try19.d;
import bykvm_19do.bykvm_19do.bykvm_if122.bykvm_try19.f0;
import bykvm_19do.bykvm_19do.bykvm_if122.bykvm_try19.m;
import com.bytedance.msdk.adapter.config.ITTAdapterConfiguration;
import com.bytedance.msdk.adapter.config.TTBaseAdapterConfiguration;
import com.bytedance.msdk.adapter.util.Logger;
import com.bytedance.msdk.api.activity.TTDelegateActivity;
import com.bytedance.msdk.api.v2.ad.custom.init.GMCustomAdapterConfiguration;
import com.ss.android.socialbase.downloader.utils.DownloadExpSwitchCode;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/* loaded from: classes.dex */
public final class GMMediationAdSdk {
    private static final int TEST_NUM = 33;

    public static boolean configLoadSuccess() {
        if (TextUtils.isEmpty(b.L().b())) {
            return false;
        }
        return a.f().C();
    }

    @Deprecated
    private static ITTAdapterConfiguration getAdapterConfiguration(String str) {
        return c.b().a(str);
    }

    public static String getAppId() {
        return b.L().b();
    }

    public static String getAppName() {
        return b.L().i();
    }

    @Deprecated
    private static GMCustomAdapterConfiguration getCustomAdapterConfiguration(String str) {
        return bykvm_19do.bykvm_19do.bykvm_if122.bykvm_int108.bykvm_if122.b.a(str);
    }

    public static Map<String, Object> getGMSDKExtraInfo() {
        return b.L().g();
    }

    public static String getPangleData() {
        return b.L().k();
    }

    public static Map<String, String> getPangleExtraData() {
        return b.L().d();
    }

    public static boolean getPanglePaid() {
        return b.L().F();
    }

    public static String getSdkVersion() {
        return "4.2.0.2";
    }

    public static String getValueFromPPeInfo(String str) {
        return a.d() == null ? "" : f0.a("tt_mediation_ppe_info", a.d()).a(str, "");
    }

    public static String getZbh(Context context) {
        return a0.a();
    }

    @Deprecated
    public static void initUnityForBanner(Activity activity) {
    }

    public static void initialize(Context context, GMAdConfig gMAdConfig) {
        String str;
        if (context == null) {
            str = "GMMediationAdSdk初始化失败，context不能是null";
        } else if (gMAdConfig != null) {
            bykvm_19do.bykvm_19do.bykvm_if122.bykvm_new1.bykvm_19do.a.s().a(gMAdConfig.getAppId(), gMAdConfig.getSupportMultiProcess());
            bykvm_19do.bykvm_19do.bykvm_if122.bykvm_new1.bykvm_19do.a.s().o();
            if (gMAdConfig.isDebug()) {
                Logger.openDebugMode();
                bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_int108.a.d();
            }
            m.a(context);
            bykvm_19do.bykvm_19do.bykvm_if122.bykvm_int108.c.a(gMAdConfig, context.getApplicationContext());
            bykvm_19do.bykvm_19do.bykvm_if122.bykvm_new1.bykvm_19do.a.s().j();
            return;
        } else {
            str = "GMMediationAdSdk初始化失败，TTAdConfig不能是null";
        }
        Log.d("TTMediationSDK_SDK_Init", str);
    }

    public static boolean isAdapterVersionFit(String str, String str2) {
        return bykvm_19do.bykvm_19do.bykvm_if122.bykvm_int108.a.b(str, str2);
    }

    public static boolean isAdnVersionFit(String str, String str2) {
        return bykvm_19do.bykvm_19do.bykvm_if122.bykvm_int108.a.c(str, str2);
    }

    @Deprecated
    private static boolean isCustom(String str) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(b.L().b())) {
            return false;
        }
        return a.f().h(str);
    }

    public static boolean isTestDemo() {
        return b.L().J();
    }

    public static void preload(final Activity activity, final List<GMPreloadRequestInfo> list, final int i, final int i2) {
        registerConfigCallback(new GMSettingConfigCallback() { // from class: com.bytedance.msdk.api.v2.GMMediationAdSdk.1
            @Override // com.bytedance.msdk.api.v2.GMSettingConfigCallback
            public void configLoad() {
                bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_int108.bykvm_if122.b.d().a(activity, list, i, i2);
            }
        });
    }

    public static void register(Object obj, Object obj2) {
        b.L().a(obj, obj2);
    }

    public static void registerConfigCallback(GMSettingConfigCallback gMSettingConfigCallback) {
        a.f().a(gMSettingConfigCallback);
    }

    public static void requestPermissionIfNecessary(Context context) {
        if (context == null) {
            return;
        }
        Intent intent = new Intent(context, TTDelegateActivity.class);
        intent.addFlags(DownloadExpSwitchCode.BUGFIX_GETPACKAGEINFO_BY_UNZIP);
        intent.putExtra("type", 3);
        if (context != null) {
            d.a(context, intent, null);
        }
    }

    public static void requestPermissionIfNecessary(Context context, int[] iArr) {
        Intent intent = new Intent(context, TTDelegateActivity.class);
        intent.addFlags(DownloadExpSwitchCode.BUGFIX_GETPACKAGEINFO_BY_UNZIP);
        intent.putExtra("type", 1);
        intent.putExtra("permissions", iArr);
        if (context != null) {
            d.a(context, intent, null);
        }
    }

    @Deprecated
    private static void resetIfTest() {
        a.f().a(bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_void092.c.W().b("if_test"));
    }

    @Deprecated
    private static void setIfTest(int i) {
        a.f().a(i);
    }

    public static void setPangleData(String str) {
        b.L().d(str);
    }

    public static void setPulisherDid(String str) {
        Logger.d("TTMediationSDK", "app运行中setPulisherDid: " + str);
        b.L().f(str);
    }

    public static void setThemeStatus(int i) {
        HashMap hashMap = new HashMap();
        hashMap.put(TTBaseAdapterConfiguration.TT_MSDK_THEME_STATUS, Integer.valueOf(i));
        Map<String, ITTAdapterConfiguration> a = c.b().a();
        if (a == null || a.size() == 0) {
            return;
        }
        for (ITTAdapterConfiguration iTTAdapterConfiguration : a.values()) {
            if (iTTAdapterConfiguration != null) {
                iTTAdapterConfiguration.setThemeStatus(hashMap);
            }
        }
    }

    public static void setUserInfoForSegment(GMConfigUserInfoForSegment gMConfigUserInfoForSegment) {
        b.L().a(gMConfigUserInfoForSegment, false);
    }

    public static int showOpenOrInstallAppDialog(GMAppDialogClickListener gMAppDialogClickListener) {
        ITTAdapterConfiguration a = c.b().a("gdt");
        if (a == null) {
            return 0;
        }
        return a.showOpenOrInstallAppDialog(gMAppDialogClickListener);
    }

    public static void unregisterConfigCallback(GMSettingConfigCallback gMSettingConfigCallback) {
        a.f().b(gMSettingConfigCallback);
    }

    public static void updatePangleConfig(GMAdConfig gMAdConfig) {
        if (gMAdConfig == null) {
            return;
        }
        if (!TextUtils.isEmpty(gMAdConfig.getGMPangleOption().getData())) {
            b.L().d(gMAdConfig.getGMPangleOption().getData());
        }
        if (!TextUtils.isEmpty(gMAdConfig.getGMPangleOption().getKeywords())) {
            b.L().e(gMAdConfig.getGMPangleOption().getKeywords());
        }
        b.L().e(gMAdConfig.getGMPangleOption().getExtraData());
    }

    public static void updatePanglePaid(boolean z) {
        b.L().f(z);
    }

    public static void updatePrivacyConfig(GMPrivacyConfig gMPrivacyConfig) {
        bykvm_19do.bykvm_19do.bykvm_if122.bykvm_int108.c.a(gMPrivacyConfig);
    }
}
