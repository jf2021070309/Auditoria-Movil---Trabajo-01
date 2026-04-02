package e.b.a.a;

import java.util.Iterator;
import java.util.Objects;
/* loaded from: classes.dex */
public class a implements Runnable {
    public final /* synthetic */ b a;

    /* renamed from: e.b.a.a.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public class C0104a extends e.b.a.a.z.f {
        public C0104a() {
        }

        @Override // e.b.a.a.z.f
        public void a(e.b.a.a.z.b bVar) {
            e.b.a.a.z.i iVar = bVar.f5400b;
            if (iVar != e.b.a.a.z.i.CALLBACK) {
                if (iVar == e.b.a.a.z.i.CANCEL_RESULT_CALLBACK) {
                    b bVar2 = a.this.a;
                    e.b.a.a.z.k.d dVar = (e.b.a.a.z.k.d) bVar;
                    Objects.requireNonNull(bVar2);
                    dVar.f5425d.a(dVar.f5426e);
                    bVar2.d();
                    a.this.a.f5242f.a();
                    return;
                } else if (iVar != e.b.a.a.z.i.COMMAND) {
                    if (iVar != e.b.a.a.z.i.PUBLIC_QUERY) {
                        return;
                    }
                    e.b.a.a.z.k.h hVar = (e.b.a.a.z.k.h) bVar;
                    throw null;
                } else {
                    int i2 = ((e.b.a.a.z.k.e) bVar).f5427d;
                    if (i2 == 1) {
                        a.this.a.a.e();
                        a.this.a.f5241e.set(false);
                        return;
                    } else if (i2 == 3) {
                        throw null;
                    } else {
                        return;
                    }
                }
            }
            e.b.a.a.z.k.b bVar3 = (e.b.a.a.z.k.b) bVar;
            b bVar4 = a.this.a;
            Objects.requireNonNull(bVar4);
            int i3 = bVar3.f5424h;
            if (i3 == 1) {
                h hVar2 = bVar3.f5421e;
                Iterator<e.b.a.a.v.a> it = bVar4.f5238b.iterator();
                while (it.hasNext()) {
                    it.next().c(hVar2);
                }
            } else if (i3 == 2) {
                h hVar3 = bVar3.f5421e;
                int i4 = bVar3.f5422f;
                Iterator<e.b.a.a.v.a> it2 = bVar4.f5238b.iterator();
                while (it2.hasNext()) {
                    it2.next().b(hVar3, i4);
                }
            } else if (i3 == 3) {
                h hVar4 = bVar3.f5421e;
                boolean z = bVar3.f5420d;
                Throwable th = bVar3.f5423g;
                Iterator<e.b.a.a.v.a> it3 = bVar4.f5238b.iterator();
                while (it3.hasNext()) {
                    it3.next().a(hVar4, z, th);
                }
            } else if (i3 == 4) {
                h hVar5 = bVar3.f5421e;
                Iterator<e.b.a.a.v.a> it4 = bVar4.f5238b.iterator();
                while (it4.hasNext()) {
                    it4.next().d(hVar5);
                }
            } else if (i3 == 5) {
                h hVar6 = bVar3.f5421e;
                int i5 = bVar3.f5422f;
                Iterator<e.b.a.a.v.a> it5 = bVar4.f5238b.iterator();
                while (it5.hasNext()) {
                    it5.next().e(hVar6, i5);
                }
            }
            a.this.a.f5242f.a();
        }

        @Override // e.b.a.a.z.f
        public void b() {
        }

        @Override // e.b.a.a.z.f
        public void c() {
        }
    }

    public a(b bVar) {
        this.a = bVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.a.a.d(new C0104a());
    }
}
