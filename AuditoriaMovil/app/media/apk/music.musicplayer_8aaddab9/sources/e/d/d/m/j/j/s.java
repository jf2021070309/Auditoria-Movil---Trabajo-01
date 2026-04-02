package e.d.d.m.j.j;

import com.google.android.gms.measurement.AppMeasurement;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import java.util.Objects;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
/* loaded from: classes2.dex */
public class s implements Callable<Task<Void>> {
    public final /* synthetic */ long a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Throwable f7213b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ Thread f7214c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ e.d.d.m.j.p.f f7215d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ q f7216e;

    public s(q qVar, long j2, Throwable th, Thread thread, e.d.d.m.j.p.f fVar) {
        this.f7216e = qVar;
        this.a = j2;
        this.f7213b = th;
        this.f7214c = thread;
        this.f7215d = fVar;
    }

    @Override // java.util.concurrent.Callable
    public Task<Void> call() throws Exception {
        long j2 = this.a / 1000;
        String g2 = this.f7216e.g();
        if (g2 == null) {
            e.d.d.m.j.f.a.b("Tried to write a fatal exception while no session was open.");
            return Tasks.forResult(null);
        }
        this.f7216e.f7195d.a();
        l0 l0Var = this.f7216e.f7203l;
        Throwable th = this.f7213b;
        Thread thread = this.f7214c;
        Objects.requireNonNull(l0Var);
        e.d.d.m.j.f.a.a(2);
        l0Var.d(th, thread, g2, AppMeasurement.CRASH_ORIGIN, j2, true);
        this.f7216e.d(this.a);
        this.f7216e.c(false, this.f7215d);
        q qVar = this.f7216e;
        new k(this.f7216e.f7197f);
        q.a(qVar, k.f7183b);
        if (this.f7216e.f7194c.b()) {
            Executor executor = this.f7216e.f7196e.a;
            return ((e.d.d.m.j.p.e) this.f7215d).f7523i.get().getTask().onSuccessTask(executor, new r(this, executor));
        }
        return Tasks.forResult(null);
    }
}
