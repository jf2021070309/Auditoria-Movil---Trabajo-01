package e.c.a.m.u.c;

import android.annotation.TargetApi;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Build;
import android.util.DisplayMetrics;
import android.util.Log;
import com.bumptech.glide.load.ImageHeaderParser;
import e.c.a.m.u.c.s;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Collections;
import java.util.EnumSet;
import java.util.HashSet;
import java.util.List;
import java.util.Objects;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.locks.Lock;
/* loaded from: classes.dex */
public final class m {
    public static final e.c.a.m.l<e.c.a.m.b> a = e.c.a.m.l.a("com.bumptech.glide.load.resource.bitmap.Downsampler.DecodeFormat", e.c.a.m.b.DEFAULT);

    /* renamed from: b  reason: collision with root package name */
    public static final e.c.a.m.l<e.c.a.m.n> f5869b = e.c.a.m.l.a("com.bumptech.glide.load.resource.bitmap.Downsampler.PreferredColorSpace", e.c.a.m.n.SRGB);

    /* renamed from: c  reason: collision with root package name */
    public static final e.c.a.m.l<Boolean> f5870c;

    /* renamed from: d  reason: collision with root package name */
    public static final e.c.a.m.l<Boolean> f5871d;

    /* renamed from: e  reason: collision with root package name */
    public static final Set<String> f5872e;

    /* renamed from: f  reason: collision with root package name */
    public static final b f5873f;

    /* renamed from: g  reason: collision with root package name */
    public static final Set<ImageHeaderParser.ImageType> f5874g;

    /* renamed from: h  reason: collision with root package name */
    public static final Queue<BitmapFactory.Options> f5875h;

    /* renamed from: i  reason: collision with root package name */
    public final e.c.a.m.s.c0.d f5876i;

    /* renamed from: j  reason: collision with root package name */
    public final DisplayMetrics f5877j;

    /* renamed from: k  reason: collision with root package name */
    public final e.c.a.m.s.c0.b f5878k;

    /* renamed from: l  reason: collision with root package name */
    public final List<ImageHeaderParser> f5879l;

    /* renamed from: m  reason: collision with root package name */
    public final r f5880m = r.a();

    /* loaded from: classes.dex */
    public class a implements b {
        @Override // e.c.a.m.u.c.m.b
        public void a(e.c.a.m.s.c0.d dVar, Bitmap bitmap) {
        }

        @Override // e.c.a.m.u.c.m.b
        public void b() {
        }
    }

    /* loaded from: classes.dex */
    public interface b {
        void a(e.c.a.m.s.c0.d dVar, Bitmap bitmap) throws IOException;

        void b();
    }

    static {
        e.c.a.m.l<l> lVar = l.f5867g;
        Boolean bool = Boolean.FALSE;
        f5870c = e.c.a.m.l.a("com.bumptech.glide.load.resource.bitmap.Downsampler.FixBitmapSize", bool);
        f5871d = e.c.a.m.l.a("com.bumptech.glide.load.resource.bitmap.Downsampler.AllowHardwareDecode", bool);
        f5872e = Collections.unmodifiableSet(new HashSet(Arrays.asList("image/vnd.wap.wbmp", "image/x-ico")));
        f5873f = new a();
        f5874g = Collections.unmodifiableSet(EnumSet.of(ImageHeaderParser.ImageType.JPEG, ImageHeaderParser.ImageType.PNG_A, ImageHeaderParser.ImageType.PNG));
        char[] cArr = e.c.a.s.j.a;
        f5875h = new ArrayDeque(0);
    }

    public m(List<ImageHeaderParser> list, DisplayMetrics displayMetrics, e.c.a.m.s.c0.d dVar, e.c.a.m.s.c0.b bVar) {
        this.f5879l = list;
        Objects.requireNonNull(displayMetrics, "Argument must not be null");
        this.f5877j = displayMetrics;
        Objects.requireNonNull(dVar, "Argument must not be null");
        this.f5876i = dVar;
        Objects.requireNonNull(bVar, "Argument must not be null");
        this.f5878k = bVar;
    }

    public static Bitmap d(s sVar, BitmapFactory.Options options, b bVar, e.c.a.m.s.c0.d dVar) throws IOException {
        if (!options.inJustDecodeBounds) {
            bVar.b();
            sVar.c();
        }
        int i2 = options.outWidth;
        int i3 = options.outHeight;
        String str = options.outMimeType;
        Lock lock = z.f5905d;
        lock.lock();
        try {
            try {
                Bitmap b2 = sVar.b(options);
                lock.unlock();
                return b2;
            } catch (IllegalArgumentException e2) {
                IOException i4 = i(e2, i2, i3, str, options);
                Log.isLoggable("Downsampler", 3);
                Bitmap bitmap = options.inBitmap;
                if (bitmap != null) {
                    try {
                        dVar.d(bitmap);
                        options.inBitmap = null;
                        Bitmap d2 = d(sVar, options, bVar, dVar);
                        z.f5905d.unlock();
                        return d2;
                    } catch (IOException unused) {
                        throw i4;
                    }
                }
                throw i4;
            }
        } catch (Throwable th) {
            z.f5905d.unlock();
            throw th;
        }
    }

    @TargetApi(19)
    public static String e(Bitmap bitmap) {
        if (bitmap == null) {
            return null;
        }
        StringBuilder y = e.a.d.a.a.y(" (");
        y.append(bitmap.getAllocationByteCount());
        y.append(")");
        String sb = y.toString();
        StringBuilder y2 = e.a.d.a.a.y("[");
        y2.append(bitmap.getWidth());
        y2.append("x");
        y2.append(bitmap.getHeight());
        y2.append("] ");
        y2.append(bitmap.getConfig());
        y2.append(sb);
        return y2.toString();
    }

    public static int f(double d2) {
        if (d2 > 1.0d) {
            d2 = 1.0d / d2;
        }
        return (int) Math.round(d2 * 2.147483647E9d);
    }

    public static int[] g(s sVar, BitmapFactory.Options options, b bVar, e.c.a.m.s.c0.d dVar) throws IOException {
        options.inJustDecodeBounds = true;
        d(sVar, options, bVar, dVar);
        options.inJustDecodeBounds = false;
        return new int[]{options.outWidth, options.outHeight};
    }

    public static boolean h(int i2) {
        return i2 == 90 || i2 == 270;
    }

    public static IOException i(IllegalArgumentException illegalArgumentException, int i2, int i3, String str, BitmapFactory.Options options) {
        return new IOException("Exception decoding bitmap, outWidth: " + i2 + ", outHeight: " + i3 + ", outMimeType: " + str + ", inBitmap: " + e(options.inBitmap), illegalArgumentException);
    }

    public static void j(BitmapFactory.Options options) {
        options.inTempStorage = null;
        options.inDither = false;
        options.inScaled = false;
        options.inSampleSize = 1;
        options.inPreferredConfig = null;
        options.inJustDecodeBounds = false;
        options.inDensity = 0;
        options.inTargetDensity = 0;
        if (Build.VERSION.SDK_INT >= 26) {
            options.inPreferredColorSpace = null;
            options.outColorSpace = null;
            options.outConfig = null;
        }
        options.outWidth = 0;
        options.outHeight = 0;
        options.outMimeType = null;
        options.inBitmap = null;
        options.inMutable = true;
    }

    public static int k(double d2) {
        return (int) (d2 + 0.5d);
    }

    public final e.c.a.m.s.w<Bitmap> a(s sVar, int i2, int i3, e.c.a.m.m mVar, b bVar) throws IOException {
        Queue<BitmapFactory.Options> queue;
        BitmapFactory.Options poll;
        BitmapFactory.Options options;
        byte[] bArr = (byte[]) this.f5878k.e(65536, byte[].class);
        synchronized (m.class) {
            queue = f5875h;
            synchronized (queue) {
                poll = queue.poll();
            }
            if (poll == null) {
                poll = new BitmapFactory.Options();
                j(poll);
            }
            options = poll;
        }
        options.inTempStorage = bArr;
        e.c.a.m.b bVar2 = (e.c.a.m.b) mVar.c(a);
        e.c.a.m.n nVar = (e.c.a.m.n) mVar.c(f5869b);
        l lVar = (l) mVar.c(l.f5867g);
        boolean booleanValue = ((Boolean) mVar.c(f5870c)).booleanValue();
        e.c.a.m.l<Boolean> lVar2 = f5871d;
        try {
            e b2 = e.b(c(sVar, options, lVar, bVar2, nVar, mVar.c(lVar2) != null && ((Boolean) mVar.c(lVar2)).booleanValue(), i2, i3, booleanValue, bVar), this.f5876i);
            j(options);
            synchronized (queue) {
                queue.offer(options);
            }
            this.f5878k.d(bArr);
            return b2;
        } catch (Throwable th) {
            j(options);
            Queue<BitmapFactory.Options> queue2 = f5875h;
            synchronized (queue2) {
                queue2.offer(options);
                this.f5878k.d(bArr);
                throw th;
            }
        }
    }

    public e.c.a.m.s.w<Bitmap> b(InputStream inputStream, int i2, int i3, e.c.a.m.m mVar, b bVar) throws IOException {
        return a(new s.a(inputStream, this.f5879l, this.f5878k), i2, i3, mVar, bVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:138:0x02dd  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x02e3  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x0314  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x031e  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x0321  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x032d  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x034e  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x036a  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x037e  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x01cd A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:93:0x01d6  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x01da  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.graphics.Bitmap c(e.c.a.m.u.c.s r26, android.graphics.BitmapFactory.Options r27, e.c.a.m.u.c.l r28, e.c.a.m.b r29, e.c.a.m.n r30, boolean r31, int r32, int r33, boolean r34, e.c.a.m.u.c.m.b r35) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 1120
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: e.c.a.m.u.c.m.c(e.c.a.m.u.c.s, android.graphics.BitmapFactory$Options, e.c.a.m.u.c.l, e.c.a.m.b, e.c.a.m.n, boolean, int, int, boolean, e.c.a.m.u.c.m$b):android.graphics.Bitmap");
    }
}
