package com.ellation.crunchyroll.ui;

import android.text.TextUtils;
import com.amazon.aps.iva.a1.f;
import com.amazon.aps.iva.ff0.b;
import com.amazon.aps.iva.xb0.l;
import com.amazon.aps.iva.xb0.p;
import com.amazon.aps.iva.yb0.j;
import com.google.android.gms.ads.RequestConfiguration;
import java.util.Locale;
import kotlin.Metadata;
/* compiled from: ModifierExtensions.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\f\u0010\u0001\u001a\u00020\u0000*\u00020\u0000H\u0007\u001a;\u0010\u0006\u001a\u00020\u0000\"\u0004\b\u0000\u0010\u0002*\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00018\u00002\u0018\u0010\u0005\u001a\u0014\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00000\u0004¢\u0006\u0004\b\u0006\u0010\u0007\u001a>\u0010\r\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\t\u001a\u00020\b2\u0016\b\u0002\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u0000\u0018\u00010\n2\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00000\n¨\u0006\u000e"}, d2 = {"Lcom/amazon/aps/iva/a1/f;", "mirrorForRtl", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "property", "Lkotlin/Function2;", "action", "ifNotNull", "(Lcom/amazon/aps/iva/a1/f;Ljava/lang/Object;Lcom/amazon/aps/iva/xb0/p;)Lcom/amazon/aps/iva/a1/f;", "", "condition", "Lkotlin/Function1;", "ifFalse", "ifTrue", "conditional", "ui_release"}, k = 2, mv = {1, 8, 0})
/* loaded from: classes2.dex */
public final class ModifierExtensionsKt {
    public static final f conditional(f fVar, boolean z, l<? super f, ? extends f> lVar, l<? super f, ? extends f> lVar2) {
        j.f(fVar, "<this>");
        j.f(lVar2, "ifTrue");
        if (z) {
            int i = f.a;
            return fVar.o(lVar2.invoke(f.a.c));
        } else if (lVar != null) {
            int i2 = f.a;
            return fVar.o(lVar.invoke(f.a.c));
        } else {
            return fVar;
        }
    }

    public static /* synthetic */ f conditional$default(f fVar, boolean z, l lVar, l lVar2, int i, Object obj) {
        if ((i & 2) != 0) {
            lVar = null;
        }
        return conditional(fVar, z, lVar, lVar2);
    }

    public static final <T> f ifNotNull(f fVar, T t, p<? super f, ? super T, ? extends f> pVar) {
        boolean z;
        j.f(fVar, "<this>");
        j.f(pVar, "action");
        if (t != null) {
            z = true;
        } else {
            z = false;
        }
        return conditional$default(fVar, z, null, new ModifierExtensionsKt$ifNotNull$1(pVar, t), 2, null);
    }

    public static final f mirrorForRtl(f fVar) {
        j.f(fVar, "<this>");
        Locale locale = Locale.getDefault();
        j.e(locale, "getDefault()");
        if (TextUtils.getLayoutDirectionFromLocale(locale) == 1) {
            return b.C(fVar, -1.0f, 1.0f);
        }
        return fVar;
    }
}
