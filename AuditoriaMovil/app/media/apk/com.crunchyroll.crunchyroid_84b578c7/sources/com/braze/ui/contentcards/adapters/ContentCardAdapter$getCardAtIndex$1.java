package com.braze.ui.contentcards.adapters;

import com.amazon.aps.iva.xb0.a;
import com.amazon.aps.iva.yb0.l;
import java.util.List;
import kotlin.Metadata;
/* compiled from: ContentCardAdapter.kt */
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class ContentCardAdapter$getCardAtIndex$1 extends l implements a<String> {
    final /* synthetic */ int $index;
    final /* synthetic */ ContentCardAdapter this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ContentCardAdapter$getCardAtIndex$1(int i, ContentCardAdapter contentCardAdapter) {
        super(0);
        this.$index = i;
        this.this$0 = contentCardAdapter;
    }

    @Override // com.amazon.aps.iva.xb0.a
    public final String invoke() {
        List list;
        StringBuilder sb = new StringBuilder("Cannot return card at index: ");
        sb.append(this.$index);
        sb.append(" in cards list of size: ");
        list = this.this$0.cardData;
        sb.append(list.size());
        return sb.toString();
    }
}
