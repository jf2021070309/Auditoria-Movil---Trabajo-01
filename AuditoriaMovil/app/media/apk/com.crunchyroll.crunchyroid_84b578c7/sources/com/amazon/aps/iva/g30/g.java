package com.amazon.aps.iva.g30;

import android.content.Context;
import com.amazon.aps.iva.js.l0;
import com.amazon.aps.iva.kb0.h;
import com.amazon.aps.iva.yb0.j;
/* compiled from: SubscriptionSuccessRouter.kt */
/* loaded from: classes2.dex */
public interface g {

    /* compiled from: SubscriptionSuccessRouter.kt */
    /* loaded from: classes2.dex */
    public static final class a {

        /* compiled from: SubscriptionSuccessRouter.kt */
        /* renamed from: com.amazon.aps.iva.g30.g$a$a  reason: collision with other inner class name */
        /* loaded from: classes2.dex */
        public /* synthetic */ class C0287a {
            public static final /* synthetic */ int[] a;

            static {
                int[] iArr = new int[com.amazon.aps.iva.xh.a.values().length];
                try {
                    iArr[com.amazon.aps.iva.xh.a.CR_PLUS.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[com.amazon.aps.iva.xh.a.BENTO_GAME.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[com.amazon.aps.iva.xh.a.BENTO_DESCRIPTION.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                a = iArr;
            }
        }

        public static g a(Context context, com.amazon.aps.iva.xh.a aVar, String str, int i) {
            if ((i & 4) != 0) {
                aVar = com.amazon.aps.iva.xh.a.CR_PLUS;
            }
            if ((i & 8) != 0) {
                str = null;
            }
            j.f(context, "context");
            j.f(aVar, "successScreenType");
            int i2 = C0287a.a[aVar.ordinal()];
            if (i2 != 1) {
                if (i2 != 2 && i2 != 3) {
                    throw new h();
                }
                return new com.amazon.aps.iva.g30.a(context, null, aVar, str);
            }
            return new com.ellation.crunchyroll.presentation.multitiersubscription.success.a(context, null);
        }
    }

    void a(com.amazon.aps.iva.wh.a aVar, String str, l0 l0Var, boolean z);
}
