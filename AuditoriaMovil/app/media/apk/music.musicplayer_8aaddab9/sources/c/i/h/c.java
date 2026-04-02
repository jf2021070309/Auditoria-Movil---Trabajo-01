package c.i.h;

import android.os.Handler;
import c.i.h.j;
/* loaded from: classes.dex */
public class c {
    public final m a;

    /* renamed from: b  reason: collision with root package name */
    public final Handler f2078b;

    public c(m mVar, Handler handler) {
        this.a = mVar;
        this.f2078b = handler;
    }

    public void a(j.a aVar) {
        int i2 = aVar.f2092b;
        if (!(i2 == 0)) {
            this.f2078b.post(new b(this, this.a, i2));
            return;
        }
        this.f2078b.post(new a(this, this.a, aVar.a));
    }
}
