package rx.exceptions;

import java.util.HashSet;
import java.util.Set;
import rx.plugins.RxJavaPlugins;
/* loaded from: classes4.dex */
public final class OnErrorThrowable extends RuntimeException {
    private static final long serialVersionUID = -569558213262703934L;
    private final boolean a;
    private final Object b;

    private OnErrorThrowable(Throwable th) {
        super(th);
        this.a = false;
        this.b = null;
    }

    private OnErrorThrowable(Throwable th, Object obj) {
        super(th);
        this.a = true;
        this.b = obj;
    }

    public Object getValue() {
        return this.b;
    }

    public boolean isValueNull() {
        return this.a;
    }

    public static OnErrorThrowable from(Throwable th) {
        if (th == null) {
            th = new NullPointerException();
        }
        Throwable finalCause = Exceptions.getFinalCause(th);
        return finalCause instanceof OnNextValue ? new OnErrorThrowable(th, ((OnNextValue) finalCause).getValue()) : new OnErrorThrowable(th);
    }

    public static Throwable addValueAsLastCause(Throwable th, Object obj) {
        if (th == null) {
            th = new NullPointerException();
        }
        Throwable finalCause = Exceptions.getFinalCause(th);
        if (!(finalCause instanceof OnNextValue) || ((OnNextValue) finalCause).getValue() != obj) {
            Exceptions.addCause(th, new OnNextValue(obj));
        }
        return th;
    }

    /* loaded from: classes4.dex */
    public static class OnNextValue extends RuntimeException {
        private static final long serialVersionUID = -3454462756050397899L;
        private final Object a;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes4.dex */
        public static final class a {
            static final Set<Class<?>> a = a();

            a() {
            }

            private static Set<Class<?>> a() {
                HashSet hashSet = new HashSet();
                hashSet.add(Boolean.class);
                hashSet.add(Character.class);
                hashSet.add(Byte.class);
                hashSet.add(Short.class);
                hashSet.add(Integer.class);
                hashSet.add(Long.class);
                hashSet.add(Float.class);
                hashSet.add(Double.class);
                return hashSet;
            }
        }

        public OnNextValue(Object obj) {
            super("OnError while emitting onNext value: " + a(obj));
            this.a = obj;
        }

        public Object getValue() {
            return this.a;
        }

        static String a(Object obj) {
            if (obj == null) {
                return "null";
            }
            if (a.a.contains(obj.getClass())) {
                return obj.toString();
            }
            if (obj instanceof String) {
                return (String) obj;
            }
            if (obj instanceof Enum) {
                return ((Enum) obj).name();
            }
            String handleOnNextValueRendering = RxJavaPlugins.getInstance().getErrorHandler().handleOnNextValueRendering(obj);
            return handleOnNextValueRendering != null ? handleOnNextValueRendering : obj.getClass().getName() + ".class";
        }
    }
}
