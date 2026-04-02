package e.d.e;

import java.io.IOException;
import java.util.concurrent.atomic.AtomicLong;
/* loaded from: classes2.dex */
public class h extends z<AtomicLong> {
    public final /* synthetic */ z a;

    public h(z zVar) {
        this.a = zVar;
    }

    @Override // e.d.e.z
    public AtomicLong a(e.d.e.e0.a aVar) throws IOException {
        return new AtomicLong(((Number) this.a.a(aVar)).longValue());
    }

    @Override // e.d.e.z
    public void b(e.d.e.e0.c cVar, AtomicLong atomicLong) throws IOException {
        this.a.b(cVar, Long.valueOf(atomicLong.get()));
    }
}
