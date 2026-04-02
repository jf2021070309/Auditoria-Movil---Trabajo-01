package e.d.b.d.f;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import androidx.appcompat.widget.ActionMenuView;
import com.google.android.material.bottomappbar.BottomAppBar;
import java.util.Objects;
/* loaded from: classes2.dex */
public class d extends AnimatorListenerAdapter {
    public boolean a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ ActionMenuView f6366b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ int f6367c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ boolean f6368d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ BottomAppBar f6369e;

    public d(BottomAppBar bottomAppBar, ActionMenuView actionMenuView, int i2, boolean z) {
        this.f6369e = bottomAppBar;
        this.f6366b = actionMenuView;
        this.f6367c = i2;
        this.f6368d = z;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(Animator animator) {
        this.a = true;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(Animator animator) {
        if (this.a) {
            return;
        }
        BottomAppBar bottomAppBar = this.f6369e;
        int i2 = bottomAppBar.e0;
        boolean z = i2 != 0;
        if (i2 != 0) {
            bottomAppBar.e0 = 0;
            bottomAppBar.getMenu().clear();
            bottomAppBar.n(i2);
        }
        BottomAppBar bottomAppBar2 = this.f6369e;
        ActionMenuView actionMenuView = this.f6366b;
        int i3 = this.f6367c;
        boolean z2 = this.f6368d;
        Objects.requireNonNull(bottomAppBar2);
        e eVar = new e(bottomAppBar2, actionMenuView, i3, z2);
        if (z) {
            actionMenuView.post(eVar);
        } else {
            eVar.run();
        }
    }
}
