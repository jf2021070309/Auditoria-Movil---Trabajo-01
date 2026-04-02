package com.crunchyroll.profiles.presentation.customizetooltip;

import android.annotation.SuppressLint;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.compose.ui.platform.ComposeView;
import androidx.preference.Preference;
import com.amazon.aps.iva.fm.f;
import com.amazon.aps.iva.kb0.q;
import com.amazon.aps.iva.km.c;
import com.amazon.aps.iva.l8.g;
import com.amazon.aps.iva.o0.e0;
import com.amazon.aps.iva.o0.i;
import com.amazon.aps.iva.ox.d;
import com.amazon.aps.iva.v0.b;
import com.amazon.aps.iva.xb0.p;
import com.amazon.aps.iva.yb0.e;
import com.amazon.aps.iva.yb0.j;
import com.amazon.aps.iva.yb0.l;
import com.crunchyroll.crunchyroid.R;
import kotlin.Metadata;
/* compiled from: CustomizeProfileTooltipPreference.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B1\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/crunchyroll/profiles/presentation/customizetooltip/CustomizeProfileTooltipPreference;", "Landroidx/preference/Preference;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attributeSet", "", "defStyle", "defStyleRes", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;II)V", "profiles_release"}, k = 1, mv = {1, 8, 0})
@SuppressLint({"RestrictedApi"})
/* loaded from: classes2.dex */
public final class CustomizeProfileTooltipPreference extends Preference {
    public final c O;

    /* compiled from: CustomizeProfileTooltipPreference.kt */
    /* loaded from: classes2.dex */
    public static final class a extends l implements p<i, Integer, q> {
        public a() {
            super(2);
        }

        @Override // com.amazon.aps.iva.xb0.p
        public final q invoke(i iVar, Integer num) {
            i iVar2 = iVar;
            if ((num.intValue() & 11) == 2 && iVar2.h()) {
                iVar2.A();
            } else {
                e0.b bVar = e0.a;
                com.amazon.aps.iva.ao.c.a(b.b(iVar2, 1109342460, new com.crunchyroll.profiles.presentation.customizetooltip.a(CustomizeProfileTooltipPreference.this)), iVar2, 6);
            }
            return q.a;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CustomizeProfileTooltipPreference(Context context) {
        this(context, null, 0, 0, 14, null);
        j.f(context, "context");
    }

    @Override // androidx.preference.Preference
    public final void n(g gVar) {
        j.f(gVar, "holder");
        View view = gVar.itemView;
        j.d(view, "null cannot be cast to non-null type androidx.compose.ui.platform.ComposeView");
        ((ComposeView) view).setContent(b.c(-31154673, new a(), true));
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CustomizeProfileTooltipPreference(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 0, 12, null);
        j.f(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CustomizeProfileTooltipPreference(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0, 8, null);
        j.f(context, "context");
    }

    public /* synthetic */ CustomizeProfileTooltipPreference(Context context, AttributeSet attributeSet, int i, int i2, int i3, e eVar) {
        this(context, (i3 & 2) != 0 ? null : attributeSet, (i3 & 4) != 0 ? com.amazon.aps.iva.f3.j.a(context, R.attr.preferenceStyle, 16842894) : i, (i3 & 8) != 0 ? 0 : i2);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CustomizeProfileTooltipPreference(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        j.f(context, "context");
        f fVar = com.amazon.aps.iva.fm.g.e;
        if (fVar != null) {
            d.a e = fVar.e();
            j.f(e, "getUserId");
            this.O = new c(context, e);
            return;
        }
        j.m("dependencies");
        throw null;
    }
}
