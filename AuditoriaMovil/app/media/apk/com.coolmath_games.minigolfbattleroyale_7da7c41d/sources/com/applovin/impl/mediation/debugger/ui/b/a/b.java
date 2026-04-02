package com.applovin.impl.mediation.debugger.ui.b.a;

import android.content.Context;
import android.text.SpannedString;
import com.applovin.impl.mediation.debugger.ui.d.c;
import com.applovin.impl.sdk.h;
/* loaded from: classes.dex */
public class b extends c {
    private final h.a a;
    private final Context o;
    private final boolean p;

    public b(h.a aVar, boolean z, Context context) {
        super(c.b.RIGHT_DETAIL);
        this.a = aVar;
        this.o = context;
        this.d = new SpannedString(aVar.a());
        this.p = z;
    }

    @Override // com.applovin.impl.mediation.debugger.ui.d.c
    public boolean b() {
        return true;
    }

    @Override // com.applovin.impl.mediation.debugger.ui.d.c
    public SpannedString c_() {
        return new SpannedString(this.a.b(this.o));
    }

    @Override // com.applovin.impl.mediation.debugger.ui.d.c
    public boolean d_() {
        Boolean a = this.a.a(this.o);
        if (a != null) {
            return a.equals(Boolean.valueOf(this.p));
        }
        return false;
    }
}
