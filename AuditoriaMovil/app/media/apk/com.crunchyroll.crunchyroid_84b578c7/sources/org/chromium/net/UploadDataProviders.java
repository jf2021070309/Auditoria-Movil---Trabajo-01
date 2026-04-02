package org.chromium.net;

import android.os.ParcelFileDescriptor;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
/* loaded from: classes4.dex */
public final class UploadDataProviders {

    /* loaded from: classes4.dex */
    public class a implements d {
        public final /* synthetic */ File a;

        public a(File file) {
            this.a = file;
        }

        @Override // org.chromium.net.UploadDataProviders.d
        public final FileChannel C() throws IOException {
            return new FileInputStream(this.a).getChannel();
        }
    }

    /* loaded from: classes4.dex */
    public class b implements d {
        public final /* synthetic */ ParcelFileDescriptor a;

        public b(ParcelFileDescriptor parcelFileDescriptor) {
            this.a = parcelFileDescriptor;
        }

        @Override // org.chromium.net.UploadDataProviders.d
        public final FileChannel C() throws IOException {
            ParcelFileDescriptor parcelFileDescriptor = this.a;
            if (parcelFileDescriptor.getStatSize() != -1) {
                return new ParcelFileDescriptor.AutoCloseInputStream(parcelFileDescriptor).getChannel();
            }
            parcelFileDescriptor.close();
            throw new IllegalArgumentException("Not a file: " + parcelFileDescriptor);
        }
    }

    /* loaded from: classes4.dex */
    public static final class c extends UploadDataProvider {
        public final ByteBuffer b;

        public c(ByteBuffer byteBuffer) {
            this.b = byteBuffer;
        }

        @Override // org.chromium.net.UploadDataProvider
        public final long getLength() {
            return this.b.limit();
        }

        @Override // org.chromium.net.UploadDataProvider
        public final void read(UploadDataSink uploadDataSink, ByteBuffer byteBuffer) {
            if (byteBuffer.hasRemaining()) {
                int remaining = byteBuffer.remaining();
                ByteBuffer byteBuffer2 = this.b;
                if (remaining >= byteBuffer2.remaining()) {
                    byteBuffer.put(byteBuffer2);
                } else {
                    int limit = byteBuffer2.limit();
                    byteBuffer2.limit(byteBuffer.remaining() + byteBuffer2.position());
                    byteBuffer.put(byteBuffer2);
                    byteBuffer2.limit(limit);
                }
                uploadDataSink.onReadSucceeded(false);
                return;
            }
            throw new IllegalStateException("Cronet passed a buffer with no bytes remaining");
        }

        @Override // org.chromium.net.UploadDataProvider
        public final void rewind(UploadDataSink uploadDataSink) {
            this.b.position(0);
            uploadDataSink.onRewindSucceeded();
        }
    }

    /* loaded from: classes4.dex */
    public interface d {
        FileChannel C() throws IOException;
    }

    /* loaded from: classes4.dex */
    public static final class e extends UploadDataProvider {
        public volatile FileChannel b;
        public final d c;
        public final Object d = new Object();

        public e(d dVar) {
            this.c = dVar;
        }

        public final FileChannel a() throws IOException {
            if (this.b == null) {
                synchronized (this.d) {
                    if (this.b == null) {
                        this.b = this.c.C();
                    }
                }
            }
            return this.b;
        }

        @Override // org.chromium.net.UploadDataProvider, java.io.Closeable, java.lang.AutoCloseable
        public final void close() throws IOException {
            FileChannel fileChannel = this.b;
            if (fileChannel != null) {
                fileChannel.close();
            }
        }

        @Override // org.chromium.net.UploadDataProvider
        public final long getLength() throws IOException {
            return a().size();
        }

        @Override // org.chromium.net.UploadDataProvider
        public final void read(UploadDataSink uploadDataSink, ByteBuffer byteBuffer) throws IOException {
            if (byteBuffer.hasRemaining()) {
                FileChannel a = a();
                int i = 0;
                while (i == 0) {
                    int read = a.read(byteBuffer);
                    if (read == -1) {
                        break;
                    }
                    i += read;
                }
                uploadDataSink.onReadSucceeded(false);
                return;
            }
            throw new IllegalStateException("Cronet passed a buffer with no bytes remaining");
        }

        @Override // org.chromium.net.UploadDataProvider
        public final void rewind(UploadDataSink uploadDataSink) throws IOException {
            a().position(0L);
            uploadDataSink.onRewindSucceeded();
        }
    }

    private UploadDataProviders() {
    }

    public static UploadDataProvider create(File file) {
        return new e(new a(file));
    }

    public static UploadDataProvider create(ParcelFileDescriptor parcelFileDescriptor) {
        return new e(new b(parcelFileDescriptor));
    }

    public static UploadDataProvider create(ByteBuffer byteBuffer) {
        return new c(byteBuffer.slice());
    }

    public static UploadDataProvider create(byte[] bArr, int i, int i2) {
        return new c(ByteBuffer.wrap(bArr, i, i2).slice());
    }

    public static UploadDataProvider create(byte[] bArr) {
        return create(bArr, 0, bArr.length);
    }
}
