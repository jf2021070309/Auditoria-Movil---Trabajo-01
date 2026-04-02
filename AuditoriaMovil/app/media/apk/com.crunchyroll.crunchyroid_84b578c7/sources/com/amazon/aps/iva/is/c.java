package com.amazon.aps.iva.is;

import com.amazon.aps.iva.aq.k;
import com.amazon.aps.iva.kb0.j;
import java.util.Map;
/* compiled from: BasePrimitiveAnalyticsProperty.kt */
/* loaded from: classes2.dex */
public abstract class c extends a {
    private final String name;
    private final Object value;

    public c(String str, Object obj) {
        this.name = str;
        this.value = obj;
    }

    @Override // com.amazon.aps.iva.is.a
    public final Map<String, Object> a() {
        return k.x(new j(this.name, this.value));
    }
}
