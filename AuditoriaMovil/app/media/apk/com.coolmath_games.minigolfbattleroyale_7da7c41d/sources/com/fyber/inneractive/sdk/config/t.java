package com.fyber.inneractive.sdk.config;

import com.facebook.internal.AnalyticsEvents;
import com.facebook.internal.ServerProtocol;
import com.fyber.inneractive.sdk.activities.InneractiveFullscreenAdActivity;
import com.fyber.inneractive.sdk.util.ae;
import org.json.JSONObject;
/* loaded from: classes.dex */
public final class t implements u {
    String a;
    public String b;
    public n c;
    q d;
    r e;
    public v f;
    x g;

    @Override // com.fyber.inneractive.sdk.config.u
    public final String a() {
        return this.a;
    }

    @Override // com.fyber.inneractive.sdk.config.u
    public final String b() {
        return this.b;
    }

    @Override // com.fyber.inneractive.sdk.config.u
    public final q c() {
        return this.d;
    }

    @Override // com.fyber.inneractive.sdk.config.u
    public final r d() {
        return this.e;
    }

    @Override // com.fyber.inneractive.sdk.config.u
    public final x e() {
        return this.g;
    }

    public final String toString() {
        JSONObject jSONObject = new JSONObject();
        ae.a(jSONObject, "id", this.a);
        ae.a(jSONObject, InneractiveFullscreenAdActivity.EXTRA_KEY_SPOT_ID, this.b);
        ae.a(jSONObject, ServerProtocol.DIALOG_PARAM_DISPLAY, this.c);
        ae.a(jSONObject, "monitor", this.d);
        ae.a(jSONObject, AnalyticsEvents.PARAMETER_SHARE_DIALOG_SHOW_NATIVE, this.e);
        ae.a(jSONObject, "video", this.f);
        ae.a(jSONObject, "viewability", this.g);
        return jSONObject.toString();
    }

    @Override // com.fyber.inneractive.sdk.config.u
    public final boolean f() {
        n nVar = this.c;
        if (nVar != null && nVar.b != null) {
            return this.c.b.isDeprecated();
        }
        v vVar = this.f;
        if (vVar == null || vVar.j == null) {
            return false;
        }
        return this.f.j.isDeprecated();
    }

    @Override // com.fyber.inneractive.sdk.config.u
    public final /* bridge */ /* synthetic */ w g() {
        return this.f;
    }

    @Override // com.fyber.inneractive.sdk.config.u
    public final /* bridge */ /* synthetic */ o h() {
        return this.c;
    }
}
