package com.amazon.aps.iva.ar;

import com.amazon.aps.iva.fr.e;
import com.amazon.aps.iva.sq.e;
import com.amazon.aps.iva.sq.h;
import com.amazon.aps.iva.yb0.j;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.LinkedHashMap;
import java.util.Map;
/* compiled from: NoOpAdvancedRumMonitor.kt */
/* loaded from: classes2.dex */
public final class d implements a {
    @Override // com.amazon.aps.iva.sq.f
    public final void a(String str, String str2, String str3, Map<String, ? extends Object> map) {
        j.f(str, "key");
        j.f(map, "attributes");
    }

    @Override // com.amazon.aps.iva.sq.f
    public final void b(com.amazon.aps.iva.sq.d dVar, String str, LinkedHashMap linkedHashMap) {
        j.f(str, AppMeasurementSdk.ConditionalUserProperty.NAME);
    }

    @Override // com.amazon.aps.iva.sq.f
    public final void c(String str, Integer num, Long l, h hVar, LinkedHashMap linkedHashMap) {
        j.f(str, "key");
        j.f(hVar, "kind");
    }

    @Override // com.amazon.aps.iva.sq.f
    public final void d(com.amazon.aps.iva.sq.d dVar, String str, Map<String, ? extends Object> map) {
        j.f(dVar, "type");
        j.f(str, AppMeasurementSdk.ConditionalUserProperty.NAME);
    }

    @Override // com.amazon.aps.iva.sq.f
    public final void e(Object obj, Map<String, ? extends Object> map) {
        j.f(obj, "key");
        j.f(map, "attributes");
    }

    @Override // com.amazon.aps.iva.ar.a
    public final void f(String str, com.amazon.aps.iva.wq.a aVar) {
        j.f(str, "key");
    }

    @Override // com.amazon.aps.iva.ar.a
    public final void g(String str, c cVar) {
        j.f(str, "viewId");
        j.f(cVar, "type");
    }

    @Override // com.amazon.aps.iva.ar.a
    public final void h(String str) {
        j.f(str, "message");
    }

    @Override // com.amazon.aps.iva.ar.a
    public final void i(String str, e eVar, Throwable th) {
        j.f(str, "message");
        j.f(eVar, FirebaseAnalytics.Param.SOURCE);
        j.f(th, "throwable");
    }

    @Override // com.amazon.aps.iva.ar.a
    public final void j(String str) {
        j.f(str, "key");
    }

    @Override // com.amazon.aps.iva.ar.a
    public final void k(long j, String str) {
        j.f(str, "target");
    }

    @Override // com.amazon.aps.iva.sq.f
    public final void l(Object obj, Map map, String str) {
        j.f(obj, "key");
        j.f(str, AppMeasurementSdk.ConditionalUserProperty.NAME);
        j.f(map, "attributes");
    }

    @Override // com.amazon.aps.iva.ar.a
    public final void m(Object obj, long j, e.r rVar) {
        j.f(obj, "key");
        j.f(rVar, "type");
    }

    @Override // com.amazon.aps.iva.ar.a
    public final void n(String str, Throwable th) {
        j.f(str, "message");
    }

    @Override // com.amazon.aps.iva.sq.f
    public final void o(String str, String str2, com.amazon.aps.iva.sq.e eVar, Throwable th, Map map) {
        j.f(str, "key");
        j.f(eVar, FirebaseAnalytics.Param.SOURCE);
        j.f(map, "attributes");
    }

    @Override // com.amazon.aps.iva.sq.f
    public final void q(com.amazon.aps.iva.sq.d dVar, String str, LinkedHashMap linkedHashMap) {
        j.f(dVar, "type");
        j.f(str, AppMeasurementSdk.ConditionalUserProperty.NAME);
    }

    @Override // com.amazon.aps.iva.sq.f
    public final void r(String str, com.amazon.aps.iva.sq.e eVar, Throwable th, Map<String, ? extends Object> map) {
        j.f(str, "message");
        j.f(eVar, FirebaseAnalytics.Param.SOURCE);
    }
}
