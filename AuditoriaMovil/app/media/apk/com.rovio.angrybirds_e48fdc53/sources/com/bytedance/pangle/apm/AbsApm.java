package com.bytedance.pangle.apm;

import org.json.JSONObject;
/* loaded from: classes.dex */
public abstract class AbsApm {
    public abstract String getDid();

    public abstract void init();

    public abstract void monitorEvent(String str, JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3);

    public abstract void reportError(String str, Throwable th);
}
