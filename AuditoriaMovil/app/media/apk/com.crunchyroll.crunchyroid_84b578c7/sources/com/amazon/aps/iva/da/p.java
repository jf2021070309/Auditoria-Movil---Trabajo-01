package com.amazon.aps.iva.da;

import android.content.Context;
import android.graphics.Typeface;
import com.amazon.aps.iva.ab.x;
import com.amazon.aps.iva.se0.g0;
/* compiled from: rememberLottieComposition.kt */
@com.amazon.aps.iva.qb0.e(c = "com.airbnb.lottie.compose.RememberLottieCompositionKt$loadFontsFromAssets$2", f = "rememberLottieComposition.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class p extends com.amazon.aps.iva.qb0.i implements com.amazon.aps.iva.xb0.p<g0, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q>, Object> {
    public final /* synthetic */ com.amazon.aps.iva.z9.h h;
    public final /* synthetic */ Context i;
    public final /* synthetic */ String j;
    public final /* synthetic */ String k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(Context context, com.amazon.aps.iva.z9.h hVar, String str, String str2, com.amazon.aps.iva.ob0.d dVar) {
        super(2, dVar);
        this.h = hVar;
        this.i = context;
        this.j = str;
        this.k = str2;
    }

    @Override // com.amazon.aps.iva.qb0.a
    public final com.amazon.aps.iva.ob0.d<com.amazon.aps.iva.kb0.q> create(Object obj, com.amazon.aps.iva.ob0.d<?> dVar) {
        return new p(this.i, this.h, this.j, this.k, dVar);
    }

    @Override // com.amazon.aps.iva.xb0.p
    public final Object invoke(g0 g0Var, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q> dVar) {
        return ((p) create(g0Var, dVar)).invokeSuspend(com.amazon.aps.iva.kb0.q.a);
    }

    @Override // com.amazon.aps.iva.qb0.a
    public final Object invokeSuspend(Object obj) {
        com.amazon.aps.iva.pb0.a aVar = com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED;
        x.i0(obj);
        for (com.amazon.aps.iva.fa.c cVar : this.h.e.values()) {
            Context context = this.i;
            com.amazon.aps.iva.yb0.j.e(cVar, "font");
            StringBuilder sb = new StringBuilder();
            sb.append((Object) this.j);
            String str = cVar.c;
            sb.append((Object) cVar.a);
            sb.append(this.k);
            try {
                Typeface createFromAsset = Typeface.createFromAsset(context.getAssets(), sb.toString());
                try {
                    com.amazon.aps.iva.yb0.j.e(createFromAsset, "typefaceWithDefaultStyle");
                    com.amazon.aps.iva.yb0.j.e(str, "font.style");
                    int i = 0;
                    boolean i0 = com.amazon.aps.iva.oe0.q.i0(str, "Italic", false);
                    boolean i02 = com.amazon.aps.iva.oe0.q.i0(str, "Bold", false);
                    if (i0 && i02) {
                        i = 3;
                    } else if (i0) {
                        i = 2;
                    } else if (i02) {
                        i = 1;
                    }
                    if (createFromAsset.getStyle() != i) {
                        createFromAsset = Typeface.create(createFromAsset, i);
                    }
                    cVar.d = createFromAsset;
                } catch (Exception unused) {
                    com.amazon.aps.iva.ma.c.a.getClass();
                }
            } catch (Exception unused2) {
                com.amazon.aps.iva.ma.c.a.getClass();
            }
        }
        return com.amazon.aps.iva.kb0.q.a;
    }
}
