package com.applovin.impl.sdk;

import android.os.Bundle;
import android.text.TextUtils;
import com.applovin.impl.sdk.e.m;
import com.applovin.impl.sdk.e.o;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.sdk.AppLovinSdkUtils;
import com.applovin.sdk.AppLovinVariableService;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;
/* loaded from: classes.dex */
public class VariableServiceImpl implements AppLovinVariableService {
    private final m a;

    /* renamed from: d  reason: collision with root package name */
    private AppLovinVariableService.OnVariablesUpdateListener f3788d;

    /* renamed from: e  reason: collision with root package name */
    private Bundle f3789e;

    /* renamed from: b  reason: collision with root package name */
    private final AtomicBoolean f3786b = new AtomicBoolean();

    /* renamed from: c  reason: collision with root package name */
    private final AtomicBoolean f3787c = new AtomicBoolean();

    /* renamed from: f  reason: collision with root package name */
    private final Object f3790f = new Object();

    public VariableServiceImpl(m mVar) {
        this.a = mVar;
        String str = (String) mVar.a(com.applovin.impl.sdk.c.d.f3946j);
        if (StringUtils.isValidString(str)) {
            updateVariables(JsonUtils.deserialize(str));
        }
    }

    private Object a(String str, Object obj, Class<?> cls) {
        if (TextUtils.isEmpty(str)) {
            v.i("AppLovinVariableService", "Unable to retrieve variable value for empty name");
            return obj;
        }
        if (!this.a.d()) {
            v.h("AppLovinSdk", "Attempted to retrieve variable before SDK initialization. Please wait until after the SDK has initialized, e.g. AppLovinSdk.initializeSdk(Context, SdkInitializationListener).");
        }
        synchronized (this.f3790f) {
            if (this.f3789e == null) {
                v.i("AppLovinVariableService", "Unable to retrieve variable value for name \"" + str + "\". No variables returned by the server.");
                return obj;
            } else if (cls.equals(String.class)) {
                return this.f3789e.getString(str, (String) obj);
            } else if (cls.equals(Boolean.class)) {
                return Boolean.valueOf(this.f3789e.getBoolean(str, ((Boolean) obj).booleanValue()));
            } else {
                throw new IllegalStateException("Unable to retrieve variable value for " + str);
            }
        }
    }

    private void a() {
        Bundle bundle;
        synchronized (this.f3790f) {
            if (this.f3788d != null && (bundle = this.f3789e) != null) {
                final Bundle bundle2 = (Bundle) bundle.clone();
                AppLovinSdkUtils.runOnUiThread(true, new Runnable() { // from class: com.applovin.impl.sdk.VariableServiceImpl.2
                    @Override // java.lang.Runnable
                    public void run() {
                        VariableServiceImpl.this.f3788d.onVariablesUpdate(bundle2);
                    }
                });
            }
        }
    }

    @Override // com.applovin.sdk.AppLovinVariableService
    public boolean getBoolean(String str) {
        return getBoolean(str, false);
    }

    @Override // com.applovin.sdk.AppLovinVariableService
    public boolean getBoolean(String str, boolean z) {
        return ((Boolean) a(str, Boolean.valueOf(z), Boolean.class)).booleanValue();
    }

    @Override // com.applovin.sdk.AppLovinVariableService
    public String getString(String str) {
        return getString(str, null);
    }

    @Override // com.applovin.sdk.AppLovinVariableService
    public String getString(String str, String str2) {
        return (String) a(str, str2, String.class);
    }

    @Override // com.applovin.sdk.AppLovinVariableService
    @Deprecated
    public void loadVariables() {
        String str;
        if (!this.a.d()) {
            str = "The AppLovin SDK is waiting for the initial variables to be returned upon completing initialization.";
        } else if (this.f3786b.compareAndSet(false, true)) {
            this.a.S().a(new com.applovin.impl.sdk.e.m(this.a, new m.a() { // from class: com.applovin.impl.sdk.VariableServiceImpl.1
                @Override // com.applovin.impl.sdk.e.m.a
                public void a() {
                    VariableServiceImpl.this.f3786b.set(false);
                }
            }), o.a.BACKGROUND);
            return;
        } else {
            str = "Ignored explicit variables load. Service is already in the process of retrieving the latest set of variables.";
        }
        v.i("AppLovinVariableService", str);
    }

    @Override // com.applovin.sdk.AppLovinVariableService
    @Deprecated
    public void setOnVariablesUpdateListener(AppLovinVariableService.OnVariablesUpdateListener onVariablesUpdateListener) {
        this.f3788d = onVariablesUpdateListener;
        synchronized (this.f3790f) {
            if (onVariablesUpdateListener != null) {
                if (this.f3789e != null && this.f3787c.compareAndSet(false, true)) {
                    this.a.B().b("AppLovinVariableService", "Setting initial listener");
                    a();
                }
            }
        }
    }

    public String toString() {
        StringBuilder y = e.a.d.a.a.y("VariableService{variables=");
        y.append(this.f3789e);
        y.append(", listener=");
        y.append(this.f3788d);
        y.append('}');
        return y.toString();
    }

    public void updateVariables(JSONObject jSONObject) {
        v B = this.a.B();
        B.b("AppLovinVariableService", "Updating variables: " + jSONObject + "...");
        synchronized (this.f3790f) {
            this.f3789e = JsonUtils.toBundle(jSONObject);
            a();
            this.a.a((com.applovin.impl.sdk.c.d<com.applovin.impl.sdk.c.d<String>>) com.applovin.impl.sdk.c.d.f3946j, (com.applovin.impl.sdk.c.d<String>) jSONObject.toString());
        }
    }
}
