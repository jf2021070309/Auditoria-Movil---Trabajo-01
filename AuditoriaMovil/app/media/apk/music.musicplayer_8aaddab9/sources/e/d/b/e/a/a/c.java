package e.d.b.e.a.a;

import android.os.Bundle;
import android.os.RemoteException;
import java.util.ArrayList;
import java.util.List;
/* loaded from: classes2.dex */
public final class c extends e.d.b.e.a.c.f {

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ List f6737b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ e.d.b.e.a.g.n f6738c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ o f6739d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(o oVar, e.d.b.e.a.g.n nVar, List list, e.d.b.e.a.g.n nVar2) {
        super(nVar);
        this.f6739d = oVar;
        this.f6737b = list;
        this.f6738c = nVar2;
    }

    @Override // e.d.b.e.a.c.f
    public final void a() {
        List<String> list = this.f6737b;
        ArrayList arrayList = new ArrayList(list.size());
        for (String str : list) {
            Bundle bundle = new Bundle();
            bundle.putString("module_name", str);
            arrayList.add(bundle);
        }
        try {
            o oVar = this.f6739d;
            oVar.f6876e.f7010l.D0(oVar.f6874c, arrayList, o.j(), new j(this.f6739d, this.f6738c, (byte[]) null));
        } catch (RemoteException e2) {
            o.a.c(e2, "cancelDownloads(%s)", this.f6737b);
        }
    }
}
