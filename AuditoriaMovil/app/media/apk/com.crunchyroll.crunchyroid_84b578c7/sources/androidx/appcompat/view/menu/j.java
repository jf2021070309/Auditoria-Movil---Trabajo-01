package androidx.appcompat.view.menu;

import android.content.Context;
import android.os.Parcelable;
/* compiled from: MenuPresenter.java */
/* loaded from: classes.dex */
public interface j {

    /* compiled from: MenuPresenter.java */
    /* loaded from: classes.dex */
    public interface a {
        boolean a(f fVar);

        void onCloseMenu(f fVar, boolean z);
    }

    boolean collapseItemActionView(f fVar, h hVar);

    boolean expandItemActionView(f fVar, h hVar);

    boolean flagActionItems();

    int getId();

    void initForMenu(Context context, f fVar);

    void onCloseMenu(f fVar, boolean z);

    void onRestoreInstanceState(Parcelable parcelable);

    Parcelable onSaveInstanceState();

    boolean onSubMenuSelected(m mVar);

    void setCallback(a aVar);

    void updateMenuView(boolean z);
}
