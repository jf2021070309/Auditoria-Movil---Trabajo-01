package i.a;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;
/* loaded from: classes2.dex */
public final class r extends y0 {

    /* renamed from: b  reason: collision with root package name */
    public static final r f9158b = new r();

    /* renamed from: c  reason: collision with root package name */
    public static final int f9159c;
    private static volatile Executor pool;

    /* JADX WARN: Code restructure failed: missing block: B:49:0x008d, code lost:
        if (r0.intValue() < 1) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x008f, code lost:
        r2 = r0.intValue();
     */
    /* JADX WARN: Removed duplicated region for block: B:32:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x007b A[SYNTHETIC] */
    static {
        /*
            i.a.r r0 = new i.a.r
            r0.<init>()
            i.a.r.f9158b = r0
            r0 = 0
            java.lang.String r1 = "kotlinx.coroutines.default.parallelism"
            java.lang.String r1 = java.lang.System.getProperty(r1)     // Catch: java.lang.Throwable -> Lf
            goto L10
        Lf:
            r1 = r0
        L10:
            r2 = -1
            if (r1 != 0) goto L15
            goto L93
        L15:
            java.lang.String r3 = "<this>"
            h.o.c.j.e(r1, r3)
            h.o.c.j.e(r1, r3)
            r3 = 10
            e.j.d.w.o(r3)
            int r4 = r1.length()
            r5 = 1
            if (r4 != 0) goto L2b
            goto L87
        L2b:
            r6 = 0
            char r7 = r1.charAt(r6)
            r8 = 48
            if (r7 >= r8) goto L35
            goto L3a
        L35:
            if (r7 != r8) goto L39
            r2 = 0
            goto L3a
        L39:
            r2 = 1
        L3a:
            r8 = -2147483647(0xffffffff80000001, float:-1.4E-45)
            if (r2 >= 0) goto L51
            if (r4 != r5) goto L42
            goto L87
        L42:
            r2 = 45
            if (r7 != r2) goto L4b
            r8 = -2147483648(0xffffffff80000000, float:-0.0)
            r2 = 1
            r7 = 1
            goto L53
        L4b:
            r2 = 43
            if (r7 != r2) goto L87
            r2 = 1
            goto L52
        L51:
            r2 = 0
        L52:
            r7 = 0
        L53:
            r9 = -59652323(0xfffffffffc71c71d, float:-5.0215282E36)
            r10 = -59652323(0xfffffffffc71c71d, float:-5.0215282E36)
        L59:
            if (r2 >= r4) goto L7b
            int r11 = r2 + 1
            char r2 = r1.charAt(r2)
            int r2 = java.lang.Character.digit(r2, r3)
            if (r2 >= 0) goto L68
            goto L87
        L68:
            if (r6 >= r10) goto L71
            if (r10 != r9) goto L87
            int r10 = r8 / 10
            if (r6 >= r10) goto L71
            goto L87
        L71:
            int r6 = r6 * 10
            int r12 = r8 + r2
            if (r6 >= r12) goto L78
            goto L87
        L78:
            int r6 = r6 - r2
            r2 = r11
            goto L59
        L7b:
            if (r7 == 0) goto L82
            java.lang.Integer r0 = java.lang.Integer.valueOf(r6)
            goto L87
        L82:
            int r0 = -r6
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
        L87:
            if (r0 == 0) goto L96
            int r2 = r0.intValue()
            if (r2 < r5) goto L96
            int r2 = r0.intValue()
        L93:
            i.a.r.f9159c = r2
            return
        L96:
            java.lang.String r0 = "Expected positive number in kotlinx.coroutines.default.parallelism, but has "
            java.lang.String r0 = h.o.c.j.i(r0, r1)
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = r0.toString()
            r1.<init>(r0)
            goto La7
        La6:
            throw r1
        La7:
            goto La6
        */
        throw new UnsupportedOperationException("Method not decompiled: i.a.r.<clinit>():void");
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        throw new IllegalStateException("Close cannot be invoked on CommonPool".toString());
    }

    @Override // i.a.c0
    public void e0(h.m.f fVar, Runnable runnable) {
        try {
            Executor executor = pool;
            if (executor == null) {
                synchronized (this) {
                    executor = pool;
                    if (executor == null) {
                        executor = i0();
                        pool = executor;
                    }
                }
            }
            executor.execute(runnable);
        } catch (RejectedExecutionException unused) {
            h0.f8996g.o0(runnable);
        }
    }

    public final ExecutorService h0() {
        final AtomicInteger atomicInteger = new AtomicInteger();
        return Executors.newFixedThreadPool(j0(), new ThreadFactory() { // from class: i.a.b
            @Override // java.util.concurrent.ThreadFactory
            public final Thread newThread(Runnable runnable) {
                Thread thread = new Thread(runnable, h.o.c.j.i("CommonPool-worker-", Integer.valueOf(atomicInteger.incrementAndGet())));
                thread.setDaemon(true);
                return thread;
            }
        });
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x006d A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.concurrent.ExecutorService i0() {
        /*
            r7 = this;
            java.lang.SecurityManager r0 = java.lang.System.getSecurityManager()
            if (r0 == 0) goto Lb
            java.util.concurrent.ExecutorService r0 = r7.h0()
            return r0
        Lb:
            r0 = 0
            java.lang.String r1 = "java.util.concurrent.ForkJoinPool"
            java.lang.Class r1 = java.lang.Class.forName(r1)     // Catch: java.lang.Throwable -> L13
            goto L14
        L13:
            r1 = r0
        L14:
            if (r1 != 0) goto L1b
            java.util.concurrent.ExecutorService r0 = r7.h0()
            return r0
        L1b:
            int r2 = i.a.r.f9159c
            r3 = 1
            r4 = 0
            if (r2 >= 0) goto L6e
            java.lang.String r2 = "commonPool"
            java.lang.Class[] r5 = new java.lang.Class[r4]     // Catch: java.lang.Throwable -> L36
            java.lang.reflect.Method r2 = r1.getMethod(r2, r5)     // Catch: java.lang.Throwable -> L36
            java.lang.Object[] r5 = new java.lang.Object[r4]     // Catch: java.lang.Throwable -> L36
            java.lang.Object r2 = r2.invoke(r0, r5)     // Catch: java.lang.Throwable -> L36
            boolean r5 = r2 instanceof java.util.concurrent.ExecutorService     // Catch: java.lang.Throwable -> L36
            if (r5 == 0) goto L36
            java.util.concurrent.ExecutorService r2 = (java.util.concurrent.ExecutorService) r2     // Catch: java.lang.Throwable -> L36
            goto L37
        L36:
            r2 = r0
        L37:
            if (r2 != 0) goto L3a
            goto L6e
        L3a:
            i.a.r r5 = i.a.r.f9158b
            java.util.Objects.requireNonNull(r5)
            i.a.a r5 = new java.lang.Runnable() { // from class: i.a.a
                static {
                    /*
                        i.a.a r0 = new i.a.a
                        r0.<init>()
                        
                        // error: 0x0005: SPUT  (r0 I:i.a.a) i.a.a.a i.a.a
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: i.a.a.<clinit>():void");
                }

                {
                    /*
                        r0 = this;
                        r0.<init>()
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: i.a.a.<init>():void");
                }

                @Override // java.lang.Runnable
                public final void run() {
                    /*
                        r1 = this;
                        i.a.r r0 = i.a.r.f9158b
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: i.a.a.run():void");
                }
            }
            r2.submit(r5)
            java.lang.String r5 = "getPoolSize"
            java.lang.Class[] r6 = new java.lang.Class[r4]     // Catch: java.lang.Throwable -> L59
            java.lang.reflect.Method r5 = r1.getMethod(r5, r6)     // Catch: java.lang.Throwable -> L59
            java.lang.Object[] r6 = new java.lang.Object[r4]     // Catch: java.lang.Throwable -> L59
            java.lang.Object r5 = r5.invoke(r2, r6)     // Catch: java.lang.Throwable -> L59
            boolean r6 = r5 instanceof java.lang.Integer     // Catch: java.lang.Throwable -> L59
            if (r6 == 0) goto L59
            java.lang.Integer r5 = (java.lang.Integer) r5     // Catch: java.lang.Throwable -> L59
            goto L5a
        L59:
            r5 = r0
        L5a:
            if (r5 != 0) goto L5d
            goto L65
        L5d:
            int r5 = r5.intValue()
            if (r5 < r3) goto L65
            r5 = 1
            goto L66
        L65:
            r5 = 0
        L66:
            if (r5 == 0) goto L69
            goto L6a
        L69:
            r2 = r0
        L6a:
            if (r2 != 0) goto L6d
            goto L6e
        L6d:
            return r2
        L6e:
            java.lang.Class[] r2 = new java.lang.Class[r3]     // Catch: java.lang.Throwable -> L92
            java.lang.Class r5 = java.lang.Integer.TYPE     // Catch: java.lang.Throwable -> L92
            r2[r4] = r5     // Catch: java.lang.Throwable -> L92
            java.lang.reflect.Constructor r1 = r1.getConstructor(r2)     // Catch: java.lang.Throwable -> L92
            java.lang.Object[] r2 = new java.lang.Object[r3]     // Catch: java.lang.Throwable -> L92
            i.a.r r3 = i.a.r.f9158b     // Catch: java.lang.Throwable -> L92
            int r3 = r3.j0()     // Catch: java.lang.Throwable -> L92
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch: java.lang.Throwable -> L92
            r2[r4] = r3     // Catch: java.lang.Throwable -> L92
            java.lang.Object r1 = r1.newInstance(r2)     // Catch: java.lang.Throwable -> L92
            boolean r2 = r1 instanceof java.util.concurrent.ExecutorService     // Catch: java.lang.Throwable -> L92
            if (r2 == 0) goto L93
            java.util.concurrent.ExecutorService r1 = (java.util.concurrent.ExecutorService) r1     // Catch: java.lang.Throwable -> L92
            r0 = r1
            goto L93
        L92:
        L93:
            if (r0 != 0) goto L99
            java.util.concurrent.ExecutorService r0 = r7.h0()
        L99:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: i.a.r.i0():java.util.concurrent.ExecutorService");
    }

    public final int j0() {
        Integer valueOf = Integer.valueOf(f9159c);
        if (!(valueOf.intValue() > 0)) {
            valueOf = null;
        }
        if (valueOf == null) {
            int availableProcessors = Runtime.getRuntime().availableProcessors() - 1;
            if (availableProcessors < 1) {
                return 1;
            }
            return availableProcessors;
        }
        return valueOf.intValue();
    }

    @Override // i.a.c0
    public String toString() {
        return "CommonPool";
    }
}
