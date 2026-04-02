package c.m.b;

import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentManager;
import c.i.g.a;
import c.m.b.e;
import c.m.b.k0;
/* loaded from: classes.dex */
public class i implements a.InterfaceC0036a {
    public final /* synthetic */ View a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ ViewGroup f2365b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ e.b f2366c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ k0.d f2367d;

    public i(e eVar, View view, ViewGroup viewGroup, e.b bVar, k0.d dVar) {
        this.a = view;
        this.f2365b = viewGroup;
        this.f2366c = bVar;
        this.f2367d = dVar;
    }

    @Override // c.i.g.a.InterfaceC0036a
    public void a() {
        this.a.clearAnimation();
        this.f2365b.endViewTransition(this.a);
        this.f2366c.a();
        if (FragmentManager.L(2)) {
            StringBuilder y = e.a.d.a.a.y("Animation from operation ");
            y.append(this.f2367d);
            y.append(" has been cancelled.");
            y.toString();
        }
    }
}
