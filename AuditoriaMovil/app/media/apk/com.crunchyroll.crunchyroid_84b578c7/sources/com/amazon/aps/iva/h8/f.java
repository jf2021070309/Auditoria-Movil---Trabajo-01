package com.amazon.aps.iva.h8;

import com.amazon.aps.iva.o0.u0;
/* compiled from: Effects.kt */
/* loaded from: classes.dex */
public final class f implements u0 {
    public final /* synthetic */ androidx.navigation.compose.d a;
    public final /* synthetic */ com.amazon.aps.iva.g8.f b;

    public f(androidx.navigation.compose.d dVar, com.amazon.aps.iva.g8.f fVar) {
        this.a = dVar;
        this.b = fVar;
    }

    @Override // com.amazon.aps.iva.o0.u0
    public final void dispose() {
        this.a.b().b(this.b);
    }
}
