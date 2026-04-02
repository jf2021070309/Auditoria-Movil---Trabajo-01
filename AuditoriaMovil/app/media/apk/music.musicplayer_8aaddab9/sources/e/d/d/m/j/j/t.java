package e.d.d.m.j.j;

import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
/* loaded from: classes2.dex */
public class t implements SuccessContinuation<Void, Boolean> {
    public t(q qVar) {
    }

    @Override // com.google.android.gms.tasks.SuccessContinuation
    public Task<Boolean> then(Void r1) throws Exception {
        return Tasks.forResult(Boolean.TRUE);
    }
}
