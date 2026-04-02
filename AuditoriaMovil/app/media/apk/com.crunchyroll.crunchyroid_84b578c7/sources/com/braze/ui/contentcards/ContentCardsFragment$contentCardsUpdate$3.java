package com.braze.ui.contentcards;

import com.amazon.aps.iva.xb0.a;
import com.amazon.aps.iva.yb0.l;
import kotlin.Metadata;
/* compiled from: ContentCardsFragment.kt */
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class ContentCardsFragment$contentCardsUpdate$3 extends l implements a<String> {
    public static final ContentCardsFragment$contentCardsUpdate$3 INSTANCE = new ContentCardsFragment$contentCardsUpdate$3();

    public ContentCardsFragment$contentCardsUpdate$3() {
        super(0);
    }

    @Override // com.amazon.aps.iva.xb0.a
    public final String invoke() {
        return "ContentCards received was older than the max time to live of 60 seconds, displaying it for now, but requesting an updated view from the server.";
    }
}
