package com.ellation.crunchyroll.cast.overlay.toolbar;

import android.app.Activity;
import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import com.amazon.aps.iva.c8.h;
import com.amazon.aps.iva.e4.l1;
import com.amazon.aps.iva.kb0.e;
import com.amazon.aps.iva.kb0.f;
import com.amazon.aps.iva.ne.a;
import com.amazon.aps.iva.wy.g;
import com.amazon.aps.iva.wy.k;
import com.amazon.aps.iva.xw.q;
import com.amazon.aps.iva.yb0.j;
import com.ellation.crunchyroll.cast.databinding.CastOverlayToolbarBinding;
import com.google.android.gms.cast.framework.CastButtonFactory;
import java.util.Set;
import kotlin.Metadata;
/* compiled from: CastOverlayToolbarLayout.kt */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B'\b\u0007\u0012\u0006\u0010\u0016\u001a\u00020\u0015\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0017\u0012\b\b\u0002\u0010\u001a\u001a\u00020\u0019¢\u0006\u0004\b\u001b\u0010\u001cJ\u000e\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u0016J\b\u0010\u0007\u001a\u00020\u0006H\u0016J\b\u0010\b\u001a\u00020\u0006H\u0016J\b\u0010\t\u001a\u00020\u0006H\u0016R\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR\u001b\u0010\u0014\u001a\u00020\u000f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u001d"}, d2 = {"Lcom/ellation/crunchyroll/cast/overlay/toolbar/CastOverlayToolbarLayout;", "Lcom/amazon/aps/iva/wy/g;", "Lcom/ellation/crunchyroll/cast/overlay/toolbar/CastOverlayToolbarView;", "", "Lcom/amazon/aps/iva/wy/k;", "setupPresenters", "Lcom/amazon/aps/iva/kb0/q;", "closeScreen", "showSkipToNextButton", "hideSkipToNextButton", "Lcom/ellation/crunchyroll/cast/databinding/CastOverlayToolbarBinding;", "binding", "Lcom/ellation/crunchyroll/cast/databinding/CastOverlayToolbarBinding;", "getBinding", "()Lcom/ellation/crunchyroll/cast/databinding/CastOverlayToolbarBinding;", "Lcom/ellation/crunchyroll/cast/overlay/toolbar/CastOverlayToolbarPresenter;", "presenter$delegate", "Lcom/amazon/aps/iva/kb0/e;", "getPresenter", "()Lcom/ellation/crunchyroll/cast/overlay/toolbar/CastOverlayToolbarPresenter;", "presenter", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "cast_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes2.dex */
public final class CastOverlayToolbarLayout extends g implements CastOverlayToolbarView {
    public static final int $stable = 8;
    private final CastOverlayToolbarBinding binding;
    private final e presenter$delegate;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CastOverlayToolbarLayout(Context context) {
        this(context, null, 0, 6, null);
        j.f(context, "context");
    }

    public static /* synthetic */ void U2(CastOverlayToolbarLayout castOverlayToolbarLayout, View view) {
        _init_$lambda$0(castOverlayToolbarLayout, view);
    }

    public static final void _init_$lambda$0(CastOverlayToolbarLayout castOverlayToolbarLayout, View view) {
        j.f(castOverlayToolbarLayout, "this$0");
        castOverlayToolbarLayout.getPresenter().onBackButtonClick();
    }

    public static final void _init_$lambda$1(CastOverlayToolbarLayout castOverlayToolbarLayout, View view) {
        j.f(castOverlayToolbarLayout, "this$0");
        castOverlayToolbarLayout.getPresenter().onSkipToNext();
    }

    public static /* synthetic */ void b1(CastOverlayToolbarLayout castOverlayToolbarLayout, View view) {
        _init_$lambda$1(castOverlayToolbarLayout, view);
    }

    private final CastOverlayToolbarPresenter getPresenter() {
        return (CastOverlayToolbarPresenter) this.presenter$delegate.getValue();
    }

    @Override // com.ellation.crunchyroll.cast.overlay.toolbar.CastOverlayToolbarView
    public void closeScreen() {
        Activity a = q.a(getContext());
        if (a != null) {
            a.finish();
        }
    }

    public final CastOverlayToolbarBinding getBinding() {
        return this.binding;
    }

    @Override // com.ellation.crunchyroll.cast.overlay.toolbar.CastOverlayToolbarView
    public void hideSkipToNextButton() {
        ImageView imageView = this.binding.buttonSkipToNext;
        j.e(imageView, "binding.buttonSkipToNext");
        imageView.setVisibility(8);
    }

    @Override // com.amazon.aps.iva.wy.g, com.amazon.aps.iva.cz.b
    public Set<k> setupPresenters() {
        return l1.H(getPresenter());
    }

    @Override // com.ellation.crunchyroll.cast.overlay.toolbar.CastOverlayToolbarView
    public void showSkipToNextButton() {
        ImageView imageView = this.binding.buttonSkipToNext;
        j.e(imageView, "binding.buttonSkipToNext");
        imageView.setVisibility(0);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CastOverlayToolbarLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        j.f(context, "context");
    }

    public /* synthetic */ CastOverlayToolbarLayout(Context context, AttributeSet attributeSet, int i, int i2, com.amazon.aps.iva.yb0.e eVar) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CastOverlayToolbarLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        j.f(context, "context");
        CastOverlayToolbarBinding inflate = CastOverlayToolbarBinding.inflate(LayoutInflater.from(context), this, true);
        j.e(inflate, "inflate(\n        LayoutI…ontext), this, true\n    )");
        this.binding = inflate;
        this.presenter$delegate = f.b(new CastOverlayToolbarLayout$presenter$2(this, context));
        inflate.toolbarBackButton.setOnClickListener(new a(this, 10));
        inflate.buttonSkipToNext.setOnClickListener(new h(this, 10));
        CastButtonFactory.setUpMediaRouteButton(context, inflate.mediaRouteButton);
    }
}
