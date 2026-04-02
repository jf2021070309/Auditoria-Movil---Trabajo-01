package com.crunchyroll.contentrating.contentrating;

import androidx.lifecycle.p;
import com.amazon.aps.iva.b50.w;
import com.amazon.aps.iva.sf.d;
import com.amazon.aps.iva.tf.b;
import com.amazon.aps.iva.tf.g;
import com.amazon.aps.iva.yb0.j;
import com.amazon.aps.iva.yb0.l;
import com.ellation.crunchyroll.api.etp.contentreviews.ContentReviewsService;
/* compiled from: ContentRatingLayout.kt */
/* loaded from: classes.dex */
public final class a extends l implements com.amazon.aps.iva.xb0.l<p, g> {
    public static final a h = new a();

    public a() {
        super(1);
    }

    @Override // com.amazon.aps.iva.xb0.l
    public final g invoke(p pVar) {
        j.f(pVar, "it");
        d dVar = w.f;
        if (dVar != null) {
            ContentReviewsService contentReviewService = dVar.getContentReviewService();
            j.f(contentReviewService, "contentReviewsService");
            return new g(new b(contentReviewService));
        }
        j.m("dependencies");
        throw null;
    }
}
