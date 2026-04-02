package com.ellation.crunchyroll.ui;

import com.amazon.aps.iva.a1.f;
import com.amazon.aps.iva.xb0.p;
import com.amazon.aps.iva.yb0.j;
import com.amazon.aps.iva.yb0.l;
import com.google.android.gms.ads.RequestConfiguration;
import kotlin.Metadata;
/* compiled from: ModifierExtensions.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {RequestConfiguration.MAX_AD_CONTENT_RATING_T, "Lcom/amazon/aps/iva/a1/f;", "invoke", "(Lcom/amazon/aps/iva/a1/f;)Lcom/amazon/aps/iva/a1/f;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
/* loaded from: classes2.dex */
public final class ModifierExtensionsKt$ifNotNull$1 extends l implements com.amazon.aps.iva.xb0.l<f, f> {
    final /* synthetic */ p<f, T, f> $action;
    final /* synthetic */ T $property;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ModifierExtensionsKt$ifNotNull$1(p<? super f, ? super T, ? extends f> pVar, T t) {
        super(1);
        this.$action = pVar;
        this.$property = t;
    }

    @Override // com.amazon.aps.iva.xb0.l
    public final f invoke(f fVar) {
        j.f(fVar, "$this$conditional");
        p<f, T, f> pVar = this.$action;
        T t = this.$property;
        j.c(t);
        return pVar.invoke(fVar, t);
    }
}
