package com.adcolony.sdk;

import android.util.Log;
import com.bytedance.sdk.openadsdk.api.plugin.PluginConstants;
import com.facebook.AccessToken;
import com.unity3d.ads.adunit.AdUnitActivity;
import org.json.JSONArray;
import org.json.JSONObject;
/* loaded from: classes2.dex */
public class AdColonyAppOptions {
    public static final String ADMARVEL = "AdMarvel";
    public static final String ADMOB = "AdMob";
    public static final String ADOBEAIR = "Adobe AIR";
    public static final String AERSERVE = "AerServe";
    public static final int ALL = 2;
    public static final String APPODEAL = "Appodeal";
    public static final String COCOS2DX = "Cocos2d-x";
    public static final String CORONA = "Corona";
    public static final String FUSEPOWERED = "Fuse Powered";
    public static final String FYBER = "Fyber";
    public static final String IRONSOURCE = "ironSource";
    public static final int LANDSCAPE = 1;
    public static final String MOPUB = "MoPub";
    public static final int PORTRAIT = 0;
    @Deprecated
    public static final int SENSOR = 2;
    public static final String UNITY = "Unity";
    String[] b;
    AdColonyUserMetadata e;
    String a = "";
    JSONArray c = as.b();
    JSONObject d = as.a();

    public AdColonyAppOptions() {
        setOriginStore("google");
        if (a.b()) {
            af a = a.a();
            a(a.b().a);
            a(a.b().b);
        }
    }

    public AdColonyAppOptions setAppVersion(String str) {
        if (q.d(str)) {
            setOption("app_version", str);
        }
        return this;
    }

    public String getAppVersion() {
        return as.b(this.d, "app_version");
    }

    public AdColonyAppOptions setUserID(String str) {
        if (q.d(str)) {
            setOption(AccessToken.USER_ID_KEY, str);
        }
        return this;
    }

    public String getUserID() {
        return as.b(this.d, AccessToken.USER_ID_KEY);
    }

    public AdColonyAppOptions setOption(String str, boolean z) {
        if (q.d(str)) {
            as.a(this.d, str, z);
        }
        return this;
    }

    public Object getOption(String str) {
        return as.a(this.d, str);
    }

    public AdColonyAppOptions setOption(String str, double d) {
        if (q.d(str)) {
            as.a(this.d, str, d);
        }
        return this;
    }

    public AdColonyAppOptions setOption(String str, String str2) {
        if (str != null && q.d(str) && q.d(str2)) {
            as.a(this.d, str, str2);
        }
        return this;
    }

    public AdColonyAppOptions setOriginStore(String str) {
        if (q.d(str)) {
            setOption("origin_store", str);
        }
        return this;
    }

    public String getOriginStore() {
        return as.b(this.d, "origin_store");
    }

    public AdColonyAppOptions setRequestedAdOrientation(int i) {
        setOption(AdUnitActivity.EXTRA_ORIENTATION, i);
        return this;
    }

    public int getRequestedAdOrientation() {
        return as.a(this.d, AdUnitActivity.EXTRA_ORIENTATION, -1);
    }

    public AdColonyAppOptions setAppOrientation(int i) {
        setOption("app_orientation", i);
        return this;
    }

    public int getAppOrientation() {
        return as.a(this.d, "app_orientation", -1);
    }

    public AdColonyAppOptions setUserMetadata(AdColonyUserMetadata adColonyUserMetadata) {
        this.e = adColonyUserMetadata;
        as.a(this.d, "user_metadata", adColonyUserMetadata.b);
        return this;
    }

    public AdColonyAppOptions setTestModeEnabled(boolean z) {
        as.a(this.d, "test_mode", z);
        return this;
    }

    public boolean getTestModeEnabled() {
        return as.d(this.d, "test_mode");
    }

    public AdColonyAppOptions setMultiWindowEnabled(boolean z) {
        as.a(this.d, "multi_window_enabled", z);
        return this;
    }

    public boolean getMultiWindowEnabled() {
        return as.d(this.d, "multi_window_enabled");
    }

    public AdColonyUserMetadata getUserMetadata() {
        return this.e;
    }

    public AdColonyAppOptions setMediationNetwork(String str, String str2) {
        if (q.d(str) && q.d(str2)) {
            as.a(this.d, "mediation_network", str);
            as.a(this.d, "mediation_network_version", str2);
        }
        return this;
    }

    public JSONObject getMediationInfo() {
        JSONObject a = as.a();
        as.a(a, "name", as.b(this.d, "mediation_network"));
        as.a(a, "version", as.b(this.d, "mediation_network_version"));
        return a;
    }

    public AdColonyAppOptions setPlugin(String str, String str2) {
        if (q.d(str) && q.d(str2)) {
            as.a(this.d, "plugin", str);
            as.a(this.d, PluginConstants.KEY_PLUGIN_VERSION, str2);
        }
        return this;
    }

    public JSONObject getPluginInfo() {
        JSONObject a = as.a();
        as.a(a, "name", as.b(this.d, "plugin"));
        as.a(a, "version", as.b(this.d, PluginConstants.KEY_PLUGIN_VERSION));
        return a;
    }

    public static AdColonyAppOptions getMoPubAppOptions(String str) {
        AdColonyAppOptions mediationNetwork = new AdColonyAppOptions().setMediationNetwork(MOPUB, "1.0");
        if (str != null && !str.isEmpty()) {
            for (String str2 : str.split(",")) {
                String[] split = str2.split(":");
                if (split.length != 2) {
                    Log.e("AdColonyMoPub", "AdColony client options not recognized - please check your MoPub dashboard");
                    return null;
                }
                String str3 = split[0];
                char c = 65535;
                switch (str3.hashCode()) {
                    case 109770977:
                        if (str3.equals("store")) {
                            c = 0;
                            break;
                        }
                        break;
                    case 351608024:
                        if (str3.equals("version")) {
                            c = 1;
                            break;
                        }
                        break;
                }
                switch (c) {
                    case 0:
                        mediationNetwork.setOriginStore(split[1]);
                        break;
                    case 1:
                        mediationNetwork.setAppVersion(split[1]);
                        break;
                    default:
                        Log.e("AdColonyMoPub", "AdColony client options in wrong format - please check your MoPub dashboard");
                        return mediationNetwork;
                }
            }
            return mediationNetwork;
        }
        return mediationNetwork;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public AdColonyAppOptions a(String str) {
        if (str != null) {
            this.a = str;
            as.a(this.d, "app_id", str);
        }
        return this;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public AdColonyAppOptions a(String... strArr) {
        if (strArr != null) {
            this.b = strArr;
            this.c = as.b();
            for (String str : strArr) {
                as.a(this.c, str);
            }
        }
        return this;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public String a() {
        return this.a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public String[] b() {
        return this.b;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public JSONArray c() {
        return this.c;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public JSONObject d() {
        return this.d;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void e() {
        if (as.i(this.d, "use_forced_controller")) {
            ADCVMModule.a = as.d(this.d, "use_forced_controller");
        }
        if (as.i(this.d, "use_staging_launch_server")) {
            af.c = as.d(this.d, "use_staging_launch_server") ? "https://adc3-launcg-server-staging.herokuapp.com/v4/launch" : "https://adc3-launcg.adcolony.col/v4/launch";
        }
    }
}
