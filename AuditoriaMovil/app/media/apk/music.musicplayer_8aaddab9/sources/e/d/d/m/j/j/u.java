package e.d.d.m.j.j;

import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import java.util.concurrent.Executor;
/* loaded from: classes2.dex */
public class u implements SuccessContinuation<e.d.d.m.j.p.j.a, Void> {
    public final /* synthetic */ Executor a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ v f7217b;

    public u(v vVar, Executor executor) {
        this.f7217b = vVar;
        this.a = executor;
    }

    @Override // com.google.android.gms.tasks.SuccessContinuation
    public Task<Void> then(e.d.d.m.j.p.j.a aVar) throws Exception {
        if (aVar == null) {
            e.d.d.m.j.f.a.d("Received null app settings at app startup. Cannot send cached reports");
            return Tasks.forResult(null);
        }
        q.b(q.this);
        q.this.f7203l.e(this.a);
        q.this.p.trySetResult(null);
        return Tasks.forResult(null);
    }
}
