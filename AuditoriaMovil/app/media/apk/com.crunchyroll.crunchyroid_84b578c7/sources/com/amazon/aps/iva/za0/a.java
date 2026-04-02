package com.amazon.aps.iva.za0;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import com.amazon.aps.iva.ya0.d;
/* compiled from: -FallbackViewCreationInterceptor.kt */
/* loaded from: classes4.dex */
public final class a implements d {
    @Override // com.amazon.aps.iva.ya0.d
    public final com.amazon.aps.iva.ya0.c a(b bVar) {
        com.amazon.aps.iva.ya0.b bVar2 = bVar.c;
        com.amazon.aps.iva.ya0.a aVar = bVar2.e;
        View view = bVar2.d;
        String str = bVar2.a;
        Context context = bVar2.b;
        AttributeSet attributeSet = bVar2.c;
        View onCreateView = aVar.onCreateView(view, str, context, attributeSet);
        if (onCreateView != null) {
            str = onCreateView.getClass().getName();
        }
        return new com.amazon.aps.iva.ya0.c(onCreateView, str, context, attributeSet);
    }
}
