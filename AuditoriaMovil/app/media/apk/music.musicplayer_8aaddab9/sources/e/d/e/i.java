package e.d.e;

import java.io.IOException;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicLongArray;
/* loaded from: classes2.dex */
public class i extends z<AtomicLongArray> {
    public final /* synthetic */ z a;

    public i(z zVar) {
        this.a = zVar;
    }

    @Override // e.d.e.z
    public AtomicLongArray a(e.d.e.e0.a aVar) throws IOException {
        ArrayList arrayList = new ArrayList();
        aVar.a();
        while (aVar.y()) {
            arrayList.add(Long.valueOf(((Number) this.a.a(aVar)).longValue()));
        }
        aVar.m();
        int size = arrayList.size();
        AtomicLongArray atomicLongArray = new AtomicLongArray(size);
        for (int i2 = 0; i2 < size; i2++) {
            atomicLongArray.set(i2, ((Long) arrayList.get(i2)).longValue());
        }
        return atomicLongArray;
    }

    @Override // e.d.e.z
    public void b(e.d.e.e0.c cVar, AtomicLongArray atomicLongArray) throws IOException {
        AtomicLongArray atomicLongArray2 = atomicLongArray;
        cVar.f();
        int length = atomicLongArray2.length();
        for (int i2 = 0; i2 < length; i2++) {
            this.a.b(cVar, Long.valueOf(atomicLongArray2.get(i2)));
        }
        cVar.m();
    }
}
