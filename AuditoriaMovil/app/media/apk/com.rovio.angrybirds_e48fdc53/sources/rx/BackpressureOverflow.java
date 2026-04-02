package rx;

import rx.exceptions.MissingBackpressureException;
/* loaded from: classes4.dex */
public final class BackpressureOverflow {
    public static final Strategy ON_OVERFLOW_ERROR = c.a;
    public static final Strategy ON_OVERFLOW_DEFAULT = ON_OVERFLOW_ERROR;
    public static final Strategy ON_OVERFLOW_DROP_OLDEST = b.a;
    public static final Strategy ON_OVERFLOW_DROP_LATEST = a.a;

    /* loaded from: classes4.dex */
    public interface Strategy {
        boolean mayAttemptDrop();
    }

    /* loaded from: classes4.dex */
    static class b implements Strategy {
        static final b a = new b();

        private b() {
        }

        @Override // rx.BackpressureOverflow.Strategy
        public boolean mayAttemptDrop() {
            return true;
        }
    }

    /* loaded from: classes4.dex */
    static class a implements Strategy {
        static final a a = new a();

        private a() {
        }

        @Override // rx.BackpressureOverflow.Strategy
        public boolean mayAttemptDrop() {
            return false;
        }
    }

    /* loaded from: classes4.dex */
    static class c implements Strategy {
        static final c a = new c();

        private c() {
        }

        @Override // rx.BackpressureOverflow.Strategy
        public boolean mayAttemptDrop() {
            throw new MissingBackpressureException("Overflowed buffer");
        }
    }
}
