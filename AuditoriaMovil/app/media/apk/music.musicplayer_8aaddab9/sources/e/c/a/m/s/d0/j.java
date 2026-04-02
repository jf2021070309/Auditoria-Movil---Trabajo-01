package e.c.a.m.s.d0;

import android.app.ActivityManager;
import android.content.Context;
import android.os.Build;
import android.text.format.Formatter;
import android.util.DisplayMetrics;
import android.util.Log;
/* loaded from: classes.dex */
public final class j {
    public final int a;

    /* renamed from: b  reason: collision with root package name */
    public final int f5645b;

    /* renamed from: c  reason: collision with root package name */
    public final Context f5646c;

    /* renamed from: d  reason: collision with root package name */
    public final int f5647d;

    /* loaded from: classes.dex */
    public static final class a {
        public static final int a;

        /* renamed from: b  reason: collision with root package name */
        public final Context f5648b;

        /* renamed from: c  reason: collision with root package name */
        public ActivityManager f5649c;

        /* renamed from: d  reason: collision with root package name */
        public c f5650d;

        /* renamed from: e  reason: collision with root package name */
        public float f5651e;

        static {
            a = Build.VERSION.SDK_INT < 26 ? 4 : 1;
        }

        public a(Context context) {
            this.f5651e = a;
            this.f5648b = context;
            this.f5649c = (ActivityManager) context.getSystemService("activity");
            this.f5650d = new b(context.getResources().getDisplayMetrics());
            if (Build.VERSION.SDK_INT < 26 || !this.f5649c.isLowRamDevice()) {
                return;
            }
            this.f5651e = 0.0f;
        }
    }

    /* loaded from: classes.dex */
    public static final class b implements c {
        public final DisplayMetrics a;

        public b(DisplayMetrics displayMetrics) {
            this.a = displayMetrics;
        }
    }

    /* loaded from: classes.dex */
    public interface c {
    }

    public j(a aVar) {
        ActivityManager activityManager;
        this.f5646c = aVar.f5648b;
        int i2 = aVar.f5649c.isLowRamDevice() ? 2097152 : 4194304;
        this.f5647d = i2;
        int round = Math.round(activityManager.getMemoryClass() * 1024 * 1024 * (aVar.f5649c.isLowRamDevice() ? 0.33f : 0.4f));
        DisplayMetrics displayMetrics = ((b) aVar.f5650d).a;
        float f2 = displayMetrics.widthPixels * displayMetrics.heightPixels * 4;
        int round2 = Math.round(aVar.f5651e * f2);
        int round3 = Math.round(f2 * 2.0f);
        int i3 = round - i2;
        if (round3 + round2 <= i3) {
            this.f5645b = round3;
            this.a = round2;
        } else {
            float f3 = i3 / (aVar.f5651e + 2.0f);
            this.f5645b = Math.round(2.0f * f3);
            this.a = Math.round(f3 * aVar.f5651e);
        }
        if (Log.isLoggable("MemorySizeCalculator", 3)) {
            a(this.f5645b);
            a(this.a);
            a(i2);
            a(round);
            aVar.f5649c.getMemoryClass();
            aVar.f5649c.isLowRamDevice();
        }
    }

    public final String a(int i2) {
        return Formatter.formatFileSize(this.f5646c, i2);
    }
}
