package com.braze.ui.actions.brazeactions;

import com.amazon.aps.iva.xb0.a;
import com.amazon.aps.iva.yb0.l;
import kotlin.Metadata;
/* compiled from: BrazeActionParser.kt */
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class BrazeActionParser$execute$2 extends l implements a<String> {
    public static final BrazeActionParser$execute$2 INSTANCE = new BrazeActionParser$execute$2();

    public BrazeActionParser$execute$2() {
        super(0);
    }

    @Override // com.amazon.aps.iva.xb0.a
    public final String invoke() {
        return "Failed to decode Braze Action into both version and json components. Doing nothing.";
    }
}
