package e.d.e.c0;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
/* JADX INFO: Add missing generic type declarations: [T] */
/* loaded from: classes2.dex */
public class h<T> implements t<T> {
    public final /* synthetic */ Constructor a;

    public h(g gVar, Constructor constructor) {
        this.a = constructor;
    }

    @Override // e.d.e.c0.t
    public T a() {
        try {
            return (T) this.a.newInstance(null);
        } catch (IllegalAccessException e2) {
            throw new AssertionError(e2);
        } catch (InstantiationException e3) {
            StringBuilder y = e.a.d.a.a.y("Failed to invoke ");
            y.append(this.a);
            y.append(" with no args");
            throw new RuntimeException(y.toString(), e3);
        } catch (InvocationTargetException e4) {
            StringBuilder y2 = e.a.d.a.a.y("Failed to invoke ");
            y2.append(this.a);
            y2.append(" with no args");
            throw new RuntimeException(y2.toString(), e4.getTargetException());
        }
    }
}
