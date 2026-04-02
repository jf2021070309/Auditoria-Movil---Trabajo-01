package e.c.a.m.u.c;

import android.graphics.Bitmap;
import android.graphics.ImageDecoder;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.concurrent.atomic.AtomicReference;
/* loaded from: classes.dex */
public final class t implements e.c.a.m.o<InputStream, Bitmap> {
    public final d a = new d();

    @Override // e.c.a.m.o
    public /* bridge */ /* synthetic */ boolean a(InputStream inputStream, e.c.a.m.m mVar) throws IOException {
        return true;
    }

    @Override // e.c.a.m.o
    public e.c.a.m.s.w<Bitmap> b(InputStream inputStream, int i2, int i3, e.c.a.m.m mVar) throws IOException {
        InputStream inputStream2 = inputStream;
        AtomicReference<byte[]> atomicReference = e.c.a.s.a.a;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(16384);
        byte[] andSet = e.c.a.s.a.a.getAndSet(null);
        if (andSet == null) {
            andSet = new byte[16384];
        }
        while (true) {
            int read = inputStream2.read(andSet);
            if (read < 0) {
                e.c.a.s.a.a.set(andSet);
                byte[] byteArray = byteArrayOutputStream.toByteArray();
                return this.a.b(ImageDecoder.createSource((ByteBuffer) ByteBuffer.allocateDirect(byteArray.length).put(byteArray).position(0)), i2, i3, mVar);
            }
            byteArrayOutputStream.write(andSet, 0, read);
        }
    }
}
