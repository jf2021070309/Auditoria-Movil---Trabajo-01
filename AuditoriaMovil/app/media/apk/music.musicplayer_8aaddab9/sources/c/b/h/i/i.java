package c.b.h.i;

import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.ActionProvider;
import android.view.ContextMenu;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.view.ViewDebug;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import c.i.k.f;
import java.util.Objects;
/* loaded from: classes.dex */
public final class i implements c.i.f.a.b {
    public c.i.k.f A;
    public MenuItem.OnActionExpandListener B;
    public ContextMenu.ContextMenuInfo D;
    public final int a;

    /* renamed from: b  reason: collision with root package name */
    public final int f1015b;

    /* renamed from: c  reason: collision with root package name */
    public final int f1016c;

    /* renamed from: d  reason: collision with root package name */
    public final int f1017d;

    /* renamed from: e  reason: collision with root package name */
    public CharSequence f1018e;

    /* renamed from: f  reason: collision with root package name */
    public CharSequence f1019f;

    /* renamed from: g  reason: collision with root package name */
    public Intent f1020g;

    /* renamed from: h  reason: collision with root package name */
    public char f1021h;

    /* renamed from: j  reason: collision with root package name */
    public char f1023j;

    /* renamed from: l  reason: collision with root package name */
    public Drawable f1025l;

    /* renamed from: n  reason: collision with root package name */
    public g f1027n;
    public r o;
    public MenuItem.OnMenuItemClickListener p;
    public CharSequence q;
    public CharSequence r;
    public int y;
    public View z;

    /* renamed from: i  reason: collision with root package name */
    public int f1022i = 4096;

    /* renamed from: k  reason: collision with root package name */
    public int f1024k = 4096;

    /* renamed from: m  reason: collision with root package name */
    public int f1026m = 0;
    public ColorStateList s = null;
    public PorterDuff.Mode t = null;
    public boolean u = false;
    public boolean v = false;
    public boolean w = false;
    public int x = 16;
    public boolean C = false;

    /* loaded from: classes.dex */
    public class a implements f.a {
        public a() {
        }
    }

    public i(g gVar, int i2, int i3, int i4, int i5, CharSequence charSequence, int i6) {
        this.y = 0;
        this.f1027n = gVar;
        this.a = i3;
        this.f1015b = i2;
        this.f1016c = i4;
        this.f1017d = i5;
        this.f1018e = charSequence;
        this.y = i6;
    }

    public static void c(StringBuilder sb, int i2, int i3, String str) {
        if ((i2 & i3) == i3) {
            sb.append(str);
        }
    }

    @Override // c.i.f.a.b
    public c.i.f.a.b a(c.i.k.f fVar) {
        c.i.k.f fVar2 = this.A;
        if (fVar2 != null) {
            fVar2.a = null;
        }
        this.z = null;
        this.A = fVar;
        this.f1027n.q(true);
        c.i.k.f fVar3 = this.A;
        if (fVar3 != null) {
            fVar3.h(new a());
        }
        return this;
    }

    @Override // c.i.f.a.b
    public c.i.k.f b() {
        return this.A;
    }

    @Override // c.i.f.a.b, android.view.MenuItem
    public boolean collapseActionView() {
        if ((this.y & 8) == 0) {
            return false;
        }
        if (this.z == null) {
            return true;
        }
        MenuItem.OnActionExpandListener onActionExpandListener = this.B;
        if (onActionExpandListener == null || onActionExpandListener.onMenuItemActionCollapse(this)) {
            return this.f1027n.d(this);
        }
        return false;
    }

    public final Drawable d(Drawable drawable) {
        if (drawable != null && this.w && (this.u || this.v)) {
            drawable = c.i.a.q0(drawable).mutate();
            if (this.u) {
                c.i.a.j0(drawable, this.s);
            }
            if (this.v) {
                c.i.a.k0(drawable, this.t);
            }
            this.w = false;
        }
        return drawable;
    }

    public char e() {
        return this.f1027n.n() ? this.f1023j : this.f1021h;
    }

    @Override // c.i.f.a.b, android.view.MenuItem
    public boolean expandActionView() {
        if (f()) {
            MenuItem.OnActionExpandListener onActionExpandListener = this.B;
            if (onActionExpandListener == null || onActionExpandListener.onMenuItemActionExpand(this)) {
                return this.f1027n.f(this);
            }
            return false;
        }
        return false;
    }

    public boolean f() {
        c.i.k.f fVar;
        if ((this.y & 8) != 0) {
            if (this.z == null && (fVar = this.A) != null) {
                this.z = fVar.d(this);
            }
            return this.z != null;
        }
        return false;
    }

    public boolean g() {
        return (this.x & 32) == 32;
    }

    @Override // android.view.MenuItem
    public ActionProvider getActionProvider() {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.getActionProvider()");
    }

    @Override // c.i.f.a.b, android.view.MenuItem
    public View getActionView() {
        View view = this.z;
        if (view != null) {
            return view;
        }
        c.i.k.f fVar = this.A;
        if (fVar != null) {
            View d2 = fVar.d(this);
            this.z = d2;
            return d2;
        }
        return null;
    }

    @Override // c.i.f.a.b, android.view.MenuItem
    public int getAlphabeticModifiers() {
        return this.f1024k;
    }

    @Override // android.view.MenuItem
    public char getAlphabeticShortcut() {
        return this.f1023j;
    }

    @Override // c.i.f.a.b, android.view.MenuItem
    public CharSequence getContentDescription() {
        return this.q;
    }

    @Override // android.view.MenuItem
    public int getGroupId() {
        return this.f1015b;
    }

    @Override // android.view.MenuItem
    public Drawable getIcon() {
        Drawable drawable = this.f1025l;
        if (drawable != null) {
            return d(drawable);
        }
        int i2 = this.f1026m;
        if (i2 != 0) {
            Drawable b2 = c.b.d.a.a.b(this.f1027n.f1000b, i2);
            this.f1026m = 0;
            this.f1025l = b2;
            return d(b2);
        }
        return null;
    }

    @Override // c.i.f.a.b, android.view.MenuItem
    public ColorStateList getIconTintList() {
        return this.s;
    }

    @Override // c.i.f.a.b, android.view.MenuItem
    public PorterDuff.Mode getIconTintMode() {
        return this.t;
    }

    @Override // android.view.MenuItem
    public Intent getIntent() {
        return this.f1020g;
    }

    @Override // android.view.MenuItem
    @ViewDebug.CapturedViewProperty
    public int getItemId() {
        return this.a;
    }

    @Override // android.view.MenuItem
    public ContextMenu.ContextMenuInfo getMenuInfo() {
        return this.D;
    }

    @Override // c.i.f.a.b, android.view.MenuItem
    public int getNumericModifiers() {
        return this.f1022i;
    }

    @Override // android.view.MenuItem
    public char getNumericShortcut() {
        return this.f1021h;
    }

    @Override // android.view.MenuItem
    public int getOrder() {
        return this.f1016c;
    }

    @Override // android.view.MenuItem
    public SubMenu getSubMenu() {
        return this.o;
    }

    @Override // android.view.MenuItem
    @ViewDebug.CapturedViewProperty
    public CharSequence getTitle() {
        return this.f1018e;
    }

    @Override // android.view.MenuItem
    public CharSequence getTitleCondensed() {
        CharSequence charSequence = this.f1019f;
        return charSequence != null ? charSequence : this.f1018e;
    }

    @Override // c.i.f.a.b, android.view.MenuItem
    public CharSequence getTooltipText() {
        return this.r;
    }

    public boolean h() {
        return (this.x & 4) != 0;
    }

    @Override // android.view.MenuItem
    public boolean hasSubMenu() {
        return this.o != null;
    }

    public c.i.f.a.b i(View view) {
        int i2;
        this.z = view;
        this.A = null;
        if (view != null && view.getId() == -1 && (i2 = this.a) > 0) {
            view.setId(i2);
        }
        this.f1027n.p();
        return this;
    }

    @Override // c.i.f.a.b, android.view.MenuItem
    public boolean isActionViewExpanded() {
        return this.C;
    }

    @Override // android.view.MenuItem
    public boolean isCheckable() {
        return (this.x & 1) == 1;
    }

    @Override // android.view.MenuItem
    public boolean isChecked() {
        return (this.x & 2) == 2;
    }

    @Override // android.view.MenuItem
    public boolean isEnabled() {
        return (this.x & 16) != 0;
    }

    @Override // android.view.MenuItem
    public boolean isVisible() {
        c.i.k.f fVar = this.A;
        return (fVar == null || !fVar.g()) ? (this.x & 8) == 0 : (this.x & 8) == 0 && this.A.b();
    }

    public void j(boolean z) {
        int i2 = this.x;
        int i3 = (z ? 2 : 0) | (i2 & (-3));
        this.x = i3;
        if (i2 != i3) {
            this.f1027n.q(false);
        }
    }

    public void k(boolean z) {
        if (z) {
            this.x |= 32;
        } else {
            this.x &= -33;
        }
    }

    public boolean l(boolean z) {
        int i2 = this.x;
        int i3 = (z ? 0 : 8) | (i2 & (-9));
        this.x = i3;
        return i2 != i3;
    }

    public boolean m() {
        return this.f1027n.o() && e() != 0;
    }

    @Override // android.view.MenuItem
    public MenuItem setActionProvider(ActionProvider actionProvider) {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.setActionProvider()");
    }

    @Override // c.i.f.a.b, android.view.MenuItem
    public MenuItem setActionView(int i2) {
        Context context = this.f1027n.f1000b;
        i(LayoutInflater.from(context).inflate(i2, (ViewGroup) new LinearLayout(context), false));
        return this;
    }

    @Override // c.i.f.a.b, android.view.MenuItem
    public /* bridge */ /* synthetic */ MenuItem setActionView(View view) {
        i(view);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setAlphabeticShortcut(char c2) {
        if (this.f1023j == c2) {
            return this;
        }
        this.f1023j = Character.toLowerCase(c2);
        this.f1027n.q(false);
        return this;
    }

    @Override // c.i.f.a.b, android.view.MenuItem
    public MenuItem setAlphabeticShortcut(char c2, int i2) {
        if (this.f1023j == c2 && this.f1024k == i2) {
            return this;
        }
        this.f1023j = Character.toLowerCase(c2);
        this.f1024k = KeyEvent.normalizeMetaState(i2);
        this.f1027n.q(false);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setCheckable(boolean z) {
        int i2 = this.x;
        int i3 = (z ? 1 : 0) | (i2 & (-2));
        this.x = i3;
        if (i2 != i3) {
            this.f1027n.q(false);
        }
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setChecked(boolean z) {
        if ((this.x & 4) != 0) {
            g gVar = this.f1027n;
            Objects.requireNonNull(gVar);
            int groupId = getGroupId();
            int size = gVar.f1005g.size();
            gVar.z();
            for (int i2 = 0; i2 < size; i2++) {
                i iVar = gVar.f1005g.get(i2);
                if (iVar.f1015b == groupId && iVar.h() && iVar.isCheckable()) {
                    iVar.j(iVar == this);
                }
            }
            gVar.y();
        } else {
            j(z);
        }
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setContentDescription(CharSequence charSequence) {
        this.q = charSequence;
        this.f1027n.q(false);
        return this;
    }

    @Override // c.i.f.a.b, android.view.MenuItem
    public c.i.f.a.b setContentDescription(CharSequence charSequence) {
        this.q = charSequence;
        this.f1027n.q(false);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setEnabled(boolean z) {
        if (z) {
            this.x |= 16;
        } else {
            this.x &= -17;
        }
        this.f1027n.q(false);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIcon(int i2) {
        this.f1025l = null;
        this.f1026m = i2;
        this.w = true;
        this.f1027n.q(false);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIcon(Drawable drawable) {
        this.f1026m = 0;
        this.f1025l = drawable;
        this.w = true;
        this.f1027n.q(false);
        return this;
    }

    @Override // c.i.f.a.b, android.view.MenuItem
    public MenuItem setIconTintList(ColorStateList colorStateList) {
        this.s = colorStateList;
        this.u = true;
        this.w = true;
        this.f1027n.q(false);
        return this;
    }

    @Override // c.i.f.a.b, android.view.MenuItem
    public MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.t = mode;
        this.v = true;
        this.w = true;
        this.f1027n.q(false);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIntent(Intent intent) {
        this.f1020g = intent;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setNumericShortcut(char c2) {
        if (this.f1021h == c2) {
            return this;
        }
        this.f1021h = c2;
        this.f1027n.q(false);
        return this;
    }

    @Override // c.i.f.a.b, android.view.MenuItem
    public MenuItem setNumericShortcut(char c2, int i2) {
        if (this.f1021h == c2 && this.f1022i == i2) {
            return this;
        }
        this.f1021h = c2;
        this.f1022i = KeyEvent.normalizeMetaState(i2);
        this.f1027n.q(false);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        this.B = onActionExpandListener;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.p = onMenuItemClickListener;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setShortcut(char c2, char c3) {
        this.f1021h = c2;
        this.f1023j = Character.toLowerCase(c3);
        this.f1027n.q(false);
        return this;
    }

    @Override // c.i.f.a.b, android.view.MenuItem
    public MenuItem setShortcut(char c2, char c3, int i2, int i3) {
        this.f1021h = c2;
        this.f1022i = KeyEvent.normalizeMetaState(i2);
        this.f1023j = Character.toLowerCase(c3);
        this.f1024k = KeyEvent.normalizeMetaState(i3);
        this.f1027n.q(false);
        return this;
    }

    @Override // c.i.f.a.b, android.view.MenuItem
    public void setShowAsAction(int i2) {
        int i3 = i2 & 3;
        if (i3 != 0 && i3 != 1 && i3 != 2) {
            throw new IllegalArgumentException("SHOW_AS_ACTION_ALWAYS, SHOW_AS_ACTION_IF_ROOM, and SHOW_AS_ACTION_NEVER are mutually exclusive.");
        }
        this.y = i2;
        this.f1027n.p();
    }

    @Override // c.i.f.a.b, android.view.MenuItem
    public MenuItem setShowAsActionFlags(int i2) {
        setShowAsAction(i2);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTitle(int i2) {
        setTitle(this.f1027n.f1000b.getString(i2));
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTitle(CharSequence charSequence) {
        this.f1018e = charSequence;
        this.f1027n.q(false);
        r rVar = this.o;
        if (rVar != null) {
            rVar.setHeaderTitle(charSequence);
        }
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTitleCondensed(CharSequence charSequence) {
        this.f1019f = charSequence;
        this.f1027n.q(false);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTooltipText(CharSequence charSequence) {
        this.r = charSequence;
        this.f1027n.q(false);
        return this;
    }

    @Override // c.i.f.a.b, android.view.MenuItem
    public c.i.f.a.b setTooltipText(CharSequence charSequence) {
        this.r = charSequence;
        this.f1027n.q(false);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setVisible(boolean z) {
        if (l(z)) {
            g gVar = this.f1027n;
            gVar.f1007i = true;
            gVar.q(true);
        }
        return this;
    }

    public String toString() {
        CharSequence charSequence = this.f1018e;
        if (charSequence != null) {
            return charSequence.toString();
        }
        return null;
    }
}
