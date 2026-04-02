package com.amazon.aps.iva.tf;

import com.amazon.aps.iva.kb0.q;
import com.amazon.aps.iva.wy.j;
import com.amazon.aps.iva.x50.t;
import com.ellation.crunchyroll.api.etp.contentreviews.model.episode.EpisodeRateContentBody;
import com.ellation.crunchyroll.api.etp.contentreviews.model.episode.EpisodeRatingContainer;
/* compiled from: ContentRatingInteractor.kt */
/* loaded from: classes.dex */
public interface a extends j {
    Object a1(String str, t tVar, EpisodeRateContentBody episodeRateContentBody, com.amazon.aps.iva.ob0.d dVar);

    Object d0(String str, com.amazon.aps.iva.ob0.d<? super EpisodeRatingContainer> dVar);

    Object removeRating(String str, t tVar, com.amazon.aps.iva.ob0.d<? super q> dVar);
}
