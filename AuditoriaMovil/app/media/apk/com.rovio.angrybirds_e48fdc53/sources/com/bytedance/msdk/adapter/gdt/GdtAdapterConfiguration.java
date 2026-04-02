package com.bytedance.msdk.adapter.gdt;

import android.content.Context;
import com.bykv.vk.openvk.api.proto.Bridge;
import com.bykv.vk.openvk.api.proto.ValueSet;
import com.bytedance.sdk.openadsdk.mediation.MediationConstant;
import com.bytedance.sdk.openadsdk.mediation.bridge.MediationCustomController;
import com.bytedance.sdk.openadsdk.mediation.bridge.MediationResultBuilder;
import com.bytedance.sdk.openadsdk.mediation.bridge.MediationValueSetBuilder;
import com.bytedance.sdk.openadsdk.mediation.bridge.init.MediationInitImpl;
import com.bytedance.sdk.openadsdk.mediation.bridge.valueset.MediationInitConfig;
import com.bytedance.sdk.openadsdk.mediation.bridge.valueset.MediationValueUtil;
import com.qq.e.ads.dfa.GDTAppDialogClickListener;
import com.qq.e.comm.managers.GDTAdSdk;
import com.qq.e.comm.managers.setting.GlobalSetting;
import com.qq.e.comm.managers.status.SDKStatus;
import com.umeng.analytics.pro.o;
import java.util.HashMap;
import java.util.Map;
/* loaded from: classes.dex */
public class GdtAdapterConfiguration extends MediationInitImpl {
    private volatile boolean a = false;
    private MediationInitConfig b;

    private void a(Bridge bridge) {
        if (bridge != null) {
            bridge.call(8122, MediationValueSetBuilder.create().build(), Void.class);
        }
    }

    private void a(Bridge bridge, String str) {
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

    private boolean a(Context context, String str) {
        if (context != null && str != null) {
            try {
                GDTAdSdk.init(context, str);
                setPrivacyConfig();
                return true;
            } catch (Throwable th) {
            }
        }
        return false;
    }

    /* JADX WARN: Type inference failed for: r4v2, types: [T, java.util.Map, java.util.HashMap] */
    @Override // com.bytedance.sdk.openadsdk.mediation.bridge.init.MediationInitImpl
    public <T> T callFunction(int i, ValueSet valueSet, Class<T> cls) {
        if (i == 8101) {
            return (T) this.b.getGdtAdapterVersion();
        }
        if (i == 8103) {
            Map map = (Map) valueSet.objectValue(8006, Map.class);
            if (map != null) {
                ?? r4 = (T) new HashMap();
                String buyerId = GDTAdSdk.getGDTAdManger().getBuyerId(null);
                String sDKInfo = GDTAdSdk.getGDTAdManger().getSDKInfo((String) map.get("slot_id"));
                r4.put("buyerId", buyerId);
                r4.put("sdkInfo", sDKInfo);
                return r4;
            }
            return null;
        } else if (i == 8104) {
            try {
                return (T) SDKStatus.getIntegrationSDKVersion();
            } catch (Exception e) {
                return "0.0";
            }
        } else if (i == 8105) {
            return (T) this.b.getGromoreVersion();
        } else {
            if (i == 8124) {
                this.b.setMediationCustomController((MediationCustomController) valueSet.objectValue(8091, MediationCustomController.class));
                setPrivacyConfig();
            } else if (i == 8126) {
                return (T) Integer.valueOf(showOpenOrInstallAppDialog());
            }
            return (T) MediationValueUtil.checkClassType(cls);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.mediation.bridge.init.MediationInitImpl
    public void realInitAdn(Context context, MediationInitConfig mediationInitConfig) {
        this.b = mediationInitConfig;
        synchronized (GdtAdapterConfiguration.class) {
            if (!this.a) {
                if (a(context, mediationInitConfig.getAppId())) {
                    this.a = true;
                    a(mediationInitConfig.getInitCallback());
                } else {
                    a(mediationInitConfig.getInitCallback(), "gdt init fail");
                }
            }
        }
    }

    public void setPrivacyConfig() {
        GDTAdapterUtils.printPrivacyLog(this.b);
        boolean isLimitPersonalAds = this.b.isLimitPersonalAds();
        boolean isCanUseMacAddress = this.b.isCanUseMacAddress();
        boolean isCanUsePhoneState = this.b.isCanUsePhoneState();
        boolean isCanUseAndroidId = this.b.isCanUseAndroidId();
        HashMap hashMap = new HashMap();
        hashMap.put("mac_address", Boolean.valueOf(isCanUseMacAddress));
        hashMap.put("android_id", Boolean.valueOf(isCanUseAndroidId));
        hashMap.put("device_id", Boolean.valueOf(isCanUsePhoneState));
        GlobalSetting.setAgreeReadPrivacyInfo(hashMap);
        GlobalSetting.setPersonalizedState(isLimitPersonalAds ? 1 : 0);
    }

    public int showOpenOrInstallAppDialog() {
        try {
            return GDTAdSdk.getGDTAdManger().showOpenOrInstallAppDialog(new GDTAppDialogClickListener() { // from class: com.bytedance.msdk.adapter.gdt.GdtAdapterConfiguration.1
                @Override // com.qq.e.ads.dfa.GDTAppDialogClickListener
                public void onButtonClick(int i) {
                    if (GdtAdapterConfiguration.this.b == null || GdtAdapterConfiguration.this.b.getInitCallback() == null) {
                        return;
                    }
                    MediationValueSetBuilder create = MediationValueSetBuilder.create();
                    create.add(8095, i);
                    GdtAdapterConfiguration.this.b.getInitCallback().call(o.a.C, create.build(), Void.class);
                }
            });
        } catch (Exception e) {
            return 0;
        }
    }

    @Override // com.bytedance.sdk.openadsdk.mediation.bridge.init.MediationInitImpl, com.bykv.vk.openvk.api.proto.Bridge
    public ValueSet values() {
        return null;
    }
}
