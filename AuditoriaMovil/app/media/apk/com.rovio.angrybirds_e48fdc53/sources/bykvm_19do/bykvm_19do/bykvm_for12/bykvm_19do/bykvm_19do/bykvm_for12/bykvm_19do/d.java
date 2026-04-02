package bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do;

import android.content.Context;
import android.os.Looper;
import java.util.concurrent.Executor;
/* loaded from: classes.dex */
public class d implements f {
    public static final d a = new d();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class a implements Runnable {
        a(d dVar) {
        }

        @Override // java.lang.Runnable
        public void run() {
            bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_for12.a.f();
        }
    }

    /* loaded from: classes.dex */
    class b extends bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_new1.g {
        final /* synthetic */ g b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(String str, g gVar) {
            super(str);
            this.b = gVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_for12.c.a("TTExecutor start");
            d.this.a(this.b.d());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class c extends bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_new1.g {
        final /* synthetic */ bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_int108.a b;
        final /* synthetic */ g c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(String str, bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_int108.a aVar, g gVar) {
            super(str);
            this.b = aVar;
            this.c = gVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            d.this.a(this.b, this.c.d());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(int i) {
        if (i == 0 || i == 2) {
            bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_if122.bykvm_if122.a.d();
        } else if (i == 1) {
            bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_if122.bykvm_if122.b.b();
        }
    }

    private void a(bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.a aVar) {
        Executor b2;
        if (Looper.myLooper() != Looper.getMainLooper()) {
            bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_for12.a.f();
            return;
        }
        g a2 = aVar.a();
        if (a2 == null || (b2 = a2.b()) == null) {
            return;
        }
        b2.execute(new a(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_int108.a aVar, int i) {
        if (i == 0 || i == 2) {
            bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_if122.bykvm_if122.a.a(aVar);
        } else if (i == 1) {
            bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_if122.bykvm_if122.b.a(aVar);
        }
    }

    private boolean a(Context context, g gVar) {
        if (context == null || gVar == null) {
            return false;
        }
        try {
            return k.c(context);
        } catch (Throwable th) {
            bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_for12.c.b(th.getMessage());
            return true;
        }
    }

    private void b(bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.a aVar, Context context) {
        bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.c.a(context, "context == null");
        bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.c.a(aVar, "AdLogConfig == null");
        bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.c.a(aVar.a(), "AdLogDepend ==null");
    }

    private void b(bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_int108.a aVar) {
        g b2 = j.m().b();
        if (aVar == null || b2 == null || j.m().d() == null || b2.a() == null) {
            return;
        }
        if (j.m().j()) {
            boolean a2 = a(j.m().d(), b2);
            bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_for12.c.a("dispatchEvent mainProcess:" + a2);
            if (!a2) {
                bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_for12.c.a("sub thread dispatch:" + c());
                if (c()) {
                    b2.a().execute(new c("dispatchEvent", aVar, b2));
                    return;
                } else {
                    a(aVar, b2.d());
                    return;
                }
            }
        }
        j.m().a(aVar);
    }

    private boolean c() {
        return Thread.currentThread() == Looper.getMainLooper().getThread();
    }

    public void a() {
        bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_for12.c.a("flushMemoryAndDB");
        j.m().a();
    }

    public void a(bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.a aVar, Context context) {
        b(aVar, context);
        j.m().a(context);
        j.m().a(aVar.g());
        j.m().b(aVar.d());
        j.m().c(aVar.e());
        j.m().a(aVar.b());
        j.m().d(aVar.f());
        j.m().a(aVar.c() == null ? bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_19do.e.b : aVar.c());
        j.m().a(aVar.h());
        j.m().a(aVar.a());
        a(aVar);
    }

    public void a(bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_int108.a aVar) {
        b(aVar);
    }

    public void b() {
        bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_for12.c.a("EventMultiUtils start");
        g b2 = j.m().b();
        if (b2 == null || j.m().d() == null || b2.a() == null) {
            return;
        }
        if (!j.m().j() || a(j.m().d(), b2)) {
            j.m().k();
        } else if (c()) {
            b2.a().execute(new b("start", b2));
        } else {
            a(b2.d());
        }
    }
}
