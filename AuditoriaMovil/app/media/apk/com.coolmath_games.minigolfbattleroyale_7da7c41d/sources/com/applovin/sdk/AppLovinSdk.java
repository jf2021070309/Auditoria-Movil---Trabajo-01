package com.applovin.sdk;

import android.content.Context;
import android.text.TextUtils;
import com.applovin.impl.mediation.MaxMediatedNetworkInfoImpl;
import com.applovin.impl.sdk.k;
import com.applovin.impl.sdk.r;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.c;
import com.applovin.mediation.MaxMediatedNetworkInfo;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;
/* loaded from: classes.dex */
public final class AppLovinSdk {
    private static final String TAG = "AppLovinSdk";
    public static final String VERSION = getVersion();
    public static final int VERSION_CODE = getVersionCode();
    private static final Map<String, AppLovinSdk> sdkInstances = new HashMap();
    private static final Object sdkInstancesLock = new Object();
    public final k coreSdk;

    /* loaded from: classes.dex */
    public interface SdkInitializationListener {
        void onSdkInitialized(AppLovinSdkConfiguration appLovinSdkConfiguration);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class a extends AppLovinSdkSettings {
        a(Context context) {
            super(context);
        }
    }

    private AppLovinSdk(k kVar) {
        this.coreSdk = kVar;
    }

    public static AppLovinSdk a(String str, AppLovinSdkSettings appLovinSdkSettings, Context context) {
        if (appLovinSdkSettings != null) {
            if (context != null) {
                synchronized (sdkInstancesLock) {
                    if (sdkInstances.containsKey(str)) {
                        return sdkInstances.get(str);
                    }
                    if (!TextUtils.isEmpty(str) && str.contains(File.separator)) {
                        r.i(TAG, "\n**************************************************\nINVALID SDK KEY: " + str + "\n**************************************************\n");
                        if (!sdkInstances.isEmpty()) {
                            return sdkInstances.values().iterator().next();
                        }
                        str = str.replace(File.separator, "");
                    }
                    if (sdkInstances.isEmpty()) {
                        String arrays = Arrays.toString(Arrays.copyOf(new Throwable().getStackTrace(), 5));
                        r.g(TAG, "AppLovinSdk.getInstance()\n" + arrays);
                    }
                    k kVar = new k();
                    kVar.a(str, appLovinSdkSettings, context);
                    AppLovinSdk appLovinSdk = new AppLovinSdk(kVar);
                    kVar.a(appLovinSdk);
                    sdkInstances.put(str, appLovinSdk);
                    return appLovinSdk;
                }
            }
            throw new IllegalArgumentException("No context specified");
        }
        throw new IllegalArgumentException("No userSettings specified");
    }

    public static List<AppLovinSdk> a() {
        return new ArrayList(sdkInstances.values());
    }

    public static AppLovinSdk getInstance(Context context) {
        return getInstance(new a(context), context);
    }

    public static AppLovinSdk getInstance(AppLovinSdkSettings appLovinSdkSettings, Context context) {
        if (context != null) {
            return getInstance(c.a(context).a("applovin.sdk.key", ""), appLovinSdkSettings, context);
        }
        throw new IllegalArgumentException("No context specified");
    }

    public static AppLovinSdk getInstance(String str, AppLovinSdkSettings appLovinSdkSettings, Context context) {
        return a(str, appLovinSdkSettings, context);
    }

    private static String getVersion() {
        return "10.3.2";
    }

    private static int getVersionCode() {
        return 10030299;
    }

    public static void initializeSdk(Context context) {
        initializeSdk(context, null);
    }

    public static void initializeSdk(Context context, SdkInitializationListener sdkInitializationListener) {
        if (context == null) {
            throw new IllegalArgumentException("No context specified");
        }
        AppLovinSdk appLovinSdk = getInstance(context);
        if (appLovinSdk != null) {
            appLovinSdk.initializeSdk(sdkInitializationListener);
        } else {
            r.i(TAG, "Unable to initialize AppLovin SDK: SDK object not created");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void reinitializeAll(Boolean bool, Boolean bool2, Boolean bool3) {
        synchronized (sdkInstancesLock) {
            for (AppLovinSdk appLovinSdk : sdkInstances.values()) {
                appLovinSdk.coreSdk.b();
                appLovinSdk.coreSdk.i();
                if (bool != null) {
                    r z = appLovinSdk.coreSdk.z();
                    z.c(TAG, "Toggled 'huc' to " + bool);
                    appLovinSdk.getEventService().trackEvent("huc", CollectionUtils.map("value", bool.toString()));
                }
                if (bool2 != null) {
                    r z2 = appLovinSdk.coreSdk.z();
                    z2.c(TAG, "Toggled 'aru' to " + bool2);
                    appLovinSdk.getEventService().trackEvent("aru", CollectionUtils.map("value", bool2.toString()));
                }
                if (bool3 != null) {
                    r z3 = appLovinSdk.coreSdk.z();
                    z3.c(TAG, "Toggled 'dns' to " + bool3);
                    appLovinSdk.getEventService().trackEvent("dns", CollectionUtils.map("value", bool3.toString()));
                }
            }
        }
    }

    public AppLovinAdService getAdService() {
        return this.coreSdk.t();
    }

    public List<MaxMediatedNetworkInfo> getAvailableMediatedNetworks() {
        JSONArray a2 = com.applovin.impl.mediation.c.c.a(this.coreSdk);
        ArrayList arrayList = new ArrayList(a2.length());
        for (int i = 0; i < a2.length(); i++) {
            arrayList.add(new MaxMediatedNetworkInfoImpl(JsonUtils.getJSONObject(a2, i, (JSONObject) null)));
        }
        return arrayList;
    }

    public AppLovinSdkConfiguration getConfiguration() {
        return this.coreSdk.r();
    }

    public AppLovinEventService getEventService() {
        return this.coreSdk.u();
    }

    public String getMediationProvider() {
        return this.coreSdk.s();
    }

    public AppLovinPostbackService getPostbackService() {
        return this.coreSdk.V();
    }

    public String getSdkKey() {
        return this.coreSdk.x();
    }

    public AppLovinSdkSettings getSettings() {
        return this.coreSdk.p();
    }

    public String getUserIdentifier() {
        return this.coreSdk.m();
    }

    public AppLovinUserSegment getUserSegment() {
        return this.coreSdk.q();
    }

    public AppLovinUserService getUserService() {
        return this.coreSdk.v();
    }

    public AppLovinVariableService getVariableService() {
        return this.coreSdk.w();
    }

    public boolean hasCriticalErrors() {
        return this.coreSdk.y();
    }

    public void initializeSdk() {
    }

    public void initializeSdk(SdkInitializationListener sdkInitializationListener) {
        this.coreSdk.a(sdkInitializationListener);
    }

    public boolean isEnabled() {
        return this.coreSdk.d();
    }

    public boolean isInitialized() {
        return this.coreSdk.d();
    }

    public void setMediationProvider(String str) {
        this.coreSdk.c(str);
    }

    public void setPluginVersion(String str) {
        this.coreSdk.a(str);
    }

    public void setUserIdentifier(String str) {
        this.coreSdk.b(str);
    }

    public void showMediationDebugger() {
        this.coreSdk.l();
    }

    public String toString() {
        return "AppLovinSdk{sdkKey='" + getSdkKey() + "', isEnabled=" + isEnabled() + ", isFirstSession=" + this.coreSdk.N() + '}';
    }
}
