package com.bytedance.sdk.openadsdk.mediation.bridge.valueset;

import com.bykv.vk.openvk.api.proto.Bridge;
import com.bykv.vk.openvk.api.proto.ValueSet;
import com.bytedance.sdk.openadsdk.mediation.LogManager;
import com.bytedance.sdk.openadsdk.mediation.bridge.IMediationLocation;
import com.bytedance.sdk.openadsdk.mediation.bridge.MediationCustomController;
import com.bytedance.sdk.openadsdk.mediation.custom.MediationCustomInitConfig;
import com.bytedance.sdk.openadsdk.mediation.init.MediationConfig;
import com.bytedance.sdk.openadsdk.mediation.init.MediationPrivacyConfig;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
/* loaded from: classes.dex */
public class MediationInitConfig {
    private final ValueSet a;
    private MediationCustomController b;
    private MediationConfig c;
    private ValueSet d;

    private MediationInitConfig(ValueSet valueSet) {
        this.a = valueSet;
        ValueSet valueSet2 = (ValueSet) valueSet.objectValue(8092, ValueSet.class);
        this.d = valueSet2;
        if (valueSet2 != null) {
            this.c = (MediationConfig) valueSet2.objectValue(8086, MediationConfig.class);
            MediationCustomController mediationCustomController = (MediationCustomController) this.d.objectValue(2, MediationCustomController.class);
            this.b = mediationCustomController;
            if (mediationCustomController == null) {
                this.b = new MediationCustomController(this) { // from class: com.bytedance.sdk.openadsdk.mediation.bridge.valueset.MediationInitConfig.1
                    @Override // com.bytedance.sdk.openadsdk.mediation.bridge.MediationCustomController
                    public boolean alist() {
                        return super.alist();
                    }

                    @Override // com.bytedance.sdk.openadsdk.mediation.bridge.MediationCustomController
                    public String getAndroidId() {
                        return super.getAndroidId();
                    }

                    @Override // com.bytedance.sdk.openadsdk.mediation.bridge.MediationCustomController
                    public String getDevImei() {
                        return super.getDevImei();
                    }

                    @Override // com.bytedance.sdk.openadsdk.mediation.bridge.MediationCustomController
                    public String getDevOaid() {
                        return super.getDevOaid();
                    }

                    @Override // com.bytedance.sdk.openadsdk.mediation.bridge.MediationCustomController
                    public String getMacAddress() {
                        return super.getMacAddress();
                    }

                    @Override // com.bytedance.sdk.openadsdk.mediation.bridge.MediationCustomController
                    public MediationPrivacyConfig getMediationPrivacyConfig() {
                        return new MediationPrivacyConfig(this) { // from class: com.bytedance.sdk.openadsdk.mediation.bridge.valueset.MediationInitConfig.1.1
                            @Override // com.bytedance.sdk.openadsdk.mediation.init.MediationPrivacyConfig
                            public List<String> getCustomAppList() {
                                return super.getCustomAppList();
                            }

                            @Override // com.bytedance.sdk.openadsdk.mediation.init.MediationPrivacyConfig
                            public List<String> getCustomDevImeis() {
                                return super.getCustomDevImeis();
                            }

                            @Override // com.bytedance.sdk.openadsdk.mediation.init.MediationPrivacyConfig
                            public boolean isCanUseOaid() {
                                return super.isCanUseOaid();
                            }

                            @Override // com.bytedance.sdk.openadsdk.mediation.init.MediationPrivacyConfig
                            public boolean isLimitPersonalAds() {
                                return super.isLimitPersonalAds();
                            }

                            @Override // com.bytedance.sdk.openadsdk.mediation.init.MediationPrivacyConfig
                            public boolean isProgrammaticRecommend() {
                                return super.isProgrammaticRecommend();
                            }
                        };
                    }

                    @Override // com.bytedance.sdk.openadsdk.mediation.bridge.MediationCustomController
                    public IMediationLocation getTTLocation() {
                        return super.getTTLocation();
                    }

                    @Override // com.bytedance.sdk.openadsdk.mediation.bridge.MediationCustomController
                    public boolean isCanUseAndroidId() {
                        return super.isCanUseAndroidId();
                    }

                    @Override // com.bytedance.sdk.openadsdk.mediation.bridge.MediationCustomController
                    public boolean isCanUseLocation() {
                        return super.isCanUseLocation();
                    }

                    @Override // com.bytedance.sdk.openadsdk.mediation.bridge.MediationCustomController
                    public boolean isCanUsePermissionRecordAudio() {
                        return super.isCanUsePermissionRecordAudio();
                    }

                    @Override // com.bytedance.sdk.openadsdk.mediation.bridge.MediationCustomController
                    public boolean isCanUsePhoneState() {
                        return super.isCanUsePhoneState();
                    }

                    @Override // com.bytedance.sdk.openadsdk.mediation.bridge.MediationCustomController
                    public boolean isCanUseWifiState() {
                        return super.isCanUseWifiState();
                    }

                    @Override // com.bytedance.sdk.openadsdk.mediation.bridge.MediationCustomController
                    public boolean isCanUseWriteExternal() {
                        return super.isCanUseWriteExternal();
                    }
                };
            }
        }
        a();
    }

    private void a() {
        LogManager.i("---------  sdk MediationInitConfig start ----");
        LogManager.setDebug(Boolean.valueOf(isDebug()));
        LogManager.i("isDebug：" + isDebug());
        LogManager.i("getClassName：" + getClassName());
        LogManager.i("getAppId：" + getAppId());
        LogManager.i("getAppName：" + getAppName());
        LogManager.i("getADNName：" + getADNName());
        LogManager.i("getAppKey：" + getAppKey());
        LogManager.i("getInitCallback：" + getInitCallback());
        LogManager.i("getHttps：" + getHttps());
        LogManager.i("getWxAppId：" + getWxAppId());
        LogManager.i("isLimitPersonalAds：" + isLimitPersonalAds());
        LogManager.i("isCanUsePhoneState：" + isCanUsePhoneState());
        LogManager.i("isCanUseLocation：" + isCanUseLocation());
        LogManager.i("isCanUseWriteExternal：" + isCanUseWriteExternal());
        LogManager.i("appList：" + appList());
        LogManager.i("isCanUseMacAddress：" + isCanUseMacAddress());
        LogManager.i("isCanUseAndroidId：" + isCanUseAndroidId());
        LogManager.i("isProgrammaticRecommend：" + isProgrammaticRecommend());
        IMediationLocation location = getLocation();
        LogManager.i("getLocation：" + location);
        if (location != null) {
            LogManager.i("getLocation getLatitude：" + location.getLatitude());
            LogManager.i("getLocation getLongitude：" + location.getLongitude());
        }
        LogManager.i("getDevImei：" + getDevImei());
        List<String> devImeis = getDevImeis();
        LogManager.i("getDevImeis：" + devImeis);
        if (devImeis != null) {
            Iterator<String> it = devImeis.iterator();
            while (it.hasNext()) {
                LogManager.i("getDevImeis item: " + it.next());
            }
        }
        LogManager.i("getAndroidId：" + getAndroidId());
        LogManager.i("isCanUseOaid：" + isCanUseOaid());
        LogManager.i("getDevOaid：" + getDevOaid());
        LogManager.i("getMacAddress：" + getMacAddress());
        LogManager.i("isCanUseWifiState：" + isCanUseWifiState());
        List<String> appList = getAppList();
        LogManager.i("getAppList：" + appList);
        if (appList != null) {
            Iterator<String> it2 = appList.iterator();
            while (it2.hasNext()) {
                LogManager.i("getAppList item: " + it2.next());
            }
        }
        LogManager.i("getAgeGroup：" + getAgeGroup());
        LogManager.i("isCustom：" + isCustom());
        LogManager.i("getCustomInitConfig：" + getCustomInitConfig());
        LogManager.i("getCustomInitMap：" + getCustomInitMap());
        LogManager.i("getCustomGMConfiguration：" + getCustomGMConfiguration());
        LogManager.i("getKsAdapterVersion：" + getKsAdapterVersion());
        LogManager.i("getGromoreVersion：" + getGromoreVersion());
        LogManager.i("getAdmobAdapterVersion：" + getAdmobAdapterVersion());
        LogManager.i("getBaiduAdapterVersion：" + getBaiduAdapterVersion());
        LogManager.i("getGdtAdapterVersion：" + getGdtAdapterVersion());
        LogManager.i("getKlevinAdapterVersion：" + getKlevinAdapterVersion());
        LogManager.i("getMintegralAdapterVersion：" + getMintegralAdapterVersion());
        LogManager.i("getSigmobAdapterVersion：" + getSigmobAdapterVersion());
        LogManager.i("getUnityAdapterVersion：" + getUnityAdapterVersion());
        LogManager.i("getMap：" + getInitAdnMap());
        LogManager.i("---------  初始化adn sdk MediationInitConfig end ----");
    }

    private boolean b() {
        ValueSet valueSet = this.a;
        return (valueSet == null || valueSet.isEmpty()) ? false : true;
    }

    public static MediationInitConfig create(ValueSet valueSet) {
        return new MediationInitConfig(valueSet);
    }

    public boolean appList() {
        MediationCustomController mediationCustomController = this.b;
        if (mediationCustomController != null) {
            return mediationCustomController.alist();
        }
        return true;
    }

    public String getADNName() {
        return b() ? this.a.stringValue(8003) : "";
    }

    public String getAdmobAdapterVersion() {
        ValueSet valueSet = this.a;
        return valueSet != null ? valueSet.stringValue(8412) : "";
    }

    public int getAgeGroup() {
        if (b()) {
            return this.a.intValue(7);
        }
        return 0;
    }

    public String getAndroidId() {
        MediationCustomController mediationCustomController = this.b;
        if (mediationCustomController != null) {
            return mediationCustomController.getAndroidId();
        }
        return null;
    }

    public String getAppId() {
        if (b()) {
            return this.a.stringValue(3);
        }
        return null;
    }

    public String getAppKey() {
        return b() ? this.a.stringValue(8005) : "";
    }

    public List<String> getAppList() {
        MediationCustomController mediationCustomController = this.b;
        if (mediationCustomController == null || mediationCustomController.getMediationPrivacyConfig() == null) {
            return null;
        }
        return this.b.getMediationPrivacyConfig().getCustomAppList();
    }

    public String getAppName() {
        return b() ? this.a.stringValue(8) : "";
    }

    public String getBaiduAdapterVersion() {
        ValueSet valueSet = this.a;
        return valueSet != null ? valueSet.stringValue(8413) : "";
    }

    public String getClassName() {
        return b() ? this.a.stringValue(8010) : "";
    }

    public Bridge getCustomGMConfiguration() {
        if (b()) {
            return (Bridge) this.a.objectValue(8401, Bridge.class);
        }
        return null;
    }

    public MediationCustomInitConfig getCustomInitConfig() {
        if (b()) {
            return (MediationCustomInitConfig) this.a.objectValue(8099, MediationCustomInitConfig.class);
        }
        return null;
    }

    public Map getCustomInitMap() {
        if (b()) {
            return (Map) this.a.objectValue(8400, Map.class);
        }
        return null;
    }

    public String getDevImei() {
        MediationCustomController mediationCustomController = this.b;
        if (mediationCustomController != null) {
            return mediationCustomController.getDevImei();
        }
        return null;
    }

    public List<String> getDevImeis() {
        MediationCustomController mediationCustomController = this.b;
        if (mediationCustomController == null || mediationCustomController.getMediationPrivacyConfig() == null) {
            return null;
        }
        return this.b.getMediationPrivacyConfig().getCustomDevImeis();
    }

    public String getDevOaid() {
        MediationCustomController mediationCustomController = this.b;
        if (mediationCustomController != null) {
            return mediationCustomController.getDevOaid();
        }
        return null;
    }

    public String getGdtAdapterVersion() {
        ValueSet valueSet = this.a;
        return valueSet != null ? valueSet.stringValue(8414) : "";
    }

    public String getGromoreVersion() {
        ValueSet valueSet = this.a;
        return valueSet != null ? valueSet.stringValue(8411) : "";
    }

    public boolean getHttps() {
        MediationConfig mediationConfig = this.c;
        if (mediationConfig != null) {
            return mediationConfig.getHttps();
        }
        return false;
    }

    public Map getInitAdnMap() {
        ValueSet valueSet = this.a;
        return valueSet != null ? (Map) valueSet.objectValue(8425, Map.class) : new HashMap();
    }

    public Bridge getInitCallback() {
        if (b()) {
            return (Bridge) this.a.objectValue(8300, Bridge.class);
        }
        return null;
    }

    public String getKlevinAdapterVersion() {
        ValueSet valueSet = this.a;
        return valueSet != null ? valueSet.stringValue(8415) : "";
    }

    public String getKsAdapterVersion() {
        ValueSet valueSet = this.a;
        return valueSet != null ? valueSet.stringValue(8410) : "";
    }

    public IMediationLocation getLocation() {
        MediationCustomController mediationCustomController = this.b;
        if (mediationCustomController != null) {
            return mediationCustomController.getTTLocation();
        }
        return null;
    }

    public String getMacAddress() {
        MediationCustomController mediationCustomController = this.b;
        if (mediationCustomController != null) {
            return mediationCustomController.getMacAddress();
        }
        return null;
    }

    public String getMintegralAdapterVersion() {
        ValueSet valueSet = this.a;
        return valueSet != null ? valueSet.stringValue(8416) : "";
    }

    public String getSigmobAdapterVersion() {
        ValueSet valueSet = this.a;
        return valueSet != null ? valueSet.stringValue(8417) : "";
    }

    public String getUnityAdapterVersion() {
        ValueSet valueSet = this.a;
        return valueSet != null ? valueSet.stringValue(8418) : "";
    }

    public ValueSet getValueSet() {
        return this.a;
    }

    public String getWxAppId() {
        MediationConfig mediationConfig = this.c;
        return mediationConfig != null ? mediationConfig.wxAppId() : "";
    }

    public boolean isCanUseAndroidId() {
        MediationCustomController mediationCustomController = this.b;
        if (mediationCustomController != null) {
            return mediationCustomController.isCanUseAndroidId();
        }
        return true;
    }

    public boolean isCanUseLocation() {
        MediationCustomController mediationCustomController = this.b;
        if (mediationCustomController != null) {
            return mediationCustomController.isCanUseLocation();
        }
        return true;
    }

    public boolean isCanUseMacAddress() {
        MediationCustomController mediationCustomController = this.b;
        if (mediationCustomController != null) {
            return mediationCustomController.isCanUseMacAddress();
        }
        return true;
    }

    public boolean isCanUseOaid() {
        MediationCustomController mediationCustomController = this.b;
        if (mediationCustomController == null || mediationCustomController.getMediationPrivacyConfig() == null) {
            return true;
        }
        return this.b.getMediationPrivacyConfig().isCanUseOaid();
    }

    public boolean isCanUsePhoneState() {
        MediationCustomController mediationCustomController = this.b;
        if (mediationCustomController != null) {
            return mediationCustomController.isCanUsePhoneState();
        }
        return true;
    }

    public boolean isCanUseWifiState() {
        MediationCustomController mediationCustomController = this.b;
        if (mediationCustomController != null) {
            return mediationCustomController.isCanUseWifiState();
        }
        return true;
    }

    public boolean isCanUseWriteExternal() {
        MediationCustomController mediationCustomController = this.b;
        if (mediationCustomController != null) {
            return mediationCustomController.isCanUseWriteExternal();
        }
        return true;
    }

    public boolean isCustom() {
        if (b()) {
            return this.a.booleanValue(8098);
        }
        return false;
    }

    public boolean isDebug() {
        ValueSet valueSet = this.d;
        if (valueSet != null) {
            return valueSet.booleanValue(1);
        }
        return false;
    }

    public boolean isLimitPersonalAds() {
        MediationCustomController mediationCustomController = this.b;
        if (mediationCustomController == null || mediationCustomController.getMediationPrivacyConfig() == null) {
            return false;
        }
        return this.b.getMediationPrivacyConfig().isLimitPersonalAds();
    }

    public boolean isProgrammaticRecommend() {
        MediationCustomController mediationCustomController = this.b;
        if (mediationCustomController == null || mediationCustomController.getMediationPrivacyConfig() == null) {
            return true;
        }
        return this.b.getMediationPrivacyConfig().isProgrammaticRecommend();
    }

    public void setMediationCustomController(MediationCustomController mediationCustomController) {
        this.b = mediationCustomController;
    }
}
