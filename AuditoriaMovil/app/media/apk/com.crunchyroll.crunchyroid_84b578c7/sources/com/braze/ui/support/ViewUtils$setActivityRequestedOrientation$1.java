package com.braze.ui.support;

import android.app.Activity;
import com.amazon.aps.iva.xb0.a;
import com.amazon.aps.iva.yb0.l;
import kotlin.Metadata;
/* compiled from: ViewUtils.kt */
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class ViewUtils$setActivityRequestedOrientation$1 extends l implements a<String> {
    final /* synthetic */ int $requestedOrientation;
    final /* synthetic */ Activity $this_setActivityRequestedOrientation;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ViewUtils$setActivityRequestedOrientation$1(int i, Activity activity) {
        super(0);
        this.$requestedOrientation = i;
        this.$this_setActivityRequestedOrientation = activity;
    }

    @Override // com.amazon.aps.iva.xb0.a
    public final String invoke() {
        return "Failed to set requested orientation " + this.$requestedOrientation + " for activity class: " + this.$this_setActivityRequestedOrientation.getLocalClassName();
    }
}
