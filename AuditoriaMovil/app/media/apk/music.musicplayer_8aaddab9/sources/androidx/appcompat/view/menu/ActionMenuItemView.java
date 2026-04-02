package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.AppCompatTextView;
import c.b.h.i.g;
import c.b.h.i.i;
import c.b.h.i.n;
import c.b.h.i.p;
import c.b.i.c;
import c.b.i.h0;
/* loaded from: classes.dex */
public class ActionMenuItemView extends AppCompatTextView implements n.a, View.OnClickListener, ActionMenuView.a {

    /* renamed from: f  reason: collision with root package name */
    public i f139f;

    /* renamed from: g  reason: collision with root package name */
    public CharSequence f140g;

    /* renamed from: h  reason: collision with root package name */
    public Drawable f141h;

    /* renamed from: i  reason: collision with root package name */
    public g.b f142i;

    /* renamed from: j  reason: collision with root package name */
    public h0 f143j;

    /* renamed from: k  reason: collision with root package name */
    public b f144k;

    /* renamed from: l  reason: collision with root package name */
    public boolean f145l;

    /* renamed from: m  reason: collision with root package name */
    public boolean f146m;

    /* renamed from: n  reason: collision with root package name */
    public int f147n;
    public int o;
    public int p;

    /* loaded from: classes.dex */
    public class a extends h0 {
        public a() {
            super(ActionMenuItemView.this);
        }

        @Override // c.b.i.h0
        public p b() {
            c.a aVar;
            b bVar = ActionMenuItemView.this.f144k;
            if (bVar == null || (aVar = c.this.u) == null) {
                return null;
            }
            return aVar.a();
        }

        @Override // c.b.i.h0
        public boolean c() {
            p b2;
            ActionMenuItemView actionMenuItemView = ActionMenuItemView.this;
            g.b bVar = actionMenuItemView.f142i;
            return bVar != null && bVar.a(actionMenuItemView.f139f) && (b2 = b()) != null && b2.a();
        }
    }

    /* loaded from: classes.dex */
    public static abstract class b {
    }

    public ActionMenuItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        Resources resources = context.getResources();
        this.f145l = e();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, c.b.b.f772c, 0, 0);
        this.f147n = obtainStyledAttributes.getDimensionPixelSize(0, 0);
        obtainStyledAttributes.recycle();
        this.p = (int) ((resources.getDisplayMetrics().density * 32.0f) + 0.5f);
        setOnClickListener(this);
        this.o = -1;
        setSaveEnabled(false);
    }

    @Override // androidx.appcompat.widget.ActionMenuView.a
    public boolean a() {
        return c();
    }

    @Override // androidx.appcompat.widget.ActionMenuView.a
    public boolean b() {
        return c() && this.f139f.getIcon() == null;
    }

    public boolean c() {
        return !TextUtils.isEmpty(getText());
    }

    @Override // c.b.h.i.n.a
    public void d(i iVar, int i2) {
        this.f139f = iVar;
        setIcon(iVar.getIcon());
        setTitle(iVar.getTitleCondensed());
        setId(iVar.a);
        setVisibility(iVar.isVisible() ? 0 : 8);
        setEnabled(iVar.isEnabled());
        if (iVar.hasSubMenu() && this.f143j == null) {
            this.f143j = new a();
        }
    }

    public final boolean e() {
        Configuration configuration = getContext().getResources().getConfiguration();
        int i2 = configuration.screenWidthDp;
        return i2 >= 480 || (i2 >= 640 && configuration.screenHeightDp >= 480) || configuration.orientation == 2;
    }

    public final void f() {
        boolean z = true;
        boolean z2 = !TextUtils.isEmpty(this.f140g);
        if (this.f141h != null) {
            if (!((this.f139f.y & 4) == 4) || (!this.f145l && !this.f146m)) {
                z = false;
            }
        }
        boolean z3 = z2 & z;
        setText(z3 ? this.f140g : null);
        CharSequence charSequence = this.f139f.q;
        if (TextUtils.isEmpty(charSequence)) {
            setContentDescription(z3 ? null : this.f139f.f1018e);
        } else {
            setContentDescription(charSequence);
        }
        CharSequence charSequence2 = this.f139f.r;
        if (TextUtils.isEmpty(charSequence2)) {
            c.b.a.c(this, z3 ? null : this.f139f.f1018e);
        } else {
            c.b.a.c(this, charSequence2);
        }
    }

    @Override // c.b.h.i.n.a
    public i getItemData() {
        return this.f139f;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        g.b bVar = this.f142i;
        if (bVar != null) {
            bVar.a(this.f139f);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.f145l = e();
        f();
    }

    @Override // androidx.appcompat.widget.AppCompatTextView, android.widget.TextView, android.view.View
    public void onMeasure(int i2, int i3) {
        int i4;
        boolean c2 = c();
        if (c2 && (i4 = this.o) >= 0) {
            super.setPadding(i4, getPaddingTop(), getPaddingRight(), getPaddingBottom());
        }
        super.onMeasure(i2, i3);
        int mode = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i2);
        int measuredWidth = getMeasuredWidth();
        int min = mode == Integer.MIN_VALUE ? Math.min(size, this.f147n) : this.f147n;
        if (mode != 1073741824 && this.f147n > 0 && measuredWidth < min) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(min, 1073741824), i3);
        }
        if (c2 || this.f141h == null) {
            return;
        }
        super.setPadding((getMeasuredWidth() - this.f141h.getBounds().width()) / 2, getPaddingTop(), getPaddingRight(), getPaddingBottom());
    }

    @Override // android.widget.TextView, android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        super.onRestoreInstanceState(null);
    }

    @Override // android.widget.TextView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        h0 h0Var;
        if (this.f139f.hasSubMenu() && (h0Var = this.f143j) != null && h0Var.onTouch(this, motionEvent)) {
            return true;
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setCheckable(boolean z) {
    }

    public void setChecked(boolean z) {
    }

    public void setExpandedFormat(boolean z) {
        if (this.f146m != z) {
            this.f146m = z;
            i iVar = this.f139f;
            if (iVar != null) {
                iVar.f1027n.p();
            }
        }
    }

    public void setIcon(Drawable drawable) {
        this.f141h = drawable;
        if (drawable != null) {
            int intrinsicWidth = drawable.getIntrinsicWidth();
            int intrinsicHeight = drawable.getIntrinsicHeight();
            int i2 = this.p;
            if (intrinsicWidth > i2) {
                intrinsicHeight = (int) (intrinsicHeight * (i2 / intrinsicWidth));
                intrinsicWidth = i2;
            }
            if (intrinsicHeight > i2) {
                intrinsicWidth = (int) (intrinsicWidth * (i2 / intrinsicHeight));
            } else {
                i2 = intrinsicHeight;
            }
            drawable.setBounds(0, 0, intrinsicWidth, i2);
        }
        setCompoundDrawables(drawable, null, null, null);
        f();
    }

    public void setItemInvoker(g.b bVar) {
        this.f142i = bVar;
    }

    @Override // android.widget.TextView, android.view.View
    public void setPadding(int i2, int i3, int i4, int i5) {
        this.o = i2;
        super.setPadding(i2, i3, i4, i5);
    }

    public void setPopupCallback(b bVar) {
        this.f144k = bVar;
    }

    public void setTitle(CharSequence charSequence) {
        this.f140g = charSequence;
        f();
    }
}
