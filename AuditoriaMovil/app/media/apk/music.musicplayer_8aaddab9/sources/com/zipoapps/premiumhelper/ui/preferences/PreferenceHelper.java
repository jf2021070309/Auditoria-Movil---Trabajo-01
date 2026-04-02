package com.zipoapps.premiumhelper.ui.preferences;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.View;
import android.widget.TextView;
import c.p.c;
import c.p.d;
import c.p.p;
import c.t.l;
import ch.qos.logback.core.CoreConstants;
import e.j.d.k;
import e.j.d.x;
import h.o.c.j;
import java.util.Locale;
import music.musicplayer.R;
/* loaded from: classes2.dex */
public class PreferenceHelper {
    public TextView a;

    /* renamed from: b  reason: collision with root package name */
    public int f4911b;

    /* renamed from: c  reason: collision with root package name */
    public a f4912c;

    /* renamed from: d  reason: collision with root package name */
    public int f4913d;

    /* renamed from: e  reason: collision with root package name */
    public ColorStateList f4914e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f4915f;

    /* loaded from: classes2.dex */
    public enum a {
        START,
        END
    }

    public PreferenceHelper(Context context, AttributeSet attributeSet) {
        j.e(context, CoreConstants.CONTEXT_SCOPE_VALUE);
        this.f4911b = -1;
        a aVar = a.END;
        this.f4912c = aVar;
        this.f4913d = -1;
        this.f4915f = true;
        if (context instanceof p) {
            ((p) context).getLifecycle().a(new d() { // from class: com.zipoapps.premiumhelper.ui.preferences.PreferenceHelper.1
                @Override // c.p.h
                public void a(p pVar) {
                    j.e(pVar, "owner");
                    PreferenceHelper.this.c();
                }

                @Override // c.p.h
                public /* synthetic */ void b(p pVar) {
                    c.a(this, pVar);
                }

                @Override // c.p.h
                public /* synthetic */ void d(p pVar) {
                    c.c(this, pVar);
                }

                @Override // c.p.h
                public /* synthetic */ void e(p pVar) {
                    c.f(this, pVar);
                }

                @Override // c.p.h
                public /* synthetic */ void f(p pVar) {
                    c.b(this, pVar);
                }

                @Override // c.p.h
                public /* synthetic */ void h(p pVar) {
                    c.e(this, pVar);
                }
            });
        }
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, x.a);
        this.f4911b = obtainStyledAttributes.getResourceId(1, -1);
        this.f4913d = obtainStyledAttributes.getDimensionPixelSize(4, -1);
        this.f4914e = obtainStyledAttributes.getColorStateList(2);
        String nonResourceString = obtainStyledAttributes.getNonResourceString(3);
        String upperCase = (nonResourceString == null ? aVar.name() : nonResourceString).toUpperCase(Locale.ROOT);
        j.d(upperCase, "this as java.lang.String).toUpperCase(Locale.ROOT)");
        this.f4912c = a.valueOf(upperCase);
        obtainStyledAttributes.recycle();
    }

    public final void a(l lVar) {
        j.e(lVar, "holder");
        View y = lVar.y(16908310);
        if (y instanceof TextView) {
            this.a = (TextView) y;
            c();
        }
    }

    public final void b() {
        TextView textView;
        if (!this.f4915f || (textView = this.a) == null) {
            return;
        }
        textView.setCompoundDrawablePadding((int) TypedValue.applyDimension(1, 10.0f, textView.getResources().getDisplayMetrics()));
        ColorStateList colorStateList = this.f4914e;
        if (colorStateList == null) {
            colorStateList = ColorStateList.valueOf(textView.getCurrentTextColor());
            j.d(colorStateList, "valueOf(this.currentTextColor)");
        }
        c.i.a.X(textView, colorStateList);
        int i2 = this.f4911b;
        if (i2 == -1) {
            i2 = R.drawable.ic_preference_lock;
        }
        if (this.f4913d == -1) {
            int ordinal = this.f4912c.ordinal();
            if (ordinal == 0) {
                textView.setCompoundDrawablesWithIntrinsicBounds(i2, 0, 0, 0);
                return;
            } else if (ordinal != 1) {
                return;
            } else {
                textView.setCompoundDrawablesWithIntrinsicBounds(0, 0, i2, 0);
                return;
            }
        }
        Drawable a2 = c.i.d.c.j.a(textView.getResources(), i2, textView.getContext().getTheme());
        if (a2 == null) {
            throw new IllegalStateException("Failed to load icon".toString());
        }
        int i3 = this.f4913d;
        a2.setBounds(0, 0, i3, i3);
        int ordinal2 = this.f4912c.ordinal();
        if (ordinal2 == 0) {
            textView.setCompoundDrawables(a2, null, null, null);
        } else if (ordinal2 != 1) {
        } else {
            textView.setCompoundDrawables(null, null, a2, null);
        }
    }

    public void c() {
        if (!k.a.a().e()) {
            b();
            return;
        }
        TextView textView = this.a;
        if (textView == null) {
            return;
        }
        textView.setCompoundDrawablesWithIntrinsicBounds(0, 0, 0, 0);
    }
}
