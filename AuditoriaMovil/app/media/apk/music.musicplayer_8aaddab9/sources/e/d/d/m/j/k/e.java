package e.d.d.m.j.k;

import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.RandomAccessFile;
import java.nio.channels.FileChannel;
import java.util.NoSuchElementException;
import java.util.Objects;
import java.util.logging.Level;
import java.util.logging.Logger;
/* loaded from: classes2.dex */
public class e implements Closeable {
    public static final Logger a = Logger.getLogger(e.class.getName());

    /* renamed from: b  reason: collision with root package name */
    public final RandomAccessFile f7239b;

    /* renamed from: c  reason: collision with root package name */
    public int f7240c;

    /* renamed from: d  reason: collision with root package name */
    public int f7241d;

    /* renamed from: e  reason: collision with root package name */
    public b f7242e;

    /* renamed from: f  reason: collision with root package name */
    public b f7243f;

    /* renamed from: g  reason: collision with root package name */
    public final byte[] f7244g = new byte[16];

    /* loaded from: classes2.dex */
    public class a implements d {
        public boolean a = true;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ StringBuilder f7245b;

        public a(e eVar, StringBuilder sb) {
            this.f7245b = sb;
        }

        @Override // e.d.d.m.j.k.e.d
        public void a(InputStream inputStream, int i2) throws IOException {
            if (this.a) {
                this.a = false;
            } else {
                this.f7245b.append(", ");
            }
            this.f7245b.append(i2);
        }
    }

    /* loaded from: classes2.dex */
    public static class b {
        public static final b a = new b(0, 0);

        /* renamed from: b  reason: collision with root package name */
        public final int f7246b;

        /* renamed from: c  reason: collision with root package name */
        public final int f7247c;

        public b(int i2, int i3) {
            this.f7246b = i2;
            this.f7247c = i3;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append(b.class.getSimpleName());
            sb.append("[position = ");
            sb.append(this.f7246b);
            sb.append(", length = ");
            return e.a.d.a.a.p(sb, this.f7247c, "]");
        }
    }

    /* loaded from: classes2.dex */
    public final class c extends InputStream {
        public int a;

        /* renamed from: b  reason: collision with root package name */
        public int f7248b;

        public c(b bVar, a aVar) {
            int i2 = bVar.f7246b + 4;
            int i3 = e.this.f7240c;
            this.a = i2 >= i3 ? (i2 + 16) - i3 : i2;
            this.f7248b = bVar.f7247c;
        }

        @Override // java.io.InputStream
        public int read() throws IOException {
            if (this.f7248b == 0) {
                return -1;
            }
            e.this.f7239b.seek(this.a);
            int read = e.this.f7239b.read();
            this.a = e.a(e.this, this.a + 1);
            this.f7248b--;
            return read;
        }

        @Override // java.io.InputStream
        public int read(byte[] bArr, int i2, int i3) throws IOException {
            Objects.requireNonNull(bArr, "buffer");
            if ((i2 | i3) < 0 || i3 > bArr.length - i2) {
                throw new ArrayIndexOutOfBoundsException();
            }
            int i4 = this.f7248b;
            if (i4 > 0) {
                if (i3 > i4) {
                    i3 = i4;
                }
                e.this.z(this.a, bArr, i2, i3);
                this.a = e.a(e.this, this.a + i3);
                this.f7248b -= i3;
                return i3;
            }
            return -1;
        }
    }

    /* loaded from: classes2.dex */
    public interface d {
        void a(InputStream inputStream, int i2) throws IOException;
    }

    public e(File file) throws IOException {
        if (!file.exists()) {
            File file2 = new File(file.getPath() + ".tmp");
            RandomAccessFile randomAccessFile = new RandomAccessFile(file2, "rwd");
            try {
                randomAccessFile.setLength(4096L);
                randomAccessFile.seek(0L);
                byte[] bArr = new byte[16];
                int[] iArr = {4096, 0, 0, 0};
                int i2 = 0;
                for (int i3 = 0; i3 < 4; i3++) {
                    M(bArr, i2, iArr[i3]);
                    i2 += 4;
                }
                randomAccessFile.write(bArr);
                randomAccessFile.close();
                if (!file2.renameTo(file)) {
                    throw new IOException("Rename failed!");
                }
            } catch (Throwable th) {
                randomAccessFile.close();
                throw th;
            }
        }
        RandomAccessFile randomAccessFile2 = new RandomAccessFile(file, "rwd");
        this.f7239b = randomAccessFile2;
        randomAccessFile2.seek(0L);
        randomAccessFile2.readFully(this.f7244g);
        int v = v(this.f7244g, 0);
        this.f7240c = v;
        if (v > randomAccessFile2.length()) {
            StringBuilder y = e.a.d.a.a.y("File is truncated. Expected length: ");
            y.append(this.f7240c);
            y.append(", Actual length: ");
            y.append(randomAccessFile2.length());
            throw new IOException(y.toString());
        }
        this.f7241d = v(this.f7244g, 4);
        int v2 = v(this.f7244g, 8);
        int v3 = v(this.f7244g, 12);
        this.f7242e = u(v2);
        this.f7243f = u(v3);
    }

    public static void M(byte[] bArr, int i2, int i3) {
        bArr[i2] = (byte) (i3 >> 24);
        bArr[i2 + 1] = (byte) (i3 >> 16);
        bArr[i2 + 2] = (byte) (i3 >> 8);
        bArr[i2 + 3] = (byte) i3;
    }

    public static int a(e eVar, int i2) {
        int i3 = eVar.f7240c;
        return i2 < i3 ? i2 : (i2 + 16) - i3;
    }

    public static int v(byte[] bArr, int i2) {
        return ((bArr[i2] & 255) << 24) + ((bArr[i2 + 1] & 255) << 16) + ((bArr[i2 + 2] & 255) << 8) + (bArr[i2 + 3] & 255);
    }

    public final void B(int i2, byte[] bArr, int i3, int i4) throws IOException {
        int i5 = this.f7240c;
        if (i2 >= i5) {
            i2 = (i2 + 16) - i5;
        }
        if (i2 + i4 <= i5) {
            this.f7239b.seek(i2);
            this.f7239b.write(bArr, i3, i4);
            return;
        }
        int i6 = i5 - i2;
        this.f7239b.seek(i2);
        this.f7239b.write(bArr, i3, i6);
        this.f7239b.seek(16L);
        this.f7239b.write(bArr, i3 + i6, i4 - i6);
    }

    public int H() {
        if (this.f7241d == 0) {
            return 16;
        }
        b bVar = this.f7243f;
        int i2 = bVar.f7246b;
        int i3 = this.f7242e.f7246b;
        return i2 >= i3 ? (i2 - i3) + 4 + bVar.f7247c + 16 : (((i2 + 4) + bVar.f7247c) + this.f7240c) - i3;
    }

    public final int I(int i2) {
        int i3 = this.f7240c;
        return i2 < i3 ? i2 : (i2 + 16) - i3;
    }

    public final void K(int i2, int i3, int i4, int i5) throws IOException {
        byte[] bArr = this.f7244g;
        int[] iArr = {i2, i3, i4, i5};
        int i6 = 0;
        for (int i7 = 0; i7 < 4; i7++) {
            M(bArr, i6, iArr[i7]);
            i6 += 4;
        }
        this.f7239b.seek(0L);
        this.f7239b.write(this.f7244g);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public synchronized void close() throws IOException {
        this.f7239b.close();
    }

    public void f(byte[] bArr) throws IOException {
        int I;
        int length = bArr.length;
        synchronized (this) {
            if ((0 | length) >= 0) {
                if (length <= bArr.length - 0) {
                    i(length);
                    boolean r = r();
                    if (r) {
                        I = 16;
                    } else {
                        b bVar = this.f7243f;
                        I = I(bVar.f7246b + 4 + bVar.f7247c);
                    }
                    b bVar2 = new b(I, length);
                    M(this.f7244g, 0, length);
                    B(I, this.f7244g, 0, 4);
                    B(I + 4, bArr, 0, length);
                    K(this.f7240c, this.f7241d + 1, r ? I : this.f7242e.f7246b, I);
                    this.f7243f = bVar2;
                    this.f7241d++;
                    if (r) {
                        this.f7242e = bVar2;
                    }
                }
            }
            throw new IndexOutOfBoundsException();
        }
    }

    public synchronized void h() throws IOException {
        K(4096, 0, 0, 0);
        this.f7241d = 0;
        b bVar = b.a;
        this.f7242e = bVar;
        this.f7243f = bVar;
        if (this.f7240c > 4096) {
            this.f7239b.setLength(4096);
            this.f7239b.getChannel().force(true);
        }
        this.f7240c = 4096;
    }

    public final void i(int i2) throws IOException {
        int i3 = i2 + 4;
        int H = this.f7240c - H();
        if (H >= i3) {
            return;
        }
        int i4 = this.f7240c;
        do {
            H += i4;
            i4 <<= 1;
        } while (H < i3);
        this.f7239b.setLength(i4);
        this.f7239b.getChannel().force(true);
        b bVar = this.f7243f;
        int I = I(bVar.f7246b + 4 + bVar.f7247c);
        if (I < this.f7242e.f7246b) {
            FileChannel channel = this.f7239b.getChannel();
            channel.position(this.f7240c);
            long j2 = I - 4;
            if (channel.transferTo(16L, j2, channel) != j2) {
                throw new AssertionError("Copied insufficient number of bytes!");
            }
        }
        int i5 = this.f7243f.f7246b;
        int i6 = this.f7242e.f7246b;
        if (i5 < i6) {
            int i7 = (this.f7240c + i5) - 16;
            K(i4, this.f7241d, i6, i7);
            this.f7243f = new b(i7, this.f7243f.f7247c);
        } else {
            K(i4, this.f7241d, i6, i5);
        }
        this.f7240c = i4;
    }

    public synchronized void m(d dVar) throws IOException {
        int i2 = this.f7242e.f7246b;
        for (int i3 = 0; i3 < this.f7241d; i3++) {
            b u = u(i2);
            dVar.a(new c(u, null), u.f7247c);
            i2 = I(u.f7246b + 4 + u.f7247c);
        }
    }

    public synchronized boolean r() {
        return this.f7241d == 0;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(e.class.getSimpleName());
        sb.append('[');
        sb.append("fileLength=");
        sb.append(this.f7240c);
        sb.append(", size=");
        sb.append(this.f7241d);
        sb.append(", first=");
        sb.append(this.f7242e);
        sb.append(", last=");
        sb.append(this.f7243f);
        sb.append(", element lengths=[");
        try {
            m(new a(this, sb));
        } catch (IOException e2) {
            a.log(Level.WARNING, "read error", (Throwable) e2);
        }
        sb.append("]]");
        return sb.toString();
    }

    public final b u(int i2) throws IOException {
        if (i2 == 0) {
            return b.a;
        }
        this.f7239b.seek(i2);
        return new b(i2, this.f7239b.readInt());
    }

    public synchronized void y() throws IOException {
        if (r()) {
            throw new NoSuchElementException();
        }
        if (this.f7241d == 1) {
            h();
        } else {
            b bVar = this.f7242e;
            int I = I(bVar.f7246b + 4 + bVar.f7247c);
            z(I, this.f7244g, 0, 4);
            int v = v(this.f7244g, 0);
            K(this.f7240c, this.f7241d - 1, I, this.f7243f.f7246b);
            this.f7241d--;
            this.f7242e = new b(I, v);
        }
    }

    public final void z(int i2, byte[] bArr, int i3, int i4) throws IOException {
        int i5 = this.f7240c;
        if (i2 >= i5) {
            i2 = (i2 + 16) - i5;
        }
        if (i2 + i4 <= i5) {
            this.f7239b.seek(i2);
            this.f7239b.readFully(bArr, i3, i4);
            return;
        }
        int i6 = i5 - i2;
        this.f7239b.seek(i2);
        this.f7239b.readFully(bArr, i3, i6);
        this.f7239b.seek(16L);
        this.f7239b.readFully(bArr, i3 + i6, i4 - i6);
    }
}
