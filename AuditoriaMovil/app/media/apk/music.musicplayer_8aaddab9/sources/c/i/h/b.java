package c.i.h;

import c.i.d.c.j;
import c.i.e.e;
/* loaded from: classes.dex */
public class b implements Runnable {
    public final /* synthetic */ m a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ int f2077b;

    public b(c cVar, m mVar, int i2) {
        this.a = mVar;
        this.f2077b = i2;
    }

    @Override // java.lang.Runnable
    public void run() {
        m mVar = this.a;
        int i2 = this.f2077b;
        j.c cVar = ((e.a) mVar).a;
        if (cVar != null) {
            cVar.d(i2);
        }
    }
}
