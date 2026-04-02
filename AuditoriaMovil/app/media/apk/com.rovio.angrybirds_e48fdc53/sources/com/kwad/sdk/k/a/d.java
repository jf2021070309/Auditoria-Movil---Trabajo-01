package com.kwad.sdk.k.a;

import android.content.Context;
import android.provider.Settings;
import com.kwad.sdk.utils.t;
import org.json.JSONObject;
/* loaded from: classes3.dex */
public final class d extends com.kwad.sdk.core.response.a.a implements com.kwad.sdk.core.b {
    public int aGw = 0;
    public int aGx = 0;
    public int aGy = 0;
    public int aGz = 0;
    public int aGA = 0;
    public int aGB = 0;
    public int aGC = 0;

    public d(Context context) {
        if (context != null) {
            bA(Settings.Secure.getInt(context.getContentResolver(), "adb_enabled", 0) > 0);
        }
    }

    private void a(d dVar, JSONObject jSONObject) {
        if (jSONObject == null) {
            return;
        }
        dVar.aGw = jSONObject.optInt("isRoot");
        dVar.aGx = jSONObject.optInt("isXPosed");
        dVar.aGy = jSONObject.optInt("isFrameworkHooked");
        dVar.aGz = jSONObject.optInt("isVirtual");
        dVar.aGA = jSONObject.optInt("isAdbEnabled");
        dVar.aGB = jSONObject.optInt("isEmulator");
        dVar.aGC = jSONObject.optInt("isGroupControl");
        super.afterParseJson(jSONObject);
    }

    private static JSONObject b(d dVar, JSONObject jSONObject) {
        t.putValue(jSONObject, "isRoot", dVar.aGw);
        t.putValue(jSONObject, "isXPosed", dVar.aGx);
        t.putValue(jSONObject, "isFrameworkHooked", dVar.aGy);
        t.putValue(jSONObject, "isVirtual", dVar.aGz);
        t.putValue(jSONObject, "isAdbEnabled", dVar.aGA);
        t.putValue(jSONObject, "isEmulator", dVar.aGB);
        t.putValue(jSONObject, "isGroupControl", dVar.aGC);
        return jSONObject;
    }

    private void bA(boolean z) {
        this.aGA = bD(z);
    }

    private static int bD(boolean z) {
        return z ? 1 : 2;
    }

    public final void bB(boolean z) {
        this.aGB = bD(z);
    }

    public final void bC(boolean z) {
        this.aGC = bD(z);
    }

    public final void bx(boolean z) {
        this.aGw = bD(z);
    }

    public final void by(boolean z) {
        this.aGx = bD(z);
    }

    public final void bz(boolean z) {
        this.aGy = bD(z);
    }

    @Override // com.kwad.sdk.core.response.a.a, com.kwad.sdk.core.b
    public final void parseJson(JSONObject jSONObject) {
        a(this, jSONObject);
        afterParseJson(jSONObject);
    }

    @Override // com.kwad.sdk.core.response.a.a, com.kwad.sdk.core.b
    public final JSONObject toJson() {
        JSONObject b = b(this, new JSONObject());
        afterToJson(b);
        return b;
    }
}
