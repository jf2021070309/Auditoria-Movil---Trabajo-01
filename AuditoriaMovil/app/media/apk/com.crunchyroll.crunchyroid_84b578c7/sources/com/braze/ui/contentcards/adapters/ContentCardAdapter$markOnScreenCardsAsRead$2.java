package com.braze.ui.contentcards.adapters;

import com.amazon.aps.iva.xb0.a;
import com.amazon.aps.iva.yb0.l;
import kotlin.Metadata;
/* compiled from: ContentCardAdapter.kt */
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class ContentCardAdapter$markOnScreenCardsAsRead$2 extends l implements a<String> {
    final /* synthetic */ int $firstVisibleIndex;
    final /* synthetic */ int $lastVisibleIndex;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ContentCardAdapter$markOnScreenCardsAsRead$2(int i, int i2) {
        super(0);
        this.$firstVisibleIndex = i;
        this.$lastVisibleIndex = i2;
    }

    @Override // com.amazon.aps.iva.xb0.a
    public final String invoke() {
        return "Not marking all on-screen cards as read. Either the first or last index is negative. First visible: " + this.$firstVisibleIndex + " . Last visible: " + this.$lastVisibleIndex;
    }
}
