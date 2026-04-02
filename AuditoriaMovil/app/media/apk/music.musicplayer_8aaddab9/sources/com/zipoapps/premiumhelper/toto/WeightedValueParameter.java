package com.zipoapps.premiumhelper.toto;

import ch.qos.logback.core.CoreConstants;
import e.a.d.a.a;
import h.o.c.j;
import h.p.c;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
/* loaded from: classes2.dex */
public final class WeightedValueParameter {
    private final String name;
    private final Map<String, Integer> weighted_values;

    public WeightedValueParameter(String str, Map<String, Integer> map) {
        j.e(str, "name");
        j.e(map, "weighted_values");
        this.name = str;
        this.weighted_values = map;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ WeightedValueParameter copy$default(WeightedValueParameter weightedValueParameter, String str, Map map, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = weightedValueParameter.name;
        }
        if ((i2 & 2) != 0) {
            map = weightedValueParameter.weighted_values;
        }
        return weightedValueParameter.copy(str, map);
    }

    public final String component1() {
        return this.name;
    }

    public final Map<String, Integer> component2() {
        return this.weighted_values;
    }

    public final WeightedValueParameter copy(String str, Map<String, Integer> map) {
        j.e(str, "name");
        j.e(map, "weighted_values");
        return new WeightedValueParameter(str, map);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof WeightedValueParameter) {
            WeightedValueParameter weightedValueParameter = (WeightedValueParameter) obj;
            return j.a(this.name, weightedValueParameter.name) && j.a(this.weighted_values, weightedValueParameter.weighted_values);
        }
        return false;
    }

    public final String getName() {
        return this.name;
    }

    public final Map<String, Integer> getWeighted_values() {
        return this.weighted_values;
    }

    public final int hash() {
        return this.weighted_values.hashCode();
    }

    public int hashCode() {
        return this.weighted_values.hashCode() + (this.name.hashCode() * 31);
    }

    public final String pickRandomValue() {
        Object next;
        if (this.weighted_values.size() == 1) {
            Set<String> keySet = this.weighted_values.keySet();
            j.e(keySet, "<this>");
            if (keySet instanceof List) {
                List list = (List) keySet;
                j.e(list, "<this>");
                if (list.isEmpty()) {
                    throw new NoSuchElementException("List is empty.");
                }
                next = list.get(0);
            } else {
                Iterator<T> it = keySet.iterator();
                if (!it.hasNext()) {
                    throw new NoSuchElementException("Collection is empty.");
                }
                next = it.next();
            }
            return (String) next;
        }
        c.a aVar = c.a;
        int i2 = 0;
        for (Number number : this.weighted_values.values()) {
            i2 += number.intValue();
        }
        int f2 = c.f8949b.f(0, i2);
        for (Map.Entry<String, Integer> entry : this.weighted_values.entrySet()) {
            f2 -= entry.getValue().intValue();
            if (f2 < 0) {
                return entry.getKey();
            }
        }
        throw new IllegalStateException("Should never get here!");
    }

    public String toString() {
        StringBuilder y = a.y("WeightedValueParameter(name=");
        y.append(this.name);
        y.append(", weighted_values=");
        y.append(this.weighted_values);
        y.append(CoreConstants.RIGHT_PARENTHESIS_CHAR);
        return y.toString();
    }
}
