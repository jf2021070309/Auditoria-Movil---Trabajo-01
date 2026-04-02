package e.d.b.d.d;

import android.animation.ValueAnimator;
import android.graphics.drawable.Drawable;
import com.google.android.material.appbar.AppBarLayout;
import java.util.Objects;
/* loaded from: classes2.dex */
public class a implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ e.d.b.d.w.g a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ AppBarLayout f6339b;

    public a(AppBarLayout appBarLayout, e.d.b.d.w.g gVar) {
        this.f6339b = appBarLayout;
        this.a = gVar;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public void onAnimationUpdate(ValueAnimator valueAnimator) {
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        this.a.p(floatValue);
        Drawable drawable = this.f6339b.o;
        if (drawable instanceof e.d.b.d.w.g) {
            ((e.d.b.d.w.g) drawable).p(floatValue);
        }
        Objects.requireNonNull(this.f6339b);
        throw null;
    }
}
