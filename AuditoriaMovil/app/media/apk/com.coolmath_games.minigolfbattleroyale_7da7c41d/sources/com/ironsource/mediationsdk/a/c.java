package com.ironsource.mediationsdk.a;

import com.facebook.appevents.AppEventsConstants;
import com.ironsource.mediationsdk.impressionData.ImpressionData;
import com.ironsource.mediationsdk.logger.IronSourceLogger;
import com.ironsource.mediationsdk.logger.IronSourceLoggerManager;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;
/* loaded from: classes2.dex */
public class c {
    private String a;
    private String b;
    private String c;
    private List<String> d;
    private List<String> e;
    private List<String> f;
    private boolean g;
    private ImpressionData h;

    public c(String str) {
        this.a = str;
        this.b = "";
        this.c = "";
        this.d = new ArrayList();
        this.e = new ArrayList();
        this.f = new ArrayList();
        this.g = true;
        this.h = null;
    }

    public c(JSONObject jSONObject) {
        this(jSONObject, null);
    }

    public c(JSONObject jSONObject, JSONObject jSONObject2) {
        this.g = false;
        try {
            if (jSONObject.has("instance")) {
                this.a = jSONObject.getString("instance");
            }
            this.b = jSONObject.has("adMarkup") ? jSONObject.getString("adMarkup") : jSONObject.has("serverData") ? jSONObject.getString("serverData") : "";
            this.c = jSONObject.has("price") ? jSONObject.getString("price") : AppEventsConstants.EVENT_PARAM_VALUE_NO;
            this.d = new ArrayList();
            this.e = new ArrayList();
            this.f = new ArrayList();
            if (jSONObject.has("notifications")) {
                JSONObject optJSONObject = jSONObject.optJSONObject("notifications");
                if (optJSONObject.has("burl")) {
                    JSONArray jSONArray = optJSONObject.getJSONArray("burl");
                    for (int i = 0; i < jSONArray.length(); i++) {
                        this.d.add(jSONArray.getString(i));
                    }
                }
                if (optJSONObject.has("lurl")) {
                    JSONArray jSONArray2 = optJSONObject.getJSONArray("lurl");
                    for (int i2 = 0; i2 < jSONArray2.length(); i2++) {
                        this.e.add(jSONArray2.getString(i2));
                    }
                }
                if (optJSONObject.has("nurl")) {
                    JSONArray jSONArray3 = optJSONObject.getJSONArray("nurl");
                    for (int i3 = 0; i3 < jSONArray3.length(); i3++) {
                        this.f.add(jSONArray3.getString(i3));
                    }
                }
            }
            this.h = new ImpressionData(com.ironsource.mediationsdk.c.b.a(jSONObject2, jSONObject.has("armData") ? jSONObject.optJSONObject("armData") : null));
            this.g = true;
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static a a(String str, int i) {
        if ("ironbeast".equals(str)) {
            return new e(i);
        }
        if ("outcome".equals(str)) {
            return new f(i);
        }
        if (i == 2) {
            return new e(i);
        }
        if (i == 3) {
            return new f(i);
        }
        IronSourceLoggerManager logger = IronSourceLoggerManager.getLogger();
        IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.NATIVE;
        logger.log(ironSourceTag, "EventsFormatterFactory failed to instantiate a formatter (type: " + str + ", adUnit: " + i + ")", 2);
        return null;
    }

    public ImpressionData a(String str) {
        ImpressionData impressionData = this.h;
        if (impressionData != null) {
            impressionData.replaceMacroForPlacementWithValue("${PLACEMENT_NAME}", str);
        }
        return this.h;
    }

    public String a() {
        return this.a;
    }

    public String b() {
        return this.b;
    }

    public String c() {
        return this.c;
    }

    public List<String> d() {
        return this.d;
    }

    public List<String> e() {
        return this.e;
    }

    public List<String> f() {
        return this.f;
    }

    public boolean g() {
        return this.g;
    }
}
