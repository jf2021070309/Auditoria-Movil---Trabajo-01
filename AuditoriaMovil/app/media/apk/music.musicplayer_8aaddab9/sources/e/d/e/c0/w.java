package e.d.e.c0;

import java.lang.reflect.Method;
/* loaded from: classes2.dex */
public class w extends y {
    public final /* synthetic */ Method a;

    public w(Method method) {
        this.a = method;
    }

    @Override // e.d.e.c0.y
    public <T> T b(Class<T> cls) throws Exception {
        y.a(cls);
        return (T) this.a.invoke(null, cls, Object.class);
    }
}
