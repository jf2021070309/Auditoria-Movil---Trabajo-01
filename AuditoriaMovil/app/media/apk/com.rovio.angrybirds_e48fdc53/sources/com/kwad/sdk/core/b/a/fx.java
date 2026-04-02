package com.kwad.sdk.core.b.a;

import com.ss.android.socialbase.downloader.constants.MonitorConstants;
import org.json.JSONObject;
/* loaded from: classes.dex */
public final class fx implements com.kwad.sdk.core.d<com.kwad.sdk.core.network.k> {
    /* renamed from: a  reason: avoid collision after fix types in other method */
    private static void a2(com.kwad.sdk.core.network.k kVar, JSONObject jSONObject) {
        if (jSONObject == null) {
            return;
        }
        kVar.apq = jSONObject.optLong("request_prepare_cost");
        kVar.apr = jSONObject.optLong("request_add_params_cost");
        kVar.aps = jSONObject.optLong("request_create_cost");
        kVar.apt = jSONObject.optInt("keep_alive");
        kVar.apu = jSONObject.optLong("dns_start");
        kVar.apv = jSONObject.optLong("dns_cost");
        kVar.apw = jSONObject.optLong("connect_establish_start");
        kVar.apx = jSONObject.optLong("connect_establish_cost");
        kVar.apy = jSONObject.optLong("request_start");
        kVar.apz = jSONObject.optLong("request_cost");
        kVar.apA = jSONObject.optLong("request_size");
        kVar.apB = jSONObject.optLong("response_start");
        kVar.apC = jSONObject.optLong("response_cost");
        kVar.apD = jSONObject.optLong("response_parse_cost");
        kVar.apE = jSONObject.optLong("response_size");
        kVar.apF = jSONObject.optLong("waiting_response_cost");
        kVar.apG = jSONObject.optLong("total_cost");
        kVar.apH = jSONObject.optInt("proxy_used");
        kVar.apI = jSONObject.optString("request_id");
        if (kVar.apI == JSONObject.NULL) {
            kVar.apI = "";
        }
        kVar.apJ = jSONObject.optInt("has_data_v2");
        kVar.result = jSONObject.optInt("result");
        kVar.apK = jSONObject.optLong("response_done_cost");
        kVar.apL = jSONObject.optString(MonitorConstants.HOST_IP);
        if (kVar.apL == JSONObject.NULL) {
            kVar.apL = "";
        }
        kVar.apM = jSONObject.optInt("ip_type");
        kVar.apN = jSONObject.optInt("recommend_ping_time");
        kVar.apO = jSONObject.optInt("backup_ping_time");
        kVar.apP = jSONObject.optInt("other_ping_time");
    }

    /* renamed from: b  reason: avoid collision after fix types in other method */
    private static JSONObject b2(com.kwad.sdk.core.network.k kVar, JSONObject jSONObject) {
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        if (kVar.apq != 0) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "request_prepare_cost", kVar.apq);
        }
        if (kVar.apr != 0) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "request_add_params_cost", kVar.apr);
        }
        if (kVar.aps != 0) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "request_create_cost", kVar.aps);
        }
        if (kVar.apt != 0) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "keep_alive", kVar.apt);
        }
        if (kVar.apu != 0) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "dns_start", kVar.apu);
        }
        if (kVar.apv != 0) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "dns_cost", kVar.apv);
        }
        if (kVar.apw != 0) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "connect_establish_start", kVar.apw);
        }
        if (kVar.apx != 0) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "connect_establish_cost", kVar.apx);
        }
        if (kVar.apy != 0) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "request_start", kVar.apy);
        }
        if (kVar.apz != 0) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "request_cost", kVar.apz);
        }
        if (kVar.apA != 0) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "request_size", kVar.apA);
        }
        if (kVar.apB != 0) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "response_start", kVar.apB);
        }
        if (kVar.apC != 0) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "response_cost", kVar.apC);
        }
        if (kVar.apD != 0) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "response_parse_cost", kVar.apD);
        }
        if (kVar.apE != 0) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "response_size", kVar.apE);
        }
        if (kVar.apF != 0) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "waiting_response_cost", kVar.apF);
        }
        if (kVar.apG != 0) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "total_cost", kVar.apG);
        }
        if (kVar.apH != 0) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "proxy_used", kVar.apH);
        }
        if (kVar.apI != null && !kVar.apI.equals("")) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "request_id", kVar.apI);
        }
        if (kVar.apJ != 0) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "has_data_v2", kVar.apJ);
        }
        if (kVar.result != 0) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "result", kVar.result);
        }
        if (kVar.apK != 0) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "response_done_cost", kVar.apK);
        }
        if (kVar.apL != null && !kVar.apL.equals("")) {
            com.kwad.sdk.utils.t.putValue(jSONObject, MonitorConstants.HOST_IP, kVar.apL);
        }
        if (kVar.apM != 0) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "ip_type", kVar.apM);
        }
        if (kVar.apN != 0) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "recommend_ping_time", kVar.apN);
        }
        if (kVar.apO != 0) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "backup_ping_time", kVar.apO);
        }
        if (kVar.apP != 0) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "other_ping_time", kVar.apP);
        }
        return jSONObject;
    }

    @Override // com.kwad.sdk.core.d
    public final /* bridge */ /* synthetic */ void a(com.kwad.sdk.core.network.k kVar, JSONObject jSONObject) {
        a2(kVar, jSONObject);
    }

    @Override // com.kwad.sdk.core.d
    public final /* bridge */ /* synthetic */ JSONObject b(com.kwad.sdk.core.network.k kVar, JSONObject jSONObject) {
        return b2(kVar, jSONObject);
    }
}
