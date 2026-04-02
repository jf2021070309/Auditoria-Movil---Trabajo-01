package com.amazon.aps.iva.uc;

import android.util.Log;
import com.bumptech.glide.load.ImageHeaderParser;
import com.google.common.primitives.UnsignedBytes;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import org.apache.commons.codec.binary.Hex;
/* compiled from: DefaultImageHeaderParser.java */
/* loaded from: classes.dex */
public final class l implements ImageHeaderParser {
    public static final byte[] a = "Exif\u0000\u0000".getBytes(Charset.forName(Hex.DEFAULT_CHARSET_NAME));
    public static final int[] b = {0, 1, 1, 2, 4, 8, 1, 1, 2, 4, 8, 4, 8};

    /* compiled from: DefaultImageHeaderParser.java */
    /* loaded from: classes.dex */
    public static final class a implements c {
        public final ByteBuffer a;

        public a(ByteBuffer byteBuffer) {
            this.a = byteBuffer;
            byteBuffer.order(ByteOrder.BIG_ENDIAN);
        }

        @Override // com.amazon.aps.iva.uc.l.c
        public final int a() throws c.a {
            return (c() << 8) | c();
        }

        @Override // com.amazon.aps.iva.uc.l.c
        public final int b(int i, byte[] bArr) {
            ByteBuffer byteBuffer = this.a;
            int min = Math.min(i, byteBuffer.remaining());
            if (min == 0) {
                return -1;
            }
            byteBuffer.get(bArr, 0, min);
            return min;
        }

        @Override // com.amazon.aps.iva.uc.l.c
        public final short c() throws c.a {
            ByteBuffer byteBuffer = this.a;
            if (byteBuffer.remaining() >= 1) {
                return (short) (byteBuffer.get() & UnsignedBytes.MAX_VALUE);
            }
            throw new c.a();
        }

        @Override // com.amazon.aps.iva.uc.l.c
        public final long e(long j) {
            ByteBuffer byteBuffer = this.a;
            int min = (int) Math.min(byteBuffer.remaining(), j);
            byteBuffer.position(byteBuffer.position() + min);
            return min;
        }
    }

    /* compiled from: DefaultImageHeaderParser.java */
    /* loaded from: classes.dex */
    public static final class b {
        public final ByteBuffer a;

        public b(byte[] bArr, int i) {
            this.a = (ByteBuffer) ByteBuffer.wrap(bArr).order(ByteOrder.BIG_ENDIAN).limit(i);
        }

        public final short a(int i) {
            boolean z;
            ByteBuffer byteBuffer = this.a;
            if (byteBuffer.remaining() - i >= 2) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                return byteBuffer.getShort(i);
            }
            return (short) -1;
        }
    }

    /* compiled from: DefaultImageHeaderParser.java */
    /* loaded from: classes.dex */
    public interface c {

        /* compiled from: DefaultImageHeaderParser.java */
        /* loaded from: classes.dex */
        public static final class a extends IOException {
            public a() {
                super("Unexpectedly reached end of a file");
            }
        }

        int a() throws IOException;

        int b(int i, byte[] bArr) throws IOException;

        short c() throws IOException;

        long e(long j) throws IOException;
    }

    /* compiled from: DefaultImageHeaderParser.java */
    /* loaded from: classes.dex */
    public static final class d implements c {
        public final InputStream a;

        public d(InputStream inputStream) {
            this.a = inputStream;
        }

        @Override // com.amazon.aps.iva.uc.l.c
        public final int a() throws IOException {
            return (c() << 8) | c();
        }

        @Override // com.amazon.aps.iva.uc.l.c
        public final int b(int i, byte[] bArr) throws IOException {
            int i2 = 0;
            int i3 = 0;
            while (i2 < i && (i3 = this.a.read(bArr, i2, i - i2)) != -1) {
                i2 += i3;
            }
            if (i2 == 0 && i3 == -1) {
                throw new c.a();
            }
            return i2;
        }

        @Override // com.amazon.aps.iva.uc.l.c
        public final short c() throws IOException {
            int read = this.a.read();
            if (read != -1) {
                return (short) read;
            }
            throw new c.a();
        }

        @Override // com.amazon.aps.iva.uc.l.c
        public final long e(long j) throws IOException {
            if (j < 0) {
                return 0L;
            }
            long j2 = j;
            while (j2 > 0) {
                InputStream inputStream = this.a;
                long skip = inputStream.skip(j2);
                if (skip > 0) {
                    j2 -= skip;
                } else if (inputStream.read() == -1) {
                    break;
                } else {
                    j2--;
                }
            }
            return j - j2;
        }
    }

    public static int e(c cVar, com.amazon.aps.iva.oc.b bVar) throws IOException {
        boolean z;
        int i;
        try {
            int a2 = cVar.a();
            if ((a2 & 65496) != 65496 && a2 != 19789 && a2 != 18761) {
                z = false;
            } else {
                z = true;
            }
            if (!z) {
                Log.isLoggable("DfltImageHeaderParser", 3);
                return -1;
            }
            while (true) {
                if (cVar.c() != 255) {
                    Log.isLoggable("DfltImageHeaderParser", 3);
                    break;
                }
                short c2 = cVar.c();
                if (c2 == 218) {
                    break;
                } else if (c2 == 217) {
                    Log.isLoggable("DfltImageHeaderParser", 3);
                    break;
                } else {
                    i = cVar.a() - 2;
                    if (c2 == 225) {
                        break;
                    }
                    long j = i;
                    if (cVar.e(j) != j) {
                        Log.isLoggable("DfltImageHeaderParser", 3);
                        break;
                    }
                }
            }
            i = -1;
            if (i == -1) {
                Log.isLoggable("DfltImageHeaderParser", 3);
                return -1;
            }
            byte[] bArr = (byte[]) bVar.c(byte[].class, i);
            int g = g(cVar, bArr, i);
            bVar.put(bArr);
            return g;
        } catch (c.a unused) {
            return -1;
        }
    }

    public static ImageHeaderParser.ImageType f(c cVar) throws IOException {
        boolean z;
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
                cVar.e(21L);
                try {
                    if (cVar.c() >= 3) {
                        return ImageHeaderParser.ImageType.PNG_A;
                    }
                    return ImageHeaderParser.ImageType.PNG;
                } catch (c.a unused) {
                    return ImageHeaderParser.ImageType.PNG;
                }
            } else if (c3 != 1380533830) {
                if (((cVar.a() << 16) | cVar.a()) != 1718909296) {
                    return ImageHeaderParser.ImageType.UNKNOWN;
                }
                int a3 = (cVar.a() << 16) | cVar.a();
                if (a3 == 1635150195) {
                    return ImageHeaderParser.ImageType.ANIMATED_AVIF;
                }
                int i = 0;
                if (a3 == 1635150182) {
                    z = true;
                } else {
                    z = false;
                }
                cVar.e(4L);
                int i2 = c3 - 16;
                if (i2 % 4 == 0) {
                    while (i < 5 && i2 > 0) {
                        int a4 = (cVar.a() << 16) | cVar.a();
                        if (a4 == 1635150195) {
                            return ImageHeaderParser.ImageType.ANIMATED_AVIF;
                        }
                        if (a4 == 1635150182) {
                            z = true;
                        }
                        i++;
                        i2 -= 4;
                    }
                }
                if (z) {
                    return ImageHeaderParser.ImageType.AVIF;
                }
                return ImageHeaderParser.ImageType.UNKNOWN;
            } else {
                cVar.e(4L);
                if (((cVar.a() << 16) | cVar.a()) != 1464156752) {
                    return ImageHeaderParser.ImageType.UNKNOWN;
                }
                int a5 = (cVar.a() << 16) | cVar.a();
                if ((a5 & (-256)) != 1448097792) {
                    return ImageHeaderParser.ImageType.UNKNOWN;
                }
                int i3 = a5 & 255;
                if (i3 == 88) {
                    cVar.e(4L);
                    short c4 = cVar.c();
                    if ((c4 & 2) != 0) {
                        return ImageHeaderParser.ImageType.ANIMATED_WEBP;
                    }
                    if ((c4 & 16) != 0) {
                        return ImageHeaderParser.ImageType.WEBP_A;
                    }
                    return ImageHeaderParser.ImageType.WEBP;
                } else if (i3 == 76) {
                    cVar.e(4L);
                    if ((cVar.c() & 8) != 0) {
                        return ImageHeaderParser.ImageType.WEBP_A;
                    }
                    return ImageHeaderParser.ImageType.WEBP;
                } else {
                    return ImageHeaderParser.ImageType.WEBP;
                }
            }
        } catch (c.a unused2) {
            return ImageHeaderParser.ImageType.UNKNOWN;
        }
    }

    public static int g(c cVar, byte[] bArr, int i) throws IOException {
        boolean z;
        ByteOrder byteOrder;
        boolean z2;
        int i2;
        boolean z3;
        int i3;
        if (cVar.b(i, bArr) != i) {
            Log.isLoggable("DfltImageHeaderParser", 3);
            return -1;
        }
        byte[] bArr2 = a;
        if (bArr != null && i > bArr2.length) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            int i4 = 0;
            while (true) {
                if (i4 >= bArr2.length) {
                    break;
                } else if (bArr[i4] != bArr2[i4]) {
                    z = false;
                    break;
                } else {
                    i4++;
                }
            }
        }
        if (z) {
            b bVar = new b(bArr, i);
            short a2 = bVar.a(6);
            if (a2 != 18761) {
                if (a2 != 19789) {
                    Log.isLoggable("DfltImageHeaderParser", 3);
                    byteOrder = ByteOrder.BIG_ENDIAN;
                } else {
                    byteOrder = ByteOrder.BIG_ENDIAN;
                }
            } else {
                byteOrder = ByteOrder.LITTLE_ENDIAN;
            }
            ByteBuffer byteBuffer = bVar.a;
            byteBuffer.order(byteOrder);
            if (byteBuffer.remaining() - 10 >= 4) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z2) {
                i2 = byteBuffer.getInt(10);
            } else {
                i2 = -1;
            }
            int i5 = i2 + 6;
            short a3 = bVar.a(i5);
            for (int i6 = 0; i6 < a3; i6++) {
                int i7 = (i6 * 12) + i5 + 2;
                if (bVar.a(i7) == 274) {
                    short a4 = bVar.a(i7 + 2);
                    if (a4 >= 1 && a4 <= 12) {
                        int i8 = i7 + 4;
                        if (byteBuffer.remaining() - i8 >= 4) {
                            z3 = true;
                        } else {
                            z3 = false;
                        }
                        if (z3) {
                            i3 = byteBuffer.getInt(i8);
                        } else {
                            i3 = -1;
                        }
                        if (i3 < 0) {
                            Log.isLoggable("DfltImageHeaderParser", 3);
                        } else {
                            Log.isLoggable("DfltImageHeaderParser", 3);
                            int i9 = i3 + b[a4];
                            if (i9 > 4) {
                                Log.isLoggable("DfltImageHeaderParser", 3);
                            } else {
                                int i10 = i7 + 8;
                                if (i10 >= 0 && i10 <= byteBuffer.remaining()) {
                                    if (i9 >= 0 && i9 + i10 <= byteBuffer.remaining()) {
                                        return bVar.a(i10);
                                    }
                                    Log.isLoggable("DfltImageHeaderParser", 3);
                                } else {
                                    Log.isLoggable("DfltImageHeaderParser", 3);
                                }
                            }
                        }
                    } else {
                        Log.isLoggable("DfltImageHeaderParser", 3);
                    }
                }
            }
            return -1;
        }
        Log.isLoggable("DfltImageHeaderParser", 3);
        return -1;
    }

    @Override // com.bumptech.glide.load.ImageHeaderParser
    public final int a(InputStream inputStream, com.amazon.aps.iva.oc.b bVar) throws IOException {
        defpackage.i.l(inputStream);
        d dVar = new d(inputStream);
        defpackage.i.l(bVar);
        return e(dVar, bVar);
    }

    @Override // com.bumptech.glide.load.ImageHeaderParser
    public final int b(ByteBuffer byteBuffer, com.amazon.aps.iva.oc.b bVar) throws IOException {
        defpackage.i.l(byteBuffer);
        a aVar = new a(byteBuffer);
        defpackage.i.l(bVar);
        return e(aVar, bVar);
    }

    @Override // com.bumptech.glide.load.ImageHeaderParser
    public final ImageHeaderParser.ImageType c(ByteBuffer byteBuffer) throws IOException {
        defpackage.i.l(byteBuffer);
        return f(new a(byteBuffer));
    }

    @Override // com.bumptech.glide.load.ImageHeaderParser
    public final ImageHeaderParser.ImageType d(InputStream inputStream) throws IOException {
        defpackage.i.l(inputStream);
        return f(new d(inputStream));
    }
}
