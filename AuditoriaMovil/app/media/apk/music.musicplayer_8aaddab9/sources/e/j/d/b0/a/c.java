package e.j.d.b0.a;

import androidx.fragment.app.FragmentManager;
import e.j.d.b0.a.a;
import e.j.d.b0.c.g;
import e.j.d.k;
/* loaded from: classes2.dex */
public final class c extends h.o.c.k implements h.o.b.a<h.k> {
    public final /* synthetic */ a.EnumC0186a a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ a f8545b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ c.b.c.l f8546c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ int f8547d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ h.o.b.a<h.k> f8548e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(a.EnumC0186a enumC0186a, a aVar, c.b.c.l lVar, int i2, h.o.b.a<h.k> aVar2) {
        super(0);
        this.a = enumC0186a;
        this.f8545b = aVar;
        this.f8546c = lVar;
        this.f8547d = i2;
        this.f8548e = aVar2;
    }

    @Override // h.o.b.a
    public h.k invoke() {
        g.c cVar;
        k.a aVar = e.j.d.k.a;
        aVar.a().f8813j.i(this.a);
        a aVar2 = this.f8545b;
        c.b.c.l lVar = this.f8546c;
        int i2 = this.f8547d;
        h.o.b.a<h.k> aVar3 = this.f8548e;
        int ordinal = ((g.b) aVar2.f8541b.e(e.j.d.y.b.o)).ordinal();
        if (ordinal == 0) {
            cVar = g.c.NONE;
        } else if (ordinal == 1) {
            cVar = g.c.IN_APP_REVIEW;
        } else if (ordinal != 2) {
            throw new h.e();
        } else {
            String str = (String) aVar2.f8542c.b("rate_intent", "");
            cVar = str.length() == 0 ? g.c.DIALOG : h.o.c.j.a(str, "positive") ? g.c.IN_APP_REVIEW : h.o.c.j.a(str, "negative") ? g.c.NONE : g.c.NONE;
        }
        int ordinal2 = cVar.ordinal();
        if (ordinal2 == 0) {
            aVar.a().k(lVar, aVar3);
        } else if (ordinal2 == 1) {
            e.j.d.b0.c.g gVar = aVar2.a;
            FragmentManager supportFragmentManager = lVar.getSupportFragmentManager();
            h.o.c.j.d(supportFragmentManager, "activity.supportFragmentManager");
            gVar.e(supportFragmentManager, i2, false, new o(lVar, aVar3));
        } else if (ordinal2 == 2) {
            aVar2.a.d(lVar, new p(lVar, aVar3));
        }
        return h.k.a;
    }
}
