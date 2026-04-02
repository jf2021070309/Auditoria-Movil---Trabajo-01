package c.c0.d0;

import android.annotation.SuppressLint;
import androidx.work.ListenableWorker;
import c.c0.r;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
/* loaded from: classes.dex */
public class n implements Runnable {
    public final /* synthetic */ c.c0.d0.t.s.c a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ String f1381b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ o f1382c;

    public n(o oVar, c.c0.d0.t.s.c cVar, String str) {
        this.f1382c = oVar;
        this.a = cVar;
        this.f1381b = str;
    }

    @Override // java.lang.Runnable
    @SuppressLint({"SyntheticAccessor"})
    public void run() {
        try {
            try {
                ListenableWorker.a aVar = (ListenableWorker.a) this.a.get();
                if (aVar == null) {
                    r.c().b(o.a, String.format("%s returned a null result. Treating it as a failure.", this.f1382c.f1387f.f1508c), new Throwable[0]);
                } else {
                    r.c().a(o.a, String.format("%s returned a %s result.", this.f1382c.f1387f.f1508c, aVar), new Throwable[0]);
                    this.f1382c.f1390i = aVar;
                }
            } catch (InterruptedException e2) {
                e = e2;
                r.c().b(o.a, String.format("%s failed because it threw an exception/error", this.f1381b), e);
            } catch (CancellationException e3) {
                r.c().d(o.a, String.format("%s was cancelled", this.f1381b), e3);
            } catch (ExecutionException e4) {
                e = e4;
                r.c().b(o.a, String.format("%s failed because it threw an exception/error", this.f1381b), e);
            }
        } finally {
            this.f1382c.c();
        }
    }
}
