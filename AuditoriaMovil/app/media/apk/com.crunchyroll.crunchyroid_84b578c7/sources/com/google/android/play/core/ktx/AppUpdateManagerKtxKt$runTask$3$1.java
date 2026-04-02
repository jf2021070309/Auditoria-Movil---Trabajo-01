package com.google.android.play.core.ktx;

import com.amazon.aps.iva.kb0.q;
import com.amazon.aps.iva.xb0.a;
import com.amazon.aps.iva.yb0.l;
import com.google.android.gms.ads.RequestConfiguration;
import kotlin.Metadata;
/* compiled from: com.google.android.play:app-update-ktx@@2.1.0 */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u00002\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {RequestConfiguration.MAX_AD_CONTENT_RATING_T, "", "it", "Lcom/amazon/aps/iva/kb0/q;", "invoke", "(Ljava/lang/Throwable;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
/* loaded from: classes3.dex */
public final class AppUpdateManagerKtxKt$runTask$3$1 extends l implements com.amazon.aps.iva.xb0.l<Throwable, q> {
    final /* synthetic */ a<q> $onCanceled;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AppUpdateManagerKtxKt$runTask$3$1(a<q> aVar) {
        super(1);
        this.$onCanceled = aVar;
    }

    @Override // com.amazon.aps.iva.xb0.l
    public final /* bridge */ /* synthetic */ q invoke(Throwable th) {
        invoke2(th);
        return q.a;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(Throwable th) {
        this.$onCanceled.invoke();
    }
}
