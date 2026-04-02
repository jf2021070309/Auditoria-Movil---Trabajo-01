package c.z;

import android.view.View;
import android.view.ViewGroup;
import music.musicplayer.R;
/* loaded from: classes.dex */
public class a0 extends l {
    public final /* synthetic */ ViewGroup a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ View f2850b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ View f2851c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ b0 f2852d;

    public a0(b0 b0Var, ViewGroup viewGroup, View view, View view2) {
        this.f2852d = b0Var;
        this.a = viewGroup;
        this.f2850b = view;
        this.f2851c = view2;
    }

    @Override // c.z.l, c.z.i.d
    public void b(i iVar) {
        this.a.getOverlay().remove(this.f2850b);
    }

    @Override // c.z.i.d
    public void c(i iVar) {
        this.f2851c.setTag(R.id.save_overlay_view, null);
        this.a.getOverlay().remove(this.f2850b);
        iVar.y(this);
    }

    @Override // c.z.l, c.z.i.d
    public void e(i iVar) {
        if (this.f2850b.getParent() == null) {
            this.a.getOverlay().add(this.f2850b);
        } else {
            this.f2852d.cancel();
        }
    }
}
