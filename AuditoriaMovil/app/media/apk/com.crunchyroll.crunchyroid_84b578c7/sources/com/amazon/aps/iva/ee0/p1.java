package com.amazon.aps.iva.ee0;

import com.amazon.aps.iva.lc0.o;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
/* compiled from: TypeSubstitutor.java */
/* loaded from: classes4.dex */
public final class p1 implements com.amazon.aps.iva.xb0.l<com.amazon.aps.iva.nd0.c, Boolean> {
    @Override // com.amazon.aps.iva.xb0.l
    public final Boolean invoke(com.amazon.aps.iva.nd0.c cVar) {
        com.amazon.aps.iva.nd0.c cVar2 = cVar;
        if (cVar2 != null) {
            return Boolean.valueOf(!cVar2.equals(o.a.y));
        }
        throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", AppMeasurementSdk.ConditionalUserProperty.NAME, "kotlin/reflect/jvm/internal/impl/types/TypeSubstitutor$1", "invoke"));
    }
}
