package c.g.a.i;

import java.util.ArrayList;
/* loaded from: classes.dex */
public class k extends d {
    public ArrayList<d> r0 = new ArrayList<>();

    @Override // c.g.a.i.d
    public void G() {
        this.r0.clear();
        super.G();
    }

    @Override // c.g.a.i.d
    public void I(c.g.a.c cVar) {
        super.I(cVar);
        int size = this.r0.size();
        for (int i2 = 0; i2 < size; i2++) {
            this.r0.get(i2).I(cVar);
        }
    }

    public void W() {
        ArrayList<d> arrayList = this.r0;
        if (arrayList == null) {
            return;
        }
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            d dVar = this.r0.get(i2);
            if (dVar instanceof k) {
                ((k) dVar).W();
            }
        }
    }
}
