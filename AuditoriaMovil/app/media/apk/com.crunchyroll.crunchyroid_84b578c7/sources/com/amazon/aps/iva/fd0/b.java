package com.amazon.aps.iva.fd0;

import java.util.Map;
/* compiled from: AbstractSignatureParts.kt */
/* loaded from: classes4.dex */
public final class b extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<Integer, h> {
    public final /* synthetic */ x h;
    public final /* synthetic */ h[] i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(x xVar, h[] hVarArr) {
        super(1);
        this.h = xVar;
        this.i = hVarArr;
    }

    @Override // com.amazon.aps.iva.xb0.l
    public final h invoke(Integer num) {
        Map<Integer, h> map;
        h hVar;
        int intValue = num.intValue();
        x xVar = this.h;
        if (xVar == null || (map = xVar.a) == null || (hVar = map.get(Integer.valueOf(intValue))) == null) {
            if (intValue >= 0) {
                h[] hVarArr = this.i;
                com.amazon.aps.iva.yb0.j.f(hVarArr, "<this>");
                if (intValue <= hVarArr.length - 1) {
                    return hVarArr[intValue];
                }
            }
            return h.e;
        }
        return hVar;
    }
}
