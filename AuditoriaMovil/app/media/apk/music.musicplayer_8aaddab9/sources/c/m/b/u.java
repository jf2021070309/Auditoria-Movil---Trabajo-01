package c.m.b;

import androidx.fragment.app.Fragment;
/* loaded from: classes.dex */
public class u {
    public static final c.f.h<ClassLoader, c.f.h<String, Class<?>>> a = new c.f.h<>();

    public static Class<?> b(ClassLoader classLoader, String str) throws ClassNotFoundException {
        c.f.h<ClassLoader, c.f.h<String, Class<?>>> hVar = a;
        c.f.h<String, Class<?>> orDefault = hVar.getOrDefault(classLoader, null);
        if (orDefault == null) {
            orDefault = new c.f.h<>();
            hVar.put(classLoader, orDefault);
        }
        Class<?> orDefault2 = orDefault.getOrDefault(str, null);
        if (orDefault2 == null) {
            Class<?> cls = Class.forName(str, false, classLoader);
            orDefault.put(str, cls);
            return cls;
        }
        return orDefault2;
    }

    public static Class<? extends Fragment> c(ClassLoader classLoader, String str) {
        try {
            return b(classLoader, str);
        } catch (ClassCastException e2) {
            throw new Fragment.j(e.a.d.a.a.l("Unable to instantiate fragment ", str, ": make sure class is a valid subclass of Fragment"), e2);
        } catch (ClassNotFoundException e3) {
            throw new Fragment.j(e.a.d.a.a.l("Unable to instantiate fragment ", str, ": make sure class name exists"), e3);
        }
    }

    public Fragment a(ClassLoader classLoader, String str) {
        throw null;
    }
}
