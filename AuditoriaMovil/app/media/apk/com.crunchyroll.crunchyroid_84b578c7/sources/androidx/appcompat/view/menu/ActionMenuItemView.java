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
import android.widget.Button;
import androidx.appcompat.view.menu.f;
import androidx.appcompat.view.menu.k;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.a;
import com.amazon.aps.iva.q.h1;
import com.amazon.aps.iva.q.m0;
import com.google.common.primitives.Ints;
/* loaded from: classes.dex */
public class ActionMenuItemView extends AppCompatTextView implements k.a, View.OnClickListener, ActionMenuView.a {
    public h b;
    public CharSequence c;
    public Drawable d;
    public f.b e;
    public a f;
    public b g;
    public boolean h;
    public boolean i;
    public final int j;
    public int k;
    public final int l;

    /* loaded from: classes.dex */
    public class a extends m0 {
        public a() {
            super(ActionMenuItemView.this);
        }

        @Override // com.amazon.aps.iva.q.m0
        public final com.amazon.aps.iva.p.f b() {
            a.C0007a c0007a;
            b bVar = ActionMenuItemView.this.g;
            if (bVar == null || (c0007a = androidx.appcompat.widget.a.this.v) == null) {
                return null;
            }
            return c0007a.a();
        }

        @Override // com.amazon.aps.iva.q.m0
        public final boolean c() {
            com.amazon.aps.iva.p.f b;
            ActionMenuItemView actionMenuItemView = ActionMenuItemView.this;
            f.b bVar = actionMenuItemView.e;
            if (bVar == null || !bVar.b(actionMenuItemView.b) || (b = b()) == null || !b.a()) {
                return false;
            }
            return true;
        }
    }

    /* loaded from: classes.dex */
    public static abstract class b {
    }

    public ActionMenuItemView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    @Override // androidx.appcompat.widget.ActionMenuView.a
    public final boolean G() {
        return U2();
    }

    public final boolean G4() {
        Configuration configuration = getContext().getResources().getConfiguration();
        int i = configuration.screenWidthDp;
        int i2 = configuration.screenHeightDp;
        if (i < 480 && ((i < 640 || i2 < 480) && configuration.orientation != 2)) {
            return false;
        }
        return true;
    }

    public final void H6() {
        CharSequence charSequence;
        CharSequence charSequence2;
        boolean z;
        boolean z2 = true;
        boolean z3 = !TextUtils.isEmpty(this.c);
        if (this.d != null) {
            if ((this.b.y & 4) == 4) {
                z = true;
            } else {
                z = false;
            }
            if (!z || (!this.h && !this.i)) {
                z2 = false;
            }
        }
        boolean z4 = z3 & z2;
        CharSequence charSequence3 = null;
        if (z4) {
            charSequence = this.c;
        } else {
            charSequence = null;
        }
        setText(charSequence);
        CharSequence charSequence4 = this.b.q;
        if (TextUtils.isEmpty(charSequence4)) {
            if (z4) {
                charSequence2 = null;
            } else {
                charSequence2 = this.b.e;
            }
            setContentDescription(charSequence2);
        } else {
            setContentDescription(charSequence4);
        }
        CharSequence charSequence5 = this.b.r;
        if (TextUtils.isEmpty(charSequence5)) {
            if (!z4) {
                charSequence3 = this.b.e;
            }
            h1.a(this, charSequence3);
            return;
        }
        h1.a(this, charSequence5);
    }

    public final boolean U2() {
        return !TextUtils.isEmpty(getText());
    }

    @Override // androidx.appcompat.widget.ActionMenuView.a
    public final boolean b1() {
        if (U2() && this.b.getIcon() == null) {
            return true;
        }
        return false;
    }

    @Override // android.widget.TextView, android.view.View
    public CharSequence getAccessibilityClassName() {
        return Button.class.getName();
    }

    @Override // androidx.appcompat.view.menu.k.a
    public h getItemData() {
        return this.b;
    }

    @Override // androidx.appcompat.view.menu.k.a
    public final void initialize(h hVar, int i) {
        int i2;
        this.b = hVar;
        setIcon(hVar.getIcon());
        setTitle(hVar.getTitleCondensed());
        setId(hVar.a);
        if (hVar.isVisible()) {
            i2 = 0;
        } else {
            i2 = 8;
        }
        setVisibility(i2);
        setEnabled(hVar.isEnabled());
        if (hVar.hasSubMenu() && this.f == null) {
            this.f = new a();
        }
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        f.b bVar = this.e;
        if (bVar != null) {
            bVar.b(this.b);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.h = G4();
        H6();
    }

    @Override // androidx.appcompat.widget.AppCompatTextView, android.widget.TextView, android.view.View
    public final void onMeasure(int i, int i2) {
        int i3;
        int i4;
        boolean U2 = U2();
        if (U2 && (i4 = this.k) >= 0) {
            super.setPadding(i4, getPaddingTop(), getPaddingRight(), getPaddingBottom());
        }
        super.onMeasure(i, i2);
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        int measuredWidth = getMeasuredWidth();
        int i5 = this.j;
        if (mode == Integer.MIN_VALUE) {
            i3 = Math.min(size, i5);
        } else {
            i3 = i5;
        }
        if (mode != 1073741824 && i5 > 0 && measuredWidth < i3) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(i3, Ints.MAX_POWER_OF_TWO), i2);
        }
        if (!U2 && this.d != null) {
            super.setPadding((getMeasuredWidth() - this.d.getBounds().width()) / 2, getPaddingTop(), getPaddingRight(), getPaddingBottom());
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        super.onRestoreInstanceState(null);
    }

    @Override // android.widget.TextView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        a aVar;
        if (this.b.hasSubMenu() && (aVar = this.f) != null && aVar.onTouch(this, motionEvent)) {
            return true;
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setExpandedFormat(boolean z) {
        if (this.i != z) {
            this.i = z;
            h hVar = this.b;
            if (hVar != null) {
                hVar.n.onItemActionRequestChanged(hVar);
            }
        }
    }

    public void setIcon(Drawable drawable) {
        this.d = drawable;
        if (drawable != null) {
            int intrinsicWidth = drawable.getIntrinsicWidth();
            int intrinsicHeight = drawable.getIntrinsicHeight();
            int i = this.l;
            if (intrinsicWidth > i) {
                intrinsicHeight = (int) (intrinsicHeight * (i / intrinsicWidth));
                intrinsicWidth = i;
            }
            if (intrinsicHeight > i) {
                intrinsicWidth = (int) (intrinsicWidth * (i / intrinsicHeight));
            } else {
                i = intrinsicHeight;
            }
            drawable.setBounds(0, 0, intrinsicWidth, i);
        }
        setCompoundDrawables(drawable, null, null, null);
        H6();
    }

    public void setItemInvoker(f.b bVar) {
        this.e = bVar;
    }

    @Override // android.widget.TextView, android.view.View
    public final void setPadding(int i, int i2, int i3, int i4) {
        this.k = i;
        super.setPadding(i, i2, i3, i4);
    }

    public void setPopupCallback(b bVar) {
        this.g = bVar;
    }

    public void setTitle(CharSequence charSequence) {
        this.c = charSequence;
        H6();
    }

    public ActionMenuItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, 0);
        Resources resources = context.getResources();
        this.h = G4();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, com.amazon.aps.iva.j.a.c, 0, 0);
        this.j = obtainStyledAttributes.getDimensionPixelSize(0, 0);
        obtainStyledAttributes.recycle();
        this.l = (int) ((resources.getDisplayMetrics().density * 32.0f) + 0.5f);
        setOnClickListener(this);
        this.k = -1;
        setSaveEnabled(false);
    }

    public void setCheckable(boolean z) {
    }

    public void setChecked(boolean z) {
    }
}
