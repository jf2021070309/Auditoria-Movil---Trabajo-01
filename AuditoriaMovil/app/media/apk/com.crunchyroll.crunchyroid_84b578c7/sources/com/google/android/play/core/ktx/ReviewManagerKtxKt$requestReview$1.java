package com.google.android.play.core.ktx;

import com.amazon.aps.iva.ob0.d;
import com.amazon.aps.iva.qb0.c;
import com.amazon.aps.iva.qb0.e;
import kotlin.Metadata;
/* compiled from: com.google.android.play:review-ktx@@2.0.1 */
@e(c = "com.google.android.play.core.ktx.ReviewManagerKtxKt", f = "ReviewManagerKtx.kt", l = {22}, m = "requestReview")
@Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes3.dex */
public final class ReviewManagerKtxKt$requestReview$1 extends c {
    int label;
    /* synthetic */ Object result;

    public ReviewManagerKtxKt$requestReview$1(d<? super ReviewManagerKtxKt$requestReview$1> dVar) {
        super(dVar);
    }

    @Override // com.amazon.aps.iva.qb0.a
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return ReviewManagerKtxKt.requestReview(null, this);
    }
}
