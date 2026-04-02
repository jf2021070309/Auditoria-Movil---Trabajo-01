package e.d.b.d.q;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import e.d.b.d.q.d;
/* loaded from: classes2.dex */
public class b extends AnimatorListenerAdapter {
    public boolean a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ boolean f6477b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ d.g f6478c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ d f6479d;

    public b(d dVar, boolean z, d.g gVar) {
        this.f6479d = dVar;
        this.f6477b = z;
        this.f6478c = gVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(Animator animator) {
        this.a = true;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(Animator animator) {
        d dVar = this.f6479d;
        dVar.u = 0;
        dVar.o = null;
        if (this.a) {
            return;
        }
        FloatingActionButton floatingActionButton = dVar.y;
        boolean z = this.f6477b;
        floatingActionButton.b(z ? 8 : 4, z);
        d.g gVar = this.f6478c;
        if (gVar != null) {
            a aVar = (a) gVar;
            aVar.a.a(aVar.f6476b);
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        this.f6479d.y.b(0, this.f6477b);
        d dVar = this.f6479d;
        dVar.u = 1;
        dVar.o = animator;
        this.a = false;
    }
}
