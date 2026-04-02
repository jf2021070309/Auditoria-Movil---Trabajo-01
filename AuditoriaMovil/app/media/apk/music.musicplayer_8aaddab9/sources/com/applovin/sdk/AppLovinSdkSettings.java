package com.applovin.sdk;

import android.content.Context;
import android.text.TextUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.sdk.utils.Utils;
import com.applovin.impl.sdk.v;
import e.a.d.a.a;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/* loaded from: classes.dex */
public class AppLovinSdkSettings {
    private boolean a;

    /* renamed from: b  reason: collision with root package name */
    private boolean f4447b;
    private final Map<String, Object> localSettings = new HashMap();
    private final Map<String, String> metaData = new HashMap();

    /* renamed from: f  reason: collision with root package name */
    private List<String> f4451f = Collections.emptyList();

    /* renamed from: g  reason: collision with root package name */
    private List<String> f4452g = Collections.emptyList();

    /* renamed from: h  reason: collision with root package name */
    private final Map<String, String> f4453h = new HashMap();

    /* renamed from: i  reason: collision with root package name */
    private final Object f4454i = new Object();

    /* renamed from: c  reason: collision with root package name */
    private boolean f4448c = true;

    /* renamed from: d  reason: collision with root package name */
    private boolean f4449d = true;

    /* renamed from: e  reason: collision with root package name */
    private boolean f4450e = true;

    public AppLovinSdkSettings(Context context) {
        this.a = Utils.isVerboseLoggingEnabled(context);
    }

    public Map<String, String> getExtraParameters() {
        HashMap hashMap;
        synchronized (this.f4454i) {
            hashMap = new HashMap(this.f4453h);
        }
        return hashMap;
    }

    public List<String> getInitializationAdUnitIds() {
        return this.f4452g;
    }

    public List<String> getTestDeviceAdvertisingIds() {
        return this.f4451f;
    }

    public boolean isCreativeDebuggerEnabled() {
        return this.f4448c;
    }

    public boolean isExceptionHandlerEnabled() {
        return this.f4449d;
    }

    public boolean isLocationCollectionEnabled() {
        return this.f4450e;
    }

    public boolean isMuted() {
        return this.f4447b;
    }

    public boolean isVerboseLoggingEnabled() {
        return this.a;
    }

    public void setCreativeDebuggerEnabled(boolean z) {
        this.f4448c = z;
    }

    public void setExceptionHandlerEnabled(boolean z) {
        this.f4449d = z;
    }

    public void setExtraParameter(String str, String str2) {
        if (!TextUtils.isEmpty(str)) {
            synchronized (this.f4454i) {
                this.f4453h.put(str, str2);
            }
            return;
        }
        v.i("AppLovinSdkSettings", "Failed to set extra parameter for null or empty key: " + str);
    }

    public void setInitializationAdUnitIds(List<String> list) {
        if (list == null) {
            this.f4452g = Collections.emptyList();
            return;
        }
        ArrayList arrayList = new ArrayList(list.size());
        for (String str : list) {
            if (StringUtils.isValidString(str) && str.length() > 0) {
                if (str.length() == 16) {
                    arrayList.add(str);
                } else {
                    v.i("AppLovinSdkSettings", "Unable to set initialization ad unit id (" + str + ") - please make sure it is in the format of XXXXXXXXXXXXXXXX");
                }
            }
        }
        this.f4452g = arrayList;
    }

    public void setLocationCollectionEnabled(boolean z) {
        this.f4450e = z;
    }

    public void setMuted(boolean z) {
        this.f4447b = z;
    }

    public void setTestDeviceAdvertisingIds(List<String> list) {
        if (list == null) {
            this.f4451f = Collections.emptyList();
            return;
        }
        ArrayList arrayList = new ArrayList(list.size());
        for (String str : list) {
            if (str == null || str.length() != 36) {
                v.i("AppLovinSdkSettings", "Unable to set test device advertising id (" + str + ") - please make sure it is in the format of xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx");
            } else {
                arrayList.add(str);
            }
        }
        this.f4451f = arrayList;
    }

    public void setVerboseLogging(boolean z) {
        if (!Utils.isVerboseLoggingConfigured()) {
            this.a = z;
            return;
        }
        v.i("AppLovinSdkSettings", "Ignoring setting of verbose logging - it is configured from Android manifest already.");
        if (Utils.isVerboseLoggingEnabled(null) != z) {
            v.i("AppLovinSdkSettings", "Attempted to programmatically set verbose logging flag to value different from value configured in Android Manifest.");
        }
    }

    public String toString() {
        StringBuilder y = a.y("AppLovinSdkSettings{isVerboseLoggingEnabled=");
        y.append(this.a);
        y.append(", muted=");
        y.append(this.f4447b);
        y.append(", testDeviceAdvertisingIds=");
        y.append(this.f4451f.toString());
        y.append(", initializationAdUnitIds=");
        y.append(this.f4452g.toString());
        y.append(", creativeDebuggerEnabled=");
        y.append(this.f4448c);
        y.append(", exceptionHandlerEnabled=");
        y.append(this.f4449d);
        y.append(", locationCollectionEnabled=");
        y.append(this.f4450e);
        y.append('}');
        return y.toString();
    }
}
