package c.b.h.i;

import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.ActionProvider;
import android.view.ContextMenu;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
/* loaded from: classes.dex */
public class a implements c.i.f.a.b {
    public CharSequence a;

    /* renamed from: b  reason: collision with root package name */
    public CharSequence f949b;

    /* renamed from: c  reason: collision with root package name */
    public Intent f950c;

    /* renamed from: d  reason: collision with root package name */
    public char f951d;

    /* renamed from: f  reason: collision with root package name */
    public char f953f;

    /* renamed from: h  reason: collision with root package name */
    public Drawable f955h;

    /* renamed from: i  reason: collision with root package name */
    public Context f956i;

    /* renamed from: j  reason: collision with root package name */
    public CharSequence f957j;

    /* renamed from: k  reason: collision with root package name */
    public CharSequence f958k;

    /* renamed from: e  reason: collision with root package name */
    public int f952e = 4096;

    /* renamed from: g  reason: collision with root package name */
    public int f954g = 4096;

    /* renamed from: l  reason: collision with root package name */
    public ColorStateList f959l = null;

    /* renamed from: m  reason: collision with root package name */
    public PorterDuff.Mode f960m = null;

    /* renamed from: n  reason: collision with root package name */
    public boolean f961n = false;
    public boolean o = false;
    public int p = 16;

    public a(Context context, int i2, int i3, int i4, CharSequence charSequence) {
        this.f956i = context;
        this.a = charSequence;
    }

    @Override // c.i.f.a.b
    public c.i.f.a.b a(c.i.k.f fVar) {
        throw new UnsupportedOperationException();
    }

    @Override // c.i.f.a.b
    public c.i.k.f b() {
        return null;
    }

    public final void c() {
        Drawable drawable = this.f955h;
        if (drawable != null) {
            if (this.f961n || this.o) {
                Drawable q0 = c.i.a.q0(drawable);
                this.f955h = q0;
                Drawable mutate = q0.mutate();
                this.f955h = mutate;
                if (this.f961n) {
                    c.i.a.j0(mutate, this.f959l);
                }
                if (this.o) {
                    c.i.a.k0(this.f955h, this.f960m);
                }
            }
        }
    }

    @Override // c.i.f.a.b, android.view.MenuItem
    public boolean collapseActionView() {
        return false;
    }

    @Override // c.i.f.a.b, android.view.MenuItem
    public boolean expandActionView() {
        return false;
    }

    @Override // android.view.MenuItem
    public ActionProvider getActionProvider() {
        throw new UnsupportedOperationException();
    }

    @Override // c.i.f.a.b, android.view.MenuItem
    public View getActionView() {
        return null;
    }

    @Override // c.i.f.a.b, android.view.MenuItem
    public int getAlphabeticModifiers() {
        return this.f954g;
    }

    @Override // android.view.MenuItem
    public char getAlphabeticShortcut() {
        return this.f953f;
    }

    @Override // c.i.f.a.b, android.view.MenuItem
    public CharSequence getContentDescription() {
        return this.f957j;
    }

    @Override // android.view.MenuItem
    public int getGroupId() {
        return 0;
    }

    @Override // android.view.MenuItem
    public Drawable getIcon() {
        return this.f955h;
    }

    @Override // c.i.f.a.b, android.view.MenuItem
    public ColorStateList getIconTintList() {
        return this.f959l;
    }

    @Override // c.i.f.a.b, android.view.MenuItem
    public PorterDuff.Mode getIconTintMode() {
        return this.f960m;
    }

    @Override // android.view.MenuItem
    public Intent getIntent() {
        return this.f950c;
    }

    @Override // android.view.MenuItem
    public int getItemId() {
        return 16908332;
    }

    @Override // android.view.MenuItem
    public ContextMenu.ContextMenuInfo getMenuInfo() {
        return null;
    }

    @Override // c.i.f.a.b, android.view.MenuItem
    public int getNumericModifiers() {
        return this.f952e;
    }

    @Override // android.view.MenuItem
    public char getNumericShortcut() {
        return this.f951d;
    }

    @Override // android.view.MenuItem
    public int getOrder() {
        return 0;
    }

    @Override // android.view.MenuItem
    public SubMenu getSubMenu() {
        return null;
    }

    @Override // android.view.MenuItem
    public CharSequence getTitle() {
        return this.a;
    }

    @Override // android.view.MenuItem
    public CharSequence getTitleCondensed() {
        CharSequence charSequence = this.f949b;
        return charSequence != null ? charSequence : this.a;
    }

    @Override // c.i.f.a.b, android.view.MenuItem
    public CharSequence getTooltipText() {
        return this.f958k;
    }

    @Override // android.view.MenuItem
    public boolean hasSubMenu() {
        return false;
    }

    @Override // c.i.f.a.b, android.view.MenuItem
    public boolean isActionViewExpanded() {
        return false;
    }

    @Override // android.view.MenuItem
    public boolean isCheckable() {
        return (this.p & 1) != 0;
    }

    @Override // android.view.MenuItem
    public boolean isChecked() {
        return (this.p & 2) != 0;
    }

    @Override // android.view.MenuItem
    public boolean isEnabled() {
        return (this.p & 16) != 0;
    }

    @Override // android.view.MenuItem
    public boolean isVisible() {
        return (this.p & 8) == 0;
    }

    @Override // android.view.MenuItem
    public MenuItem setActionProvider(ActionProvider actionProvider) {
        throw new UnsupportedOperationException();
    }

    @Override // c.i.f.a.b, android.view.MenuItem
    public MenuItem setActionView(int i2) {
        throw new UnsupportedOperationException();
    }

    @Override // c.i.f.a.b, android.view.MenuItem
    public MenuItem setActionView(View view) {
        throw new UnsupportedOperationException();
    }

    @Override // android.view.MenuItem
    public MenuItem setAlphabeticShortcut(char c2) {
        this.f953f = Character.toLowerCase(c2);
        return this;
    }

    @Override // c.i.f.a.b, android.view.MenuItem
    public MenuItem setAlphabeticShortcut(char c2, int i2) {
        this.f953f = Character.toLowerCase(c2);
        this.f954g = KeyEvent.normalizeMetaState(i2);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setCheckable(boolean z) {
        this.p = (z ? 1 : 0) | (this.p & (-2));
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setChecked(boolean z) {
        this.p = (z ? 2 : 0) | (this.p & (-3));
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setContentDescription(CharSequence charSequence) {
        this.f957j = charSequence;
        return this;
    }

    @Override // c.i.f.a.b, android.view.MenuItem
    public c.i.f.a.b setContentDescription(CharSequence charSequence) {
        this.f957j = charSequence;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setEnabled(boolean z) {
        this.p = (z ? 16 : 0) | (this.p & (-17));
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIcon(int i2) {
        this.f955h = c.i.d.a.c(this.f956i, i2);
        c();
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIcon(Drawable drawable) {
        this.f955h = drawable;
        c();
        return this;
    }

    @Override // c.i.f.a.b, android.view.MenuItem
    public MenuItem setIconTintList(ColorStateList colorStateList) {
        this.f959l = colorStateList;
        this.f961n = true;
        c();
        return this;
    }

    @Override // c.i.f.a.b, android.view.MenuItem
    public MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.f960m = mode;
        this.o = true;
        c();
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIntent(Intent intent) {
        this.f950c = intent;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setNumericShortcut(char c2) {
        this.f951d = c2;
        return this;
    }

    @Override // c.i.f.a.b, android.view.MenuItem
    public MenuItem setNumericShortcut(char c2, int i2) {
        this.f951d = c2;
        this.f952e = KeyEvent.normalizeMetaState(i2);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        throw new UnsupportedOperationException();
    }

    @Override // android.view.MenuItem
    public MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setShortcut(char c2, char c3) {
        this.f951d = c2;
        this.f953f = Character.toLowerCase(c3);
        return this;
    }

    @Override // c.i.f.a.b, android.view.MenuItem
    public MenuItem setShortcut(char c2, char c3, int i2, int i3) {
        this.f951d = c2;
        this.f952e = KeyEvent.normalizeMetaState(i2);
        this.f953f = Character.toLowerCase(c3);
        this.f954g = KeyEvent.normalizeMetaState(i3);
        return this;
    }

    @Override // c.i.f.a.b, android.view.MenuItem
    public void setShowAsAction(int i2) {
    }

    @Override // c.i.f.a.b, android.view.MenuItem
    public MenuItem setShowAsActionFlags(int i2) {
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTitle(int i2) {
        this.a = this.f956i.getResources().getString(i2);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTitle(CharSequence charSequence) {
        this.a = charSequence;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTitleCondensed(CharSequence charSequence) {
        this.f949b = charSequence;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTooltipText(CharSequence charSequence) {
        this.f958k = charSequence;
        return this;
    }

    @Override // c.i.f.a.b, android.view.MenuItem
    public c.i.f.a.b setTooltipText(CharSequence charSequence) {
        this.f958k = charSequence;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setVisible(boolean z) {
        this.p = (this.p & 8) | (z ? 0 : 8);
        return this;
    }
}
