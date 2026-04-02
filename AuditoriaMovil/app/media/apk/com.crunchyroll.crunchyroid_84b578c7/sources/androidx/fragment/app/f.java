package androidx.fragment.app;

import android.view.View;
import android.view.animation.Animation;
import androidx.fragment.app.d;
import androidx.fragment.app.u;
import java.util.Objects;
/* compiled from: DefaultSpecialEffectsController.kt */
/* loaded from: classes.dex */
public final class f implements Animation.AnimationListener {
    public final /* synthetic */ u.b a;
    public final /* synthetic */ d b;
    public final /* synthetic */ View c;
    public final /* synthetic */ d.a d;

    public f(View view, d.a aVar, d dVar, u.b bVar) {
        this.a = bVar;
        this.b = dVar;
        this.c = view;
        this.d = aVar;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationEnd(Animation animation) {
        com.amazon.aps.iva.yb0.j.f(animation, "animation");
        d dVar = this.b;
        dVar.a.post(new com.amazon.aps.iva.n4.h(dVar, 0, this.c, this.d));
        if (FragmentManager.H(2)) {
            Objects.toString(this.a);
        }
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationRepeat(Animation animation) {
        com.amazon.aps.iva.yb0.j.f(animation, "animation");
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationStart(Animation animation) {
        com.amazon.aps.iva.yb0.j.f(animation, "animation");
        if (FragmentManager.H(2)) {
            Objects.toString(this.a);
        }
    }
}
