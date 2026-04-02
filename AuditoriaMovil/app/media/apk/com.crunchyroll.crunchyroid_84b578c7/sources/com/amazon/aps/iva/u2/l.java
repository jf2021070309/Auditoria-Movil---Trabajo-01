package com.amazon.aps.iva.u2;

import androidx.constraintlayout.widget.ConstraintLayout;
import com.amazon.aps.iva.u2.e;
import com.amazon.aps.iva.v2.b;
/* compiled from: VirtualLayout.java */
/* loaded from: classes.dex */
public class l extends j {
    public int u0 = 0;
    public int v0 = 0;
    public int w0 = 0;
    public int x0 = 0;
    public int y0 = 0;
    public int z0 = 0;
    public boolean A0 = false;
    public int B0 = 0;
    public int C0 = 0;
    public final b.a D0 = new b.a();
    public b.InterfaceC0780b E0 = null;

    public final void T(e eVar, e.b bVar, int i, e.b bVar2, int i2) {
        b.InterfaceC0780b interfaceC0780b;
        boolean z;
        e eVar2;
        while (true) {
            interfaceC0780b = this.E0;
            if (interfaceC0780b != null || (eVar2 = this.W) == null) {
                break;
            }
            this.E0 = ((f) eVar2).w0;
        }
        b.a aVar = this.D0;
        aVar.a = bVar;
        aVar.b = bVar2;
        aVar.c = i;
        aVar.d = i2;
        ((ConstraintLayout.c) interfaceC0780b).b(eVar, aVar);
        eVar.O(aVar.e);
        eVar.L(aVar.f);
        eVar.F = aVar.h;
        int i3 = aVar.g;
        eVar.d0 = i3;
        if (i3 > 0) {
            z = true;
        } else {
            z = false;
        }
        eVar.F = z;
    }

    @Override // com.amazon.aps.iva.u2.j, com.amazon.aps.iva.u2.i
    public final void a() {
        for (int i = 0; i < this.t0; i++) {
            e eVar = this.s0[i];
            if (eVar != null) {
                eVar.H = true;
            }
        }
    }

    public void S(int i, int i2, int i3, int i4) {
    }
}
