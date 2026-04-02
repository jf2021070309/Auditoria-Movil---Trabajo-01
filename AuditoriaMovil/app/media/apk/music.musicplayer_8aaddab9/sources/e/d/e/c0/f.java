package e.d.e.c0;

import java.io.ObjectInputStream;
import java.io.ObjectStreamClass;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
/* JADX INFO: Add missing generic type declarations: [T] */
/* loaded from: classes2.dex */
public class f<T> implements t<T> {
    public final y a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Class f7810b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ Type f7811c;

    public f(g gVar, Class cls, Type type) {
        y xVar;
        this.f7810b = cls;
        this.f7811c = type;
        try {
            Class<?> cls2 = Class.forName("sun.misc.Unsafe");
            Field declaredField = cls2.getDeclaredField("theUnsafe");
            declaredField.setAccessible(true);
            xVar = new u(cls2.getMethod("allocateInstance", Class.class), declaredField.get(null));
        } catch (Exception unused) {
            try {
                try {
                    Method declaredMethod = ObjectStreamClass.class.getDeclaredMethod("getConstructorId", Class.class);
                    declaredMethod.setAccessible(true);
                    int intValue = ((Integer) declaredMethod.invoke(null, Object.class)).intValue();
                    Method declaredMethod2 = ObjectStreamClass.class.getDeclaredMethod("newInstance", Class.class, Integer.TYPE);
                    declaredMethod2.setAccessible(true);
                    xVar = new v(declaredMethod2, intValue);
                } catch (Exception unused2) {
                    Method declaredMethod3 = ObjectInputStream.class.getDeclaredMethod("newInstance", Class.class, Class.class);
                    declaredMethod3.setAccessible(true);
                    xVar = new w(declaredMethod3);
                }
            } catch (Exception unused3) {
                xVar = new x();
            }
        }
        this.a = xVar;
    }

    @Override // e.d.e.c0.t
    public T a() {
        try {
            return (T) this.a.b(this.f7810b);
        } catch (Exception e2) {
            StringBuilder y = e.a.d.a.a.y("Unable to invoke no-args constructor for ");
            y.append(this.f7811c);
            y.append(". Registering an InstanceCreator with Gson for this type may fix this problem.");
            throw new RuntimeException(y.toString(), e2);
        }
    }
}
