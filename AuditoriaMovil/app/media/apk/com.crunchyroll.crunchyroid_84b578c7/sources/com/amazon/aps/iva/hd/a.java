package com.amazon.aps.iva.hd;

import com.google.common.primitives.UnsignedBytes;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.util.concurrent.atomic.AtomicReference;
import okhttp3.internal.http2.Http2;
/* compiled from: ByteBufferUtil.java */
/* loaded from: classes.dex */
public final class a {
    public static final AtomicReference<byte[]> a = new AtomicReference<>();

    /* compiled from: ByteBufferUtil.java */
    /* loaded from: classes.dex */
    public static final class b {
        public final int a;
        public final int b;
        public final byte[] c;

        public b(byte[] bArr, int i, int i2) {
            this.c = bArr;
            this.a = i;
            this.b = i2;
        }
    }

    public static MappedByteBuffer a(File file) throws IOException {
        RandomAccessFile randomAccessFile;
        Throwable th;
        FileChannel fileChannel;
        FileChannel fileChannel2 = null;
        try {
            long length = file.length();
            if (length <= 2147483647L) {
                if (length != 0) {
                    randomAccessFile = new RandomAccessFile(file, "r");
                    try {
                        fileChannel = randomAccessFile.getChannel();
                        try {
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
                        } catch (Throwable th2) {
                            th = th2;
                            Throwable th3 = th;
                            fileChannel2 = fileChannel;
                            th = th3;
                            if (fileChannel2 != null) {
                                try {
                                    fileChannel2.close();
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
                    } catch (Throwable th4) {
                        th = th4;
                        fileChannel = null;
                    }
                } else {
                    throw new IOException("File unsuitable for memory mapping");
                }
            } else {
                throw new IOException("File too large to map into memory");
            }
        } catch (Throwable th5) {
            th = th5;
            randomAccessFile = null;
        }
    }

    public static ByteBuffer b(InputStream inputStream) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(Http2.INITIAL_MAX_FRAME_SIZE);
        AtomicReference<byte[]> atomicReference = a;
        byte[] andSet = atomicReference.getAndSet(null);
        if (andSet == null) {
            andSet = new byte[Http2.INITIAL_MAX_FRAME_SIZE];
        }
        while (true) {
            int read = inputStream.read(andSet);
            if (read >= 0) {
                byteArrayOutputStream.write(andSet, 0, read);
            } else {
                atomicReference.set(andSet);
                byte[] byteArray = byteArrayOutputStream.toByteArray();
                return c(ByteBuffer.allocateDirect(byteArray.length).put(byteArray));
            }
        }
    }

    public static ByteBuffer c(ByteBuffer byteBuffer) {
        return (ByteBuffer) byteBuffer.position(0);
    }

    public static void d(ByteBuffer byteBuffer, File file) throws IOException {
        RandomAccessFile randomAccessFile;
        ByteBuffer byteBuffer2 = (ByteBuffer) byteBuffer.position(0);
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

    /* compiled from: ByteBufferUtil.java */
    /* renamed from: com.amazon.aps.iva.hd.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static class C0333a extends InputStream {
        public final ByteBuffer b;
        public int c = -1;

        public C0333a(ByteBuffer byteBuffer) {
            this.b = byteBuffer;
        }

        @Override // java.io.InputStream
        public final int available() {
            return this.b.remaining();
        }

        @Override // java.io.InputStream
        public final synchronized void mark(int i) {
            this.c = this.b.position();
        }

        @Override // java.io.InputStream
        public final boolean markSupported() {
            return true;
        }

        @Override // java.io.InputStream
        public final int read() {
            ByteBuffer byteBuffer = this.b;
            if (byteBuffer.hasRemaining()) {
                return byteBuffer.get() & UnsignedBytes.MAX_VALUE;
            }
            return -1;
        }

        @Override // java.io.InputStream
        public final synchronized void reset() throws IOException {
            int i = this.c;
            if (i != -1) {
                this.b.position(i);
            } else {
                throw new IOException("Cannot reset to unset mark position");
            }
        }

        @Override // java.io.InputStream
        public final long skip(long j) {
            ByteBuffer byteBuffer = this.b;
            if (!byteBuffer.hasRemaining()) {
                return -1L;
            }
            long min = Math.min(j, available());
            byteBuffer.position((int) (byteBuffer.position() + min));
            return min;
        }

        @Override // java.io.InputStream
        public final int read(byte[] bArr, int i, int i2) {
            ByteBuffer byteBuffer = this.b;
            if (byteBuffer.hasRemaining()) {
                int min = Math.min(i2, available());
                byteBuffer.get(bArr, i, min);
                return min;
            }
            return -1;
        }
    }
}
