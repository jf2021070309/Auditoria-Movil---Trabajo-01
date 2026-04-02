package com.amazon.aps.iva.d4;

import com.amazon.aps.iva.oe0.q;
import com.amazon.aps.iva.yb0.j;
import com.amazon.aps.iva.yb0.l;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.io.File;
/* compiled from: PreferenceDataStoreFactory.kt */
/* loaded from: classes.dex */
public final class c extends l implements com.amazon.aps.iva.xb0.a<File> {
    public final /* synthetic */ com.amazon.aps.iva.xb0.a<File> h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public c(com.amazon.aps.iva.xb0.a<? extends File> aVar) {
        super(0);
        this.h = aVar;
    }

    @Override // com.amazon.aps.iva.xb0.a
    public final File invoke() {
        File invoke = this.h.invoke();
        j.f(invoke, "<this>");
        String name = invoke.getName();
        j.e(name, AppMeasurementSdk.ConditionalUserProperty.NAME);
        if (j.a(q.K0('.', name, ""), "preferences_pb")) {
            return invoke;
        }
        throw new IllegalStateException(("File extension for file: " + invoke + " does not match required extension for Preferences file: preferences_pb").toString());
    }
}
