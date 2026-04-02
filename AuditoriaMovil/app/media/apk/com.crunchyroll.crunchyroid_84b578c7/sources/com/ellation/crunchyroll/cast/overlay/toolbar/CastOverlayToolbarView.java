package com.ellation.crunchyroll.cast.overlay.toolbar;

import androidx.lifecycle.g;
import com.amazon.aps.iva.i5.o;
import com.amazon.aps.iva.wy.h;
import kotlin.Metadata;
/* compiled from: CastOverlayToolbarLayout.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b`\u0018\u00002\u00020\u00012\u00020\u0002J\b\u0010\u0004\u001a\u00020\u0003H&J\b\u0010\u0005\u001a\u00020\u0003H&J\b\u0010\u0006\u001a\u00020\u0003H&¨\u0006\u0007"}, d2 = {"Lcom/ellation/crunchyroll/cast/overlay/toolbar/CastOverlayToolbarView;", "Lcom/amazon/aps/iva/wy/h;", "Lcom/amazon/aps/iva/i5/o;", "Lcom/amazon/aps/iva/kb0/q;", "closeScreen", "showSkipToNextButton", "hideSkipToNextButton", "cast_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes2.dex */
public interface CastOverlayToolbarView extends h, o {
    void closeScreen();

    @Override // com.amazon.aps.iva.i5.o
    /* synthetic */ g getLifecycle();

    void hideSkipToNextButton();

    void showSkipToNextButton();
}
