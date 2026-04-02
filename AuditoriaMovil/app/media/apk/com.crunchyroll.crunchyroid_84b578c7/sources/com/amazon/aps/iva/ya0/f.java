package com.amazon.aps.iva.ya0;

import android.content.ContextWrapper;
import com.amazon.aps.iva.fc0.l;
import com.amazon.aps.iva.yb0.e0;
import com.amazon.aps.iva.yb0.j;
import com.amazon.aps.iva.yb0.v;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
/* compiled from: ViewPumpContextWrapper.kt */
/* loaded from: classes4.dex */
public final class f extends ContextWrapper {
    public static final /* synthetic */ l[] b = {e0.c(new v(e0.a(f.class), "inflater", "getInflater()Lio/github/inflationx/viewpump/internal/-ViewPumpLayoutInflater;"))};
    public static final a c = new a();
    public final com.amazon.aps.iva.kb0.e a;

    /* compiled from: ViewPumpContextWrapper.kt */
    /* loaded from: classes4.dex */
    public static final class a {
    }

    public f(com.amazon.aps.iva.v90.b bVar) {
        super(bVar);
        this.a = com.amazon.aps.iva.kb0.f.a(com.amazon.aps.iva.kb0.g.NONE, new g(this));
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final Object getSystemService(String str) {
        j.g(str, AppMeasurementSdk.ConditionalUserProperty.NAME);
        if (j.a("layout_inflater", str)) {
            com.amazon.aps.iva.kb0.e eVar = this.a;
            l lVar = b[0];
            return (com.amazon.aps.iva.za0.c) eVar.getValue();
        }
        return super.getSystemService(str);
    }
}
