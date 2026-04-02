package com.amazon.aps.iva.t00;

import com.amazon.aps.iva.t00.e;
import com.amazon.aps.iva.yb0.j;
import com.amazon.aps.iva.yb0.l;
/* compiled from: AudioLanguageOptionsDialog.kt */
/* loaded from: classes2.dex */
public final class c extends l implements com.amazon.aps.iva.xb0.l<String, CharSequence> {
    public final /* synthetic */ com.amazon.aps.iva.xb0.l<String, CharSequence> h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(e.a aVar) {
        super(1);
        this.h = aVar;
    }

    @Override // com.amazon.aps.iva.xb0.l
    public final CharSequence invoke(String str) {
        String str2 = str;
        j.f(str2, "$this$showOptions");
        return this.h.invoke(str2);
    }
}
