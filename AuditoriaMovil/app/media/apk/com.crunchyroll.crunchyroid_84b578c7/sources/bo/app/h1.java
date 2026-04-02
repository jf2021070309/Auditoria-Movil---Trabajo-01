package bo.app;

import android.content.Context;
import android.content.SharedPreferences;
import com.braze.enums.CardKey;
import com.braze.events.FeedUpdatedEvent;
import com.braze.models.cards.Card;
import com.braze.storage.ICardStorageProvider;
import com.braze.support.BrazeLogger;
import com.braze.support.DateTimeUtils;
import com.braze.support.StringUtils;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ConcurrentSkipListSet;
import okhttp3.HttpUrl;
/* loaded from: classes.dex */
public final class h1 implements ICardStorageProvider {
    public static final b f = new b(null);
    private final r1 a;
    private final SharedPreferences b;
    private final Set c;
    private final Set d;
    private final t1 e;

    /* loaded from: classes.dex */
    public enum a {
        READ_CARDS("read_cards_set", "read_cards_flat"),
        VIEWED_CARDS("viewed_cards_set", "viewed_cards_flat");
        
        private final String b;
        private final String c;

        a(String str, String str2) {
            this.b = str;
            this.c = str2;
        }

        public final String b() {
            return this.c;
        }

        public final String c() {
            return this.b;
        }
    }

    /* loaded from: classes.dex */
    public static final class b {
        public /* synthetic */ b(com.amazon.aps.iva.yb0.e eVar) {
            this();
        }

        public final Set a(String str) {
            com.amazon.aps.iva.yb0.j.f(str, "input");
            HashSet hashSet = new HashSet();
            String[] strArr = (String[]) com.amazon.aps.iva.oe0.q.E0(str, new String[]{";"}).toArray(new String[0]);
            Collections.addAll(hashSet, Arrays.copyOf(strArr, strArr.length));
            return hashSet;
        }

        private b() {
        }

        public final Set a(com.amazon.aps.iva.if0.a aVar) {
            com.amazon.aps.iva.yb0.j.f(aVar, "cardsArray");
            HashSet hashSet = new HashSet();
            int e = aVar.e();
            for (int i = 0; i < e; i++) {
                com.amazon.aps.iva.if0.c b = aVar.b(i);
                CardKey cardKey = CardKey.ID;
                if (b.has(cardKey.getFeedKey())) {
                    String string = b.getString(cardKey.getFeedKey());
                    com.amazon.aps.iva.yb0.j.e(string, "card.getString(CardKey.ID.feedKey)");
                    hashSet.add(string);
                }
            }
            return hashSet;
        }
    }

    /* loaded from: classes.dex */
    public static final class c extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a {
        final /* synthetic */ String b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(String str) {
            super(0);
            this.b = str;
        }

        @Override // com.amazon.aps.iva.xb0.a
        /* renamed from: a */
        public final String invoke() {
            return "Updating offline feed for user with id: " + this.b;
        }
    }

    /* loaded from: classes.dex */
    public static final class d extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a {
        final /* synthetic */ String b;
        final /* synthetic */ String c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(String str, String str2) {
            super(0);
            this.b = str;
            this.c = str2;
        }

        @Override // com.amazon.aps.iva.xb0.a
        /* renamed from: a */
        public final String invoke() {
            StringBuilder sb = new StringBuilder("The received cards are for user ");
            sb.append(this.b);
            sb.append(" and the current user is ");
            return defpackage.b.c(sb, this.c, ", the cards will be discarded and no changes will be made.");
        }
    }

    public h1(Context context, String str, r1 r1Var) {
        String str2;
        com.amazon.aps.iva.yb0.j.f(context, "context");
        com.amazon.aps.iva.yb0.j.f(r1Var, "brazeManager");
        this.a = r1Var;
        this.e = new g1();
        if (str == null) {
            str2 = "";
        } else {
            str2 = str;
        }
        String cacheFileSuffix = StringUtils.getCacheFileSuffix(context, str2);
        SharedPreferences sharedPreferences = context.getSharedPreferences("com.appboy.storage.feedstorageprovider" + cacheFileSuffix, 0);
        com.amazon.aps.iva.yb0.j.e(sharedPreferences, "context.getSharedPrefere…Id, Context.MODE_PRIVATE)");
        this.b = sharedPreferences;
        this.c = a(a.VIEWED_CARDS);
        this.d = a(a.READ_CARDS);
        a(str);
    }

    public FeedUpdatedEvent a() {
        return a(new com.amazon.aps.iva.if0.a(this.b.getString("cards", HttpUrl.PATH_SEGMENT_ENCODE_SET_URI)), this.b.getString("uid", ""), true, this.b.getLong("cards_timestamp", -1L));
    }

    @Override // com.braze.storage.ICardStorageProvider
    public void markCardAsClicked(String str) {
        com.amazon.aps.iva.yb0.j.f(str, "cardId");
    }

    @Override // com.braze.storage.ICardStorageProvider
    public void markCardAsDismissed(String str) {
        com.amazon.aps.iva.yb0.j.f(str, "cardId");
    }

    @Override // com.braze.storage.ICardStorageProvider
    public void markCardAsViewed(String str) {
        com.amazon.aps.iva.yb0.j.f(str, "cardId");
        if (this.c.contains(str)) {
            return;
        }
        this.c.add(str);
        a(this.c, a.VIEWED_CARDS);
    }

    @Override // com.braze.storage.ICardStorageProvider
    public void markCardAsVisuallyRead(String str) {
        com.amazon.aps.iva.yb0.j.f(str, "cardId");
        if (this.d.contains(str)) {
            return;
        }
        this.d.add(str);
        a(this.d, a.READ_CARDS);
    }

    public final FeedUpdatedEvent a(com.amazon.aps.iva.if0.a aVar, String str) {
        com.amazon.aps.iva.yb0.j.f(aVar, "cardsArray");
        String str2 = str == null ? "" : str;
        String string = this.b.getString("uid", "");
        if (com.amazon.aps.iva.yb0.j.a(string, str2)) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, BrazeLogger.Priority.I, (Throwable) null, new c(str), 2, (Object) null);
            long nowInSeconds = DateTimeUtils.nowInSeconds();
            a(aVar, nowInSeconds);
            Set set = this.c;
            b bVar = f;
            set.retainAll(bVar.a(aVar));
            a(this.c, a.VIEWED_CARDS);
            this.d.retainAll(bVar.a(aVar));
            a(this.d, a.READ_CARDS);
            return a(aVar, str, false, nowInSeconds);
        }
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, (BrazeLogger.Priority) null, (Throwable) null, new d(str, string), 3, (Object) null);
        return null;
    }

    private final FeedUpdatedEvent a(com.amazon.aps.iva.if0.a aVar, String str, boolean z, long j) {
        List a2;
        if (aVar.e() == 0) {
            a2 = new ArrayList();
        } else {
            a2 = u.a(aVar, new CardKey.Provider(false), this.a, this, this.e);
        }
        List<Card> list = a2;
        for (Card card : list) {
            if (this.c.contains(card.getId())) {
                card.setViewed(true);
                card.setIndicatorHighlighted(true);
            }
            if (this.d.contains(card.getId())) {
                card.setIndicatorHighlighted(true);
            }
        }
        return new FeedUpdatedEvent(list, str, z, j);
    }

    private final Set a(a aVar) {
        String b2 = aVar.b();
        if (this.b.contains(b2)) {
            String string = this.b.getString(b2, null);
            Set a2 = string != null ? f.a(string) : null;
            SharedPreferences.Editor edit = this.b.edit();
            edit.remove(b2);
            edit.apply();
            if (a2 != null) {
                a(a2, aVar);
                return a2;
            }
        }
        return new ConcurrentSkipListSet(this.b.getStringSet(aVar.c(), new HashSet()));
    }

    private final void a(com.amazon.aps.iva.if0.a aVar, long j) {
        SharedPreferences.Editor edit = this.b.edit();
        if (aVar.e() == 0) {
            edit.remove("cards");
        } else {
            edit.putString("cards", aVar.toString());
        }
        edit.putLong("cards_timestamp", j);
        edit.apply();
    }

    private final void a(String str) {
        SharedPreferences.Editor edit = this.b.edit();
        edit.putString("uid", str);
        edit.apply();
    }

    public final void a(Set set, a aVar) {
        com.amazon.aps.iva.yb0.j.f(set, "cardIds");
        com.amazon.aps.iva.yb0.j.f(aVar, "property");
        String c2 = aVar.c();
        SharedPreferences.Editor edit = this.b.edit();
        if (set.isEmpty()) {
            edit.remove(c2);
        } else {
            edit.putStringSet(c2, set);
        }
        edit.apply();
    }
}
