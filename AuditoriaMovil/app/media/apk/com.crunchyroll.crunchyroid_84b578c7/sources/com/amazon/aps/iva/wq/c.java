package com.amazon.aps.iva.wq;

import com.amazon.aps.iva.e4.l1;
import com.amazon.aps.iva.fr.a;
import com.amazon.aps.iva.fr.b;
import com.amazon.aps.iva.fr.c;
import com.amazon.aps.iva.fr.d;
import com.amazon.aps.iva.fr.e;
import com.amazon.aps.iva.lb0.o;
import com.amazon.aps.iva.mp.a;
import com.amazon.aps.iva.sp.h;
import com.amazon.aps.iva.yb0.j;
import com.google.android.gms.common.Scopes;
import com.google.android.gms.common.internal.ImagesContract;
import com.google.android.gms.measurement.AppMeasurement;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
/* compiled from: RumEventSerializer.kt */
/* loaded from: classes2.dex */
public final class c implements h<Object> {
    public static final Set<String> c = l1.I("action.gesture.direction", "action.gesture.from_state", "action.gesture.to_state", "action.target.parent.resource_id", "action.target.parent.classname", "action.target.parent.index", "action.target.classname", "action.target.resource_id", "action.target.title", "error.resource.method", "error.resource.status_code", "error.resource.url");
    public static final Set<String> d = l1.I("_dd.timestamp", "_dd.error_type", "_dd.error.source_type", "_dd.error.is_crash");
    public static final Set<String> e = l1.I("_dd.timestamp", "_dd.error_type", "_dd.error.source_type", "_dd.error.is_crash");
    public final com.amazon.aps.iva.mp.a b = new com.amazon.aps.iva.mp.b();

    public static void a(JsonObject jsonObject) {
        if (jsonObject.has("context")) {
            JsonObject asJsonObject = jsonObject.getAsJsonObject("context");
            Set<Map.Entry<String, JsonElement>> entrySet = asJsonObject.entrySet();
            j.e(entrySet, "contextObject\n                .entrySet()");
            ArrayList arrayList = new ArrayList();
            for (Object obj : entrySet) {
                if (c.contains(((Map.Entry) obj).getKey())) {
                    arrayList.add(obj);
                }
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                asJsonObject.remove((String) entry.getKey());
                jsonObject.add((String) entry.getKey(), (JsonElement) entry.getValue());
            }
        }
    }

    public final String b(com.amazon.aps.iva.fr.a aVar) {
        a.y yVar;
        a.y yVar2 = aVar.g;
        a.i iVar = null;
        if (yVar2 == null) {
            yVar = null;
        } else {
            Map<String, Object> e2 = e(yVar2.d);
            j.f(e2, "additionalProperties");
            yVar = new a.y(yVar2.a, yVar2.b, yVar2.c, e2);
        }
        a.i iVar2 = aVar.n;
        if (iVar2 != null) {
            Map<String, Object> d2 = d(iVar2.a);
            j.f(d2, "additionalProperties");
            iVar = new a.i(d2);
        }
        a.e eVar = aVar.b;
        j.f(eVar, "application");
        a.b bVar = aVar.d;
        j.f(bVar, "session");
        a.z zVar = aVar.f;
        j.f(zVar, "view");
        a.k kVar = aVar.m;
        j.f(kVar, "dd");
        a.C0257a c0257a = aVar.o;
        j.f(c0257a, "action");
        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty("date", Long.valueOf(aVar.a));
        JsonObject jsonObject2 = new JsonObject();
        jsonObject2.addProperty("id", eVar.a);
        jsonObject.add("application", jsonObject2);
        String str = aVar.c;
        if (str != null) {
            jsonObject.addProperty("service", str);
        }
        JsonObject jsonObject3 = new JsonObject();
        jsonObject3.addProperty("id", bVar.a);
        jsonObject3.add("type", bVar.b.toJson());
        Boolean bool = bVar.c;
        if (bool != null) {
            jsonObject3.addProperty("has_replay", Boolean.valueOf(bool.booleanValue()));
        }
        jsonObject.add("session", jsonObject3);
        a.u uVar = aVar.e;
        if (uVar != null) {
            jsonObject.add(FirebaseAnalytics.Param.SOURCE, uVar.toJson());
        }
        JsonObject jsonObject4 = new JsonObject();
        jsonObject4.addProperty("id", zVar.a);
        String str2 = zVar.b;
        if (str2 != null) {
            jsonObject4.addProperty("referrer", str2);
        }
        jsonObject4.addProperty(ImagesContract.URL, zVar.c);
        String str3 = zVar.d;
        if (str3 != null) {
            jsonObject4.addProperty(AppMeasurementSdk.ConditionalUserProperty.NAME, str3);
        }
        Boolean bool2 = zVar.e;
        if (bool2 != null) {
            jsonObject4.addProperty("in_foreground", Boolean.valueOf(bool2.booleanValue()));
        }
        jsonObject.add("view", jsonObject4);
        if (yVar != null) {
            JsonObject jsonObject5 = new JsonObject();
            String str4 = yVar.a;
            if (str4 != null) {
                jsonObject5.addProperty("id", str4);
            }
            String str5 = yVar.b;
            if (str5 != null) {
                jsonObject5.addProperty(AppMeasurementSdk.ConditionalUserProperty.NAME, str5);
            }
            String str6 = yVar.c;
            if (str6 != null) {
                jsonObject5.addProperty(Scopes.EMAIL, str6);
            }
            for (Map.Entry<String, Object> entry : yVar.d.entrySet()) {
                String key = entry.getKey();
                Object value = entry.getValue();
                if (!o.N(a.y.e, key)) {
                    jsonObject5.add(key, i.I(value));
                }
            }
            jsonObject.add("usr", jsonObject5);
        }
        a.h hVar = aVar.h;
        if (hVar != null) {
            JsonObject jsonObject6 = new JsonObject();
            jsonObject6.add("status", hVar.a.toJson());
            List<a.p> list = hVar.b;
            JsonArray jsonArray = new JsonArray(list.size());
            for (a.p pVar : list) {
                jsonArray.add(pVar.toJson());
            }
            jsonObject6.add("interfaces", jsonArray);
            a.f fVar = hVar.c;
            if (fVar != null) {
                JsonObject jsonObject7 = new JsonObject();
                String str7 = fVar.a;
                if (str7 != null) {
                    jsonObject7.addProperty("technology", str7);
                }
                String str8 = fVar.b;
                if (str8 != null) {
                    jsonObject7.addProperty("carrier_name", str8);
                }
                jsonObject6.add("cellular", jsonObject7);
            }
            jsonObject.add("connectivity", jsonObject6);
        }
        a.w wVar = aVar.i;
        if (wVar != null) {
            JsonObject jsonObject8 = new JsonObject();
            jsonObject8.addProperty("test_id", wVar.a);
            jsonObject8.addProperty("result_id", wVar.b);
            Boolean bool3 = wVar.c;
            if (bool3 != null) {
                jsonObject8.addProperty("injected", Boolean.valueOf(bool3.booleanValue()));
            }
            jsonObject.add("synthetics", jsonObject8);
        }
        a.g gVar = aVar.j;
        if (gVar != null) {
            JsonObject jsonObject9 = new JsonObject();
            jsonObject9.addProperty("test_execution_id", gVar.a);
            jsonObject.add("ci_test", jsonObject9);
        }
        a.r rVar = aVar.k;
        if (rVar != null) {
            JsonObject jsonObject10 = new JsonObject();
            jsonObject10.addProperty(AppMeasurementSdk.ConditionalUserProperty.NAME, rVar.a);
            jsonObject10.addProperty("version", rVar.b);
            jsonObject10.addProperty("version_major", rVar.c);
            jsonObject.add("os", jsonObject10);
        }
        a.m mVar = aVar.l;
        if (mVar != null) {
            JsonObject jsonObject11 = new JsonObject();
            jsonObject11.add("type", mVar.a.toJson());
            String str9 = mVar.b;
            if (str9 != null) {
                jsonObject11.addProperty(AppMeasurementSdk.ConditionalUserProperty.NAME, str9);
            }
            String str10 = mVar.c;
            if (str10 != null) {
                jsonObject11.addProperty("model", str10);
            }
            String str11 = mVar.d;
            if (str11 != null) {
                jsonObject11.addProperty("brand", str11);
            }
            String str12 = mVar.e;
            if (str12 != null) {
                jsonObject11.addProperty("architecture", str12);
            }
            jsonObject.add("device", jsonObject11);
        }
        JsonObject jsonObject12 = new JsonObject();
        jsonObject12.addProperty("format_version", Long.valueOf(kVar.c));
        a.l lVar = kVar.a;
        if (lVar != null) {
            JsonObject jsonObject13 = new JsonObject();
            jsonObject13.add("plan", lVar.a.toJson());
            jsonObject12.add("session", jsonObject13);
        }
        String str13 = kVar.b;
        if (str13 != null) {
            jsonObject12.addProperty("browser_sdk_version", str13);
        }
        jsonObject.add("_dd", jsonObject12);
        if (iVar != null) {
            JsonObject jsonObject14 = new JsonObject();
            for (Map.Entry<String, Object> entry2 : iVar.a.entrySet()) {
                jsonObject14.add(entry2.getKey(), i.I(entry2.getValue()));
            }
            jsonObject.add("context", jsonObject14);
        }
        jsonObject.addProperty("type", "action");
        JsonObject jsonObject15 = new JsonObject();
        jsonObject15.add("type", c0257a.a.toJson());
        String str14 = c0257a.b;
        if (str14 != null) {
            jsonObject15.addProperty("id", str14);
        }
        Long l = c0257a.c;
        if (l != null) {
            jsonObject15.addProperty("loading_time", Long.valueOf(l.longValue()));
        }
        a.x xVar = c0257a.d;
        if (xVar != null) {
            JsonObject jsonObject16 = new JsonObject();
            jsonObject16.addProperty(AppMeasurementSdk.ConditionalUserProperty.NAME, xVar.a);
            jsonObject15.add("target", jsonObject16);
        }
        a.o oVar = c0257a.e;
        if (oVar != null) {
            JsonObject jsonObject17 = new JsonObject();
            jsonObject17.addProperty("count", Long.valueOf(oVar.a));
            jsonObject15.add("error", jsonObject17);
        }
        a.j jVar = c0257a.f;
        if (jVar != null) {
            JsonObject jsonObject18 = new JsonObject();
            jsonObject18.addProperty("count", Long.valueOf(jVar.a));
            jsonObject15.add(AppMeasurement.CRASH_ORIGIN, jsonObject18);
        }
        a.q qVar = c0257a.g;
        if (qVar != null) {
            JsonObject jsonObject19 = new JsonObject();
            jsonObject19.addProperty("count", Long.valueOf(qVar.a));
            jsonObject15.add("long_task", jsonObject19);
        }
        a.t tVar = c0257a.h;
        if (tVar != null) {
            JsonObject jsonObject20 = new JsonObject();
            jsonObject20.addProperty("count", Long.valueOf(tVar.a));
            jsonObject15.add("resource", jsonObject20);
        }
        jsonObject.add("action", jsonObject15);
        JsonObject asJsonObject = jsonObject.getAsJsonObject();
        j.e(asJsonObject, "sanitizedModel.toJson().asJsonObject");
        a(asJsonObject);
        String jsonElement = asJsonObject.toString();
        j.e(jsonElement, "extractKnownAttributes(s….asJsonObject).toString()");
        return jsonElement;
    }

    public final String c(com.amazon.aps.iva.fr.d dVar) {
        d.d0 d0Var;
        d.d0 d0Var2 = dVar.g;
        d.g gVar = null;
        if (d0Var2 == null) {
            d0Var = null;
        } else {
            Map<String, Object> e2 = e(d0Var2.d);
            j.f(e2, "additionalProperties");
            d0Var = new d.d0(d0Var2.a, d0Var2.b, d0Var2.c, e2);
        }
        d.g gVar2 = dVar.n;
        if (gVar2 != null) {
            Map<String, Object> d2 = d(gVar2.a);
            j.f(d2, "additionalProperties");
            gVar = new d.g(d2);
        }
        d.b bVar = dVar.b;
        j.f(bVar, "application");
        d.w wVar = dVar.d;
        j.f(wVar, "session");
        d.e0 e0Var = dVar.f;
        j.f(e0Var, "view");
        d.h hVar = dVar.m;
        j.f(hVar, "dd");
        d.v vVar = dVar.o;
        j.f(vVar, "resource");
        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty("date", Long.valueOf(dVar.a));
        JsonObject jsonObject2 = new JsonObject();
        jsonObject2.addProperty("id", bVar.a);
        jsonObject.add("application", jsonObject2);
        String str = dVar.c;
        if (str != null) {
            jsonObject.addProperty("service", str);
        }
        JsonObject jsonObject3 = new JsonObject();
        jsonObject3.addProperty("id", wVar.a);
        jsonObject3.add("type", wVar.b.toJson());
        Boolean bool = wVar.c;
        if (bool != null) {
            jsonObject3.addProperty("has_replay", Boolean.valueOf(bool.booleanValue()));
        }
        jsonObject.add("session", jsonObject3);
        d.z zVar = dVar.e;
        if (zVar != null) {
            jsonObject.add(FirebaseAnalytics.Param.SOURCE, zVar.toJson());
        }
        JsonObject jsonObject4 = new JsonObject();
        jsonObject4.addProperty("id", e0Var.a);
        String str2 = e0Var.b;
        if (str2 != null) {
            jsonObject4.addProperty("referrer", str2);
        }
        jsonObject4.addProperty(ImagesContract.URL, e0Var.c);
        String str3 = e0Var.d;
        if (str3 != null) {
            jsonObject4.addProperty(AppMeasurementSdk.ConditionalUserProperty.NAME, str3);
        }
        jsonObject.add("view", jsonObject4);
        if (d0Var != null) {
            JsonObject jsonObject5 = new JsonObject();
            String str4 = d0Var.a;
            if (str4 != null) {
                jsonObject5.addProperty("id", str4);
            }
            String str5 = d0Var.b;
            if (str5 != null) {
                jsonObject5.addProperty(AppMeasurementSdk.ConditionalUserProperty.NAME, str5);
            }
            String str6 = d0Var.c;
            if (str6 != null) {
                jsonObject5.addProperty(Scopes.EMAIL, str6);
            }
            for (Map.Entry<String, Object> entry : d0Var.d.entrySet()) {
                String key = entry.getKey();
                Object value = entry.getValue();
                if (!o.N(d.d0.e, key)) {
                    jsonObject5.add(key, i.I(value));
                }
            }
            jsonObject.add("usr", jsonObject5);
        }
        d.f fVar = dVar.h;
        if (fVar != null) {
            JsonObject jsonObject6 = new JsonObject();
            jsonObject6.add("status", fVar.a.toJson());
            List<d.o> list = fVar.b;
            JsonArray jsonArray = new JsonArray(list.size());
            for (d.o oVar : list) {
                jsonArray.add(oVar.toJson());
            }
            jsonObject6.add("interfaces", jsonArray);
            d.c cVar = fVar.c;
            if (cVar != null) {
                JsonObject jsonObject7 = new JsonObject();
                String str7 = cVar.a;
                if (str7 != null) {
                    jsonObject7.addProperty("technology", str7);
                }
                String str8 = cVar.b;
                if (str8 != null) {
                    jsonObject7.addProperty("carrier_name", str8);
                }
                jsonObject6.add("cellular", jsonObject7);
            }
            jsonObject.add("connectivity", jsonObject6);
        }
        d.c0 c0Var = dVar.i;
        if (c0Var != null) {
            JsonObject jsonObject8 = new JsonObject();
            jsonObject8.addProperty("test_id", c0Var.a);
            jsonObject8.addProperty("result_id", c0Var.b);
            Boolean bool2 = c0Var.c;
            if (bool2 != null) {
                jsonObject8.addProperty("injected", Boolean.valueOf(bool2.booleanValue()));
            }
            jsonObject.add("synthetics", jsonObject8);
        }
        d.C0278d c0278d = dVar.j;
        if (c0278d != null) {
            JsonObject jsonObject9 = new JsonObject();
            jsonObject9.addProperty("test_execution_id", c0278d.a);
            jsonObject.add("ci_test", jsonObject9);
        }
        d.q qVar = dVar.k;
        if (qVar != null) {
            JsonObject jsonObject10 = new JsonObject();
            jsonObject10.addProperty(AppMeasurementSdk.ConditionalUserProperty.NAME, qVar.a);
            jsonObject10.addProperty("version", qVar.b);
            jsonObject10.addProperty("version_major", qVar.c);
            jsonObject.add("os", jsonObject10);
        }
        d.j jVar = dVar.l;
        if (jVar != null) {
            JsonObject jsonObject11 = new JsonObject();
            jsonObject11.add("type", jVar.a.toJson());
            String str9 = jVar.b;
            if (str9 != null) {
                jsonObject11.addProperty(AppMeasurementSdk.ConditionalUserProperty.NAME, str9);
            }
            String str10 = jVar.c;
            if (str10 != null) {
                jsonObject11.addProperty("model", str10);
            }
            String str11 = jVar.d;
            if (str11 != null) {
                jsonObject11.addProperty("brand", str11);
            }
            String str12 = jVar.e;
            if (str12 != null) {
                jsonObject11.addProperty("architecture", str12);
            }
            jsonObject.add("device", jsonObject11);
        }
        JsonObject jsonObject12 = new JsonObject();
        jsonObject12.addProperty("format_version", Long.valueOf(hVar.e));
        d.i iVar = hVar.a;
        if (iVar != null) {
            JsonObject jsonObject13 = new JsonObject();
            jsonObject13.add("plan", iVar.a.toJson());
            jsonObject12.add("session", jsonObject13);
        }
        String str13 = hVar.b;
        if (str13 != null) {
            jsonObject12.addProperty("browser_sdk_version", str13);
        }
        String str14 = hVar.c;
        if (str14 != null) {
            jsonObject12.addProperty("span_id", str14);
        }
        String str15 = hVar.d;
        if (str15 != null) {
            jsonObject12.addProperty("trace_id", str15);
        }
        jsonObject.add("_dd", jsonObject12);
        if (gVar != null) {
            JsonObject jsonObject14 = new JsonObject();
            for (Map.Entry<String, Object> entry2 : gVar.a.entrySet()) {
                jsonObject14.add(entry2.getKey(), i.I(entry2.getValue()));
            }
            jsonObject.add("context", jsonObject14);
        }
        jsonObject.addProperty("type", "resource");
        JsonObject jsonObject15 = new JsonObject();
        String str16 = vVar.a;
        if (str16 != null) {
            jsonObject15.addProperty("id", str16);
        }
        jsonObject15.add("type", vVar.b.toJson());
        d.p pVar = vVar.c;
        if (pVar != null) {
            jsonObject15.add(FirebaseAnalytics.Param.METHOD, pVar.toJson());
        }
        jsonObject15.addProperty(ImagesContract.URL, vVar.d);
        Long l = vVar.e;
        if (l != null) {
            jsonObject15.addProperty("status_code", Long.valueOf(l.longValue()));
        }
        jsonObject15.addProperty("duration", Long.valueOf(vVar.f));
        Long l2 = vVar.g;
        if (l2 != null) {
            jsonObject15.addProperty("size", Long.valueOf(l2.longValue()));
        }
        d.u uVar = vVar.h;
        if (uVar != null) {
            JsonObject jsonObject16 = new JsonObject();
            jsonObject16.addProperty("duration", Long.valueOf(uVar.a));
            jsonObject16.addProperty("start", Long.valueOf(uVar.b));
            jsonObject15.add("redirect", jsonObject16);
        }
        d.l lVar = vVar.i;
        if (lVar != null) {
            JsonObject jsonObject17 = new JsonObject();
            jsonObject17.addProperty("duration", Long.valueOf(lVar.a));
            jsonObject17.addProperty("start", Long.valueOf(lVar.b));
            jsonObject15.add("dns", jsonObject17);
        }
        d.e eVar = vVar.j;
        if (eVar != null) {
            JsonObject jsonObject18 = new JsonObject();
            jsonObject18.addProperty("duration", Long.valueOf(eVar.a));
            jsonObject18.addProperty("start", Long.valueOf(eVar.b));
            jsonObject15.add("connect", jsonObject18);
        }
        d.a0 a0Var = vVar.k;
        if (a0Var != null) {
            JsonObject jsonObject19 = new JsonObject();
            jsonObject19.addProperty("duration", Long.valueOf(a0Var.a));
            jsonObject19.addProperty("start", Long.valueOf(a0Var.b));
            jsonObject15.add("ssl", jsonObject19);
        }
        d.n nVar = vVar.l;
        if (nVar != null) {
            JsonObject jsonObject20 = new JsonObject();
            jsonObject20.addProperty("duration", Long.valueOf(nVar.a));
            jsonObject20.addProperty("start", Long.valueOf(nVar.b));
            jsonObject15.add("first_byte", jsonObject20);
        }
        d.m mVar = vVar.m;
        if (mVar != null) {
            JsonObject jsonObject21 = new JsonObject();
            jsonObject21.addProperty("duration", Long.valueOf(mVar.a));
            jsonObject21.addProperty("start", Long.valueOf(mVar.b));
            jsonObject15.add("download", jsonObject21);
        }
        d.s sVar = vVar.n;
        if (sVar != null) {
            JsonObject jsonObject22 = new JsonObject();
            String str17 = sVar.a;
            if (str17 != null) {
                jsonObject22.addProperty("domain", str17);
            }
            String str18 = sVar.b;
            if (str18 != null) {
                jsonObject22.addProperty(AppMeasurementSdk.ConditionalUserProperty.NAME, str18);
            }
            d.t tVar = sVar.c;
            if (tVar != null) {
                jsonObject22.add("type", tVar.toJson());
            }
            jsonObject15.add("provider", jsonObject22);
        }
        jsonObject.add("resource", jsonObject15);
        d.a aVar = dVar.p;
        if (aVar != null) {
            JsonObject jsonObject23 = new JsonObject();
            jsonObject23.addProperty("id", aVar.a);
            jsonObject.add("action", jsonObject23);
        }
        JsonObject asJsonObject = jsonObject.getAsJsonObject();
        j.e(asJsonObject, "sanitizedModel.toJson().asJsonObject");
        a(asJsonObject);
        String jsonElement = asJsonObject.toString();
        j.e(jsonElement, "extractKnownAttributes(s….asJsonObject).toString()");
        return jsonElement;
    }

    public final Map<String, Object> d(Map<String, ? extends Object> map) {
        com.amazon.aps.iva.mp.a aVar = this.b;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<String, ? extends Object> entry : map.entrySet()) {
            if (!e.contains(entry.getKey())) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        return a.C0519a.a(aVar, linkedHashMap, "context", null, d, 4);
    }

    public final Map<String, Object> e(Map<String, ? extends Object> map) {
        return this.b.a(map, "usr", "user extra information", d);
    }

    @Override // com.amazon.aps.iva.sp.h
    public final String serialize(Object obj) {
        String str;
        String str2;
        c.u uVar;
        String str3;
        String str4;
        c.g gVar;
        String str5;
        String str6;
        b.b0 b0Var;
        String str7;
        String str8;
        b.g gVar2;
        String str9;
        String str10;
        String str11;
        String str12;
        e.z zVar;
        e.g gVar3;
        e.i iVar;
        j.f(obj, "model");
        if (obj instanceof e) {
            e eVar = (e) obj;
            e.z zVar2 = eVar.g;
            if (zVar2 == null) {
                str12 = "referrer";
                str10 = AppMeasurementSdk.ConditionalUserProperty.NAME;
                str11 = ImagesContract.URL;
                zVar = null;
            } else {
                Map<String, Object> e2 = e(zVar2.d);
                j.f(e2, "additionalProperties");
                str10 = AppMeasurementSdk.ConditionalUserProperty.NAME;
                str11 = ImagesContract.URL;
                str12 = "referrer";
                zVar = new e.z(zVar2.a, zVar2.b, zVar2.c, e2);
            }
            e.g gVar4 = eVar.n;
            if (gVar4 == null) {
                gVar3 = null;
            } else {
                Map<String, Object> d2 = d(gVar4.a);
                j.f(d2, "additionalProperties");
                gVar3 = new e.g(d2);
            }
            e.a0 a0Var = eVar.f;
            e.i iVar2 = a0Var.q;
            if (iVar2 == null) {
                iVar = null;
            } else {
                LinkedHashMap c2 = this.b.c(iVar2.a);
                j.f(c2, "additionalProperties");
                iVar = new e.i(c2);
            }
            e a = e.a(eVar, e.a0.a(a0Var, iVar, null, null, -65537), zVar, null, gVar3, 8095);
            JsonObject jsonObject = new JsonObject();
            jsonObject.addProperty("date", Long.valueOf(a.a));
            e.b bVar = a.b;
            bVar.getClass();
            JsonObject jsonObject2 = new JsonObject();
            jsonObject2.addProperty("id", bVar.a);
            jsonObject.add("application", jsonObject2);
            String str13 = a.c;
            if (str13 != null) {
                jsonObject.addProperty("service", str13);
            }
            e.b0 b0Var2 = a.d;
            b0Var2.getClass();
            JsonObject jsonObject3 = new JsonObject();
            jsonObject3.addProperty("id", b0Var2.a);
            jsonObject3.add("type", b0Var2.b.toJson());
            Boolean bool = b0Var2.c;
            if (bool != null) {
                jsonObject3.addProperty("has_replay", Boolean.valueOf(bool.booleanValue()));
            }
            jsonObject.add("session", jsonObject3);
            e.w wVar = a.e;
            if (wVar != null) {
                jsonObject.add(FirebaseAnalytics.Param.SOURCE, wVar.toJson());
            }
            e.a0 a0Var2 = a.f;
            a0Var2.getClass();
            JsonObject jsonObject4 = new JsonObject();
            jsonObject4.addProperty("id", a0Var2.a);
            String str14 = a0Var2.b;
            if (str14 != null) {
                jsonObject4.addProperty(str12, str14);
            }
            jsonObject4.addProperty(str11, a0Var2.c);
            String str15 = a0Var2.d;
            String str16 = str10;
            if (str15 != null) {
                jsonObject4.addProperty(str16, str15);
            }
            Long l = a0Var2.e;
            if (l != null) {
                jsonObject4.addProperty("loading_time", Long.valueOf(l.longValue()));
            }
            e.r rVar = a0Var2.f;
            if (rVar != null) {
                jsonObject4.add("loading_type", rVar.toJson());
            }
            jsonObject4.addProperty("time_spent", Long.valueOf(a0Var2.g));
            Long l2 = a0Var2.h;
            if (l2 != null) {
                jsonObject4.addProperty("first_contentful_paint", Long.valueOf(l2.longValue()));
            }
            Long l3 = a0Var2.i;
            if (l3 != null) {
                jsonObject4.addProperty("largest_contentful_paint", Long.valueOf(l3.longValue()));
            }
            Long l4 = a0Var2.j;
            if (l4 != null) {
                jsonObject4.addProperty("first_input_delay", Long.valueOf(l4.longValue()));
            }
            Long l5 = a0Var2.k;
            if (l5 != null) {
                jsonObject4.addProperty("first_input_time", Long.valueOf(l5.longValue()));
            }
            Number number = a0Var2.l;
            if (number != null) {
                jsonObject4.addProperty("cumulative_layout_shift", number);
            }
            Long l6 = a0Var2.m;
            if (l6 != null) {
                jsonObject4.addProperty("dom_complete", Long.valueOf(l6.longValue()));
            }
            Long l7 = a0Var2.n;
            if (l7 != null) {
                jsonObject4.addProperty("dom_content_loaded", Long.valueOf(l7.longValue()));
            }
            Long l8 = a0Var2.o;
            if (l8 != null) {
                jsonObject4.addProperty("dom_interactive", Long.valueOf(l8.longValue()));
            }
            Long l9 = a0Var2.p;
            if (l9 != null) {
                jsonObject4.addProperty("load_event", Long.valueOf(l9.longValue()));
            }
            e.i iVar3 = a0Var2.q;
            if (iVar3 != null) {
                JsonObject jsonObject5 = new JsonObject();
                for (Map.Entry<String, Long> entry : iVar3.a.entrySet()) {
                    jsonObject5.addProperty(entry.getKey(), Long.valueOf(entry.getValue().longValue()));
                }
                jsonObject4.add("custom_timings", jsonObject5);
            }
            Boolean bool2 = a0Var2.r;
            if (bool2 != null) {
                jsonObject4.addProperty("is_active", Boolean.valueOf(bool2.booleanValue()));
            }
            Boolean bool3 = a0Var2.s;
            if (bool3 != null) {
                jsonObject4.addProperty("is_slow_rendered", Boolean.valueOf(bool3.booleanValue()));
            }
            e.a aVar = a0Var2.t;
            aVar.getClass();
            JsonObject jsonObject6 = new JsonObject();
            jsonObject6.addProperty("count", Long.valueOf(aVar.a));
            jsonObject4.add("action", jsonObject6);
            e.n nVar = a0Var2.u;
            nVar.getClass();
            JsonObject jsonObject7 = new JsonObject();
            jsonObject7.addProperty("count", Long.valueOf(nVar.a));
            jsonObject4.add("error", jsonObject7);
            e.h hVar = a0Var2.v;
            if (hVar != null) {
                JsonObject jsonObject8 = new JsonObject();
                jsonObject8.addProperty("count", Long.valueOf(hVar.a));
                jsonObject4.add(AppMeasurement.CRASH_ORIGIN, jsonObject8);
            }
            e.s sVar = a0Var2.w;
            if (sVar != null) {
                JsonObject jsonObject9 = new JsonObject();
                jsonObject9.addProperty("count", Long.valueOf(sVar.a));
                jsonObject4.add("long_task", jsonObject9);
            }
            e.o oVar = a0Var2.x;
            if (oVar != null) {
                JsonObject jsonObject10 = new JsonObject();
                jsonObject10.addProperty("count", Long.valueOf(oVar.a));
                jsonObject4.add("frozen_frame", jsonObject10);
            }
            e.v vVar = a0Var2.y;
            vVar.getClass();
            JsonObject jsonObject11 = new JsonObject();
            jsonObject11.addProperty("count", Long.valueOf(vVar.a));
            jsonObject4.add("resource", jsonObject11);
            List<e.p> list = a0Var2.z;
            if (list != null) {
                JsonArray jsonArray = new JsonArray(list.size());
                for (e.p pVar : list) {
                    pVar.getClass();
                    JsonObject jsonObject12 = new JsonObject();
                    jsonObject12.addProperty("start", Long.valueOf(pVar.a));
                    jsonObject12.addProperty("duration", Long.valueOf(pVar.b));
                    jsonArray.add(jsonObject12);
                }
                jsonObject4.add("in_foreground_periods", jsonArray);
            }
            Number number2 = a0Var2.A;
            if (number2 != null) {
                jsonObject4.addProperty("memory_average", number2);
            }
            Number number3 = a0Var2.B;
            if (number3 != null) {
                jsonObject4.addProperty("memory_max", number3);
            }
            Number number4 = a0Var2.C;
            if (number4 != null) {
                jsonObject4.addProperty("cpu_ticks_count", number4);
            }
            Number number5 = a0Var2.D;
            if (number5 != null) {
                jsonObject4.addProperty("cpu_ticks_per_second", number5);
            }
            Number number6 = a0Var2.E;
            if (number6 != null) {
                jsonObject4.addProperty("refresh_rate_average", number6);
            }
            Number number7 = a0Var2.F;
            if (number7 != null) {
                jsonObject4.addProperty("refresh_rate_min", number7);
            }
            jsonObject.add("view", jsonObject4);
            e.z zVar3 = a.g;
            if (zVar3 != null) {
                JsonObject jsonObject13 = new JsonObject();
                String str17 = zVar3.a;
                if (str17 != null) {
                    jsonObject13.addProperty("id", str17);
                }
                String str18 = zVar3.b;
                if (str18 != null) {
                    jsonObject13.addProperty(str16, str18);
                }
                String str19 = zVar3.c;
                if (str19 != null) {
                    jsonObject13.addProperty(Scopes.EMAIL, str19);
                }
                for (Map.Entry<String, Object> entry2 : zVar3.d.entrySet()) {
                    String key = entry2.getKey();
                    Object value = entry2.getValue();
                    if (!o.N(e.z.e, key)) {
                        jsonObject13.add(key, i.I(value));
                    }
                }
                jsonObject.add("usr", jsonObject13);
            }
            e.f fVar = a.h;
            if (fVar != null) {
                JsonObject jsonObject14 = new JsonObject();
                jsonObject14.add("status", fVar.a.toJson());
                List<e.q> list2 = fVar.b;
                JsonArray jsonArray2 = new JsonArray(list2.size());
                for (e.q qVar : list2) {
                    jsonArray2.add(qVar.toJson());
                }
                jsonObject14.add("interfaces", jsonArray2);
                e.c cVar = fVar.c;
                if (cVar != null) {
                    JsonObject jsonObject15 = new JsonObject();
                    String str20 = cVar.a;
                    if (str20 != null) {
                        jsonObject15.addProperty("technology", str20);
                    }
                    String str21 = cVar.b;
                    if (str21 != null) {
                        jsonObject15.addProperty("carrier_name", str21);
                    }
                    jsonObject14.add("cellular", jsonObject15);
                }
                jsonObject.add("connectivity", jsonObject14);
            }
            e.y yVar = a.i;
            if (yVar != null) {
                JsonObject jsonObject16 = new JsonObject();
                jsonObject16.addProperty("test_id", yVar.a);
                jsonObject16.addProperty("result_id", yVar.b);
                Boolean bool4 = yVar.c;
                if (bool4 != null) {
                    jsonObject16.addProperty("injected", Boolean.valueOf(bool4.booleanValue()));
                }
                jsonObject.add("synthetics", jsonObject16);
            }
            e.d dVar = a.j;
            if (dVar != null) {
                JsonObject jsonObject17 = new JsonObject();
                jsonObject17.addProperty("test_execution_id", dVar.a);
                jsonObject.add("ci_test", jsonObject17);
            }
            e.t tVar = a.k;
            if (tVar != null) {
                JsonObject jsonObject18 = new JsonObject();
                jsonObject18.addProperty(str16, tVar.a);
                jsonObject18.addProperty("version", tVar.b);
                jsonObject18.addProperty("version_major", tVar.c);
                jsonObject.add("os", jsonObject18);
            }
            e.l lVar = a.l;
            if (lVar != null) {
                JsonObject jsonObject19 = new JsonObject();
                jsonObject19.add("type", lVar.a.toJson());
                String str22 = lVar.b;
                if (str22 != null) {
                    jsonObject19.addProperty(str16, str22);
                }
                String str23 = lVar.c;
                if (str23 != null) {
                    jsonObject19.addProperty("model", str23);
                }
                String str24 = lVar.d;
                if (str24 != null) {
                    jsonObject19.addProperty("brand", str24);
                }
                String str25 = lVar.e;
                if (str25 != null) {
                    jsonObject19.addProperty("architecture", str25);
                }
                jsonObject.add("device", jsonObject19);
            }
            e.j jVar = a.m;
            jVar.getClass();
            JsonObject jsonObject20 = new JsonObject();
            jsonObject20.addProperty("format_version", Long.valueOf(jVar.d));
            e.k kVar = jVar.a;
            if (kVar != null) {
                JsonObject jsonObject21 = new JsonObject();
                jsonObject21.add("plan", kVar.a.toJson());
                jsonObject20.add("session", jsonObject21);
            }
            String str26 = jVar.b;
            if (str26 != null) {
                jsonObject20.addProperty("browser_sdk_version", str26);
            }
            jsonObject20.addProperty("document_version", Long.valueOf(jVar.c));
            jsonObject.add("_dd", jsonObject20);
            e.g gVar5 = a.n;
            if (gVar5 != null) {
                JsonObject jsonObject22 = new JsonObject();
                for (Map.Entry<String, Object> entry3 : gVar5.a.entrySet()) {
                    jsonObject22.add(entry3.getKey(), i.I(entry3.getValue()));
                }
                jsonObject.add("context", jsonObject22);
            }
            jsonObject.addProperty("type", a.o);
            JsonObject asJsonObject = jsonObject.getAsJsonObject();
            j.e(asJsonObject, "sanitizedModel.toJson().asJsonObject");
            a(asJsonObject);
            String jsonElement = asJsonObject.toString();
            j.e(jsonElement, "extractKnownAttributes(s….asJsonObject).toString()");
            return jsonElement;
        } else if (obj instanceof com.amazon.aps.iva.fr.b) {
            com.amazon.aps.iva.fr.b bVar2 = (com.amazon.aps.iva.fr.b) obj;
            b.b0 b0Var3 = bVar2.g;
            if (b0Var3 == null) {
                str5 = AppMeasurementSdk.ConditionalUserProperty.NAME;
                str8 = FirebaseAnalytics.Param.SOURCE;
                str7 = "referrer";
                str6 = ImagesContract.URL;
                b0Var = null;
            } else {
                str5 = AppMeasurementSdk.ConditionalUserProperty.NAME;
                Map<String, Object> e3 = e(b0Var3.d);
                j.f(e3, "additionalProperties");
                str6 = ImagesContract.URL;
                str7 = "referrer";
                String str27 = b0Var3.c;
                str8 = FirebaseAnalytics.Param.SOURCE;
                b0Var = new b.b0(b0Var3.a, b0Var3.b, str27, e3);
            }
            b.g gVar6 = bVar2.n;
            if (gVar6 == null) {
                gVar2 = null;
            } else {
                Map<String, Object> d3 = d(gVar6.a);
                j.f(d3, "additionalProperties");
                gVar2 = new b.g(d3);
            }
            b.C0276b c0276b = bVar2.b;
            j.f(c0276b, "application");
            b.m mVar = bVar2.d;
            j.f(mVar, "session");
            b.c0 c0Var = bVar2.f;
            j.f(c0Var, "view");
            b.h hVar2 = bVar2.m;
            j.f(hVar2, "dd");
            b.l lVar2 = bVar2.o;
            b.g gVar7 = gVar2;
            j.f(lVar2, "error");
            JsonObject jsonObject23 = new JsonObject();
            jsonObject23.addProperty("date", Long.valueOf(bVar2.a));
            JsonObject jsonObject24 = new JsonObject();
            jsonObject24.addProperty("id", c0276b.a);
            jsonObject23.add("application", jsonObject24);
            String str28 = bVar2.c;
            if (str28 != null) {
                jsonObject23.addProperty("service", str28);
            }
            JsonObject jsonObject25 = new JsonObject();
            jsonObject25.addProperty("id", mVar.a);
            jsonObject25.add("type", mVar.b.toJson());
            Boolean bool5 = mVar.c;
            if (bool5 != null) {
                jsonObject25.addProperty("has_replay", Boolean.valueOf(bool5.booleanValue()));
            }
            jsonObject23.add("session", jsonObject25);
            b.o oVar2 = bVar2.e;
            if (oVar2 == null) {
                str9 = str8;
            } else {
                str9 = str8;
                jsonObject23.add(str9, oVar2.toJson());
            }
            JsonObject jsonObject26 = new JsonObject();
            jsonObject26.addProperty("id", c0Var.a);
            String str29 = c0Var.b;
            if (str29 != null) {
                jsonObject26.addProperty(str7, str29);
            }
            String str30 = str6;
            jsonObject26.addProperty(str30, c0Var.c);
            String str31 = c0Var.d;
            String str32 = str5;
            if (str31 != null) {
                jsonObject26.addProperty(str32, str31);
            }
            Boolean bool6 = c0Var.e;
            if (bool6 != null) {
                jsonObject26.addProperty("in_foreground", Boolean.valueOf(bool6.booleanValue()));
            }
            jsonObject23.add("view", jsonObject26);
            if (b0Var != null) {
                JsonObject jsonObject27 = new JsonObject();
                String str33 = b0Var.a;
                if (str33 != null) {
                    jsonObject27.addProperty("id", str33);
                }
                String str34 = b0Var.b;
                if (str34 != null) {
                    jsonObject27.addProperty(str32, str34);
                }
                String str35 = b0Var.c;
                if (str35 != null) {
                    jsonObject27.addProperty(Scopes.EMAIL, str35);
                }
                for (Map.Entry<String, Object> entry4 : b0Var.d.entrySet()) {
                    String key2 = entry4.getKey();
                    Object value2 = entry4.getValue();
                    if (!o.N(b.b0.e, key2)) {
                        jsonObject27.add(key2, i.I(value2));
                    }
                }
                jsonObject23.add("usr", jsonObject27);
            }
            b.f fVar2 = bVar2.h;
            if (fVar2 != null) {
                JsonObject jsonObject28 = new JsonObject();
                jsonObject28.add("status", fVar2.a.toJson());
                List<b.r> list3 = fVar2.b;
                JsonArray jsonArray3 = new JsonArray(list3.size());
                for (b.r rVar2 : list3) {
                    jsonArray3.add(rVar2.toJson());
                }
                jsonObject28.add("interfaces", jsonArray3);
                b.c cVar2 = fVar2.c;
                if (cVar2 != null) {
                    JsonObject jsonObject29 = new JsonObject();
                    String str36 = cVar2.a;
                    if (str36 != null) {
                        jsonObject29.addProperty("technology", str36);
                    }
                    String str37 = cVar2.b;
                    if (str37 != null) {
                        jsonObject29.addProperty("carrier_name", str37);
                    }
                    jsonObject28.add("cellular", jsonObject29);
                }
                jsonObject23.add("connectivity", jsonObject28);
            }
            b.a0 a0Var3 = bVar2.i;
            if (a0Var3 != null) {
                JsonObject jsonObject30 = new JsonObject();
                jsonObject30.addProperty("test_id", a0Var3.a);
                jsonObject30.addProperty("result_id", a0Var3.b);
                Boolean bool7 = a0Var3.c;
                if (bool7 != null) {
                    jsonObject30.addProperty("injected", Boolean.valueOf(bool7.booleanValue()));
                }
                jsonObject23.add("synthetics", jsonObject30);
            }
            b.d dVar2 = bVar2.j;
            if (dVar2 != null) {
                JsonObject jsonObject31 = new JsonObject();
                jsonObject31.addProperty("test_execution_id", dVar2.a);
                jsonObject23.add("ci_test", jsonObject31);
            }
            b.t tVar2 = bVar2.k;
            if (tVar2 != null) {
                JsonObject jsonObject32 = new JsonObject();
                jsonObject32.addProperty(str32, tVar2.a);
                jsonObject32.addProperty("version", tVar2.b);
                jsonObject32.addProperty("version_major", tVar2.c);
                jsonObject23.add("os", jsonObject32);
            }
            b.j jVar2 = bVar2.l;
            if (jVar2 != null) {
                JsonObject jsonObject33 = new JsonObject();
                jsonObject33.add("type", jVar2.a.toJson());
                String str38 = jVar2.b;
                if (str38 != null) {
                    jsonObject33.addProperty(str32, str38);
                }
                String str39 = jVar2.c;
                if (str39 != null) {
                    jsonObject33.addProperty("model", str39);
                }
                String str40 = jVar2.d;
                if (str40 != null) {
                    jsonObject33.addProperty("brand", str40);
                }
                String str41 = jVar2.e;
                if (str41 != null) {
                    jsonObject33.addProperty("architecture", str41);
                }
                jsonObject23.add("device", jsonObject33);
            }
            JsonObject jsonObject34 = new JsonObject();
            jsonObject34.addProperty("format_version", Long.valueOf(hVar2.c));
            b.i iVar4 = hVar2.a;
            if (iVar4 != null) {
                JsonObject jsonObject35 = new JsonObject();
                jsonObject35.add("plan", iVar4.a.toJson());
                jsonObject34.add("session", jsonObject35);
            }
            String str42 = hVar2.b;
            if (str42 != null) {
                jsonObject34.addProperty("browser_sdk_version", str42);
            }
            jsonObject23.add("_dd", jsonObject34);
            if (gVar7 != null) {
                JsonObject jsonObject36 = new JsonObject();
                for (Map.Entry<String, Object> entry5 : gVar7.a.entrySet()) {
                    jsonObject36.add(entry5.getKey(), i.I(entry5.getValue()));
                }
                jsonObject23.add("context", jsonObject36);
            }
            jsonObject23.addProperty("type", "error");
            JsonObject jsonObject37 = new JsonObject();
            String str43 = lVar2.a;
            if (str43 != null) {
                jsonObject37.addProperty("id", str43);
            }
            jsonObject37.addProperty("message", lVar2.b);
            jsonObject37.add(str9, lVar2.c.toJson());
            String str44 = lVar2.d;
            if (str44 != null) {
                jsonObject37.addProperty("stack", str44);
            }
            Boolean bool8 = lVar2.e;
            if (bool8 != null) {
                jsonObject37.addProperty("is_crash", Boolean.valueOf(bool8.booleanValue()));
            }
            String str45 = lVar2.f;
            if (str45 != null) {
                jsonObject37.addProperty("type", str45);
            }
            b.q qVar2 = lVar2.g;
            if (qVar2 != null) {
                jsonObject37.add("handling", qVar2.toJson());
            }
            String str46 = lVar2.h;
            if (str46 != null) {
                jsonObject37.addProperty("handling_stack", str46);
            }
            b.y yVar2 = lVar2.i;
            if (yVar2 != null) {
                jsonObject37.add("source_type", yVar2.toJson());
            }
            b.x xVar = lVar2.j;
            if (xVar != null) {
                JsonObject jsonObject38 = new JsonObject();
                jsonObject38.add(FirebaseAnalytics.Param.METHOD, xVar.a.toJson());
                jsonObject38.addProperty("status_code", Long.valueOf(xVar.b));
                jsonObject38.addProperty(str30, xVar.c);
                b.v vVar2 = xVar.d;
                if (vVar2 != null) {
                    JsonObject jsonObject39 = new JsonObject();
                    String str47 = vVar2.a;
                    if (str47 != null) {
                        jsonObject39.addProperty("domain", str47);
                    }
                    String str48 = vVar2.b;
                    if (str48 != null) {
                        jsonObject39.addProperty(str32, str48);
                    }
                    b.w wVar2 = vVar2.c;
                    if (wVar2 != null) {
                        jsonObject39.add("type", wVar2.toJson());
                    }
                    jsonObject38.add("provider", jsonObject39);
                }
                jsonObject37.add("resource", jsonObject38);
            }
            jsonObject23.add("error", jsonObject37);
            b.a aVar2 = bVar2.p;
            if (aVar2 != null) {
                JsonObject jsonObject40 = new JsonObject();
                jsonObject40.addProperty("id", aVar2.a);
                jsonObject23.add("action", jsonObject40);
            }
            JsonObject asJsonObject2 = jsonObject23.getAsJsonObject();
            j.e(asJsonObject2, "sanitizedModel.toJson().asJsonObject");
            a(asJsonObject2);
            String jsonElement2 = asJsonObject2.toString();
            j.e(jsonElement2, "extractKnownAttributes(s….asJsonObject).toString()");
            return jsonElement2;
        } else if (obj instanceof com.amazon.aps.iva.fr.a) {
            return b((com.amazon.aps.iva.fr.a) obj);
        } else {
            if (obj instanceof com.amazon.aps.iva.fr.d) {
                return c((com.amazon.aps.iva.fr.d) obj);
            }
            if (obj instanceof com.amazon.aps.iva.fr.c) {
                com.amazon.aps.iva.fr.c cVar3 = (com.amazon.aps.iva.fr.c) obj;
                c.u uVar2 = cVar3.g;
                if (uVar2 == null) {
                    str = AppMeasurementSdk.ConditionalUserProperty.NAME;
                    str4 = FirebaseAnalytics.Param.SOURCE;
                    str3 = "referrer";
                    str2 = ImagesContract.URL;
                    uVar = null;
                } else {
                    str = AppMeasurementSdk.ConditionalUserProperty.NAME;
                    Map<String, Object> e4 = e(uVar2.d);
                    j.f(e4, "additionalProperties");
                    str2 = ImagesContract.URL;
                    str3 = "referrer";
                    String str49 = uVar2.c;
                    str4 = FirebaseAnalytics.Param.SOURCE;
                    uVar = new c.u(uVar2.a, uVar2.b, str49, e4);
                }
                c.g gVar8 = cVar3.n;
                if (gVar8 == null) {
                    gVar = null;
                } else {
                    Map<String, Object> d4 = d(gVar8.a);
                    j.f(d4, "additionalProperties");
                    gVar = new c.g(d4);
                }
                c.b bVar3 = cVar3.b;
                j.f(bVar3, "application");
                c.n nVar2 = cVar3.d;
                j.f(nVar2, "session");
                c.v vVar3 = cVar3.f;
                j.f(vVar3, "view");
                c.h hVar3 = cVar3.m;
                j.f(hVar3, "dd");
                c.m mVar2 = cVar3.o;
                c.g gVar9 = gVar;
                j.f(mVar2, "longTask");
                JsonObject jsonObject41 = new JsonObject();
                c.u uVar3 = uVar;
                jsonObject41.addProperty("date", Long.valueOf(cVar3.a));
                JsonObject jsonObject42 = new JsonObject();
                jsonObject42.addProperty("id", bVar3.a);
                jsonObject41.add("application", jsonObject42);
                String str50 = cVar3.c;
                if (str50 != null) {
                    jsonObject41.addProperty("service", str50);
                }
                JsonObject jsonObject43 = new JsonObject();
                jsonObject43.addProperty("id", nVar2.a);
                jsonObject43.add("type", nVar2.b.toJson());
                Boolean bool9 = nVar2.c;
                if (bool9 != null) {
                    jsonObject43.addProperty("has_replay", Boolean.valueOf(bool9.booleanValue()));
                }
                jsonObject41.add("session", jsonObject43);
                c.r rVar3 = cVar3.e;
                if (rVar3 != null) {
                    jsonObject41.add(str4, rVar3.toJson());
                }
                JsonObject jsonObject44 = new JsonObject();
                jsonObject44.addProperty("id", vVar3.a);
                String str51 = vVar3.b;
                if (str51 != null) {
                    jsonObject44.addProperty(str3, str51);
                }
                jsonObject44.addProperty(str2, vVar3.c);
                String str52 = vVar3.d;
                String str53 = str;
                if (str52 != null) {
                    jsonObject44.addProperty(str53, str52);
                }
                jsonObject41.add("view", jsonObject44);
                if (uVar3 != null) {
                    JsonObject jsonObject45 = new JsonObject();
                    String str54 = uVar3.a;
                    if (str54 != null) {
                        jsonObject45.addProperty("id", str54);
                    }
                    String str55 = uVar3.b;
                    if (str55 != null) {
                        jsonObject45.addProperty(str53, str55);
                    }
                    String str56 = uVar3.c;
                    if (str56 != null) {
                        jsonObject45.addProperty(Scopes.EMAIL, str56);
                    }
                    for (Map.Entry<String, Object> entry6 : uVar3.d.entrySet()) {
                        String key3 = entry6.getKey();
                        Object value3 = entry6.getValue();
                        if (!o.N(c.u.e, key3)) {
                            jsonObject45.add(key3, i.I(value3));
                        }
                    }
                    jsonObject41.add("usr", jsonObject45);
                }
                c.f fVar3 = cVar3.h;
                if (fVar3 != null) {
                    JsonObject jsonObject46 = new JsonObject();
                    jsonObject46.add("status", fVar3.a.toJson());
                    List<c.l> list4 = fVar3.b;
                    JsonArray jsonArray4 = new JsonArray(list4.size());
                    for (c.l lVar3 : list4) {
                        jsonArray4.add(lVar3.toJson());
                    }
                    jsonObject46.add("interfaces", jsonArray4);
                    c.C0277c c0277c = fVar3.c;
                    if (c0277c != null) {
                        JsonObject jsonObject47 = new JsonObject();
                        String str57 = c0277c.a;
                        if (str57 != null) {
                            jsonObject47.addProperty("technology", str57);
                        }
                        String str58 = c0277c.b;
                        if (str58 != null) {
                            jsonObject47.addProperty("carrier_name", str58);
                        }
                        jsonObject46.add("cellular", jsonObject47);
                    }
                    jsonObject41.add("connectivity", jsonObject46);
                }
                c.t tVar3 = cVar3.i;
                if (tVar3 != null) {
                    JsonObject jsonObject48 = new JsonObject();
                    jsonObject48.addProperty("test_id", tVar3.a);
                    jsonObject48.addProperty("result_id", tVar3.b);
                    Boolean bool10 = tVar3.c;
                    if (bool10 != null) {
                        jsonObject48.addProperty("injected", Boolean.valueOf(bool10.booleanValue()));
                    }
                    jsonObject41.add("synthetics", jsonObject48);
                }
                c.d dVar3 = cVar3.j;
                if (dVar3 != null) {
                    JsonObject jsonObject49 = new JsonObject();
                    jsonObject49.addProperty("test_execution_id", dVar3.a);
                    jsonObject41.add("ci_test", jsonObject49);
                }
                c.p pVar2 = cVar3.k;
                if (pVar2 != null) {
                    JsonObject jsonObject50 = new JsonObject();
                    jsonObject50.addProperty(str53, pVar2.a);
                    jsonObject50.addProperty("version", pVar2.b);
                    jsonObject50.addProperty("version_major", pVar2.c);
                    jsonObject41.add("os", jsonObject50);
                }
                c.j jVar3 = cVar3.l;
                if (jVar3 != null) {
                    JsonObject jsonObject51 = new JsonObject();
                    jsonObject51.add("type", jVar3.a.toJson());
                    String str59 = jVar3.b;
                    if (str59 != null) {
                        jsonObject51.addProperty(str53, str59);
                    }
                    String str60 = jVar3.c;
                    if (str60 != null) {
                        jsonObject51.addProperty("model", str60);
                    }
                    String str61 = jVar3.d;
                    if (str61 != null) {
                        jsonObject51.addProperty("brand", str61);
                    }
                    String str62 = jVar3.e;
                    if (str62 != null) {
                        jsonObject51.addProperty("architecture", str62);
                    }
                    jsonObject41.add("device", jsonObject51);
                }
                JsonObject jsonObject52 = new JsonObject();
                jsonObject52.addProperty("format_version", Long.valueOf(hVar3.c));
                c.i iVar5 = hVar3.a;
                if (iVar5 != null) {
                    JsonObject jsonObject53 = new JsonObject();
                    jsonObject53.add("plan", iVar5.a.toJson());
                    jsonObject52.add("session", jsonObject53);
                }
                String str63 = hVar3.b;
                if (str63 != null) {
                    jsonObject52.addProperty("browser_sdk_version", str63);
                }
                jsonObject41.add("_dd", jsonObject52);
                if (gVar9 != null) {
                    JsonObject jsonObject54 = new JsonObject();
                    for (Map.Entry<String, Object> entry7 : gVar9.a.entrySet()) {
                        jsonObject54.add(entry7.getKey(), i.I(entry7.getValue()));
                    }
                    jsonObject41.add("context", jsonObject54);
                }
                jsonObject41.addProperty("type", "long_task");
                JsonObject jsonObject55 = new JsonObject();
                String str64 = mVar2.a;
                if (str64 != null) {
                    jsonObject55.addProperty("id", str64);
                }
                jsonObject55.addProperty("duration", Long.valueOf(mVar2.b));
                Boolean bool11 = mVar2.c;
                if (bool11 != null) {
                    jsonObject55.addProperty("is_frozen_frame", Boolean.valueOf(bool11.booleanValue()));
                }
                jsonObject41.add("long_task", jsonObject55);
                c.a aVar3 = cVar3.p;
                if (aVar3 != null) {
                    JsonObject jsonObject56 = new JsonObject();
                    jsonObject56.addProperty("id", aVar3.a);
                    jsonObject41.add("action", jsonObject56);
                }
                JsonObject asJsonObject3 = jsonObject41.getAsJsonObject();
                j.e(asJsonObject3, "sanitizedModel.toJson().asJsonObject");
                a(asJsonObject3);
                String jsonElement3 = asJsonObject3.toString();
                j.e(jsonElement3, "extractKnownAttributes(s….asJsonObject).toString()");
                return jsonElement3;
            } else if (obj instanceof com.amazon.aps.iva.ir.a) {
                String jsonElement4 = ((com.amazon.aps.iva.ir.a) obj).a().toString();
                j.e(jsonElement4, "{\n                model.….toString()\n            }");
                return jsonElement4;
            } else if (obj instanceof com.amazon.aps.iva.ir.b) {
                String jsonElement5 = ((com.amazon.aps.iva.ir.b) obj).a().toString();
                j.e(jsonElement5, "{\n                model.….toString()\n            }");
                return jsonElement5;
            } else if (obj instanceof JsonObject) {
                return obj.toString();
            } else {
                String jsonElement6 = new JsonObject().toString();
                j.e(jsonElement6, "{\n                JsonOb….toString()\n            }");
                return jsonElement6;
            }
        }
    }
}
