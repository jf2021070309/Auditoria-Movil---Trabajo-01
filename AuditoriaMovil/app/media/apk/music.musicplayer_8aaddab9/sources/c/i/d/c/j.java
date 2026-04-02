package c.i.d.c;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.util.SparseArray;
import android.util.TypedValue;
import java.util.Objects;
import java.util.WeakHashMap;
/* loaded from: classes.dex */
public final class j {
    public static final ThreadLocal<TypedValue> a = new ThreadLocal<>();

    /* renamed from: b  reason: collision with root package name */
    public static final WeakHashMap<b, SparseArray<a>> f2017b = new WeakHashMap<>(0);

    /* renamed from: c  reason: collision with root package name */
    public static final Object f2018c = new Object();

    /* loaded from: classes.dex */
    public static class a {
        public final ColorStateList a;

        /* renamed from: b  reason: collision with root package name */
        public final Configuration f2019b;

        public a(ColorStateList colorStateList, Configuration configuration) {
            this.a = colorStateList;
            this.f2019b = configuration;
        }
    }

    /* loaded from: classes.dex */
    public static final class b {
        public final Resources a;

        /* renamed from: b  reason: collision with root package name */
        public final Resources.Theme f2020b;

        public b(Resources resources, Resources.Theme theme) {
            this.a = resources;
            this.f2020b = theme;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || b.class != obj.getClass()) {
                return false;
            }
            b bVar = (b) obj;
            return this.a.equals(bVar.a) && Objects.equals(this.f2020b, bVar.f2020b);
        }

        public int hashCode() {
            return Objects.hash(this.a, this.f2020b);
        }
    }

    /* loaded from: classes.dex */
    public static abstract class c {

        /* loaded from: classes.dex */
        public class a implements Runnable {
            public final /* synthetic */ Typeface a;

            public a(Typeface typeface) {
                this.a = typeface;
            }

            @Override // java.lang.Runnable
            public void run() {
                c.this.e(this.a);
            }
        }

        /* loaded from: classes.dex */
        public class b implements Runnable {
            public final /* synthetic */ int a;

            public b(int i2) {
                this.a = i2;
            }

            @Override // java.lang.Runnable
            public void run() {
                c.this.d(this.a);
            }
        }

        public static Handler c(Handler handler) {
            return handler == null ? new Handler(Looper.getMainLooper()) : handler;
        }

        public final void a(int i2, Handler handler) {
            c(handler).post(new b(i2));
        }

        public final void b(Typeface typeface, Handler handler) {
            c(handler).post(new a(typeface));
        }

        public abstract void d(int i2);

        public abstract void e(Typeface typeface);
    }

    public static Drawable a(Resources resources, int i2, Resources.Theme theme) throws Resources.NotFoundException {
        return Build.VERSION.SDK_INT >= 21 ? resources.getDrawable(i2, theme) : resources.getDrawable(i2);
    }

    public static Typeface b(Context context, int i2) throws Resources.NotFoundException {
        if (context.isRestricted()) {
            return null;
        }
        return c(context, i2, new TypedValue(), 0, null, null, false, false);
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00bd A[ADDED_TO_REGION] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static android.graphics.Typeface c(android.content.Context r16, int r17, android.util.TypedValue r18, int r19, c.i.d.c.j.c r20, android.os.Handler r21, boolean r22, boolean r23) {
        /*
            Method dump skipped, instructions count: 268
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: c.i.d.c.j.c(android.content.Context, int, android.util.TypedValue, int, c.i.d.c.j$c, android.os.Handler, boolean, boolean):android.graphics.Typeface");
    }
}
