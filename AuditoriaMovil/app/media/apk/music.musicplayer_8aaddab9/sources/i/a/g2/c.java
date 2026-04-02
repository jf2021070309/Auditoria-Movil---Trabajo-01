package i.a.g2;

import e.j.d.w;
import i.a.i2.n;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
/* loaded from: classes2.dex */
public abstract class c<E> {
    public final h.o.b.l<E, h.k> a;

    /* renamed from: b  reason: collision with root package name */
    public final i.a.i2.g f8990b = new i.a.i2.g();
    private volatile /* synthetic */ Object onCloseHandler = null;

    static {
        AtomicReferenceFieldUpdater.newUpdater(c.class, Object.class, "onCloseHandler");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public c(h.o.b.l<? super E, h.k> lVar) {
        this.a = lVar;
    }

    public String c() {
        return "";
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final h<?> d() {
        i.a.i2.i k2 = this.f8990b.k();
        h<?> hVar = k2 instanceof h ? (h) k2 : null;
        if (hVar == null) {
            return null;
        }
        i iVar = null;
        while (true) {
            i.a.i2.i k3 = hVar.k();
            i iVar2 = k3 instanceof i ? (i) k3 : null;
            if (iVar2 == null) {
                break;
            }
            if (!(iVar2.n() == null)) {
                ((n) iVar2.g()).a.l();
            } else if (iVar == null) {
                iVar = iVar2;
            } else if (iVar instanceof ArrayList) {
                ((ArrayList) iVar).add(iVar2);
            } else {
                ArrayList arrayList = new ArrayList(4);
                arrayList.add(iVar);
                arrayList.add(iVar2);
                iVar = arrayList;
            }
        }
        if (iVar != null) {
            if (iVar instanceof ArrayList) {
                ArrayList arrayList2 = (ArrayList) iVar;
                int size = arrayList2.size() - 1;
                if (size >= 0) {
                    while (true) {
                        int i2 = size - 1;
                        ((i) arrayList2.get(size)).o(hVar);
                        if (i2 < 0) {
                            break;
                        }
                        size = i2;
                    }
                }
            } else {
                iVar.o(hVar);
            }
        }
        return hVar;
    }

    public final l e() {
        i.a.i2.i iVar;
        i.a.i2.i n2;
        i.a.i2.g gVar = this.f8990b;
        while (true) {
            iVar = (i.a.i2.i) gVar.g();
            if (iVar != gVar && (iVar instanceof l)) {
                if (((((l) iVar) instanceof h) && !iVar.m()) || (n2 = iVar.n()) == null) {
                    break;
                }
                n2.l();
            }
        }
        iVar = null;
        return (l) iVar;
    }

    public String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append('@');
        sb.append(w.M(this));
        sb.append('{');
        i.a.i2.i j2 = this.f8990b.j();
        if (j2 == this.f8990b) {
            str = "EmptyQueue";
        } else {
            String iVar = j2 instanceof h ? j2.toString() : j2 instanceof i ? "ReceiveQueued" : j2 instanceof l ? "SendQueued" : h.o.c.j.i("UNEXPECTED:", j2);
            i.a.i2.i k2 = this.f8990b.k();
            if (k2 != j2) {
                StringBuilder A = e.a.d.a.a.A(iVar, ",queueSize=");
                i.a.i2.g gVar = this.f8990b;
                int i2 = 0;
                for (i.a.i2.i iVar2 = (i.a.i2.i) gVar.g(); !h.o.c.j.a(iVar2, gVar); iVar2 = iVar2.j()) {
                    if (iVar2 instanceof i.a.i2.i) {
                        i2++;
                    }
                }
                A.append(i2);
                str = A.toString();
                if (k2 instanceof h) {
                    str = str + ",closedForSend=" + k2;
                }
            } else {
                str = iVar;
            }
        }
        sb.append(str);
        sb.append('}');
        sb.append(c());
        return sb.toString();
    }
}
