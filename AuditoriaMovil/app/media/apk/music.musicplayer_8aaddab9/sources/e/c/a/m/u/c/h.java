package e.c.a.m.u.c;

import android.graphics.Bitmap;
import android.graphics.ImageDecoder;
import java.io.IOException;
import java.nio.ByteBuffer;
/* loaded from: classes.dex */
public final class h implements e.c.a.m.o<ByteBuffer, Bitmap> {
    public final d a = new d();

    @Override // e.c.a.m.o
    public /* bridge */ /* synthetic */ boolean a(ByteBuffer byteBuffer, e.c.a.m.m mVar) throws IOException {
        return true;
    }

    @Override // e.c.a.m.o
    public e.c.a.m.s.w<Bitmap> b(ByteBuffer byteBuffer, int i2, int i3, e.c.a.m.m mVar) throws IOException {
        return this.a.b(ImageDecoder.createSource(byteBuffer), i2, i3, mVar);
    }
}
