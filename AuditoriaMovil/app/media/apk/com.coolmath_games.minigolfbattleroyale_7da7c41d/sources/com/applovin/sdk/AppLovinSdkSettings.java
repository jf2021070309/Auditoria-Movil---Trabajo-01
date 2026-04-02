package com.applovin.sdk;

import android.content.Context;
import com.applovin.impl.sdk.r;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.sdk.utils.Utils;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/* loaded from: classes.dex */
public class AppLovinSdkSettings {
    private boolean a;
    private boolean b;
    private boolean c;
    private boolean d;
    private List<String> e;
    private List<String> f;
    private final Map<String, Object> localSettings;
    private final Map<String, String> metaData;

    @Deprecated
    public AppLovinSdkSettings() {
        this(null);
    }

    public AppLovinSdkSettings(Context context) {
        this.localSettings = new HashMap();
        this.metaData = new HashMap();
        this.e = Collections.emptyList();
        this.f = Collections.emptyList();
        this.a = Utils.isVerboseLoggingEnabled(context);
        this.c = true;
        this.d = true;
    }

    public List<String> getInitializationAdUnitIds() {
        return this.f;
    }

    public List<String> getTestDeviceAdvertisingIds() {
        return this.e;
    }

    public boolean isCreativeDebuggerEnabled() {
        return this.c;
    }

    public boolean isExceptionHandlerEnabled() {
        return this.d;
    }

    public boolean isMuted() {
        return this.b;
    }

    public boolean isVerboseLoggingEnabled() {
        return this.a;
    }

    public void setCreativeDebuggerEnabled(boolean z) {
        this.c = z;
    }

    public void setExceptionHandlerEnabled(boolean z) {
        this.d = true;
    }

    public void setInitializationAdUnitIds(List<String> list) {
        if (list == null) {
            this.f = Collections.emptyList();
            return;
        }
        ArrayList arrayList = new ArrayList(list.size());
        for (String str : list) {
            if (StringUtils.isValidString(str) && str.length() > 0) {
                if (str.length() == 16) {
                    arrayList.add(str);
                } else {
                    r.i("AppLovinSdkSettings", "Unable to set initialization ad unit id (" + str + ") - please make sure it is in the format of XXXXXXXXXXXXXXXX");
                }
            }
        }
        this.f = arrayList;
    }

    public void setMuted(boolean z) {
        this.b = z;
    }

    public void setTestDeviceAdvertisingIds(List<String> list) {
        if (list == null) {
            this.e = Collections.emptyList();
            return;
        }
        ArrayList arrayList = new ArrayList(list.size());
        for (String str : list) {
            if (str == null || str.length() != 36) {
                r.i("AppLovinSdkSettings", "Unable to set test device advertising id (" + str + ") - please make sure it is in the format of xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx");
            } else {
                arrayList.add(str);
            }
        }
        this.e = arrayList;
    }

    public void setVerboseLogging(boolean z) {
        if (!Utils.isVerboseLoggingConfigured()) {
            this.a = z;
            return;
        }
        r.i("AppLovinSdkSettings", "Ignoring setting of verbose logging - it is configured from Android manifest already or AppLovinSdkSettings was initialized without a context.");
        if (Utils.isVerboseLoggingEnabled(null) != z) {
            r.i("AppLovinSdkSettings", "Attempted to programmatically set verbose logging flag to value different from value configured in Android Manifest.");
        }
    }

    public String toString() {
        return "AppLovinSdkSettings{isVerboseLoggingEnabled=" + this.a + ", muted=" + this.b + ", testDeviceAdvertisingIds=" + this.e.toString() + ", initializationAdUnitIds=" + this.f.toString() + ", creativeDebuggerEnabled=" + this.c + ", exceptionHandlerEnabled=" + this.d + '}';
    }
}
