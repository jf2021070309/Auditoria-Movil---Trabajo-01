package c.c0.d0.q.e;

import android.content.Context;
import android.os.Build;
import c.c0.d0.s.p;
import c.c0.s;
/* loaded from: classes.dex */
public class d extends c<c.c0.d0.q.b> {
    public d(Context context, c.c0.d0.t.t.a aVar) {
        super(c.c0.d0.q.f.g.a(context, aVar).f1477d);
    }

    @Override // c.c0.d0.q.e.c
    public boolean b(p pVar) {
        return pVar.f1515j.f1324b == s.CONNECTED;
    }

    @Override // c.c0.d0.q.e.c
    public boolean c(c.c0.d0.q.b bVar) {
        c.c0.d0.q.b bVar2 = bVar;
        return Build.VERSION.SDK_INT >= 26 ? (bVar2.a && bVar2.f1449b) ? false : true : true ^ bVar2.a;
    }
}
