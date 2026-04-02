package e.d.d.r;

import android.content.Context;
import e.d.d.l.b0;
import e.d.d.r.f;
import java.util.Set;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
/* loaded from: classes2.dex */
public class d implements f {
    public static final /* synthetic */ int a = 0;

    /* renamed from: b  reason: collision with root package name */
    public e.d.d.t.b<g> f7567b;

    public d(final Context context, Set<e> set) {
        b0 b0Var = new b0(new e.d.d.t.b() { // from class: e.d.d.r.b
            @Override // e.d.d.t.b
            public final Object get() {
                g gVar;
                Context context2 = context;
                g gVar2 = g.a;
                synchronized (g.class) {
                    if (g.a == null) {
                        g.a = new g(context2);
                    }
                    gVar = g.a;
                }
                return gVar;
            }
        });
        new ThreadPoolExecutor(0, 1, 30L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new ThreadFactory() { // from class: e.d.d.r.a
            @Override // java.util.concurrent.ThreadFactory
            public final Thread newThread(Runnable runnable) {
                int i2 = d.a;
                return new Thread(runnable, "heartbeat-information-executor");
            }
        });
        this.f7567b = b0Var;
    }

    @Override // e.d.d.r.f
    public f.a a(String str) {
        boolean a2;
        long currentTimeMillis = System.currentTimeMillis();
        boolean a3 = this.f7567b.get().a(str, currentTimeMillis);
        g gVar = this.f7567b.get();
        synchronized (gVar) {
            a2 = gVar.a("fire-global", currentTimeMillis);
        }
        return (a3 && a2) ? f.a.COMBINED : a2 ? f.a.GLOBAL : a3 ? f.a.SDK : f.a.NONE;
    }
}
