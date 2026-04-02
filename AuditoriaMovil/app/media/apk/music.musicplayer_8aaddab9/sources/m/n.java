package m;

import java.lang.reflect.Method;
import java.util.Collections;
import java.util.List;
/* loaded from: classes2.dex */
public final class n {
    public final Method a;

    /* renamed from: b  reason: collision with root package name */
    public final List<?> f9869b;

    public n(Method method, List<?> list) {
        this.a = method;
        this.f9869b = Collections.unmodifiableList(list);
    }

    public String toString() {
        return String.format("%s.%s() %s", this.a.getDeclaringClass().getName(), this.a.getName(), this.f9869b);
    }
}
