package com.amazon.aps.iva.jf0;

import android.os.Handler;
import android.os.Looper;
import java.lang.invoke.MethodHandles;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.concurrent.Executor;
import org.codehaus.mojo.animal_sniffer.IgnoreJRERequirement;
/* compiled from: Platform.java */
/* loaded from: classes4.dex */
public class x {
    public static final x c;
    public final boolean a = true;
    public final Constructor<MethodHandles.Lookup> b;

    /* compiled from: Platform.java */
    /* loaded from: classes4.dex */
    public static final class a extends x {

        /* compiled from: Platform.java */
        /* renamed from: com.amazon.aps.iva.jf0.x$a$a  reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public static final class ExecutorC0417a implements Executor {
            public final Handler b = new Handler(Looper.getMainLooper());

            @Override // java.util.concurrent.Executor
            public final void execute(Runnable runnable) {
                this.b.post(runnable);
            }
        }

        @Override // com.amazon.aps.iva.jf0.x
        public final Executor a() {
            return new ExecutorC0417a();
        }

        @Override // com.amazon.aps.iva.jf0.x
        public final Object b(Method method, Class<?> cls, Object obj, Object... objArr) throws Throwable {
            return super.b(method, cls, obj, objArr);
        }
    }

    static {
        x xVar;
        if ("Dalvik".equals(System.getProperty("java.vm.name"))) {
            xVar = new a();
        } else {
            xVar = new x();
        }
        c = xVar;
    }

    public x() {
        Constructor<MethodHandles.Lookup> constructor;
        try {
            constructor = MethodHandles.Lookup.class.getDeclaredConstructor(Class.class, Integer.TYPE);
            try {
                constructor.setAccessible(true);
            } catch (NoClassDefFoundError | NoSuchMethodException unused) {
            }
        } catch (NoClassDefFoundError | NoSuchMethodException unused2) {
            constructor = null;
        }
        this.b = constructor;
    }

    public Executor a() {
        return null;
    }

    @IgnoreJRERequirement
    public Object b(Method method, Class<?> cls, Object obj, Object... objArr) throws Throwable {
        MethodHandles.Lookup lookup;
        Constructor<MethodHandles.Lookup> constructor = this.b;
        if (constructor != null) {
            lookup = constructor.newInstance(cls, -1);
        } else {
            lookup = MethodHandles.lookup();
        }
        return lookup.unreflectSpecial(method, cls).bindTo(obj).invokeWithArguments(objArr);
    }
}
