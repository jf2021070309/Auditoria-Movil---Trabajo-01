package c.c0.d0.q.e;

import android.content.Context;
import android.os.Build;
import c.c0.d0.s.p;
import c.c0.r;
import c.c0.s;
/* loaded from: classes.dex */
public class f extends c<c.c0.d0.q.b> {

    /* renamed from: e  reason: collision with root package name */
    public static final String f1459e = r.e("NetworkNotRoamingCtrlr");

    public f(Context context, c.c0.d0.t.t.a aVar) {
        super(c.c0.d0.q.f.g.a(context, aVar).f1477d);
    }

    @Override // c.c0.d0.q.e.c
    public boolean b(p pVar) {
        return pVar.f1515j.f1324b == s.NOT_ROAMING;
    }

    @Override // c.c0.d0.q.e.c
    public boolean c(c.c0.d0.q.b bVar) {
        c.c0.d0.q.b bVar2 = bVar;
        boolean z = true;
        if (Build.VERSION.SDK_INT < 24) {
            r.c().a(f1459e, "Not-roaming network constraint is not supported before API 24, only checking for connected state.", new Throwable[0]);
            return !bVar2.a;
        }
        if (bVar2.a && bVar2.f1451d) {
            z = false;
        }
        return z;
    }
}
