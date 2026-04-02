package c.c.a.a;

import java.util.concurrent.Executor;
/* loaded from: classes.dex */
public class a extends c {
    public static volatile a a;

    /* renamed from: b  reason: collision with root package name */
    public static final Executor f1297b = new ExecutorC0022a();

    /* renamed from: c  reason: collision with root package name */
    public c f1298c;

    /* renamed from: d  reason: collision with root package name */
    public c f1299d;

    /* renamed from: c.c.a.a.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static class ExecutorC0022a implements Executor {
        @Override // java.util.concurrent.Executor
        public void execute(Runnable runnable) {
            a.d().f1298c.a(runnable);
        }
    }

    public a() {
        b bVar = new b();
        this.f1299d = bVar;
        this.f1298c = bVar;
    }

    public static a d() {
        if (a != null) {
            return a;
        }
        synchronized (a.class) {
            if (a == null) {
                a = new a();
            }
        }
        return a;
    }

    @Override // c.c.a.a.c
    public void a(Runnable runnable) {
        this.f1298c.a(runnable);
    }

    @Override // c.c.a.a.c
    public boolean b() {
        return this.f1298c.b();
    }

    @Override // c.c.a.a.c
    public void c(Runnable runnable) {
        this.f1298c.c(runnable);
    }
}
