package com.ironsource.sdk.controller;

import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.ironsource.sdk.utils.IronSourceStorageUtils;
import org.json.JSONObject;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class l {
    String a;
    com.ironsource.sdk.h.b b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public l(String str, com.ironsource.sdk.h.b bVar) {
        this.a = str;
        this.b = bVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static com.ironsource.sdk.h.c a(JSONObject jSONObject, String str) {
        if (jSONObject.has("filePath") && jSONObject.has("fileName")) {
            String string = jSONObject.getString("filePath");
            return new com.ironsource.sdk.h.c(IronSourceStorageUtils.buildAbsolutePathToDirInCache(str, string), jSONObject.getString("fileName"));
        }
        throw new Exception("Missing params for file");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static JSONObject a(n nVar, long j) {
        try {
            return nVar.a().put(IronSourceConstants.EVENTS_RESULT, j);
        } catch (Exception e) {
            e.printStackTrace();
            return new JSONObject();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static JSONObject a(n nVar, String str) {
        try {
            return nVar.a().put("errMsg", str);
        } catch (Exception e) {
            e.printStackTrace();
            return new JSONObject();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static JSONObject a(n nVar, JSONObject jSONObject) {
        try {
            return nVar.a().put(IronSourceConstants.EVENTS_RESULT, jSONObject);
        } catch (Exception e) {
            e.printStackTrace();
            return new JSONObject();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static com.ironsource.sdk.h.c b(JSONObject jSONObject, String str) {
        if (jSONObject.has("folderPath")) {
            return new com.ironsource.sdk.h.c(IronSourceStorageUtils.buildAbsolutePathToDirInCache(str, jSONObject.getString("folderPath")));
        }
        throw new Exception("Missing params for folder");
    }
}
