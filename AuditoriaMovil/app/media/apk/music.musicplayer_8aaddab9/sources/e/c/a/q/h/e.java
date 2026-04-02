package e.c.a.q.h;

import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
/* loaded from: classes.dex */
public abstract class e<Z> extends i<ImageView, Z> {

    /* renamed from: c  reason: collision with root package name */
    public Animatable f6010c;

    public e(ImageView imageView) {
        super(imageView);
    }

    @Override // e.c.a.q.h.h
    public void b(Z z, e.c.a.q.i.b<? super Z> bVar) {
        j(z);
    }

    @Override // e.c.a.q.h.h
    public void d(Drawable drawable) {
        j(null);
        ((ImageView) this.a).setImageDrawable(drawable);
    }

    @Override // e.c.a.q.h.h
    public void e(Drawable drawable) {
        j(null);
        ((ImageView) this.a).setImageDrawable(drawable);
    }

    @Override // e.c.a.q.h.h
    public void g(Drawable drawable) {
        this.f6011b.a();
        Animatable animatable = this.f6010c;
        if (animatable != null) {
            animatable.stop();
        }
        j(null);
        ((ImageView) this.a).setImageDrawable(drawable);
    }

    public abstract void i(Z z);

    public final void j(Z z) {
        i(z);
        if (!(z instanceof Animatable)) {
            this.f6010c = null;
            return;
        }
        Animatable animatable = (Animatable) z;
        this.f6010c = animatable;
        animatable.start();
    }

    @Override // e.c.a.n.i
    public void onStart() {
        Animatable animatable = this.f6010c;
        if (animatable != null) {
            animatable.start();
        }
    }

    @Override // e.c.a.n.i
    public void onStop() {
        Animatable animatable = this.f6010c;
        if (animatable != null) {
            animatable.stop();
        }
    }
}
