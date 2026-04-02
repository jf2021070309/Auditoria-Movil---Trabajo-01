package m;

import java.util.concurrent.CompletableFuture;
import m.g;
/* JADX INFO: Add missing generic type declarations: [R] */
/* loaded from: classes2.dex */
public class e<R> extends CompletableFuture<R> {
    public final /* synthetic */ b a;

    public e(g.a aVar, b bVar) {
        this.a = bVar;
    }

    @Override // java.util.concurrent.CompletableFuture, java.util.concurrent.Future
    public boolean cancel(boolean z) {
        if (z) {
            this.a.cancel();
        }
        return super.cancel(z);
    }
}
