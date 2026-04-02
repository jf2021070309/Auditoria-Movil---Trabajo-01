package e.j.d;

import android.app.Application;
import i.a.e0;
@h.m.i.a.e(c = "com.zipoapps.premiumhelper.PremiumHelper$startInitialization$1", f = "PremiumHelper.kt", l = {555}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class v extends h.m.i.a.h implements h.o.b.p<e0, h.m.d<? super h.k>, Object> {
    public int a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ k f8852b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(k kVar, h.m.d<? super v> dVar) {
        super(2, dVar);
        this.f8852b = kVar;
    }

    @Override // h.m.i.a.a
    public final h.m.d<h.k> create(Object obj, h.m.d<?> dVar) {
        return new v(this.f8852b, dVar);
    }

    @Override // h.o.b.p
    public Object i(e0 e0Var, h.m.d<? super h.k> dVar) {
        return new v(this.f8852b, dVar).invokeSuspend(h.k.a);
    }

    @Override // h.m.i.a.a
    public final Object invokeSuspend(Object obj) {
        h.m.h.a aVar = h.m.h.a.COROUTINE_SUSPENDED;
        int i2 = this.a;
        if (i2 == 0) {
            w.E0(obj);
            Application application = this.f8852b.f8807d;
            if (!e.f.a.a.a.getAndSet(true)) {
                e.f.a.b bVar = new e.f.a.b(application, "org/threeten/bp/TZDB.dat");
                if (l.c.a.x.h.a.get()) {
                    throw new IllegalStateException("Already initialized");
                }
                if (!l.c.a.x.h.f9840b.compareAndSet(null, bVar)) {
                    throw new IllegalStateException("Initializer was already set, possibly with a default during initialization");
                }
            }
            k kVar = this.f8852b;
            this.a = 1;
            if (k.a(kVar, this) == aVar) {
                return aVar;
            }
        } else if (i2 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        } else {
            w.E0(obj);
        }
        return h.k.a;
    }
}
