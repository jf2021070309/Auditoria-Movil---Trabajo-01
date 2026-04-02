package com.amazon.aps.iva.hl;

import android.content.Context;
import java.util.List;
/* compiled from: RestrictionOverlayModule.kt */
/* loaded from: classes2.dex */
public final class z implements com.amazon.aps.iva.rf.b, com.amazon.aps.iva.kh.e {
    public final /* synthetic */ com.amazon.aps.iva.kh.e a;

    public z(Context context) {
        com.amazon.aps.iva.kh.d dVar = com.amazon.aps.iva.gy.t.a;
        if (dVar != null) {
            this.a = dVar.a(context);
        } else {
            com.amazon.aps.iva.yb0.j.m("instance");
            throw null;
        }
    }

    @Override // com.amazon.aps.iva.kh.e
    public final List<com.amazon.aps.iva.jh.f> getOptions() {
        return this.a.getOptions();
    }

    @Override // com.amazon.aps.iva.kh.e
    public final String getSupportedAudioLanguageTag(String str) {
        com.amazon.aps.iva.yb0.j.f(str, "systemLanguageTag");
        return this.a.getSupportedAudioLanguageTag(str);
    }

    @Override // com.amazon.aps.iva.rf.b, com.amazon.aps.iva.kh.e
    public final String getTitleForLanguage(String str) {
        com.amazon.aps.iva.yb0.j.f(str, "language");
        return this.a.getTitleForLanguage(str);
    }

    @Override // com.amazon.aps.iva.kh.e
    public final String getTruncatedTitleForLanguage(String str) {
        com.amazon.aps.iva.yb0.j.f(str, "language");
        return this.a.getTruncatedTitleForLanguage(str);
    }
}
