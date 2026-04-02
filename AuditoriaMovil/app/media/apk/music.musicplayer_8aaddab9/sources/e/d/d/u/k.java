package e.d.d.u;

import com.google.android.gms.tasks.TaskCompletionSource;
import e.d.d.u.q.c;
/* loaded from: classes2.dex */
public class k implements n {
    public final TaskCompletionSource<String> a;

    public k(TaskCompletionSource<String> taskCompletionSource) {
        this.a = taskCompletionSource;
    }

    @Override // e.d.d.u.n
    public boolean a(Exception exc) {
        return false;
    }

    @Override // e.d.d.u.n
    public boolean b(e.d.d.u.q.d dVar) {
        if ((dVar.f() == c.a.UNREGISTERED) || dVar.j() || dVar.h()) {
            this.a.trySetResult(dVar.c());
            return true;
        }
        return false;
    }
}
