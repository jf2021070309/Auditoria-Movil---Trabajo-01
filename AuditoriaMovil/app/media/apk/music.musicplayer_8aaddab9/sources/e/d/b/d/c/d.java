package e.d.b.d.c;

import android.graphics.drawable.Drawable;
import android.util.Property;
import java.util.WeakHashMap;
/* loaded from: classes2.dex */
public class d extends Property<Drawable, Integer> {
    public static final Property<Drawable, Integer> a = new d();

    /* renamed from: b  reason: collision with root package name */
    public final WeakHashMap<Drawable, Integer> f6331b;

    public d() {
        super(Integer.class, "drawableAlphaCompat");
        this.f6331b = new WeakHashMap<>();
    }

    @Override // android.util.Property
    public Integer get(Drawable drawable) {
        return Integer.valueOf(drawable.getAlpha());
    }

    @Override // android.util.Property
    public void set(Drawable drawable, Integer num) {
        drawable.setAlpha(num.intValue());
    }
}
