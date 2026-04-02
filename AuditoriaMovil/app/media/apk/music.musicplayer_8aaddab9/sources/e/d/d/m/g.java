package e.d.d.m;

import android.util.Log;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
/* loaded from: classes.dex */
public class g implements Continuation<Void, Object> {
    @Override // com.google.android.gms.tasks.Continuation
    public Object then(Task<Void> task) throws Exception {
        if (task.isSuccessful()) {
            return null;
        }
        e.d.d.m.j.f fVar = e.d.d.m.j.f.a;
        Exception exception = task.getException();
        if (fVar.a(6)) {
            Log.e("FirebaseCrashlytics", "Error fetching settings.", exception);
            return null;
        }
        return null;
    }
}
