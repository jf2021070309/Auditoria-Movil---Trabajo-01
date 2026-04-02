package m;

import java.util.concurrent.CompletableFuture;
import m.g;
/* JADX INFO: Add missing generic type declarations: [R] */
/* loaded from: classes2.dex */
public class f<R> implements d<R> {
    public final /* synthetic */ CompletableFuture a;

    public f(g.a aVar, CompletableFuture completableFuture) {
        this.a = completableFuture;
    }

    @Override // m.d
    public void a(b<R> bVar, Throwable th) {
        this.a.completeExceptionally(th);
    }

    @Override // m.d
    public void b(b<R> bVar, a0<R> a0Var) {
        if (a0Var.a()) {
            this.a.complete(a0Var.f9842b);
        } else {
            this.a.completeExceptionally(new l(a0Var));
        }
    }
}
