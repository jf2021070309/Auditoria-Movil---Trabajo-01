package c.m.b;

import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import androidx.fragment.app.FragmentManager;
import c.m.b.e;
import c.m.b.k0;
/* loaded from: classes.dex */
public class h implements Animation.AnimationListener {
    public final /* synthetic */ k0.d a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ ViewGroup f2362b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ View f2363c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ e.b f2364d;

    /* loaded from: classes.dex */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            h hVar = h.this;
            hVar.f2362b.endViewTransition(hVar.f2363c);
            h.this.f2364d.a();
        }
    }

    public h(e eVar, k0.d dVar, ViewGroup viewGroup, View view, e.b bVar) {
        this.a = dVar;
        this.f2362b = viewGroup;
        this.f2363c = view;
        this.f2364d = bVar;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public void onAnimationEnd(Animation animation) {
        this.f2362b.post(new a());
        if (FragmentManager.L(2)) {
            StringBuilder y = e.a.d.a.a.y("Animation from operation ");
            y.append(this.a);
            y.append(" has ended.");
            y.toString();
        }
    }

    @Override // android.view.animation.Animation.AnimationListener
    public void onAnimationRepeat(Animation animation) {
    }

    @Override // android.view.animation.Animation.AnimationListener
    public void onAnimationStart(Animation animation) {
        if (FragmentManager.L(2)) {
            StringBuilder y = e.a.d.a.a.y("Animation from operation ");
            y.append(this.a);
            y.append(" has reached onAnimationStart.");
            y.toString();
        }
    }
}
