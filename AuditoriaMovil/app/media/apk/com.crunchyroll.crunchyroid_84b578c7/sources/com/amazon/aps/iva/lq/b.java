package com.amazon.aps.iva.lq;

import com.amazon.aps.iva.lb0.o;
import com.amazon.aps.iva.lb0.x;
import com.amazon.aps.iva.mp.a;
import com.amazon.aps.iva.oe0.m;
import com.amazon.aps.iva.oe0.q;
import com.amazon.aps.iva.pq.a;
import com.amazon.aps.iva.sp.h;
import com.amazon.aps.iva.yb0.j;
import com.google.android.gms.common.Scopes;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.gson.JsonObject;
import java.util.LinkedHashMap;
import java.util.Map;
/* compiled from: LogEventSerializer.kt */
/* loaded from: classes2.dex */
public final class b implements h<com.amazon.aps.iva.pq.a> {
    public final com.amazon.aps.iva.mp.a b = new com.amazon.aps.iva.mp.b();

    @Override // com.amazon.aps.iva.sp.h
    public final String serialize(com.amazon.aps.iva.pq.a aVar) {
        a.g gVar;
        com.amazon.aps.iva.pq.a aVar2 = aVar;
        j.f(aVar2, "model");
        String B0 = x.B0(this.b.b(q.E0(aVar2.i, new String[]{","})), ",", null, null, null, 62);
        Map a = a.C0519a.a(this.b, aVar2.j, null, null, null, 14);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : a.entrySet()) {
            if (!m.b0((String) entry.getKey())) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        a.g gVar2 = aVar2.f;
        if (gVar2 == null) {
            gVar = null;
        } else {
            Map a2 = a.C0519a.a(this.b, gVar2.d, "usr", "user extra information", null, 8);
            j.f(a2, "additionalProperties");
            gVar = new a.g(gVar2.a, gVar2.b, gVar2.c, a2);
        }
        a.f fVar = aVar2.a;
        j.f(fVar, "status");
        String str = aVar2.b;
        j.f(str, "service");
        String str2 = aVar2.c;
        j.f(str2, "message");
        String str3 = aVar2.d;
        j.f(str3, "date");
        a.c cVar = aVar2.e;
        j.f(cVar, "logger");
        JsonObject jsonObject = new JsonObject();
        jsonObject.add("status", fVar.toJson());
        jsonObject.addProperty("service", str);
        jsonObject.addProperty("message", str2);
        jsonObject.addProperty("date", str3);
        JsonObject jsonObject2 = new JsonObject();
        jsonObject2.addProperty(AppMeasurementSdk.ConditionalUserProperty.NAME, cVar.a);
        String str4 = cVar.b;
        if (str4 != null) {
            jsonObject2.addProperty("thread_name", str4);
        }
        jsonObject2.addProperty("version", cVar.c);
        jsonObject.add("logger", jsonObject2);
        if (gVar != null) {
            JsonObject jsonObject3 = new JsonObject();
            String str5 = gVar.a;
            if (str5 != null) {
                jsonObject3.addProperty("id", str5);
            }
            String str6 = gVar.b;
            if (str6 != null) {
                jsonObject3.addProperty(AppMeasurementSdk.ConditionalUserProperty.NAME, str6);
            }
            String str7 = gVar.c;
            if (str7 != null) {
                jsonObject3.addProperty(Scopes.EMAIL, str7);
            }
            for (Map.Entry<String, Object> entry2 : gVar.d.entrySet()) {
                String key = entry2.getKey();
                Object value = entry2.getValue();
                if (!o.N(a.g.e, key)) {
                    jsonObject3.add(key, i.I(value));
                }
            }
            jsonObject.add("usr", jsonObject3);
        }
        a.d dVar = aVar2.g;
        if (dVar != null) {
            JsonObject jsonObject4 = new JsonObject();
            a.C0625a c0625a = dVar.a;
            c0625a.getClass();
            JsonObject jsonObject5 = new JsonObject();
            a.e eVar = c0625a.a;
            if (eVar != null) {
                JsonObject jsonObject6 = new JsonObject();
                String str8 = eVar.a;
                if (str8 != null) {
                    jsonObject6.addProperty("id", str8);
                }
                String str9 = eVar.b;
                if (str9 != null) {
                    jsonObject6.addProperty(AppMeasurementSdk.ConditionalUserProperty.NAME, str9);
                }
                jsonObject5.add("sim_carrier", jsonObject6);
            }
            String str10 = c0625a.b;
            if (str10 != null) {
                jsonObject5.addProperty("signal_strength", str10);
            }
            String str11 = c0625a.c;
            if (str11 != null) {
                jsonObject5.addProperty("downlink_kbps", str11);
            }
            String str12 = c0625a.d;
            if (str12 != null) {
                jsonObject5.addProperty("uplink_kbps", str12);
            }
            jsonObject5.addProperty("connectivity", c0625a.e);
            jsonObject4.add("client", jsonObject5);
            jsonObject.add("network", jsonObject4);
        }
        a.b bVar = aVar2.h;
        if (bVar != null) {
            JsonObject jsonObject7 = new JsonObject();
            String str13 = bVar.a;
            if (str13 != null) {
                jsonObject7.addProperty("kind", str13);
            }
            String str14 = bVar.b;
            if (str14 != null) {
                jsonObject7.addProperty("message", str14);
            }
            String str15 = bVar.c;
            if (str15 != null) {
                jsonObject7.addProperty("stack", str15);
            }
            jsonObject.add("error", jsonObject7);
        }
        jsonObject.addProperty("ddtags", B0);
        for (Map.Entry entry3 : linkedHashMap.entrySet()) {
            String str16 = (String) entry3.getKey();
            Object value2 = entry3.getValue();
            if (!o.N(com.amazon.aps.iva.pq.a.k, str16)) {
                jsonObject.add(str16, i.I(value2));
            }
        }
        String jsonElement = jsonObject.toString();
        j.e(jsonElement, "sanitizeTagsAndAttribute…odel).toJson().toString()");
        return jsonElement;
    }
}
