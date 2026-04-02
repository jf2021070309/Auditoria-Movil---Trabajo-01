package com.braze.ui.inappmessage;

import com.amazon.aps.iva.xb0.a;
import com.amazon.aps.iva.yb0.l;
import kotlin.Metadata;
/* compiled from: BrazeInAppMessageManager.kt */
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class BrazeInAppMessageManager$requestDisplayInAppMessage$2 extends l implements a<String> {
    public static final BrazeInAppMessageManager$requestDisplayInAppMessage$2 INSTANCE = new BrazeInAppMessageManager$requestDisplayInAppMessage$2();

    public BrazeInAppMessageManager$requestDisplayInAppMessage$2() {
        super(0);
    }

    @Override // com.amazon.aps.iva.xb0.a
    public final String invoke() {
        return "No activity is currently registered to receive in-app messages and the in-app message stack is empty. Doing nothing.";
    }
}
