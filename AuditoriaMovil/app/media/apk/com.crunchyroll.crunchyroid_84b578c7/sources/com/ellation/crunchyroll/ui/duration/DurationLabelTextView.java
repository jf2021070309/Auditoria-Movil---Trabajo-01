package com.ellation.crunchyroll.ui.duration;

import android.content.Context;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatTextView;
import com.amazon.aps.iva.kb0.e;
import com.amazon.aps.iva.kb0.f;
import com.amazon.aps.iva.yb0.j;
import com.ellation.crunchyroll.model.Panel;
import kotlin.Metadata;
/* compiled from: DurationLabelTextView.kt */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B'\b\u0007\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0013\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\u0017\u0010\u0018J\u000e\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003J\b\u0010\u0007\u001a\u00020\u0005H\u0016J\u0010\u0010\n\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\bH\u0016R\u001b\u0010\u0010\u001a\u00020\u000b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0019"}, d2 = {"Lcom/ellation/crunchyroll/ui/duration/DurationLabelTextView;", "Landroidx/appcompat/widget/AppCompatTextView;", "Lcom/ellation/crunchyroll/ui/duration/DurationLabelView;", "Lcom/ellation/crunchyroll/model/Panel;", "panel", "Lcom/amazon/aps/iva/kb0/q;", "bind", "resetView", "", "duration", "showDuration", "Lcom/ellation/crunchyroll/ui/duration/DurationLabelPresenter;", "presenter$delegate", "Lcom/amazon/aps/iva/kb0/e;", "getPresenter", "()Lcom/ellation/crunchyroll/ui/duration/DurationLabelPresenter;", "presenter", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "widgets_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes2.dex */
public final class DurationLabelTextView extends AppCompatTextView implements DurationLabelView {
    public static final int $stable = 8;
    private final e presenter$delegate;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public DurationLabelTextView(Context context) {
        this(context, null, 0, 6, null);
        j.f(context, "context");
    }

    private final DurationLabelPresenter getPresenter() {
        return (DurationLabelPresenter) this.presenter$delegate.getValue();
    }

    public final void bind(Panel panel) {
        j.f(panel, "panel");
        getPresenter().bind(panel);
    }

    @Override // com.ellation.crunchyroll.ui.duration.DurationLabelView
    public void resetView() {
        setVisibility(8);
        setText("");
    }

    @Override // com.ellation.crunchyroll.ui.duration.DurationLabelView
    public void showDuration(String str) {
        j.f(str, "duration");
        setVisibility(0);
        setText(str);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public DurationLabelTextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        j.f(context, "context");
    }

    public /* synthetic */ DurationLabelTextView(Context context, AttributeSet attributeSet, int i, int i2, com.amazon.aps.iva.yb0.e eVar) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DurationLabelTextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        j.f(context, "context");
        this.presenter$delegate = f.b(new DurationLabelTextView$presenter$2(this, context));
    }
}
