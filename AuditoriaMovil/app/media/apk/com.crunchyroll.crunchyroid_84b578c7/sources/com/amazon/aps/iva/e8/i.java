package com.amazon.aps.iva.e8;

import android.view.View;
import com.amazon.aps.iva.e8.h;
import com.amazon.aps.iva.f8.f0;
/* compiled from: MediaRouteDynamicChooserDialog.java */
/* loaded from: classes.dex */
public final class i implements View.OnClickListener {
    public final /* synthetic */ f0.h b;
    public final /* synthetic */ h.d.c c;

    public i(h.d.c cVar, f0.h hVar) {
        this.c = cVar;
        this.b = hVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        h.d.c cVar = this.c;
        h hVar = h.this;
        f0.h hVar2 = this.b;
        hVar.j = hVar2;
        hVar2.n();
        cVar.c.setVisibility(4);
        cVar.d.setVisibility(0);
    }
}
