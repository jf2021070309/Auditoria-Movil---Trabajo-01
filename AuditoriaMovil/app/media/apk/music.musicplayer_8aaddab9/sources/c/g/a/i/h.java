package c.g.a.i;

import c.g.a.i.l.n;
import java.util.ArrayList;
/* loaded from: classes.dex */
public class h extends d implements g {
    public d[] r0 = new d[4];
    public int s0 = 0;

    public void W(ArrayList<n> arrayList, int i2, n nVar) {
        for (int i3 = 0; i3 < this.s0; i3++) {
            nVar.a(this.r0[i3]);
        }
        for (int i4 = 0; i4 < this.s0; i4++) {
            c.e.a.b(this.r0[i4], i2, arrayList, nVar);
        }
    }

    @Override // c.g.a.i.g
    public void a(e eVar) {
    }
}
