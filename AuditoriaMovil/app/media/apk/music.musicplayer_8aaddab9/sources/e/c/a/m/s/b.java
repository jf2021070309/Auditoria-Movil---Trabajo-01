package e.c.a.m.s;

import e.c.a.m.s.a;
import java.util.Objects;
/* loaded from: classes.dex */
public class b implements Runnable {
    public final /* synthetic */ a a;

    public b(a aVar) {
        this.a = aVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        a aVar = this.a;
        Objects.requireNonNull(aVar);
        while (true) {
            try {
                aVar.b((a.b) aVar.f5588d.remove());
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
            }
        }
    }
}
