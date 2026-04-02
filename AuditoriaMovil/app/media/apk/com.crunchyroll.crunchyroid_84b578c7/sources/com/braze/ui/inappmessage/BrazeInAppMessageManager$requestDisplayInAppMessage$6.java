package com.braze.ui.inappmessage;

import com.amazon.aps.iva.xb0.a;
import com.amazon.aps.iva.yb0.l;
import kotlin.Metadata;
/* compiled from: BrazeInAppMessageManager.kt */
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class BrazeInAppMessageManager$requestDisplayInAppMessage$6 extends l implements a<String> {
    public static final BrazeInAppMessageManager$requestDisplayInAppMessage$6 INSTANCE = new BrazeInAppMessageManager$requestDisplayInAppMessage$6();

    public BrazeInAppMessageManager$requestDisplayInAppMessage$6() {
        super(0);
    }

    @Override // com.amazon.aps.iva.xb0.a
    public final String invoke() {
        return "The IInAppMessageManagerListener method beforeInAppMessageDisplayed returned DISPLAY_LATER. The in-app message will be pushed back onto the stack.";
    }
}
