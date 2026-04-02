package com.applovin.impl.sdk;

import android.os.Bundle;
import android.text.TextUtils;
import com.applovin.impl.sdk.e.l;
import com.applovin.impl.sdk.e.o;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.sdk.AppLovinSdkUtils;
import com.applovin.sdk.AppLovinVariableService;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;
/* loaded from: classes.dex */
public class VariableServiceImpl implements AppLovinVariableService {
    private final k a;
    private AppLovinVariableService.OnVariablesUpdateListener d;
    private Bundle e;
    private final AtomicBoolean b = new AtomicBoolean();
    private final AtomicBoolean c = new AtomicBoolean();
    private final Object f = new Object();

    /* JADX INFO: Access modifiers changed from: package-private */
    public VariableServiceImpl(k kVar) {
        this.a = kVar;
        String str = (String) kVar.a(com.applovin.impl.sdk.c.d.j);
        if (StringUtils.isValidString(str)) {
            updateVariables(JsonUtils.deserialize(str));
        }
    }

    private Object a(String str, Object obj, Class<?> cls) {
        if (TextUtils.isEmpty(str)) {
            r.i("AppLovinVariableService", "Unable to retrieve variable value for empty name");
            return obj;
        }
        if (!this.a.d()) {
            r.h("AppLovinSdk", "Attempted to retrieve variable before SDK initialization. Please wait until after the SDK has initialized, e.g. AppLovinSdk.initializeSdk(Context, SdkInitializationListener).");
        }
        synchronized (this.f) {
            if (this.e == null) {
                r.i("AppLovinVariableService", "Unable to retrieve variable value for name \"" + str + "\". No variables returned by the server.");
                return obj;
            } else if (cls.equals(String.class)) {
                return this.e.getString(str, (String) obj);
            } else if (cls.equals(Boolean.class)) {
                return Boolean.valueOf(this.e.getBoolean(str, ((Boolean) obj).booleanValue()));
            } else {
                throw new IllegalStateException("Unable to retrieve variable value for " + str);
            }
        }
    }

    private void a() {
        synchronized (this.f) {
            if (this.d != null && this.e != null) {
                final Bundle bundle = (Bundle) this.e.clone();
                AppLovinSdkUtils.runOnUiThread(true, new Runnable() { // from class: com.applovin.impl.sdk.VariableServiceImpl.2
                    @Override // java.lang.Runnable
                    public void run() {
                        VariableServiceImpl.this.d.onVariablesUpdate(bundle);
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
        } else if (this.b.compareAndSet(false, true)) {
            this.a.Q().a(new com.applovin.impl.sdk.e.l(this.a, new l.a() { // from class: com.applovin.impl.sdk.VariableServiceImpl.1
                @Override // com.applovin.impl.sdk.e.l.a
                public void a() {
                    VariableServiceImpl.this.b.set(false);
                }
            }), o.a.BACKGROUND);
            return;
        } else {
            str = "Ignored explicit variables load. Service is already in the process of retrieving the latest set of variables.";
        }
        r.i("AppLovinVariableService", str);
    }

    @Override // com.applovin.sdk.AppLovinVariableService
    @Deprecated
    public void setOnVariablesUpdateListener(AppLovinVariableService.OnVariablesUpdateListener onVariablesUpdateListener) {
        this.d = onVariablesUpdateListener;
        synchronized (this.f) {
            if (onVariablesUpdateListener != null) {
                if (this.e != null && this.c.compareAndSet(false, true)) {
                    this.a.z().b("AppLovinVariableService", "Setting initial listener");
                    a();
                }
            }
        }
    }

    public String toString() {
        return "VariableService{variables=" + this.e + ", listener=" + this.d + '}';
    }

    public void updateVariables(JSONObject jSONObject) {
        r z = this.a.z();
        z.b("AppLovinVariableService", "Updating variables: " + jSONObject + "...");
        synchronized (this.f) {
            this.e = JsonUtils.toBundle(jSONObject);
            a();
            this.a.a((com.applovin.impl.sdk.c.d<com.applovin.impl.sdk.c.d<String>>) com.applovin.impl.sdk.c.d.j, (com.applovin.impl.sdk.c.d<String>) jSONObject.toString());
        }
    }
}
