package bykvm_19do.bykvm_19do.bykvm_if122.bykvm_int108.bykvm_if122;

import android.content.Context;
import android.util.Log;
import com.bykv.vk.openvk.api.proto.Bridge;
import com.bykv.vk.openvk.api.proto.Result;
import com.bykv.vk.openvk.api.proto.ValueSet;
import com.bytedance.msdk.adapter.config.IGMInitAdnResult;
import com.bytedance.msdk.adapter.config.ITTAdapterConfiguration;
import com.bytedance.msdk.adapter.config.TTBaseAdapterConfiguration;
import com.bytedance.msdk.adapter.config.TTOnNetworkInitializationFinishedListener;
import com.bytedance.msdk.adapter.util.Logger;
import com.bytedance.msdk.api.AdError;
import com.bytedance.msdk.api.v2.GMAdConstant;
import com.bytedance.msdk.api.v2.GMAppDialogClickListener;
import com.bytedance.msdk.api.v2.GMPrivacyConfig;
import com.bytedance.msdk.api.v2.IGMLiveTokenInjectionAuth;
import com.bytedance.sdk.openadsdk.mediation.MediationConstant;
import com.bytedance.sdk.openadsdk.mediation.bridge.MediationValueSetBuilder;
import com.bytedance.sdk.openadsdk.mediation.bridge.init.IMediationInit;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
/* loaded from: classes.dex */
public class a implements ITTAdapterConfiguration, Bridge {
    private String a;
    private List<IGMInitAdnResult> b = new CopyOnWriteArrayList();
    private Bridge c;
    private GMAppDialogClickListener d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: bykvm_19do.bykvm_19do.bykvm_if122.bykvm_int108.bykvm_if122.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static /* synthetic */ class C0054a {
        static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[GMAdConstant.ADULT_STATE.values().length];
            a = iArr;
            try {
                iArr[GMAdConstant.ADULT_STATE.AGE_15.ordinal()] = 1;
            } catch (NoSuchFieldError e) {
            }
            try {
                a[GMAdConstant.ADULT_STATE.AGE_18.ordinal()] = 2;
            } catch (NoSuchFieldError e2) {
            }
            try {
                a[GMAdConstant.ADULT_STATE.AGE_ADULT.ordinal()] = 3;
            } catch (NoSuchFieldError e3) {
            }
        }
    }

    public a(Bridge bridge, String str) {
        this.c = bridge;
        this.a = str;
    }

    private int a() {
        GMPrivacyConfig s = bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.b.L().s();
        if (s != null) {
            int i = C0054a.a[s.getAgeGroup().ordinal()];
            if (i == 1) {
                return 2;
            }
            if (i == 2) {
                return 1;
            }
        }
        return 0;
    }

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
    public static int a(java.lang.String r7, java.lang.String r8) {
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
        throw new UnsupportedOperationException("Method not decompiled: bykvm_19do.bykvm_19do.bykvm_if122.bykvm_int108.bykvm_if122.a.a(java.lang.String, java.lang.String):int");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static String a(String str) {
        char c;
        switch (str.hashCode()) {
            case -1128782217:
                if (str.equals("klevin")) {
                    c = 4;
                    break;
                }
                c = 65535;
                break;
            case -995541405:
                if (str.equals("pangle")) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            case -902468465:
                if (str.equals("sigmob")) {
                    c = 7;
                    break;
                }
                c = 65535;
                break;
            case 3432:
                if (str.equals("ks")) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            case 102199:
                if (str.equals("gdt")) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            case 92668925:
                if (str.equals("admob")) {
                    c = 6;
                    break;
                }
                c = 65535;
                break;
            case 93498907:
                if (str.equals("baidu")) {
                    c = 3;
                    break;
                }
                c = 65535;
                break;
            case 111433589:
                if (str.equals("unity")) {
                    c = '\b';
                    break;
                }
                c = 65535;
                break;
            case 1126045977:
                if (str.equals("mintegral")) {
                    c = 5;
                    break;
                }
                c = 65535;
                break;
            default:
                c = 65535;
                break;
        }
        switch (c) {
            case 0:
                return MediationConstant.PANGLE_ADN_CLASS_NAME;
            case 1:
                return MediationConstant.KS_ADN_CLASS_NAME;
            case 2:
                return MediationConstant.GDT_ADN_CLASS_NAME;
            case 3:
                return MediationConstant.BAIDU_ADN_CLASS_NAME;
            case 4:
                return MediationConstant.KLEVIN_ADN_CLASS_NAME;
            case 5:
                return MediationConstant.MINTEGRAL_ADN_CLASS_NAME;
            case 6:
                return MediationConstant.ADMOB_ADN_CLASS_NAME;
            case 7:
                return MediationConstant.SIGMOB_ADN_CLASS_NAME;
            case '\b':
                return MediationConstant.UNITY_ADN_CLASS_NAME;
            default:
                return null;
        }
    }

    private void a(Context context, ValueSet valueSet) {
        if (this.c != null) {
            MediationValueSetBuilder create = MediationValueSetBuilder.create();
            create.add(8009, context);
            create.add(8424, valueSet);
            this.c.call(8240, create.build(), null);
            return;
        }
        Log.d("TMe", "广告初始化器需要实现接口 " + IMediationInit.class.getName());
    }

    private void a(AdError adError) {
        for (IGMInitAdnResult iGMInitAdnResult : this.b) {
            iGMInitAdnResult.fail(adError);
        }
        this.b.clear();
    }

    private void b() {
        for (IGMInitAdnResult iGMInitAdnResult : this.b) {
            iGMInitAdnResult.success();
        }
        this.b.clear();
    }

    @Override // com.bykv.vk.openvk.api.proto.Caller
    public <T> T call(int i, ValueSet valueSet, Class<T> cls) {
        if (i == 8122) {
            b();
            return null;
        } else if (i == 8123) {
            Result result = (Result) valueSet.objectValue(8022, Result.class);
            if (result != null) {
                a(new AdError(result.code(), result.message()));
                return null;
            }
            return null;
        } else if (i != 8212 || this.d == null) {
            return null;
        } else {
            this.d.onButtonClick(valueSet.intValue(8095));
            return null;
        }
    }

    @Override // com.bytedance.msdk.adapter.config.ITTAdapterConfiguration
    public void checkVersion() {
        try {
            String groMoreSdkVersion = getGroMoreSdkVersion();
            if (a(groMoreSdkVersion, "4.2.0") != 0) {
                Logger.e("TTMediationSDK", getAdNetworkName() + "版本号：" + getNetworkSdkVersion() + " , " + getAdNetworkName() + "Adapter版本号：" + getAdapterVersion() + " , GroMore版本不符合，要求等于" + groMoreSdkVersion + ".x ，当前是4.2.0.2");
            } else {
                Logger.d("TTMediationSDK", getAdNetworkName() + "版本号：" + getNetworkSdkVersion() + " , " + getAdNetworkName() + "Adapter版本号：" + getAdapterVersion() + " , GroMore版本正常 ，要求等于" + groMoreSdkVersion + ".x ，当前是4.2.0.2");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override // com.bytedance.msdk.adapter.config.ITTAdapterConfiguration
    public String getAdNetworkName() {
        return this.a;
    }

    @Override // com.bytedance.msdk.adapter.config.ITTAdapterConfiguration
    public String getAdapterVersion() {
        Bridge bridge = this.c;
        return bridge != null ? (String) bridge.call(8101, null, String.class) : "";
    }

    @Override // com.bytedance.msdk.adapter.config.ITTAdapterConfiguration
    public String getBiddingToken(Context context, Map<String, Object> map) {
        MediationValueSetBuilder create = MediationValueSetBuilder.create();
        create.add(8006, map);
        create.add(8009, context);
        Bridge bridge = this.c;
        if (bridge != null) {
            return (String) bridge.call(8102, create.build(), String.class);
        }
        return null;
    }

    @Override // com.bytedance.msdk.adapter.config.ITTAdapterConfiguration
    public Map<String, Object> getBiddingTokenMap(Context context, Map<String, Object> map) {
        MediationValueSetBuilder create = MediationValueSetBuilder.create();
        create.add(8006, map);
        Bridge bridge = this.c;
        if (bridge != null) {
            return (Map) bridge.call(8103, create.build(), Map.class);
        }
        return null;
    }

    @Override // com.bytedance.msdk.adapter.config.ITTAdapterConfiguration
    public String getGroMoreSdkVersion() {
        Bridge bridge = this.c;
        return bridge != null ? (String) bridge.call(8105, null, String.class) : "";
    }

    @Override // com.bytedance.msdk.adapter.config.ITTAdapterConfiguration
    public Map<String, String> getMsdkRequestOptions() {
        return null;
    }

    @Override // com.bytedance.msdk.adapter.config.ITTAdapterConfiguration
    public String getNetworkSdkPluginVersion() {
        Bridge bridge = this.c;
        return bridge != null ? (String) bridge.call(8244, null, String.class) : "";
    }

    @Override // com.bytedance.msdk.adapter.config.ITTAdapterConfiguration
    public String getNetworkSdkVersion() {
        Bridge bridge = this.c;
        return bridge != null ? (String) bridge.call(8104, null, String.class) : "";
    }

    @Override // com.bytedance.msdk.adapter.config.IGMInitAdn
    public void initAdn(Context context, Map<String, Object> map, IGMInitAdnResult iGMInitAdnResult) {
        if (!this.b.contains(iGMInitAdnResult)) {
            this.b.add(iGMInitAdnResult);
        }
        MediationValueSetBuilder create = MediationValueSetBuilder.create();
        create.add(8092, bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.b.L().w());
        create.add(3, (String) map.get("app_id"));
        create.add(8, (String) map.get("app_name"));
        create.add(8005, (String) map.get(TTBaseAdapterConfiguration.APP_KEY_EXTRA_KEY));
        create.add(8003, (String) map.get(GMAdConstant.EXTRA_ADNNAME));
        create.add(8410, "3.3.44.0");
        create.add(8411, "4.2.0");
        create.add(8412, "17.2.0.43");
        create.add(8413, "9.29.0");
        create.add(8414, "4.520.1390.1");
        create.add(8415, "2.11.0.3.5");
        create.add(8417, "4.11.0.0");
        create.add(8418, "4.3.0.11");
        create.add(8416, "16.4.17.2");
        create.add(7, a());
        create.add(8425, map);
        create.add(8300, this);
        a(context, create.build());
    }

    @Override // com.bytedance.msdk.adapter.config.ITTAdapterConfiguration
    public void initializeNetwork(Context context, Map<String, Object> map, TTOnNetworkInitializationFinishedListener tTOnNetworkInitializationFinishedListener) {
    }

    @Override // com.bytedance.msdk.adapter.config.ITTAdapterConfiguration
    public boolean isNewInitFunction() {
        return true;
    }

    @Override // com.bytedance.msdk.adapter.config.ITTAdapterConfiguration
    public void setInjectionAuth(IGMLiveTokenInjectionAuth iGMLiveTokenInjectionAuth) {
        if (this.c != null) {
            MediationValueSetBuilder create = MediationValueSetBuilder.create();
            create.add(8087, iGMLiveTokenInjectionAuth);
            this.c.call(8243, create.build(), Void.class);
        }
    }

    @Override // com.bytedance.msdk.adapter.config.ITTAdapterConfiguration
    public void setMsdkRequestOptions(Map<String, String> map) {
    }

    @Override // com.bytedance.msdk.adapter.config.ITTAdapterConfiguration
    public void setPrivacyConfig(GMPrivacyConfig gMPrivacyConfig) {
        if (this.c == null || gMPrivacyConfig == null) {
            return;
        }
        MediationValueSetBuilder create = MediationValueSetBuilder.create();
        create.add(8091, gMPrivacyConfig.getMediationCustomController());
        this.c.call(8124, create.build(), Void.class);
    }

    @Override // com.bytedance.msdk.adapter.config.ITTAdapterConfiguration
    public void setThemeStatus(Map<String, Object> map) {
        if (this.c != null) {
            MediationValueSetBuilder create = MediationValueSetBuilder.create();
            create.add(8006, map);
            this.c.call(8242, create.build(), Void.class);
        }
    }

    @Override // com.bytedance.msdk.adapter.config.ITTAdapterConfiguration
    public int showOpenOrInstallAppDialog(GMAppDialogClickListener gMAppDialogClickListener) {
        Bridge bridge = this.c;
        if (bridge != null) {
            this.d = gMAppDialogClickListener;
            return ((Integer) bridge.call(8126, null, Integer.class)).intValue();
        }
        return 0;
    }

    @Override // com.bykv.vk.openvk.api.proto.Bridge
    public ValueSet values() {
        return null;
    }
}
