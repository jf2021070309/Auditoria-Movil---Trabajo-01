package e.d.d.m.j.j;

import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import e.d.d.m.j.j.q;
import java.io.File;
import java.util.Objects;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
/* loaded from: classes2.dex */
public class v implements Callable<Task<Void>> {
    public final /* synthetic */ Boolean a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ q.b f7218b;

    public v(q.b bVar, Boolean bool) {
        this.f7218b = bVar;
        this.a = bool;
    }

    @Override // java.util.concurrent.Callable
    public Task<Void> call() throws Exception {
        if (this.a.booleanValue()) {
            e.d.d.m.j.f.a.a(3);
            boolean booleanValue = this.a.booleanValue();
            e0 e0Var = q.this.f7194c;
            Objects.requireNonNull(e0Var);
            if (booleanValue) {
                e0Var.f7163h.trySetResult(null);
                q.b bVar = this.f7218b;
                Executor executor = q.this.f7196e.a;
                return bVar.a.onSuccessTask(executor, new u(this, executor));
            }
            throw new IllegalStateException("An invalid data collection token was used.");
        }
        e.d.d.m.j.f.a.a(2);
        e.d.d.m.j.n.f fVar = q.this.f7198g;
        for (File file : e.d.d.m.j.n.f.i(fVar.a.listFiles(a.a))) {
            file.delete();
        }
        e.d.d.m.j.n.e eVar = q.this.f7203l.f7185b;
        eVar.a(eVar.f7505g.d());
        eVar.a(eVar.f7505g.c());
        eVar.a(eVar.f7505g.b());
        q.this.p.trySetResult(null);
        return Tasks.forResult(null);
    }
}
