package com.bytedance.sdk.openadsdk.mediation.bridge.valueset;

import com.bykv.vk.openvk.api.proto.Bridge;
import com.bykv.vk.openvk.api.proto.ValueSet;
import com.bytedance.sdk.openadsdk.mediation.LogManager;
import com.bytedance.sdk.openadsdk.mediation.MediationConstant;
import com.bytedance.sdk.openadsdk.mediation.ad.IMediationAdSlot;
import java.util.HashMap;
import java.util.Map;
/* loaded from: classes.dex */
public class MediationAdSlotValueSet {
    public static final String TAG = "TTMediationSDK";
    private ValueSet a;
    private ValueSet b;
    private IMediationAdSlot c;
    private int d;
    private String e;

    /* JADX WARN: Code restructure failed: missing block: B:5:0x001f, code lost:
        if (r4 != null) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x002e, code lost:
        if (r4 != null) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0030, code lost:
        r3.c = (com.bytedance.sdk.openadsdk.mediation.ad.IMediationAdSlot) r4.objectValue(8088, com.bytedance.sdk.openadsdk.mediation.ad.IMediationAdSlot.class);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private MediationAdSlotValueSet(com.bykv.vk.openvk.api.proto.ValueSet r4) {
        /*
            r3 = this;
            r3.<init>()
            r3.a = r4
            java.lang.Class<com.bykv.vk.openvk.api.proto.ValueSet> r0 = com.bykv.vk.openvk.api.proto.ValueSet.class
            r1 = 8090(0x1f9a, float:1.1337E-41)
            java.lang.Object r4 = r4.objectValue(r1, r0)
            com.bykv.vk.openvk.api.proto.ValueSet r4 = (com.bykv.vk.openvk.api.proto.ValueSet) r4
            r0 = 8088(0x1f98, float:1.1334E-41)
            r1 = 8089(0x1f99, float:1.1335E-41)
            if (r4 == 0) goto L22
            java.lang.Class<com.bykv.vk.openvk.api.proto.ValueSet> r2 = com.bykv.vk.openvk.api.proto.ValueSet.class
            java.lang.Object r4 = r4.objectValue(r1, r2)
            com.bykv.vk.openvk.api.proto.ValueSet r4 = (com.bykv.vk.openvk.api.proto.ValueSet) r4
            r3.b = r4
            if (r4 == 0) goto L3a
            goto L30
        L22:
            com.bykv.vk.openvk.api.proto.ValueSet r4 = r3.a
            java.lang.Class<com.bykv.vk.openvk.api.proto.ValueSet> r2 = com.bykv.vk.openvk.api.proto.ValueSet.class
            java.lang.Object r4 = r4.objectValue(r1, r2)
            com.bykv.vk.openvk.api.proto.ValueSet r4 = (com.bykv.vk.openvk.api.proto.ValueSet) r4
            r3.b = r4
            if (r4 == 0) goto L3a
        L30:
            java.lang.Class<com.bytedance.sdk.openadsdk.mediation.ad.IMediationAdSlot> r1 = com.bytedance.sdk.openadsdk.mediation.ad.IMediationAdSlot.class
            java.lang.Object r4 = r4.objectValue(r0, r1)
            com.bytedance.sdk.openadsdk.mediation.ad.IMediationAdSlot r4 = (com.bytedance.sdk.openadsdk.mediation.ad.IMediationAdSlot) r4
            r3.c = r4
        L3a:
            r3.a()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.mediation.bridge.valueset.MediationAdSlotValueSet.<init>(com.bykv.vk.openvk.api.proto.ValueSet):void");
    }

    private void a() {
        LogManager.i("---------  sdk MediationAdSlotValueSet start ----");
        LogManager.i("getAdLoaderCallback：" + getAdLoaderCallback());
        LogManager.i("getADNId：" + getADNId());
        LogManager.i("getRitId：" + getRitId());
        LogManager.i("getUserId：" + getUserId());
        LogManager.i("getAdCount：" + getAdCount());
        LogManager.i("getWidth：" + getWidth());
        LogManager.i("getHeight：" + getHeight());
        LogManager.i("getExpressWidth：" + getExpressWidth());
        LogManager.i("getExpressHeight：" + getExpressHeight());
        LogManager.i("isMuted：" + isMuted());
        LogManager.i("isSplashShakeButton：" + isSplashShakeButton());
        LogManager.i("isSplashPreLoad：" + isSplashPreLoad());
        LogManager.i("getVolume：" + getVolume());
        LogManager.i("isUseSurfaceView：" + isUseSurfaceView());
        LogManager.i("getExtraObject：" + getExtraObject());
        LogManager.i("isBidNotify：" + isBidNotify());
        LogManager.i("getScenarioId：" + getScenarioId());
        LogManager.i("getRewardName：" + getRewardName());
        LogManager.i("getRewardAmount：" + getRewardAmount());
        LogManager.i("isAllowShowCloseBtn：" + isAllowShowCloseBtn());
        LogManager.i("isExpress：" + isExpress());
        LogManager.i("getOrientation：" + getOrientation());
        LogManager.i("getContentUrl：" + getContentUrl());
        LogManager.i("getDevices：" + getDevices());
        LogManager.i("getOriginType：" + getOriginType());
        LogManager.i("getAdSubType：" + getAdSubType());
        LogManager.i("getAdmobNativeAdOptions：" + getAdmobNativeAdOptions());
        LogManager.i("getBaiduAppSid：" + getBaiduAppSid());
        LogManager.i("getBaiduDownloadAppConfirmPolicy：" + getBaiduDownloadAppConfirmPolicy());
        LogManager.i("getBaiduUseRewardCountdown：" + getBaiduUseRewardCountdown());
        LogManager.i("getBaiduShowDialogOnSkip：" + getBaiduShowDialogOnSkip());
        LogManager.i("getBaiduCacheVideoOnlyWifi：" + getBaiduCacheVideoOnlyWifi());
        LogManager.i("getBaiduRequestParameters：" + getBaiduRequestParameters());
        LogManager.i("getBaiduNativeSmartOptStyleParams：" + getBaiduNativeSmartOptStyleParams());
        LogManager.i("getGdtMinVideoDuration：" + getGdtMinVideoDuration());
        LogManager.i("getGdtMaxVideoDuration：" + getGdtMaxVideoDuration());
        LogManager.i("getGdtVideoOption：" + getGdtVideoOption());
        LogManager.i("getGdtDownAPPConfirmPolicy：" + getGdtDownAPPConfirmPolicy());
        LogManager.i("getGdtNativeLogoParams：" + getGdtNativeLogoParams());
        LogManager.i("getAdLoadTimeOut：" + getAdLoadTimeOut());
        LogManager.i("getShakeViewWidth：" + getShakeViewWidth());
        LogManager.i("getShakeViewHeight：" + getShakeViewHeight());
        LogManager.i("getAdloadSeq：" + getAdloadSeq());
        LogManager.i("getAdUnitId：" + getAdUnitId());
        LogManager.i("isSupportDeepLink：" + isSupportDeepLink());
        LogManager.i("getParams：" + getParams());
        LogManager.i("---------  初始化adn sdk MediationAdSlotValueSet end ----");
    }

    private boolean b() {
        ValueSet valueSet = this.a;
        return (valueSet == null || valueSet.isEmpty()) ? false : true;
    }

    public static MediationAdSlotValueSet create(ValueSet valueSet) {
        return new MediationAdSlotValueSet(valueSet);
    }

    public String getADNId() {
        if (b()) {
            return this.a.stringValue(8007);
        }
        return null;
    }

    public int getAdCount() {
        ValueSet valueSet = this.b;
        if (valueSet != null) {
            return valueSet.intValue(13);
        }
        return 1;
    }

    public int getAdLoadTimeOut() {
        ValueSet valueSet = this.b;
        if (valueSet != null) {
            return valueSet.intValue(17, 3000);
        }
        return 3000;
    }

    public Bridge getAdLoaderCallback() {
        if (b()) {
            return (Bridge) this.a.objectValue(8011, Bridge.class);
        }
        return null;
    }

    public int getAdSubType() {
        if (b()) {
            return this.a.intValue(8094);
        }
        return 0;
    }

    public String getAdUnitId() {
        return this.e;
    }

    public int getAdloadSeq() {
        int i = this.d;
        if (i != 0) {
            return i;
        }
        if (b()) {
            return this.a.intValue(20);
        }
        return 0;
    }

    public Object getAdmobNativeAdOptions() {
        Map<String, Object> extraObject = getExtraObject();
        if (extraObject != null) {
            return extraObject.get(MediationConstant.KEY_ADMOB_NATIVE_OPTIONS);
        }
        return null;
    }

    public String getBaiduAppSid() {
        Map<String, Object> extraObject = getExtraObject();
        if (extraObject != null) {
            Object obj = extraObject.get(MediationConstant.KEY_BAIDU_APPSID);
            if (obj instanceof String) {
                return (String) obj;
            }
        }
        return "";
    }

    public boolean getBaiduCacheVideoOnlyWifi() {
        Map<String, Object> extraObject = getExtraObject();
        if (extraObject != null) {
            Object obj = extraObject.get(MediationConstant.KEY_BAIDU_CACHE_VIDEO_ONLY_WIFI);
            if (obj instanceof Boolean) {
                return ((Boolean) obj).booleanValue();
            }
        }
        return false;
    }

    public int getBaiduDownloadAppConfirmPolicy() {
        Map<String, Object> extraObject = getExtraObject();
        if (extraObject != null) {
            Object obj = extraObject.get(MediationConstant.KEY_BAIDU_DOWN_APP_CONFIG_POLICY);
            if (obj instanceof Integer) {
                return ((Integer) obj).intValue();
            }
        }
        return 0;
    }

    public Object getBaiduNativeSmartOptStyleParams() {
        Map<String, Object> extraObject = getExtraObject();
        if (extraObject != null) {
            return extraObject.get(MediationConstant.KEY_BAIDU_NATIVE_SMART_OPT_STYLE_PARAMS);
        }
        return null;
    }

    public Object getBaiduRequestParameters() {
        Map<String, Object> extraObject = getExtraObject();
        if (extraObject != null) {
            return extraObject.get(MediationConstant.KEY_BAIDU_REQUEST_PARAMETERS);
        }
        return null;
    }

    public boolean getBaiduShowDialogOnSkip() {
        Map<String, Object> extraObject = getExtraObject();
        if (extraObject != null) {
            Object obj = extraObject.get(MediationConstant.KEY_BAIDU_SHOW_DIALOG_ON_SKIP);
            if (obj instanceof Boolean) {
                return ((Boolean) obj).booleanValue();
            }
        }
        return false;
    }

    public boolean getBaiduUseRewardCountdown() {
        Map<String, Object> extraObject = getExtraObject();
        if (extraObject != null) {
            Object obj = extraObject.get(MediationConstant.KEY_BAIDU_USE_REWARD_COUNTDOWN);
            if (obj instanceof Boolean) {
                return ((Boolean) obj).booleanValue();
            }
        }
        return false;
    }

    public String getClientReqId() {
        return b() ? this.a.stringValue(8430) : "";
    }

    public String getContentUrl() {
        return b() ? this.a.stringValue(8083) : "";
    }

    public String getDevices() {
        return b() ? this.a.stringValue(8084) : "";
    }

    public float getExpressHeight() {
        ValueSet valueSet = this.b;
        if (valueSet != null) {
            return valueSet.floatValue(9);
        }
        return 0.0f;
    }

    public float getExpressWidth() {
        ValueSet valueSet = this.b;
        if (valueSet != null) {
            return valueSet.floatValue(10);
        }
        return 0.0f;
    }

    public Map<String, Object> getExtraObject() {
        IMediationAdSlot iMediationAdSlot = this.c;
        if (iMediationAdSlot != null) {
            return iMediationAdSlot.getExtraObject();
        }
        return null;
    }

    public Object getGdtDownAPPConfirmPolicy() {
        Map<String, Object> extraObject = getExtraObject();
        if (extraObject != null) {
            return extraObject.get(MediationConstant.KEY_GDT_DOWN_APP_CONFIG_POLICY);
        }
        return null;
    }

    public int getGdtMaxVideoDuration() {
        Map<String, Object> extraObject = getExtraObject();
        if (extraObject != null) {
            Object obj = extraObject.get(MediationConstant.KEY_GDT_MAX_VIDEO_DURATION);
            if (obj instanceof Integer) {
                return ((Integer) obj).intValue();
            }
        }
        return 0;
    }

    public int getGdtMinVideoDuration() {
        Map<String, Object> extraObject = getExtraObject();
        if (extraObject != null) {
            Object obj = extraObject.get(MediationConstant.KEY_GDT_MIN_VIDEO_DURATION);
            if (obj instanceof Integer) {
                return ((Integer) obj).intValue();
            }
        }
        return 0;
    }

    public Object getGdtNativeLogoParams() {
        Map<String, Object> extraObject = getExtraObject();
        if (extraObject != null) {
            return extraObject.get(MediationConstant.KEY_GDT_NATIVE_LOGO_PARAMS);
        }
        return null;
    }

    public Object getGdtVideoOption() {
        Map<String, Object> extraObject = getExtraObject();
        if (extraObject != null) {
            return extraObject.get(MediationConstant.KEY_GDT_VIDEO_OPTION);
        }
        return null;
    }

    public int getHeight() {
        ValueSet valueSet = this.b;
        if (valueSet != null) {
            return valueSet.intValue(8);
        }
        return 0;
    }

    public int getOrientation() {
        ValueSet valueSet = this.b;
        if (valueSet != null) {
            return valueSet.intValue(16);
        }
        return 2;
    }

    public int getOriginType() {
        if (b()) {
            return this.a.intValue(8085);
        }
        return 0;
    }

    public Map<String, Object> getParams() {
        return b() ? (Map) this.a.objectValue(8044, Map.class) : new HashMap();
    }

    public int getRewardAmount() {
        IMediationAdSlot iMediationAdSlot = this.c;
        if (iMediationAdSlot != null) {
            return iMediationAdSlot.getRewardAmount();
        }
        return 0;
    }

    public String getRewardName() {
        IMediationAdSlot iMediationAdSlot = this.c;
        return iMediationAdSlot != null ? iMediationAdSlot.getRewardName() : "";
    }

    public String getRitId() {
        if (b()) {
            return this.a.stringValue(4);
        }
        return null;
    }

    public String getScenarioId() {
        IMediationAdSlot iMediationAdSlot = this.c;
        return iMediationAdSlot != null ? iMediationAdSlot.getScenarioId() : "";
    }

    public float getShakeViewHeight() {
        IMediationAdSlot iMediationAdSlot = this.c;
        if (iMediationAdSlot != null) {
            return iMediationAdSlot.getShakeViewHeight();
        }
        return 0.0f;
    }

    public float getShakeViewWidth() {
        IMediationAdSlot iMediationAdSlot = this.c;
        if (iMediationAdSlot != null) {
            return iMediationAdSlot.getShakeViewWidth();
        }
        return 0.0f;
    }

    public String getUserId() {
        ValueSet valueSet = this.b;
        return valueSet != null ? valueSet.stringValue(15) : "";
    }

    public float getVolume() {
        IMediationAdSlot iMediationAdSlot = this.c;
        if (iMediationAdSlot != null) {
            return iMediationAdSlot.getVolume();
        }
        return 1.0f;
    }

    public String getWaterfallABTest() {
        return b() ? this.a.stringValue(8429) : "";
    }

    public int getWidth() {
        ValueSet valueSet = this.b;
        if (valueSet != null) {
            return valueSet.intValue(7);
        }
        return 0;
    }

    public boolean isAllowShowCloseBtn() {
        IMediationAdSlot iMediationAdSlot = this.c;
        if (iMediationAdSlot != null) {
            return iMediationAdSlot.isAllowShowCloseBtn();
        }
        return false;
    }

    public boolean isBidNotify() {
        IMediationAdSlot iMediationAdSlot = this.c;
        if (iMediationAdSlot != null) {
            return iMediationAdSlot.isBidNotify();
        }
        return false;
    }

    public boolean isExpress() {
        return b() && this.a.booleanValue(8033);
    }

    public boolean isMuted() {
        IMediationAdSlot iMediationAdSlot = this.c;
        if (iMediationAdSlot != null) {
            return iMediationAdSlot.isMuted();
        }
        return false;
    }

    public boolean isSplashPreLoad() {
        IMediationAdSlot iMediationAdSlot = this.c;
        if (iMediationAdSlot != null) {
            return iMediationAdSlot.isSplashPreLoad();
        }
        return false;
    }

    public boolean isSplashShakeButton() {
        IMediationAdSlot iMediationAdSlot = this.c;
        if (iMediationAdSlot != null) {
            return iMediationAdSlot.isSplashShakeButton();
        }
        return false;
    }

    public boolean isSupportDeepLink() {
        if (b()) {
            return this.a.booleanValue(11);
        }
        return false;
    }

    public boolean isUseSurfaceView() {
        IMediationAdSlot iMediationAdSlot = this.c;
        if (iMediationAdSlot != null) {
            return iMediationAdSlot.isUseSurfaceView();
        }
        return false;
    }

    public void setAdUnitId(String str) {
        this.e = str;
    }

    public void setAdloadSeq(int i) {
        this.d = i;
    }
}
