package com.amazon.aps.iva.we0;

import com.amazon.aps.iva.ve0.l0;
import com.amazon.aps.iva.ve0.u0;
/* compiled from: AbstractSharedFlow.kt */
/* loaded from: classes4.dex */
public final class t extends l0<Integer> implements u0<Integer> {
    public t(int i) {
        super(1, Integer.MAX_VALUE, com.amazon.aps.iva.ue0.e.DROP_OLDEST);
        b(Integer.valueOf(i));
    }

    @Override // com.amazon.aps.iva.ve0.u0, com.amazon.aps.iva.ve0.g0
    public final Integer getValue() {
        Integer valueOf;
        synchronized (this) {
            Object[] objArr = this.i;
            com.amazon.aps.iva.yb0.j.c(objArr);
            valueOf = Integer.valueOf(((Number) objArr[((int) ((this.j + ((int) ((p() + this.l) - this.j))) - 1)) & (objArr.length - 1)]).intValue());
        }
        return valueOf;
    }
}
