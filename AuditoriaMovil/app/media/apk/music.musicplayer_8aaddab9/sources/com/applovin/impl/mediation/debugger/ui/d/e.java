package com.applovin.impl.mediation.debugger.ui.d;

import android.text.SpannedString;
import com.applovin.impl.mediation.debugger.ui.d.c;
/* loaded from: classes.dex */
public class e extends c {
    public e(String str) {
        super(c.b.SECTION);
        this.f3614d = new SpannedString(str);
    }

    public String toString() {
        StringBuilder y = e.a.d.a.a.y("SectionListItemViewModel{text=");
        y.append((Object) this.f3614d);
        y.append("}");
        return y.toString();
    }
}
