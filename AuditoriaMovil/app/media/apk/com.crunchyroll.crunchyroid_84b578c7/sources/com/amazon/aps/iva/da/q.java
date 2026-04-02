package com.amazon.aps.iva.da;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.util.Base64;
import com.amazon.aps.iva.ab.x;
import com.amazon.aps.iva.se0.g0;
import com.amazon.aps.iva.z9.e0;
import java.io.IOException;
import java.io.InputStream;
/* compiled from: rememberLottieComposition.kt */
@com.amazon.aps.iva.qb0.e(c = "com.airbnb.lottie.compose.RememberLottieCompositionKt$loadImagesFromAssets$2", f = "rememberLottieComposition.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class q extends com.amazon.aps.iva.qb0.i implements com.amazon.aps.iva.xb0.p<g0, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q>, Object> {
    public final /* synthetic */ com.amazon.aps.iva.z9.h h;
    public final /* synthetic */ Context i;
    public final /* synthetic */ String j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(Context context, com.amazon.aps.iva.z9.h hVar, String str, com.amazon.aps.iva.ob0.d dVar) {
        super(2, dVar);
        this.h = hVar;
        this.i = context;
        this.j = str;
    }

    @Override // com.amazon.aps.iva.qb0.a
    public final com.amazon.aps.iva.ob0.d<com.amazon.aps.iva.kb0.q> create(Object obj, com.amazon.aps.iva.ob0.d<?> dVar) {
        return new q(this.i, this.h, this.j, dVar);
    }

    @Override // com.amazon.aps.iva.xb0.p
    public final Object invoke(g0 g0Var, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q> dVar) {
        return ((q) create(g0Var, dVar)).invokeSuspend(com.amazon.aps.iva.kb0.q.a);
    }

    @Override // com.amazon.aps.iva.qb0.a
    public final Object invokeSuspend(Object obj) {
        String str;
        com.amazon.aps.iva.pb0.a aVar = com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED;
        x.i0(obj);
        for (e0 e0Var : this.h.d.values()) {
            com.amazon.aps.iva.yb0.j.e(e0Var, "asset");
            Bitmap bitmap = e0Var.d;
            String str2 = e0Var.c;
            if (bitmap == null) {
                com.amazon.aps.iva.yb0.j.e(str2, "filename");
                if (com.amazon.aps.iva.oe0.m.h0(str2, "data:", false) && com.amazon.aps.iva.oe0.q.r0(str2, "base64,", 0, false, 6) > 0) {
                    try {
                        String substring = str2.substring(com.amazon.aps.iva.oe0.q.q0(str2, ',', 0, false, 6) + 1);
                        com.amazon.aps.iva.yb0.j.e(substring, "this as java.lang.String).substring(startIndex)");
                        byte[] decode = Base64.decode(substring, 0);
                        BitmapFactory.Options options = new BitmapFactory.Options();
                        options.inScaled = true;
                        options.inDensity = 160;
                        e0Var.d = BitmapFactory.decodeByteArray(decode, 0, decode.length, options);
                    } catch (IllegalArgumentException e) {
                        com.amazon.aps.iva.ma.c.c("data URL did not have correct base64 format.", e);
                    }
                }
            }
            Context context = this.i;
            if (e0Var.d == null && (str = this.j) != null) {
                try {
                    InputStream open = context.getAssets().open(com.amazon.aps.iva.yb0.j.k(str2, str));
                    com.amazon.aps.iva.yb0.j.e(open, "try {\n        context.as…, e)\n        return\n    }");
                    try {
                        BitmapFactory.Options options2 = new BitmapFactory.Options();
                        options2.inScaled = true;
                        options2.inDensity = 160;
                        e0Var.d = com.amazon.aps.iva.ma.g.e(BitmapFactory.decodeStream(open, null, options2), e0Var.a, e0Var.b);
                    } catch (IllegalArgumentException e2) {
                        com.amazon.aps.iva.ma.c.c("Unable to decode image.", e2);
                    }
                } catch (IOException e3) {
                    com.amazon.aps.iva.ma.c.c("Unable to open asset.", e3);
                }
            }
        }
        return com.amazon.aps.iva.kb0.q.a;
    }
}
