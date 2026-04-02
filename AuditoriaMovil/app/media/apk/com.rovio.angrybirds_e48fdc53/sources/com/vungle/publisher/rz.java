package com.vungle.publisher;

import android.os.Build;
import android.util.Log;
import com.facebook.internal.ServerProtocol;
import com.vungle.publisher.log.Logger;
import javax.inject.Inject;
import javax.inject.Provider;
import javax.inject.Singleton;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: classes4.dex */
public class rz extends vs {
    JSONObject a;
    JSONObject b;
    JSONObject c;
    JSONObject d;
    JSONObject e;
    JSONObject f;
    JSONObject g;
    JSONObject h;
    String i;
    se j;
    Boolean k;
    Boolean l;
    Boolean m;
    Boolean n;
    x o;
    @Inject
    mv p;

    @Override // com.vungle.publisher.vs, com.vungle.publisher.vt
    /* renamed from: a */
    public JSONObject b() {
        JSONObject b = super.b();
        b.putOpt("maxSize", this.a);
        b.putOpt("screenSize", this.b);
        b.putOpt("defaultPosition", this.c);
        b.putOpt("currentPosition", this.d);
        b.putOpt("expandProperties", this.e);
        b.putOpt("resizeProperties", this.f);
        b.putOpt("orientationProperties", this.g);
        b.putOpt("supports", this.h);
        b.putOpt(ServerProtocol.DIALOG_PARAM_STATE, this.i);
        b.putOpt("placementType", this.j);
        b.putOpt("isViewable", this.k);
        b.putOpt(com.umeng.analytics.pro.bg.x, "android");
        b.putOpt("osVersion", Integer.toString(Build.VERSION.SDK_INT));
        b.putOpt("startMuted", this.l);
        b.putOpt("incentivized", this.m);
        b.putOpt("enableBackImmediately", this.n);
        b.putOpt("version", "1.0");
        return b;
    }

    public void a(int i, int i2) {
        this.a = c(i, i2);
    }

    public void a(p pVar, boolean z) {
        this.m = Boolean.valueOf(z);
        this.n = Boolean.valueOf(pVar.isBackButtonImmediatelyEnabled());
    }

    public void b(int i, int i2) {
        this.b = c(i, i2);
    }

    private JSONObject c(int i, int i2) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("width", i);
            jSONObject.put("height", i2);
        } catch (JSONException e) {
            Logger.e(Logger.PROTOCOL_TAG, "exception setting mraid size properties", e);
        }
        return jSONObject;
    }

    public void a(int i, int i2, int i3, int i4) {
        this.c = c(i, i2, i3, i4);
    }

    public void b(int i, int i2, int i3, int i4) {
        this.d = c(i, i2, i3, i4);
    }

    private JSONObject c(int i, int i2, int i3, int i4) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("x", i);
            jSONObject.put("y", i2);
            jSONObject.put("width", i3);
            jSONObject.put("height", i4);
        } catch (JSONException e) {
            Logger.e(Logger.PROTOCOL_TAG, "exception setting mraid position properties", e);
        }
        return jSONObject;
    }

    public void c() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("sms", false);
            jSONObject.put("tel", false);
            jSONObject.put("calendar", false);
            jSONObject.put("storePicture", false);
            jSONObject.put("inlineVideo", false);
        } catch (JSONException e) {
            Logger.e(Logger.PROTOCOL_TAG, "exception setting mraid supports properties", e);
        }
        this.h = jSONObject;
    }

    public void d() {
        int c;
        int d;
        switch (this.o) {
            case fullscreen:
                c = (int) this.p.a();
                d = (int) this.p.b();
                break;
            case flexview:
                c = this.p.c();
                d = this.p.d();
                break;
            default:
                Log.e(Logger.PROTOCOL_TAG, "Unsupported TemplateType: " + this.o);
                d = 0;
                c = 0;
                break;
        }
        a(c, d);
        b(c, d);
        a(0, 0, c, d);
        b(0, 0, c, d);
    }

    public void a(se seVar) {
        this.j = seVar;
    }

    public void a(boolean z) {
        this.k = Boolean.valueOf(z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(x xVar) {
        this.o = xVar;
    }

    @Singleton
    /* loaded from: classes4.dex */
    public static class a {
        @Inject
        Provider<rz> a;

        public rz a(x xVar) {
            rz rzVar = this.a.get();
            rzVar.a(xVar);
            return rzVar;
        }
    }
}
