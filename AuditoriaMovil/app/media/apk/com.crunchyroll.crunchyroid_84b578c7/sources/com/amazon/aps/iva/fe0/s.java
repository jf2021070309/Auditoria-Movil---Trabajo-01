package com.amazon.aps.iva.fe0;

import com.amazon.aps.iva.ee0.m0;
import com.amazon.aps.iva.lb0.x;
import java.util.LinkedHashSet;
import java.util.Set;
/* compiled from: IntersectionType.kt */
/* loaded from: classes4.dex */
public final class s extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a<String> {
    public final /* synthetic */ Set<m0> h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(LinkedHashSet linkedHashSet) {
        super(0);
        this.h = linkedHashSet;
    }

    @Override // com.amazon.aps.iva.xb0.a
    public final String invoke() {
        return "This collections cannot be empty! input types: ".concat(x.B0(this.h, null, null, null, null, 63));
    }
}
