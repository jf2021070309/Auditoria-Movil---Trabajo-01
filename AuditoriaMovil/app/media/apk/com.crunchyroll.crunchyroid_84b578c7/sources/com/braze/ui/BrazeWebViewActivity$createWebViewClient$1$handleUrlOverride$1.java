package com.braze.ui;

import com.amazon.aps.iva.xb0.a;
import com.amazon.aps.iva.yb0.l;
import kotlin.Metadata;
/* compiled from: BrazeWebViewActivity.kt */
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class BrazeWebViewActivity$createWebViewClient$1$handleUrlOverride$1 extends l implements a<String> {
    final /* synthetic */ String $url;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BrazeWebViewActivity$createWebViewClient$1$handleUrlOverride$1(String str) {
        super(0);
        this.$url = str;
    }

    @Override // com.amazon.aps.iva.xb0.a
    public final String invoke() {
        return b.c(new StringBuilder("Unexpected exception while processing url "), this.$url, ". Passing url back to WebView.");
    }
}
