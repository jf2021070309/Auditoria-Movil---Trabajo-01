package com.amazon.aps.iva.uc;

import android.annotation.TargetApi;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.util.DisplayMetrics;
import android.util.Log;
import com.amazon.aps.iva.uc.m;
import com.bumptech.glide.load.ImageHeaderParser;
import com.google.android.gms.cast.Cast;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Collections;
import java.util.EnumSet;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.locks.Lock;
/* compiled from: Downsampler.java */
/* loaded from: classes.dex */
public final class n {
    public static final com.amazon.aps.iva.kc.g<com.amazon.aps.iva.kc.b> f = com.amazon.aps.iva.kc.g.a(com.amazon.aps.iva.kc.b.DEFAULT, "com.bumptech.glide.load.resource.bitmap.Downsampler.DecodeFormat");
    public static final com.amazon.aps.iva.kc.g<com.amazon.aps.iva.kc.i> g = new com.amazon.aps.iva.kc.g<>("com.bumptech.glide.load.resource.bitmap.Downsampler.PreferredColorSpace", null, com.amazon.aps.iva.kc.g.e);
    public static final com.amazon.aps.iva.kc.g<Boolean> h;
    public static final com.amazon.aps.iva.kc.g<Boolean> i;
    public static final Set<String> j;
    public static final a k;
    public static final Set<ImageHeaderParser.ImageType> l;
    public static final ArrayDeque m;
    public final com.amazon.aps.iva.oc.c a;
    public final DisplayMetrics b;
    public final com.amazon.aps.iva.oc.b c;
    public final List<ImageHeaderParser> d;
    public final s e = s.a();

    /* compiled from: Downsampler.java */
    /* loaded from: classes.dex */
    public interface b {
        void a(Bitmap bitmap, com.amazon.aps.iva.oc.c cVar) throws IOException;

        void b();
    }

    static {
        m.e eVar = m.a;
        Boolean bool = Boolean.FALSE;
        h = com.amazon.aps.iva.kc.g.a(bool, "com.bumptech.glide.load.resource.bitmap.Downsampler.FixBitmapSize");
        i = com.amazon.aps.iva.kc.g.a(bool, "com.bumptech.glide.load.resource.bitmap.Downsampler.AllowHardwareDecode");
        j = Collections.unmodifiableSet(new HashSet(Arrays.asList("image/vnd.wap.wbmp", "image/x-ico")));
        k = new a();
        l = Collections.unmodifiableSet(EnumSet.of(ImageHeaderParser.ImageType.JPEG, ImageHeaderParser.ImageType.PNG_A, ImageHeaderParser.ImageType.PNG));
        char[] cArr = com.amazon.aps.iva.hd.l.a;
        m = new ArrayDeque(0);
    }

    public n(List<ImageHeaderParser> list, DisplayMetrics displayMetrics, com.amazon.aps.iva.oc.c cVar, com.amazon.aps.iva.oc.b bVar) {
        this.d = list;
        defpackage.i.l(displayMetrics);
        this.b = displayMetrics;
        defpackage.i.l(cVar);
        this.a = cVar;
        defpackage.i.l(bVar);
        this.c = bVar;
    }

    public static Bitmap c(t tVar, BitmapFactory.Options options, b bVar, com.amazon.aps.iva.oc.c cVar) throws IOException {
        if (!options.inJustDecodeBounds) {
            bVar.b();
            tVar.b();
        }
        int i2 = options.outWidth;
        int i3 = options.outHeight;
        String str = options.outMimeType;
        Lock lock = a0.d;
        lock.lock();
        try {
            try {
                Bitmap a2 = tVar.a(options);
                lock.unlock();
                return a2;
            } catch (IllegalArgumentException e) {
                IOException e2 = e(e, i2, i3, str, options);
                Log.isLoggable("Downsampler", 3);
                Bitmap bitmap = options.inBitmap;
                if (bitmap != null) {
                    try {
                        cVar.d(bitmap);
                        options.inBitmap = null;
                        Bitmap c = c(tVar, options, bVar, cVar);
                        a0.d.unlock();
                        return c;
                    } catch (IOException unused) {
                        throw e2;
                    }
                }
                throw e2;
            }
        } catch (Throwable th) {
            a0.d.unlock();
            throw th;
        }
    }

    @TargetApi(19)
    public static String d(Bitmap bitmap) {
        if (bitmap == null) {
            return null;
        }
        return "[" + bitmap.getWidth() + "x" + bitmap.getHeight() + "] " + bitmap.getConfig() + (" (" + bitmap.getAllocationByteCount() + ")");
    }

    public static IOException e(IllegalArgumentException illegalArgumentException, int i2, int i3, String str, BitmapFactory.Options options) {
        StringBuilder a2 = com.amazon.aps.iva.b6.x.a("Exception decoding bitmap, outWidth: ", i2, ", outHeight: ", i3, ", outMimeType: ");
        a2.append(str);
        a2.append(", inBitmap: ");
        a2.append(d(options.inBitmap));
        return new IOException(a2.toString(), illegalArgumentException);
    }

    public static void f(BitmapFactory.Options options) {
        options.inTempStorage = null;
        options.inDither = false;
        options.inScaled = false;
        options.inSampleSize = 1;
        options.inPreferredConfig = null;
        options.inJustDecodeBounds = false;
        options.inDensity = 0;
        options.inTargetDensity = 0;
        options.inPreferredColorSpace = null;
        options.outColorSpace = null;
        options.outConfig = null;
        options.outWidth = 0;
        options.outHeight = 0;
        options.outMimeType = null;
        options.inBitmap = null;
        options.inMutable = true;
    }

    public final e a(t tVar, int i2, int i3, com.amazon.aps.iva.kc.h hVar, b bVar) throws IOException {
        ArrayDeque arrayDeque;
        BitmapFactory.Options options;
        BitmapFactory.Options options2;
        boolean z;
        byte[] bArr = (byte[]) this.c.c(byte[].class, Cast.MAX_MESSAGE_LENGTH);
        synchronized (n.class) {
            arrayDeque = m;
            synchronized (arrayDeque) {
                options = (BitmapFactory.Options) arrayDeque.poll();
            }
            if (options == null) {
                options = new BitmapFactory.Options();
                f(options);
            }
            options2 = options;
        }
        options2.inTempStorage = bArr;
        com.amazon.aps.iva.kc.b bVar2 = (com.amazon.aps.iva.kc.b) hVar.c(f);
        com.amazon.aps.iva.kc.i iVar = (com.amazon.aps.iva.kc.i) hVar.c(g);
        m mVar = (m) hVar.c(m.f);
        boolean booleanValue = ((Boolean) hVar.c(h)).booleanValue();
        com.amazon.aps.iva.kc.g<Boolean> gVar = i;
        if (hVar.c(gVar) != null && ((Boolean) hVar.c(gVar)).booleanValue()) {
            z = true;
        } else {
            z = false;
        }
        try {
            e c = e.c(b(tVar, options2, mVar, bVar2, iVar, z, i2, i3, booleanValue, bVar), this.a);
            f(options2);
            synchronized (arrayDeque) {
                arrayDeque.offer(options2);
            }
            this.c.put(bArr);
            return c;
        } catch (Throwable th) {
            f(options2);
            ArrayDeque arrayDeque2 = m;
            synchronized (arrayDeque2) {
                arrayDeque2.offer(options2);
                this.c.put(bArr);
                throw th;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x01a6  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x01aa  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x0280  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x0286  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x02bb  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x02c6  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x02ff  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x0313  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x03b3 A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0166  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0168  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x018a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.graphics.Bitmap b(com.amazon.aps.iva.uc.t r25, android.graphics.BitmapFactory.Options r26, com.amazon.aps.iva.uc.m r27, com.amazon.aps.iva.kc.b r28, com.amazon.aps.iva.kc.i r29, boolean r30, int r31, int r32, boolean r33, com.amazon.aps.iva.uc.n.b r34) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 1020
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.uc.n.b(com.amazon.aps.iva.uc.t, android.graphics.BitmapFactory$Options, com.amazon.aps.iva.uc.m, com.amazon.aps.iva.kc.b, com.amazon.aps.iva.kc.i, boolean, int, int, boolean, com.amazon.aps.iva.uc.n$b):android.graphics.Bitmap");
    }

    /* compiled from: Downsampler.java */
    /* loaded from: classes.dex */
    public class a implements b {
        @Override // com.amazon.aps.iva.uc.n.b
        public final void b() {
        }

        @Override // com.amazon.aps.iva.uc.n.b
        public final void a(Bitmap bitmap, com.amazon.aps.iva.oc.c cVar) {
        }
    }
}
