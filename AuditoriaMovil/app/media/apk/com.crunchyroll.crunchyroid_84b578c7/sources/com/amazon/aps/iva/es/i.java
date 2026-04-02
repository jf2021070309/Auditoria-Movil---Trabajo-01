package com.amazon.aps.iva.es;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
/* compiled from: BaseAnalyticsTrackEvent.kt */
/* loaded from: classes2.dex */
public class i {
    public final String a;
    public final com.amazon.aps.iva.is.a[] b;

    public i(String str, com.amazon.aps.iva.is.a... aVarArr) {
        com.amazon.aps.iva.yb0.j.f(str, AppMeasurementSdk.ConditionalUserProperty.NAME);
        com.amazon.aps.iva.yb0.j.f(aVarArr, "properties");
        this.a = str;
        this.b = aVarArr;
    }
}
