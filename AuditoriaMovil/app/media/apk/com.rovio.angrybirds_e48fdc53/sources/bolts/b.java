package bolts;

import java.util.Locale;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
/* loaded from: classes2.dex */
final class b {
    private static final b a = new b();
    private final ExecutorService b;
    private final ScheduledExecutorService c;
    private final Executor d;

    private static boolean d() {
        String property = System.getProperty("java.runtime.name");
        if (property == null) {
            return false;
        }
        return property.toLowerCase(Locale.US).contains("android");
    }

    private b() {
        this.b = !d() ? Executors.newCachedThreadPool() : bolts.a.a();
        this.c = Executors.newSingleThreadScheduledExecutor();
        this.d = new a();
    }

    public static ExecutorService a() {
        return a.b;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static ScheduledExecutorService b() {
        return a.c;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Executor c() {
        return a.d;
    }

    /* loaded from: classes2.dex */
    private static class a implements Executor {
        private ThreadLocal<Integer> a;

        private a() {
            this.a = new ThreadLocal<>();
        }

        private int a() {
            Integer num = this.a.get();
            if (num == null) {
                num = 0;
            }
            int intValue = num.intValue() + 1;
            this.a.set(Integer.valueOf(intValue));
            return intValue;
        }

        private int b() {
            Integer num = this.a.get();
            if (num == null) {
                num = 0;
            }
            int intValue = num.intValue() - 1;
            if (intValue == 0) {
                this.a.remove();
            } else {
                this.a.set(Integer.valueOf(intValue));
            }
            return intValue;
        }

        @Override // java.util.concurrent.Executor
        public void execute(Runnable runnable) {
            try {
                if (a() <= 15) {
                    runnable.run();
                } else {
                    b.a().execute(runnable);
                }
            } finally {
                b();
            }
        }
    }
}
