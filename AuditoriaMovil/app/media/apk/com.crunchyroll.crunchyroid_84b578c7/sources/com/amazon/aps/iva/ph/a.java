package com.amazon.aps.iva.ph;

import androidx.fragment.app.h;
import com.amazon.aps.iva.f20.k;
import com.amazon.aps.iva.i5.o;
import com.amazon.aps.iva.js.i;
import com.amazon.aps.iva.wh.d;
import com.amazon.aps.iva.wh.e;
import com.amazon.aps.iva.xh.b;
import com.amazon.aps.iva.z20.g;
/* compiled from: MultitierSubscriptionFeature.kt */
/* loaded from: classes.dex */
public interface a {

    /* compiled from: MultitierSubscriptionFeature.kt */
    /* renamed from: com.amazon.aps.iva.ph.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C0616a {
        public static /* synthetic */ b a(a aVar, o oVar, com.amazon.aps.iva.xh.a aVar2, String str, com.amazon.aps.iva.vw.a aVar3, i iVar, int i) {
            String str2;
            com.amazon.aps.iva.vw.a aVar4;
            if ((i & 2) != 0) {
                aVar2 = com.amazon.aps.iva.xh.a.CR_PLUS;
            }
            com.amazon.aps.iva.xh.a aVar5 = aVar2;
            if ((i & 4) != 0) {
                str2 = null;
            } else {
                str2 = str;
            }
            if ((i & 8) != 0) {
                aVar4 = null;
            } else {
                aVar4 = aVar3;
            }
            if ((i & 16) != 0) {
                iVar = i.CR_VOD_ACQUISITION;
            }
            return aVar.r(oVar, aVar5, str2, aVar4, iVar);
        }
    }

    k b(o oVar);

    d c();

    com.amazon.aps.iva.uh.a k();

    e l();

    g p(h hVar);

    com.amazon.aps.iva.s20.g r(o oVar, com.amazon.aps.iva.xh.a aVar, String str, com.amazon.aps.iva.vw.a aVar2, i iVar);
}
