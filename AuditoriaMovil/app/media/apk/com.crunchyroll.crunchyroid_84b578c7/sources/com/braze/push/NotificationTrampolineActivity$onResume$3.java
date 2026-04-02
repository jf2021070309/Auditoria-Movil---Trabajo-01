package com.braze.push;

import android.content.Intent;
import com.amazon.aps.iva.xb0.a;
import com.amazon.aps.iva.yb0.l;
import kotlin.Metadata;
/* compiled from: NotificationTrampolineActivity.kt */
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class NotificationTrampolineActivity$onResume$3 extends l implements a<String> {
    final /* synthetic */ Intent $receivedIntent;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NotificationTrampolineActivity$onResume$3(Intent intent) {
        super(0);
        this.$receivedIntent = intent;
    }

    @Override // com.amazon.aps.iva.xb0.a
    public final String invoke() {
        return "Notification trampoline activity received intent: " + this.$receivedIntent;
    }
}
