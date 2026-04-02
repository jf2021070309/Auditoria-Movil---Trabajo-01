package com.braze.push;

import com.amazon.aps.iva.xb0.a;
import com.amazon.aps.iva.yb0.l;
import kotlin.Metadata;
/* compiled from: BrazeNotificationUtils.kt */
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class BrazeNotificationUtils$getNotificationId$4 extends l implements a<String> {
    final /* synthetic */ int $notificationId;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BrazeNotificationUtils$getNotificationId$4(int i) {
        super(0);
        this.$notificationId = i;
    }

    @Override // com.amazon.aps.iva.xb0.a
    public final String invoke() {
        return "Message without notification id provided in the extras bundle received. Using a hash of the message: " + this.$notificationId;
    }
}
