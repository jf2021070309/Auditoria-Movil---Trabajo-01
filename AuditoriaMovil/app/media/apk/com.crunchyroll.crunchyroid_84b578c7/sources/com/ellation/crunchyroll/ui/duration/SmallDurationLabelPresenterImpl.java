package com.ellation.crunchyroll.ui.duration;

import com.amazon.aps.iva.wy.b;
import com.amazon.aps.iva.wy.j;
import com.ellation.crunchyroll.model.DurationProvider;
import com.ellation.crunchyroll.model.DurationProviderKt;
import com.ellation.crunchyroll.model.PlayheadTimeProvider;
import kotlin.Metadata;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: SmallDurationLabelPresenter.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002B\u0017\u0012\u0006\u0010\r\u001a\u00020\u0003\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u000e\u0010\u000fJ\u0018\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\u0010"}, d2 = {"Lcom/ellation/crunchyroll/ui/duration/SmallDurationLabelPresenterImpl;", "Lcom/ellation/crunchyroll/ui/duration/SmallDurationLabelPresenter;", "Lcom/amazon/aps/iva/wy/b;", "Lcom/ellation/crunchyroll/ui/duration/SmallDurationLabelView;", "Lcom/ellation/crunchyroll/model/PlayheadTimeProvider;", "playheadProvider", "Lcom/ellation/crunchyroll/model/DurationProvider;", "durationProvider", "Lcom/amazon/aps/iva/kb0/q;", "onBind", "Lcom/ellation/crunchyroll/ui/duration/SmallDurationFormatter;", "durationFormatter", "Lcom/ellation/crunchyroll/ui/duration/SmallDurationFormatter;", "view", "<init>", "(Lcom/ellation/crunchyroll/ui/duration/SmallDurationLabelView;Lcom/ellation/crunchyroll/ui/duration/SmallDurationFormatter;)V", "widgets_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes2.dex */
public final class SmallDurationLabelPresenterImpl extends b<SmallDurationLabelView> implements SmallDurationLabelPresenter {
    private final SmallDurationFormatter durationFormatter;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SmallDurationLabelPresenterImpl(SmallDurationLabelView smallDurationLabelView, SmallDurationFormatter smallDurationFormatter) {
        super(smallDurationLabelView, new j[0]);
        com.amazon.aps.iva.yb0.j.f(smallDurationLabelView, "view");
        com.amazon.aps.iva.yb0.j.f(smallDurationFormatter, "durationFormatter");
        this.durationFormatter = smallDurationFormatter;
    }

    @Override // com.ellation.crunchyroll.ui.duration.SmallDurationLabelPresenter
    public void onBind(PlayheadTimeProvider playheadTimeProvider, DurationProvider durationProvider) {
        com.amazon.aps.iva.yb0.j.f(playheadTimeProvider, "playheadProvider");
        com.amazon.aps.iva.yb0.j.f(durationProvider, "durationProvider");
        long durationSecs = DurationProviderKt.getDurationSecs(durationProvider);
        long playheadSec = playheadTimeProvider.getPlayheadSec();
        if (durationSecs > playheadSec) {
            getView().show();
            getView().setText(this.durationFormatter.formatTimeLeft(playheadSec, durationSecs));
            return;
        }
        getView().hide();
    }
}
