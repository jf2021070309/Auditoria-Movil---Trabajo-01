package e.d.e.c0;

import java.lang.reflect.Method;
/* loaded from: classes2.dex */
public class v extends y {
    public final /* synthetic */ Method a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ int f7840b;

    public v(Method method, int i2) {
        this.a = method;
        this.f7840b = i2;
    }

    @Override // e.d.e.c0.y
    public <T> T b(Class<T> cls) throws Exception {
        y.a(cls);
        return (T) this.a.invoke(null, cls, Integer.valueOf(this.f7840b));
    }
}
