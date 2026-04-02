package com.amazon.aps.iva.tf;

import com.amazon.aps.iva.kb0.q;
import com.amazon.aps.iva.x50.t;
import com.ellation.crunchyroll.api.etp.contentreviews.ContentReviewsService;
import com.ellation.crunchyroll.api.etp.contentreviews.model.episode.EpisodeRateContentBody;
import com.ellation.crunchyroll.api.etp.contentreviews.model.episode.EpisodeRatingContainer;
/* compiled from: ContentRatingInteractor.kt */
/* loaded from: classes.dex */
public final class b implements a {
    public final ContentReviewsService b;

    public b(ContentReviewsService contentReviewsService) {
        this.b = contentReviewsService;
    }

    @Override // com.amazon.aps.iva.tf.a
    public final Object a1(String str, t tVar, EpisodeRateContentBody episodeRateContentBody, com.amazon.aps.iva.ob0.d dVar) {
        Object addEpisodeRating = this.b.addEpisodeRating(str, tVar, episodeRateContentBody, dVar);
        if (addEpisodeRating == com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED) {
            return addEpisodeRating;
        }
        return q.a;
    }

    @Override // com.amazon.aps.iva.tf.a
    public final Object d0(String str, com.amazon.aps.iva.ob0.d<? super EpisodeRatingContainer> dVar) {
        return this.b.getEpisodeRatings(str, dVar);
    }

    @Override // com.amazon.aps.iva.tf.a
    public final Object removeRating(String str, t tVar, com.amazon.aps.iva.ob0.d<? super q> dVar) {
        Object removeRating = this.b.removeRating(str, tVar, dVar);
        if (removeRating == com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED) {
            return removeRating;
        }
        return q.a;
    }

    @Override // com.amazon.aps.iva.wy.j
    public final void cancelRunningApiCalls() {
    }
}
