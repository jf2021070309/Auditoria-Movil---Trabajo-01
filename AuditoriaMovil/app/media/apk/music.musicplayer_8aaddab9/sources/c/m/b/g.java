package c.m.b;

import android.animation.Animator;
import androidx.fragment.app.FragmentManager;
import c.i.g.a;
import c.m.b.k0;
/* loaded from: classes.dex */
public class g implements a.InterfaceC0036a {
    public final /* synthetic */ Animator a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ k0.d f2357b;

    public g(e eVar, Animator animator, k0.d dVar) {
        this.a = animator;
        this.f2357b = dVar;
    }

    @Override // c.i.g.a.InterfaceC0036a
    public void a() {
        this.a.end();
        if (FragmentManager.L(2)) {
            StringBuilder y = e.a.d.a.a.y("Animator from operation ");
            y.append(this.f2357b);
            y.append(" has been canceled.");
            y.toString();
        }
    }
}
