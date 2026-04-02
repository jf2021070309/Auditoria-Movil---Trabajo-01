package c.l.a;

import android.content.res.AssetManager;
import android.util.Log;
import ch.qos.logback.classic.Level;
import ch.qos.logback.core.net.SyslogConstants;
import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.DataInput;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TimeZone;
import java.util.regex.Pattern;
/* loaded from: classes.dex */
public class a {
    public static final HashMap<Integer, Integer> A;
    public static final Charset B;
    public static final byte[] C;

    /* renamed from: h  reason: collision with root package name */
    public static SimpleDateFormat f2289h;

    /* renamed from: l  reason: collision with root package name */
    public static final c[] f2293l;

    /* renamed from: m  reason: collision with root package name */
    public static final c[] f2294m;

    /* renamed from: n  reason: collision with root package name */
    public static final c[] f2295n;
    public static final c[] o;
    public static final c[] p;
    public static final c q;
    public static final c[] r;
    public static final c[] s;
    public static final c[] t;
    public static final c[] u;
    public static final c[][] v;
    public static final c[] w;
    public static final HashMap<Integer, c>[] x;
    public static final HashMap<String, c>[] y;
    public static final HashSet<String> z;
    public final AssetManager.AssetInputStream D;
    public int E;
    public final HashMap<String, b>[] F;
    public Set<Integer> G;
    public ByteOrder H;
    public int I;
    public int J;
    public int K;
    public int L;
    public int M;
    public int N;
    public static final List<Integer> a = Arrays.asList(1, 6, 3, 8);

    /* renamed from: b  reason: collision with root package name */
    public static final List<Integer> f2283b = Arrays.asList(2, 7, 4, 5);

    /* renamed from: c  reason: collision with root package name */
    public static final int[] f2284c = {8, 8, 8};

    /* renamed from: d  reason: collision with root package name */
    public static final int[] f2285d = {8};

    /* renamed from: e  reason: collision with root package name */
    public static final byte[] f2286e = {-1, -40, -1};

    /* renamed from: f  reason: collision with root package name */
    public static final byte[] f2287f = {79, 76, 89, 77, 80, 0};

    /* renamed from: g  reason: collision with root package name */
    public static final byte[] f2288g = {79, 76, 89, 77, 80, 85, 83, 0, 73, 73};

    /* renamed from: i  reason: collision with root package name */
    public static final String[] f2290i = {"", "BYTE", "STRING", "USHORT", "ULONG", "URATIONAL", "SBYTE", "UNDEFINED", "SSHORT", "SLONG", "SRATIONAL", "SINGLE", "DOUBLE"};

    /* renamed from: j  reason: collision with root package name */
    public static final int[] f2291j = {0, 1, 1, 2, 4, 8, 1, 1, 2, 4, 8, 4, 8, 1};

    /* renamed from: k  reason: collision with root package name */
    public static final byte[] f2292k = {65, 83, 67, 73, 73, 0, 0, 0};

    /* renamed from: c.l.a.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static class C0045a extends InputStream implements DataInput {
        public static final ByteOrder a = ByteOrder.LITTLE_ENDIAN;

        /* renamed from: b  reason: collision with root package name */
        public static final ByteOrder f2296b = ByteOrder.BIG_ENDIAN;

        /* renamed from: c  reason: collision with root package name */
        public DataInputStream f2297c;

        /* renamed from: d  reason: collision with root package name */
        public ByteOrder f2298d;

        /* renamed from: e  reason: collision with root package name */
        public final int f2299e;

        /* renamed from: f  reason: collision with root package name */
        public int f2300f;

        public C0045a(InputStream inputStream) throws IOException {
            this.f2298d = ByteOrder.BIG_ENDIAN;
            DataInputStream dataInputStream = new DataInputStream(inputStream);
            this.f2297c = dataInputStream;
            int available = dataInputStream.available();
            this.f2299e = available;
            this.f2300f = 0;
            this.f2297c.mark(available);
        }

        public C0045a(byte[] bArr) throws IOException {
            this(new ByteArrayInputStream(bArr));
        }

        public long a() throws IOException {
            return readInt() & 4294967295L;
        }

        @Override // java.io.InputStream
        public int available() throws IOException {
            return this.f2297c.available();
        }

        public void f(long j2) throws IOException {
            int i2 = this.f2300f;
            if (i2 > j2) {
                this.f2300f = 0;
                this.f2297c.reset();
                this.f2297c.mark(this.f2299e);
            } else {
                j2 -= i2;
            }
            int i3 = (int) j2;
            if (skipBytes(i3) != i3) {
                throw new IOException("Couldn't seek up to the byteCount");
            }
        }

        @Override // java.io.InputStream
        public int read() throws IOException {
            this.f2300f++;
            return this.f2297c.read();
        }

        @Override // java.io.InputStream
        public int read(byte[] bArr, int i2, int i3) throws IOException {
            int read = this.f2297c.read(bArr, i2, i3);
            this.f2300f += read;
            return read;
        }

        @Override // java.io.DataInput
        public boolean readBoolean() throws IOException {
            this.f2300f++;
            return this.f2297c.readBoolean();
        }

        @Override // java.io.DataInput
        public byte readByte() throws IOException {
            int i2 = this.f2300f + 1;
            this.f2300f = i2;
            if (i2 <= this.f2299e) {
                int read = this.f2297c.read();
                if (read >= 0) {
                    return (byte) read;
                }
                throw new EOFException();
            }
            throw new EOFException();
        }

        @Override // java.io.DataInput
        public char readChar() throws IOException {
            this.f2300f += 2;
            return this.f2297c.readChar();
        }

        @Override // java.io.DataInput
        public double readDouble() throws IOException {
            return Double.longBitsToDouble(readLong());
        }

        @Override // java.io.DataInput
        public float readFloat() throws IOException {
            return Float.intBitsToFloat(readInt());
        }

        @Override // java.io.DataInput
        public void readFully(byte[] bArr) throws IOException {
            int length = this.f2300f + bArr.length;
            this.f2300f = length;
            if (length > this.f2299e) {
                throw new EOFException();
            }
            if (this.f2297c.read(bArr, 0, bArr.length) != bArr.length) {
                throw new IOException("Couldn't read up to the length of buffer");
            }
        }

        @Override // java.io.DataInput
        public void readFully(byte[] bArr, int i2, int i3) throws IOException {
            int i4 = this.f2300f + i3;
            this.f2300f = i4;
            if (i4 > this.f2299e) {
                throw new EOFException();
            }
            if (this.f2297c.read(bArr, i2, i3) != i3) {
                throw new IOException("Couldn't read up to the length of buffer");
            }
        }

        @Override // java.io.DataInput
        public int readInt() throws IOException {
            int i2 = this.f2300f + 4;
            this.f2300f = i2;
            if (i2 <= this.f2299e) {
                int read = this.f2297c.read();
                int read2 = this.f2297c.read();
                int read3 = this.f2297c.read();
                int read4 = this.f2297c.read();
                if ((read | read2 | read3 | read4) >= 0) {
                    ByteOrder byteOrder = this.f2298d;
                    if (byteOrder == a) {
                        return (read4 << 24) + (read3 << 16) + (read2 << 8) + read;
                    }
                    if (byteOrder == f2296b) {
                        return (read << 24) + (read2 << 16) + (read3 << 8) + read4;
                    }
                    StringBuilder y = e.a.d.a.a.y("Invalid byte order: ");
                    y.append(this.f2298d);
                    throw new IOException(y.toString());
                }
                throw new EOFException();
            }
            throw new EOFException();
        }

        @Override // java.io.DataInput
        public String readLine() throws IOException {
            return null;
        }

        @Override // java.io.DataInput
        public long readLong() throws IOException {
            int i2 = this.f2300f + 8;
            this.f2300f = i2;
            if (i2 <= this.f2299e) {
                int read = this.f2297c.read();
                int read2 = this.f2297c.read();
                int read3 = this.f2297c.read();
                int read4 = this.f2297c.read();
                int read5 = this.f2297c.read();
                int read6 = this.f2297c.read();
                int read7 = this.f2297c.read();
                int read8 = this.f2297c.read();
                if ((read | read2 | read3 | read4 | read5 | read6 | read7 | read8) >= 0) {
                    ByteOrder byteOrder = this.f2298d;
                    if (byteOrder == a) {
                        return (read8 << 56) + (read7 << 48) + (read6 << 40) + (read5 << 32) + (read4 << 24) + (read3 << 16) + (read2 << 8) + read;
                    }
                    if (byteOrder == f2296b) {
                        return (read << 56) + (read2 << 48) + (read3 << 40) + (read4 << 32) + (read5 << 24) + (read6 << 16) + (read7 << 8) + read8;
                    }
                    StringBuilder y = e.a.d.a.a.y("Invalid byte order: ");
                    y.append(this.f2298d);
                    throw new IOException(y.toString());
                }
                throw new EOFException();
            }
            throw new EOFException();
        }

        @Override // java.io.DataInput
        public short readShort() throws IOException {
            int i2 = this.f2300f + 2;
            this.f2300f = i2;
            if (i2 <= this.f2299e) {
                int read = this.f2297c.read();
                int read2 = this.f2297c.read();
                if ((read | read2) >= 0) {
                    ByteOrder byteOrder = this.f2298d;
                    if (byteOrder == a) {
                        return (short) ((read2 << 8) + read);
                    }
                    if (byteOrder == f2296b) {
                        return (short) ((read << 8) + read2);
                    }
                    StringBuilder y = e.a.d.a.a.y("Invalid byte order: ");
                    y.append(this.f2298d);
                    throw new IOException(y.toString());
                }
                throw new EOFException();
            }
            throw new EOFException();
        }

        @Override // java.io.DataInput
        public String readUTF() throws IOException {
            this.f2300f += 2;
            return this.f2297c.readUTF();
        }

        @Override // java.io.DataInput
        public int readUnsignedByte() throws IOException {
            this.f2300f++;
            return this.f2297c.readUnsignedByte();
        }

        @Override // java.io.DataInput
        public int readUnsignedShort() throws IOException {
            int i2 = this.f2300f + 2;
            this.f2300f = i2;
            if (i2 <= this.f2299e) {
                int read = this.f2297c.read();
                int read2 = this.f2297c.read();
                if ((read | read2) >= 0) {
                    ByteOrder byteOrder = this.f2298d;
                    if (byteOrder == a) {
                        return (read2 << 8) + read;
                    }
                    if (byteOrder == f2296b) {
                        return (read << 8) + read2;
                    }
                    StringBuilder y = e.a.d.a.a.y("Invalid byte order: ");
                    y.append(this.f2298d);
                    throw new IOException(y.toString());
                }
                throw new EOFException();
            }
            throw new EOFException();
        }

        @Override // java.io.DataInput
        public int skipBytes(int i2) throws IOException {
            int min = Math.min(i2, this.f2299e - this.f2300f);
            int i3 = 0;
            while (i3 < min) {
                i3 += this.f2297c.skipBytes(min - i3);
            }
            this.f2300f += i3;
            return i3;
        }
    }

    /* loaded from: classes.dex */
    public static class b {
        public final int a;

        /* renamed from: b  reason: collision with root package name */
        public final int f2301b;

        /* renamed from: c  reason: collision with root package name */
        public final byte[] f2302c;

        public b(int i2, int i3, byte[] bArr) {
            this.a = i2;
            this.f2301b = i3;
            this.f2302c = bArr;
        }

        public static b a(String str) {
            byte[] bytes = (str + (char) 0).getBytes(a.B);
            return new b(2, bytes.length, bytes);
        }

        public static b b(long j2, ByteOrder byteOrder) {
            long[] jArr = {j2};
            ByteBuffer wrap = ByteBuffer.wrap(new byte[a.f2291j[4] * 1]);
            wrap.order(byteOrder);
            for (int i2 = 0; i2 < 1; i2++) {
                wrap.putInt((int) jArr[i2]);
            }
            return new b(4, 1, wrap.array());
        }

        public static b c(d dVar, ByteOrder byteOrder) {
            d[] dVarArr = {dVar};
            ByteBuffer wrap = ByteBuffer.wrap(new byte[a.f2291j[5] * 1]);
            wrap.order(byteOrder);
            for (int i2 = 0; i2 < 1; i2++) {
                d dVar2 = dVarArr[i2];
                wrap.putInt((int) dVar2.a);
                wrap.putInt((int) dVar2.f2306b);
            }
            return new b(5, 1, wrap.array());
        }

        public static b d(int i2, ByteOrder byteOrder) {
            int[] iArr = {i2};
            ByteBuffer wrap = ByteBuffer.wrap(new byte[a.f2291j[3] * 1]);
            wrap.order(byteOrder);
            for (int i3 = 0; i3 < 1; i3++) {
                wrap.putShort((short) iArr[i3]);
            }
            return new b(3, 1, wrap.array());
        }

        public double e(ByteOrder byteOrder) {
            int[] iArr;
            long[] jArr;
            Object h2 = h(byteOrder);
            if (h2 != null) {
                if (h2 instanceof String) {
                    return Double.parseDouble((String) h2);
                }
                if (h2 instanceof long[]) {
                    if (((long[]) h2).length == 1) {
                        return jArr[0];
                    }
                    throw new NumberFormatException("There are more than one component");
                } else if (h2 instanceof int[]) {
                    if (((int[]) h2).length == 1) {
                        return iArr[0];
                    }
                    throw new NumberFormatException("There are more than one component");
                } else if (h2 instanceof double[]) {
                    double[] dArr = (double[]) h2;
                    if (dArr.length == 1) {
                        return dArr[0];
                    }
                    throw new NumberFormatException("There are more than one component");
                } else if (h2 instanceof d[]) {
                    d[] dVarArr = (d[]) h2;
                    if (dVarArr.length == 1) {
                        d dVar = dVarArr[0];
                        double d2 = dVar.a;
                        double d3 = dVar.f2306b;
                        Double.isNaN(d2);
                        Double.isNaN(d3);
                        Double.isNaN(d2);
                        Double.isNaN(d3);
                        return d2 / d3;
                    }
                    throw new NumberFormatException("There are more than one component");
                } else {
                    throw new NumberFormatException("Couldn't find a double value");
                }
            }
            throw new NumberFormatException("NULL can't be converted to a double value");
        }

        public int f(ByteOrder byteOrder) {
            Object h2 = h(byteOrder);
            if (h2 != null) {
                if (h2 instanceof String) {
                    return Integer.parseInt((String) h2);
                }
                if (h2 instanceof long[]) {
                    long[] jArr = (long[]) h2;
                    if (jArr.length == 1) {
                        return (int) jArr[0];
                    }
                    throw new NumberFormatException("There are more than one component");
                } else if (h2 instanceof int[]) {
                    int[] iArr = (int[]) h2;
                    if (iArr.length == 1) {
                        return iArr[0];
                    }
                    throw new NumberFormatException("There are more than one component");
                } else {
                    throw new NumberFormatException("Couldn't find a integer value");
                }
            }
            throw new NumberFormatException("NULL can't be converted to a integer value");
        }

        public String g(ByteOrder byteOrder) {
            Object h2 = h(byteOrder);
            if (h2 == null) {
                return null;
            }
            if (h2 instanceof String) {
                return (String) h2;
            }
            StringBuilder sb = new StringBuilder();
            int i2 = 0;
            if (h2 instanceof long[]) {
                long[] jArr = (long[]) h2;
                while (i2 < jArr.length) {
                    sb.append(jArr[i2]);
                    i2++;
                    if (i2 != jArr.length) {
                        sb.append(",");
                    }
                }
                return sb.toString();
            } else if (h2 instanceof int[]) {
                int[] iArr = (int[]) h2;
                while (i2 < iArr.length) {
                    sb.append(iArr[i2]);
                    i2++;
                    if (i2 != iArr.length) {
                        sb.append(",");
                    }
                }
                return sb.toString();
            } else if (h2 instanceof double[]) {
                double[] dArr = (double[]) h2;
                while (i2 < dArr.length) {
                    sb.append(dArr[i2]);
                    i2++;
                    if (i2 != dArr.length) {
                        sb.append(",");
                    }
                }
                return sb.toString();
            } else if (h2 instanceof d[]) {
                d[] dVarArr = (d[]) h2;
                while (i2 < dVarArr.length) {
                    sb.append(dVarArr[i2].a);
                    sb.append('/');
                    sb.append(dVarArr[i2].f2306b);
                    i2++;
                    if (i2 != dVarArr.length) {
                        sb.append(",");
                    }
                }
                return sb.toString();
            } else {
                return null;
            }
        }

        /* JADX WARN: Not initialized variable reg: 3, insn: 0x019f: MOVE  (r2 I:??[OBJECT, ARRAY]) = (r3 I:??[OBJECT, ARRAY]), block:B:152:0x019f */
        /* JADX WARN: Removed duplicated region for block: B:176:0x01a2 A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public java.lang.Object h(java.nio.ByteOrder r11) {
            /*
                Method dump skipped, instructions count: 458
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: c.l.a.a.b.h(java.nio.ByteOrder):java.lang.Object");
        }

        public String toString() {
            StringBuilder y = e.a.d.a.a.y("(");
            y.append(a.f2290i[this.a]);
            y.append(", data length:");
            return e.a.d.a.a.p(y, this.f2302c.length, ")");
        }
    }

    /* loaded from: classes.dex */
    public static class c {
        public final int a;

        /* renamed from: b  reason: collision with root package name */
        public final String f2303b;

        /* renamed from: c  reason: collision with root package name */
        public final int f2304c;

        /* renamed from: d  reason: collision with root package name */
        public final int f2305d;

        public c(String str, int i2, int i3) {
            this.f2303b = str;
            this.a = i2;
            this.f2304c = i3;
            this.f2305d = -1;
        }

        public c(String str, int i2, int i3, int i4) {
            this.f2303b = str;
            this.a = i2;
            this.f2304c = i3;
            this.f2305d = i4;
        }
    }

    /* loaded from: classes.dex */
    public static class d {
        public final long a;

        /* renamed from: b  reason: collision with root package name */
        public final long f2306b;

        public d(long j2, long j3) {
            if (j3 == 0) {
                this.a = 0L;
                this.f2306b = 1L;
                return;
            }
            this.a = j2;
            this.f2306b = j3;
        }

        public String toString() {
            return this.a + "/" + this.f2306b;
        }
    }

    static {
        c[] cVarArr;
        c[] cVarArr2 = {new c("NewSubfileType", 254, 4), new c("SubfileType", 255, 4), new c("ImageWidth", 256, 3, 4), new c("ImageLength", 257, 3, 4), new c("BitsPerSample", 258, 3), new c("Compression", 259, 3), new c("PhotometricInterpretation", 262, 3), new c("ImageDescription", 270, 2), new c("Make", 271, 2), new c("Model", 272, 2), new c("StripOffsets", 273, 3, 4), new c("Orientation", 274, 3), new c("SamplesPerPixel", 277, 3), new c("RowsPerStrip", 278, 3, 4), new c("StripByteCounts", 279, 3, 4), new c("XResolution", 282, 5), new c("YResolution", 283, 5), new c("PlanarConfiguration", 284, 3), new c("ResolutionUnit", 296, 3), new c("TransferFunction", 301, 3), new c("Software", 305, 2), new c("DateTime", 306, 2), new c("Artist", 315, 2), new c("WhitePoint", 318, 5), new c("PrimaryChromaticities", 319, 5), new c("SubIFDPointer", 330, 4), new c("JPEGInterchangeFormat", 513, 4), new c("JPEGInterchangeFormatLength", SyslogConstants.SYSLOG_PORT, 4), new c("YCbCrCoefficients", 529, 5), new c("YCbCrSubSampling", 530, 3), new c("YCbCrPositioning", 531, 3), new c("ReferenceBlackWhite", 532, 5), new c("Copyright", 33432, 2), new c("ExifIFDPointer", 34665, 4), new c("GPSInfoIFDPointer", 34853, 4), new c("SensorTopBorder", 4, 4), new c("SensorLeftBorder", 5, 4), new c("SensorBottomBorder", 6, 4), new c("SensorRightBorder", 7, 4), new c("ISO", 23, 3), new c("JpgFromRaw", 46, 7)};
        f2293l = cVarArr2;
        c[] cVarArr3 = {new c("ExposureTime", 33434, 5), new c("FNumber", 33437, 5), new c("ExposureProgram", 34850, 3), new c("SpectralSensitivity", 34852, 2), new c("PhotographicSensitivity", 34855, 3), new c("OECF", 34856, 7), new c("ExifVersion", 36864, 2), new c("DateTimeOriginal", 36867, 2), new c("DateTimeDigitized", 36868, 2), new c("ComponentsConfiguration", 37121, 7), new c("CompressedBitsPerPixel", 37122, 5), new c("ShutterSpeedValue", 37377, 10), new c("ApertureValue", 37378, 5), new c("BrightnessValue", 37379, 10), new c("ExposureBiasValue", 37380, 10), new c("MaxApertureValue", 37381, 5), new c("SubjectDistance", 37382, 5), new c("MeteringMode", 37383, 3), new c("LightSource", 37384, 3), new c("Flash", 37385, 3), new c("FocalLength", 37386, 5), new c("SubjectArea", 37396, 3), new c("MakerNote", 37500, 7), new c("UserComment", 37510, 7), new c("SubSecTime", 37520, 2), new c("SubSecTimeOriginal", 37521, 2), new c("SubSecTimeDigitized", 37522, 2), new c("FlashpixVersion", 40960, 7), new c("ColorSpace", 40961, 3), new c("PixelXDimension", 40962, 3, 4), new c("PixelYDimension", 40963, 3, 4), new c("RelatedSoundFile", 40964, 2), new c("InteroperabilityIFDPointer", 40965, 4), new c("FlashEnergy", 41483, 5), new c("SpatialFrequencyResponse", 41484, 7), new c("FocalPlaneXResolution", 41486, 5), new c("FocalPlaneYResolution", 41487, 5), new c("FocalPlaneResolutionUnit", 41488, 3), new c("SubjectLocation", 41492, 3), new c("ExposureIndex", 41493, 5), new c("SensingMethod", 41495, 3), new c("FileSource", 41728, 7), new c("SceneType", 41729, 7), new c("CFAPattern", 41730, 7), new c("CustomRendered", 41985, 3), new c("ExposureMode", 41986, 3), new c("WhiteBalance", 41987, 3), new c("DigitalZoomRatio", 41988, 5), new c("FocalLengthIn35mmFilm", 41989, 3), new c("SceneCaptureType", 41990, 3), new c("GainControl", 41991, 3), new c("Contrast", 41992, 3), new c("Saturation", 41993, 3), new c("Sharpness", 41994, 3), new c("DeviceSettingDescription", 41995, 7), new c("SubjectDistanceRange", 41996, 3), new c("ImageUniqueID", 42016, 2), new c("DNGVersion", 50706, 1), new c("DefaultCropSize", 50720, 3, 4)};
        f2294m = cVarArr3;
        c[] cVarArr4 = {new c("GPSVersionID", 0, 1), new c("GPSLatitudeRef", 1, 2), new c("GPSLatitude", 2, 5), new c("GPSLongitudeRef", 3, 2), new c("GPSLongitude", 4, 5), new c("GPSAltitudeRef", 5, 1), new c("GPSAltitude", 6, 5), new c("GPSTimeStamp", 7, 5), new c("GPSSatellites", 8, 2), new c("GPSStatus", 9, 2), new c("GPSMeasureMode", 10, 2), new c("GPSDOP", 11, 5), new c("GPSSpeedRef", 12, 2), new c("GPSSpeed", 13, 5), new c("GPSTrackRef", 14, 2), new c("GPSTrack", 15, 5), new c("GPSImgDirectionRef", 16, 2), new c("GPSImgDirection", 17, 5), new c("GPSMapDatum", 18, 2), new c("GPSDestLatitudeRef", 19, 2), new c("GPSDestLatitude", 20, 5), new c("GPSDestLongitudeRef", 21, 2), new c("GPSDestLongitude", 22, 5), new c("GPSDestBearingRef", 23, 2), new c("GPSDestBearing", 24, 5), new c("GPSDestDistanceRef", 25, 2), new c("GPSDestDistance", 26, 5), new c("GPSProcessingMethod", 27, 7), new c("GPSAreaInformation", 28, 7), new c("GPSDateStamp", 29, 2), new c("GPSDifferential", 30, 3)};
        f2295n = cVarArr4;
        c[] cVarArr5 = {new c("InteroperabilityIndex", 1, 2)};
        o = cVarArr5;
        c[] cVarArr6 = {new c("NewSubfileType", 254, 4), new c("SubfileType", 255, 4), new c("ThumbnailImageWidth", 256, 3, 4), new c("ThumbnailImageLength", 257, 3, 4), new c("BitsPerSample", 258, 3), new c("Compression", 259, 3), new c("PhotometricInterpretation", 262, 3), new c("ImageDescription", 270, 2), new c("Make", 271, 2), new c("Model", 272, 2), new c("StripOffsets", 273, 3, 4), new c("Orientation", 274, 3), new c("SamplesPerPixel", 277, 3), new c("RowsPerStrip", 278, 3, 4), new c("StripByteCounts", 279, 3, 4), new c("XResolution", 282, 5), new c("YResolution", 283, 5), new c("PlanarConfiguration", 284, 3), new c("ResolutionUnit", 296, 3), new c("TransferFunction", 301, 3), new c("Software", 305, 2), new c("DateTime", 306, 2), new c("Artist", 315, 2), new c("WhitePoint", 318, 5), new c("PrimaryChromaticities", 319, 5), new c("SubIFDPointer", 330, 4), new c("JPEGInterchangeFormat", 513, 4), new c("JPEGInterchangeFormatLength", SyslogConstants.SYSLOG_PORT, 4), new c("YCbCrCoefficients", 529, 5), new c("YCbCrSubSampling", 530, 3), new c("YCbCrPositioning", 531, 3), new c("ReferenceBlackWhite", 532, 5), new c("Copyright", 33432, 2), new c("ExifIFDPointer", 34665, 4), new c("GPSInfoIFDPointer", 34853, 4), new c("DNGVersion", 50706, 1), new c("DefaultCropSize", 50720, 3, 4)};
        p = cVarArr6;
        q = new c("StripOffsets", 273, 3);
        c[] cVarArr7 = {new c("ThumbnailImage", 256, 7), new c("CameraSettingsIFDPointer", 8224, 4), new c("ImageProcessingIFDPointer", 8256, 4)};
        r = cVarArr7;
        c[] cVarArr8 = {new c("PreviewImageStart", 257, 4), new c("PreviewImageLength", 258, 4)};
        s = cVarArr8;
        c[] cVarArr9 = {new c("AspectFrame", 4371, 3)};
        t = cVarArr9;
        c[] cVarArr10 = {new c("ColorSpace", 55, 3)};
        u = cVarArr10;
        c[][] cVarArr11 = {cVarArr2, cVarArr3, cVarArr4, cVarArr5, cVarArr6, cVarArr2, cVarArr7, cVarArr8, cVarArr9, cVarArr10};
        v = cVarArr11;
        w = new c[]{new c("SubIFDPointer", 330, 4), new c("ExifIFDPointer", 34665, 4), new c("GPSInfoIFDPointer", 34853, 4), new c("InteroperabilityIFDPointer", 40965, 4), new c("CameraSettingsIFDPointer", 8224, 1), new c("ImageProcessingIFDPointer", 8256, 1)};
        x = new HashMap[cVarArr11.length];
        y = new HashMap[cVarArr11.length];
        z = new HashSet<>(Arrays.asList("FNumber", "DigitalZoomRatio", "ExposureTime", "SubjectDistance", "GPSTimeStamp"));
        A = new HashMap<>();
        Charset forName = Charset.forName("US-ASCII");
        B = forName;
        C = "Exif\u0000\u0000".getBytes(forName);
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy:MM:dd HH:mm:ss");
        f2289h = simpleDateFormat;
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
        int i2 = 0;
        while (true) {
            c[][] cVarArr12 = v;
            if (i2 >= cVarArr12.length) {
                HashMap<Integer, Integer> hashMap = A;
                c[] cVarArr13 = w;
                hashMap.put(Integer.valueOf(cVarArr13[0].a), 5);
                hashMap.put(Integer.valueOf(cVarArr13[1].a), 1);
                hashMap.put(Integer.valueOf(cVarArr13[2].a), 2);
                hashMap.put(Integer.valueOf(cVarArr13[3].a), 3);
                hashMap.put(Integer.valueOf(cVarArr13[4].a), 7);
                hashMap.put(Integer.valueOf(cVarArr13[5].a), 8);
                Pattern.compile(".*[1-9].*");
                Pattern.compile("^([0-9][0-9]):([0-9][0-9]):([0-9][0-9])$");
                return;
            }
            x[i2] = new HashMap<>();
            y[i2] = new HashMap<>();
            for (c cVar : cVarArr12[i2]) {
                x[i2].put(Integer.valueOf(cVar.a), cVar);
                y[i2].put(cVar.f2303b, cVar);
            }
            i2++;
        }
    }

    public a(InputStream inputStream) throws IOException {
        c[][] cVarArr = v;
        this.F = new HashMap[cVarArr.length];
        this.G = new HashSet(cVarArr.length);
        this.H = ByteOrder.BIG_ENDIAN;
        if (inputStream == null) {
            throw new IllegalArgumentException("inputStream cannot be null");
        }
        if (inputStream instanceof AssetManager.AssetInputStream) {
            this.D = (AssetManager.AssetInputStream) inputStream;
        } else {
            this.D = null;
        }
        for (int i2 = 0; i2 < v.length; i2++) {
            try {
                this.F[i2] = new HashMap<>();
            } catch (IOException unused) {
            } catch (Throwable th) {
                a();
                throw th;
            }
        }
        BufferedInputStream bufferedInputStream = new BufferedInputStream(inputStream, Level.TRACE_INT);
        this.E = f(bufferedInputStream);
        C0045a c0045a = new C0045a(bufferedInputStream);
        switch (this.E) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 5:
            case 6:
            case 8:
            case 11:
                i(c0045a);
                break;
            case 4:
                e(c0045a, 0, 0);
                break;
            case 7:
                g(c0045a);
                break;
            case 9:
                h(c0045a);
                break;
            case 10:
                j(c0045a);
                break;
        }
        p(c0045a);
        a();
    }

    public static long[] b(Object obj) {
        if (!(obj instanceof int[])) {
            if (obj instanceof long[]) {
                return (long[]) obj;
            }
            return null;
        }
        int[] iArr = (int[]) obj;
        long[] jArr = new long[iArr.length];
        for (int i2 = 0; i2 < iArr.length; i2++) {
            jArr[i2] = iArr[i2];
        }
        return jArr;
    }

    public final void a() {
        String c2 = c("DateTimeOriginal");
        if (c2 != null && c("DateTime") == null) {
            this.F[0].put("DateTime", b.a(c2));
        }
        if (c("ImageWidth") == null) {
            this.F[0].put("ImageWidth", b.b(0L, this.H));
        }
        if (c("ImageLength") == null) {
            this.F[0].put("ImageLength", b.b(0L, this.H));
        }
        if (c("Orientation") == null) {
            this.F[0].put("Orientation", b.b(0L, this.H));
        }
        if (c("LightSource") == null) {
            this.F[1].put("LightSource", b.b(0L, this.H));
        }
    }

    public String c(String str) {
        b d2 = d(str);
        if (d2 != null) {
            if (!z.contains(str)) {
                return d2.g(this.H);
            }
            if (str.equals("GPSTimeStamp")) {
                int i2 = d2.a;
                if (i2 != 5 && i2 != 10) {
                    StringBuilder y2 = e.a.d.a.a.y("GPS Timestamp format is not rational. format=");
                    y2.append(d2.a);
                    Log.w("ExifInterface", y2.toString());
                    return null;
                }
                d[] dVarArr = (d[]) d2.h(this.H);
                if (dVarArr == null || dVarArr.length != 3) {
                    StringBuilder y3 = e.a.d.a.a.y("Invalid GPS Timestamp array. array=");
                    y3.append(Arrays.toString(dVarArr));
                    Log.w("ExifInterface", y3.toString());
                    return null;
                }
                return String.format("%02d:%02d:%02d", Integer.valueOf((int) (((float) dVarArr[0].a) / ((float) dVarArr[0].f2306b))), Integer.valueOf((int) (((float) dVarArr[1].a) / ((float) dVarArr[1].f2306b))), Integer.valueOf((int) (((float) dVarArr[2].a) / ((float) dVarArr[2].f2306b))));
            }
            try {
                return Double.toString(d2.e(this.H));
            } catch (NumberFormatException unused) {
            }
        }
        return null;
    }

    public final b d(String str) {
        if ("ISOSpeedRatings".equals(str)) {
            str = "PhotographicSensitivity";
        }
        for (int i2 = 0; i2 < v.length; i2++) {
            b bVar = this.F[i2].get(str);
            if (bVar != null) {
                return bVar;
            }
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:66:0x011a, code lost:
        r9.f2298d = r8.H;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x011e, code lost:
        return;
     */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0055 A[FALL_THROUGH] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void e(c.l.a.a.C0045a r9, int r10, int r11) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 402
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: c.l.a.a.e(c.l.a.a$a, int, int):void");
    }

    public final int f(BufferedInputStream bufferedInputStream) throws IOException {
        boolean z2;
        boolean z3;
        bufferedInputStream.mark(Level.TRACE_INT);
        byte[] bArr = new byte[Level.TRACE_INT];
        bufferedInputStream.read(bArr);
        bufferedInputStream.reset();
        int i2 = 0;
        while (true) {
            byte[] bArr2 = f2286e;
            if (i2 >= bArr2.length) {
                z2 = true;
                break;
            } else if (bArr[i2] != bArr2[i2]) {
                z2 = false;
                break;
            } else {
                i2++;
            }
        }
        if (z2) {
            return 4;
        }
        byte[] bytes = "FUJIFILMCCD-RAW".getBytes(Charset.defaultCharset());
        int i3 = 0;
        while (true) {
            if (i3 >= bytes.length) {
                z3 = true;
                break;
            } else if (bArr[i3] != bytes[i3]) {
                z3 = false;
                break;
            } else {
                i3++;
            }
        }
        if (z3) {
            return 9;
        }
        C0045a c0045a = new C0045a(bArr);
        ByteOrder n2 = n(c0045a);
        this.H = n2;
        c0045a.f2298d = n2;
        short readShort = c0045a.readShort();
        c0045a.close();
        if (readShort == 20306 || readShort == 21330) {
            return 7;
        }
        C0045a c0045a2 = new C0045a(bArr);
        ByteOrder n3 = n(c0045a2);
        this.H = n3;
        c0045a2.f2298d = n3;
        short readShort2 = c0045a2.readShort();
        c0045a2.close();
        return readShort2 == 85 ? 10 : 0;
    }

    public final void g(C0045a c0045a) throws IOException {
        i(c0045a);
        b bVar = this.F[1].get("MakerNote");
        if (bVar != null) {
            C0045a c0045a2 = new C0045a(bVar.f2302c);
            c0045a2.f2298d = this.H;
            byte[] bArr = f2287f;
            byte[] bArr2 = new byte[bArr.length];
            c0045a2.readFully(bArr2);
            c0045a2.f(0L);
            byte[] bArr3 = f2288g;
            byte[] bArr4 = new byte[bArr3.length];
            c0045a2.readFully(bArr4);
            if (Arrays.equals(bArr2, bArr)) {
                c0045a2.f(8L);
            } else if (Arrays.equals(bArr4, bArr3)) {
                c0045a2.f(12L);
            }
            o(c0045a2, 6);
            b bVar2 = this.F[7].get("PreviewImageStart");
            b bVar3 = this.F[7].get("PreviewImageLength");
            if (bVar2 != null && bVar3 != null) {
                this.F[5].put("JPEGInterchangeFormat", bVar2);
                this.F[5].put("JPEGInterchangeFormatLength", bVar3);
            }
            b bVar4 = this.F[8].get("AspectFrame");
            if (bVar4 != null) {
                int[] iArr = (int[]) bVar4.h(this.H);
                if (iArr == null || iArr.length != 4) {
                    StringBuilder y2 = e.a.d.a.a.y("Invalid aspect frame values. frame=");
                    y2.append(Arrays.toString(iArr));
                    Log.w("ExifInterface", y2.toString());
                } else if (iArr[2] <= iArr[0] || iArr[3] <= iArr[1]) {
                } else {
                    int i2 = (iArr[2] - iArr[0]) + 1;
                    int i3 = (iArr[3] - iArr[1]) + 1;
                    if (i2 < i3) {
                        int i4 = i2 + i3;
                        i3 = i4 - i3;
                        i2 = i4 - i3;
                    }
                    b d2 = b.d(i2, this.H);
                    b d3 = b.d(i3, this.H);
                    this.F[0].put("ImageWidth", d2);
                    this.F[0].put("ImageLength", d3);
                }
            }
        }
    }

    public final void h(C0045a c0045a) throws IOException {
        c0045a.skipBytes(84);
        byte[] bArr = new byte[4];
        byte[] bArr2 = new byte[4];
        c0045a.read(bArr);
        c0045a.skipBytes(4);
        c0045a.read(bArr2);
        int i2 = ByteBuffer.wrap(bArr).getInt();
        int i3 = ByteBuffer.wrap(bArr2).getInt();
        e(c0045a, i2, 5);
        c0045a.f(i3);
        c0045a.f2298d = ByteOrder.BIG_ENDIAN;
        int readInt = c0045a.readInt();
        for (int i4 = 0; i4 < readInt; i4++) {
            int readUnsignedShort = c0045a.readUnsignedShort();
            int readUnsignedShort2 = c0045a.readUnsignedShort();
            if (readUnsignedShort == q.a) {
                short readShort = c0045a.readShort();
                short readShort2 = c0045a.readShort();
                b d2 = b.d(readShort, this.H);
                b d3 = b.d(readShort2, this.H);
                this.F[0].put("ImageLength", d2);
                this.F[0].put("ImageWidth", d3);
                return;
            }
            c0045a.skipBytes(readUnsignedShort2);
        }
    }

    public final void i(C0045a c0045a) throws IOException {
        b bVar;
        m(c0045a, c0045a.available());
        o(c0045a, 0);
        r(c0045a, 0);
        r(c0045a, 5);
        r(c0045a, 4);
        q(0, 5);
        q(0, 4);
        q(5, 4);
        b bVar2 = this.F[1].get("PixelXDimension");
        b bVar3 = this.F[1].get("PixelYDimension");
        if (bVar2 != null && bVar3 != null) {
            this.F[0].put("ImageWidth", bVar2);
            this.F[0].put("ImageLength", bVar3);
        }
        if (this.F[4].isEmpty() && l(this.F[5])) {
            HashMap<String, b>[] hashMapArr = this.F;
            hashMapArr[4] = hashMapArr[5];
            hashMapArr[5] = new HashMap<>();
        }
        l(this.F[4]);
        if (this.E != 8 || (bVar = this.F[1].get("MakerNote")) == null) {
            return;
        }
        C0045a c0045a2 = new C0045a(bVar.f2302c);
        c0045a2.f2298d = this.H;
        c0045a2.f(6L);
        o(c0045a2, 9);
        b bVar4 = this.F[9].get("ColorSpace");
        if (bVar4 != null) {
            this.F[1].put("ColorSpace", bVar4);
        }
    }

    public final void j(C0045a c0045a) throws IOException {
        i(c0045a);
        if (this.F[0].get("JpgFromRaw") != null) {
            e(c0045a, this.N, 5);
        }
        b bVar = this.F[0].get("ISO");
        b bVar2 = this.F[1].get("PhotographicSensitivity");
        if (bVar == null || bVar2 != null) {
            return;
        }
        this.F[1].put("PhotographicSensitivity", bVar);
    }

    public final void k(C0045a c0045a, HashMap hashMap) throws IOException {
        int i2;
        b bVar = (b) hashMap.get("JPEGInterchangeFormat");
        b bVar2 = (b) hashMap.get("JPEGInterchangeFormatLength");
        if (bVar == null || bVar2 == null) {
            return;
        }
        int f2 = bVar.f(this.H);
        int min = Math.min(bVar2.f(this.H), c0045a.available() - f2);
        int i3 = this.E;
        if (i3 != 4 && i3 != 9 && i3 != 10) {
            if (i3 == 7) {
                i2 = this.K;
            }
            if (f2 > 0 || min <= 0 || this.D != null) {
                return;
            }
            c0045a.f(f2);
            c0045a.readFully(new byte[min]);
            return;
        }
        i2 = this.J;
        f2 += i2;
        if (f2 > 0) {
        }
    }

    public final boolean l(HashMap hashMap) throws IOException {
        b bVar = (b) hashMap.get("ImageLength");
        b bVar2 = (b) hashMap.get("ImageWidth");
        if (bVar == null || bVar2 == null) {
            return false;
        }
        return bVar.f(this.H) <= 512 && bVar2.f(this.H) <= 512;
    }

    public final void m(C0045a c0045a, int i2) throws IOException {
        ByteOrder n2 = n(c0045a);
        this.H = n2;
        c0045a.f2298d = n2;
        int readUnsignedShort = c0045a.readUnsignedShort();
        int i3 = this.E;
        if (i3 != 7 && i3 != 10 && readUnsignedShort != 42) {
            StringBuilder y2 = e.a.d.a.a.y("Invalid start code: ");
            y2.append(Integer.toHexString(readUnsignedShort));
            throw new IOException(y2.toString());
        }
        int readInt = c0045a.readInt();
        if (readInt < 8 || readInt >= i2) {
            throw new IOException(e.a.d.a.a.e("Invalid first Ifd offset: ", readInt));
        }
        int i4 = readInt - 8;
        if (i4 > 0 && c0045a.skipBytes(i4) != i4) {
            throw new IOException(e.a.d.a.a.e("Couldn't jump to first Ifd: ", i4));
        }
    }

    public final ByteOrder n(C0045a c0045a) throws IOException {
        short readShort = c0045a.readShort();
        if (readShort != 18761) {
            if (readShort == 19789) {
                return ByteOrder.BIG_ENDIAN;
            }
            StringBuilder y2 = e.a.d.a.a.y("Invalid byte order: ");
            y2.append(Integer.toHexString(readShort));
            throw new IOException(y2.toString());
        }
        return ByteOrder.LITTLE_ENDIAN;
    }

    /* JADX WARN: Removed duplicated region for block: B:63:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x011a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void o(c.l.a.a.C0045a r24, int r25) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 840
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: c.l.a.a.o(c.l.a.a$a, int):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0060, code lost:
        if (java.util.Arrays.equals(r1, c.l.a.a.f2285d) != false) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0068, code lost:
        if (java.util.Arrays.equals(r1, r5) != false) goto L27;
     */
    /* JADX WARN: Removed duplicated region for block: B:30:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:50:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void p(c.l.a.a.C0045a r12) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 220
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: c.l.a.a.p(c.l.a.a$a):void");
    }

    public final void q(int i2, int i3) throws IOException {
        if (this.F[i2].isEmpty() || this.F[i3].isEmpty()) {
            return;
        }
        b bVar = this.F[i2].get("ImageLength");
        b bVar2 = this.F[i2].get("ImageWidth");
        b bVar3 = this.F[i3].get("ImageLength");
        b bVar4 = this.F[i3].get("ImageWidth");
        if (bVar == null || bVar2 == null || bVar3 == null || bVar4 == null) {
            return;
        }
        int f2 = bVar.f(this.H);
        int f3 = bVar2.f(this.H);
        int f4 = bVar3.f(this.H);
        int f5 = bVar4.f(this.H);
        if (f2 >= f4 || f3 >= f5) {
            return;
        }
        HashMap<String, b>[] hashMapArr = this.F;
        HashMap<String, b> hashMap = hashMapArr[i2];
        hashMapArr[i2] = hashMapArr[i3];
        hashMapArr[i3] = hashMap;
    }

    public final void r(C0045a c0045a, int i2) throws IOException {
        b bVar;
        b d2;
        b d3;
        b bVar2 = this.F[i2].get("DefaultCropSize");
        b bVar3 = this.F[i2].get("SensorTopBorder");
        b bVar4 = this.F[i2].get("SensorLeftBorder");
        b bVar5 = this.F[i2].get("SensorBottomBorder");
        b bVar6 = this.F[i2].get("SensorRightBorder");
        if (bVar2 != null) {
            if (bVar2.a == 5) {
                d[] dVarArr = (d[]) bVar2.h(this.H);
                if (dVarArr == null || dVarArr.length != 2) {
                    StringBuilder y2 = e.a.d.a.a.y("Invalid crop size values. cropSize=");
                    y2.append(Arrays.toString(dVarArr));
                    Log.w("ExifInterface", y2.toString());
                    return;
                }
                d2 = b.c(dVarArr[0], this.H);
                d3 = b.c(dVarArr[1], this.H);
            } else {
                int[] iArr = (int[]) bVar2.h(this.H);
                if (iArr == null || iArr.length != 2) {
                    StringBuilder y3 = e.a.d.a.a.y("Invalid crop size values. cropSize=");
                    y3.append(Arrays.toString(iArr));
                    Log.w("ExifInterface", y3.toString());
                    return;
                }
                d2 = b.d(iArr[0], this.H);
                d3 = b.d(iArr[1], this.H);
            }
            this.F[i2].put("ImageWidth", d2);
            this.F[i2].put("ImageLength", d3);
        } else if (bVar3 == null || bVar4 == null || bVar5 == null || bVar6 == null) {
            b bVar7 = this.F[i2].get("ImageLength");
            b bVar8 = this.F[i2].get("ImageWidth");
            if ((bVar7 == null || bVar8 == null) && (bVar = this.F[i2].get("JPEGInterchangeFormat")) != null) {
                e(c0045a, bVar.f(this.H), i2);
            }
        } else {
            int f2 = bVar3.f(this.H);
            int f3 = bVar5.f(this.H);
            int f4 = bVar6.f(this.H);
            int f5 = bVar4.f(this.H);
            if (f3 <= f2 || f4 <= f5) {
                return;
            }
            b d4 = b.d(f3 - f2, this.H);
            b d5 = b.d(f4 - f5, this.H);
            this.F[i2].put("ImageLength", d4);
            this.F[i2].put("ImageWidth", d5);
        }
    }
}
