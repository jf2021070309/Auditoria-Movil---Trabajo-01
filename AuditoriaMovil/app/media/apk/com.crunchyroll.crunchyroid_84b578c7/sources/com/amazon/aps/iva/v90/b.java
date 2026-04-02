package com.amazon.aps.iva.v90;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.Resources;
import com.amazon.aps.iva.fc0.l;
import com.amazon.aps.iva.kb0.m;
import com.amazon.aps.iva.q.l1;
import com.amazon.aps.iva.yb0.e0;
import com.amazon.aps.iva.yb0.v;
/* compiled from: PhilologyContextWrapper.kt */
@SuppressLint({"RestrictedApi"})
/* loaded from: classes4.dex */
public final class b extends ContextWrapper {
    public static final /* synthetic */ l[] b = {e0.c(new v(e0.a(b.class), "res", "getRes()Landroid/content/res/Resources;"))};
    public final m a;

    /* compiled from: PhilologyContextWrapper.kt */
    /* loaded from: classes4.dex */
    public static final class a extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a<Resources> {
        public a() {
            super(0);
        }

        @Override // com.amazon.aps.iva.xb0.a
        public final Resources invoke() {
            Resources resources = b.super.getResources();
            int i = l1.a;
            com.amazon.aps.iva.yb0.j.b(resources, "baseResources");
            return new g(resources);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(Context context) {
        super(context);
        com.amazon.aps.iva.yb0.j.g(context, "base");
        this.a = com.amazon.aps.iva.kb0.f.b(new a());
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final Resources getResources() {
        l lVar = b[0];
        return (Resources) this.a.getValue();
    }
}
