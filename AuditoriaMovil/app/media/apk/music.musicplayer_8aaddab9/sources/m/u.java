package m;

import java.io.IOException;
import javax.annotation.Nullable;
/* JADX INFO: Add missing generic type declarations: [T] */
/* loaded from: classes.dex */
public class u<T> extends w<Iterable<T>> {
    public final /* synthetic */ w a;

    public u(w wVar) {
        this.a = wVar;
    }

    @Override // m.w
    public void a(y yVar, @Nullable Object obj) throws IOException {
        Iterable<T> iterable = (Iterable) obj;
        if (iterable == null) {
            return;
        }
        for (T t : iterable) {
            this.a.a(yVar, t);
        }
    }
}
