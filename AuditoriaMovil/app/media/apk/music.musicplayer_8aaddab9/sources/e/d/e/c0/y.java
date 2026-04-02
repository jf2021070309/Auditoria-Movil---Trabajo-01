package e.d.e.c0;

import java.lang.reflect.Modifier;
/* loaded from: classes2.dex */
public abstract class y {
    public static void a(Class<?> cls) {
        int modifiers = cls.getModifiers();
        if (Modifier.isInterface(modifiers)) {
            StringBuilder y = e.a.d.a.a.y("Interface can't be instantiated! Interface name: ");
            y.append(cls.getName());
            throw new UnsupportedOperationException(y.toString());
        } else if (Modifier.isAbstract(modifiers)) {
            StringBuilder y2 = e.a.d.a.a.y("Abstract class can't be instantiated! Class name: ");
            y2.append(cls.getName());
            throw new UnsupportedOperationException(y2.toString());
        }
    }

    public abstract <T> T b(Class<T> cls) throws Exception;
}
