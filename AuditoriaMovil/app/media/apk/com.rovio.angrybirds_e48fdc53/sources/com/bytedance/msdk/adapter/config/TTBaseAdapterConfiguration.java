package com.bytedance.msdk.adapter.config;

import android.content.Context;
import com.bytedance.msdk.adapter.util.Logger;
import com.bytedance.msdk.api.v2.GMAppDialogClickListener;
import com.bytedance.msdk.api.v2.GMPrivacyConfig;
import com.bytedance.msdk.api.v2.IGMLiveTokenInjectionAuth;
import java.util.Map;
/* loaded from: classes.dex */
public abstract class TTBaseAdapterConfiguration implements ITTAdapterConfiguration {
    public static final String APP_ID_EXTRA_KEY = "app_id";
    public static final String APP_KEY_EXTRA_KEY = "app_key";
    public static final String APP_NAME_EXTRA_KEY = "app_name";
    public static final String BAIDU_HTTPS = "baidu_https";
    public static final String BAIDU_WX_APP_ID = "baidu_wx_app_id";
    public static final String PANGLE_APP_NAME = "pangle_app_name";
    public static final String PANGLE_DIRECT_DOWNLOAD_NETWORKTYPE = "pangle_direct_download_networktype";
    public static final String PANGLE_IS_PANGLE_ALLOW_SHOW_NOTIFY = "pangle_is_pangle_allow_show_notify";
    public static final String PANGLE_IS_PANGLE_ALLOW_SHOW_PAGE_WHEN_SCREEN_LOCK = "pangle_is_pangle_allow_show_page_when_screen_lock";
    public static final String PANGLE_IS_PANGLE_PAID = "pangle_is_pangle_paid";
    public static final String PANGLE_IS_PANGLE_USE_TEXTURE_VIEW = "pangle_is_pangle_use_texture_view";
    public static final String PANGLE_KEYWORDS = "pangle_keywords";
    public static final String PANGLE_NEED_CLEAR_TASK_RESET = "pangle_need_clear_task_reset";
    public static final String PANGLE_PLUGIN_UPDATE_CONFIG = "pangle_plugin_update_config";
    public static final String PANGLE_SUPPORT_MULTI_PROCESS = "pangle_support_multi_process";
    public static final String PANGLE_TITLE_BAR_THEME = "pangle_title_bar_theme";
    public static String TT_MSDK_ADSLOT_INFO = "tt_msdk_adslot_info";
    public static String TT_MSDK_CLIENT_REQ_ID = "tt_msdk_client_req_id";
    public static String TT_MSDK_THEME_STATUS = "tt_msdk_theme_status";
    public static String TT_MSDK_WATER_FALL_AB_TEST = "tt_msdk_water_fall_ab_test";
    public static String TT_MSDK_WATER_ORIGIN_TYPE = "tt_msdk_water_orgin_type";
    public static String TT_MSDK_WATER_SUB_AD_TYPE = "tt_msdk_water_sub_ad_type";
    private volatile boolean a = false;

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0080, code lost:
        if (r7[r4].length() <= r8[r4].length()) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x008a, code lost:
        if (r7.length <= r8.length) goto L9;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static int a(java.lang.String r7, java.lang.String r8) {
        /*
            boolean r0 = android.text.TextUtils.isEmpty(r7)
            r1 = 0
            r2 = -1
            r3 = 1
            if (r0 == 0) goto L11
            boolean r0 = android.text.TextUtils.isEmpty(r8)
            if (r0 == 0) goto L11
            goto L8e
        L11:
            boolean r0 = android.text.TextUtils.isEmpty(r7)
            if (r0 == 0) goto L1a
        L17:
            r1 = r2
            goto L8e
        L1a:
            boolean r0 = android.text.TextUtils.isEmpty(r8)
            if (r0 != 0) goto L8d
            java.lang.String r0 = "v"
            boolean r4 = r7.startsWith(r0)
            java.lang.String r5 = "V"
            if (r4 != 0) goto L30
            boolean r4 = r7.startsWith(r5)
            if (r4 == 0) goto L34
        L30:
            java.lang.String r7 = r7.substring(r3)
        L34:
            boolean r0 = r8.startsWith(r0)
            if (r0 != 0) goto L40
            boolean r0 = r8.startsWith(r5)
            if (r0 == 0) goto L44
        L40:
            java.lang.String r8 = r8.substring(r3)
        L44:
            java.lang.String r0 = "\\."
            java.lang.String[] r7 = r7.split(r0)
            java.lang.String[] r8 = r8.split(r0)
            int r0 = r7.length
            int r4 = r8.length
            int r0 = java.lang.Math.min(r0, r4)
            r4 = r1
        L55:
            if (r4 >= r0) goto L83
            r5 = r7[r4]
            int r5 = r5.length()
            r6 = r8[r4]
            int r6 = r6.length()
            if (r5 != r6) goto L74
            r5 = r7[r4]
            r6 = r8[r4]
            int r5 = r5.compareTo(r6)
            if (r5 != 0) goto L72
            int r4 = r4 + 1
            goto L55
        L72:
            r1 = r5
            goto L8e
        L74:
            r7 = r7[r4]
            int r7 = r7.length()
            r8 = r8[r4]
            int r8 = r8.length()
            if (r7 > r8) goto L8d
            goto L17
        L83:
            int r0 = r7.length
            int r4 = r8.length
            if (r0 != r4) goto L88
            goto L8e
        L88:
            int r7 = r7.length
            int r8 = r8.length
            if (r7 > r8) goto L8d
            goto L17
        L8d:
            r1 = r3
        L8e:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.msdk.adapter.config.TTBaseAdapterConfiguration.a(java.lang.String, java.lang.String):int");
    }

    @Override // com.bytedance.msdk.adapter.config.ITTAdapterConfiguration
    public void checkVersion() {
        try {
            String groMoreSdkVersion = getGroMoreSdkVersion();
            if (a(groMoreSdkVersion, "4.2.0") != 0) {
                Logger.e("TTMediationSDK_InitChecker", getAdNetworkName() + "版本号：" + getNetworkSdkVersion() + " , " + getAdNetworkName() + "Adapter版本号：" + getAdapterVersion() + " , GroMore版本不符合，要求等于" + groMoreSdkVersion + ".x ，当前是4.2.0.2");
            } else {
                Logger.d("TTMediationSDK_InitChecker", getAdNetworkName() + "版本号：" + getNetworkSdkVersion() + " , " + getAdNetworkName() + "Adapter版本号：" + getAdapterVersion() + " , GroMore版本正常 ，要求等于" + groMoreSdkVersion + ".x ，当前是4.2.0.2");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override // com.bytedance.msdk.adapter.config.ITTAdapterConfiguration
    public Map<String, Object> getBiddingTokenMap(Context context, Map<String, Object> map) {
        return null;
    }

    @Override // com.bytedance.msdk.adapter.config.ITTAdapterConfiguration
    public Map<String, String> getMsdkRequestOptions() {
        return null;
    }

    @Override // com.bytedance.msdk.adapter.config.ITTAdapterConfiguration
    public String getNetworkSdkPluginVersion() {
        return "";
    }

    @Override // com.bytedance.msdk.adapter.config.ITTAdapterConfiguration
    public void initializeNetwork(Context context, Map<String, Object> map, TTOnNetworkInitializationFinishedListener tTOnNetworkInitializationFinishedListener) {
    }

    public boolean isInitedSuccess() {
        return this.a;
    }

    @Override // com.bytedance.msdk.adapter.config.ITTAdapterConfiguration
    public boolean isNewInitFunction() {
        return false;
    }

    public void setInitedSuccess(boolean z) {
        this.a = z;
    }

    @Override // com.bytedance.msdk.adapter.config.ITTAdapterConfiguration
    public void setInjectionAuth(IGMLiveTokenInjectionAuth iGMLiveTokenInjectionAuth) {
    }

    @Override // com.bytedance.msdk.adapter.config.ITTAdapterConfiguration
    public void setMsdkRequestOptions(Map<String, String> map) {
    }

    @Override // com.bytedance.msdk.adapter.config.ITTAdapterConfiguration
    public void setPrivacyConfig(GMPrivacyConfig gMPrivacyConfig) {
    }

    @Override // com.bytedance.msdk.adapter.config.ITTAdapterConfiguration
    public void setThemeStatus(Map<String, Object> map) {
    }

    @Override // com.bytedance.msdk.adapter.config.ITTAdapterConfiguration
    public int showOpenOrInstallAppDialog(GMAppDialogClickListener gMAppDialogClickListener) {
        return 0;
    }
}
