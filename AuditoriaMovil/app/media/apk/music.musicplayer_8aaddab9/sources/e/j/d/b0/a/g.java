package e.j.d.b0.a;

import androidx.fragment.app.FragmentManager;
import e.j.d.b0.a.a;
import java.util.Objects;
/* loaded from: classes2.dex */
public final class g extends h.o.c.k implements h.o.b.a<h.k> {
    public final /* synthetic */ a.EnumC0186a a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ a f8553b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ c.b.c.l f8554c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ int f8555d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ h.o.b.a<h.k> f8556e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(a.EnumC0186a enumC0186a, a aVar, c.b.c.l lVar, int i2, h.o.b.a<h.k> aVar2) {
        super(0);
        this.a = enumC0186a;
        this.f8553b = aVar;
        this.f8554c = lVar;
        this.f8555d = i2;
        this.f8556e = aVar2;
    }

    @Override // h.o.b.a
    public h.k invoke() {
        e.j.d.k.a.a().f8813j.i(this.a);
        String str = (String) this.f8553b.f8542c.b("rate_intent", "");
        if (str.length() == 0) {
            e.j.d.b0.c.g gVar = this.f8553b.a;
            FragmentManager supportFragmentManager = this.f8554c.getSupportFragmentManager();
            h.o.c.j.d(supportFragmentManager, "activity.supportFragmentManager");
            int i2 = this.f8555d;
            h.o.b.a<h.k> aVar = this.f8556e;
            Objects.requireNonNull(gVar);
            h.o.c.j.e(supportFragmentManager, "fm");
            gVar.e(supportFragmentManager, i2, false, new e.j.d.b0.c.h(aVar));
        } else if (h.o.c.j.a(str, "positive")) {
            this.f8553b.a.d(this.f8554c, this.f8556e);
        } else {
            h.o.b.a<h.k> aVar2 = this.f8556e;
            if (aVar2 != null) {
                aVar2.invoke();
            }
        }
        return h.k.a;
    }
}
