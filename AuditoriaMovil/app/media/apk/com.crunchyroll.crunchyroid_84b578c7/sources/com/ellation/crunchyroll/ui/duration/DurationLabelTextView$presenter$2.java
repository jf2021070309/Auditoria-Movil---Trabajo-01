package com.ellation.crunchyroll.ui.duration;

import android.content.Context;
import com.amazon.aps.iva.xb0.a;
import com.amazon.aps.iva.yb0.l;
import kotlin.Metadata;
/* compiled from: DurationLabelTextView.kt */
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/ellation/crunchyroll/ui/duration/DurationLabelPresenter;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class DurationLabelTextView$presenter$2 extends l implements a<DurationLabelPresenter> {
    final /* synthetic */ Context $context;
    final /* synthetic */ DurationLabelTextView this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DurationLabelTextView$presenter$2(DurationLabelTextView durationLabelTextView, Context context) {
        super(0);
        this.this$0 = durationLabelTextView;
        this.$context = context;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.amazon.aps.iva.xb0.a
    public final DurationLabelPresenter invoke() {
        return DurationLabelPresenter.Companion.create(this.this$0, DurationFormatter.Companion.create(this.$context));
    }
}
