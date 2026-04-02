package com.crunchyroll.profiles.presentation.customizetooltip;

import com.amazon.aps.iva.kb0.q;
import com.amazon.aps.iva.o0.e0;
import com.amazon.aps.iva.o0.i;
import com.amazon.aps.iva.xb0.p;
import com.amazon.aps.iva.yb0.l;
/* compiled from: CustomizeProfileTooltipPreference.kt */
/* loaded from: classes2.dex */
public final class a extends l implements p<i, Integer, q> {
    public final /* synthetic */ CustomizeProfileTooltipPreference h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(CustomizeProfileTooltipPreference customizeProfileTooltipPreference) {
        super(2);
        this.h = customizeProfileTooltipPreference;
    }

    @Override // com.amazon.aps.iva.xb0.p
    public final q invoke(i iVar, Integer num) {
        i iVar2 = iVar;
        if ((num.intValue() & 11) == 2 && iVar2.h()) {
            iVar2.A();
        } else {
            e0.b bVar = e0.a;
            com.amazon.aps.iva.km.a.a(this.h.O, null, iVar2, 0, 2);
        }
        return q.a;
    }
}
