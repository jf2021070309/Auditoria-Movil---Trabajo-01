package e.c.a.m.u.c;

import android.util.Log;
import com.bumptech.glide.load.ImageHeaderParser;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.util.Objects;
/* loaded from: classes.dex */
public final class k implements ImageHeaderParser {
    public static final byte[] a = "Exif\u0000\u0000".getBytes(Charset.forName("UTF-8"));

    /* renamed from: b  reason: collision with root package name */
    public static final int[] f5861b = {0, 1, 1, 2, 4, 8, 1, 1, 2, 4, 8, 4, 8};

    /* loaded from: classes.dex */
    public static final class a implements c {
        public final ByteBuffer a;

        public a(ByteBuffer byteBuffer) {
            this.a = byteBuffer;
            byteBuffer.order(ByteOrder.BIG_ENDIAN);
        }

        @Override // e.c.a.m.u.c.k.c
        public int a() throws c.a {
            return (c() << 8) | c();
        }

        @Override // e.c.a.m.u.c.k.c
        public int b(byte[] bArr, int i2) {
            int min = Math.min(i2, this.a.remaining());
            if (min == 0) {
                return -1;
            }
            this.a.get(bArr, 0, min);
            return min;
        }

        @Override // e.c.a.m.u.c.k.c
        public short c() throws c.a {
            if (this.a.remaining() >= 1) {
                return (short) (this.a.get() & 255);
            }
            throw new c.a();
        }

        @Override // e.c.a.m.u.c.k.c
        public long skip(long j2) {
            int min = (int) Math.min(this.a.remaining(), j2);
            ByteBuffer byteBuffer = this.a;
            byteBuffer.position(byteBuffer.position() + min);
            return min;
        }
    }

    /* loaded from: classes.dex */
    public static final class b {
        public final ByteBuffer a;

        public b(byte[] bArr, int i2) {
            this.a = (ByteBuffer) ByteBuffer.wrap(bArr).order(ByteOrder.BIG_ENDIAN).limit(i2);
        }

        public short a(int i2) {
            if (this.a.remaining() - i2 >= 2) {
                return this.a.getShort(i2);
            }
            return (short) -1;
        }

        public int b(int i2) {
            if (this.a.remaining() - i2 >= 4) {
                return this.a.getInt(i2);
            }
            return -1;
        }
    }

    /* loaded from: classes.dex */
    public interface c {

        /* loaded from: classes.dex */
        public static final class a extends IOException {
            public a() {
                super("Unexpectedly reached end of a file");
            }
        }

        int a() throws IOException;

        int b(byte[] bArr, int i2) throws IOException;

        short c() throws IOException;

        long skip(long j2) throws IOException;
    }

    /* loaded from: classes.dex */
    public static final class d implements c {
        public final InputStream a;

        public d(InputStream inputStream) {
            this.a = inputStream;
        }

        @Override // e.c.a.m.u.c.k.c
        public int a() throws IOException {
            return (c() << 8) | c();
        }

        @Override // e.c.a.m.u.c.k.c
        public int b(byte[] bArr, int i2) throws IOException {
            int i3 = 0;
            int i4 = 0;
            while (i3 < i2 && (i4 = this.a.read(bArr, i3, i2 - i3)) != -1) {
                i3 += i4;
            }
            if (i3 == 0 && i4 == -1) {
                throw new c.a();
            }
            return i3;
        }

        @Override // e.c.a.m.u.c.k.c
        public short c() throws IOException {
            int read = this.a.read();
            if (read != -1) {
                return (short) read;
            }
            throw new c.a();
        }

        @Override // e.c.a.m.u.c.k.c
        public long skip(long j2) throws IOException {
            if (j2 < 0) {
                return 0L;
            }
            long j3 = j2;
            while (j3 > 0) {
                long skip = this.a.skip(j3);
                if (skip <= 0) {
                    if (this.a.read() == -1) {
                        break;
                    }
                    skip = 1;
                }
                j3 -= skip;
            }
            return j2 - j3;
        }
    }

    @Override // com.bumptech.glide.load.ImageHeaderParser
    public ImageHeaderParser.ImageType a(ByteBuffer byteBuffer) throws IOException {
        Objects.requireNonNull(byteBuffer, "Argument must not be null");
        return d(new a(byteBuffer));
    }

    @Override // com.bumptech.glide.load.ImageHeaderParser
    public ImageHeaderParser.ImageType b(InputStream inputStream) throws IOException {
        Objects.requireNonNull(inputStream, "Argument must not be null");
        return d(new d(inputStream));
    }

    @Override // com.bumptech.glide.load.ImageHeaderParser
    public int c(InputStream inputStream, e.c.a.m.s.c0.b bVar) throws IOException {
        int i2;
        Objects.requireNonNull(inputStream, "Argument must not be null");
        d dVar = new d(inputStream);
        Objects.requireNonNull(bVar, "Argument must not be null");
        try {
            int a2 = dVar.a();
            if (!((a2 & 65496) == 65496 || a2 == 19789 || a2 == 18761)) {
                Log.isLoggable("DfltImageHeaderParser", 3);
                return -1;
            }
            while (true) {
                if (dVar.c() == 255) {
                    short c2 = dVar.c();
                    if (c2 == 218) {
                        break;
                    } else if (c2 != 217) {
                        i2 = dVar.a() - 2;
                        if (c2 == 225) {
                            break;
                        }
                        long j2 = i2;
                        if (dVar.skip(j2) != j2) {
                            Log.isLoggable("DfltImageHeaderParser", 3);
                            break;
                        }
                    } else {
                        Log.isLoggable("DfltImageHeaderParser", 3);
                        break;
                    }
                } else {
                    Log.isLoggable("DfltImageHeaderParser", 3);
                    break;
                }
            }
            i2 = -1;
            if (i2 == -1) {
                Log.isLoggable("DfltImageHeaderParser", 3);
                return -1;
            }
            byte[] bArr = (byte[]) bVar.e(i2, byte[].class);
            int e2 = e(dVar, bArr, i2);
            bVar.d(bArr);
            return e2;
        } catch (c.a unused) {
            return -1;
        }
    }

    public final ImageHeaderParser.ImageType d(c cVar) throws IOException {
        try {
            int a2 = cVar.a();
            if (a2 == 65496) {
                return ImageHeaderParser.ImageType.JPEG;
            }
            int c2 = (a2 << 8) | cVar.c();
            if (c2 == 4671814) {
                return ImageHeaderParser.ImageType.GIF;
            }
            int c3 = (c2 << 8) | cVar.c();
            if (c3 == -1991225785) {
                cVar.skip(21L);
                try {
                    return cVar.c() >= 3 ? ImageHeaderParser.ImageType.PNG_A : ImageHeaderParser.ImageType.PNG;
                } catch (c.a unused) {
                    return ImageHeaderParser.ImageType.PNG;
                }
            } else if (c3 != 1380533830) {
                return ImageHeaderParser.ImageType.UNKNOWN;
            } else {
                cVar.skip(4L);
                if (((cVar.a() << 16) | cVar.a()) != 1464156752) {
                    return ImageHeaderParser.ImageType.UNKNOWN;
                }
                int a3 = (cVar.a() << 16) | cVar.a();
                if ((a3 & (-256)) != 1448097792) {
                    return ImageHeaderParser.ImageType.UNKNOWN;
                }
                int i2 = a3 & 255;
                if (i2 == 88) {
                    cVar.skip(4L);
                    return (cVar.c() & 16) != 0 ? ImageHeaderParser.ImageType.WEBP_A : ImageHeaderParser.ImageType.WEBP;
                } else if (i2 == 76) {
                    cVar.skip(4L);
                    return (cVar.c() & 8) != 0 ? ImageHeaderParser.ImageType.WEBP_A : ImageHeaderParser.ImageType.WEBP;
                } else {
                    return ImageHeaderParser.ImageType.WEBP;
                }
            }
        } catch (c.a unused2) {
            return ImageHeaderParser.ImageType.UNKNOWN;
        }
    }

    public final int e(c cVar, byte[] bArr, int i2) throws IOException {
        ByteOrder byteOrder;
        if (cVar.b(bArr, i2) != i2) {
            Log.isLoggable("DfltImageHeaderParser", 3);
            return -1;
        }
        boolean z = bArr != null && i2 > a.length;
        if (z) {
            int i3 = 0;
            while (true) {
                byte[] bArr2 = a;
                if (i3 >= bArr2.length) {
                    break;
                } else if (bArr[i3] != bArr2[i3]) {
                    z = false;
                    break;
                } else {
                    i3++;
                }
            }
        }
        if (!z) {
            Log.isLoggable("DfltImageHeaderParser", 3);
            return -1;
        }
        b bVar = new b(bArr, i2);
        short a2 = bVar.a(6);
        if (a2 == 18761) {
            byteOrder = ByteOrder.LITTLE_ENDIAN;
        } else if (a2 != 19789) {
            Log.isLoggable("DfltImageHeaderParser", 3);
            byteOrder = ByteOrder.BIG_ENDIAN;
        } else {
            byteOrder = ByteOrder.BIG_ENDIAN;
        }
        bVar.a.order(byteOrder);
        int b2 = bVar.b(10) + 6;
        short a3 = bVar.a(b2);
        for (int i4 = 0; i4 < a3; i4++) {
            int i5 = (i4 * 12) + b2 + 2;
            if (bVar.a(i5) == 274) {
                short a4 = bVar.a(i5 + 2);
                if (a4 < 1 || a4 > 12) {
                    Log.isLoggable("DfltImageHeaderParser", 3);
                } else {
                    int b3 = bVar.b(i5 + 4);
                    if (b3 < 0) {
                        Log.isLoggable("DfltImageHeaderParser", 3);
                    } else {
                        Log.isLoggable("DfltImageHeaderParser", 3);
                        int i6 = b3 + f5861b[a4];
                        if (i6 > 4) {
                            Log.isLoggable("DfltImageHeaderParser", 3);
                        } else {
                            int i7 = i5 + 8;
                            if (i7 < 0 || i7 > bVar.a.remaining()) {
                                Log.isLoggable("DfltImageHeaderParser", 3);
                            } else if (i6 >= 0 && i6 + i7 <= bVar.a.remaining()) {
                                return bVar.a(i7);
                            } else {
                                Log.isLoggable("DfltImageHeaderParser", 3);
                            }
                        }
                    }
                }
            }
        }
        return -1;
    }
}
