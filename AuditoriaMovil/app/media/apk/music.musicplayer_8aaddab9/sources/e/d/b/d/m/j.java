package e.d.b.d.m;

import android.view.View;
/* loaded from: classes2.dex */
public class j implements View.OnClickListener {
    public final /* synthetic */ r a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ d f6436b;

    public j(d dVar, r rVar) {
        this.f6436b = dVar;
        this.a = rVar;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        int n1 = this.f6436b.c().n1() - 1;
        if (n1 >= 0) {
            this.f6436b.e(this.a.j(n1));
        }
    }
}
