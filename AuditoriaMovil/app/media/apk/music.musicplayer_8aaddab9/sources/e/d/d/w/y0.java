package e.d.d.w;

import android.os.Binder;
import android.os.Process;
import android.util.Log;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import e.d.d.w.b1;
import java.util.concurrent.Executor;
/* loaded from: classes2.dex */
public class y0 extends Binder {
    public final a a;

    /* loaded from: classes2.dex */
    public interface a {
    }

    public y0(a aVar) {
        this.a = aVar;
    }

    public void a(final b1.a aVar) {
        if (Binder.getCallingUid() != Process.myUid()) {
            throw new SecurityException("Binding only allowed within app");
        }
        Log.isLoggable("FirebaseMessaging", 3);
        a aVar2 = this.a;
        g.this.e(aVar.a).addOnCompleteListener(new Executor() { // from class: e.d.d.w.x0
            @Override // java.util.concurrent.Executor
            public final void execute(Runnable runnable) {
                runnable.run();
            }
        }, new OnCompleteListener() { // from class: e.d.d.w.w0
            @Override // com.google.android.gms.tasks.OnCompleteListener
            public final void onComplete(Task task) {
                b1.a.this.a();
            }
        });
    }
}
