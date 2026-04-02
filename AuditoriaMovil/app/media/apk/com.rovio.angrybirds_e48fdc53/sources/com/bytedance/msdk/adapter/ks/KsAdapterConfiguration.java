package com.bytedance.msdk.adapter.ks;

import android.content.Context;
import android.location.Location;
import com.bykv.vk.openvk.api.proto.Bridge;
import com.bykv.vk.openvk.api.proto.ValueSet;
import com.bytedance.sdk.openadsdk.mediation.MediationConstant;
import com.bytedance.sdk.openadsdk.mediation.bridge.IMediationLocation;
import com.bytedance.sdk.openadsdk.mediation.bridge.MediationCustomController;
import com.bytedance.sdk.openadsdk.mediation.bridge.MediationResultBuilder;
import com.bytedance.sdk.openadsdk.mediation.bridge.MediationValueSetBuilder;
import com.bytedance.sdk.openadsdk.mediation.bridge.init.MediationInitImpl;
import com.bytedance.sdk.openadsdk.mediation.bridge.valueset.MediationInitConfig;
import com.kwad.sdk.api.KsAdSDK;
import com.kwad.sdk.api.KsCustomController;
import com.kwad.sdk.api.SdkConfig;
import java.util.List;
/* loaded from: classes.dex */
public class KsAdapterConfiguration extends MediationInitImpl {
    private volatile boolean a = false;
    private final KsCustomController b = new KsCustomController() { // from class: com.bytedance.msdk.adapter.ks.KsAdapterConfiguration.2
        @Override // com.kwad.sdk.api.KsCustomController
        public boolean canReadInstalledPackages() {
            return KsAdapterConfiguration.this.mInitConfig.appList();
        }

        @Override // com.kwad.sdk.api.KsCustomController
        public boolean canReadLocation() {
            return KsAdapterConfiguration.this.mInitConfig.isCanUseLocation();
        }

        @Override // com.kwad.sdk.api.KsCustomController
        public boolean canUseMacAddress() {
            return KsAdapterConfiguration.this.mInitConfig.isCanUseMacAddress();
        }

        @Override // com.kwad.sdk.api.KsCustomController
        public boolean canUseNetworkState() {
            return KsAdapterConfiguration.this.mInitConfig.isCanUseWifiState();
        }

        @Override // com.kwad.sdk.api.KsCustomController
        public boolean canUseOaid() {
            return KsAdapterConfiguration.this.mInitConfig.isCanUseOaid();
        }

        @Override // com.kwad.sdk.api.KsCustomController
        public boolean canUsePhoneState() {
            return KsAdapterConfiguration.this.mInitConfig.isCanUsePhoneState();
        }

        @Override // com.kwad.sdk.api.KsCustomController
        public boolean canUseStoragePermission() {
            return KsAdapterConfiguration.this.mInitConfig.isCanUseWriteExternal();
        }

        @Override // com.kwad.sdk.api.KsCustomController
        public String getAndroidId() {
            return KsAdapterConfiguration.this.mInitConfig.getAndroidId();
        }

        @Override // com.kwad.sdk.api.KsCustomController
        public String getImei() {
            return KsAdapterConfiguration.this.mInitConfig.getDevImei();
        }

        @Override // com.kwad.sdk.api.KsCustomController
        public String[] getImeis() {
            List<String> devImeis = KsAdapterConfiguration.this.mInitConfig.getDevImeis();
            if (devImeis != null) {
                int size = devImeis.size();
                String[] strArr = new String[size];
                for (int i = 0; i < size; i++) {
                    strArr[i] = devImeis.get(i);
                }
                return strArr;
            }
            return super.getImeis();
        }

        @Override // com.kwad.sdk.api.KsCustomController
        public List<String> getInstalledPackages() {
            return KsAdapterConfiguration.this.mInitConfig.getAppList();
        }

        @Override // com.kwad.sdk.api.KsCustomController
        public Location getLocation() {
            IMediationLocation location = KsAdapterConfiguration.this.mInitConfig.getLocation();
            if (location != null) {
                Location location2 = new Location("");
                location2.setLatitude(location.getLatitude());
                location2.setLongitude(location.getLongitude());
                return location2;
            }
            return null;
        }

        @Override // com.kwad.sdk.api.KsCustomController
        public String getMacAddress() {
            return KsAdapterConfiguration.this.mInitConfig.getMacAddress();
        }

        @Override // com.kwad.sdk.api.KsCustomController
        public String getOaid() {
            return KsAdapterConfiguration.this.mInitConfig.getDevOaid();
        }
    };

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

    @Override // com.bytedance.sdk.openadsdk.mediation.bridge.init.MediationInitImpl
    public <T> T callFunction(int i, ValueSet valueSet, Class<T> cls) {
        if (i == 8101) {
            return (T) this.mInitConfig.getKsAdapterVersion();
        }
        if (i == 8104) {
            try {
                return (T) KsAdSDK.getSDKVersion();
            } catch (Throwable th) {
                return "0.0";
            }
        } else if (i == 8105) {
            return (T) this.mInitConfig.getGromoreVersion();
        } else {
            if (i == 8124) {
                this.mInitConfig.setMediationCustomController((MediationCustomController) valueSet.objectValue(8091, MediationCustomController.class));
                setPrivacyConfig();
                return null;
            }
            return null;
        }
    }

    @Override // com.bytedance.sdk.openadsdk.mediation.bridge.init.MediationInitImpl
    public void realInitAdn(final Context context, final MediationInitConfig mediationInitConfig) {
        synchronized (KsAdapterConfiguration.class) {
            if (!this.a) {
                final String appId = mediationInitConfig.getAppId();
                final String appName = mediationInitConfig.getAppName();
                final Bridge initCallback = mediationInitConfig.getInitCallback();
                if (context == null || appId == null) {
                    a(initCallback, "context or appId is empty");
                    return;
                }
                Thread thread = new Thread(new Runnable() { // from class: com.bytedance.msdk.adapter.ks.KsAdapterConfiguration.1
                    @Override // java.lang.Runnable
                    public void run() {
                        try {
                            Utils.printPrivacyLog(KsAdapterConfiguration.this.mInitConfig);
                            KsAdSDK.init(context, new SdkConfig.Builder().appId(appId).appName(appName).customController(KsAdapterConfiguration.this.b).build());
                            KsAdSDK.setPersonalRecommend(!mediationInitConfig.isLimitPersonalAds());
                            KsAdSDK.setProgrammaticRecommend(mediationInitConfig.isProgrammaticRecommend());
                            KsAdapterConfiguration.this.a = true;
                            KsAdapterConfiguration.this.a(initCallback);
                        } catch (Throwable th) {
                            th.printStackTrace();
                            KsAdapterConfiguration.this.a(initCallback, "ks init fail in other thread");
                        }
                    }
                });
                thread.setName("ks-init-thread");
                thread.start();
            }
        }
    }

    public void setPrivacyConfig() {
        if (this.a) {
            Utils.printPrivacyLog(this.mInitConfig);
            KsAdSDK.setPersonalRecommend(!this.mInitConfig.isLimitPersonalAds());
            KsAdSDK.setProgrammaticRecommend(this.mInitConfig.isProgrammaticRecommend());
        }
    }

    @Override // com.bytedance.sdk.openadsdk.mediation.bridge.init.MediationInitImpl, com.bykv.vk.openvk.api.proto.Bridge
    public ValueSet values() {
        return null;
    }
}
