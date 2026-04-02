package e.d.b.e.a.a;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Enumeration;
import java.util.Objects;
/* loaded from: classes2.dex */
public final class r1 extends InputStream {
    public final Enumeration<File> a;

    /* renamed from: b  reason: collision with root package name */
    public InputStream f6918b;

    public r1(Enumeration<File> enumeration) throws IOException {
        this.a = enumeration;
        a();
    }

    public final void a() throws IOException {
        InputStream inputStream = this.f6918b;
        if (inputStream != null) {
            inputStream.close();
        }
        this.f6918b = this.a.hasMoreElements() ? new FileInputStream(this.a.nextElement()) : null;
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        super.close();
        InputStream inputStream = this.f6918b;
        if (inputStream != null) {
            inputStream.close();
            this.f6918b = null;
        }
    }

    @Override // java.io.InputStream
    public final int read() throws IOException {
        while (true) {
            InputStream inputStream = this.f6918b;
            if (inputStream == null) {
                return -1;
            }
            int read = inputStream.read();
            if (read != -1) {
                return read;
            }
            a();
        }
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i2, int i3) throws IOException {
        if (this.f6918b == null) {
            return -1;
        }
        Objects.requireNonNull(bArr);
        if (i2 < 0 || i3 < 0 || i3 > bArr.length - i2) {
            throw new IndexOutOfBoundsException();
        }
        if (i3 != 0) {
            do {
                int read = this.f6918b.read(bArr, i2, i3);
                if (read > 0) {
                    return read;
                }
                a();
            } while (this.f6918b != null);
            return -1;
        }
        return 0;
    }
}
