package com.flurry.sdk;

import android.text.TextUtils;
import bolts.MeasurementEvent;
import com.ss.android.socialbase.downloader.setting.DownloadSettingKeys;
import com.umeng.analytics.pro.d;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: classes2.dex */
public class ja implements li<ia> {
    private static final String a = ja.class.getSimpleName();

    @Override // com.flurry.sdk.li
    public final /* synthetic */ ia a(InputStream inputStream) {
        return b(inputStream);
    }

    private static ia b(InputStream inputStream) {
        if (inputStream == null) {
            return null;
        }
        String str = new String(ma.a(inputStream));
        ko.a(5, a, "Proton response string: " + str);
        ia iaVar = new ia();
        try {
            JSONObject jSONObject = new JSONObject(str);
            iaVar.a = jSONObject.optLong("issued_at", -1L);
            iaVar.b = jSONObject.optLong("refresh_ttl", 3600L);
            iaVar.c = jSONObject.optLong("expiration_ttl", 86400L);
            JSONObject optJSONObject = jSONObject.optJSONObject("global_settings");
            iaVar.d = new ih();
            if (optJSONObject != null) {
                iaVar.d.a = a(optJSONObject.optString("log_level"));
            }
            JSONObject optJSONObject2 = jSONObject.optJSONObject("pulse");
            hy hyVar = new hy();
            if (optJSONObject2 != null) {
                a(hyVar, optJSONObject2.optJSONArray("callbacks"));
                hyVar.b = optJSONObject2.optInt("max_callback_retries", 3);
                hyVar.c = optJSONObject2.optInt("max_callback_attempts_per_report", 15);
                hyVar.d = optJSONObject2.optInt("max_report_delay_seconds", 600);
                hyVar.e = optJSONObject2.optString("agent_report_url", "");
            }
            iaVar.e = hyVar;
            JSONObject optJSONObject3 = jSONObject.optJSONObject("analytics");
            iaVar.f = new ik();
            if (optJSONObject3 == null) {
                return iaVar;
            }
            iaVar.f.b = optJSONObject3.optBoolean("analytics_enabled", true);
            iaVar.f.a = optJSONObject3.optInt("max_session_properties", 10);
            return iaVar;
        } catch (JSONException e) {
            throw new IOException("Exception while deserialize: ", e);
        }
    }

    private static ii a(String str) {
        ii iiVar = ii.OFF;
        try {
            if (!TextUtils.isEmpty(str)) {
                return (ii) Enum.valueOf(ii.class, str);
            }
        } catch (Exception e) {
        }
        return iiVar;
    }

    private static void a(hy hyVar, JSONArray jSONArray) {
        JSONObject optJSONObject;
        if (jSONArray != null) {
            ArrayList arrayList = new ArrayList();
            for (int i = 0; i < jSONArray.length(); i++) {
                JSONObject optJSONObject2 = jSONArray.optJSONObject(i);
                if (optJSONObject2 != null) {
                    hx hxVar = new hx();
                    hxVar.b = optJSONObject2.optString("partner", "");
                    a(hxVar, optJSONObject2.optJSONArray(d.ar));
                    hxVar.d = b(optJSONObject2.optString("method"));
                    hxVar.e = optJSONObject2.optString("uri_template", "");
                    JSONObject optJSONObject3 = optJSONObject2.optJSONObject("body_template");
                    if (optJSONObject3 != null) {
                        String optString = optJSONObject3.optString("string", "null");
                        if (!optString.equals("null")) {
                            hxVar.f = optString;
                        }
                    }
                    hxVar.g = optJSONObject2.optInt("max_redirects", 5);
                    hxVar.h = optJSONObject2.optInt(DownloadSettingKeys.SegmentConfig.CONNECT_TIMEOUT, 20);
                    hxVar.i = optJSONObject2.optInt("request_timeout", 20);
                    hxVar.a = optJSONObject2.optLong("callback_id", -1L);
                    JSONObject optJSONObject4 = optJSONObject2.optJSONObject("headers");
                    if (optJSONObject4 != null && (optJSONObject = optJSONObject4.optJSONObject("map")) != null) {
                        hxVar.j = mb.a(optJSONObject);
                    }
                    arrayList.add(hxVar);
                }
            }
            hyVar.a = arrayList;
        }
    }

    private static void a(hx hxVar, JSONArray jSONArray) {
        String[] strArr;
        if (jSONArray != null) {
            ArrayList arrayList = null;
            for (int i = 0; i < jSONArray.length(); i++) {
                JSONObject optJSONObject = jSONArray.optJSONObject(i);
                if (optJSONObject != null) {
                    if (optJSONObject.has("string")) {
                        if (arrayList == null) {
                            arrayList = new ArrayList();
                        }
                        id idVar = new id();
                        idVar.a = optJSONObject.optString("string", "");
                        arrayList.add(idVar);
                    } else if (optJSONObject.has("com.flurry.proton.generated.avro.v2.EventParameterCallbackTrigger")) {
                        if (arrayList == null) {
                            arrayList = new ArrayList();
                        }
                        JSONObject optJSONObject2 = optJSONObject.optJSONObject("com.flurry.proton.generated.avro.v2.EventParameterCallbackTrigger");
                        if (optJSONObject2 != null) {
                            ie ieVar = new ie();
                            ieVar.a = optJSONObject2.optString(MeasurementEvent.MEASUREMENT_EVENT_NAME_KEY, "");
                            ieVar.c = optJSONObject2.optString("event_parameter_name", "");
                            JSONArray optJSONArray = optJSONObject2.optJSONArray("event_parameter_values");
                            if (optJSONArray != null) {
                                String[] strArr2 = new String[optJSONArray.length()];
                                for (int i2 = 0; i2 < optJSONArray.length(); i2++) {
                                    strArr2[i2] = optJSONArray.optString(i2, "");
                                }
                                strArr = strArr2;
                            } else {
                                strArr = new String[0];
                            }
                            ieVar.d = strArr;
                            arrayList.add(ieVar);
                        }
                    }
                }
            }
            hxVar.c = arrayList;
        }
    }

    private static ix b(String str) {
        ix ixVar = ix.GET;
        try {
            if (!TextUtils.isEmpty(str)) {
                return (ix) Enum.valueOf(ix.class, str);
            }
        } catch (Exception e) {
        }
        return ixVar;
    }

    @Override // com.flurry.sdk.li
    public final /* synthetic */ void a(OutputStream outputStream, ia iaVar) {
        throw new IOException("Serialize not supported for response");
    }
}
