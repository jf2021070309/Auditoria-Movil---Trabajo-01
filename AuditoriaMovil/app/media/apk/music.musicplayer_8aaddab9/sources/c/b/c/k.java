package c.b.c;

import android.content.Context;
/* loaded from: classes.dex */
public class k implements c.a.g.b {
    public final /* synthetic */ l a;

    public k(l lVar) {
        this.a = lVar;
    }

    @Override // c.a.g.b
    public void a(Context context) {
        n t = this.a.t();
        t.j();
        t.m(this.a.getSavedStateRegistry().a("androidx:appcompat"));
    }
}
