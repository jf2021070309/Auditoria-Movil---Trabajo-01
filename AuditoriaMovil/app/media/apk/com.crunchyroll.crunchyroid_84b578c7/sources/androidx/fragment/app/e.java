package androidx.fragment.app;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.d;
import androidx.fragment.app.u;
import java.util.Objects;
/* compiled from: DefaultSpecialEffectsController.kt */
/* loaded from: classes.dex */
public final class e extends AnimatorListenerAdapter {
    public final /* synthetic */ d a;
    public final /* synthetic */ View b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ u.b d;
    public final /* synthetic */ d.a e;

    public e(d dVar, View view, boolean z, u.b bVar, d.a aVar) {
        this.a = dVar;
        this.b = view;
        this.c = z;
        this.d = bVar;
        this.e = aVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        com.amazon.aps.iva.yb0.j.f(animator, "anim");
        ViewGroup viewGroup = this.a.a;
        View view = this.b;
        viewGroup.endViewTransition(view);
        boolean z = this.c;
        u.b bVar = this.d;
        if (z) {
            u.b.EnumC0029b enumC0029b = bVar.a;
            com.amazon.aps.iva.yb0.j.e(view, "viewToAnimate");
            enumC0029b.applyState(view);
        }
        this.e.a();
        if (FragmentManager.H(2)) {
            Objects.toString(bVar);
        }
    }
}
