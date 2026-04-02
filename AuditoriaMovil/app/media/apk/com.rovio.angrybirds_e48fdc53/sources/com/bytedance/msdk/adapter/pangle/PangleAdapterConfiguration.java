package com.bytedance.msdk.adapter.pangle;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import com.bykv.vk.openvk.api.proto.Bridge;
import com.bykv.vk.openvk.api.proto.ValueSet;
import com.bytedance.msdk.adapter.config.TTBaseAdapterConfiguration;
import com.bytedance.msdk.adapter.util.Logger;
import com.bytedance.msdk.api.AdSlot;
import com.bytedance.msdk.api.v2.GMLiveAuthCallback;
import com.bytedance.msdk.api.v2.GMLiveToken;
import com.bytedance.msdk.api.v2.IGMLiveTokenInjectionAuth;
import com.bytedance.sdk.openadsdk.LocationProvider;
import com.bytedance.sdk.openadsdk.TTAdConfig;
import com.bytedance.sdk.openadsdk.TTAdManager;
import com.bytedance.sdk.openadsdk.TTAdSdk;
import com.bytedance.sdk.openadsdk.TTCustomController;
import com.bytedance.sdk.openadsdk.TTLocation;
import com.bytedance.sdk.openadsdk.live.ITTLiveTokenInjectionAuth;
import com.bytedance.sdk.openadsdk.live.TTLiveAuthCallback;
import com.bytedance.sdk.openadsdk.live.TTLiveToken;
import com.bytedance.sdk.openadsdk.mediation.MediationConstant;
import com.bytedance.sdk.openadsdk.mediation.bridge.IMediationLocation;
import com.bytedance.sdk.openadsdk.mediation.bridge.MediationCustomController;
import com.bytedance.sdk.openadsdk.mediation.bridge.MediationResultBuilder;
import com.bytedance.sdk.openadsdk.mediation.bridge.MediationValueSetBuilder;
import com.bytedance.sdk.openadsdk.mediation.bridge.init.MediationInitImpl;
import com.bytedance.sdk.openadsdk.mediation.bridge.valueset.MediationInitConfig;
import com.bytedance.sdk.openadsdk.mediation.bridge.valueset.MediationValueUtil;
import com.facebook.appevents.AppEventsConstants;
import java.util.Map;
/* loaded from: classes.dex */
public class PangleAdapterConfiguration extends MediationInitImpl {
    public static final int testNum = 1;
    private IGMLiveTokenInjectionAuth c;
    private volatile boolean a = false;
    private volatile boolean b = false;
    private final TTCustomController d = new TTCustomController() { // from class: com.bytedance.msdk.adapter.pangle.PangleAdapterConfiguration.3
        @Override // com.bytedance.sdk.openadsdk.TTCustomController
        public boolean alist() {
            return PangleAdapterConfiguration.this.mInitConfig.appList();
        }

        @Override // com.bytedance.sdk.openadsdk.TTCustomController
        public String getDevImei() {
            return PangleAdapterConfiguration.this.mInitConfig.getDevImei();
        }

        @Override // com.bytedance.sdk.openadsdk.TTCustomController
        public String getDevOaid() {
            return PangleAdapterConfiguration.this.mInitConfig.getDevOaid();
        }

        @Override // com.bytedance.sdk.openadsdk.TTCustomController
        public String getMacAddress() {
            return PangleAdapterConfiguration.this.mInitConfig.getMacAddress();
        }

        @Override // com.bytedance.sdk.openadsdk.TTCustomController
        public LocationProvider getTTLocation() {
            IMediationLocation location = PangleAdapterConfiguration.this.mInitConfig.getLocation();
            if (location != null) {
                return new TTLocation(location.getLatitude(), location.getLongitude());
            }
            return null;
        }

        @Override // com.bytedance.sdk.openadsdk.TTCustomController
        public boolean isCanUseAndroidId() {
            Logger.d("TMe", "--==-- 穿山甲获取的isCanUseAndroidId: " + PangleAdapterConfiguration.this.mInitConfig.isCanUseAndroidId());
            return PangleAdapterConfiguration.this.mInitConfig.isCanUseAndroidId();
        }

        @Override // com.bytedance.sdk.openadsdk.TTCustomController
        public boolean isCanUseLocation() {
            return PangleAdapterConfiguration.this.mInitConfig.isCanUseLocation();
        }

        @Override // com.bytedance.sdk.openadsdk.TTCustomController
        public boolean isCanUsePhoneState() {
            return PangleAdapterConfiguration.this.mInitConfig.isCanUsePhoneState();
        }

        @Override // com.bytedance.sdk.openadsdk.TTCustomController
        public boolean isCanUseWifiState() {
            return PangleAdapterConfiguration.this.mInitConfig.isCanUseWifiState();
        }

        @Override // com.bytedance.sdk.openadsdk.TTCustomController
        public boolean isCanUseWriteExternal() {
            return PangleAdapterConfiguration.this.mInitConfig.isCanUseWriteExternal();
        }
    };

    private int a() {
        int ageGroup;
        MediationInitConfig mediationInitConfig = this.mInitConfig;
        if (mediationInitConfig != null && (ageGroup = mediationInitConfig.getAgeGroup()) != 0) {
            int i = 1;
            if (ageGroup != 1) {
                i = 2;
                if (ageGroup != 2) {
                }
            }
            return i;
        }
        return 0;
    }

    private TTAdConfig a(String str) {
        PangleAdapterUtils.printPrivacyLog(this.mInitConfig);
        Map initAdnMap = this.mInitConfig.getInitAdnMap();
        Boolean bool = (Boolean) initAdnMap.get(TTBaseAdapterConfiguration.PANGLE_IS_PANGLE_USE_TEXTURE_VIEW);
        boolean z = true;
        boolean z2 = bool != null && bool.booleanValue();
        String str2 = (String) initAdnMap.get(TTBaseAdapterConfiguration.PANGLE_APP_NAME);
        Boolean bool2 = (Boolean) initAdnMap.get(TTBaseAdapterConfiguration.PANGLE_IS_PANGLE_PAID);
        boolean z3 = bool2 != null && bool2.booleanValue();
        Integer num = (Integer) initAdnMap.get(TTBaseAdapterConfiguration.PANGLE_TITLE_BAR_THEME);
        Boolean bool3 = (Boolean) initAdnMap.get(TTBaseAdapterConfiguration.PANGLE_IS_PANGLE_ALLOW_SHOW_NOTIFY);
        boolean z4 = bool3 != null && bool3.booleanValue();
        Boolean bool4 = (Boolean) initAdnMap.get(TTBaseAdapterConfiguration.PANGLE_IS_PANGLE_ALLOW_SHOW_PAGE_WHEN_SCREEN_LOCK);
        if (bool4 == null || !bool4.booleanValue()) {
            z = false;
        }
        int[] iArr = (int[]) initAdnMap.get(TTBaseAdapterConfiguration.PANGLE_DIRECT_DOWNLOAD_NETWORKTYPE);
        d();
        String[] strArr = (String[]) initAdnMap.get(TTBaseAdapterConfiguration.PANGLE_NEED_CLEAR_TASK_RESET);
        String str3 = (String) initAdnMap.get(TTBaseAdapterConfiguration.PANGLE_KEYWORDS);
        Integer num2 = (Integer) initAdnMap.get(TTBaseAdapterConfiguration.PANGLE_PLUGIN_UPDATE_CONFIG);
        Object obj = initAdnMap.get(TTBaseAdapterConfiguration.PANGLE_SUPPORT_MULTI_PROCESS);
        boolean booleanValue = obj instanceof Boolean ? ((Boolean) obj).booleanValue() : false;
        Logger.d("TMe", "--==-- csj multiProcess: " + booleanValue);
        TTAdConfig.Builder debug = new TTAdConfig.Builder().appId(str).useTextureView(z2).appName(str2).paid(z3).titleBarTheme(num == null ? 0 : num.intValue()).allowShowNotify(z4).allowShowPageWhenScreenLock(z).debug(Logger.isDebug());
        if (iArr == null) {
            iArr = new int[0];
        }
        TTAdConfig.Builder data = debug.directDownloadNetworkType(iArr).supportMultiProcess(booleanValue).data(PangleAdapterUtils.getPangleDataAndExtraData().toString());
        if (strArr == null) {
            strArr = new String[0];
        }
        TTAdConfig.Builder customController = data.needClearTaskReset(strArr).customController(this.d);
        if (str3 == null) {
            str3 = "";
        }
        TTAdConfig.Builder ageGroup = customController.keywords(str3).setPluginUpdateConfig(num2 == null ? 2 : num2.intValue()).setAgeGroup(a());
        a(ageGroup);
        return ageGroup.build();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(Bridge bridge) {
        if (bridge != null) {
            bridge.call(8122, MediationValueSetBuilder.create().build(), Void.class);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(Bridge bridge, String str) {
        if (bridge != null) {
            MediationResultBuilder create = MediationResultBuilder.create();
            create.setSuccess(false);
            create.setCode(MediationConstant.ErrorCode.ADN_INIT_FAIL);
            create.setMessage(str);
            MediationValueSetBuilder create2 = MediationValueSetBuilder.create();
            create2.add(8022, create);
            bridge.call(8123, create2.build(), Void.class);
        }
    }

    private void a(TTAdConfig.Builder builder) {
        try {
            if (this.c != null) {
                builder.injectionAuth(new ITTLiveTokenInjectionAuth() { // from class: com.bytedance.msdk.adapter.pangle.PangleAdapterConfiguration.2
                    @Override // com.bytedance.sdk.openadsdk.live.ITTLiveTokenInjectionAuth
                    public TTLiveToken getTokenInfo() {
                        GMLiveToken tokenInfo;
                        if (PangleAdapterConfiguration.this.c == null || (tokenInfo = PangleAdapterConfiguration.this.c.getTokenInfo()) == null) {
                            return null;
                        }
                        return new TTLiveToken(tokenInfo.name, tokenInfo.accessToken, tokenInfo.openId, tokenInfo.expireAt, tokenInfo.refreshToken);
                    }

                    @Override // com.bytedance.sdk.openadsdk.live.ITTLiveTokenInjectionAuth
                    public boolean isLogin() {
                        if (PangleAdapterConfiguration.this.c != null) {
                            return PangleAdapterConfiguration.this.c.isLogin();
                        }
                        return false;
                    }

                    @Override // com.bytedance.sdk.openadsdk.live.ITTLiveTokenInjectionAuth
                    public void onTokenInvalid(TTLiveToken tTLiveToken, final TTLiveAuthCallback tTLiveAuthCallback, Activity activity, Map<String, String> map) {
                        if (PangleAdapterConfiguration.this.c != null) {
                            PangleAdapterConfiguration.this.c.onTokenInvalid(tTLiveToken != null ? new GMLiveToken(tTLiveToken.name, tTLiveToken.accessToken, tTLiveToken.openId, tTLiveToken.expireAt, tTLiveToken.refreshToken) : null, tTLiveAuthCallback != null ? new GMLiveAuthCallback(this) { // from class: com.bytedance.msdk.adapter.pangle.PangleAdapterConfiguration.2.1
                                @Override // com.bytedance.msdk.api.v2.GMLiveAuthCallback
                                public void onAuth(GMLiveToken gMLiveToken) {
                                    if (gMLiveToken != null) {
                                        tTLiveAuthCallback.onAuth(new TTLiveToken(gMLiveToken.name, gMLiveToken.accessToken, gMLiveToken.openId, gMLiveToken.expireAt, gMLiveToken.refreshToken));
                                    }
                                }

                                @Override // com.bytedance.msdk.api.v2.GMLiveAuthCallback
                                public void onFailed(Throwable th) {
                                    tTLiveAuthCallback.onFailed(th);
                                }
                            } : null, activity, map);
                        }
                    }
                });
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    private void a(MediationCustomController mediationCustomController) {
        if (mediationCustomController != null) {
            PangleAdapterUtils.printPrivacyLog(this.mInitConfig);
            d();
        }
    }

    private void a(Map<String, Object> map) {
        if (map == null) {
            return;
        }
        Object obj = map.get(TTBaseAdapterConfiguration.TT_MSDK_THEME_STATUS);
        int intValue = obj instanceof Integer ? ((Integer) obj).intValue() : 0;
        if (intValue == 0 || intValue == 1) {
            TTAdSdk.getAdManager().setThemeStatus(intValue);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    private int[] a(int i, AdSlot adSlot) {
        switch (i) {
            case 1:
                return new int[]{320, 50};
            case 2:
                return new int[]{320, 100};
            case 3:
                return new int[]{300, 250};
            case 4:
                return new int[]{468, 60};
            case 5:
                return new int[]{728, 90};
            case 6:
                if (adSlot.getImgAcceptedWidth() > 0 && adSlot.getImgAcceptedHeight() > 0) {
                    return new int[]{adSlot.getImgAcceptedWidth(), adSlot.getImgAcceptedHeight()};
                }
                if (adSlot.getImgAcceptedWidth() > 0 && adSlot.getImgAcceptedHeight() < 0) {
                    return new int[]{adSlot.getImgAcceptedWidth(), 0};
                }
                break;
        }
        return new int[]{320, 50};
    }

    private String b() {
        TTAdManager adManager = TTAdSdk.getAdManager();
        if (adManager == null) {
            return "";
        }
        try {
            return adManager.getPluginVersion();
        } catch (Throwable th) {
            return "0.0";
        }
    }

    private String c() {
        TTAdManager adManager = TTAdSdk.getAdManager();
        if (adManager == null) {
            return "";
        }
        try {
            return adManager.getSDKVersion();
        } catch (Exception e) {
            return "0.0";
        }
    }

    private void d() {
        PangleAdapterUtils.setPangleData(PangleAdapterUtils.updateJsonArrayStr(PangleAdapterUtils.getPangleData(), "personal_ads_type", this.mInitConfig.isLimitPersonalAds() ? AppEventsConstants.EVENT_PARAM_VALUE_NO : "1"));
    }

    @Override // com.bytedance.sdk.openadsdk.mediation.bridge.init.MediationInitImpl
    public <T> T callFunction(int i, ValueSet valueSet, Class<T> cls) {
        if (i == 8101) {
            return (T) this.mInitConfig.getGdtAdapterVersion();
        }
        if (i == 8104) {
            try {
                return (T) c();
            } catch (Exception e) {
                return "0.0";
            }
        } else if (i == 8105) {
            return (T) this.mInitConfig.getGromoreVersion();
        } else {
            if (i == 8124) {
                MediationCustomController mediationCustomController = (MediationCustomController) valueSet.objectValue(8091, MediationCustomController.class);
                this.mInitConfig.setMediationCustomController(mediationCustomController);
                a(mediationCustomController);
            } else if (i == 8102) {
                Context context = (Context) valueSet.objectValue(8009, Context.class);
                Map<String, Object> map = (Map) valueSet.objectValue(8006, Map.class);
                if (context != null && map != null) {
                    return (T) getBiddingToken(context, map);
                }
            } else if (i == 8243) {
                this.c = (IGMLiveTokenInjectionAuth) valueSet.objectValue(8087, IGMLiveTokenInjectionAuth.class);
            } else if (i == 8244) {
                return (T) b();
            } else {
                if (i == 8242) {
                    a((Map) valueSet.objectValue(8006, Map.class));
                }
            }
            return (T) MediationValueUtil.checkClassType(cls);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:101:0x0173, code lost:
        if (r3.getImgAcceptedWidth() > 0) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:114:0x01b3, code lost:
        if (r3.getImgAcceptedHeight() > 0) goto L79;
     */
    /* JADX WARN: Code restructure failed: missing block: B:115:0x01b5, code lost:
        r0 = r3.getImgAcceptedWidth();
        r6 = r3.getImgAcceptedHeight();
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x0121, code lost:
        if (r3.getImgAcceptedHeight() > 0) goto L78;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x012e, code lost:
        if (r3.getImgAcceptedWidth() > 0) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x014c, code lost:
        if (r3.getImgAcceptedHeight() > 0) goto L78;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x015b, code lost:
        if (r3.getImgAcceptedWidth() > 0) goto L40;
     */
    /* JADX WARN: Removed duplicated region for block: B:117:0x01c2 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:120:0x01c7  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x01d4 A[ADDED_TO_REGION] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.String getBiddingToken(android.content.Context r17, java.util.Map<java.lang.String, java.lang.Object> r18) {
        /*
            Method dump skipped, instructions count: 489
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.msdk.adapter.pangle.PangleAdapterConfiguration.getBiddingToken(android.content.Context, java.util.Map):java.lang.String");
    }

    @Override // com.bytedance.sdk.openadsdk.mediation.bridge.init.MediationInitImpl
    public void realInitAdn(Context context, MediationInitConfig mediationInitConfig) {
        synchronized (PangleAdapterConfiguration.class) {
            String appId = this.mInitConfig.getAppId();
            Logger.d("TTMediationSDK", "init Pangle SDK start......appId:" + appId);
            if (!TextUtils.isEmpty(appId) && context != null) {
                if (this.b) {
                    a(this.mInitConfig.getInitCallback());
                    return;
                } else if (this.a) {
                    return;
                } else {
                    this.a = true;
                    TTAdSdk.init(context, a(appId), new TTAdSdk.InitCallback() { // from class: com.bytedance.msdk.adapter.pangle.PangleAdapterConfiguration.1
                        @Override // com.bytedance.sdk.openadsdk.TTAdSdk.InitCallback
                        public void fail(int i, String str) {
                            PangleAdapterConfiguration.this.a = false;
                            PangleAdapterConfiguration pangleAdapterConfiguration = PangleAdapterConfiguration.this;
                            Bridge initCallback = pangleAdapterConfiguration.mInitConfig.getInitCallback();
                            pangleAdapterConfiguration.a(initCallback, i + ", " + str);
                            Logger.d("TTMediationSDK", "init Pangle fail: " + i + ", " + str);
                        }

                        @Override // com.bytedance.sdk.openadsdk.TTAdSdk.InitCallback
                        public void success() {
                            PangleAdapterConfiguration.this.b = true;
                            PangleAdapterConfiguration.this.a = false;
                            PangleAdapterConfiguration pangleAdapterConfiguration = PangleAdapterConfiguration.this;
                            pangleAdapterConfiguration.a(pangleAdapterConfiguration.mInitConfig.getInitCallback());
                            Logger.d("TTMediationSDK", "init Pangle success:");
                        }
                    });
                    return;
                }
            }
            a(this.mInitConfig.getInitCallback(), "Invalid Pangle app ID");
        }
    }
}
