package com.ellation.crunchyroll.api.etp.contentreviews.model;

import com.amazon.aps.iva.yb0.e;
import java.io.Serializable;
import kotlin.Metadata;
/* compiled from: ContentRating.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\f\b\u0086\u0001\u0018\u0000 \u00112\b\u0012\u0004\u0012\u00020\u00000\u00012\u00020\u0002:\u0001\u0011B\u0017\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\b\u0010\n\u001a\u00020\u0004H\u0016R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000j\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010¨\u0006\u0012"}, d2 = {"Lcom/ellation/crunchyroll/api/etp/contentreviews/model/ContentRating;", "", "Ljava/io/Serializable;", "rating", "", "numericValue", "", "(Ljava/lang/String;ILjava/lang/String;I)V", "getNumericValue", "()I", "toString", "NONE", "ONE_STAR", "TWO_STARS", "THREE_STARS", "FOUR_STARS", "FIVE_STARS", "Companion", "api_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes2.dex */
public enum ContentRating implements Serializable {
    NONE("", 0),
    ONE_STAR("1s", 1),
    TWO_STARS("2s", 2),
    THREE_STARS("3s", 3),
    FOUR_STARS("4s", 4),
    FIVE_STARS("5s", 5);
    
    public static final Companion Companion = new Companion(null);
    private final int numericValue;
    private final String rating;

    /* compiled from: ContentRating.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006¨\u0006\u0007"}, d2 = {"Lcom/ellation/crunchyroll/api/etp/contentreviews/model/ContentRating$Companion;", "", "()V", "fromNumericValue", "Lcom/ellation/crunchyroll/api/etp/contentreviews/model/ContentRating;", "numericValue", "", "api_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(e eVar) {
            this();
        }

        public final ContentRating fromNumericValue(int i) {
            ContentRating contentRating;
            boolean z;
            ContentRating[] values = ContentRating.values();
            int length = values.length;
            int i2 = 0;
            while (true) {
                if (i2 < length) {
                    contentRating = values[i2];
                    if (contentRating.getNumericValue() == i) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (z) {
                        break;
                    }
                    i2++;
                } else {
                    contentRating = null;
                    break;
                }
            }
            if (contentRating != null) {
                return contentRating;
            }
            throw new IllegalStateException((i + " not supported!").toString());
        }
    }

    ContentRating(String str, int i) {
        this.rating = str;
        this.numericValue = i;
    }

    public final int getNumericValue() {
        return this.numericValue;
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.rating;
    }
}
