package com.braze.ui.inappmessage.listeners;

import android.net.Uri;
import com.amazon.aps.iva.xb0.a;
import com.amazon.aps.iva.yb0.l;
import kotlin.Metadata;
/* compiled from: DefaultInAppMessageWebViewClientListener.kt */
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class DefaultInAppMessageWebViewClientListener$onOtherUrlAction$5 extends l implements a<String> {
    final /* synthetic */ Uri $uri;
    final /* synthetic */ String $url;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DefaultInAppMessageWebViewClientListener$onOtherUrlAction$5(Uri uri, String str) {
        super(0);
        this.$uri = uri;
        this.$url = str;
    }

    @Override // com.amazon.aps.iva.xb0.a
    public final String invoke() {
        return "Not passing local uri to BrazeDeeplinkHandler. Got local uri: " + this.$uri + " for url: " + this.$url;
    }
}
