package com.braze.ui.inappmessage.jsinterface;

import com.amazon.aps.iva.xb0.a;
import com.amazon.aps.iva.yb0.l;
import kotlin.Metadata;
/* compiled from: InAppMessageUserJavascriptInterface.kt */
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class InAppMessageUserJavascriptInterface$setDateOfBirth$1 extends l implements a<String> {
    final /* synthetic */ int $monthInt;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InAppMessageUserJavascriptInterface$setDateOfBirth$1(int i) {
        super(0);
        this.$monthInt = i;
    }

    @Override // com.amazon.aps.iva.xb0.a
    public final String invoke() {
        return "Failed to parse month for value " + this.$monthInt;
    }
}
