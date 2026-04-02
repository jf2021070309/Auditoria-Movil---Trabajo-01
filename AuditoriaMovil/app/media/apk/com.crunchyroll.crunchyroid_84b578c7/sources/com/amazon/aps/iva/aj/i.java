package com.amazon.aps.iva.aj;

import com.amazon.aps.iva.yb0.l;
/* compiled from: ParentalControlsFeatureImpl.kt */
/* loaded from: classes.dex */
public final class i extends l implements com.amazon.aps.iva.xb0.a<Boolean> {
    public static final i h = new i();

    public i() {
        super(0);
    }

    @Override // com.amazon.aps.iva.xb0.a
    public final Boolean invoke() {
        e eVar = j.d;
        if (eVar != null) {
            return Boolean.valueOf(eVar.getCountryCodeProvider().isUserCountryBrazil());
        }
        com.amazon.aps.iva.yb0.j.m("dependencies");
        throw null;
    }
}
