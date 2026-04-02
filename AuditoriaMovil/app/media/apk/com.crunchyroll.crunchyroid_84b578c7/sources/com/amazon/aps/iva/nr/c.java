package com.amazon.aps.iva.nr;

import com.amazon.aps.iva.aq.k;
import com.amazon.aps.iva.lb0.o;
import com.amazon.aps.iva.mp.a;
import com.amazon.aps.iva.qr.a;
import com.amazon.aps.iva.sp.h;
import com.amazon.aps.iva.yb0.j;
import com.google.android.gms.common.Scopes;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.google.gson.JsonPrimitive;
import java.util.Date;
import java.util.LinkedHashMap;
import java.util.Map;
/* compiled from: SpanEventSerializer.kt */
/* loaded from: classes2.dex */
public final class c implements h<com.amazon.aps.iva.qr.a> {
    public final String b;
    public final com.amazon.aps.iva.mp.a c;

    public c(String str) {
        com.amazon.aps.iva.mp.b bVar = new com.amazon.aps.iva.mp.b();
        j.f(str, "envName");
        this.b = str;
        this.c = bVar;
    }

    @Override // com.amazon.aps.iva.sp.h
    public final String serialize(com.amazon.aps.iva.qr.a aVar) {
        boolean z;
        String str;
        com.amazon.aps.iva.qr.a aVar2 = aVar;
        j.f(aVar2, "model");
        a.c cVar = aVar2.k;
        a.i iVar = cVar.e;
        Map a = a.C0519a.a(this.c, iVar.d, "meta.usr", null, null, 12);
        LinkedHashMap linkedHashMap = new LinkedHashMap(k.w(a.size()));
        for (Map.Entry entry : a.entrySet()) {
            Object key = entry.getKey();
            Object value = entry.getValue();
            if (j.a(value, com.amazon.aps.iva.dq.a.a) || value == null) {
                str = null;
            } else if (value instanceof Date) {
                str = String.valueOf(((Date) value).getTime());
            } else if (value instanceof JsonPrimitive) {
                str = ((JsonPrimitive) value).getAsString();
            } else {
                str = value.toString();
            }
            linkedHashMap.put(key, str);
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        for (Map.Entry entry2 : linkedHashMap.entrySet()) {
            if (((String) entry2.getValue()) != null) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                linkedHashMap2.put(entry2.getKey(), entry2.getValue());
            }
        }
        com.amazon.aps.iva.mp.a aVar3 = this.c;
        a.d dVar = aVar2.j;
        Map a2 = a.C0519a.a(aVar3, dVar.b, "metrics", null, null, 12);
        j.f(a2, "additionalProperties");
        String str2 = cVar.a;
        j.f(str2, "version");
        a.b bVar = cVar.b;
        j.f(bVar, "dd");
        j.f(cVar.c, "span");
        a.h hVar = cVar.d;
        j.f(hVar, "tracer");
        a.e eVar = cVar.f;
        j.f(eVar, "network");
        Map<String, String> map = cVar.g;
        j.f(map, "additionalProperties");
        String str3 = aVar2.a;
        j.f(str3, "traceId");
        String str4 = aVar2.b;
        j.f(str4, "spanId");
        String str5 = aVar2.c;
        j.f(str5, "parentId");
        String str6 = aVar2.d;
        j.f(str6, "resource");
        String str7 = aVar2.e;
        j.f(str7, AppMeasurementSdk.ConditionalUserProperty.NAME);
        String str8 = aVar2.f;
        j.f(str8, "service");
        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty("trace_id", str3);
        jsonObject.addProperty("span_id", str4);
        jsonObject.addProperty("parent_id", str5);
        jsonObject.addProperty("resource", str6);
        jsonObject.addProperty(AppMeasurementSdk.ConditionalUserProperty.NAME, str7);
        jsonObject.addProperty("service", str8);
        jsonObject.addProperty("duration", Long.valueOf(aVar2.g));
        jsonObject.addProperty("start", Long.valueOf(aVar2.h));
        jsonObject.addProperty("error", Long.valueOf(aVar2.i));
        jsonObject.addProperty("type", "custom");
        JsonObject jsonObject2 = new JsonObject();
        Long l = dVar.a;
        if (l != null) {
            jsonObject2.addProperty("_top_level", Long.valueOf(l.longValue()));
        }
        for (Map.Entry entry3 : a2.entrySet()) {
            String str9 = (String) entry3.getKey();
            Number number = (Number) entry3.getValue();
            if (!o.N(a.d.c, str9)) {
                jsonObject2.addProperty(str9, number);
            }
        }
        jsonObject.add("metrics", jsonObject2);
        JsonObject jsonObject3 = new JsonObject();
        jsonObject3.addProperty("version", str2);
        JsonObject jsonObject4 = new JsonObject();
        String str10 = bVar.a;
        if (str10 != null) {
            jsonObject4.addProperty(FirebaseAnalytics.Param.SOURCE, str10);
        }
        jsonObject3.add("_dd", jsonObject4);
        JsonObject jsonObject5 = new JsonObject();
        jsonObject5.addProperty("kind", "client");
        jsonObject3.add("span", jsonObject5);
        JsonObject jsonObject6 = new JsonObject();
        jsonObject6.addProperty("version", hVar.a);
        jsonObject3.add("tracer", jsonObject6);
        JsonObject jsonObject7 = new JsonObject();
        String str11 = iVar.a;
        if (str11 != null) {
            jsonObject7.addProperty("id", str11);
        }
        String str12 = iVar.b;
        if (str12 != null) {
            jsonObject7.addProperty(AppMeasurementSdk.ConditionalUserProperty.NAME, str12);
        }
        String str13 = iVar.c;
        if (str13 != null) {
            jsonObject7.addProperty(Scopes.EMAIL, str13);
        }
        for (Map.Entry entry4 : linkedHashMap2.entrySet()) {
            String str14 = (String) entry4.getKey();
            Object value2 = entry4.getValue();
            if (!o.N(a.i.e, str14)) {
                jsonObject7.add(str14, i.I(value2));
            }
        }
        jsonObject3.add("usr", jsonObject7);
        JsonObject jsonObject8 = new JsonObject();
        a.C0654a c0654a = eVar.a;
        c0654a.getClass();
        JsonObject jsonObject9 = new JsonObject();
        a.f fVar = c0654a.a;
        if (fVar != null) {
            JsonObject jsonObject10 = new JsonObject();
            String str15 = fVar.a;
            if (str15 != null) {
                jsonObject10.addProperty("id", str15);
            }
            String str16 = fVar.b;
            if (str16 != null) {
                jsonObject10.addProperty(AppMeasurementSdk.ConditionalUserProperty.NAME, str16);
            }
            jsonObject9.add("sim_carrier", jsonObject10);
        }
        String str17 = c0654a.b;
        if (str17 != null) {
            jsonObject9.addProperty("signal_strength", str17);
        }
        String str18 = c0654a.c;
        if (str18 != null) {
            jsonObject9.addProperty("downlink_kbps", str18);
        }
        String str19 = c0654a.d;
        if (str19 != null) {
            jsonObject9.addProperty("uplink_kbps", str19);
        }
        jsonObject9.addProperty("connectivity", c0654a.e);
        jsonObject8.add("client", jsonObject9);
        jsonObject3.add("network", jsonObject8);
        for (Map.Entry<String, String> entry5 : map.entrySet()) {
            String key2 = entry5.getKey();
            String value3 = entry5.getValue();
            if (!o.N(a.c.h, key2)) {
                jsonObject3.addProperty(key2, value3);
            }
        }
        jsonObject.add("meta", jsonObject3);
        JsonArray jsonArray = new JsonArray(1);
        jsonArray.add(jsonObject);
        JsonObject jsonObject11 = new JsonObject();
        jsonObject11.add("spans", jsonArray);
        jsonObject11.addProperty("env", this.b);
        String jsonElement = jsonObject11.toString();
        j.e(jsonElement, "jsonObject.toString()");
        return jsonElement;
    }
}
