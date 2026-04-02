package com.braze.ui.support;

import com.amazon.aps.iva.xb0.a;
import com.amazon.aps.iva.yb0.l;
import com.braze.enums.inappmessage.Orientation;
import kotlin.Metadata;
/* compiled from: ViewUtils.kt */
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class ViewUtils$isCurrentOrientationValid$3 extends l implements a<String> {
    final /* synthetic */ int $currentScreenOrientation;
    final /* synthetic */ Orientation $preferredOrientation;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ViewUtils$isCurrentOrientationValid$3(int i, Orientation orientation) {
        super(0);
        this.$currentScreenOrientation = i;
        this.$preferredOrientation = orientation;
    }

    @Override // com.amazon.aps.iva.xb0.a
    public final String invoke() {
        return "Current orientation " + this.$currentScreenOrientation + " and preferred orientation " + this.$preferredOrientation + " don't match";
    }
}
