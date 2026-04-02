package e.j.d.b0.a;

import androidx.fragment.app.FragmentManager;
import e.j.d.b0.a.a;
import e.j.d.k;
/* loaded from: classes2.dex */
public final class n extends h.o.c.k implements h.o.b.a<h.k> {
    public final /* synthetic */ a.EnumC0186a a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ a f8564b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ c.b.c.l f8565c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ int f8566d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ h.o.b.a<h.k> f8567e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(a.EnumC0186a enumC0186a, a aVar, c.b.c.l lVar, int i2, h.o.b.a<h.k> aVar2) {
        super(0);
        this.a = enumC0186a;
        this.f8564b = aVar;
        this.f8565c = lVar;
        this.f8566d = i2;
        this.f8567e = aVar2;
    }

    @Override // h.o.b.a
    public h.k invoke() {
        k.a aVar = e.j.d.k.a;
        aVar.a().f8813j.i(this.a);
        String str = (String) this.f8564b.f8542c.b("rate_intent", "");
        if (str.length() == 0) {
            e.j.d.b0.c.g gVar = this.f8564b.a;
            FragmentManager supportFragmentManager = this.f8565c.getSupportFragmentManager();
            h.o.c.j.d(supportFragmentManager, "activity.supportFragmentManager");
            gVar.e(supportFragmentManager, this.f8566d, false, new l(this.f8565c, this.f8567e));
        } else if (h.o.c.j.a(str, "positive")) {
            e.j.d.b0.c.g gVar2 = this.f8564b.a;
            c.b.c.l lVar = this.f8565c;
            gVar2.d(lVar, new m(lVar, this.f8567e));
        } else {
            aVar.a().k(this.f8565c, this.f8567e);
        }
        return h.k.a;
    }
}
