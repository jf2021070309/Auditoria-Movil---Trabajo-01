package e.c.a.m.u.g;

import android.util.Log;
import com.bumptech.glide.load.ImageHeaderParser;
import e.c.a.m.m;
import e.c.a.m.o;
import e.c.a.m.s.w;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;
/* loaded from: classes.dex */
public class j implements o<InputStream, c> {
    public final List<ImageHeaderParser> a;

    /* renamed from: b  reason: collision with root package name */
    public final o<ByteBuffer, c> f5941b;

    /* renamed from: c  reason: collision with root package name */
    public final e.c.a.m.s.c0.b f5942c;

    public j(List<ImageHeaderParser> list, o<ByteBuffer, c> oVar, e.c.a.m.s.c0.b bVar) {
        this.a = list;
        this.f5941b = oVar;
        this.f5942c = bVar;
    }

    @Override // e.c.a.m.o
    public boolean a(InputStream inputStream, m mVar) throws IOException {
        return !((Boolean) mVar.c(i.f5940b)).booleanValue() && c.t.m.n(this.a, inputStream, this.f5942c) == ImageHeaderParser.ImageType.GIF;
    }

    @Override // e.c.a.m.o
    public w<c> b(InputStream inputStream, int i2, int i3, m mVar) throws IOException {
        byte[] bArr;
        InputStream inputStream2 = inputStream;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(16384);
        try {
            byte[] bArr2 = new byte[16384];
            while (true) {
                int read = inputStream2.read(bArr2);
                if (read == -1) {
                    break;
                }
                byteArrayOutputStream.write(bArr2, 0, read);
            }
            byteArrayOutputStream.flush();
            bArr = byteArrayOutputStream.toByteArray();
        } catch (IOException e2) {
            if (Log.isLoggable("StreamGifDecoder", 5)) {
                Log.w("StreamGifDecoder", "Error reading data from stream", e2);
            }
            bArr = null;
        }
        if (bArr == null) {
            return null;
        }
        return this.f5941b.b(ByteBuffer.wrap(bArr), i2, i3, mVar);
    }
}
