package com.ellation.crunchyroll.api.etp.contentreviews;

import com.amazon.aps.iva.jf0.a0;
import com.amazon.aps.iva.kb0.q;
import com.amazon.aps.iva.lf0.a;
import com.amazon.aps.iva.lf0.b;
import com.amazon.aps.iva.lf0.f;
import com.amazon.aps.iva.lf0.p;
import com.amazon.aps.iva.lf0.s;
import com.amazon.aps.iva.ob0.d;
import com.amazon.aps.iva.x50.t;
import com.ellation.crunchyroll.api.etp.contentreviews.model.ContentRatingBody;
import com.ellation.crunchyroll.api.etp.contentreviews.model.ContentRatingContainer;
import com.ellation.crunchyroll.api.etp.contentreviews.model.RatedContentType;
import com.ellation.crunchyroll.api.etp.contentreviews.model.episode.EpisodeRateContentBody;
import com.ellation.crunchyroll.api.etp.contentreviews.model.episode.EpisodeRatingContainer;
import kotlin.Metadata;
/* compiled from: ContentReviewsService.kt */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J'\u0010\u0007\u001a\u00020\u00062\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u0004H§@ø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\bJ7\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f2\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\t2\b\b\u0001\u0010\u000b\u001a\u00020\nH§@ø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\u000fJ1\u0010\u0011\u001a\u00020\u00062\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u000b\u001a\u00020\u0010H§@ø\u0001\u0000¢\u0006\u0004\b\u0011\u0010\u0012J-\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\r0\f2\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\tH§@ø\u0001\u0000¢\u0006\u0004\b\u0013\u0010\u0014J\u001d\u0010\u0017\u001a\u00020\u00162\b\b\u0001\u0010\u0015\u001a\u00020\u0002H§@ø\u0001\u0000¢\u0006\u0004\b\u0017\u0010\u0018\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0019"}, d2 = {"Lcom/ellation/crunchyroll/api/etp/contentreviews/ContentReviewsService;", "", "", "contentId", "Lcom/ellation/crunchyroll/api/etp/contentreviews/model/RatedContentType;", "ratedContentType", "Lcom/ellation/crunchyroll/api/etp/contentreviews/model/ContentRatingContainer;", "getRatings", "(Ljava/lang/String;Lcom/ellation/crunchyroll/api/etp/contentreviews/model/RatedContentType;Lcom/amazon/aps/iva/ob0/d;)Ljava/lang/Object;", "Lcom/amazon/aps/iva/x50/t;", "Lcom/ellation/crunchyroll/api/etp/contentreviews/model/episode/EpisodeRateContentBody;", "body", "Lcom/amazon/aps/iva/jf0/a0;", "Lcom/amazon/aps/iva/kb0/q;", "addEpisodeRating", "(Ljava/lang/String;Lcom/amazon/aps/iva/x50/t;Lcom/ellation/crunchyroll/api/etp/contentreviews/model/episode/EpisodeRateContentBody;Lcom/amazon/aps/iva/ob0/d;)Ljava/lang/Object;", "Lcom/ellation/crunchyroll/api/etp/contentreviews/model/ContentRatingBody;", "addRating", "(Ljava/lang/String;Lcom/ellation/crunchyroll/api/etp/contentreviews/model/RatedContentType;Lcom/ellation/crunchyroll/api/etp/contentreviews/model/ContentRatingBody;Lcom/amazon/aps/iva/ob0/d;)Ljava/lang/Object;", "removeRating", "(Ljava/lang/String;Lcom/amazon/aps/iva/x50/t;Lcom/amazon/aps/iva/ob0/d;)Ljava/lang/Object;", "assetId", "Lcom/ellation/crunchyroll/api/etp/contentreviews/model/episode/EpisodeRatingContainer;", "getEpisodeRatings", "(Ljava/lang/String;Lcom/amazon/aps/iva/ob0/d;)Ljava/lang/Object;", "api_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes2.dex */
public interface ContentReviewsService {
    @p("/content-reviews/v2/user/{account_uuid}/rating/{content_type}/{content_id}")
    Object addEpisodeRating(@s("content_id") String str, @s("content_type") t tVar, @a EpisodeRateContentBody episodeRateContentBody, d<? super a0<q>> dVar);

    @p("/content-reviews/v2/user/{account_uuid}/rating/{content_type}/{content_id}")
    Object addRating(@s("content_id") String str, @s("content_type") RatedContentType ratedContentType, @a ContentRatingBody contentRatingBody, d<? super ContentRatingContainer> dVar);

    @f("/content-reviews/v2/user/{account_uuid}/rating/episode/{content_id}")
    Object getEpisodeRatings(@s("content_id") String str, d<? super EpisodeRatingContainer> dVar);

    @f("/content-reviews/v2/user/{account_uuid}/rating/{content_type}/{content_id}")
    Object getRatings(@s("content_id") String str, @s("content_type") RatedContentType ratedContentType, d<? super ContentRatingContainer> dVar);

    @b("/content-reviews/v2/user/{account_uuid}/rating/{content_type}/{content_id}")
    Object removeRating(@s("content_id") String str, @s("content_type") t tVar, d<? super a0<q>> dVar);
}
