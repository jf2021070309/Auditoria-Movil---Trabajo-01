package e.d.d.m.j.j;

import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import java.util.concurrent.Callable;
/* JADX INFO: Add missing generic type declarations: [T] */
/* loaded from: classes2.dex */
public class o<T> implements Continuation<Void, T> {
    public final /* synthetic */ Callable a;

    public o(m mVar, Callable callable) {
        this.a = callable;
    }

    @Override // com.google.android.gms.tasks.Continuation
    public T then(Task<Void> task) throws Exception {
        return (T) this.a.call();
    }
}
