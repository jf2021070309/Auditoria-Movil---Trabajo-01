package f.a.e;

import e.j.d.w;
import java.util.ArrayList;
/* loaded from: classes2.dex */
public final class a implements b {
    public f.a.h.d.b<b> a;

    /* renamed from: b  reason: collision with root package name */
    public volatile boolean f8911b;

    public boolean a(b bVar) {
        if (!this.f8911b) {
            synchronized (this) {
                if (!this.f8911b) {
                    f.a.h.d.b<b> bVar2 = this.a;
                    if (bVar2 == null) {
                        bVar2 = new f.a.h.d.b<>();
                        this.a = bVar2;
                    }
                    bVar2.a(bVar);
                    return true;
                }
            }
        }
        bVar.dispose();
        return false;
    }

    @Override // f.a.e.b
    public void dispose() {
        b[] bVarArr;
        if (this.f8911b) {
            return;
        }
        synchronized (this) {
            if (this.f8911b) {
                return;
            }
            this.f8911b = true;
            f.a.h.d.b<b> bVar = this.a;
            ArrayList arrayList = null;
            this.a = null;
            if (bVar == null) {
                return;
            }
            for (b bVar2 : bVar.f8920d) {
                if (bVar2 instanceof b) {
                    try {
                        bVar2.dispose();
                    } catch (Throwable th) {
                        w.D0(th);
                        if (arrayList == null) {
                            arrayList = new ArrayList();
                        }
                        arrayList.add(th);
                    }
                }
            }
            if (arrayList != null) {
                if (arrayList.size() != 1) {
                    throw new f.a.f.a(arrayList);
                }
                throw f.a.h.d.a.a((Throwable) arrayList.get(0));
            }
        }
    }
}
