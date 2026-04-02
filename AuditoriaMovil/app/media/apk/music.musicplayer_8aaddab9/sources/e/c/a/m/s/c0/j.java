package e.c.a.m.s.c0;

import android.annotation.SuppressLint;
import android.graphics.Bitmap;
import android.os.Build;
import android.util.Log;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;
/* loaded from: classes.dex */
public class j implements d {
    public static final Bitmap.Config a = Bitmap.Config.ARGB_8888;

    /* renamed from: b  reason: collision with root package name */
    public final k f5610b;

    /* renamed from: c  reason: collision with root package name */
    public final Set<Bitmap.Config> f5611c;

    /* renamed from: d  reason: collision with root package name */
    public final a f5612d;

    /* renamed from: e  reason: collision with root package name */
    public long f5613e;

    /* renamed from: f  reason: collision with root package name */
    public long f5614f;

    /* renamed from: g  reason: collision with root package name */
    public int f5615g;

    /* renamed from: h  reason: collision with root package name */
    public int f5616h;

    /* renamed from: i  reason: collision with root package name */
    public int f5617i;

    /* renamed from: j  reason: collision with root package name */
    public int f5618j;

    /* loaded from: classes.dex */
    public interface a {
    }

    /* loaded from: classes.dex */
    public static final class b implements a {
    }

    public j(long j2) {
        m mVar = new m();
        HashSet hashSet = new HashSet(Arrays.asList(Bitmap.Config.values()));
        int i2 = Build.VERSION.SDK_INT;
        hashSet.add(null);
        if (i2 >= 26) {
            hashSet.remove(Bitmap.Config.HARDWARE);
        }
        Set<Bitmap.Config> unmodifiableSet = Collections.unmodifiableSet(hashSet);
        this.f5613e = j2;
        this.f5610b = mVar;
        this.f5611c = unmodifiableSet;
        this.f5612d = new b();
    }

    @Override // e.c.a.m.s.c0.d
    @SuppressLint({"InlinedApi"})
    public void a(int i2) {
        Log.isLoggable("LruBitmapPool", 3);
        if (i2 >= 40 || (Build.VERSION.SDK_INT >= 23 && i2 >= 20)) {
            Log.isLoggable("LruBitmapPool", 3);
            i(0L);
        } else if (i2 >= 20 || i2 == 15) {
            i(this.f5613e / 2);
        }
    }

    @Override // e.c.a.m.s.c0.d
    public void b() {
        Log.isLoggable("LruBitmapPool", 3);
        i(0L);
    }

    @Override // e.c.a.m.s.c0.d
    public Bitmap c(int i2, int i3, Bitmap.Config config) {
        Bitmap h2 = h(i2, i3, config);
        if (h2 == null) {
            if (config == null) {
                config = a;
            }
            return Bitmap.createBitmap(i2, i3, config);
        }
        return h2;
    }

    @Override // e.c.a.m.s.c0.d
    public synchronized void d(Bitmap bitmap) {
        try {
            if (bitmap == null) {
                throw new NullPointerException("Bitmap must not be null");
            }
            if (bitmap.isRecycled()) {
                throw new IllegalStateException("Cannot pool recycled bitmap");
            }
            if (bitmap.isMutable()) {
                Objects.requireNonNull((m) this.f5610b);
                if (e.c.a.s.j.d(bitmap) <= this.f5613e && this.f5611c.contains(bitmap.getConfig())) {
                    Objects.requireNonNull((m) this.f5610b);
                    int d2 = e.c.a.s.j.d(bitmap);
                    ((m) this.f5610b).f(bitmap);
                    Objects.requireNonNull((b) this.f5612d);
                    this.f5617i++;
                    this.f5614f += d2;
                    if (Log.isLoggable("LruBitmapPool", 2)) {
                        ((m) this.f5610b).e(bitmap);
                    }
                    f();
                    i(this.f5613e);
                    return;
                }
            }
            if (Log.isLoggable("LruBitmapPool", 2)) {
                ((m) this.f5610b).e(bitmap);
                bitmap.isMutable();
                this.f5611c.contains(bitmap.getConfig());
            }
            bitmap.recycle();
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // e.c.a.m.s.c0.d
    public Bitmap e(int i2, int i3, Bitmap.Config config) {
        Bitmap h2 = h(i2, i3, config);
        if (h2 != null) {
            h2.eraseColor(0);
            return h2;
        }
        if (config == null) {
            config = a;
        }
        return Bitmap.createBitmap(i2, i3, config);
    }

    public final void f() {
        if (Log.isLoggable("LruBitmapPool", 2)) {
            g();
        }
    }

    public final void g() {
        StringBuilder y = e.a.d.a.a.y("Hits=");
        y.append(this.f5615g);
        y.append(", misses=");
        y.append(this.f5616h);
        y.append(", puts=");
        y.append(this.f5617i);
        y.append(", evictions=");
        y.append(this.f5618j);
        y.append(", currentSize=");
        y.append(this.f5614f);
        y.append(", maxSize=");
        y.append(this.f5613e);
        y.append("\nStrategy=");
        y.append(this.f5610b);
        y.toString();
    }

    public final synchronized Bitmap h(int i2, int i3, Bitmap.Config config) {
        Bitmap b2;
        if (Build.VERSION.SDK_INT >= 26 && config == Bitmap.Config.HARDWARE) {
            throw new IllegalArgumentException("Cannot create a mutable Bitmap with config: " + config + ". Consider setting Downsampler#ALLOW_HARDWARE_CONFIG to false in your RequestOptions and/or in GlideBuilder.setDefaultRequestOptions");
        }
        b2 = ((m) this.f5610b).b(i2, i3, config != null ? config : a);
        if (b2 == null) {
            if (Log.isLoggable("LruBitmapPool", 3)) {
                Objects.requireNonNull((m) this.f5610b);
                m.c(e.c.a.s.j.c(i2, i3, config), config);
            }
            this.f5616h++;
        } else {
            this.f5615g++;
            long j2 = this.f5614f;
            Objects.requireNonNull((m) this.f5610b);
            this.f5614f = j2 - e.c.a.s.j.d(b2);
            Objects.requireNonNull((b) this.f5612d);
            b2.setHasAlpha(true);
            b2.setPremultiplied(true);
        }
        if (Log.isLoggable("LruBitmapPool", 2)) {
            Objects.requireNonNull((m) this.f5610b);
            m.c(e.c.a.s.j.c(i2, i3, config), config);
        }
        f();
        return b2;
    }

    public final synchronized void i(long j2) {
        while (this.f5614f > j2) {
            m mVar = (m) this.f5610b;
            Bitmap c2 = mVar.f5624g.c();
            if (c2 != null) {
                mVar.a(Integer.valueOf(e.c.a.s.j.d(c2)), c2);
            }
            if (c2 == null) {
                if (Log.isLoggable("LruBitmapPool", 5)) {
                    Log.w("LruBitmapPool", "Size mismatch, resetting");
                    g();
                }
                this.f5614f = 0L;
                return;
            }
            Objects.requireNonNull((b) this.f5612d);
            long j3 = this.f5614f;
            Objects.requireNonNull((m) this.f5610b);
            this.f5614f = j3 - e.c.a.s.j.d(c2);
            this.f5618j++;
            if (Log.isLoggable("LruBitmapPool", 3)) {
                ((m) this.f5610b).e(c2);
            }
            f();
            c2.recycle();
        }
    }
}
