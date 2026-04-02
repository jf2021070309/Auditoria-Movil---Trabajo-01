package c.t;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import androidx.preference.Preference;
import androidx.preference.PreferenceGroup;
import java.util.ArrayList;
import java.util.List;
import music.musicplayer.R;
/* loaded from: classes.dex */
public final class b extends Preference {
    public long O;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(Context context, List<Preference> list, long j2) {
        super(context, null);
        String str = null;
        this.F = R.layout.expand_button;
        Drawable b2 = c.b.d.a.a.b(this.a, R.drawable.ic_arrow_down_24dp);
        if (this.f483k != b2) {
            this.f483k = b2;
            this.f482j = 0;
            m();
        }
        this.f482j = R.drawable.ic_arrow_down_24dp;
        I(R.string.expand_button_title);
        if (999 != this.f479g) {
            this.f479g = 999;
            o();
        }
        ArrayList arrayList = new ArrayList();
        for (Preference preference : list) {
            CharSequence charSequence = preference.f480h;
            boolean z = preference instanceof PreferenceGroup;
            if (z && !TextUtils.isEmpty(charSequence)) {
                arrayList.add((PreferenceGroup) preference);
            }
            if (arrayList.contains(preference.J)) {
                if (z) {
                    arrayList.add((PreferenceGroup) preference);
                }
            } else if (!TextUtils.isEmpty(charSequence)) {
                str = str == null ? charSequence : this.a.getString(R.string.summary_collapsed_preference_list, str, charSequence);
            }
        }
        H(str);
        this.O = j2 + 1000000;
    }

    @Override // androidx.preference.Preference
    public long d() {
        return this.O;
    }

    @Override // androidx.preference.Preference
    public void r(l lVar) {
        super.r(lVar);
        lVar.x = false;
    }
}
