package com.amazon.aps.iva.h2;

import com.amazon.aps.iva.h2.f;
/* compiled from: FontListFontFamilyTypefaceAdapter.kt */
@com.amazon.aps.iva.qb0.e(c = "androidx.compose.ui.text.font.AsyncTypefaceCache", f = "FontListFontFamilyTypefaceAdapter.kt", l = {394}, m = "runCached")
/* loaded from: classes.dex */
public final class g extends com.amazon.aps.iva.qb0.c {
    public f h;
    public f.b i;
    public boolean j;
    public /* synthetic */ Object k;
    public final /* synthetic */ f l;
    public int m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(f fVar, com.amazon.aps.iva.ob0.d<? super g> dVar) {
        super(dVar);
        this.l = fVar;
    }

    @Override // com.amazon.aps.iva.qb0.a
    public final Object invokeSuspend(Object obj) {
        this.k = obj;
        this.m |= Integer.MIN_VALUE;
        return this.l.b(null, null, null, this);
    }
}
