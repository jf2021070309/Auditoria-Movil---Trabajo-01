package e.d.b.d.m;

import android.view.View;
/* loaded from: classes2.dex */
public class i implements View.OnClickListener {
    public final /* synthetic */ r a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ d f6435b;

    public i(d dVar, r rVar) {
        this.f6435b = dVar;
        this.a = rVar;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        int m1 = this.f6435b.c().m1() + 1;
        if (m1 < this.f6435b.f6426j.getAdapter().b()) {
            this.f6435b.e(this.a.j(m1));
        }
    }
}
