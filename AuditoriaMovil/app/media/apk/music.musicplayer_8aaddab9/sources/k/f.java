package k;

import java.io.IOException;
import java.nio.channels.WritableByteChannel;
/* loaded from: classes2.dex */
public interface f extends v, WritableByteChannel {
    f D(byte[] bArr, int i2, int i3) throws IOException;

    f F(long j2) throws IOException;

    f O(byte[] bArr) throws IOException;

    f P(h hVar) throws IOException;

    f Z(long j2) throws IOException;

    d b();

    @Override // k.v, java.io.Flushable
    void flush() throws IOException;

    f j(int i2) throws IOException;

    f k(int i2) throws IOException;

    f q(int i2) throws IOException;

    f x(String str) throws IOException;
}
