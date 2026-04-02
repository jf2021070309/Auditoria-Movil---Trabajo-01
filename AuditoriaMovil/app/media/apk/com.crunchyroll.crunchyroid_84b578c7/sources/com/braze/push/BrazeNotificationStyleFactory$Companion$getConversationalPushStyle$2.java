package com.braze.push;

import com.amazon.aps.iva.xb0.a;
import com.amazon.aps.iva.yb0.l;
import com.braze.models.push.BrazeNotificationPayload;
import kotlin.Metadata;
/* compiled from: BrazeNotificationStyleFactory.kt */
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class BrazeNotificationStyleFactory$Companion$getConversationalPushStyle$2 extends l implements a<String> {
    final /* synthetic */ BrazeNotificationPayload.ConversationMessage $message;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BrazeNotificationStyleFactory$Companion$getConversationalPushStyle$2(BrazeNotificationPayload.ConversationMessage conversationMessage) {
        super(0);
        this.$message = conversationMessage;
    }

    @Override // com.amazon.aps.iva.xb0.a
    public final String invoke() {
        return "Message person does not exist in mapping. Not rendering a style. " + this.$message;
    }
}
