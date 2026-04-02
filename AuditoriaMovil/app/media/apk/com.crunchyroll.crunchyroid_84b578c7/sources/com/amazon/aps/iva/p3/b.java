package com.amazon.aps.iva.p3;

import android.content.Context;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
/* compiled from: ActionProvider.java */
/* loaded from: classes.dex */
public abstract class b {
    private static final String TAG = "ActionProvider(support)";
    private final Context mContext;
    private a mSubUiVisibilityListener;
    private InterfaceC0598b mVisibilityListener;

    /* compiled from: ActionProvider.java */
    /* loaded from: classes.dex */
    public interface a {
    }

    /* compiled from: ActionProvider.java */
    /* renamed from: com.amazon.aps.iva.p3.b$b  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public interface InterfaceC0598b {
    }

    public b(Context context) {
        this.mContext = context;
    }

    public Context getContext() {
        return this.mContext;
    }

    public boolean hasSubMenu() {
        return false;
    }

    public boolean isVisible() {
        return true;
    }

    public abstract View onCreateActionView();

    public View onCreateActionView(MenuItem menuItem) {
        return onCreateActionView();
    }

    public boolean onPerformDefaultAction() {
        return false;
    }

    public boolean overridesItemVisibility() {
        return false;
    }

    public void refreshVisibility() {
        if (this.mVisibilityListener != null && overridesItemVisibility()) {
            InterfaceC0598b interfaceC0598b = this.mVisibilityListener;
            isVisible();
            androidx.appcompat.view.menu.h hVar = androidx.appcompat.view.menu.h.this;
            hVar.n.onItemVisibleChanged(hVar);
        }
    }

    public void reset() {
        this.mVisibilityListener = null;
        this.mSubUiVisibilityListener = null;
    }

    public void setSubUiVisibilityListener(a aVar) {
        this.mSubUiVisibilityListener = aVar;
    }

    public void setVisibilityListener(InterfaceC0598b interfaceC0598b) {
        InterfaceC0598b interfaceC0598b2 = this.mVisibilityListener;
        this.mVisibilityListener = interfaceC0598b;
    }

    public void subUiVisibilityChanged(boolean z) {
        a aVar = this.mSubUiVisibilityListener;
        if (aVar != null) {
            ((androidx.appcompat.widget.a) aVar).d(z);
        }
    }

    public void onPrepareSubMenu(SubMenu subMenu) {
    }
}
