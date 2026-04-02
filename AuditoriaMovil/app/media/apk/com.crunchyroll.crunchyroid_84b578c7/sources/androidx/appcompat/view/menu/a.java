package androidx.appcompat.view.menu;

import android.content.Context;
import android.view.LayoutInflater;
import androidx.appcompat.view.menu.j;
import com.crunchyroll.crunchyroid.R;
/* compiled from: BaseMenuPresenter.java */
/* loaded from: classes.dex */
public abstract class a implements j {
    public final Context b;
    public Context c;
    public f d;
    public final LayoutInflater e;
    public j.a f;
    public final int g = R.layout.abc_action_menu_layout;
    public final int h = R.layout.abc_action_menu_item_layout;
    public k i;
    public int j;

    public a(Context context) {
        this.b = context;
        this.e = LayoutInflater.from(context);
    }

    @Override // androidx.appcompat.view.menu.j
    public final boolean collapseItemActionView(f fVar, h hVar) {
        return false;
    }

    @Override // androidx.appcompat.view.menu.j
    public final boolean expandItemActionView(f fVar, h hVar) {
        return false;
    }

    @Override // androidx.appcompat.view.menu.j
    public final int getId() {
        return this.j;
    }

    @Override // androidx.appcompat.view.menu.j
    public final void setCallback(j.a aVar) {
        this.f = aVar;
    }
}
