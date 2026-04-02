package e.c.a.m.u.c;

import android.graphics.Bitmap;
import e.c.a.s.a;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;
/* loaded from: classes.dex */
public class g implements e.c.a.m.o<ByteBuffer, Bitmap> {
    public final m a;

    public g(m mVar) {
        this.a = mVar;
    }

    @Override // e.c.a.m.o
    public boolean a(ByteBuffer byteBuffer, e.c.a.m.m mVar) throws IOException {
        Objects.requireNonNull(this.a);
        return true;
    }

    @Override // e.c.a.m.o
    public e.c.a.m.s.w<Bitmap> b(ByteBuffer byteBuffer, int i2, int i3, e.c.a.m.m mVar) throws IOException {
        AtomicReference<byte[]> atomicReference = e.c.a.s.a.a;
        return this.a.b(new a.C0132a(byteBuffer), i2, i3, mVar, m.f5873f);
    }
}
