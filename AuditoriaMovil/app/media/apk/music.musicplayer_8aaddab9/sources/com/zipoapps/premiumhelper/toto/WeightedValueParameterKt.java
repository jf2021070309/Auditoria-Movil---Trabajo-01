package com.zipoapps.premiumhelper.toto;

import h.l.c;
import h.o.c.j;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
/* loaded from: classes2.dex */
public final class WeightedValueParameterKt {
    public static final List<WeightedValueParameter> asWeightedParamsList(Map<String, ? extends Map<String, Integer>> map) {
        j.e(map, "<this>");
        ArrayList arrayList = new ArrayList(map.size());
        for (Map.Entry<String, ? extends Map<String, Integer>> entry : map.entrySet()) {
            arrayList.add(new WeightedValueParameter(entry.getKey(), entry.getValue()));
        }
        return c.j(arrayList);
    }
}
