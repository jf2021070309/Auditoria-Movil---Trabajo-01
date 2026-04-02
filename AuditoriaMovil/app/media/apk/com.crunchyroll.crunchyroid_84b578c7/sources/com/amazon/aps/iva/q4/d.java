package com.amazon.aps.iva.q4;

import com.amazon.aps.iva.q4.c;
import com.amazon.aps.iva.yb0.j;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
/* compiled from: ActionParameters.kt */
/* loaded from: classes.dex */
public final class d extends c {
    public final Map<c.a<? extends Object>, Object> a;

    public d() {
        this(new LinkedHashMap());
    }

    @Override // com.amazon.aps.iva.q4.c
    public final Map<c.a<? extends Object>, Object> a() {
        Map<c.a<? extends Object>, Object> unmodifiableMap = Collections.unmodifiableMap(this.a);
        j.e(unmodifiableMap, "unmodifiableMap(map)");
        return unmodifiableMap;
    }

    @Override // com.amazon.aps.iva.q4.c
    public final <T> T b(c.a<T> aVar) {
        j.f(aVar, "key");
        return (T) this.a.get(aVar);
    }

    @Override // com.amazon.aps.iva.q4.c
    public final boolean c() {
        return this.a.isEmpty();
    }

    public final void d(c.a aVar, Object obj) {
        j.f(aVar, "key");
        b(aVar);
        Map<c.a<? extends Object>, Object> map = this.a;
        if (obj == null) {
            map.remove(aVar);
        } else {
            map.put(aVar, obj);
        }
    }

    public final boolean equals(Object obj) {
        if (obj instanceof d) {
            if (j.a(this.a, ((d) obj).a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return this.a.toString();
    }

    public d(Map<c.a<? extends Object>, Object> map) {
        j.f(map, "map");
        this.a = map;
    }
}
