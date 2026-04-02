package e.j.d.c0;

import com.android.billingclient.api.Purchase;
/* loaded from: classes2.dex */
public final class l extends h.o.c.k implements h.o.b.l<e.a.a.a.j, h.k> {
    public final /* synthetic */ i a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Purchase f8737b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(i iVar, Purchase purchase) {
        super(1);
        this.a = iVar;
        this.f8737b = purchase;
    }

    @Override // h.o.b.l
    public h.k invoke(e.a.a.a.j jVar) {
        e.a.a.a.j jVar2 = jVar;
        h.o.c.j.e(jVar2, "response");
        if (e.j.d.w.U(jVar2)) {
            e.j.d.z.c k2 = this.a.k();
            StringBuilder y = e.a.d.a.a.y("Auto Acknowledge ");
            y.append(this.f8737b);
            y.append(" result: ");
            y.append(jVar2.a);
            k2.a(y.toString(), new Object[0]);
        } else {
            e.j.d.z.c k3 = this.a.k();
            StringBuilder y2 = e.a.d.a.a.y("Auto Acknowledge ");
            y2.append(this.f8737b);
            y2.append(" failed ");
            y2.append(jVar2.a);
            k3.b(y2.toString(), new Object[0]);
        }
        return h.k.a;
    }
}
