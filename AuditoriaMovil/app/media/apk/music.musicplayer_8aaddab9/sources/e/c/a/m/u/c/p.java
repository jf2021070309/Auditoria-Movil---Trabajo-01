package e.c.a.m.u.c;

import c.l.a.a;
import com.bumptech.glide.load.ImageHeaderParser;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
/* loaded from: classes.dex */
public final class p implements ImageHeaderParser {
    @Override // com.bumptech.glide.load.ImageHeaderParser
    public ImageHeaderParser.ImageType a(ByteBuffer byteBuffer) {
        return ImageHeaderParser.ImageType.UNKNOWN;
    }

    @Override // com.bumptech.glide.load.ImageHeaderParser
    public ImageHeaderParser.ImageType b(InputStream inputStream) {
        return ImageHeaderParser.ImageType.UNKNOWN;
    }

    @Override // com.bumptech.glide.load.ImageHeaderParser
    public int c(InputStream inputStream, e.c.a.m.s.c0.b bVar) throws IOException {
        c.l.a.a aVar = new c.l.a.a(inputStream);
        a.b d2 = aVar.d("Orientation");
        int i2 = 1;
        if (d2 != null) {
            try {
                i2 = d2.f(aVar.H);
            } catch (NumberFormatException unused) {
            }
        }
        if (i2 == 0) {
            return -1;
        }
        return i2;
    }
}
