package c.p;

import android.app.Application;
import java.lang.reflect.InvocationTargetException;
/* loaded from: classes.dex */
public class h0 extends k0 {

    /* renamed from: b  reason: collision with root package name */
    public static h0 f2461b;

    /* renamed from: c  reason: collision with root package name */
    public Application f2462c;

    public h0(Application application) {
        this.f2462c = application;
    }

    @Override // c.p.k0, c.p.i0
    public <T extends g0> T a(Class<T> cls) {
        if (a.class.isAssignableFrom(cls)) {
            try {
                return cls.getConstructor(Application.class).newInstance(this.f2462c);
            } catch (IllegalAccessException e2) {
                throw new RuntimeException("Cannot create an instance of " + cls, e2);
            } catch (InstantiationException e3) {
                throw new RuntimeException("Cannot create an instance of " + cls, e3);
            } catch (NoSuchMethodException e4) {
                throw new RuntimeException("Cannot create an instance of " + cls, e4);
            } catch (InvocationTargetException e5) {
                throw new RuntimeException("Cannot create an instance of " + cls, e5);
            }
        }
        return (T) super.a(cls);
    }
}
