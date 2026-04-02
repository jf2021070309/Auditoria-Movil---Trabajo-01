package com.amazon.aps.iva.d4;

import com.amazon.aps.iva.d4.d;
import com.amazon.aps.iva.lb0.x;
import com.amazon.aps.iva.yb0.j;
import com.amazon.aps.iva.yb0.l;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
/* compiled from: Preferences.kt */
/* loaded from: classes.dex */
public final class a extends d {
    public final Map<d.a<?>, Object> a;
    public final AtomicBoolean b;

    /* compiled from: Preferences.kt */
    /* renamed from: com.amazon.aps.iva.d4.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C0190a extends l implements com.amazon.aps.iva.xb0.l<Map.Entry<d.a<?>, Object>, CharSequence> {
        public static final C0190a h = new C0190a();

        public C0190a() {
            super(1);
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final CharSequence invoke(Map.Entry<d.a<?>, Object> entry) {
            Map.Entry<d.a<?>, Object> entry2 = entry;
            j.f(entry2, "entry");
            return "  " + entry2.getKey().a + " = " + entry2.getValue();
        }
    }

    public a() {
        this(false, 3);
    }

    @Override // com.amazon.aps.iva.d4.d
    public final Map<d.a<?>, Object> a() {
        Map<d.a<?>, Object> unmodifiableMap = Collections.unmodifiableMap(this.a);
        j.e(unmodifiableMap, "unmodifiableMap(preferencesMap)");
        return unmodifiableMap;
    }

    @Override // com.amazon.aps.iva.d4.d
    public final <T> boolean b(d.a<T> aVar) {
        return this.a.containsKey(aVar);
    }

    @Override // com.amazon.aps.iva.d4.d
    public final <T> T c(d.a<T> aVar) {
        j.f(aVar, "key");
        return (T) this.a.get(aVar);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof a) {
            return j.a(this.a, ((a) obj).a);
        }
        return false;
    }

    public final void f() {
        if (!this.b.get()) {
            return;
        }
        throw new IllegalStateException("Do mutate preferences once returned to DataStore.".toString());
    }

    public final void g(d.a aVar) {
        j.f(aVar, "key");
        f();
        this.a.remove(aVar);
    }

    public final void h(d.a<?> aVar, Object obj) {
        j.f(aVar, "key");
        f();
        if (obj == null) {
            g(aVar);
            return;
        }
        boolean z = obj instanceof Set;
        Map<d.a<?>, Object> map = this.a;
        if (z) {
            Set unmodifiableSet = Collections.unmodifiableSet(x.c1((Iterable) obj));
            j.e(unmodifiableSet, "unmodifiableSet(value.toSet())");
            map.put(aVar, unmodifiableSet);
            return;
        }
        map.put(aVar, obj);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return x.B0(this.a.entrySet(), ",\n", "{\n", "\n}", C0190a.h, 24);
    }

    public /* synthetic */ a(boolean z, int i) {
        this((i & 1) != 0 ? new LinkedHashMap() : null, (i & 2) != 0 ? true : z);
    }

    public a(Map<d.a<?>, Object> map, boolean z) {
        j.f(map, "preferencesMap");
        this.a = map;
        this.b = new AtomicBoolean(z);
    }
}
