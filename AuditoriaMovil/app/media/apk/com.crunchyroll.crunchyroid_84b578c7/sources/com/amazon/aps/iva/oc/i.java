package com.amazon.aps.iva.oc;

import android.annotation.SuppressLint;
import android.graphics.Bitmap;
import android.util.Log;
import com.amazon.aps.iva.hd.l;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;
/* compiled from: LruBitmapPool.java */
/* loaded from: classes.dex */
public final class i implements c {
    public static final Bitmap.Config f = Bitmap.Config.ARGB_8888;
    public final j a;
    public final Set<Bitmap.Config> b;
    public final a c;
    public final long d;
    public long e;

    /* compiled from: LruBitmapPool.java */
    /* loaded from: classes.dex */
    public static final class a {
    }

    public i(long j) {
        l lVar = new l();
        HashSet hashSet = new HashSet(Arrays.asList(Bitmap.Config.values()));
        hashSet.add(null);
        hashSet.remove(Bitmap.Config.HARDWARE);
        Set<Bitmap.Config> unmodifiableSet = Collections.unmodifiableSet(hashSet);
        this.d = j;
        this.a = lVar;
        this.b = unmodifiableSet;
        this.c = new a();
    }

    @Override // com.amazon.aps.iva.oc.c
    @SuppressLint({"InlinedApi"})
    public final void a(int i) {
        Log.isLoggable("LruBitmapPool", 3);
        if (i < 40 && i < 20) {
            if (i >= 20 || i == 15) {
                g(this.d / 2);
                return;
            }
            return;
        }
        b();
    }

    @Override // com.amazon.aps.iva.oc.c
    public final void b() {
        Log.isLoggable("LruBitmapPool", 3);
        g(0L);
    }

    @Override // com.amazon.aps.iva.oc.c
    public final Bitmap c(int i, int i2, Bitmap.Config config) {
        Bitmap f2 = f(i, i2, config);
        if (f2 == null) {
            if (config == null) {
                config = f;
            }
            return Bitmap.createBitmap(i, i2, config);
        }
        return f2;
    }

    @Override // com.amazon.aps.iva.oc.c
    public final synchronized void d(Bitmap bitmap) {
        try {
            if (bitmap != null) {
                if (!bitmap.isRecycled()) {
                    if (bitmap.isMutable()) {
                        ((l) this.a).getClass();
                        if (com.amazon.aps.iva.hd.l.c(bitmap) <= this.d && this.b.contains(bitmap.getConfig())) {
                            ((l) this.a).getClass();
                            int c = com.amazon.aps.iva.hd.l.c(bitmap);
                            ((l) this.a).f(bitmap);
                            this.c.getClass();
                            this.e += c;
                            if (Log.isLoggable("LruBitmapPool", 2)) {
                                ((l) this.a).e(bitmap);
                            }
                            if (Log.isLoggable("LruBitmapPool", 2)) {
                                Objects.toString(this.a);
                            }
                            g(this.d);
                            return;
                        }
                    }
                    if (Log.isLoggable("LruBitmapPool", 2)) {
                        ((l) this.a).e(bitmap);
                        bitmap.isMutable();
                        this.b.contains(bitmap.getConfig());
                    }
                    bitmap.recycle();
                    return;
                }
                throw new IllegalStateException("Cannot pool recycled bitmap");
            }
            throw new NullPointerException("Bitmap must not be null");
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // com.amazon.aps.iva.oc.c
    public final Bitmap e(int i, int i2, Bitmap.Config config) {
        Bitmap f2 = f(i, i2, config);
        if (f2 != null) {
            f2.eraseColor(0);
            return f2;
        }
        if (config == null) {
            config = f;
        }
        return Bitmap.createBitmap(i, i2, config);
    }

    public final synchronized Bitmap f(int i, int i2, Bitmap.Config config) {
        Bitmap.Config config2;
        Bitmap b;
        Bitmap.Config config3;
        Bitmap.Config config4;
        int i3;
        try {
            if (config != Bitmap.Config.HARDWARE) {
                j jVar = this.a;
                if (config != null) {
                    config2 = config;
                } else {
                    config2 = f;
                }
                b = ((l) jVar).b(i, i2, config2);
                int i4 = 8;
                if (b == null) {
                    if (Log.isLoggable("LruBitmapPool", 3)) {
                        ((l) this.a).getClass();
                        char[] cArr = com.amazon.aps.iva.hd.l.a;
                        int i5 = i * i2;
                        if (config == null) {
                            config4 = Bitmap.Config.ARGB_8888;
                        } else {
                            config4 = config;
                        }
                        int i6 = l.a.a[config4.ordinal()];
                        if (i6 != 1) {
                            if (i6 != 2 && i6 != 3) {
                                if (i6 != 4) {
                                    i3 = 4;
                                } else {
                                    i3 = 8;
                                }
                            } else {
                                i3 = 2;
                            }
                        } else {
                            i3 = 1;
                        }
                        l.c(i3 * i5, config);
                    }
                } else {
                    long j = this.e;
                    ((l) this.a).getClass();
                    this.e = j - com.amazon.aps.iva.hd.l.c(b);
                    this.c.getClass();
                    b.setHasAlpha(true);
                    b.setPremultiplied(true);
                }
                if (Log.isLoggable("LruBitmapPool", 2)) {
                    ((l) this.a).getClass();
                    char[] cArr2 = com.amazon.aps.iva.hd.l.a;
                    int i7 = i * i2;
                    if (config == null) {
                        config3 = Bitmap.Config.ARGB_8888;
                    } else {
                        config3 = config;
                    }
                    int i8 = l.a.a[config3.ordinal()];
                    if (i8 != 1) {
                        if (i8 != 2 && i8 != 3) {
                            if (i8 != 4) {
                                i4 = 4;
                            }
                        } else {
                            i4 = 2;
                        }
                    } else {
                        i4 = 1;
                    }
                    l.c(i4 * i7, config);
                }
                if (Log.isLoggable("LruBitmapPool", 2)) {
                    Objects.toString(this.a);
                }
            } else {
                throw new IllegalArgumentException("Cannot create a mutable Bitmap with config: " + config + ". Consider setting Downsampler#ALLOW_HARDWARE_CONFIG to false in your RequestOptions and/or in GlideBuilder.setDefaultRequestOptions");
            }
        } catch (Throwable th) {
            throw th;
        }
        return b;
    }

    public final synchronized void g(long j) {
        while (this.e > j) {
            l lVar = (l) this.a;
            Bitmap c = lVar.b.c();
            if (c != null) {
                lVar.a(Integer.valueOf(com.amazon.aps.iva.hd.l.c(c)), c);
            }
            if (c == null) {
                if (Log.isLoggable("LruBitmapPool", 5)) {
                    Objects.toString(this.a);
                }
                this.e = 0L;
                return;
            }
            this.c.getClass();
            long j2 = this.e;
            ((l) this.a).getClass();
            this.e = j2 - com.amazon.aps.iva.hd.l.c(c);
            if (Log.isLoggable("LruBitmapPool", 3)) {
                ((l) this.a).e(c);
            }
            if (Log.isLoggable("LruBitmapPool", 2)) {
                Objects.toString(this.a);
            }
            c.recycle();
        }
    }
}
