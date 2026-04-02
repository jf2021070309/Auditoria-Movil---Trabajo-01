package com.ellation.crunchyroll.ui.duration;

import android.content.Context;
import com.amazon.aps.iva.xb0.a;
import com.amazon.aps.iva.yb0.l;
import com.ellation.crunchyroll.ui.duration.SmallDurationFormatter;
import com.ellation.crunchyroll.ui.duration.SmallDurationLabelPresenter;
import kotlin.Metadata;
/* compiled from: SmallDurationLabel.kt */
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/ellation/crunchyroll/ui/duration/SmallDurationLabelPresenter;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class SmallDurationLabel$presenter$2 extends l implements a<SmallDurationLabelPresenter> {
    final /* synthetic */ Context $context;
    final /* synthetic */ SmallDurationLabel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SmallDurationLabel$presenter$2(SmallDurationLabel smallDurationLabel, Context context) {
        super(0);
        this.this$0 = smallDurationLabel;
        this.$context = context;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.amazon.aps.iva.xb0.a
    public final SmallDurationLabelPresenter invoke() {
        SmallDurationLabelPresenter.Companion companion = SmallDurationLabelPresenter.Companion;
        SmallDurationLabel smallDurationLabel = this.this$0;
        SmallDurationFormatter.Companion companion2 = SmallDurationFormatter.Companion;
        Context context = this.$context;
        return companion.create(smallDurationLabel, companion2.create(context, DurationFormatter.Companion.create(context)));
    }
}
