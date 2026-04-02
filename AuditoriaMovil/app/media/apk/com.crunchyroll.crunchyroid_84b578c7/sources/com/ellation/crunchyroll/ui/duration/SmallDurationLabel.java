package com.ellation.crunchyroll.ui.duration;

import android.content.Context;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatTextView;
import com.amazon.aps.iva.kb0.e;
import com.amazon.aps.iva.kb0.f;
import com.amazon.aps.iva.yb0.j;
import com.ellation.crunchyroll.model.DurationProvider;
import com.ellation.crunchyroll.model.PlayheadTimeProvider;
import kotlin.Metadata;
/* compiled from: SmallDurationLabel.kt */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B'\b\u0007\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0013\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\u0017\u0010\u0018J\u0016\u0010\b\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005J\b\u0010\t\u001a\u00020\u0007H\u0016J\b\u0010\n\u001a\u00020\u0007H\u0016R\u001b\u0010\u0010\u001a\u00020\u000b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0019"}, d2 = {"Lcom/ellation/crunchyroll/ui/duration/SmallDurationLabel;", "Landroidx/appcompat/widget/AppCompatTextView;", "Lcom/ellation/crunchyroll/ui/duration/SmallDurationLabelView;", "Lcom/ellation/crunchyroll/model/PlayheadTimeProvider;", "playheadProvider", "Lcom/ellation/crunchyroll/model/DurationProvider;", "durationProvider", "Lcom/amazon/aps/iva/kb0/q;", "bind", "show", "hide", "Lcom/ellation/crunchyroll/ui/duration/SmallDurationLabelPresenter;", "presenter$delegate", "Lcom/amazon/aps/iva/kb0/e;", "getPresenter", "()Lcom/ellation/crunchyroll/ui/duration/SmallDurationLabelPresenter;", "presenter", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "widgets_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes2.dex */
public final class SmallDurationLabel extends AppCompatTextView implements SmallDurationLabelView {
    public static final int $stable = 8;
    private final e presenter$delegate;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SmallDurationLabel(Context context) {
        this(context, null, 0, 6, null);
        j.f(context, "context");
    }

    private final SmallDurationLabelPresenter getPresenter() {
        return (SmallDurationLabelPresenter) this.presenter$delegate.getValue();
    }

    public final void bind(PlayheadTimeProvider playheadTimeProvider, DurationProvider durationProvider) {
        j.f(playheadTimeProvider, "playheadProvider");
        j.f(durationProvider, "durationProvider");
        getPresenter().onBind(playheadTimeProvider, durationProvider);
    }

    @Override // com.ellation.crunchyroll.ui.duration.SmallDurationLabelView
    public void hide() {
        setVisibility(4);
    }

    @Override // com.ellation.crunchyroll.ui.duration.SmallDurationLabelView
    public void show() {
        setVisibility(0);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SmallDurationLabel(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        j.f(context, "context");
    }

    public /* synthetic */ SmallDurationLabel(Context context, AttributeSet attributeSet, int i, int i2, com.amazon.aps.iva.yb0.e eVar) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SmallDurationLabel(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        j.f(context, "context");
        this.presenter$delegate = f.b(new SmallDurationLabel$presenter$2(this, context));
    }
}
