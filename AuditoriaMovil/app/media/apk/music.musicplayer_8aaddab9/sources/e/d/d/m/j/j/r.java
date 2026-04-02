package e.d.d.m.j.j;

import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import java.util.concurrent.Executor;
/* loaded from: classes2.dex */
public class r implements SuccessContinuation<e.d.d.m.j.p.j.a, Void> {
    public final /* synthetic */ Executor a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ s f7212b;

    public r(s sVar, Executor executor) {
        this.f7212b = sVar;
        this.a = executor;
    }

    @Override // com.google.android.gms.tasks.SuccessContinuation
    public Task<Void> then(e.d.d.m.j.p.j.a aVar) throws Exception {
        if (aVar == null) {
            e.d.d.m.j.f.a.d("Received null app settings, cannot send reports at crash time.");
            return Tasks.forResult(null);
        }
        return Tasks.whenAll(q.b(this.f7212b.f7216e), this.f7212b.f7216e.f7203l.e(this.a));
    }
}
