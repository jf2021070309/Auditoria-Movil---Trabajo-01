package c.b0;

import android.os.Parcelable;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
/* loaded from: classes.dex */
public abstract class b {
    public final c.f.a<String, Method> a;

    /* renamed from: b  reason: collision with root package name */
    public final c.f.a<String, Method> f1287b;

    /* renamed from: c  reason: collision with root package name */
    public final c.f.a<String, Class> f1288c;

    public b(c.f.a<String, Method> aVar, c.f.a<String, Method> aVar2, c.f.a<String, Class> aVar3) {
        this.a = aVar;
        this.f1287b = aVar2;
        this.f1288c = aVar3;
    }

    public abstract void a();

    public abstract b b();

    public final Class c(Class<? extends d> cls) throws ClassNotFoundException {
        Class orDefault = this.f1288c.getOrDefault(cls.getName(), null);
        if (orDefault == null) {
            Class<?> cls2 = Class.forName(String.format("%s.%sParcelizer", cls.getPackage().getName(), cls.getSimpleName()), false, cls.getClassLoader());
            this.f1288c.put(cls.getName(), cls2);
            return cls2;
        }
        return orDefault;
    }

    public final Method d(String str) throws IllegalAccessException, NoSuchMethodException, ClassNotFoundException {
        Method orDefault = this.a.getOrDefault(str, null);
        if (orDefault == null) {
            System.currentTimeMillis();
            Method declaredMethod = Class.forName(str, true, b.class.getClassLoader()).getDeclaredMethod("read", b.class);
            this.a.put(str, declaredMethod);
            return declaredMethod;
        }
        return orDefault;
    }

    public final Method e(Class cls) throws IllegalAccessException, NoSuchMethodException, ClassNotFoundException {
        Method orDefault = this.f1287b.getOrDefault(cls.getName(), null);
        if (orDefault == null) {
            Class c2 = c(cls);
            System.currentTimeMillis();
            Method declaredMethod = c2.getDeclaredMethod("write", cls, b.class);
            this.f1287b.put(cls.getName(), declaredMethod);
            return declaredMethod;
        }
        return orDefault;
    }

    public abstract boolean f();

    public abstract byte[] g();

    public abstract CharSequence h();

    public abstract boolean i(int i2);

    public abstract int j();

    public int k(int i2, int i3) {
        return !i(i3) ? i2 : j();
    }

    public abstract <T extends Parcelable> T l();

    public <T extends Parcelable> T m(T t, int i2) {
        return !i(i2) ? t : (T) l();
    }

    public abstract String n();

    public <T extends d> T o() {
        String n2 = n();
        if (n2 == null) {
            return null;
        }
        try {
            return (T) d(n2).invoke(null, b());
        } catch (ClassNotFoundException e2) {
            throw new RuntimeException("VersionedParcel encountered ClassNotFoundException", e2);
        } catch (IllegalAccessException e3) {
            throw new RuntimeException("VersionedParcel encountered IllegalAccessException", e3);
        } catch (NoSuchMethodException e4) {
            throw new RuntimeException("VersionedParcel encountered NoSuchMethodException", e4);
        } catch (InvocationTargetException e5) {
            if (e5.getCause() instanceof RuntimeException) {
                throw ((RuntimeException) e5.getCause());
            }
            throw new RuntimeException("VersionedParcel encountered InvocationTargetException", e5);
        }
    }

    public abstract void p(int i2);

    public abstract void q(boolean z);

    public abstract void r(byte[] bArr);

    public abstract void s(CharSequence charSequence);

    public abstract void t(int i2);

    public abstract void u(Parcelable parcelable);

    public abstract void v(String str);

    /* JADX WARN: Multi-variable type inference failed */
    public void w(d dVar) {
        if (dVar == null) {
            v(null);
            return;
        }
        try {
            v(c(dVar.getClass()).getName());
            b b2 = b();
            try {
                e(dVar.getClass()).invoke(null, dVar, b2);
                b2.a();
            } catch (ClassNotFoundException e2) {
                throw new RuntimeException("VersionedParcel encountered ClassNotFoundException", e2);
            } catch (IllegalAccessException e3) {
                throw new RuntimeException("VersionedParcel encountered IllegalAccessException", e3);
            } catch (NoSuchMethodException e4) {
                throw new RuntimeException("VersionedParcel encountered NoSuchMethodException", e4);
            } catch (InvocationTargetException e5) {
                if (!(e5.getCause() instanceof RuntimeException)) {
                    throw new RuntimeException("VersionedParcel encountered InvocationTargetException", e5);
                }
                throw ((RuntimeException) e5.getCause());
            }
        } catch (ClassNotFoundException e6) {
            throw new RuntimeException(dVar.getClass().getSimpleName() + " does not have a Parcelizer", e6);
        }
    }
}
