package com.ellation.crunchyroll.cast.expanded;

import androidx.lifecycle.g;
import com.amazon.aps.iva.i5.o;
import com.amazon.aps.iva.rf.c;
import com.amazon.aps.iva.rf.f;
import com.amazon.aps.iva.u70.i;
import com.amazon.aps.iva.wy.h;
import com.google.android.gms.cast.MediaTrack;
import kotlin.Metadata;
/* compiled from: CastControllerActivity.kt */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b`\u0018\u00002\u00020\u00012\u00020\u0002J\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H&J\u0010\u0010\b\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0003H&J\u0010\u0010\n\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\u0003H&J\b\u0010\u000b\u001a\u00020\u0005H&J\b\u0010\f\u001a\u00020\u0005H&J\b\u0010\r\u001a\u00020\u0005H&J\b\u0010\u000e\u001a\u00020\u0005H&J\b\u0010\u000f\u001a\u00020\u0005H&J\b\u0010\u0010\u001a\u00020\u0005H&J\b\u0010\u0011\u001a\u00020\u0005H&J\b\u0010\u0012\u001a\u00020\u0005H&J\b\u0010\u0013\u001a\u00020\u0005H&J\b\u0010\u0014\u001a\u00020\u0005H&J\b\u0010\u0015\u001a\u00020\u0005H&J\b\u0010\u0016\u001a\u00020\u0005H&J\u0018\u0010\u001b\u001a\u00020\u00052\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u0019H&J\b\u0010\u001c\u001a\u00020\u0005H&J\u0010\u0010\u001f\u001a\u00020\u00052\u0006\u0010\u001e\u001a\u00020\u001dH&¨\u0006 "}, d2 = {"Lcom/ellation/crunchyroll/cast/expanded/CastControllerView;", "Lcom/amazon/aps/iva/wy/h;", "Lcom/amazon/aps/iva/i5/o;", "", "title", "Lcom/amazon/aps/iva/kb0/q;", "setTitle", MediaTrack.ROLE_SUBTITLE, "setSubtitle", "imageUrl", "loadImage", "close", "setOrientationPortrait", "showSkipNextButton", "hideSkipNextButton", "enableControls", "disableControls", "showRestrictedContentOverlay", "hideOverlay", "showUnavailableOverlay", "showComingSoonOverlay", "showPremiumOverlay", "showMatureBlockedOverlay", "Lcom/amazon/aps/iva/rf/c;", "premiumDubFormatter", "Lcom/amazon/aps/iva/rf/f;", "premiumDubUiModel", "showPremiumDubOverlay", "showLoadingOverlay", "Lcom/amazon/aps/iva/u70/i;", "message", "showSnackbar", "cast_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes2.dex */
public interface CastControllerView extends h, o {
    void close();

    void disableControls();

    void enableControls();

    @Override // com.amazon.aps.iva.i5.o
    /* synthetic */ g getLifecycle();

    void hideOverlay();

    void hideSkipNextButton();

    void loadImage(String str);

    void setOrientationPortrait();

    void setSubtitle(String str);

    void setTitle(String str);

    void showComingSoonOverlay();

    void showLoadingOverlay();

    void showMatureBlockedOverlay();

    void showPremiumDubOverlay(c cVar, f fVar);

    void showPremiumOverlay();

    void showRestrictedContentOverlay();

    void showSkipNextButton();

    void showSnackbar(i iVar);

    void showUnavailableOverlay();
}
