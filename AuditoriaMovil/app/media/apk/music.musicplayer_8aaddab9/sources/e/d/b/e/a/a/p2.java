package e.d.b.e.a.a;
/* loaded from: classes2.dex */
public final /* synthetic */ class p2 implements e.d.b.e.a.g.b {
    public static final e.d.b.e.a.g.b a = new p2();

    @Override // e.d.b.e.a.g.b
    public final void onFailure(Exception exc) {
        q2.a.a(5, String.format("Could not sync active asset packs. %s", exc), new Object[0]);
    }
}
