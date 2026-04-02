package com.ellation.crunchyroll.ui.duration;

import com.amazon.aps.iva.wy.b;
import com.amazon.aps.iva.wy.j;
import com.amazon.aps.iva.x50.t;
import com.ellation.crunchyroll.model.DurationProviderKt;
import com.ellation.crunchyroll.model.Panel;
import kotlin.Metadata;
/* compiled from: DurationLabelPresenter.kt */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003B\u0017\u0012\u0006\u0010\u000b\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\n¨\u0006\u000e"}, d2 = {"Lcom/ellation/crunchyroll/ui/duration/DurationLabelPresenterImpl;", "Lcom/amazon/aps/iva/wy/b;", "Lcom/ellation/crunchyroll/ui/duration/DurationLabelView;", "Lcom/ellation/crunchyroll/ui/duration/DurationLabelPresenter;", "Lcom/ellation/crunchyroll/model/Panel;", "panel", "Lcom/amazon/aps/iva/kb0/q;", "bind", "Lcom/ellation/crunchyroll/ui/duration/DurationFormatter;", "durationFormatter", "Lcom/ellation/crunchyroll/ui/duration/DurationFormatter;", "view", "<init>", "(Lcom/ellation/crunchyroll/ui/duration/DurationLabelView;Lcom/ellation/crunchyroll/ui/duration/DurationFormatter;)V", "widgets_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes2.dex */
final class DurationLabelPresenterImpl extends b<DurationLabelView> implements DurationLabelPresenter {
    private final DurationFormatter durationFormatter;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DurationLabelPresenterImpl(DurationLabelView durationLabelView, DurationFormatter durationFormatter) {
        super(durationLabelView, new j[0]);
        com.amazon.aps.iva.yb0.j.f(durationLabelView, "view");
        com.amazon.aps.iva.yb0.j.f(durationFormatter, "durationFormatter");
        this.durationFormatter = durationFormatter;
    }

    @Override // com.ellation.crunchyroll.ui.duration.DurationLabelPresenter
    public void bind(Panel panel) {
        com.amazon.aps.iva.yb0.j.f(panel, "panel");
        getView().resetView();
        if (panel.getResourceType() == t.EPISODE) {
            getView().showDuration(this.durationFormatter.formatDuration(DurationProviderKt.getDurationSecs(panel.getMetadata())));
        }
    }
}
