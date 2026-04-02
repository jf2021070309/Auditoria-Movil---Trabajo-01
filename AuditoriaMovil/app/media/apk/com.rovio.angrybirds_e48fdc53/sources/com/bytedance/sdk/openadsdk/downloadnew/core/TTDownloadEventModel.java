package com.bytedance.sdk.openadsdk.downloadnew.core;

import org.json.JSONObject;
/* loaded from: classes.dex */
public class TTDownloadEventModel {
    private String dr;
    private JSONObject g;
    private String ge;
    private JSONObject o;

    public static TTDownloadEventModel builder() {
        return new TTDownloadEventModel();
    }

    public TTDownloadEventModel setMaterialMeta(JSONObject jSONObject) {
        this.g = jSONObject;
        return this;
    }

    public TTDownloadEventModel setTag(String str) {
        this.dr = str;
        return this;
    }

    public TTDownloadEventModel setLabel(String str) {
        this.ge = str;
        return this;
    }

    public TTDownloadEventModel setExtJson(JSONObject jSONObject) {
        this.o = jSONObject;
        return this;
    }

    public String getTag() {
        return this.dr;
    }

    public String getLabel() {
        return this.ge;
    }

    public JSONObject getExtJson() {
        return this.o;
    }

    public JSONObject getMaterialMeta() {
        return this.g;
    }
}
