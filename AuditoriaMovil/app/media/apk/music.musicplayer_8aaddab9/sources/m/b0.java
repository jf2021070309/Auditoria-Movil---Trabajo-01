package m;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import javax.annotation.Nullable;
/* loaded from: classes.dex */
public class b0 implements InvocationHandler {
    public final x a = x.a;

    /* renamed from: b  reason: collision with root package name */
    public final Object[] f9843b = new Object[0];

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ Class f9844c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ c0 f9845d;

    public b0(c0 c0Var, Class cls) {
        this.f9845d = c0Var;
        this.f9844c = cls;
    }

    @Override // java.lang.reflect.InvocationHandler
    @Nullable
    public Object invoke(Object obj, Method method, @Nullable Object[] objArr) throws Throwable {
        if (method.getDeclaringClass() == Object.class) {
            return method.invoke(this, objArr);
        }
        if (this.a.f(method)) {
            return this.a.e(method, this.f9844c, obj, objArr);
        }
        d0<?> b2 = this.f9845d.b(method);
        if (objArr == null) {
            objArr = this.f9843b;
        }
        return b2.a(objArr);
    }
}
