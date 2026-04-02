package androidx.appcompat.view.menu;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import androidx.appcompat.view.menu.f;
/* compiled from: SubMenuBuilder.java */
/* loaded from: classes.dex */
public class m extends f implements SubMenu {
    private h mItem;
    private f mParentMenu;

    public m(Context context, f fVar, h hVar) {
        super(context);
        this.mParentMenu = fVar;
        this.mItem = hVar;
    }

    @Override // androidx.appcompat.view.menu.f
    public boolean collapseItemActionView(h hVar) {
        return this.mParentMenu.collapseItemActionView(hVar);
    }

    @Override // androidx.appcompat.view.menu.f
    public boolean dispatchMenuItemSelected(f fVar, MenuItem menuItem) {
        if (!super.dispatchMenuItemSelected(fVar, menuItem) && !this.mParentMenu.dispatchMenuItemSelected(fVar, menuItem)) {
            return false;
        }
        return true;
    }

    @Override // androidx.appcompat.view.menu.f
    public boolean expandItemActionView(h hVar) {
        return this.mParentMenu.expandItemActionView(hVar);
    }

    @Override // androidx.appcompat.view.menu.f
    public String getActionViewStatesKey() {
        int i;
        h hVar = this.mItem;
        if (hVar != null) {
            i = hVar.a;
        } else {
            i = 0;
        }
        if (i == 0) {
            return null;
        }
        return super.getActionViewStatesKey() + ":" + i;
    }

    @Override // android.view.SubMenu
    public MenuItem getItem() {
        return this.mItem;
    }

    public Menu getParentMenu() {
        return this.mParentMenu;
    }

    @Override // androidx.appcompat.view.menu.f
    public f getRootMenu() {
        return this.mParentMenu.getRootMenu();
    }

    @Override // androidx.appcompat.view.menu.f
    public boolean isGroupDividerEnabled() {
        return this.mParentMenu.isGroupDividerEnabled();
    }

    @Override // androidx.appcompat.view.menu.f
    public boolean isQwertyMode() {
        return this.mParentMenu.isQwertyMode();
    }

    @Override // androidx.appcompat.view.menu.f
    public boolean isShortcutsVisible() {
        return this.mParentMenu.isShortcutsVisible();
    }

    @Override // androidx.appcompat.view.menu.f
    public void setCallback(f.a aVar) {
        this.mParentMenu.setCallback(aVar);
    }

    @Override // androidx.appcompat.view.menu.f, android.view.Menu
    public void setGroupDividerEnabled(boolean z) {
        this.mParentMenu.setGroupDividerEnabled(z);
    }

    @Override // android.view.SubMenu
    public SubMenu setHeaderIcon(Drawable drawable) {
        return (SubMenu) super.setHeaderIconInt(drawable);
    }

    @Override // android.view.SubMenu
    public SubMenu setHeaderTitle(CharSequence charSequence) {
        return (SubMenu) super.setHeaderTitleInt(charSequence);
    }

    @Override // android.view.SubMenu
    public SubMenu setHeaderView(View view) {
        return (SubMenu) super.setHeaderViewInt(view);
    }

    @Override // android.view.SubMenu
    public SubMenu setIcon(Drawable drawable) {
        this.mItem.setIcon(drawable);
        return this;
    }

    @Override // androidx.appcompat.view.menu.f, android.view.Menu
    public void setQwertyMode(boolean z) {
        this.mParentMenu.setQwertyMode(z);
    }

    @Override // androidx.appcompat.view.menu.f
    public void setShortcutsVisible(boolean z) {
        this.mParentMenu.setShortcutsVisible(z);
    }

    @Override // android.view.SubMenu
    public SubMenu setHeaderIcon(int i) {
        return (SubMenu) super.setHeaderIconInt(i);
    }

    @Override // android.view.SubMenu
    public SubMenu setHeaderTitle(int i) {
        return (SubMenu) super.setHeaderTitleInt(i);
    }

    @Override // android.view.SubMenu
    public SubMenu setIcon(int i) {
        this.mItem.setIcon(i);
        return this;
    }
}
