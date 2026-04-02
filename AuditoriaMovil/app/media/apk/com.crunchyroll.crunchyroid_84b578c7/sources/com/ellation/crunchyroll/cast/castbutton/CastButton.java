package com.ellation.crunchyroll.cast.castbutton;

import android.view.MenuItem;
import com.amazon.aps.iva.yb0.j;
import com.ellation.crunchyroll.cast.IntroductoryOverlayFactory;
import com.google.android.gms.cast.framework.IntroductoryOverlay;
import kotlin.Metadata;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: CastButtonView.kt */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0002\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u0019\u0010\u001aJ\b\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0004\u001a\u00020\u0002H\u0016R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR$\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0017\u001a\u00020\u00168VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u001b"}, d2 = {"Lcom/ellation/crunchyroll/cast/castbutton/CastButton;", "Lcom/ellation/crunchyroll/cast/castbutton/CastButtonView;", "Lcom/amazon/aps/iva/kb0/q;", "showCastOverlay", "hideCastOverlay", "Landroid/view/MenuItem;", "castButton", "Landroid/view/MenuItem;", "getCastButton", "()Landroid/view/MenuItem;", "Lcom/ellation/crunchyroll/cast/IntroductoryOverlayFactory;", "overlayFactory", "Lcom/ellation/crunchyroll/cast/IntroductoryOverlayFactory;", "getOverlayFactory", "()Lcom/ellation/crunchyroll/cast/IntroductoryOverlayFactory;", "Lcom/google/android/gms/cast/framework/IntroductoryOverlay;", "overlay", "Lcom/google/android/gms/cast/framework/IntroductoryOverlay;", "getOverlay", "()Lcom/google/android/gms/cast/framework/IntroductoryOverlay;", "setOverlay", "(Lcom/google/android/gms/cast/framework/IntroductoryOverlay;)V", "", "isCastButtonVisible", "()Z", "<init>", "(Landroid/view/MenuItem;Lcom/ellation/crunchyroll/cast/IntroductoryOverlayFactory;)V", "cast_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes2.dex */
public final class CastButton implements CastButtonView {
    private final MenuItem castButton;
    private IntroductoryOverlay overlay;
    private final IntroductoryOverlayFactory overlayFactory;

    public CastButton(MenuItem menuItem, IntroductoryOverlayFactory introductoryOverlayFactory) {
        j.f(menuItem, "castButton");
        j.f(introductoryOverlayFactory, "overlayFactory");
        this.castButton = menuItem;
        this.overlayFactory = introductoryOverlayFactory;
    }

    public final MenuItem getCastButton() {
        return this.castButton;
    }

    public final IntroductoryOverlay getOverlay() {
        return this.overlay;
    }

    public final IntroductoryOverlayFactory getOverlayFactory() {
        return this.overlayFactory;
    }

    @Override // com.ellation.crunchyroll.cast.castbutton.CastButtonView
    public void hideCastOverlay() {
        IntroductoryOverlay introductoryOverlay = this.overlay;
        if (introductoryOverlay != null) {
            introductoryOverlay.remove();
        }
    }

    @Override // com.ellation.crunchyroll.cast.castbutton.CastButtonView
    public boolean isCastButtonVisible() {
        return this.castButton.isVisible();
    }

    public final void setOverlay(IntroductoryOverlay introductoryOverlay) {
        this.overlay = introductoryOverlay;
    }

    @Override // com.ellation.crunchyroll.cast.castbutton.CastButtonView
    public void showCastOverlay() {
        IntroductoryOverlay create = this.overlayFactory.create(new CastButton$showCastOverlay$1(this));
        create.show();
        this.overlay = create;
    }
}
