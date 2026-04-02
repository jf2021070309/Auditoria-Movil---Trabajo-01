package e.b.a.a;

import e.b.a.a.d;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Set;
/* loaded from: classes.dex */
public class c {

    /* renamed from: d  reason: collision with root package name */
    public Set<String> f5291d;

    /* renamed from: e  reason: collision with root package name */
    public final s f5292e = null;

    /* renamed from: f  reason: collision with root package name */
    public final String[] f5293f = null;

    /* renamed from: b  reason: collision with root package name */
    public final Collection<i> f5289b = new ArrayList();

    /* renamed from: c  reason: collision with root package name */
    public final Collection<i> f5290c = new ArrayList();
    public final d.a a = null;

    public c(s sVar, String[] strArr, d.a aVar) {
    }

    public void a(l lVar) {
        for (i iVar : this.f5289b) {
            try {
                iVar.f5336e.f(3, iVar.r);
            } catch (Throwable th) {
                e.b.a.a.y.c.a.d(th, "job's on cancel has thrown an exception. Ignoring...", new Object[0]);
            }
            if (iVar.f5336e.f5330i) {
                lVar.f5368e.j(iVar);
            }
        }
        if (this.a != null) {
            ArrayList arrayList = new ArrayList(this.f5289b.size());
            ArrayList arrayList2 = new ArrayList(this.f5290c.size());
            for (i iVar2 : this.f5289b) {
                arrayList.add(iVar2.f5336e);
            }
            for (i iVar3 : this.f5290c) {
                arrayList2.add(iVar3.f5336e);
            }
            d dVar = new d(arrayList, arrayList2);
            b bVar = lVar.a;
            d.a aVar = this.a;
            e.b.a.a.z.k.d dVar2 = (e.b.a.a.z.k.d) bVar.f5240d.a(e.b.a.a.z.k.d.class);
            dVar2.f5425d = aVar;
            dVar2.f5426e = dVar;
            bVar.a.a(dVar2);
            bVar.d();
        }
        for (i iVar4 : this.f5289b) {
            lVar.a.b(iVar4.f5336e, true, iVar4.r);
        }
    }
}
