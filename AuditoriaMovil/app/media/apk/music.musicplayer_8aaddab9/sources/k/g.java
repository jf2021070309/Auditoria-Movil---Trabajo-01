package k;

import java.io.IOException;
import java.io.InputStream;
import java.nio.channels.ReadableByteChannel;
/* loaded from: classes2.dex */
public interface g extends x, ReadableByteChannel {
    boolean C(long j2, h hVar) throws IOException;

    boolean G(long j2) throws IOException;

    String J() throws IOException;

    byte[] L(long j2) throws IOException;

    long U(v vVar) throws IOException;

    void Y(long j2) throws IOException;

    d b();

    long b0() throws IOException;

    InputStream c0();

    h g(long j2) throws IOException;

    d o();

    boolean p() throws IOException;

    byte readByte() throws IOException;

    int readInt() throws IOException;

    short readShort() throws IOException;

    void skip(long j2) throws IOException;

    String w(long j2) throws IOException;
}
