package rx.internal.util;

import rx.functions.Func1;
/* loaded from: classes4.dex */
public final class UtilityFunctions {
    private UtilityFunctions() {
        throw new IllegalStateException("No instances!");
    }

    public static <T> Func1<? super T, Boolean> alwaysTrue() {
        return b.INSTANCE;
    }

    public static <T> Func1<? super T, Boolean> alwaysFalse() {
        return a.INSTANCE;
    }

    public static <T> Func1<T, T> identity() {
        return new Func1<T, T>() { // from class: rx.internal.util.UtilityFunctions.1
            @Override // rx.functions.Func1
            public T call(T t) {
                return t;
            }
        };
    }

    /* loaded from: classes4.dex */
    enum b implements Func1<Object, Boolean> {
        INSTANCE;

        @Override // rx.functions.Func1
        /* renamed from: a */
        public Boolean call(Object obj) {
            return true;
        }
    }

    /* loaded from: classes4.dex */
    enum a implements Func1<Object, Boolean> {
        INSTANCE;

        @Override // rx.functions.Func1
        /* renamed from: a */
        public Boolean call(Object obj) {
            return false;
        }
    }
}
