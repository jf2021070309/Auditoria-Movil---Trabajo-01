package e.d.d.m.j.j;

import android.content.Context;
import android.util.Log;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import java.util.Objects;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
/* loaded from: classes.dex */
public class z {
    public final Context a;

    /* renamed from: b  reason: collision with root package name */
    public final e0 f7222b;

    /* renamed from: c  reason: collision with root package name */
    public final long f7223c;

    /* renamed from: d  reason: collision with root package name */
    public a0 f7224d;

    /* renamed from: e  reason: collision with root package name */
    public a0 f7225e;

    /* renamed from: f  reason: collision with root package name */
    public q f7226f;

    /* renamed from: g  reason: collision with root package name */
    public final i0 f7227g;

    /* renamed from: h  reason: collision with root package name */
    public final e.d.d.m.j.n.f f7228h;

    /* renamed from: i  reason: collision with root package name */
    public final e.d.d.m.j.i.b f7229i;

    /* renamed from: j  reason: collision with root package name */
    public final e.d.d.m.j.h.a f7230j;

    /* renamed from: k  reason: collision with root package name */
    public final ExecutorService f7231k;

    /* renamed from: l  reason: collision with root package name */
    public final m f7232l;

    /* renamed from: m  reason: collision with root package name */
    public final e.d.d.m.j.c f7233m;

    /* loaded from: classes.dex */
    public class a implements Runnable {
        public final /* synthetic */ e.d.d.m.j.p.f a;

        public a(e.d.d.m.j.p.f fVar) {
            this.a = fVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            z.this.c(this.a);
        }
    }

    /* loaded from: classes.dex */
    public class b implements Callable<Boolean> {
        public b() {
        }

        @Override // java.util.concurrent.Callable
        public Boolean call() throws Exception {
            try {
                boolean delete = z.this.f7224d.b().delete();
                if (!delete) {
                    e.d.d.m.j.f.a.d("Initialization marker file was not properly removed.");
                }
                return Boolean.valueOf(delete);
            } catch (Exception e2) {
                if (e.d.d.m.j.f.a.a(6)) {
                    Log.e("FirebaseCrashlytics", "Problem encountered deleting Crashlytics initialization marker.", e2);
                }
                return Boolean.FALSE;
            }
        }
    }

    /* loaded from: classes.dex */
    public class c implements Callable<Boolean> {
        public c() {
        }

        @Override // java.util.concurrent.Callable
        public Boolean call() throws Exception {
            q qVar = z.this.f7226f;
            boolean z = true;
            if (qVar.f7195d.b().exists()) {
                e.d.d.m.j.f.a.a(2);
                qVar.f7195d.b().delete();
            } else {
                String g2 = qVar.g();
                if (g2 == null || !qVar.f7201j.d(g2)) {
                    z = false;
                }
            }
            return Boolean.valueOf(z);
        }
    }

    public z(e.d.d.g gVar, i0 i0Var, e.d.d.m.j.c cVar, e0 e0Var, e.d.d.m.j.i.b bVar, e.d.d.m.j.h.a aVar, e.d.d.m.j.n.f fVar, ExecutorService executorService) {
        this.f7222b = e0Var;
        gVar.a();
        this.a = gVar.f7040d;
        this.f7227g = i0Var;
        this.f7233m = cVar;
        this.f7229i = bVar;
        this.f7230j = aVar;
        this.f7231k = executorService;
        this.f7228h = fVar;
        this.f7232l = new m(executorService);
        this.f7223c = System.currentTimeMillis();
    }

    public final void a() {
        try {
            Boolean.TRUE.equals((Boolean) n0.a(this.f7232l.b(new c())));
        } catch (Exception unused) {
        }
    }

    public boolean b() {
        return this.f7224d.c();
    }

    public final Task<Void> c(e.d.d.m.j.p.f fVar) {
        h();
        try {
            this.f7229i.a(new e.d.d.m.j.i.a() { // from class: e.d.d.m.j.j.b
                @Override // e.d.d.m.j.i.a
                public final void a(String str) {
                    z zVar = z.this;
                    Objects.requireNonNull(zVar);
                    zVar.f7226f.k(System.currentTimeMillis() - zVar.f7223c, str);
                }
            });
            e.d.d.m.j.p.e eVar = (e.d.d.m.j.p.e) fVar;
            if (!eVar.d().a().a) {
                e.d.d.m.j.f.a.a(3);
                return Tasks.forException(new RuntimeException("Collection of crash reports disabled in Crashlytics settings."));
            }
            if (!this.f7226f.f(eVar)) {
                e.d.d.m.j.f.a.d("Previous sessions could not be finalized.");
            }
            return this.f7226f.i(eVar.b());
        } catch (Exception e2) {
            if (e.d.d.m.j.f.a.a(6)) {
                Log.e("FirebaseCrashlytics", "Crashlytics encountered a problem during asynchronous initialization.", e2);
            }
            return Tasks.forException(e2);
        } finally {
            g();
        }
    }

    public final void d(e.d.d.m.j.p.f fVar) {
        Future<?> submit = this.f7231k.submit(new a(fVar));
        e.d.d.m.j.f.a.a(3);
        try {
            submit.get(4L, TimeUnit.SECONDS);
        } catch (InterruptedException e2) {
            if (e.d.d.m.j.f.a.a(6)) {
                Log.e("FirebaseCrashlytics", "Crashlytics was interrupted during initialization.", e2);
            }
        } catch (ExecutionException e3) {
            if (e.d.d.m.j.f.a.a(6)) {
                Log.e("FirebaseCrashlytics", "Crashlytics encountered a problem during initialization.", e3);
            }
        } catch (TimeoutException e4) {
            if (e.d.d.m.j.f.a.a(6)) {
                Log.e("FirebaseCrashlytics", "Crashlytics timed out during initialization.", e4);
            }
        }
    }

    public void e(String str) {
        this.f7226f.k(System.currentTimeMillis() - this.f7223c, str);
    }

    public void f(Throwable th) {
        this.f7226f.j(Thread.currentThread(), th);
    }

    public void g() {
        this.f7232l.b(new b());
    }

    public void h() {
        this.f7232l.a();
        this.f7224d.a();
        e.d.d.m.j.f.a.a(2);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0131 A[Catch: Exception -> 0x0141, TRY_LEAVE, TryCatch #1 {Exception -> 0x0141, blocks: (B:13:0x00f0, B:15:0x0108, B:20:0x0117, B:22:0x0125, B:28:0x0131), top: B:45:0x00f0 }] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0157  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean i(e.d.d.m.j.j.h r26, e.d.d.m.j.p.f r27) {
        /*
            Method dump skipped, instructions count: 349
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: e.d.d.m.j.j.z.i(e.d.d.m.j.j.h, e.d.d.m.j.p.f):boolean");
    }

    public void j(Boolean bool) {
        this.f7222b.c(bool);
    }
}
