package com.amazon.aps.iva.ke0;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.Arrays;
import java.util.Collection;
/* compiled from: modifierChecks.kt */
/* loaded from: classes4.dex */
public final class k {
    public final com.amazon.aps.iva.nd0.f a;
    public final com.amazon.aps.iva.oe0.f b;
    public final Collection<com.amazon.aps.iva.nd0.f> c;
    public final com.amazon.aps.iva.xb0.l<com.amazon.aps.iva.oc0.v, String> d;
    public final f[] e;

    public k() {
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public k(com.amazon.aps.iva.nd0.f fVar, com.amazon.aps.iva.oe0.f fVar2, Collection<com.amazon.aps.iva.nd0.f> collection, com.amazon.aps.iva.xb0.l<? super com.amazon.aps.iva.oc0.v, String> lVar, f... fVarArr) {
        this.a = fVar;
        this.b = fVar2;
        this.c = collection;
        this.d = lVar;
        this.e = fVarArr;
    }

    public /* synthetic */ k(com.amazon.aps.iva.nd0.f fVar, f[] fVarArr) {
        this(fVar, fVarArr, h.h);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public k(com.amazon.aps.iva.nd0.f fVar, f[] fVarArr, com.amazon.aps.iva.xb0.l<? super com.amazon.aps.iva.oc0.v, String> lVar) {
        this(fVar, null, null, lVar, (f[]) Arrays.copyOf(fVarArr, fVarArr.length));
        com.amazon.aps.iva.yb0.j.f(fVar, AppMeasurementSdk.ConditionalUserProperty.NAME);
        com.amazon.aps.iva.yb0.j.f(lVar, "additionalChecks");
    }

    public /* synthetic */ k(Collection collection, f[] fVarArr) {
        this(collection, fVarArr, j.h);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public k(Collection<com.amazon.aps.iva.nd0.f> collection, f[] fVarArr, com.amazon.aps.iva.xb0.l<? super com.amazon.aps.iva.oc0.v, String> lVar) {
        this(null, null, collection, lVar, (f[]) Arrays.copyOf(fVarArr, fVarArr.length));
        com.amazon.aps.iva.yb0.j.f(collection, "nameList");
        com.amazon.aps.iva.yb0.j.f(lVar, "additionalChecks");
    }
}
