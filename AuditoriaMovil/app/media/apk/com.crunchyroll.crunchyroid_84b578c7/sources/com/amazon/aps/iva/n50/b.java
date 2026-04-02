package com.amazon.aps.iva.n50;

import com.amazon.aps.iva.x50.t;
import com.ellation.crunchyroll.api.etp.contentreviews.ContentReviewsService;
import com.ellation.crunchyroll.api.etp.contentreviews.model.ContentRatingBody;
import com.ellation.crunchyroll.api.etp.contentreviews.model.ContentRatingContainer;
import com.ellation.crunchyroll.api.etp.contentreviews.model.RatedContentType;
/* compiled from: ContentRatingInteractor.kt */
/* loaded from: classes2.dex */
public final class b extends com.amazon.aps.iva.wy.a implements com.amazon.aps.iva.n50.a {
    public final ContentReviewsService b;

    /* compiled from: ContentRatingInteractor.kt */
    /* loaded from: classes2.dex */
    public /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[t.values().length];
            try {
                iArr[t.SERIES.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[t.MOVIE_LISTING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            a = iArr;
        }
    }

    public b(ContentReviewsService contentReviewsService) {
        this.b = contentReviewsService;
    }

    public static RatedContentType C(com.amazon.aps.iva.m50.b bVar) {
        int i = a.a[bVar.c.ordinal()];
        if (i != 1) {
            if (i == 2) {
                return RatedContentType.MOVIE_LISTING;
            }
            throw new IllegalArgumentException(bVar + " is not supported");
        }
        return RatedContentType.SERIES;
    }

    @Override // com.amazon.aps.iva.n50.a
    public final Object F(com.amazon.aps.iva.m50.b bVar, com.amazon.aps.iva.ob0.d<? super ContentRatingContainer> dVar) {
        return this.b.getRatings(bVar.b, C(bVar), dVar);
    }

    @Override // com.amazon.aps.iva.n50.a
    public final Object w(com.amazon.aps.iva.m50.b bVar, ContentRatingBody contentRatingBody, com.amazon.aps.iva.ob0.d<? super ContentRatingContainer> dVar) {
        return this.b.addRating(bVar.b, C(bVar), contentRatingBody, dVar);
    }
}
