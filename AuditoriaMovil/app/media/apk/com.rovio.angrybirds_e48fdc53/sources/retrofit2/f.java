package retrofit2;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import java.lang.invoke.MethodHandles;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.concurrent.Executor;
import retrofit2.CallAdapter;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes4.dex */
public class f {
    private static final f a = c();

    f() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static f a() {
        return a;
    }

    private static f c() {
        try {
            Class.forName("android.os.Build");
            if (Build.VERSION.SDK_INT != 0) {
                return new a();
            }
        } catch (ClassNotFoundException e) {
        }
        try {
            Class.forName("java.util.Optional");
            return new b();
        } catch (ClassNotFoundException e2) {
            return new f();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Executor b() {
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public CallAdapter.Factory a(Executor executor) {
        return executor != null ? new c(executor) : retrofit2.b.a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean a(Method method) {
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Object a(Method method, Class<?> cls, Object obj, Object... objArr) {
        throw new UnsupportedOperationException();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static class b extends f {
        b() {
        }

        @Override // retrofit2.f
        boolean a(Method method) {
            return method.isDefault();
        }

        @Override // retrofit2.f
        Object a(Method method, Class<?> cls, Object obj, Object... objArr) {
            Constructor declaredConstructor = MethodHandles.Lookup.class.getDeclaredConstructor(Class.class, Integer.TYPE);
            declaredConstructor.setAccessible(true);
            return ((MethodHandles.Lookup) declaredConstructor.newInstance(cls, -1)).unreflectSpecial(method, cls).bindTo(obj).invokeWithArguments(objArr);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static class a extends f {
        a() {
        }

        @Override // retrofit2.f
        public Executor b() {
            return new ExecutorC0349a();
        }

        @Override // retrofit2.f
        CallAdapter.Factory a(Executor executor) {
            return new c(executor);
        }

        /* renamed from: retrofit2.f$a$a  reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        static class ExecutorC0349a implements Executor {
            private final Handler a = new Handler(Looper.getMainLooper());

            ExecutorC0349a() {
            }

            @Override // java.util.concurrent.Executor
            public void execute(Runnable runnable) {
                this.a.post(runnable);
            }
        }
    }
}
