package com.braze.ui.actions.brazeactions.steps;

import com.amazon.aps.iva.kb0.q;
import com.amazon.aps.iva.yb0.j;
import com.amazon.aps.iva.yb0.l;
import com.braze.BrazeUser;
import kotlin.Metadata;
/* compiled from: AddToSubscriptionGroupStep.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/braze/BrazeUser;", "it", "Lcom/amazon/aps/iva/kb0/q;", "invoke", "(Lcom/braze/BrazeUser;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class AddToSubscriptionGroupStep$run$1 extends l implements com.amazon.aps.iva.xb0.l<BrazeUser, q> {
    final /* synthetic */ String $subscriptionGroupId;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AddToSubscriptionGroupStep$run$1(String str) {
        super(1);
        this.$subscriptionGroupId = str;
    }

    @Override // com.amazon.aps.iva.xb0.l
    public /* bridge */ /* synthetic */ q invoke(BrazeUser brazeUser) {
        invoke2(brazeUser);
        return q.a;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(BrazeUser brazeUser) {
        j.f(brazeUser, "it");
        brazeUser.addToSubscriptionGroup(this.$subscriptionGroupId);
    }
}
