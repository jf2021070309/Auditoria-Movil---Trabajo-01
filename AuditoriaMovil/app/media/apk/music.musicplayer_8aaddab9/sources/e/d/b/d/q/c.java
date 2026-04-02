package e.d.b.d.q;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import e.d.b.d.q.d;
/* loaded from: classes2.dex */
public class c extends AnimatorListenerAdapter {
    public final /* synthetic */ boolean a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ d.g f6480b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ d f6481c;

    public c(d dVar, boolean z, d.g gVar) {
        this.f6481c = dVar;
        this.a = z;
        this.f6480b = gVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(Animator animator) {
        d dVar = this.f6481c;
        dVar.u = 0;
        dVar.o = null;
        d.g gVar = this.f6480b;
        if (gVar != null) {
            a aVar = (a) gVar;
            aVar.a.b(aVar.f6476b);
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        this.f6481c.y.b(0, this.a);
        d dVar = this.f6481c;
        dVar.u = 2;
        dVar.o = animator;
    }
}
