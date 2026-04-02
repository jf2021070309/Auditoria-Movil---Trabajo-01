package com.kwad.sdk.core.b.a;

import com.kwad.components.ad.splashscreen.monitor.SplashMonitorInfo;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONObject;
/* loaded from: classes.dex */
public final class ib implements com.kwad.sdk.core.d<SplashMonitorInfo> {
    /* renamed from: a  reason: avoid collision after fix types in other method */
    private static void a2(SplashMonitorInfo splashMonitorInfo, JSONObject jSONObject) {
        if (jSONObject == null) {
            return;
        }
        splashMonitorInfo.status = jSONObject.optInt("status");
        splashMonitorInfo.type = jSONObject.optInt("type");
        splashMonitorInfo.preloadId = jSONObject.optString("preload_id");
        if (splashMonitorInfo.preloadId == JSONObject.NULL) {
            splashMonitorInfo.preloadId = "";
        }
        splashMonitorInfo.errorCode = jSONObject.optInt("error_code");
        splashMonitorInfo.errorMsg = jSONObject.optString("error_msg");
        if (splashMonitorInfo.errorMsg == JSONObject.NULL) {
            splashMonitorInfo.errorMsg = "";
        }
        splashMonitorInfo.checkStatus = jSONObject.optInt("check_status");
        splashMonitorInfo.loadDataTime = jSONObject.optLong("load_data_duration_ms");
        splashMonitorInfo.beforeLoadDataTime = jSONObject.optLong("before_load_data_duration_ms");
        splashMonitorInfo.checkDataTime = jSONObject.optLong("check_data_duration_ms");
        splashMonitorInfo.loadAndCheckDataTime = jSONObject.optLong("load_and_check_data_duration_ms");
        splashMonitorInfo.costTime = jSONObject.optLong("duration_ms");
        splashMonitorInfo.ids = new ArrayList();
        JSONArray optJSONArray = jSONObject.optJSONArray("ids");
        if (optJSONArray != null) {
            for (int i = 0; i < optJSONArray.length(); i++) {
                splashMonitorInfo.ids.add((String) optJSONArray.opt(i));
            }
        }
        splashMonitorInfo.count = jSONObject.optInt("count");
        splashMonitorInfo.cacheValidTime = jSONObject.optLong("validity_period_ms");
        splashMonitorInfo.size = jSONObject.optLong("size");
        splashMonitorInfo.url = jSONObject.optString("url");
        if (splashMonitorInfo.url == JSONObject.NULL) {
            splashMonitorInfo.url = "";
        }
        splashMonitorInfo.creativeId = jSONObject.optLong("creative_id");
        splashMonitorInfo.materialType = jSONObject.optInt("material_type");
        splashMonitorInfo.totalCount = jSONObject.optInt("total_count");
        splashMonitorInfo.creativeIds = new ArrayList();
        JSONArray optJSONArray2 = jSONObject.optJSONArray("creative_ids");
        if (optJSONArray2 != null) {
            for (int i2 = 0; i2 < optJSONArray2.length(); i2++) {
                splashMonitorInfo.creativeIds.add((String) optJSONArray2.opt(i2));
            }
        }
        splashMonitorInfo.preloadIds = new ArrayList();
        JSONArray optJSONArray3 = jSONObject.optJSONArray("preload_ids");
        if (optJSONArray3 != null) {
            for (int i3 = 0; i3 < optJSONArray3.length(); i3++) {
                splashMonitorInfo.preloadIds.add((String) optJSONArray3.opt(i3));
            }
        }
        splashMonitorInfo.posId = jSONObject.optLong("pos_Id");
        splashMonitorInfo.viewSource = jSONObject.optInt("view_source");
        splashMonitorInfo.elementTypes = new ArrayList();
        JSONArray optJSONArray4 = jSONObject.optJSONArray("element_types");
        if (optJSONArray4 != null) {
            for (int i4 = 0; i4 < optJSONArray4.length(); i4++) {
                splashMonitorInfo.elementTypes.add((Integer) optJSONArray4.opt(i4));
            }
        }
        splashMonitorInfo.interactiveStyle = jSONObject.optString("interactive_style");
        if (splashMonitorInfo.interactiveStyle == JSONObject.NULL) {
            splashMonitorInfo.interactiveStyle = "";
        }
        splashMonitorInfo.interactivityDefaultStyle = jSONObject.optString("interactivity_default_style");
        if (splashMonitorInfo.interactivityDefaultStyle == JSONObject.NULL) {
            splashMonitorInfo.interactivityDefaultStyle = "";
        }
        splashMonitorInfo.showEndTime = jSONObject.optLong("show_end_time");
        splashMonitorInfo.isRotateComposeTimeout = jSONObject.optBoolean("is_rotate_compose_timeout");
        splashMonitorInfo.tkDefaultTimeout = jSONObject.optLong("tk_default_timeout");
        splashMonitorInfo.soSource = jSONObject.optInt("so_source");
        splashMonitorInfo.soLoadTime = jSONObject.optLong("so_load_time");
        splashMonitorInfo.offlineSource = jSONObject.optInt("offline_source");
        splashMonitorInfo.offlineLoadTime = jSONObject.optLong("offline_load_time");
        splashMonitorInfo.tkFileLoadTime = jSONObject.optLong("tk_file_load_time");
        splashMonitorInfo.tkInitTime = jSONObject.optLong("tk_init_time");
        splashMonitorInfo.tkRenderTime = jSONObject.optLong("tk_render_time");
        splashMonitorInfo.nativeLoadTime = jSONObject.optLong("native_load_time");
        splashMonitorInfo.isWebTimeout = jSONObject.optBoolean("is_web_timeout");
        splashMonitorInfo.webLoadTime = jSONObject.optLong("web_load_time");
        splashMonitorInfo.templateId = jSONObject.optString("template_id");
        if (splashMonitorInfo.templateId == JSONObject.NULL) {
            splashMonitorInfo.templateId = "";
        }
        splashMonitorInfo.templateVersionCode = jSONObject.optInt("template_version_code");
        splashMonitorInfo.tkTotalTime = jSONObject.optLong("tk_total_time");
    }

    /* renamed from: b  reason: avoid collision after fix types in other method */
    private static JSONObject b2(SplashMonitorInfo splashMonitorInfo, JSONObject jSONObject) {
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        if (splashMonitorInfo.status != 0) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "status", splashMonitorInfo.status);
        }
        if (splashMonitorInfo.type != 0) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "type", splashMonitorInfo.type);
        }
        if (splashMonitorInfo.preloadId != null && !splashMonitorInfo.preloadId.equals("")) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "preload_id", splashMonitorInfo.preloadId);
        }
        if (splashMonitorInfo.errorCode != 0) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "error_code", splashMonitorInfo.errorCode);
        }
        if (splashMonitorInfo.errorMsg != null && !splashMonitorInfo.errorMsg.equals("")) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "error_msg", splashMonitorInfo.errorMsg);
        }
        if (splashMonitorInfo.checkStatus != 0) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "check_status", splashMonitorInfo.checkStatus);
        }
        if (splashMonitorInfo.loadDataTime != 0) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "load_data_duration_ms", splashMonitorInfo.loadDataTime);
        }
        if (splashMonitorInfo.beforeLoadDataTime != 0) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "before_load_data_duration_ms", splashMonitorInfo.beforeLoadDataTime);
        }
        if (splashMonitorInfo.checkDataTime != 0) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "check_data_duration_ms", splashMonitorInfo.checkDataTime);
        }
        if (splashMonitorInfo.loadAndCheckDataTime != 0) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "load_and_check_data_duration_ms", splashMonitorInfo.loadAndCheckDataTime);
        }
        if (splashMonitorInfo.costTime != 0) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "duration_ms", splashMonitorInfo.costTime);
        }
        com.kwad.sdk.utils.t.putValue(jSONObject, "ids", splashMonitorInfo.ids);
        if (splashMonitorInfo.count != 0) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "count", splashMonitorInfo.count);
        }
        if (splashMonitorInfo.cacheValidTime != 0) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "validity_period_ms", splashMonitorInfo.cacheValidTime);
        }
        if (splashMonitorInfo.size != 0) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "size", splashMonitorInfo.size);
        }
        if (splashMonitorInfo.url != null && !splashMonitorInfo.url.equals("")) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "url", splashMonitorInfo.url);
        }
        if (splashMonitorInfo.creativeId != 0) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "creative_id", splashMonitorInfo.creativeId);
        }
        if (splashMonitorInfo.materialType != 0) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "material_type", splashMonitorInfo.materialType);
        }
        if (splashMonitorInfo.totalCount != 0) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "total_count", splashMonitorInfo.totalCount);
        }
        com.kwad.sdk.utils.t.putValue(jSONObject, "creative_ids", splashMonitorInfo.creativeIds);
        com.kwad.sdk.utils.t.putValue(jSONObject, "preload_ids", splashMonitorInfo.preloadIds);
        if (splashMonitorInfo.posId != 0) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "pos_Id", splashMonitorInfo.posId);
        }
        if (splashMonitorInfo.viewSource != 0) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "view_source", splashMonitorInfo.viewSource);
        }
        com.kwad.sdk.utils.t.putValue(jSONObject, "element_types", splashMonitorInfo.elementTypes);
        if (splashMonitorInfo.interactiveStyle != null && !splashMonitorInfo.interactiveStyle.equals("")) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "interactive_style", splashMonitorInfo.interactiveStyle);
        }
        if (splashMonitorInfo.interactivityDefaultStyle != null && !splashMonitorInfo.interactivityDefaultStyle.equals("")) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "interactivity_default_style", splashMonitorInfo.interactivityDefaultStyle);
        }
        if (splashMonitorInfo.showEndTime != 0) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "show_end_time", splashMonitorInfo.showEndTime);
        }
        if (splashMonitorInfo.isRotateComposeTimeout) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "is_rotate_compose_timeout", splashMonitorInfo.isRotateComposeTimeout);
        }
        if (splashMonitorInfo.tkDefaultTimeout != 0) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "tk_default_timeout", splashMonitorInfo.tkDefaultTimeout);
        }
        if (splashMonitorInfo.soSource != 0) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "so_source", splashMonitorInfo.soSource);
        }
        if (splashMonitorInfo.soLoadTime != 0) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "so_load_time", splashMonitorInfo.soLoadTime);
        }
        if (splashMonitorInfo.offlineSource != 0) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "offline_source", splashMonitorInfo.offlineSource);
        }
        if (splashMonitorInfo.offlineLoadTime != 0) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "offline_load_time", splashMonitorInfo.offlineLoadTime);
        }
        if (splashMonitorInfo.tkFileLoadTime != 0) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "tk_file_load_time", splashMonitorInfo.tkFileLoadTime);
        }
        if (splashMonitorInfo.tkInitTime != 0) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "tk_init_time", splashMonitorInfo.tkInitTime);
        }
        if (splashMonitorInfo.tkRenderTime != 0) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "tk_render_time", splashMonitorInfo.tkRenderTime);
        }
        if (splashMonitorInfo.nativeLoadTime != 0) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "native_load_time", splashMonitorInfo.nativeLoadTime);
        }
        if (splashMonitorInfo.isWebTimeout) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "is_web_timeout", splashMonitorInfo.isWebTimeout);
        }
        if (splashMonitorInfo.webLoadTime != 0) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "web_load_time", splashMonitorInfo.webLoadTime);
        }
        if (splashMonitorInfo.templateId != null && !splashMonitorInfo.templateId.equals("")) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "template_id", splashMonitorInfo.templateId);
        }
        if (splashMonitorInfo.templateVersionCode != 0) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "template_version_code", splashMonitorInfo.templateVersionCode);
        }
        if (splashMonitorInfo.tkTotalTime != 0) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "tk_total_time", splashMonitorInfo.tkTotalTime);
        }
        return jSONObject;
    }

    @Override // com.kwad.sdk.core.d
    public final /* bridge */ /* synthetic */ void a(SplashMonitorInfo splashMonitorInfo, JSONObject jSONObject) {
        a2(splashMonitorInfo, jSONObject);
    }

    @Override // com.kwad.sdk.core.d
    public final /* bridge */ /* synthetic */ JSONObject b(SplashMonitorInfo splashMonitorInfo, JSONObject jSONObject) {
        return b2(splashMonitorInfo, jSONObject);
    }
}
