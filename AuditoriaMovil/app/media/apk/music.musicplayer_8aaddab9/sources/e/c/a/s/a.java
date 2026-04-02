package e.c.a.s;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.util.concurrent.atomic.AtomicReference;
/* loaded from: classes.dex */
public final class a {
    public static final AtomicReference<byte[]> a = new AtomicReference<>();

    /* renamed from: e.c.a.s.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static class C0132a extends InputStream {
        public final ByteBuffer a;

        /* renamed from: b  reason: collision with root package name */
        public int f6018b = -1;

        public C0132a(ByteBuffer byteBuffer) {
            this.a = byteBuffer;
        }

        @Override // java.io.InputStream
        public int available() {
            return this.a.remaining();
        }

        @Override // java.io.InputStream
        public synchronized void mark(int i2) {
            this.f6018b = this.a.position();
        }

        @Override // java.io.InputStream
        public boolean markSupported() {
            return true;
        }

        @Override // java.io.InputStream
        public int read() {
            if (this.a.hasRemaining()) {
                return this.a.get() & 255;
            }
            return -1;
        }

        @Override // java.io.InputStream
        public int read(byte[] bArr, int i2, int i3) throws IOException {
            if (this.a.hasRemaining()) {
                int min = Math.min(i3, available());
                this.a.get(bArr, i2, min);
                return min;
            }
            return -1;
        }

        @Override // java.io.InputStream
        public synchronized void reset() throws IOException {
            int i2 = this.f6018b;
            if (i2 == -1) {
                throw new IOException("Cannot reset to unset mark position");
            }
            this.a.position(i2);
        }

        @Override // java.io.InputStream
        public long skip(long j2) throws IOException {
            if (this.a.hasRemaining()) {
                long min = Math.min(j2, available());
                ByteBuffer byteBuffer = this.a;
                byteBuffer.position((int) (byteBuffer.position() + min));
                return min;
            }
            return -1L;
        }
    }

    /* loaded from: classes.dex */
    public static final class b {
        public final int a;

        /* renamed from: b  reason: collision with root package name */
        public final int f6019b;

        /* renamed from: c  reason: collision with root package name */
        public final byte[] f6020c;

        public b(byte[] bArr, int i2, int i3) {
            this.f6020c = bArr;
            this.a = i2;
            this.f6019b = i3;
        }
    }

    public static ByteBuffer a(File file) throws IOException {
        RandomAccessFile randomAccessFile;
        FileChannel fileChannel = null;
        try {
            long length = file.length();
            if (length <= 2147483647L) {
                if (length != 0) {
                    randomAccessFile = new RandomAccessFile(file, "r");
                    try {
                        fileChannel = randomAccessFile.getChannel();
                        MappedByteBuffer load = fileChannel.map(FileChannel.MapMode.READ_ONLY, 0L, length).load();
                        try {
                            fileChannel.close();
                        } catch (IOException unused) {
                        }
                        try {
                            randomAccessFile.close();
                        } catch (IOException unused2) {
                        }
                        return load;
                    } catch (Throwable th) {
                        th = th;
                        if (fileChannel != null) {
                            try {
                                fileChannel.close();
                            } catch (IOException unused3) {
                            }
                        }
                        if (randomAccessFile != null) {
                            try {
                                randomAccessFile.close();
                            } catch (IOException unused4) {
                            }
                        }
                        throw th;
                    }
                }
                throw new IOException("File unsuitable for memory mapping");
            }
            throw new IOException("File too large to map into memory");
        } catch (Throwable th2) {
            th = th2;
            randomAccessFile = null;
        }
    }

    public static void b(ByteBuffer byteBuffer, File file) throws IOException {
        RandomAccessFile randomAccessFile;
        byteBuffer.position(0);
        FileChannel fileChannel = null;
        try {
            randomAccessFile = new RandomAccessFile(file, "rw");
            try {
                fileChannel = randomAccessFile.getChannel();
                fileChannel.write(byteBuffer);
                fileChannel.force(false);
                fileChannel.close();
                randomAccessFile.close();
                try {
                    fileChannel.close();
                } catch (IOException unused) {
                }
                try {
                    randomAccessFile.close();
                } catch (IOException unused2) {
                }
            } catch (Throwable th) {
                th = th;
                if (fileChannel != null) {
                    try {
                        fileChannel.close();
                    } catch (IOException unused3) {
                    }
                }
                if (randomAccessFile != null) {
                    try {
                        randomAccessFile.close();
                    } catch (IOException unused4) {
                    }
                }
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            randomAccessFile = null;
        }
    }
}
