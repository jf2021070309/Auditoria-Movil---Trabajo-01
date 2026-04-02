package com.ellation.crunchyroll.presentation.settings.membership.preference;

import android.annotation.SuppressLint;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import com.amazon.aps.iva.l8.g;
import com.amazon.aps.iva.yb0.e;
import com.amazon.aps.iva.yb0.j;
import com.crunchyroll.crunchyroid.R;
import com.ellation.crunchyroll.settings.SelectableTitlePreference;
import kotlin.Metadata;
/* compiled from: MembershipPlanPreference.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B1\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/ellation/crunchyroll/presentation/settings/membership/preference/MembershipPlanPreference;", "Lcom/ellation/crunchyroll/settings/SelectableTitlePreference;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attributeSet", "", "defStyle", "defStyleRes", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;II)V", "cr-android_release"}, k = 1, mv = {1, 8, 0})
@SuppressLint({"RestrictedApi"})
/* loaded from: classes2.dex */
public final class MembershipPlanPreference extends SelectableTitlePreference {
    public boolean S;
    public View T;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public MembershipPlanPreference(Context context) {
        this(context, null, 0, 0, 14, null);
        j.f(context, "context");
    }

    @Override // com.ellation.crunchyroll.settings.SelectableTitlePreference, androidx.preference.Preference
    public final void n(g gVar) {
        j.f(gVar, "holder");
        super.n(gVar);
        View b1 = gVar.b1(R.id.warning_icon);
        this.T = b1;
        if (this.S) {
            if (b1 != null) {
                b1.setVisibility(0);
            }
        } else if (b1 != null) {
            b1.setVisibility(8);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public MembershipPlanPreference(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 0, 12, null);
        j.f(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public MembershipPlanPreference(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0, 8, null);
        j.f(context, "context");
    }

    public /* synthetic */ MembershipPlanPreference(Context context, AttributeSet attributeSet, int i, int i2, int i3, e eVar) {
        this(context, (i3 & 2) != 0 ? null : attributeSet, (i3 & 4) != 0 ? com.amazon.aps.iva.f3.j.a(context, R.attr.preferenceStyle, 16842894) : i, (i3 & 8) != 0 ? 0 : i2);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MembershipPlanPreference(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        j.f(context, "context");
    }
}
