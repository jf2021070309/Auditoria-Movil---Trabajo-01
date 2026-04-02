package com.ellation.crunchyroll.cast.mini;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import com.amazon.aps.iva.bc0.b;
import com.amazon.aps.iva.e4.l1;
import com.amazon.aps.iva.fc0.l;
import com.amazon.aps.iva.k.q;
import com.amazon.aps.iva.kb0.e;
import com.amazon.aps.iva.kb0.f;
import com.amazon.aps.iva.wy.g;
import com.amazon.aps.iva.wy.k;
import com.amazon.aps.iva.yb0.j;
import com.ellation.crunchyroll.cast.R;
import com.ellation.crunchyroll.cast.stateoverlay.CastContentStateUiModel;
import com.ellation.crunchyroll.model.PlayableAsset;
import java.util.Set;
import kotlin.Metadata;
/* compiled from: CastMiniContentStateLayout.kt */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B'\b\u0007\u0012\u0006\u0010\u001b\u001a\u00020\u001a\u0012\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u001c\u0012\b\b\u0002\u0010\u001f\u001a\u00020\u001e¢\u0006\u0004\b \u0010!J\u000e\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003J\u0010\u0010\t\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016J\b\u0010\n\u001a\u00020\u0005H\u0016J\u000e\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000bH\u0016R\u001b\u0010\u0013\u001a\u00020\u000e8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u001b\u0010\u0019\u001a\u00020\u00148BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018¨\u0006\""}, d2 = {"Lcom/ellation/crunchyroll/cast/mini/CastMiniContentStateLayout;", "Lcom/amazon/aps/iva/wy/g;", "Lcom/ellation/crunchyroll/cast/mini/CastMiniContentStateView;", "Lcom/ellation/crunchyroll/model/PlayableAsset;", "asset", "Lcom/amazon/aps/iva/kb0/q;", "bind", "Lcom/ellation/crunchyroll/cast/stateoverlay/CastContentStateUiModel;", "state", "showContentState", "hideContentState", "", "Lcom/amazon/aps/iva/wy/k;", "setupPresenters", "Landroid/widget/ImageView;", "contentStateIcon$delegate", "Lcom/amazon/aps/iva/bc0/b;", "getContentStateIcon", "()Landroid/widget/ImageView;", "contentStateIcon", "Lcom/ellation/crunchyroll/cast/mini/CastMiniContentStatePresenter;", "presenter$delegate", "Lcom/amazon/aps/iva/kb0/e;", "getPresenter", "()Lcom/ellation/crunchyroll/cast/mini/CastMiniContentStatePresenter;", "presenter", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "cast_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes2.dex */
public final class CastMiniContentStateLayout extends g implements CastMiniContentStateView {
    static final /* synthetic */ l<Object>[] $$delegatedProperties = {q.a(CastMiniContentStateLayout.class, "contentStateIcon", "getContentStateIcon()Landroid/widget/ImageView;", 0)};
    private final b contentStateIcon$delegate;
    private final e presenter$delegate;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CastMiniContentStateLayout(Context context) {
        this(context, null, 0, 6, null);
        j.f(context, "context");
    }

    private final ImageView getContentStateIcon() {
        return (ImageView) this.contentStateIcon$delegate.getValue(this, $$delegatedProperties[0]);
    }

    private final CastMiniContentStatePresenter getPresenter() {
        return (CastMiniContentStatePresenter) this.presenter$delegate.getValue();
    }

    public final void bind(PlayableAsset playableAsset) {
        j.f(playableAsset, "asset");
        getPresenter().bind(playableAsset);
    }

    @Override // com.ellation.crunchyroll.cast.mini.CastMiniContentStateView
    public void hideContentState() {
        setVisibility(8);
    }

    @Override // com.amazon.aps.iva.wy.g, com.amazon.aps.iva.cz.b
    public Set<k> setupPresenters() {
        return l1.H(getPresenter());
    }

    @Override // com.ellation.crunchyroll.cast.mini.CastMiniContentStateView
    public void showContentState(CastContentStateUiModel castContentStateUiModel) {
        j.f(castContentStateUiModel, "state");
        setVisibility(0);
        getContentStateIcon().setImageResource(castContentStateUiModel.getIconImage());
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CastMiniContentStateLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        j.f(context, "context");
    }

    public /* synthetic */ CastMiniContentStateLayout(Context context, AttributeSet attributeSet, int i, int i2, com.amazon.aps.iva.yb0.e eVar) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CastMiniContentStateLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        j.f(context, "context");
        this.contentStateIcon$delegate = com.amazon.aps.iva.xw.g.c(R.id.cast_mini_content_state_icon, this);
        this.presenter$delegate = f.b(new CastMiniContentStateLayout$presenter$2(this));
        View.inflate(context, R.layout.layout_cast_mini_content_state, this);
    }
}
