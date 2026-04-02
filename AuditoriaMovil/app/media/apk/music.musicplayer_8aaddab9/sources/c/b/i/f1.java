package c.b.i;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Build;
import java.lang.ref.WeakReference;
/* loaded from: classes.dex */
public class f1 extends Resources {
    public static boolean a;

    /* renamed from: b  reason: collision with root package name */
    public final WeakReference<Context> f1153b;

    public f1(Context context, Resources resources) {
        super(resources.getAssets(), resources.getDisplayMetrics(), resources.getConfiguration());
        this.f1153b = new WeakReference<>(context);
    }

    public static boolean a() {
        return a && Build.VERSION.SDK_INT <= 20;
    }

    public final Drawable b(int i2) {
        return super.getDrawable(i2);
    }

    @Override // android.content.res.Resources
    public Drawable getDrawable(int i2) throws Resources.NotFoundException {
        Drawable l2;
        Context context = this.f1153b.get();
        if (context != null) {
            q0 d2 = q0.d();
            synchronized (d2) {
                Drawable k2 = d2.k(context, i2);
                if (k2 == null) {
                    k2 = b(i2);
                }
                l2 = k2 != null ? d2.l(context, i2, false, k2) : null;
            }
            return l2;
        }
        return super.getDrawable(i2);
    }
}
