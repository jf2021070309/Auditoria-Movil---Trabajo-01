package e.d.b.d.m;

import android.view.View;
import e.d.b.d.m.d;
/* loaded from: classes2.dex */
public class h implements View.OnClickListener {
    public final /* synthetic */ d a;

    public h(d dVar) {
        this.a = dVar;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        d dVar = this.a;
        d.e eVar = dVar.f6423g;
        d.e eVar2 = d.e.YEAR;
        if (eVar == eVar2) {
            dVar.f(d.e.DAY);
        } else if (eVar == d.e.DAY) {
            dVar.f(eVar2);
        }
    }
}
