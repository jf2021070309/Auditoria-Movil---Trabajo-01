package c.b.i;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import java.lang.ref.WeakReference;
/* loaded from: classes.dex */
public class z0 extends r0 {

    /* renamed from: b  reason: collision with root package name */
    public final WeakReference<Context> f1286b;

    public z0(Context context, Resources resources) {
        super(resources);
        this.f1286b = new WeakReference<>(context);
    }

    @Override // android.content.res.Resources
    public Drawable getDrawable(int i2) throws Resources.NotFoundException {
        Drawable drawable = this.a.getDrawable(i2);
        Context context = this.f1286b.get();
        if (drawable != null && context != null) {
            q0.d().m(context, i2, drawable);
        }
        return drawable;
    }
}
