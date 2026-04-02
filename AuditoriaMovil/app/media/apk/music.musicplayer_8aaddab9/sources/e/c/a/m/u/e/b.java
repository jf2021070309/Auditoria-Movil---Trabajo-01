package e.c.a.m.u.e;

import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import e.c.a.m.s.s;
import e.c.a.m.s.w;
import java.util.Objects;
/* loaded from: classes.dex */
public abstract class b<T extends Drawable> implements w<T>, s {
    public final T a;

    public b(T t) {
        Objects.requireNonNull(t, "Argument must not be null");
        this.a = t;
    }

    @Override // e.c.a.m.s.w
    public Object get() {
        Drawable.ConstantState constantState = this.a.getConstantState();
        return constantState == null ? this.a : constantState.newDrawable();
    }

    @Override // e.c.a.m.s.s
    public void initialize() {
        T t = this.a;
        if (t instanceof BitmapDrawable) {
            ((BitmapDrawable) t).getBitmap().prepareToDraw();
        } else if (t instanceof e.c.a.m.u.g.c) {
            ((e.c.a.m.u.g.c) t).b().prepareToDraw();
        }
    }
}
