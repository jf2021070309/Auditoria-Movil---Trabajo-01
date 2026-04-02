package com.ellation.crunchyroll.presentation.multitiersubscription.success.bento;

import android.os.Build;
import android.os.Bundle;
import com.amazon.aps.iva.h30.k;
import com.amazon.aps.iva.kb0.q;
import com.amazon.aps.iva.o0.e0;
import com.amazon.aps.iva.o0.i;
import com.amazon.aps.iva.xb0.p;
import com.amazon.aps.iva.yb0.j;
import com.amazon.aps.iva.yb0.l;
/* compiled from: BentoCheckoutSuccessActivity.kt */
/* loaded from: classes2.dex */
public final class a extends l implements p<i, Integer, q> {
    public final /* synthetic */ BentoCheckoutSuccessActivity h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(BentoCheckoutSuccessActivity bentoCheckoutSuccessActivity) {
        super(2);
        this.h = bentoCheckoutSuccessActivity;
    }

    @Override // com.amazon.aps.iva.xb0.p
    public final q invoke(i iVar, Integer num) {
        com.amazon.aps.iva.xh.a aVar;
        Object obj;
        i iVar2 = iVar;
        if ((num.intValue() & 11) == 2 && iVar2.h()) {
            iVar2.A();
        } else {
            e0.b bVar = e0.a;
            BentoCheckoutSuccessActivity bentoCheckoutSuccessActivity = this.h;
            Bundle extras = bentoCheckoutSuccessActivity.getIntent().getExtras();
            if (extras != null) {
                if (Build.VERSION.SDK_INT >= 33) {
                    obj = extras.getSerializable("bento_screen_type", com.amazon.aps.iva.xh.a.class);
                } else {
                    obj = (com.amazon.aps.iva.xh.a) extras.getSerializable("bento_screen_type");
                }
                aVar = (com.amazon.aps.iva.xh.a) obj;
            } else {
                aVar = null;
            }
            com.amazon.aps.iva.xh.a aVar2 = aVar;
            j.c(aVar2);
            com.amazon.aps.iva.h30.a.a(aVar2, (k) bentoCheckoutSuccessActivity.k.getValue(bentoCheckoutSuccessActivity, BentoCheckoutSuccessActivity.m[0]), null, iVar2, 64, 4);
        }
        return q.a;
    }
}
