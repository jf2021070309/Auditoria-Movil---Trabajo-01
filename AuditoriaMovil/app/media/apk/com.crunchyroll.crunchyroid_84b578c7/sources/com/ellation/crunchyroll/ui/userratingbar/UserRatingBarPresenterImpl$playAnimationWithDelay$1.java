package com.ellation.crunchyroll.ui.userratingbar;

import com.amazon.aps.iva.kb0.q;
import com.amazon.aps.iva.xb0.a;
import com.amazon.aps.iva.yb0.l;
import kotlin.Metadata;
/* compiled from: UserRatingBarPresenter.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lcom/amazon/aps/iva/kb0/q;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
/* loaded from: classes2.dex */
public final class UserRatingBarPresenterImpl$playAnimationWithDelay$1 extends l implements a<q> {
    final /* synthetic */ int $i;
    final /* synthetic */ UserRatingBarPresenterImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UserRatingBarPresenterImpl$playAnimationWithDelay$1(UserRatingBarPresenterImpl userRatingBarPresenterImpl, int i) {
        super(0);
        this.this$0 = userRatingBarPresenterImpl;
        this.$i = i;
    }

    @Override // com.amazon.aps.iva.xb0.a
    public /* bridge */ /* synthetic */ q invoke() {
        invoke2();
        return q.a;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2() {
        UserRatingBarView view;
        view = this.this$0.getView();
        view.animateStar(this.$i);
    }
}
