package e.d.b.e.a.c;

import java.util.List;
/* loaded from: classes2.dex */
public final class h extends f {

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ f f6994b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ o f6995c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(o oVar, e.d.b.e.a.g.n nVar, f fVar) {
        super(nVar);
        this.f6995c = oVar;
        this.f6994b = fVar;
    }

    @Override // e.d.b.e.a.c.f
    public final void a() {
        o oVar = this.f6995c;
        f fVar = this.f6994b;
        if (oVar.f7010l != 0 || oVar.f7004f) {
            if (!oVar.f7004f) {
                fVar.run();
                return;
            }
            oVar.f7001c.a(4, "Waiting to bind to the service.", new Object[0]);
            oVar.f7003e.add(fVar);
            return;
        }
        oVar.f7001c.a(4, "Initiate binding to the service.", new Object[0]);
        oVar.f7003e.add(fVar);
        n nVar = new n(oVar);
        oVar.f7009k = nVar;
        oVar.f7004f = true;
        if (oVar.f7000b.bindService(oVar.f7005g, nVar, 1)) {
            return;
        }
        oVar.f7001c.a(4, "Failed to bind to the service.", new Object[0]);
        oVar.f7004f = false;
        List<f> list = oVar.f7003e;
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            e.d.b.e.a.g.n<?> nVar2 = list.get(i2).a;
            if (nVar2 != null) {
                nVar2.a(new p());
            }
        }
        oVar.f7003e.clear();
    }
}
