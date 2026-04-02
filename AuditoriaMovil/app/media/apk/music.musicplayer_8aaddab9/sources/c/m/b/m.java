package c.m.b;

import androidx.fragment.app.FragmentManager;
import c.m.b.e;
import c.m.b.k0;
/* loaded from: classes.dex */
public class m implements Runnable {
    public final /* synthetic */ e.d a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ k0.d f2389b;

    public m(e eVar, e.d dVar, k0.d dVar2) {
        this.a = dVar;
        this.f2389b = dVar2;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.a.a();
        if (FragmentManager.L(2)) {
            StringBuilder y = e.a.d.a.a.y("Transition for operation ");
            y.append(this.f2389b);
            y.append("has completed");
            y.toString();
        }
    }
}
