package m;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import java.lang.invoke.MethodHandles;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Executor;
import javax.annotation.Nullable;
import m.c;
import m.j;
import org.codehaus.mojo.animal_sniffer.IgnoreJRERequirement;
/* loaded from: classes.dex */
public class x {
    public static final x a;

    /* loaded from: classes.dex */
    public static class a extends x {

        /* renamed from: m.x$a$a  reason: collision with other inner class name */
        /* loaded from: classes2.dex */
        public static class ExecutorC0221a implements Executor {
            public final Handler a = new Handler(Looper.getMainLooper());

            @Override // java.util.concurrent.Executor
            public void execute(Runnable runnable) {
                this.a.post(runnable);
            }
        }

        @Override // m.x
        public List<? extends c.a> a(@Nullable Executor executor) {
            if (executor != null) {
                k kVar = new k(executor);
                return Build.VERSION.SDK_INT >= 24 ? Arrays.asList(g.a, kVar) : Collections.singletonList(kVar);
            }
            throw new AssertionError();
        }

        @Override // m.x
        public Executor b() {
            return new ExecutorC0221a();
        }

        @Override // m.x
        public List<? extends j.a> c() {
            return Build.VERSION.SDK_INT >= 24 ? Collections.singletonList(t.a) : Collections.emptyList();
        }

        @Override // m.x
        public int d() {
            return Build.VERSION.SDK_INT >= 24 ? 1 : 0;
        }

        @Override // m.x
        @IgnoreJRERequirement
        public boolean f(Method method) {
            if (Build.VERSION.SDK_INT < 24) {
                return false;
            }
            return method.isDefault();
        }
    }

    @IgnoreJRERequirement
    /* loaded from: classes.dex */
    public static class b extends x {
        @Override // m.x
        public List<? extends c.a> a(@Nullable Executor executor) {
            ArrayList arrayList = new ArrayList(2);
            arrayList.add(g.a);
            arrayList.add(new k(executor));
            return Collections.unmodifiableList(arrayList);
        }

        @Override // m.x
        public List<? extends j.a> c() {
            return Collections.singletonList(t.a);
        }

        @Override // m.x
        public int d() {
            return 1;
        }

        @Override // m.x
        public Object e(Method method, Class<?> cls, Object obj, @Nullable Object... objArr) throws Throwable {
            Constructor declaredConstructor = MethodHandles.Lookup.class.getDeclaredConstructor(Class.class, Integer.TYPE);
            declaredConstructor.setAccessible(true);
            return ((MethodHandles.Lookup) declaredConstructor.newInstance(cls, -1)).unreflectSpecial(method, cls).bindTo(obj).invokeWithArguments(objArr);
        }

        @Override // m.x
        public boolean f(Method method) {
            return method.isDefault();
        }
    }

    static {
        x xVar;
        try {
            try {
                Class.forName("android.os.Build");
                xVar = new a();
            } catch (ClassNotFoundException unused) {
                xVar = new x();
            }
        } catch (ClassNotFoundException unused2) {
            Class.forName("java.util.Optional");
            xVar = new b();
        }
        a = xVar;
    }

    public List<? extends c.a> a(@Nullable Executor executor) {
        return Collections.singletonList(new k(executor));
    }

    @Nullable
    public Executor b() {
        return null;
    }

    public List<? extends j.a> c() {
        return Collections.emptyList();
    }

    public int d() {
        return 0;
    }

    @Nullable
    public Object e(Method method, Class<?> cls, Object obj, @Nullable Object... objArr) throws Throwable {
        throw new UnsupportedOperationException();
    }

    public boolean f(Method method) {
        return false;
    }
}
