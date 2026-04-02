package com.ellation.crunchyroll.cast.overlay;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import com.amazon.aps.iva.c8.f;
import com.amazon.aps.iva.cf.a;
import com.amazon.aps.iva.e4.l1;
import com.amazon.aps.iva.kb0.e;
import com.amazon.aps.iva.ly.c;
import com.amazon.aps.iva.wy.g;
import com.amazon.aps.iva.wy.k;
import com.amazon.aps.iva.yb0.j;
import com.ellation.crunchyroll.api.etp.model.Image;
import com.ellation.crunchyroll.cast.R;
import com.ellation.crunchyroll.cast.databinding.LayoutCastingOverlayBinding;
import com.ellation.crunchyroll.ui.ImageUtil;
import com.ellation.widgets.FixedAspectRatioImageView;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
/* compiled from: InternalCastOverlayLayout.kt */
@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B'\b\u0007\u0012\u0006\u0010\u001e\u001a\u00020\u001d\u0012\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u001f\u0012\b\b\u0002\u0010\"\u001a\u00020!¢\u0006\u0004\b#\u0010$J\u000e\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u0016J\u0016\u0010\n\u001a\u00020\t2\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0016J\b\u0010\u000b\u001a\u00020\tH\u0016J\b\u0010\f\u001a\u00020\tH\u0016J\b\u0010\r\u001a\u00020\tH\u0016J\u0010\u0010\u0010\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\u000eH\u0016J\u0010\u0010\u0013\u001a\u00020\t2\u0006\u0010\u0012\u001a\u00020\u0011H\u0016R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001b\u0010\u001c\u001a\u00020\u00178BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b¨\u0006%"}, d2 = {"Lcom/ellation/crunchyroll/cast/overlay/InternalCastOverlayLayout;", "Lcom/amazon/aps/iva/wy/g;", "Lcom/ellation/crunchyroll/cast/overlay/InternalCastOverlayView;", "", "Lcom/amazon/aps/iva/wy/k;", "setupPresenters", "", "Lcom/ellation/crunchyroll/api/etp/model/Image;", "images", "Lcom/amazon/aps/iva/kb0/q;", "loadCastPreviewImage", "showCastingLayout", "hideCastingLayout", "setConnectingToCastDeviceText", "", "friendlyName", "setCastSessionFriendlyText", "Lcom/amazon/aps/iva/cf/a;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "setListener", "Lcom/ellation/crunchyroll/cast/databinding/LayoutCastingOverlayBinding;", "binding", "Lcom/ellation/crunchyroll/cast/databinding/LayoutCastingOverlayBinding;", "Lcom/ellation/crunchyroll/cast/overlay/CastOverlayPresenter;", "presenter$delegate", "Lcom/amazon/aps/iva/kb0/e;", "getPresenter", "()Lcom/ellation/crunchyroll/cast/overlay/CastOverlayPresenter;", "presenter", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "cast_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes2.dex */
public final class InternalCastOverlayLayout extends g implements InternalCastOverlayView {
    private final LayoutCastingOverlayBinding binding;
    private final e presenter$delegate;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public InternalCastOverlayLayout(Context context) {
        this(context, null, 0, 6, null);
        j.f(context, "context");
    }

    public static /* synthetic */ void U2(a aVar, View view) {
        setListener$lambda$1(aVar, view);
    }

    public static /* synthetic */ void b1(a aVar, View view) {
        setListener$lambda$0(aVar, view);
    }

    private final CastOverlayPresenter getPresenter() {
        return (CastOverlayPresenter) this.presenter$delegate.getValue();
    }

    public static final void setListener$lambda$0(a aVar, View view) {
        j.f(aVar, "$listener");
        aVar.F1();
    }

    public static final void setListener$lambda$1(a aVar, View view) {
        j.f(aVar, "$listener");
        aVar.h0();
    }

    @Override // com.ellation.crunchyroll.cast.overlay.InternalCastOverlayView
    public void hideCastingLayout() {
        setVisibility(8);
    }

    @Override // com.ellation.crunchyroll.cast.overlay.InternalCastOverlayView
    public void loadCastPreviewImage(List<Image> list) {
        j.f(list, "images");
        ImageUtil imageUtil = ImageUtil.INSTANCE;
        Context context = this.binding.castVideoPreviewImage.getContext();
        j.e(context, "binding.castVideoPreviewImage.context");
        FixedAspectRatioImageView fixedAspectRatioImageView = this.binding.castVideoPreviewImage;
        j.e(fixedAspectRatioImageView, "binding.castVideoPreviewImage");
        c.c(imageUtil, context, list, fixedAspectRatioImageView, 0);
    }

    @Override // com.ellation.crunchyroll.cast.overlay.InternalCastOverlayView
    public void setCastSessionFriendlyText(String str) {
        j.f(str, "friendlyName");
        this.binding.castOverlayTitle.setText(getResources().getString(R.string.casting_to, str));
    }

    @Override // com.ellation.crunchyroll.cast.overlay.InternalCastOverlayView
    public void setConnectingToCastDeviceText() {
        this.binding.castOverlayTitle.setText(R.string.connecting_to_cast_device);
    }

    @Override // com.ellation.crunchyroll.cast.overlay.InternalCastOverlayView, com.amazon.aps.iva.cf.c
    public void setListener(a aVar) {
        j.f(aVar, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        this.binding.castOverlayToolbar.getBinding().buttonToggleFullscreen.setOnClickListener(new com.amazon.aps.iva.c8.e(aVar, 8));
        this.binding.castOverlayToolbar.getBinding().buttonSettings.setOnClickListener(new f(aVar, 7));
    }

    @Override // com.amazon.aps.iva.wy.g, com.amazon.aps.iva.cz.b
    public Set<k> setupPresenters() {
        return l1.H(getPresenter());
    }

    @Override // com.ellation.crunchyroll.cast.overlay.InternalCastOverlayView
    public void showCastingLayout() {
        setVisibility(0);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public InternalCastOverlayLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        j.f(context, "context");
    }

    public /* synthetic */ InternalCastOverlayLayout(Context context, AttributeSet attributeSet, int i, int i2, com.amazon.aps.iva.yb0.e eVar) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InternalCastOverlayLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        j.f(context, "context");
        LayoutCastingOverlayBinding inflate = LayoutCastingOverlayBinding.inflate(LayoutInflater.from(context), this, true);
        j.e(inflate, "inflate(\n        LayoutI…ontext), this, true\n    )");
        this.binding = inflate;
        this.presenter$delegate = com.amazon.aps.iva.kb0.f.b(new InternalCastOverlayLayout$presenter$2(this, context));
    }
}
