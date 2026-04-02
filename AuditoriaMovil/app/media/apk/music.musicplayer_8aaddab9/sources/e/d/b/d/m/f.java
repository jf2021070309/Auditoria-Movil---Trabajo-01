package e.d.b.d.m;

import android.view.View;
import music.musicplayer.R;
/* loaded from: classes2.dex */
public class f extends c.i.k.e {

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ d f6432d;

    public f(d dVar) {
        this.f6432d = dVar;
    }

    @Override // c.i.k.e
    public void d(View view, c.i.k.k0.b bVar) {
        this.f2148b.onInitializeAccessibilityNodeInfo(view, bVar.f2193b);
        bVar.k(this.f6432d.f6428l.getVisibility() == 0 ? this.f6432d.getString(R.string.mtrl_picker_toggle_to_year_selection) : this.f6432d.getString(R.string.mtrl_picker_toggle_to_day_selection));
    }
}
