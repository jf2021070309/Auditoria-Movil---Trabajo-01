package e.d.b.d.d;

import android.view.View;
import c.i.k.d0;
/* loaded from: classes2.dex */
public class h {
    public final View a;

    /* renamed from: b  reason: collision with root package name */
    public int f6361b;

    /* renamed from: c  reason: collision with root package name */
    public int f6362c;

    /* renamed from: d  reason: collision with root package name */
    public int f6363d;

    /* renamed from: e  reason: collision with root package name */
    public int f6364e;

    public h(View view) {
        this.a = view;
    }

    public void a() {
        View view = this.a;
        d0.s(view, this.f6363d - (view.getTop() - this.f6361b));
        View view2 = this.a;
        d0.r(view2, this.f6364e - (view2.getLeft() - this.f6362c));
    }
}
