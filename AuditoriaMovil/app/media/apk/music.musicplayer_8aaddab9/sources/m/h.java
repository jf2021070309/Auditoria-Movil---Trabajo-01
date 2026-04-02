package m;

import java.util.concurrent.CompletableFuture;
import m.g;
/* JADX INFO: Add missing generic type declarations: [R] */
/* loaded from: classes2.dex */
public class h<R> extends CompletableFuture<a0<R>> {
    public final /* synthetic */ b a;

    public h(g.b bVar, b bVar2) {
        this.a = bVar2;
    }

    @Override // java.util.concurrent.CompletableFuture, java.util.concurrent.Future
    public boolean cancel(boolean z) {
        if (z) {
            this.a.cancel();
        }
        return super.cancel(z);
    }
}
