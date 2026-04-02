package com.braze.models.cards;

import bo.app.p1;
import bo.app.r1;
import bo.app.t1;
import com.amazon.aps.iva.lb0.x;
import com.amazon.aps.iva.ne0.s;
import com.amazon.aps.iva.ne0.u;
import com.braze.enums.CardCategory;
import com.braze.enums.CardKey;
import com.braze.enums.CardType;
import com.braze.enums.Channel;
import com.braze.models.IPutIntoJson;
import com.braze.storage.ICardStorageProvider;
import com.braze.support.BrazeLogger;
import com.braze.support.DateTimeUtils;
import com.braze.support.JsonUtils;
import com.google.android.gms.common.internal.ImagesContract;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import java.util.EnumSet;
import java.util.Iterator;
import java.util.Map;
import kotlin.Metadata;
@Metadata(d1 = {"\u0000\u0080\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\b\n\u0002\u0010\t\n\u0002\b\u001e\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0017\u0018\u0000 j2\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001:\u0001kB9\u0012\u0006\u0010\u0013\u001a\u00020\u0002\u0012\u0006\u0010g\u001a\u00020f\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015\u0012\f\u0010\u0019\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u0018\u0012\b\u0010\u001c\u001a\u0004\u0018\u00010\u001b¢\u0006\u0004\bh\u0010iJ\u0006\u0010\u0004\u001a\u00020\u0003J\u0006\u0010\u0005\u001a\u00020\u0003J\u0014\u0010\t\u001a\u00020\u00032\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006J\b\u0010\n\u001a\u00020\u0002H\u0016J\b\u0010\f\u001a\u00020\u000bH\u0016J\b\u0010\r\u001a\u00020\u0003H\u0007J\u0013\u0010\u0010\u001a\u00020\u00032\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0096\u0002J\b\u0010\u0012\u001a\u00020\u0011H\u0016R\u0014\u0010\u0013\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0016\u001a\u0004\u0018\u00010\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0019\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0016\u0010\u001c\u001a\u0004\u0018\u00010\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR#\u0010\u001f\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u000b0\u001e8\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"R\u0017\u0010#\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&R\u0017\u0010(\u001a\u00020'8\u0006¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+R\u0017\u0010,\u001a\u00020'8\u0006¢\u0006\f\n\u0004\b,\u0010)\u001a\u0004\b-\u0010+R\u0017\u0010.\u001a\u00020'8\u0006¢\u0006\f\n\u0004\b.\u0010)\u001a\u0004\b/\u0010+R4\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00062\u000e\u00100\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00068\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\b\u00101\u001a\u0004\b2\u00103R\u0017\u00104\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b4\u00105\u001a\u0004\b4\u00106R\u0017\u00107\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b7\u00105\u001a\u0004\b7\u00106R\"\u00108\u001a\u00020\u00038\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b8\u00105\u001a\u0004\b8\u00106\"\u0004\b9\u0010:R$\u0010;\u001a\u00020\u00032\u0006\u00100\u001a\u00020\u00038\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b;\u00105\u001a\u0004\b;\u00106R\u001d\u0010<\u001a\u00020\u00038\u0006¢\u0006\u0012\n\u0004\b<\u00105\u0012\u0004\b>\u0010?\u001a\u0004\b=\u00106R\"\u0010@\u001a\u00020\u00038\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b@\u00105\u001a\u0004\b@\u00106\"\u0004\bA\u0010:R\"\u0010B\u001a\u00020\u00038\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bB\u00105\u001a\u0004\bB\u00106\"\u0004\bC\u0010:R\u001c\u0010D\u001a\u0004\u0018\u00010\u000b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bD\u0010$\u001a\u0004\bE\u0010&R\u001a\u0010G\u001a\u00020F8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bG\u0010H\u001a\u0004\bI\u0010JR\u0016\u0010K\u001a\u00020\u00038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bK\u00105R\u0016\u0010L\u001a\u00020\u00038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bL\u00105R\u0016\u0010M\u001a\u00020\u00038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bM\u00105R\u0017\u0010O\u001a\u00020N8\u0006¢\u0006\f\n\u0004\bO\u0010P\u001a\u0004\bQ\u0010RR$\u0010T\u001a\u0004\u0018\u00010S8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bT\u0010U\u001a\u0004\bV\u0010W\"\u0004\bX\u0010YR$\u0010[\u001a\u00020\u00032\u0006\u0010Z\u001a\u00020\u00038F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b[\u00106\"\u0004\b\\\u0010:R*\u0010]\u001a\u00020\u00032\u0006\u0010]\u001a\u00020\u00038F@FX\u0086\u000e¢\u0006\u0012\u0012\u0004\b_\u0010?\u001a\u0004\b]\u00106\"\u0004\b^\u0010:R*\u0010`\u001a\u00020\u00032\u0006\u0010`\u001a\u00020\u00038F@FX\u0086\u000e¢\u0006\u0012\u0012\u0004\bc\u0010?\u001a\u0004\ba\u00106\"\u0004\bb\u0010:R\u0011\u0010d\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\bd\u00106R\u0011\u0010e\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\be\u00106¨\u0006l"}, d2 = {"Lcom/braze/models/cards/Card;", "Lcom/braze/models/IPutIntoJson;", "Lcom/amazon/aps/iva/if0/c;", "", "logImpression", "logClick", "Ljava/util/EnumSet;", "Lcom/braze/enums/CardCategory;", "categories", "isInCategorySet", "forJsonPut", "", "toString", "isValidCard", "", "other", "equals", "", "hashCode", "jsonObject", "Lcom/amazon/aps/iva/if0/c;", "Lbo/app/r1;", "brazeManager", "Lbo/app/r1;", "Lcom/braze/storage/ICardStorageProvider;", "cardStorage", "Lcom/braze/storage/ICardStorageProvider;", "Lbo/app/t1;", "cardAnalytics", "Lbo/app/t1;", "", "extras", "Ljava/util/Map;", "getExtras", "()Ljava/util/Map;", "id", "Ljava/lang/String;", "getId", "()Ljava/lang/String;", "", "created", "J", "getCreated", "()J", "updated", "getUpdated", "expiresAt", "getExpiresAt", "<set-?>", "Ljava/util/EnumSet;", "getCategories", "()Ljava/util/EnumSet;", "isContentCard", "Z", "()Z", "isRemoved", "isPinned", "setPinned", "(Z)V", "isClicked", "openUriInWebView", "getOpenUriInWebView", "getOpenUriInWebView$annotations", "()V", "isDismissibleByUser", "setDismissibleByUser", "isTest", "setTest", ImagesContract.URL, "getUrl", "Lcom/braze/enums/CardType;", "cardType", "Lcom/braze/enums/CardType;", "getCardType", "()Lcom/braze/enums/CardType;", "wasViewedInternal", "isIndicatorHighlightedInternal", "isDismissedInternal", "Lcom/braze/enums/Channel;", "channel", "Lcom/braze/enums/Channel;", "getChannel", "()Lcom/braze/enums/Channel;", "Lcom/braze/models/cards/ICardListener;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "Lcom/braze/models/cards/ICardListener;", "getListener", "()Lcom/braze/models/cards/ICardListener;", "setListener", "(Lcom/braze/models/cards/ICardListener;)V", "enabled", "isIndicatorHighlighted", "setIndicatorHighlighted", "isDismissed", "setDismissed", "isDismissed$annotations", "viewed", "getViewed", "setViewed", "getViewed$annotations", "isExpired", "isControl", "Lcom/braze/enums/CardKey$Provider;", "cardKeysProvider", "<init>", "(Lcom/amazon/aps/iva/if0/c;Lcom/braze/enums/CardKey$Provider;Lbo/app/r1;Lcom/braze/storage/ICardStorageProvider;Lbo/app/t1;)V", "Companion", "a", "android-sdk-base_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
public class Card implements IPutIntoJson<com.amazon.aps.iva.if0.c> {
    public static final a Companion = new a(null);
    private final r1 brazeManager;
    private final t1 cardAnalytics;
    private final ICardStorageProvider<?> cardStorage;
    private final CardType cardType;
    private EnumSet<CardCategory> categories;
    private final Channel channel;
    private final long created;
    private final long expiresAt;
    private final Map<String, String> extras;
    private final String id;
    private boolean isClicked;
    private final boolean isContentCard;
    private boolean isDismissedInternal;
    private boolean isDismissibleByUser;
    private boolean isIndicatorHighlightedInternal;
    private boolean isPinned;
    private final boolean isRemoved;
    private boolean isTest;
    private final com.amazon.aps.iva.if0.c jsonObject;
    private ICardListener listener;
    private final boolean openUriInWebView;
    private final long updated;
    private final String url;
    private boolean wasViewedInternal;

    /* loaded from: classes.dex */
    public static final class a {
        public /* synthetic */ a(com.amazon.aps.iva.yb0.e eVar) {
            this();
        }

        private a() {
        }
    }

    /* loaded from: classes.dex */
    public static final class b extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l {
        final /* synthetic */ com.amazon.aps.iva.if0.a b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(com.amazon.aps.iva.if0.a aVar) {
            super(1);
            this.b = aVar;
        }

        public final Boolean a(int i) {
            return Boolean.valueOf(this.b.f(i) instanceof String);
        }

        @Override // com.amazon.aps.iva.xb0.l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return a(((Number) obj).intValue());
        }
    }

    /* loaded from: classes.dex */
    public static final class c extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l {
        final /* synthetic */ com.amazon.aps.iva.if0.a b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(com.amazon.aps.iva.if0.a aVar) {
            super(1);
            this.b = aVar;
        }

        public final Object a(int i) {
            return (String) this.b.get(i);
        }

        @Override // com.amazon.aps.iva.xb0.l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return a(((Number) obj).intValue());
        }
    }

    /* loaded from: classes.dex */
    public static final class d extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a {
        public static final d b = new d();

        public d() {
            super(0);
        }

        @Override // com.amazon.aps.iva.xb0.a
        /* renamed from: a */
        public final String invoke() {
            return "Cannot dismiss a card more than once. Doing nothing.";
        }
    }

    /* loaded from: classes.dex */
    public static final class e extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a {
        public static final e b = new e();

        public e() {
            super(0);
        }

        @Override // com.amazon.aps.iva.xb0.a
        /* renamed from: a */
        public final String invoke() {
            return "Failed to log card as dismissed.";
        }
    }

    /* loaded from: classes.dex */
    public static final class f extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a {
        public static final f b = new f();

        public f() {
            super(0);
        }

        @Override // com.amazon.aps.iva.xb0.a
        /* renamed from: a */
        public final String invoke() {
            return "Failed to mark card indicator as highlighted.";
        }
    }

    /* loaded from: classes.dex */
    public static final class g extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a {
        public static final g b = new g();

        public g() {
            super(0);
        }

        @Override // com.amazon.aps.iva.xb0.a
        /* renamed from: a */
        public final String invoke() {
            return "Card ID cannot be null";
        }
    }

    /* loaded from: classes.dex */
    public static final class h extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a {
        public h() {
            super(0);
        }

        @Override // com.amazon.aps.iva.xb0.a
        /* renamed from: a */
        public final String invoke() {
            return "Logged click for card with id: " + Card.this.getId();
        }
    }

    /* loaded from: classes.dex */
    public static final class i extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a {
        public i() {
            super(0);
        }

        @Override // com.amazon.aps.iva.xb0.a
        /* renamed from: a */
        public final String invoke() {
            return "Failed to log card clicked for id: " + Card.this.getId();
        }
    }

    /* loaded from: classes.dex */
    public static final class j extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a {
        public j() {
            super(0);
        }

        @Override // com.amazon.aps.iva.xb0.a
        /* renamed from: a */
        public final String invoke() {
            return "Failed to log card as clicked for id: " + Card.this.getId();
        }
    }

    /* loaded from: classes.dex */
    public static final class k extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a {
        public k() {
            super(0);
        }

        @Override // com.amazon.aps.iva.xb0.a
        /* renamed from: a */
        public final String invoke() {
            return "Logging impression event for card with id: " + Card.this.getId();
        }
    }

    /* loaded from: classes.dex */
    public static final class l extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a {
        public l() {
            super(0);
        }

        @Override // com.amazon.aps.iva.xb0.a
        /* renamed from: a */
        public final String invoke() {
            return "Logging control impression event for card with id: " + Card.this.getId();
        }
    }

    /* loaded from: classes.dex */
    public static final class m extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a {
        public m() {
            super(0);
        }

        @Override // com.amazon.aps.iva.xb0.a
        /* renamed from: a */
        public final String invoke() {
            return "Failed to log card impression for card id: " + Card.this.getId();
        }
    }

    public Card(com.amazon.aps.iva.if0.c cVar, CardKey.Provider provider, r1 r1Var, ICardStorageProvider<?> iCardStorageProvider, t1 t1Var) {
        Channel channel;
        com.amazon.aps.iva.yb0.j.f(cVar, "jsonObject");
        com.amazon.aps.iva.yb0.j.f(provider, "cardKeysProvider");
        this.jsonObject = cVar;
        this.brazeManager = r1Var;
        this.cardStorage = iCardStorageProvider;
        this.cardAnalytics = t1Var;
        this.extras = JsonUtils.convertJSONObjectToMap(cVar.optJSONObject(provider.getKey(CardKey.EXTRAS)));
        String string = cVar.getString(provider.getKey(CardKey.ID));
        com.amazon.aps.iva.yb0.j.e(string, "jsonObject.getString(car…vider.getKey(CardKey.ID))");
        this.id = string;
        this.isContentCard = provider.isContentCardProvider();
        this.cardType = CardType.DEFAULT;
        if (provider.isContentCardProvider()) {
            channel = Channel.CONTENT_CARD;
        } else {
            channel = Channel.NEWS_FEED;
        }
        this.channel = channel;
        this.wasViewedInternal = cVar.optBoolean(provider.getKey(CardKey.VIEWED));
        this.isDismissedInternal = cVar.optBoolean(provider.getKey(CardKey.DISMISSED), false);
        this.isPinned = cVar.optBoolean(provider.getKey(CardKey.PINNED), false);
        this.created = cVar.getLong(provider.getKey(CardKey.CREATED));
        this.expiresAt = cVar.optLong(provider.getKey(CardKey.EXPIRES_AT), -1L);
        this.openUriInWebView = cVar.optBoolean(provider.getKey(CardKey.OPEN_URI_IN_WEBVIEW), false);
        this.isRemoved = cVar.optBoolean(provider.getKey(CardKey.REMOVED), false);
        com.amazon.aps.iva.if0.a optJSONArray = cVar.optJSONArray(provider.getKey(CardKey.CATEGORIES));
        if (optJSONArray != null && optJSONArray.e() != 0) {
            EnumSet<CardCategory> noneOf = EnumSet.noneOf(CardCategory.class);
            u b0 = s.b0(s.V(x.k0(com.amazon.aps.iva.aq.j.T(0, optJSONArray.e())), new b(optJSONArray)), new c(optJSONArray));
            for (T t : b0.a) {
                CardCategory cardCategory = CardCategory.get((String) b0.b.invoke(t));
                if (cardCategory != null) {
                    noneOf.add(cardCategory);
                }
            }
            this.categories = noneOf;
        } else {
            this.categories = EnumSet.of(CardCategory.NO_CATEGORY);
        }
        this.updated = this.jsonObject.optLong(provider.getKey(CardKey.UPDATED), this.created);
        this.isDismissibleByUser = this.jsonObject.optBoolean(provider.getKey(CardKey.DISMISSIBLE), false);
        this.isIndicatorHighlightedInternal = this.jsonObject.optBoolean(provider.getKey(CardKey.READ), this.wasViewedInternal);
        this.isClicked = this.jsonObject.optBoolean(provider.getKey(CardKey.CLICKED), false);
        this.isTest = this.jsonObject.optBoolean(provider.getKey(CardKey.IS_TEST), false);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !com.amazon.aps.iva.yb0.j.a(getClass(), obj.getClass())) {
            return false;
        }
        Card card = (Card) obj;
        if (this.updated == card.updated && com.amazon.aps.iva.yb0.j.a(this.id, card.id)) {
            return true;
        }
        return false;
    }

    public CardType getCardType() {
        return this.cardType;
    }

    public final Channel getChannel() {
        return this.channel;
    }

    public final long getCreated() {
        return this.created;
    }

    public final Map<String, String> getExtras() {
        return this.extras;
    }

    public final String getId() {
        return this.id;
    }

    public final boolean getOpenUriInWebView() {
        return this.openUriInWebView;
    }

    public String getUrl() {
        return this.url;
    }

    public final boolean getViewed() {
        return this.wasViewedInternal;
    }

    public int hashCode() {
        long j2 = this.updated;
        return (this.id.hashCode() * 31) + ((int) (j2 ^ (j2 >>> 32)));
    }

    public final boolean isControl() {
        if (getCardType() == CardType.CONTROL) {
            return true;
        }
        return false;
    }

    public final boolean isDismissibleByUser() {
        return this.isDismissibleByUser;
    }

    public final boolean isExpired() {
        long j2 = this.expiresAt;
        if (j2 != -1 && j2 <= DateTimeUtils.nowInSeconds()) {
            return true;
        }
        return false;
    }

    public final boolean isInCategorySet(EnumSet<CardCategory> enumSet) {
        com.amazon.aps.iva.yb0.j.f(enumSet, "categories");
        EnumSet<CardCategory> enumSet2 = this.categories;
        if (enumSet2 == null) {
            return false;
        }
        Iterator<E> it = enumSet.iterator();
        while (it.hasNext()) {
            if (enumSet2.contains((CardCategory) it.next())) {
                return true;
            }
        }
        return false;
    }

    public final boolean isIndicatorHighlighted() {
        return this.isIndicatorHighlightedInternal;
    }

    public final boolean isPinned() {
        return this.isPinned;
    }

    public final boolean isValidCard() {
        if (com.amazon.aps.iva.oe0.m.b0(this.id)) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, BrazeLogger.Priority.W, (Throwable) null, g.b, 2, (Object) null);
            return false;
        }
        return true;
    }

    public final boolean logClick() {
        try {
            this.isClicked = true;
            if (this.brazeManager != null && this.cardAnalytics != null && this.cardStorage != null && isValidCard()) {
                p1 b2 = this.cardAnalytics.b(this.id);
                if (b2 != null) {
                    this.brazeManager.a(b2);
                }
                this.cardStorage.markCardAsClicked(this.id);
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, (BrazeLogger.Priority) null, (Throwable) null, new h(), 3, (Object) null);
                return true;
            }
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, BrazeLogger.Priority.W, (Throwable) null, new i(), 2, (Object) null);
            return false;
        } catch (Exception e2) {
            BrazeLogger.INSTANCE.brazelog(this, BrazeLogger.Priority.W, e2, new j());
            return false;
        }
    }

    public final boolean logImpression() {
        try {
            if (this.brazeManager != null && this.cardAnalytics != null && this.cardStorage != null && isValidCard()) {
                if (!isControl()) {
                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, BrazeLogger.Priority.V, (Throwable) null, new k(), 2, (Object) null);
                    p1 d2 = this.cardAnalytics.d(this.id);
                    if (d2 != null) {
                        this.brazeManager.a(d2);
                    }
                } else {
                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, BrazeLogger.Priority.V, (Throwable) null, new l(), 2, (Object) null);
                    p1 c2 = this.cardAnalytics.c(this.id);
                    if (c2 != null) {
                        this.brazeManager.a(c2);
                    }
                }
                this.cardStorage.markCardAsViewed(this.id);
                return true;
            }
            return false;
        } catch (Exception e2) {
            BrazeLogger.INSTANCE.brazelog(this, BrazeLogger.Priority.W, e2, new m());
            return false;
        }
    }

    public final void setDismissed(boolean z) {
        p1 a2;
        if (this.isDismissedInternal && z) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, BrazeLogger.Priority.W, (Throwable) null, d.b, 2, (Object) null);
            return;
        }
        this.isDismissedInternal = z;
        ICardStorageProvider<?> iCardStorageProvider = this.cardStorage;
        if (iCardStorageProvider != null) {
            iCardStorageProvider.markCardAsDismissed(this.id);
        }
        if (z) {
            try {
                if (this.brazeManager != null && this.cardAnalytics != null && isValidCard() && (a2 = this.cardAnalytics.a(this.id)) != null) {
                    this.brazeManager.a(a2);
                }
            } catch (Exception e2) {
                BrazeLogger.INSTANCE.brazelog(this, BrazeLogger.Priority.W, e2, e.b);
            }
        }
    }

    public final void setIndicatorHighlighted(boolean z) {
        ICardStorageProvider<?> iCardStorageProvider;
        this.isIndicatorHighlightedInternal = z;
        try {
            ICardListener iCardListener = this.listener;
            if (iCardListener != null) {
                ((com.amazon.aps.iva.g1.m) iCardListener).b();
            }
        } catch (Exception unused) {
        }
        if (z && (iCardStorageProvider = this.cardStorage) != null) {
            try {
                iCardStorageProvider.markCardAsVisuallyRead(this.id);
            } catch (Exception e2) {
                BrazeLogger.INSTANCE.brazelog(this, BrazeLogger.Priority.D, e2, f.b);
            }
        }
    }

    public final void setListener(ICardListener iCardListener) {
        this.listener = iCardListener;
    }

    public final void setViewed(boolean z) {
        this.wasViewedInternal = z;
        ICardStorageProvider<?> iCardStorageProvider = this.cardStorage;
        if (iCardStorageProvider != null) {
            iCardStorageProvider.markCardAsViewed(this.id);
        }
    }

    public String toString() {
        return com.amazon.aps.iva.oe0.i.T("\n            Card{\n            extras=" + this.extras + "\n            id='" + this.id + "'\n            created=" + this.created + "\n            updated=" + this.updated + "\n            expiresAt=" + this.expiresAt + "\n            categories=" + this.categories + "\n            isContentCard=" + this.isContentCard + "\n            viewed=" + this.wasViewedInternal + "\n            isRead=" + this.isIndicatorHighlightedInternal + "\n            isDismissed=" + this.isDismissedInternal + "\n            isRemoved=" + this.isRemoved + "\n            isPinned=" + this.isPinned + "\n            isClicked=" + this.isClicked + "\n            openUriInWebview=" + this.openUriInWebView + "\n            isDismissibleByUser=" + this.isDismissibleByUser + "\n            isTest=" + this.isTest + "\n            json=" + JsonUtils.getPrettyPrintedString(this.jsonObject) + "\n            }\n\n        ");
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.braze.models.IPutIntoJson
    public com.amazon.aps.iva.if0.c forJsonPut() {
        return this.jsonObject;
    }
}
