package com.ellation.crunchyroll.cast.mini;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewStub;
import android.widget.FrameLayout;
import com.amazon.aps.iva.bc0.b;
import com.amazon.aps.iva.fc0.l;
import com.amazon.aps.iva.k.q;
import com.amazon.aps.iva.kb0.e;
import com.amazon.aps.iva.kb0.f;
import com.amazon.aps.iva.xw.g;
import com.amazon.aps.iva.xw.t0;
import com.amazon.aps.iva.yb0.j;
import com.ellation.crunchyroll.cast.R;
import kotlin.Metadata;
/* compiled from: CastMiniControllerLayout.kt */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B'\b\u0007\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0013\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\u0017\u0010\u0018J\b\u0010\u0004\u001a\u00020\u0003H\u0016R\u001b\u0010\n\u001a\u00020\u00058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\u001b\u0010\u0010\u001a\u00020\u000b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0019"}, d2 = {"Lcom/ellation/crunchyroll/cast/mini/CastMiniControllerLayout;", "Landroid/widget/FrameLayout;", "Lcom/ellation/crunchyroll/cast/mini/CastMiniControllerView;", "Lcom/amazon/aps/iva/kb0/q;", "enableCastMiniController", "Landroid/view/ViewStub;", "castMiniController$delegate", "Lcom/amazon/aps/iva/bc0/b;", "getCastMiniController", "()Landroid/view/ViewStub;", "castMiniController", "Lcom/ellation/crunchyroll/cast/mini/CastMiniControllerPresenter;", "presenter$delegate", "Lcom/amazon/aps/iva/kb0/e;", "getPresenter", "()Lcom/ellation/crunchyroll/cast/mini/CastMiniControllerPresenter;", "presenter", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "cast_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes2.dex */
public final class CastMiniControllerLayout extends FrameLayout implements CastMiniControllerView {
    static final /* synthetic */ l<Object>[] $$delegatedProperties = {q.a(CastMiniControllerLayout.class, "castMiniController", "getCastMiniController()Landroid/view/ViewStub;", 0)};
    public static final int $stable = 8;
    private final b castMiniController$delegate;
    private final e presenter$delegate;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CastMiniControllerLayout(Context context) {
        this(context, null, 0, 6, null);
        j.f(context, "context");
    }

    private final ViewStub getCastMiniController() {
        return (ViewStub) this.castMiniController$delegate.getValue(this, $$delegatedProperties[0]);
    }

    private final CastMiniControllerPresenter getPresenter() {
        return (CastMiniControllerPresenter) this.presenter$delegate.getValue();
    }

    @Override // com.ellation.crunchyroll.cast.mini.CastMiniControllerView
    public void enableCastMiniController() {
        getCastMiniController().inflate();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CastMiniControllerLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        j.f(context, "context");
    }

    public /* synthetic */ CastMiniControllerLayout(Context context, AttributeSet attributeSet, int i, int i2, com.amazon.aps.iva.yb0.e eVar) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CastMiniControllerLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        j.f(context, "context");
        this.castMiniController$delegate = g.c(R.id.cast_mini_controller, this);
        this.presenter$delegate = f.b(new CastMiniControllerLayout$presenter$2(this));
        View.inflate(context, R.layout.layout_cast_mini_controller, this);
        getPresenter().onInit();
        t0.f(this, 0, 0, 0, 0);
    }
}
