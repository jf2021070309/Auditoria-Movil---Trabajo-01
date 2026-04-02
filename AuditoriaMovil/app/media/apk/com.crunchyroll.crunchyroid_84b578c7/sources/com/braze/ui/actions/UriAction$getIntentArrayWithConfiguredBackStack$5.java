package com.braze.ui.actions;

import com.amazon.aps.iva.xb0.a;
import com.amazon.aps.iva.yb0.l;
import kotlin.Metadata;
/* compiled from: UriAction.kt */
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class UriAction$getIntentArrayWithConfiguredBackStack$5 extends l implements a<String> {
    public static final UriAction$getIntentArrayWithConfiguredBackStack$5 INSTANCE = new UriAction$getIntentArrayWithConfiguredBackStack$5();

    public UriAction$getIntentArrayWithConfiguredBackStack$5() {
        super(0);
    }

    @Override // com.amazon.aps.iva.xb0.a
    public final String invoke() {
        return "Not adding back stack activity while opening uri from push due to disabled configuration setting.";
    }
}
