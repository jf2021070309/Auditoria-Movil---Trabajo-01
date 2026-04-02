package e.d.d.m.j.j;

import com.google.android.gms.tasks.Task;
import java.util.concurrent.Callable;
/* loaded from: classes.dex */
public class y implements Callable<Task<Void>> {
    public final /* synthetic */ e.d.d.m.j.p.f a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ z f7221b;

    public y(z zVar, e.d.d.m.j.p.f fVar) {
        this.f7221b = zVar;
        this.a = fVar;
    }

    @Override // java.util.concurrent.Callable
    public Task<Void> call() throws Exception {
        return this.f7221b.c(this.a);
    }
}
