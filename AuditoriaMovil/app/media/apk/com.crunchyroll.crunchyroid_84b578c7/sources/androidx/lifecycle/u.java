package androidx.lifecycle;

import android.app.Application;
import com.amazon.aps.iva.i5.f0;
import com.amazon.aps.iva.i5.g0;
import com.amazon.aps.iva.k5.a;
import java.lang.reflect.InvocationTargetException;
/* compiled from: ViewModelProvider.kt */
/* loaded from: classes.dex */
public final class u {
    public final g0 a;
    public final b b;
    public final com.amazon.aps.iva.k5.a c;

    /* compiled from: ViewModelProvider.kt */
    /* loaded from: classes.dex */
    public static class a extends c {
        public static a c;
        public final Application b;

        public a(Application application) {
            this.b = application;
        }

        @Override // androidx.lifecycle.u.b
        public final f0 a(Class cls, com.amazon.aps.iva.k5.c cVar) {
            com.amazon.aps.iva.yb0.j.f(cls, "modelClass");
            if (this.b != null) {
                return b(cls);
            }
            Application application = (Application) cVar.a.get(t.a);
            if (application != null) {
                return c(cls, application);
            }
            if (!com.amazon.aps.iva.i5.a.class.isAssignableFrom(cls)) {
                return super.b(cls);
            }
            throw new IllegalArgumentException("CreationExtras must have an application by `APPLICATION_KEY`");
        }

        @Override // androidx.lifecycle.u.c, androidx.lifecycle.u.b
        public final <T extends f0> T b(Class<T> cls) {
            com.amazon.aps.iva.yb0.j.f(cls, "modelClass");
            Application application = this.b;
            if (application != null) {
                return (T) c(cls, application);
            }
            throw new UnsupportedOperationException("AndroidViewModelFactory constructed with empty constructor works only with create(modelClass: Class<T>, extras: CreationExtras).");
        }

        public final <T extends f0> T c(Class<T> cls, Application application) {
            if (com.amazon.aps.iva.i5.a.class.isAssignableFrom(cls)) {
                try {
                    T newInstance = cls.getConstructor(Application.class).newInstance(application);
                    com.amazon.aps.iva.yb0.j.e(newInstance, "{\n                try {\n…          }\n            }");
                    return newInstance;
                } catch (IllegalAccessException e) {
                    throw new RuntimeException(defpackage.e.d("Cannot create an instance of ", cls), e);
                } catch (InstantiationException e2) {
                    throw new RuntimeException(defpackage.e.d("Cannot create an instance of ", cls), e2);
                } catch (NoSuchMethodException e3) {
                    throw new RuntimeException(defpackage.e.d("Cannot create an instance of ", cls), e3);
                } catch (InvocationTargetException e4) {
                    throw new RuntimeException(defpackage.e.d("Cannot create an instance of ", cls), e4);
                }
            }
            return (T) super.b(cls);
        }
    }

    /* compiled from: ViewModelProvider.kt */
    /* loaded from: classes.dex */
    public interface b {
        default f0 a(Class cls, com.amazon.aps.iva.k5.c cVar) {
            com.amazon.aps.iva.yb0.j.f(cls, "modelClass");
            return b(cls);
        }

        default <T extends f0> T b(Class<T> cls) {
            com.amazon.aps.iva.yb0.j.f(cls, "modelClass");
            throw new UnsupportedOperationException("Factory.create(String) is unsupported.  This Factory requires `CreationExtras` to be passed into `create` method.");
        }
    }

    /* compiled from: ViewModelProvider.kt */
    /* loaded from: classes.dex */
    public static class c implements b {
        public static c a;

        @Override // androidx.lifecycle.u.b
        public <T extends f0> T b(Class<T> cls) {
            com.amazon.aps.iva.yb0.j.f(cls, "modelClass");
            try {
                T newInstance = cls.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
                com.amazon.aps.iva.yb0.j.e(newInstance, "{\n                modelC…wInstance()\n            }");
                return newInstance;
            } catch (IllegalAccessException e) {
                throw new RuntimeException(defpackage.e.d("Cannot create an instance of ", cls), e);
            } catch (InstantiationException e2) {
                throw new RuntimeException(defpackage.e.d("Cannot create an instance of ", cls), e2);
            } catch (NoSuchMethodException e3) {
                throw new RuntimeException(defpackage.e.d("Cannot create an instance of ", cls), e3);
            }
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public u(g0 g0Var, b bVar) {
        this(g0Var, bVar, 0);
        com.amazon.aps.iva.yb0.j.f(g0Var, "store");
        com.amazon.aps.iva.yb0.j.f(bVar, "factory");
    }

    public final <T extends f0> T a(Class<T> cls) {
        com.amazon.aps.iva.yb0.j.f(cls, "modelClass");
        String canonicalName = cls.getCanonicalName();
        if (canonicalName != null) {
            return (T) b(cls, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(canonicalName));
        }
        throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
    }

    public final f0 b(Class cls, String str) {
        f0 b2;
        d dVar;
        com.amazon.aps.iva.yb0.j.f(str, "key");
        com.amazon.aps.iva.yb0.j.f(cls, "modelClass");
        g0 g0Var = this.a;
        g0Var.getClass();
        f0 f0Var = (f0) g0Var.a.get(str);
        boolean isInstance = cls.isInstance(f0Var);
        b bVar = this.b;
        if (isInstance) {
            if (bVar instanceof d) {
                dVar = (d) bVar;
            } else {
                dVar = null;
            }
            if (dVar != null) {
                com.amazon.aps.iva.yb0.j.c(f0Var);
                dVar.c(f0Var);
            }
            com.amazon.aps.iva.yb0.j.d(f0Var, "null cannot be cast to non-null type T of androidx.lifecycle.ViewModelProvider.get");
            return f0Var;
        }
        com.amazon.aps.iva.k5.c cVar = new com.amazon.aps.iva.k5.c(this.c);
        cVar.a.put(v.a, str);
        try {
            b2 = bVar.a(cls, cVar);
        } catch (AbstractMethodError unused) {
            b2 = bVar.b(cls);
        }
        com.amazon.aps.iva.yb0.j.f(b2, "viewModel");
        f0 f0Var2 = (f0) g0Var.a.put(str, b2);
        if (f0Var2 != null) {
            f0Var2.onCleared();
        }
        return b2;
    }

    public u(g0 g0Var, b bVar, com.amazon.aps.iva.k5.a aVar) {
        com.amazon.aps.iva.yb0.j.f(g0Var, "store");
        com.amazon.aps.iva.yb0.j.f(bVar, "factory");
        com.amazon.aps.iva.yb0.j.f(aVar, "defaultCreationExtras");
        this.a = g0Var;
        this.b = bVar;
        this.c = aVar;
    }

    public /* synthetic */ u(g0 g0Var, b bVar, int i) {
        this(g0Var, bVar, a.C0433a.b);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public u(com.amazon.aps.iva.i5.h0 r3, androidx.lifecycle.u.b r4) {
        /*
            r2 = this;
            java.lang.String r0 = "owner"
            com.amazon.aps.iva.yb0.j.f(r3, r0)
            com.amazon.aps.iva.i5.g0 r0 = r3.getViewModelStore()
            boolean r1 = r3 instanceof androidx.lifecycle.e
            if (r1 == 0) goto L14
            androidx.lifecycle.e r3 = (androidx.lifecycle.e) r3
            com.amazon.aps.iva.k5.a r3 = r3.getDefaultViewModelCreationExtras()
            goto L16
        L14:
            com.amazon.aps.iva.k5.a$a r3 = com.amazon.aps.iva.k5.a.C0433a.b
        L16:
            r2.<init>(r0, r4, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.lifecycle.u.<init>(com.amazon.aps.iva.i5.h0, androidx.lifecycle.u$b):void");
    }

    /* compiled from: ViewModelProvider.kt */
    /* loaded from: classes.dex */
    public static class d {
        public void c(f0 f0Var) {
        }
    }
}
