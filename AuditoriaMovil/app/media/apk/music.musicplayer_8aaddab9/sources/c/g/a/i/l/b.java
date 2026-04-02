package c.g.a.i.l;

import androidx.constraintlayout.widget.ConstraintLayout;
import c.g.a.i.d;
import java.util.ArrayList;
/* loaded from: classes.dex */
public class b {
    public final ArrayList<c.g.a.i.d> a = new ArrayList<>();

    /* renamed from: b  reason: collision with root package name */
    public a f1754b = new a();

    /* renamed from: c  reason: collision with root package name */
    public c.g.a.i.e f1755c;

    /* loaded from: classes.dex */
    public static class a {
        public d.a a;

        /* renamed from: b  reason: collision with root package name */
        public d.a f1756b;

        /* renamed from: c  reason: collision with root package name */
        public int f1757c;

        /* renamed from: d  reason: collision with root package name */
        public int f1758d;

        /* renamed from: e  reason: collision with root package name */
        public int f1759e;

        /* renamed from: f  reason: collision with root package name */
        public int f1760f;

        /* renamed from: g  reason: collision with root package name */
        public int f1761g;

        /* renamed from: h  reason: collision with root package name */
        public boolean f1762h;

        /* renamed from: i  reason: collision with root package name */
        public boolean f1763i;

        /* renamed from: j  reason: collision with root package name */
        public int f1764j;
    }

    /* renamed from: c.g.a.i.l.b$b  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public interface InterfaceC0029b {
    }

    public b(c.g.a.i.e eVar) {
        this.f1755c = eVar;
    }

    public final boolean a(InterfaceC0029b interfaceC0029b, c.g.a.i.d dVar, int i2) {
        this.f1754b.a = dVar.m();
        this.f1754b.f1756b = dVar.t();
        this.f1754b.f1757c = dVar.u();
        this.f1754b.f1758d = dVar.l();
        a aVar = this.f1754b;
        aVar.f1763i = false;
        aVar.f1764j = i2;
        d.a aVar2 = aVar.a;
        d.a aVar3 = d.a.MATCH_CONSTRAINT;
        boolean z = aVar2 == aVar3;
        boolean z2 = aVar.f1756b == aVar3;
        boolean z3 = z && dVar.Y > 0.0f;
        boolean z4 = z2 && dVar.Y > 0.0f;
        if (z3 && dVar.t[0] == 4) {
            aVar.a = d.a.FIXED;
        }
        if (z4 && dVar.t[1] == 4) {
            aVar.f1756b = d.a.FIXED;
        }
        ((ConstraintLayout.b) interfaceC0029b).b(dVar, aVar);
        dVar.T(this.f1754b.f1759e);
        dVar.O(this.f1754b.f1760f);
        a aVar4 = this.f1754b;
        dVar.E = aVar4.f1762h;
        dVar.L(aVar4.f1761g);
        a aVar5 = this.f1754b;
        aVar5.f1764j = 0;
        return aVar5.f1763i;
    }

    public final void b(c.g.a.i.e eVar, int i2, int i3, int i4) {
        int i5 = eVar.d0;
        int i6 = eVar.e0;
        eVar.R(0);
        eVar.Q(0);
        eVar.W = i3;
        int i7 = eVar.d0;
        if (i3 < i7) {
            eVar.W = i7;
        }
        eVar.X = i4;
        int i8 = eVar.e0;
        if (i4 < i8) {
            eVar.X = i8;
        }
        eVar.R(i5);
        eVar.Q(i6);
        c.g.a.i.e eVar2 = this.f1755c;
        eVar2.u0 = i2;
        eVar2.W();
    }

    public void c(c.g.a.i.e eVar) {
        this.a.clear();
        int size = eVar.r0.size();
        for (int i2 = 0; i2 < size; i2++) {
            c.g.a.i.d dVar = eVar.r0.get(i2);
            d.a m2 = dVar.m();
            d.a aVar = d.a.MATCH_CONSTRAINT;
            if (m2 == aVar || dVar.t() == aVar) {
                this.a.add(dVar);
            }
        }
        eVar.e0();
    }
}
