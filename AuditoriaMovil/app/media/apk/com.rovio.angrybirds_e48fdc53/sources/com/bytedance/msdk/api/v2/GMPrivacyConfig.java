package com.bytedance.msdk.api.v2;

import android.location.Location;
import com.bytedance.msdk.adapter.pangle.PangleAdapterUtils;
import com.bytedance.msdk.api.v2.GMAdConstant;
import com.bytedance.sdk.openadsdk.mediation.bridge.IMediationLocation;
import com.bytedance.sdk.openadsdk.mediation.bridge.MediationCustomController;
import com.bytedance.sdk.openadsdk.mediation.init.MediationPrivacyConfig;
import java.util.List;
/* loaded from: classes.dex */
public class GMPrivacyConfig {
    public boolean appList() {
        return true;
    }

    public GMAdConstant.ADULT_STATE getAgeGroup() {
        return GMAdConstant.ADULT_STATE.AGE_ADULT;
    }

    public String getAndroidId() {
        return null;
    }

    public List<String> getAppList() {
        return null;
    }

    public String getDevImei() {
        return null;
    }

    public List<String> getDevImeis() {
        return null;
    }

    public String getDevOaid() {
        return null;
    }

    public Location getLocation() {
        return null;
    }

    public String getMacAddress() {
        return "";
    }

    public MediationCustomController getMediationCustomController() {
        return new MediationCustomController() { // from class: com.bytedance.msdk.api.v2.GMPrivacyConfig.1
            @Override // com.bytedance.sdk.openadsdk.mediation.bridge.MediationCustomController
            public boolean alist() {
                return GMPrivacyConfig.this.appList();
            }

            @Override // com.bytedance.sdk.openadsdk.mediation.bridge.MediationCustomController
            public String getAndroidId() {
                return GMPrivacyConfig.this.getAndroidId();
            }

            @Override // com.bytedance.sdk.openadsdk.mediation.bridge.MediationCustomController
            public String getDevImei() {
                return GMPrivacyConfig.this.getDevImei();
            }

            @Override // com.bytedance.sdk.openadsdk.mediation.bridge.MediationCustomController
            public String getDevOaid() {
                return GMPrivacyConfig.this.getDevOaid();
            }

            @Override // com.bytedance.sdk.openadsdk.mediation.bridge.MediationCustomController
            public String getMacAddress() {
                return GMPrivacyConfig.this.getMacAddress();
            }

            @Override // com.bytedance.sdk.openadsdk.mediation.bridge.MediationCustomController
            public MediationPrivacyConfig getMediationPrivacyConfig() {
                return new MediationPrivacyConfig() { // from class: com.bytedance.msdk.api.v2.GMPrivacyConfig.1.2
                    @Override // com.bytedance.sdk.openadsdk.mediation.init.MediationPrivacyConfig
                    public List<String> getCustomAppList() {
                        return GMPrivacyConfig.this.getAppList();
                    }

                    @Override // com.bytedance.sdk.openadsdk.mediation.init.MediationPrivacyConfig
                    public List<String> getCustomDevImeis() {
                        return GMPrivacyConfig.this.getDevImeis();
                    }

                    @Override // com.bytedance.sdk.openadsdk.mediation.init.MediationPrivacyConfig
                    public boolean isCanUseOaid() {
                        return GMPrivacyConfig.this.isCanUseOaid();
                    }

                    @Override // com.bytedance.sdk.openadsdk.mediation.init.MediationPrivacyConfig
                    public boolean isLimitPersonalAds() {
                        return GMPrivacyConfig.this.isLimitPersonalAds();
                    }

                    @Override // com.bytedance.sdk.openadsdk.mediation.init.MediationPrivacyConfig
                    public boolean isProgrammaticRecommend() {
                        return GMPrivacyConfig.this.isProgrammaticRecommend();
                    }
                };
            }

            @Override // com.bytedance.sdk.openadsdk.mediation.bridge.MediationCustomController
            public IMediationLocation getTTLocation() {
                final GMLocation tTLocation = GMPrivacyConfig.this.getTTLocation();
                if (tTLocation == null) {
                    return null;
                }
                return new IMediationLocation(this) { // from class: com.bytedance.msdk.api.v2.GMPrivacyConfig.1.1
                    @Override // com.bytedance.sdk.openadsdk.mediation.bridge.IMediationLocation
                    public double getLatitude() {
                        GMLocation gMLocation = tTLocation;
                        return gMLocation != null ? gMLocation.getLatitude() : PangleAdapterUtils.CPM_DEFLAUT_VALUE;
                    }

                    @Override // com.bytedance.sdk.openadsdk.mediation.bridge.IMediationLocation
                    public double getLongitude() {
                        GMLocation gMLocation = tTLocation;
                        return gMLocation != null ? gMLocation.getLongitude() : PangleAdapterUtils.CPM_DEFLAUT_VALUE;
                    }
                };
            }

            @Override // com.bytedance.sdk.openadsdk.mediation.bridge.MediationCustomController
            public boolean isCanUseAndroidId() {
                return GMPrivacyConfig.this.isCanUseAndroidId();
            }

            @Override // com.bytedance.sdk.openadsdk.mediation.bridge.MediationCustomController
            public boolean isCanUseLocation() {
                return GMPrivacyConfig.this.isCanUseLocation();
            }

            @Override // com.bytedance.sdk.openadsdk.mediation.bridge.MediationCustomController
            public boolean isCanUseMacAddress() {
                return GMPrivacyConfig.this.isCanUseMacAddress();
            }

            @Override // com.bytedance.sdk.openadsdk.mediation.bridge.MediationCustomController
            public boolean isCanUsePhoneState() {
                return GMPrivacyConfig.this.isCanUsePhoneState();
            }

            @Override // com.bytedance.sdk.openadsdk.mediation.bridge.MediationCustomController
            public boolean isCanUseWifiState() {
                return GMPrivacyConfig.this.isCanUseWifiState();
            }

            @Override // com.bytedance.sdk.openadsdk.mediation.bridge.MediationCustomController
            public boolean isCanUseWriteExternal() {
                return GMPrivacyConfig.this.isCanUseWriteExternal();
            }
        };
    }

    public GMLocation getTTLocation() {
        return null;
    }

    @Deprecated
    public boolean isAdult() {
        return true;
    }

    public boolean isCanUseAndroidId() {
        return true;
    }

    public boolean isCanUseLocation() {
        return true;
    }

    public boolean isCanUseMacAddress() {
        return true;
    }

    public boolean isCanUseOaid() {
        return true;
    }

    public boolean isCanUsePhoneState() {
        return true;
    }

    public boolean isCanUseWifiState() {
        return true;
    }

    public boolean isCanUseWriteExternal() {
        return true;
    }

    public boolean isLimitPersonalAds() {
        return false;
    }

    public boolean isProgrammaticRecommend() {
        return true;
    }
}
