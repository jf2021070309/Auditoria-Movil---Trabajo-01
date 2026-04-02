package com.braze.ui.actions.brazeactions;

import android.net.Uri;
import com.amazon.aps.iva.xb0.a;
import com.amazon.aps.iva.yb0.l;
import com.braze.enums.Channel;
import kotlin.Metadata;
/* compiled from: BrazeActionParser.kt */
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class BrazeActionParser$execute$1 extends l implements a<String> {
    final /* synthetic */ Channel $channel;
    final /* synthetic */ Uri $uri;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BrazeActionParser$execute$1(Channel channel, Uri uri) {
        super(0);
        this.$channel = channel;
        this.$uri = uri;
    }

    @Override // com.amazon.aps.iva.xb0.a
    public final String invoke() {
        return "Attempting to parse Braze Action with channel " + this.$channel + " and uri:\n'" + this.$uri + '\'';
    }
}
