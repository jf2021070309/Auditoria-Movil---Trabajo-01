package com.amazon.aps.iva.ya;

import android.os.SystemClock;
import com.amazon.aps.iva.SimidCreativeParser;
import com.amazon.aps.iva.a9.w;
import com.amazon.aps.iva.metrics.types.MetricEvent;
import com.amazon.aps.iva.metrics.types.Severity;
import com.amazon.aps.iva.types.CreativeData;
import com.amazon.aps.iva.types.SimidCreative;
import com.amazon.aps.iva.util.LogUtils;
import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonSyntaxException;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
/* compiled from: SimidCreativeJsonParser.java */
/* loaded from: classes.dex */
public final class a implements SimidCreativeParser {
    public final com.amazon.aps.iva.xa.b c;
    public final LinkedHashMap b = new LinkedHashMap();
    public final Gson a = w.c().b();

    public a(com.amazon.aps.iva.xa.b bVar) {
        this.c = bVar;
    }

    public static boolean b(JsonObject jsonObject, String str) {
        if (jsonObject != null && jsonObject.has(str) && jsonObject.get(str) != null && !com.amazon.aps.iva.e.w.f(jsonObject.get(str).getAsString())) {
            return true;
        }
        return false;
    }

    public final void a(SimidCreative simidCreative) {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        JsonObject jsonObject;
        JsonObject jsonObject2;
        String str7;
        String str8;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        String pubProvidedAdId = simidCreative.getPubProvidedAdId();
        String simidCreativeData = simidCreative.getSimidCreativeData();
        String str9 = null;
        if (!com.amazon.aps.iva.e.w.f(simidCreativeData)) {
            Gson gson = this.a;
            JsonObject jsonObject3 = (JsonObject) gson.fromJson(simidCreativeData, (Class<Object>) JsonObject.class);
            if (jsonObject3 != null) {
                if (jsonObject3.has("Identifiers")) {
                    jsonObject = jsonObject3.get("Identifiers").getAsJsonObject();
                } else {
                    jsonObject = null;
                }
                if (jsonObject3.has("Shopping")) {
                    jsonObject2 = jsonObject3.get("Shopping").getAsJsonObject();
                } else if (jsonObject3.has("SendMeMore")) {
                    jsonObject2 = jsonObject3.get("SendMeMore").getAsJsonObject();
                } else {
                    jsonObject2 = null;
                }
                if (b(jsonObject, "AdId")) {
                    str7 = jsonObject.get("AdId").getAsString();
                } else {
                    str7 = null;
                }
                if (b(jsonObject2, "DestinationUrl")) {
                    str2 = jsonObject2.get("DestinationUrl").getAsString();
                } else {
                    str2 = null;
                }
                if (b(jsonObject, "BidId")) {
                    str4 = jsonObject.get("BidId").getAsString();
                } else {
                    str4 = null;
                }
                if (b(jsonObject, "CreativeId")) {
                    str5 = jsonObject.get("CreativeId").getAsString();
                } else {
                    str5 = null;
                }
                if (b(jsonObject, "ImpressionId")) {
                    str8 = jsonObject.get("ImpressionId").getAsString();
                } else {
                    str8 = null;
                }
                if (b(jsonObject3, "InteractiveCreativeFile")) {
                    str6 = jsonObject3.get("InteractiveCreativeFile").getAsString();
                } else {
                    str6 = null;
                }
                if (b(jsonObject3, "Error")) {
                    str9 = jsonObject3.get("Error").getAsString();
                }
                if (jsonObject3.has("InteractiveCreativeFile")) {
                    jsonObject3.remove("InteractiveCreativeFile");
                }
                if (jsonObject3.has("Error")) {
                    jsonObject3.remove("Error");
                }
                String str10 = str8;
                str = str9;
                str9 = str7;
                str3 = str10;
            } else {
                str = null;
                str2 = null;
                str3 = null;
                str4 = null;
                str5 = null;
                str6 = null;
            }
            simidCreativeData = gson.toJson((JsonElement) jsonObject3);
        } else {
            str = null;
            str2 = null;
            str3 = null;
            str4 = null;
            str5 = null;
            str6 = null;
        }
        boolean f = com.amazon.aps.iva.e.w.f(simidCreativeData);
        com.amazon.aps.iva.xa.b bVar = this.c;
        if (!f && !com.amazon.aps.iva.e.w.f(str9) && !com.amazon.aps.iva.e.w.f(str2) && !com.amazon.aps.iva.e.w.f(str5) && !com.amazon.aps.iva.e.w.f(str4) && !com.amazon.aps.iva.e.w.f(str6) && !com.amazon.aps.iva.e.w.f(str) && !com.amazon.aps.iva.e.w.f(str3)) {
            this.b.put(pubProvidedAdId, CreativeData.builder(simidCreativeData.replace("\"", "\\\"")).adId(str9).clickThruUri(str2).creativeId(str5).adServingId(str4).impressionId(str3).creativeUrl(str6).errorUrl(str).build());
            bVar.a(new MetricEvent("apsIva-jsonParserTimer", SystemClock.elapsedRealtime() - elapsedRealtime));
            return;
        }
        LogUtils.e("a", "Error Initializing CreativeData: invalid parameter(s)");
        bVar.a(new MetricEvent("apsIva-jsonParserInvalidCreativeDataCounter", Severity.ERROR));
    }

    @Override // com.amazon.aps.iva.SimidCreativeParser
    public final Map<String, CreativeData> parse(List<SimidCreative> list) {
        com.amazon.aps.iva.xa.b bVar = this.c;
        LinkedHashMap linkedHashMap = this.b;
        if (list != null) {
            try {
                if (list.size() != 0) {
                    long elapsedRealtime = SystemClock.elapsedRealtime();
                    for (SimidCreative simidCreative : list) {
                        String pubProvidedAdId = simidCreative.getPubProvidedAdId();
                        if (!com.amazon.aps.iva.e.w.f(pubProvidedAdId) && !linkedHashMap.containsKey(pubProvidedAdId)) {
                            a(simidCreative);
                        }
                        LogUtils.d("a", "Empty or repeated PubProvidedAdId");
                    }
                    bVar.a(new MetricEvent("apsIva-jsonListParserTimer", SystemClock.elapsedRealtime() - elapsedRealtime));
                }
            } catch (JsonSyntaxException e) {
                LogUtils.e("a", String.format("Error Parsing Ad Extension Data Invalid Json: %s", e.getMessage()));
                bVar.a(new MetricEvent("apsIva-parserJsonSyntaxExceptionCounter", Severity.ERROR));
            }
        }
        return linkedHashMap;
    }
}
