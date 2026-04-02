package com.amazon.aps.iva.jf0;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
/* compiled from: Invocation.java */
/* loaded from: classes4.dex */
public final class k {
    public final Method a;
    public final List<?> b;

    public k(Method method, ArrayList arrayList) {
        this.a = method;
        this.b = Collections.unmodifiableList(arrayList);
    }

    public final String toString() {
        Method method = this.a;
        return String.format("%s.%s() %s", method.getDeclaringClass().getName(), method.getName(), this.b);
    }
}
