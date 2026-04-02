package e.d.b.e.a.c;
/* loaded from: classes2.dex */
public abstract class f implements Runnable {
    public final e.d.b.e.a.g.n<?> a;

    public f() {
        this.a = null;
    }

    public f(e.d.b.e.a.g.n<?> nVar) {
        this.a = nVar;
    }

    public abstract void a();

    @Override // java.lang.Runnable
    public final void run() {
        try {
            a();
        } catch (Exception e2) {
            e.d.b.e.a.g.n<?> nVar = this.a;
            if (nVar != null) {
                nVar.a(e2);
            }
        }
    }
}
