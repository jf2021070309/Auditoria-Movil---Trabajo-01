package e.c.a.m.u.h;

import e.c.a.m.m;
import e.c.a.m.s.w;
import e.c.a.s.a;
import java.nio.ByteBuffer;
import java.util.concurrent.atomic.AtomicReference;
/* loaded from: classes.dex */
public class d implements e<e.c.a.m.u.g.c, byte[]> {
    @Override // e.c.a.m.u.h.e
    public w<byte[]> a(w<e.c.a.m.u.g.c> wVar, m mVar) {
        byte[] bArr;
        ByteBuffer asReadOnlyBuffer = wVar.get().a.a.a.e().asReadOnlyBuffer();
        AtomicReference<byte[]> atomicReference = e.c.a.s.a.a;
        a.b bVar = (asReadOnlyBuffer.isReadOnly() || !asReadOnlyBuffer.hasArray()) ? null : new a.b(asReadOnlyBuffer.array(), asReadOnlyBuffer.arrayOffset(), asReadOnlyBuffer.limit());
        if (bVar != null && bVar.a == 0 && bVar.f6019b == bVar.f6020c.length) {
            bArr = asReadOnlyBuffer.array();
        } else {
            ByteBuffer asReadOnlyBuffer2 = asReadOnlyBuffer.asReadOnlyBuffer();
            byte[] bArr2 = new byte[asReadOnlyBuffer2.limit()];
            asReadOnlyBuffer2.position(0);
            asReadOnlyBuffer2.get(bArr2);
            bArr = bArr2;
        }
        return new e.c.a.m.u.d.b(bArr);
    }
}
