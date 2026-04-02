package c.m.b;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentManager;
import c.m.b.e;
import c.m.b.k0;
/* loaded from: classes.dex */
public class f extends AnimatorListenerAdapter {
    public final /* synthetic */ ViewGroup a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ View f2346b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ boolean f2347c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ k0.d f2348d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ e.b f2349e;

    public f(e eVar, ViewGroup viewGroup, View view, boolean z, k0.d dVar, e.b bVar) {
        this.a = viewGroup;
        this.f2346b = view;
        this.f2347c = z;
        this.f2348d = dVar;
        this.f2349e = bVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(Animator animator) {
        this.a.endViewTransition(this.f2346b);
        if (this.f2347c) {
            this.f2348d.a.applyState(this.f2346b);
        }
        this.f2349e.a();
        if (FragmentManager.L(2)) {
            StringBuilder y = e.a.d.a.a.y("Animator from operation ");
            y.append(this.f2348d);
            y.append(" has ended.");
            y.toString();
        }
    }
}
