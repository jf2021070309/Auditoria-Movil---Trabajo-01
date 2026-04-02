package com.zipoapps.premiumhelper.ui.preferences;

import android.app.Activity;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.text.SpannableString;
import android.text.style.ImageSpan;
import android.util.AttributeSet;
import android.widget.TextView;
import androidx.preference.ListPreference;
import c.i.a;
import c.t.l;
import ch.qos.logback.core.CoreConstants;
import e.j.d.b0.b.b;
import e.j.d.k;
import h.o.c.j;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import music.musicplayer.R;
/* loaded from: classes2.dex */
public final class PremiumListPreference extends ListPreference {
    public final b d0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PremiumListPreference(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        j.e(context, CoreConstants.CONTEXT_SCOPE_VALUE);
        this.d0 = new b(context, attributeSet);
    }

    @Override // androidx.preference.ListPreference
    public CharSequence[] P() {
        b bVar = this.d0;
        CharSequence[] charSequenceArr = this.Y;
        j.d(charSequenceArr, "super.getEntries()");
        Objects.requireNonNull(bVar);
        j.e(charSequenceArr, "entries");
        if (k.a.a().e()) {
            return charSequenceArr;
        }
        List<Integer> list = bVar.f8572h;
        if (list != null && list.isEmpty()) {
            return charSequenceArr;
        }
        int i2 = bVar.f4911b;
        if (i2 == -1) {
            i2 = R.drawable.ic_preference_lock;
        }
        Drawable a = c.i.d.c.j.a(bVar.f8571g.getResources(), i2, bVar.f8571g.getTheme());
        if (a != null) {
            a.setBounds(0, 0, 48, 48);
            TextView textView = bVar.a;
            if (textView != null) {
                ColorStateList colorStateList = bVar.f4914e;
                Integer valueOf = colorStateList == null ? null : Integer.valueOf(colorStateList.getDefaultColor());
                a.i0(a, valueOf == null ? textView.getCurrentTextColor() : valueOf.intValue());
            }
            ArrayList arrayList = new ArrayList(charSequenceArr.length);
            int length = charSequenceArr.length;
            int i3 = 0;
            int i4 = 0;
            while (i3 < length) {
                SpannableString spannableString = charSequenceArr[i3];
                i3++;
                int i5 = i4 + 1;
                List<Integer> list2 = bVar.f8572h;
                if (!(list2 != null && list2.contains(Integer.valueOf(i4)))) {
                    SpannableString spannableString2 = new SpannableString(((Object) spannableString) + "   ");
                    spannableString2.setSpan(new ImageSpan(a, 1), spannableString2.length() + (-2), spannableString2.length() - 1, 33);
                    spannableString = spannableString2;
                }
                arrayList.add(spannableString);
                i4 = i5;
            }
            Object[] array = arrayList.toArray(new CharSequence[0]);
            Objects.requireNonNull(array, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
            return (CharSequence[]) array;
        }
        throw new IllegalStateException("Cannot load icon".toString());
    }

    @Override // androidx.preference.Preference
    public boolean a(Object obj) {
        k.a aVar = k.a;
        boolean z = true;
        if (!aVar.a().e()) {
            Objects.requireNonNull(obj, "null cannot be cast to non-null type kotlin.String");
            int O = O((String) obj);
            List<Integer> list = this.d0.f8572h;
            if (list == null || !list.contains(Integer.valueOf(O))) {
                z = false;
            }
        }
        if (!z && (this.a instanceof Activity)) {
            k.l(aVar.a(), j.i("preference_", this.f484l), 0, 0, 6);
        }
        if (z) {
            return super.a(obj);
        }
        return false;
    }

    @Override // androidx.preference.Preference
    public void r(l lVar) {
        j.e(lVar, "holder");
        super.r(lVar);
        this.d0.a(lVar);
    }

    @Override // androidx.preference.DialogPreference, androidx.preference.Preference
    public void s() {
        k.a aVar = k.a;
        if (!aVar.a().e()) {
            List<Integer> list = this.d0.f8572h;
            if (!(list != null && (list.isEmpty() ^ true))) {
                if (this.a instanceof Activity) {
                    k.l(aVar.a(), j.i("preference_", this.f484l), 0, 0, 6);
                    return;
                }
                return;
            }
        }
        super.s();
    }
}
