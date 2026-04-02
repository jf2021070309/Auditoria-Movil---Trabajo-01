package e.b.a.a.z;
/* loaded from: classes.dex */
public class a {
    public final c a;

    /* renamed from: b  reason: collision with root package name */
    public b f5399b = null;

    public a(c cVar) {
        this.a = cVar;
    }

    public void a(b bVar, long j2) {
        e.b.a.a.y.c.a.a("add delayed message %s at time %s", bVar, Long.valueOf(j2));
        bVar.a = j2;
        b bVar2 = this.f5399b;
        if (bVar2 == null) {
            this.f5399b = bVar;
            return;
        }
        b bVar3 = null;
        while (bVar2 != null && bVar2.a <= j2) {
            bVar3 = bVar2;
            bVar2 = bVar2.f5401c;
        }
        if (bVar3 == null) {
            bVar.f5401c = this.f5399b;
            this.f5399b = bVar;
            return;
        }
        bVar3.f5401c = bVar;
        bVar.f5401c = bVar2;
    }

    public Long b(long j2, e eVar) {
        b bVar;
        e.b.a.a.y.c.a.a("flushing messages at time %s", Long.valueOf(j2));
        while (true) {
            bVar = this.f5399b;
            if (bVar == null || bVar.a > j2) {
                break;
            }
            this.f5399b = bVar.f5401c;
            bVar.f5401c = null;
            eVar.a(bVar);
        }
        if (bVar != null) {
            e.b.a.a.y.c.a.a("returning next ready at %d ns", Long.valueOf(bVar.a - j2));
            return Long.valueOf(this.f5399b.a);
        }
        return null;
    }
}
