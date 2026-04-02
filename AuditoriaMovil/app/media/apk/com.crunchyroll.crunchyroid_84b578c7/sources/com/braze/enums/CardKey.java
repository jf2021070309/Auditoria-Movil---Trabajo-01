package com.braze.enums;

import com.amazon.aps.iva.if0.c;
import com.amazon.aps.iva.kb0.j;
import com.amazon.aps.iva.lb0.i0;
import com.amazon.aps.iva.yb0.e;
import com.amazon.aps.iva.yb0.l;
import com.braze.support.BrazeLogger;
import com.braze.support.JsonUtils;
import com.google.android.gms.cast.MediaTrack;
import com.google.android.gms.common.internal.ImagesContract;
import java.util.Map;
import kotlin.Metadata;
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b/\b\u0087\u0001\u0018\u0000 \u000b2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0002\f\rB\u0019\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0004\u001a\u0004\b\b\u0010\u0006j\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001aj\u0002\b\u001bj\u0002\b\u001cj\u0002\b\u001dj\u0002\b\u001ej\u0002\b\u001fj\u0002\b j\u0002\b!j\u0002\b\"j\u0002\b#j\u0002\b$j\u0002\b%j\u0002\b&j\u0002\b'j\u0002\b(j\u0002\b)j\u0002\b*j\u0002\b+j\u0002\b,j\u0002\b-j\u0002\b.j\u0002\b/j\u0002\b0¨\u00061"}, d2 = {"Lcom/braze/enums/CardKey;", "", "", "feedKey", "Ljava/lang/String;", "getFeedKey", "()Ljava/lang/String;", "contentCardsKey", "getContentCardsKey", "<init>", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)V", "Companion", "a", "Provider", "ID", "VIEWED", "CREATED", "EXPIRES_AT", "EXTRAS", "OPEN_URI_IN_WEBVIEW", "TYPE", "CATEGORIES", "UPDATED", "DISMISSED", "REMOVED", "PINNED", "DISMISSIBLE", "IS_TEST", "READ", "CLICKED", "BANNER_IMAGE_IMAGE", "BANNER_IMAGE_URL", "BANNER_IMAGE_DOMAIN", "BANNER_IMAGE_ASPECT_RATIO", "CAPTIONED_IMAGE_IMAGE", "CAPTIONED_IMAGE_TITLE", "CAPTIONED_IMAGE_DESCRIPTION", "CAPTIONED_IMAGE_URL", "CAPTIONED_IMAGE_DOMAIN", "CAPTIONED_IMAGE_ASPECT_RATIO", "TEXT_ANNOUNCEMENT_TITLE", "TEXT_ANNOUNCEMENT_DESCRIPTION", "TEXT_ANNOUNCEMENT_URL", "TEXT_ANNOUNCEMENT_DOMAIN", "SHORT_NEWS_IMAGE", "SHORT_NEWS_TITLE", "SHORT_NEWS_DESCRIPTION", "SHORT_NEWS_URL", "SHORT_NEWS_DOMAIN", "android-sdk-base_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
public enum CardKey {
    ID("id", "id"),
    VIEWED("viewed", "v"),
    CREATED("created", "ca"),
    EXPIRES_AT("expires_at", "ea"),
    EXTRAS("extras", "e"),
    OPEN_URI_IN_WEBVIEW("use_webview", "uw"),
    TYPE("type", "tp"),
    CATEGORIES("categories", ""),
    UPDATED("updated", ""),
    DISMISSED("", "d"),
    REMOVED("", "r"),
    PINNED("", "p"),
    DISMISSIBLE("", "db"),
    IS_TEST("", "t"),
    READ("", "read"),
    CLICKED("", "cl"),
    BANNER_IMAGE_IMAGE("image", "i"),
    BANNER_IMAGE_URL(ImagesContract.URL, "u"),
    BANNER_IMAGE_DOMAIN("domain", ""),
    BANNER_IMAGE_ASPECT_RATIO("aspect_ratio", "ar"),
    CAPTIONED_IMAGE_IMAGE("image", "i"),
    CAPTIONED_IMAGE_TITLE("title", "tt"),
    CAPTIONED_IMAGE_DESCRIPTION(MediaTrack.ROLE_DESCRIPTION, "ds"),
    CAPTIONED_IMAGE_URL(ImagesContract.URL, "u"),
    CAPTIONED_IMAGE_DOMAIN("domain", "dm"),
    CAPTIONED_IMAGE_ASPECT_RATIO("aspect_ratio", "ar"),
    TEXT_ANNOUNCEMENT_TITLE("title", "tt"),
    TEXT_ANNOUNCEMENT_DESCRIPTION(MediaTrack.ROLE_DESCRIPTION, "ds"),
    TEXT_ANNOUNCEMENT_URL(ImagesContract.URL, "u"),
    TEXT_ANNOUNCEMENT_DOMAIN("domain", "dm"),
    SHORT_NEWS_IMAGE("image", "i"),
    SHORT_NEWS_TITLE("title", "tt"),
    SHORT_NEWS_DESCRIPTION(MediaTrack.ROLE_DESCRIPTION, "ds"),
    SHORT_NEWS_URL(ImagesContract.URL, "u"),
    SHORT_NEWS_DOMAIN("domain", "dm");
    
    private final String contentCardsKey;
    private final String feedKey;
    public static final a Companion = new a(null);
    private static final String BANNER_IMAGE_KEY = "banner_image";
    private static final String CAPTIONED_IMAGE_KEY = "captioned_image";
    private static final String TEXT_ANNOUNCEMENT_KEY = "text_announcement";
    private static final String SHORT_NEWS_KEY = "short_news";
    private static final String CONTROL_KEY = "control";
    private static final Map<String, CardType> cardTypeMap = i0.U(new j(BANNER_IMAGE_KEY, CardType.BANNER), new j(CAPTIONED_IMAGE_KEY, CardType.CAPTIONED_IMAGE), new j(TEXT_ANNOUNCEMENT_KEY, CardType.TEXT_ANNOUNCEMENT), new j(SHORT_NEWS_KEY, CardType.SHORT_NEWS), new j(CONTROL_KEY, CardType.CONTROL));

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0007\u0018\u0000 \u00102\u00020\u0001:\u0001\u0011B\u000f\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u000e\u0010\u000fJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u0010\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0007\u001a\u00020\u0006R\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\u000b\u0010\r¨\u0006\u0012"}, d2 = {"Lcom/braze/enums/CardKey$Provider;", "", "Lcom/braze/enums/CardKey;", "key", "", "getKey", "Lcom/amazon/aps/iva/if0/c;", "jsonObject", "Lcom/braze/enums/CardType;", "getCardTypeFromJson", "", "isContentCardProvider", "Z", "()Z", "<init>", "(Z)V", "Companion", "a", "android-sdk-base_release"}, k = 1, mv = {1, 8, 0})
    /* loaded from: classes.dex */
    public static final class Provider {
        private final boolean isContentCardProvider;
        public static final a Companion = new a(null);
        public static final Provider CONTENT_CARDS = new Provider(true);
        public static final Provider NEWS_FEED = new Provider(false);

        /* loaded from: classes.dex */
        public static final class a {
            public /* synthetic */ a(e eVar) {
                this();
            }

            private a() {
            }
        }

        /* loaded from: classes.dex */
        public static final class b extends l implements com.amazon.aps.iva.xb0.a {
            final /* synthetic */ c b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(c cVar) {
                super(0);
                this.b = cVar;
            }

            @Override // com.amazon.aps.iva.xb0.a
            /* renamed from: a */
            public final String invoke() {
                return "Short News card doesn't contain image url, parsing type as Text Announcement. JSON: " + this.b;
            }
        }

        public Provider(boolean z) {
            this.isContentCardProvider = z;
        }

        public final CardType getCardTypeFromJson(c cVar) {
            boolean z;
            com.amazon.aps.iva.yb0.j.f(cVar, "jsonObject");
            String optionalString = JsonUtils.getOptionalString(cVar, getKey(CardKey.TYPE));
            boolean z2 = false;
            if (optionalString != null && optionalString.length() != 0) {
                z = false;
            } else {
                z = true;
            }
            if (!z && this.isContentCardProvider && com.amazon.aps.iva.yb0.j.a(optionalString, CardKey.SHORT_NEWS_KEY)) {
                String optionalString2 = JsonUtils.getOptionalString(cVar, getKey(CardKey.SHORT_NEWS_IMAGE));
                if (optionalString2 == null || optionalString2.length() == 0) {
                    z2 = true;
                }
                if (z2) {
                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, BrazeLogger.Priority.V, (Throwable) null, new b(cVar), 2, (Object) null);
                    optionalString = CardKey.TEXT_ANNOUNCEMENT_KEY;
                }
            }
            if (CardKey.cardTypeMap.containsKey(optionalString)) {
                return (CardType) CardKey.cardTypeMap.get(optionalString);
            }
            return CardType.DEFAULT;
        }

        public final String getKey(CardKey cardKey) {
            com.amazon.aps.iva.yb0.j.f(cardKey, "key");
            if (this.isContentCardProvider) {
                return cardKey.getContentCardsKey();
            }
            return cardKey.getFeedKey();
        }

        public final boolean isContentCardProvider() {
            return this.isContentCardProvider;
        }
    }

    /* loaded from: classes.dex */
    public static final class a {
        public /* synthetic */ a(e eVar) {
            this();
        }

        private a() {
        }
    }

    CardKey(String str, String str2) {
        this.feedKey = str;
        this.contentCardsKey = str2;
    }

    public final String getContentCardsKey() {
        return this.contentCardsKey;
    }

    public final String getFeedKey() {
        return this.feedKey;
    }
}
