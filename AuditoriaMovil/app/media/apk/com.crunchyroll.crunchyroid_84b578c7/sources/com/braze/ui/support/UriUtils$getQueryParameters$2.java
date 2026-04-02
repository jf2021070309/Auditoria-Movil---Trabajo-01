package com.braze.ui.support;

import android.net.Uri;
import com.amazon.aps.iva.xb0.a;
import com.amazon.aps.iva.yb0.d0;
import com.amazon.aps.iva.yb0.l;
import kotlin.Metadata;
/* compiled from: UriUtils.kt */
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class UriUtils$getQueryParameters$2 extends l implements a<String> {
    final /* synthetic */ d0<Uri> $uri;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UriUtils$getQueryParameters$2(d0<Uri> d0Var) {
        super(0);
        this.$uri = d0Var;
    }

    @Override // com.amazon.aps.iva.xb0.a
    public final String invoke() {
        return "Failed to map the query parameters of Uri: " + this.$uri.b;
    }
}
