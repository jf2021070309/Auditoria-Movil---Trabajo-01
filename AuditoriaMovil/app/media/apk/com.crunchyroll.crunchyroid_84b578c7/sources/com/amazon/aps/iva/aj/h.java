package com.amazon.aps.iva.aj;

import com.amazon.aps.iva.yb0.l;
/* compiled from: ParentalControlsFeatureImpl.kt */
/* loaded from: classes.dex */
public final class h extends l implements com.amazon.aps.iva.xb0.a<Boolean> {
    public static final h h = new h();

    public h() {
        super(0);
    }

    @Override // com.amazon.aps.iva.xb0.a
    public final Boolean invoke() {
        boolean z;
        e eVar = j.d;
        if (eVar != null) {
            if (!eVar.getCountryCodeProvider().isUserCountryBrazil()) {
                e eVar2 = j.d;
                if (eVar2 != null) {
                    if (!eVar2.getCountryCodeProvider().isUserCountryNewZealand()) {
                        z = false;
                        return Boolean.valueOf(z);
                    }
                } else {
                    com.amazon.aps.iva.yb0.j.m("dependencies");
                    throw null;
                }
            }
            z = true;
            return Boolean.valueOf(z);
        }
        com.amazon.aps.iva.yb0.j.m("dependencies");
        throw null;
    }
}
