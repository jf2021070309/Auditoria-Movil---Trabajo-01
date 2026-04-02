package com.ellation.localization.preference;

import android.content.Context;
import android.util.AttributeSet;
import androidx.preference.SwitchPreferenceCompat;
import com.amazon.aps.iva.r60.a;
import com.amazon.aps.iva.yb0.e;
import com.amazon.aps.iva.yb0.j;
import com.crunchyroll.crunchyroid.R;
import kotlin.Metadata;
/* compiled from: TranslatableSwitchPreferenceCompat.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u00002\u00020\u0001B/\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0002\u0010\t¨\u0006\n"}, d2 = {"Lcom/ellation/localization/preference/TranslatableSwitchPreferenceCompat;", "Landroidx/preference/SwitchPreferenceCompat;", "context", "Landroid/content/Context;", "attributeSet", "Landroid/util/AttributeSet;", "defStyle", "", "defStyleRes", "(Landroid/content/Context;Landroid/util/AttributeSet;II)V", "localization_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class TranslatableSwitchPreferenceCompat extends SwitchPreferenceCompat {
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public TranslatableSwitchPreferenceCompat(Context context) {
        this(context, null, 0, 0, 14, null);
        j.f(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public TranslatableSwitchPreferenceCompat(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 0, 12, null);
        j.f(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public TranslatableSwitchPreferenceCompat(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0, 8, null);
        j.f(context, "context");
    }

    public /* synthetic */ TranslatableSwitchPreferenceCompat(Context context, AttributeSet attributeSet, int i, int i2, int i3, e eVar) {
        this(context, (i3 & 2) != 0 ? null : attributeSet, (i3 & 4) != 0 ? R.attr.switchPreferenceCompatStyle : i, (i3 & 8) != 0 ? 0 : i2);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TranslatableSwitchPreferenceCompat(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        j.f(context, "context");
        a.a(this, attributeSet);
    }
}
