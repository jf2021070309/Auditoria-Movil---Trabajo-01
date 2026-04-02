package e.d.d.u;

import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.Objects;
/* loaded from: classes2.dex */
public class j implements n {
    public final o a;

    /* renamed from: b  reason: collision with root package name */
    public final TaskCompletionSource<l> f7588b;

    public j(o oVar, TaskCompletionSource<l> taskCompletionSource) {
        this.a = oVar;
        this.f7588b = taskCompletionSource;
    }

    @Override // e.d.d.u.n
    public boolean a(Exception exc) {
        this.f7588b.trySetException(exc);
        return true;
    }

    @Override // e.d.d.u.n
    public boolean b(e.d.d.u.q.d dVar) {
        if (!dVar.j() || this.a.d(dVar)) {
            return false;
        }
        TaskCompletionSource<l> taskCompletionSource = this.f7588b;
        String a = dVar.a();
        Objects.requireNonNull(a, "Null token");
        Long valueOf = Long.valueOf(dVar.b());
        Long valueOf2 = Long.valueOf(dVar.g());
        String k2 = valueOf == null ? e.a.d.a.a.k("", " tokenExpirationTimestamp") : "";
        if (valueOf2 == null) {
            k2 = e.a.d.a.a.k(k2, " tokenCreationTimestamp");
        }
        if (k2.isEmpty()) {
            taskCompletionSource.setResult(new e(a, valueOf.longValue(), valueOf2.longValue(), null));
            return true;
        }
        throw new IllegalStateException(e.a.d.a.a.k("Missing required properties:", k2));
    }
}
