package com.amazon.aps.iva.w0;

import androidx.lifecycle.LiveData;
import com.amazon.aps.iva.i5.w;
import com.amazon.aps.iva.o0.u0;
/* compiled from: Effects.kt */
/* loaded from: classes.dex */
public final class a implements u0 {
    public final /* synthetic */ LiveData a;
    public final /* synthetic */ w b;

    public a(LiveData liveData, b bVar) {
        this.a = liveData;
        this.b = bVar;
    }

    @Override // com.amazon.aps.iva.o0.u0
    public final void dispose() {
        this.a.j(this.b);
    }
}
