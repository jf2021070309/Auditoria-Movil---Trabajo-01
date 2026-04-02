package com.amazon.aps.iva.vx;

import android.graphics.Rect;
import android.view.View;
import android.widget.ImageView;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.amazon.aps.iva.xw.t0;
import com.ellation.crunchyroll.feed.HomeFeedScreenView;
/* compiled from: HomeFeedView.kt */
/* loaded from: classes2.dex */
public final class t extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<Integer, com.amazon.aps.iva.kb0.q> {
    public final /* synthetic */ LinearLayoutManager h;
    public final /* synthetic */ HomeFeedScreenView i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(LinearLayoutManager linearLayoutManager, HomeFeedScreenView homeFeedScreenView) {
        super(1);
        this.h = linearLayoutManager;
        this.i = homeFeedScreenView;
    }

    @Override // com.amazon.aps.iva.xb0.l
    public final com.amazon.aps.iva.kb0.q invoke(Integer num) {
        ImageView heroImage;
        ImageView heroImage2;
        ImageView heroImage3;
        View heroImageOverlay;
        ImageView heroImage4;
        ImageView heroImage5;
        View heroImageOverlay2;
        int intValue = num.intValue();
        int findFirstVisibleItemPosition = this.h.findFirstVisibleItemPosition();
        HomeFeedScreenView homeFeedScreenView = this.i;
        if (findFirstVisibleItemPosition > 0) {
            heroImage4 = homeFeedScreenView.getHeroImage();
            heroImage4.setVisibility(8);
            heroImage5 = homeFeedScreenView.getHeroImage();
            heroImage5.setClipBounds(null);
            heroImageOverlay2 = homeFeedScreenView.getHeroImageOverlay();
            heroImageOverlay2.setTranslationY(0.0f);
        } else {
            heroImage = homeFeedScreenView.getHeroImage();
            heroImage.setVisibility(0);
            heroImage2 = homeFeedScreenView.getHeroImage();
            heroImage3 = homeFeedScreenView.getHeroImage();
            Rect b = t0.b(heroImage3);
            b.bottom -= intValue;
            heroImage2.setClipBounds(b);
            heroImageOverlay = homeFeedScreenView.getHeroImageOverlay();
            heroImageOverlay.setTranslationY(-intValue);
        }
        return com.amazon.aps.iva.kb0.q.a;
    }
}
