package androidx.fragment.app;

import androidx.fragment.app.Fragment;
/* compiled from: FragmentFactory.java */
/* loaded from: classes.dex */
public class j {
    public static final com.amazon.aps.iva.x.h<ClassLoader, com.amazon.aps.iva.x.h<String, Class<?>>> a = new com.amazon.aps.iva.x.h<>();

    public static Class<?> b(ClassLoader classLoader, String str) throws ClassNotFoundException {
        com.amazon.aps.iva.x.h<ClassLoader, com.amazon.aps.iva.x.h<String, Class<?>>> hVar = a;
        com.amazon.aps.iva.x.h<String, Class<?>> orDefault = hVar.getOrDefault(classLoader, null);
        if (orDefault == null) {
            orDefault = new com.amazon.aps.iva.x.h<>();
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
        } catch (ClassCastException e) {
            throw new Fragment.k(defpackage.e.e("Unable to instantiate fragment ", str, ": make sure class is a valid subclass of Fragment"), e);
        } catch (ClassNotFoundException e2) {
            throw new Fragment.k(defpackage.e.e("Unable to instantiate fragment ", str, ": make sure class name exists"), e2);
        }
    }

    public Fragment a(String str) {
        throw null;
    }
}
