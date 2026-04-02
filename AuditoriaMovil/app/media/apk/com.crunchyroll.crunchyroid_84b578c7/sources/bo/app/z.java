package bo.app;

import android.content.Context;
import android.content.SharedPreferences;
import com.braze.enums.CardKey;
import com.braze.events.ContentCardsUpdatedEvent;
import com.braze.models.cards.Card;
import com.braze.storage.ICardStorageProvider;
import com.braze.support.BrazeLogger;
import com.braze.support.DateTimeUtils;
import com.braze.support.StringUtils;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
/* loaded from: classes.dex */
public final class z implements ICardStorageProvider {
    public static final b f = new b(null);
    private static final Set g = com.amazon.aps.iva.e4.l1.I(CardKey.VIEWED.getContentCardsKey(), CardKey.DISMISSED.getContentCardsKey());
    private final String a;
    private final r1 b;
    private final SharedPreferences c;
    private final SharedPreferences d;
    private final t1 e;

    /* loaded from: classes.dex */
    public static final class a extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a {
        final /* synthetic */ String b;
        final /* synthetic */ String c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String str, String str2) {
            super(0);
            this.b = str;
            this.c = str2;
        }

        @Override // com.amazon.aps.iva.xb0.a
        /* renamed from: a */
        public final String invoke() {
            StringBuilder sb = new StringBuilder("Detected SDK update from '");
            sb.append(this.b);
            sb.append("' -> '");
            return defpackage.b.c(sb, this.c, "'. Clearing config update time.");
        }
    }

    /* loaded from: classes.dex */
    public static final class b {
        public /* synthetic */ b(com.amazon.aps.iva.yb0.e eVar) {
            this();
        }

        public final com.amazon.aps.iva.if0.c a(com.amazon.aps.iva.if0.c cVar, com.amazon.aps.iva.if0.c cVar2) {
            com.amazon.aps.iva.yb0.j.f(cVar2, "serverCard");
            if (cVar == null) {
                return cVar2;
            }
            com.amazon.aps.iva.if0.c cVar3 = new com.amazon.aps.iva.if0.c();
            Iterator<String> keys = cVar.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                cVar3.put(next, cVar.get(next));
            }
            Iterator<String> keys2 = cVar2.keys();
            while (keys2.hasNext()) {
                String next2 = keys2.next();
                if (z.g.contains(next2)) {
                    cVar3.put(next2, cVar.getBoolean(next2) || cVar2.getBoolean(next2));
                } else {
                    cVar3.put(next2, cVar2.get(next2));
                }
            }
            return cVar3;
        }

        public final boolean b(com.amazon.aps.iva.if0.c cVar, com.amazon.aps.iva.if0.c cVar2) {
            com.amazon.aps.iva.yb0.j.f(cVar2, "serverCard");
            if (cVar == null) {
                return false;
            }
            String contentCardsKey = CardKey.CREATED.getContentCardsKey();
            if (!cVar.has(contentCardsKey) || !cVar2.has(contentCardsKey) || cVar.getLong(contentCardsKey) <= cVar2.getLong(contentCardsKey)) {
                return false;
            }
            return true;
        }

        private b() {
        }

        public final boolean a(com.amazon.aps.iva.if0.c cVar, CardKey cardKey) {
            com.amazon.aps.iva.yb0.j.f(cVar, "json");
            com.amazon.aps.iva.yb0.j.f(cardKey, "cardKey");
            String contentCardsKey = cardKey.getContentCardsKey();
            if (cVar.has(contentCardsKey)) {
                return cVar.getBoolean(contentCardsKey);
            }
            return false;
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
            return "Adding card to test cache: " + this.b;
        }
    }

    /* loaded from: classes.dex */
    public static final class d extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a {
        final /* synthetic */ String b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(String str) {
            super(0);
            this.b = str;
        }

        @Override // com.amazon.aps.iva.xb0.a
        /* renamed from: a */
        public final String invoke() {
            return "Deleting expired card from storage with id: " + this.b;
        }
    }

    /* loaded from: classes.dex */
    public static final class e extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a {
        final /* synthetic */ String b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(String str) {
            super(0);
            this.b = str;
        }

        @Override // com.amazon.aps.iva.xb0.a
        /* renamed from: a */
        public final String invoke() {
            return "Card not present in storage for id: " + this.b;
        }
    }

    /* loaded from: classes.dex */
    public static final class f extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a {
        final /* synthetic */ String b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(String str) {
            super(0);
            this.b = str;
        }

        @Override // com.amazon.aps.iva.xb0.a
        /* renamed from: a */
        public final String invoke() {
            return "Failed to read card json from storage. Json: " + this.b;
        }
    }

    /* loaded from: classes.dex */
    public static final class g extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a {
        final /* synthetic */ String b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(String str) {
            super(0);
            this.b = str;
        }

        @Override // com.amazon.aps.iva.xb0.a
        /* renamed from: a */
        public final String invoke() {
            return "Removing card from test cache: " + this.b;
        }
    }

    /* loaded from: classes.dex */
    public static final class h extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a {
        final /* synthetic */ String b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(String str) {
            super(0);
            this.b = str;
        }

        @Override // com.amazon.aps.iva.xb0.a
        /* renamed from: a */
        public final String invoke() {
            return "Removing card from storage with id: " + this.b;
        }
    }

    /* loaded from: classes.dex */
    public static final class i extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a {
        public static final i b = new i();

        public i() {
            super(0);
        }

        @Override // com.amazon.aps.iva.xb0.a
        /* renamed from: a */
        public final String invoke() {
            return "The server card received is older than the cached card. Discarding the server card.";
        }
    }

    /* loaded from: classes.dex */
    public static final class j extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a {
        final /* synthetic */ com.amazon.aps.iva.if0.c b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(com.amazon.aps.iva.if0.c cVar) {
            super(0);
            this.b = cVar;
        }

        @Override // com.amazon.aps.iva.xb0.a
        /* renamed from: a */
        public final String invoke() {
            return "Server card json: " + this.b;
        }
    }

    /* loaded from: classes.dex */
    public static final class k extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a {
        final /* synthetic */ com.amazon.aps.iva.if0.c b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k(com.amazon.aps.iva.if0.c cVar) {
            super(0);
            this.b = cVar;
        }

        @Override // com.amazon.aps.iva.xb0.a
        /* renamed from: a */
        public final String invoke() {
            return "Cached card json: " + this.b;
        }
    }

    /* loaded from: classes.dex */
    public static final class l extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a {
        final /* synthetic */ String b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public l(String str) {
            super(0);
            this.b = str;
        }

        @Override // com.amazon.aps.iva.xb0.a
        /* renamed from: a */
        public final String invoke() {
            return "Server card is marked as removed. Removing from card storage with id: " + this.b;
        }
    }

    /* loaded from: classes.dex */
    public static final class m extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a {
        final /* synthetic */ com.amazon.aps.iva.if0.c b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public m(com.amazon.aps.iva.if0.c cVar) {
            super(0);
            this.b = cVar;
        }

        @Override // com.amazon.aps.iva.xb0.a
        /* renamed from: a */
        public final String invoke() {
            return "Server card was locally dismissed already. Not adding card to storage. Server card: " + this.b;
        }
    }

    /* loaded from: classes.dex */
    public static final class n extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a {
        final /* synthetic */ com.amazon.aps.iva.if0.c b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public n(com.amazon.aps.iva.if0.c cVar) {
            super(0);
            this.b = cVar;
        }

        @Override // com.amazon.aps.iva.xb0.a
        /* renamed from: a */
        public final String invoke() {
            return "Server card has expired already. Not adding card to storage. Server card: " + this.b;
        }
    }

    /* loaded from: classes.dex */
    public static final class o extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a {
        final /* synthetic */ String b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o(String str) {
            super(0);
            this.b = str;
        }

        @Override // com.amazon.aps.iva.xb0.a
        /* renamed from: a */
        public final String invoke() {
            return "Server card is marked as dismissed. Adding to dismissed cached and removing from card storage with id: " + this.b;
        }
    }

    /* loaded from: classes.dex */
    public static final class p extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a {
        final /* synthetic */ String b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public p(String str) {
            super(0);
            this.b = str;
        }

        @Override // com.amazon.aps.iva.xb0.a
        /* renamed from: a */
        public final String invoke() {
            return "Can't update card field. Json cannot be parsed from disk or is not present. Id: " + this.b;
        }
    }

    /* loaded from: classes.dex */
    public static final class q extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a {
        final /* synthetic */ Object b;
        final /* synthetic */ CardKey c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public q(Object obj, CardKey cardKey) {
            super(0);
            this.b = obj;
            this.c = cardKey;
        }

        @Override // com.amazon.aps.iva.xb0.a
        /* renamed from: a */
        public final String invoke() {
            return "Failed to update card json field to " + this.b + " with key: " + this.c;
        }
    }

    /* loaded from: classes.dex */
    public static final class r extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l {
        final /* synthetic */ com.amazon.aps.iva.if0.a b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public r(com.amazon.aps.iva.if0.a aVar) {
            super(1);
            this.b = aVar;
        }

        public final Boolean a(int i) {
            return Boolean.valueOf(this.b.f(i) instanceof com.amazon.aps.iva.if0.c);
        }

        @Override // com.amazon.aps.iva.xb0.l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return a(((Number) obj).intValue());
        }
    }

    /* loaded from: classes.dex */
    public static final class s extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l {
        final /* synthetic */ com.amazon.aps.iva.if0.a b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public s(com.amazon.aps.iva.if0.a aVar) {
            super(1);
            this.b = aVar;
        }

        public final Object a(int i) {
            return (com.amazon.aps.iva.if0.c) this.b.get(i);
        }

        @Override // com.amazon.aps.iva.xb0.l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return a(((Number) obj).intValue());
        }
    }

    /* loaded from: classes.dex */
    public static final class t extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a {
        public static final t b = new t();

        public t() {
            super(0);
        }

        @Override // com.amazon.aps.iva.xb0.a
        /* renamed from: a */
        public final String invoke() {
            return "Input user id was null. Defaulting to the empty user id";
        }
    }

    /* loaded from: classes.dex */
    public static final class u extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a {
        final /* synthetic */ com.amazon.aps.iva.yb0.d0 b;
        final /* synthetic */ z c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public u(com.amazon.aps.iva.yb0.d0 d0Var, z zVar) {
            super(0);
            this.b = d0Var;
            this.c = zVar;
        }

        @Override // com.amazon.aps.iva.xb0.a
        /* renamed from: a */
        public final String invoke() {
            return "The received cards are for user " + ((String) this.b.b) + " and the current user is " + this.c.a + " , the cards will be discarded and no changes will be made.";
        }
    }

    /* loaded from: classes.dex */
    public static final class v extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a {
        final /* synthetic */ com.amazon.aps.iva.yb0.d0 b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public v(com.amazon.aps.iva.yb0.d0 d0Var) {
            super(0);
            this.b = d0Var;
        }

        @Override // com.amazon.aps.iva.xb0.a
        /* renamed from: a */
        public final String invoke() {
            return "Updating offline Content Cards for user with id: " + ((String) this.b.b);
        }
    }

    public z(Context context, String str, String str2, r1 r1Var, String str3) {
        com.amazon.aps.iva.yb0.j.f(context, "context");
        com.amazon.aps.iva.yb0.j.f(str, "userId");
        com.amazon.aps.iva.yb0.j.f(str2, "apiKey");
        com.amazon.aps.iva.yb0.j.f(r1Var, "brazeManager");
        com.amazon.aps.iva.yb0.j.f(str3, "currentSdkVersion");
        this.a = str;
        this.b = r1Var;
        String cacheFileSuffix = StringUtils.getCacheFileSuffix(context, str, str2);
        SharedPreferences sharedPreferences = context.getSharedPreferences("com.braze.storage.content_cards_storage_provider.metadata" + cacheFileSuffix, 0);
        com.amazon.aps.iva.yb0.j.e(sharedPreferences, "context.getSharedPrefere…ix, Context.MODE_PRIVATE)");
        this.d = sharedPreferences;
        SharedPreferences sharedPreferences2 = context.getSharedPreferences("com.appboy.storage.content_cards_storage_provider.cards" + cacheFileSuffix, 0);
        com.amazon.aps.iva.yb0.j.e(sharedPreferences2, "context.getSharedPrefere…ix, Context.MODE_PRIVATE)");
        this.c = sharedPreferences2;
        String string = sharedPreferences.getString("last_accessed_sdk_version", "");
        if (!com.amazon.aps.iva.yb0.j.a(str3, string)) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, BrazeLogger.Priority.V, (Throwable) null, new a(string, str3), 2, (Object) null);
            sharedPreferences.edit().putLong("last_full_sync_at", 0L).putString("last_accessed_sdk_version", str3).apply();
        }
        this.e = new x();
    }

    private final long g() {
        return this.d.getLong("last_storage_update_timestamp", 0L);
    }

    private final void i() {
        this.d.edit().putLong("last_storage_update_timestamp", DateTimeUtils.nowInSeconds()).apply();
    }

    public ContentCardsUpdatedEvent b() {
        return a(true);
    }

    public final Set c() {
        Set<String> stringSet = this.d.getStringSet("dismissed", new HashSet());
        return stringSet != null ? com.amazon.aps.iva.lb0.x.b1(com.amazon.aps.iva.lb0.x.r0(stringSet)) : com.amazon.aps.iva.lb0.x.b1(com.amazon.aps.iva.lb0.b0.b);
    }

    public final Set d() {
        Set<String> stringSet = this.d.getStringSet("expired", new HashSet());
        return stringSet != null ? com.amazon.aps.iva.lb0.x.b1(com.amazon.aps.iva.lb0.x.r0(stringSet)) : com.amazon.aps.iva.lb0.x.b1(com.amazon.aps.iva.lb0.b0.b);
    }

    public final long e() {
        return this.d.getLong("last_card_updated_at", 0L);
    }

    public final long f() {
        return this.d.getLong("last_full_sync_at", 0L);
    }

    public final Set h() {
        Iterable iterable;
        Set<String> stringSet = this.d.getStringSet("test", new HashSet());
        if (stringSet != null) {
            iterable = com.amazon.aps.iva.lb0.x.r0(stringSet);
        } else {
            iterable = com.amazon.aps.iva.lb0.b0.b;
        }
        return com.amazon.aps.iva.lb0.x.b1(iterable);
    }

    @Override // com.braze.storage.ICardStorageProvider
    public void markCardAsClicked(String str) {
        com.amazon.aps.iva.yb0.j.f(str, "cardId");
        a(str, CardKey.CLICKED, Boolean.TRUE);
    }

    @Override // com.braze.storage.ICardStorageProvider
    public void markCardAsDismissed(String str) {
        com.amazon.aps.iva.yb0.j.f(str, "cardId");
        a(str);
        a(str, (com.amazon.aps.iva.if0.c) null);
    }

    @Override // com.braze.storage.ICardStorageProvider
    public void markCardAsViewed(String str) {
        com.amazon.aps.iva.yb0.j.f(str, "cardId");
        a(str, CardKey.VIEWED, Boolean.TRUE);
    }

    @Override // com.braze.storage.ICardStorageProvider
    public void markCardAsVisuallyRead(String str) {
        com.amazon.aps.iva.yb0.j.f(str, "cardId");
        a(str, CardKey.READ, Boolean.TRUE);
    }

    private final boolean b(com.amazon.aps.iva.if0.c cVar) {
        Set c2 = c();
        Set d2 = d();
        String string = cVar.getString(CardKey.ID.getContentCardsKey());
        com.amazon.aps.iva.yb0.j.e(string, "serverCardId");
        com.amazon.aps.iva.if0.c d3 = d(string);
        b bVar = f;
        if (bVar.b(d3, cVar)) {
            BrazeLogger brazeLogger = BrazeLogger.INSTANCE;
            BrazeLogger.brazelog$default(brazeLogger, this, BrazeLogger.Priority.I, (Throwable) null, i.b, 2, (Object) null);
            BrazeLogger.brazelog$default(brazeLogger, this, (BrazeLogger.Priority) null, (Throwable) null, new j(cVar), 3, (Object) null);
            BrazeLogger.brazelog$default(brazeLogger, this, (BrazeLogger.Priority) null, (Throwable) null, new k(cVar), 3, (Object) null);
            return false;
        } else if (bVar.a(cVar, CardKey.REMOVED)) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, (BrazeLogger.Priority) null, (Throwable) null, new l(string), 3, (Object) null);
            e(string);
            f(string);
            a(string, (com.amazon.aps.iva.if0.c) null);
            return true;
        } else if (c2.contains(string)) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, (BrazeLogger.Priority) null, (Throwable) null, new m(cVar), 3, (Object) null);
            return true;
        } else if (d2.contains(string)) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, (BrazeLogger.Priority) null, (Throwable) null, new n(cVar), 3, (Object) null);
            return true;
        } else if (bVar.a(cVar, CardKey.DISMISSED)) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, (BrazeLogger.Priority) null, (Throwable) null, new o(string), 3, (Object) null);
            a(string);
            a(string, (com.amazon.aps.iva.if0.c) null);
            return true;
        } else {
            a(string, bVar.a(d3, cVar));
            if (bVar.a(cVar, CardKey.IS_TEST)) {
                c(string);
            }
            return true;
        }
    }

    public final void e(String str) {
        com.amazon.aps.iva.yb0.j.f(str, "cardId");
        Set<String> c2 = c();
        c2.remove(str);
        this.d.edit().putStringSet("dismissed", c2).apply();
    }

    public final void f(String str) {
        com.amazon.aps.iva.yb0.j.f(str, "cardId");
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, BrazeLogger.Priority.V, (Throwable) null, new g(str), 2, (Object) null);
        Set<String> h2 = h();
        h2.remove(str);
        this.d.edit().putStringSet("test", h2).apply();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final ContentCardsUpdatedEvent a(y yVar, String str) {
        com.amazon.aps.iva.yb0.j.f(yVar, "contentCardsResponse");
        com.amazon.aps.iva.yb0.d0 d0Var = new com.amazon.aps.iva.yb0.d0();
        d0Var.b = str;
        if (str == 0) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, (BrazeLogger.Priority) null, (Throwable) null, t.b, 3, (Object) null);
            d0Var.b = "";
        }
        if (!com.amazon.aps.iva.yb0.j.a(this.a, d0Var.b)) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, BrazeLogger.Priority.I, (Throwable) null, new u(d0Var, this), 2, (Object) null);
            return null;
        }
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, BrazeLogger.Priority.I, (Throwable) null, new v(d0Var), 2, (Object) null);
        a(yVar);
        i();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        com.amazon.aps.iva.if0.a a2 = yVar.a();
        if (a2 != null && a2.e() != 0) {
            com.amazon.aps.iva.ne0.u b0 = com.amazon.aps.iva.ne0.s.b0(com.amazon.aps.iva.ne0.s.V(com.amazon.aps.iva.lb0.x.k0(com.amazon.aps.iva.aq.j.T(0, a2.e())), new r(a2)), new s(a2));
            for (T t2 : b0.a) {
                com.amazon.aps.iva.if0.c cVar = (com.amazon.aps.iva.if0.c) b0.b.invoke(t2);
                if (b(cVar)) {
                    String string = cVar.getString(CardKey.ID.getContentCardsKey());
                    com.amazon.aps.iva.yb0.j.e(string, "serverCardJson.getString…rdKey.ID.contentCardsKey)");
                    linkedHashSet.add(string);
                }
            }
        }
        if (yVar.d()) {
            b(linkedHashSet);
            c(linkedHashSet);
            linkedHashSet.addAll(h());
            a(linkedHashSet);
        }
        return a(false);
    }

    public final void c(String str) {
        com.amazon.aps.iva.yb0.j.f(str, "cardId");
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, BrazeLogger.Priority.V, (Throwable) null, new c(str), 2, (Object) null);
        Set<String> h2 = h();
        h2.add(str);
        this.d.edit().putStringSet("test", h2).apply();
    }

    public final com.amazon.aps.iva.if0.c d(String str) {
        com.amazon.aps.iva.yb0.j.f(str, "cardId");
        String string = this.c.getString(str, null);
        if (string == null) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, (BrazeLogger.Priority) null, (Throwable) null, new e(str), 3, (Object) null);
            return null;
        }
        try {
            return new com.amazon.aps.iva.if0.c(string);
        } catch (com.amazon.aps.iva.if0.b e2) {
            BrazeLogger.INSTANCE.brazelog(this, BrazeLogger.Priority.E, e2, new f(string));
            return null;
        }
    }

    public final void c(Set set) {
        com.amazon.aps.iva.yb0.j.f(set, "cardIdsToRetain");
        Set<String> d2 = d();
        d2.retainAll(set);
        this.d.edit().putStringSet("expired", d2).apply();
    }

    public /* synthetic */ z(Context context, String str, String str2, r1 r1Var, String str3, int i2, com.amazon.aps.iva.yb0.e eVar) {
        this(context, str, str2, r1Var, (i2 & 16) != 0 ? "27.0.1" : str3);
    }

    public final void b(Set set) {
        com.amazon.aps.iva.yb0.j.f(set, "cardIdsToRetain");
        Set<String> c2 = c();
        c2.retainAll(set);
        this.d.edit().putStringSet("dismissed", c2).apply();
    }

    public final ContentCardsUpdatedEvent a(boolean z) {
        CardKey.Provider provider = CardKey.Provider.CONTENT_CARDS;
        Map<String, ?> all = this.c.getAll();
        com.amazon.aps.iva.if0.a aVar = new com.amazon.aps.iva.if0.a();
        Iterator<?> it = all.values().iterator();
        while (it.hasNext()) {
            aVar.put((String) it.next());
        }
        List a2 = bo.app.u.a(aVar, provider, this.b, this, this.e);
        ArrayList<Card> arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : a2) {
            if (((Card) obj).isExpired()) {
                arrayList.add(obj);
            } else {
                arrayList2.add(obj);
            }
        }
        for (Card card : arrayList) {
            a(card);
        }
        return new ContentCardsUpdatedEvent(arrayList2, this.a, g(), z);
    }

    public final void b(String str) {
        com.amazon.aps.iva.yb0.j.f(str, "cardId");
        Set<String> d2 = d();
        d2.add(str);
        this.d.edit().putStringSet("expired", d2).apply();
    }

    public final void a(Card card) {
        com.amazon.aps.iva.yb0.j.f(card, "card");
        String id = card.getId();
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, (BrazeLogger.Priority) null, (Throwable) null, new d(id), 3, (Object) null);
        a(id, (com.amazon.aps.iva.if0.c) null);
        b(id);
        f(id);
    }

    public final void a(String str, CardKey cardKey, Object obj) {
        com.amazon.aps.iva.yb0.j.f(str, "cardId");
        com.amazon.aps.iva.yb0.j.f(cardKey, "cardKey");
        com.amazon.aps.iva.yb0.j.f(obj, "value");
        com.amazon.aps.iva.if0.c d2 = d(str);
        if (d2 == null) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, (BrazeLogger.Priority) null, (Throwable) null, new p(str), 3, (Object) null);
            return;
        }
        try {
            d2.put(cardKey.getContentCardsKey(), obj);
            a(str, d2);
        } catch (com.amazon.aps.iva.if0.b e2) {
            BrazeLogger.INSTANCE.brazelog(this, BrazeLogger.Priority.E, e2, new q(obj, cardKey));
        }
    }

    public final void a(y yVar) {
        com.amazon.aps.iva.yb0.j.f(yVar, "contentCardsResponse");
        SharedPreferences.Editor edit = this.d.edit();
        if (yVar.b() != -1) {
            edit.putLong("last_card_updated_at", yVar.b());
        }
        if (yVar.c() != -1) {
            edit.putLong("last_full_sync_at", yVar.c());
        }
        edit.apply();
    }

    public final void a(String str, com.amazon.aps.iva.if0.c cVar) {
        com.amazon.aps.iva.yb0.j.f(str, "cardId");
        SharedPreferences.Editor edit = this.c.edit();
        if (cVar != null) {
            edit.putString(str, cVar.toString());
        } else {
            edit.remove(str);
        }
        edit.apply();
    }

    public final void a(String str) {
        com.amazon.aps.iva.yb0.j.f(str, "cardId");
        Set<String> c2 = c();
        c2.add(str);
        this.d.edit().putStringSet("dismissed", c2).apply();
    }

    public final void a(Set set) {
        com.amazon.aps.iva.yb0.j.f(set, "cardIdsToRetain");
        Set<String> keySet = this.c.getAll().keySet();
        SharedPreferences.Editor edit = this.c.edit();
        for (String str : keySet) {
            if (!set.contains(str)) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, (BrazeLogger.Priority) null, (Throwable) null, new h(str), 3, (Object) null);
                edit.remove(str);
            }
        }
        edit.apply();
    }
}
