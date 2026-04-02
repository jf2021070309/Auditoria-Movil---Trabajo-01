package c.i.h;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.pm.PackageManager;
import android.graphics.Typeface;
import java.util.ArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
/* loaded from: classes.dex */
public class j {
    public static final c.f.f<String, Typeface> a = new c.f.f<>(16);

    /* renamed from: b  reason: collision with root package name */
    public static final ExecutorService f2089b;

    /* renamed from: c  reason: collision with root package name */
    public static final Object f2090c;

    /* renamed from: d  reason: collision with root package name */
    public static final c.f.h<String, ArrayList<c.i.j.a<a>>> f2091d;

    /* loaded from: classes.dex */
    public static final class a {
        public final Typeface a;

        /* renamed from: b  reason: collision with root package name */
        public final int f2092b;

        public a(int i2) {
            this.a = null;
            this.f2092b = i2;
        }

        @SuppressLint({"WrongConstant"})
        public a(Typeface typeface) {
            this.a = typeface;
            this.f2092b = 0;
        }
    }

    static {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 10000, TimeUnit.MILLISECONDS, new LinkedBlockingDeque(), new n("fonts-androidx", 10));
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        f2089b = threadPoolExecutor;
        f2090c = new Object();
        f2091d = new c.f.h<>();
    }

    public static a a(String str, Context context, e eVar, int i2) {
        int i3;
        Typeface typeface = a.get(str);
        if (typeface != null) {
            return new a(typeface);
        }
        try {
            k a2 = d.a(context, eVar, null);
            int i4 = a2.a;
            int i5 = 1;
            if (i4 != 0) {
                if (i4 == 1) {
                    i3 = -2;
                }
                i3 = -3;
            } else {
                l[] lVarArr = a2.f2093b;
                if (lVarArr != null && lVarArr.length != 0) {
                    for (l lVar : lVarArr) {
                        int i6 = lVar.f2097e;
                        if (i6 != 0) {
                            if (i6 >= 0) {
                                i3 = i6;
                            }
                            i3 = -3;
                        }
                    }
                    i5 = 0;
                }
                i3 = i5;
            }
            if (i3 != 0) {
                return new a(i3);
            }
            Typeface b2 = c.i.e.e.a.b(context, null, a2.f2093b, i2);
            if (b2 != null) {
                a.put(str, b2);
                return new a(b2);
            }
            return new a(-3);
        } catch (PackageManager.NameNotFoundException unused) {
            return new a(-1);
        }
    }
}
