package com.amazon.aps.iva.l8;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.text.TextUtils;
import androidx.preference.Preference;
import androidx.preference.PreferenceGroup;
import androidx.preference.c;
import com.crunchyroll.crunchyroid.R;
import com.google.android.gms.cast.MediaError;
import java.util.ArrayList;
import java.util.Iterator;
/* compiled from: ExpandButton.java */
/* loaded from: classes.dex */
public final class b extends Preference {
    public final long O;

    public b(Context context, ArrayList arrayList, long j) {
        super(context);
        this.F = R.layout.expand_button;
        Drawable a = com.amazon.aps.iva.l.a.a(this.b, R.drawable.ic_arrow_down_24dp);
        if (this.l != a) {
            this.l = a;
            this.k = 0;
            j();
        }
        this.k = R.drawable.ic_arrow_down_24dp;
        String string = this.b.getString(R.string.expand_button_title);
        if (!TextUtils.equals(string, this.i)) {
            this.i = string;
            j();
        }
        if (999 != this.g) {
            this.g = MediaError.DetailedErrorCode.GENERIC;
            Preference.c cVar = this.H;
            if (cVar != null) {
                androidx.preference.c cVar2 = (androidx.preference.c) cVar;
                Handler handler = cVar2.e;
                c.a aVar = cVar2.f;
                handler.removeCallbacks(aVar);
                handler.post(aVar);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        String str = null;
        while (it.hasNext()) {
            Preference preference = (Preference) it.next();
            CharSequence charSequence = preference.i;
            boolean z = preference instanceof PreferenceGroup;
            if (z && !TextUtils.isEmpty(charSequence)) {
                arrayList2.add((PreferenceGroup) preference);
            }
            if (arrayList2.contains(preference.J)) {
                if (z) {
                    arrayList2.add((PreferenceGroup) preference);
                }
            } else if (!TextUtils.isEmpty(charSequence)) {
                if (str == null) {
                    str = charSequence;
                } else {
                    str = this.b.getString(R.string.summary_collapsed_preference_list, str, charSequence);
                }
            }
        }
        x(str);
        this.O = j + 1000000;
    }

    @Override // androidx.preference.Preference
    public final long c() {
        return this.O;
    }

    @Override // androidx.preference.Preference
    public final void n(g gVar) {
        super.n(gVar);
        gVar.e = false;
    }
}
