package m;

import java.util.concurrent.CompletableFuture;
import m.g;
/* JADX INFO: Add missing generic type declarations: [R] */
/* loaded from: classes2.dex */
public class i<R> implements d<R> {
    public final /* synthetic */ CompletableFuture a;

    public i(g.b bVar, CompletableFuture completableFuture) {
        this.a = completableFuture;
    }

    @Override // m.d
    public void a(b<R> bVar, Throwable th) {
        this.a.completeExceptionally(th);
    }

    @Override // m.d
    public void b(b<R> bVar, a0<R> a0Var) {
        this.a.complete(a0Var);
    }
}
