package com.amazon.aps.iva.o60;

import android.content.Context;
import android.content.ContextWrapper;
import com.amazon.aps.iva.k.v;
import com.amazon.aps.iva.k.w;
/* compiled from: TranslationsAppCompatDelegateHolder.kt */
/* loaded from: classes2.dex */
public final class b {
    public final w a = new w(7);

    /* compiled from: TranslationsAppCompatDelegateHolder.kt */
    /* loaded from: classes2.dex */
    public /* synthetic */ class a extends com.amazon.aps.iva.yb0.i implements com.amazon.aps.iva.xb0.l<Context, ContextWrapper> {
        public static final a b = new a();

        public a() {
            super(1, e.class, "wrapInLocalizationContext", "wrapInLocalizationContext(Landroid/content/Context;)Landroid/content/ContextWrapper;", 1);
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final ContextWrapper invoke(Context context) {
            Context context2 = context;
            com.amazon.aps.iva.yb0.j.f(context2, "p0");
            return e.a(context2);
        }
    }

    public final com.amazon.aps.iva.k.f a(com.amazon.aps.iva.k.f fVar) {
        a aVar = a.b;
        w wVar = this.a;
        wVar.getClass();
        com.amazon.aps.iva.yb0.j.g(aVar, "onAttachBaseContext");
        com.amazon.aps.iva.k.f fVar2 = (com.amazon.aps.iva.k.f) wVar.b;
        if (fVar2 == null) {
            v vVar = new v(fVar, aVar);
            wVar.b = vVar;
            return vVar;
        }
        return fVar2;
    }
}
