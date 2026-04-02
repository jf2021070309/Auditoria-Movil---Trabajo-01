package e.d.e.c0;

import java.lang.reflect.Method;
/* loaded from: classes2.dex */
public class u extends y {
    public final /* synthetic */ Method a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Object f7839b;

    public u(Method method, Object obj) {
        this.a = method;
        this.f7839b = obj;
    }

    @Override // e.d.e.c0.y
    public <T> T b(Class<T> cls) throws Exception {
        y.a(cls);
        return (T) this.a.invoke(this.f7839b, cls);
    }
}
