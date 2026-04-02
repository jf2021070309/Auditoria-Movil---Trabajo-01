package com.ellation.crunchyroll.api.etp.contentreviews.model.episode;

import com.amazon.aps.iva.yb0.e;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
/* compiled from: EpisodeRateContentBody.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0007\bB\u000f\b\u0004\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u0082\u0001\u0002\t\n¨\u0006\u000b"}, d2 = {"Lcom/ellation/crunchyroll/api/etp/contentreviews/model/episode/EpisodeRateContentBody;", "", "rating", "", "(Ljava/lang/String;)V", "getRating", "()Ljava/lang/String;", "EpisodeRateDown", "EpisodeRateUp", "Lcom/ellation/crunchyroll/api/etp/contentreviews/model/episode/EpisodeRateContentBody$EpisodeRateDown;", "Lcom/ellation/crunchyroll/api/etp/contentreviews/model/episode/EpisodeRateContentBody$EpisodeRateUp;", "api_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes2.dex */
public abstract class EpisodeRateContentBody {
    public static final int $stable = 0;
    @SerializedName("rating")
    private final String rating;

    /* compiled from: EpisodeRateContentBody.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/ellation/crunchyroll/api/etp/contentreviews/model/episode/EpisodeRateContentBody$EpisodeRateDown;", "Lcom/ellation/crunchyroll/api/etp/contentreviews/model/episode/EpisodeRateContentBody;", "()V", "api_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class EpisodeRateDown extends EpisodeRateContentBody {
        public static final int $stable = 0;
        public static final EpisodeRateDown INSTANCE = new EpisodeRateDown();

        private EpisodeRateDown() {
            super("down", null);
        }
    }

    /* compiled from: EpisodeRateContentBody.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/ellation/crunchyroll/api/etp/contentreviews/model/episode/EpisodeRateContentBody$EpisodeRateUp;", "Lcom/ellation/crunchyroll/api/etp/contentreviews/model/episode/EpisodeRateContentBody;", "()V", "api_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class EpisodeRateUp extends EpisodeRateContentBody {
        public static final int $stable = 0;
        public static final EpisodeRateUp INSTANCE = new EpisodeRateUp();

        private EpisodeRateUp() {
            super("up", null);
        }
    }

    public /* synthetic */ EpisodeRateContentBody(String str, e eVar) {
        this(str);
    }

    public final String getRating() {
        return this.rating;
    }

    private EpisodeRateContentBody(String str) {
        this.rating = str;
    }
}
