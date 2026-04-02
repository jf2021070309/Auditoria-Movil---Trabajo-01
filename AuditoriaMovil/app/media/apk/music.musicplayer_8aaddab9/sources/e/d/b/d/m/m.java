package e.d.b.d.m;

import android.view.View;
/* loaded from: classes2.dex */
public class m implements View.OnClickListener {
    public final /* synthetic */ l a;

    public m(l lVar) {
        this.a = lVar;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        l lVar = this.a;
        lVar.r.setEnabled(lVar.b().B());
        this.a.p.toggle();
        l lVar2 = this.a;
        lVar2.h(lVar2.p);
        this.a.f();
    }
}
