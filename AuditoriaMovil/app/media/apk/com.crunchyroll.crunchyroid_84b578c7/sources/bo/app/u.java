package bo.app;

import com.amazon.aps.iva.ne0.u;
import com.braze.enums.CardKey;
import com.braze.enums.CardType;
import com.braze.models.cards.BannerImageCard;
import com.braze.models.cards.CaptionedImageCard;
import com.braze.models.cards.Card;
import com.braze.models.cards.ControlCard;
import com.braze.models.cards.ShortNewsCard;
import com.braze.models.cards.TextAnnouncementCard;
import com.braze.storage.ICardStorageProvider;
import com.braze.support.BrazeLogger;
import java.util.List;
/* loaded from: classes.dex */
public final class u {
    public static final u a = new u();

    /* loaded from: classes.dex */
    public /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[CardType.values().length];
            try {
                iArr[CardType.BANNER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[CardType.CAPTIONED_IMAGE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[CardType.SHORT_NEWS.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[CardType.TEXT_ANNOUNCEMENT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[CardType.CONTROL.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            a = iArr;
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
            return Boolean.valueOf(this.b.f(i) instanceof Object);
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
            return this.b.get(i);
        }

        @Override // com.amazon.aps.iva.xb0.l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return a(((Number) obj).intValue());
        }
    }

    /* loaded from: classes.dex */
    public static final class d extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l {
        final /* synthetic */ CardKey.Provider b;
        final /* synthetic */ r1 c;
        final /* synthetic */ ICardStorageProvider d;
        final /* synthetic */ t1 e;
        final /* synthetic */ com.amazon.aps.iva.if0.a f;

        /* loaded from: classes.dex */
        public static final class a extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a {
            final /* synthetic */ Object b;
            final /* synthetic */ com.amazon.aps.iva.if0.a c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(Object obj, com.amazon.aps.iva.if0.a aVar) {
                super(0);
                this.b = obj;
                this.c = aVar;
            }

            @Override // com.amazon.aps.iva.xb0.a
            /* renamed from: a */
            public final String invoke() {
                return "Unable to create Card JSON in array. Ignoring. Was on element: " + this.b + " of json array: " + this.c;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(CardKey.Provider provider, r1 r1Var, ICardStorageProvider iCardStorageProvider, t1 t1Var, com.amazon.aps.iva.if0.a aVar) {
            super(1);
            this.b = provider;
            this.c = r1Var;
            this.d = iCardStorageProvider;
            this.e = t1Var;
            this.f = aVar;
        }

        @Override // com.amazon.aps.iva.xb0.l
        /* renamed from: a */
        public final Card invoke(Object obj) {
            com.amazon.aps.iva.yb0.j.f(obj, "it");
            try {
                return u.a.a(obj.toString(), this.b, this.c, this.d, this.e);
            } catch (Exception e) {
                BrazeLogger.INSTANCE.brazelog(u.a, BrazeLogger.Priority.E, e, new a(obj, this.f));
                return null;
            }
        }
    }

    private u() {
    }

    public static final Card a(com.amazon.aps.iva.if0.c cVar, CardKey.Provider provider, r1 r1Var, ICardStorageProvider iCardStorageProvider, t1 t1Var) {
        Card bannerImageCard;
        com.amazon.aps.iva.yb0.j.f(cVar, "jsonObject");
        com.amazon.aps.iva.yb0.j.f(provider, "cardKeyProvider");
        com.amazon.aps.iva.yb0.j.f(r1Var, "brazeManager");
        com.amazon.aps.iva.yb0.j.f(iCardStorageProvider, "cardStorageProvider");
        com.amazon.aps.iva.yb0.j.f(t1Var, "cardAnalyticsProvider");
        CardType cardTypeFromJson = provider.getCardTypeFromJson(cVar);
        int i = cardTypeFromJson == null ? -1 : a.a[cardTypeFromJson.ordinal()];
        if (i == 1) {
            bannerImageCard = new BannerImageCard(cVar, provider, r1Var, iCardStorageProvider, t1Var);
        } else if (i == 2) {
            bannerImageCard = new CaptionedImageCard(cVar, provider, r1Var, iCardStorageProvider, t1Var);
        } else if (i == 3) {
            bannerImageCard = new ShortNewsCard(cVar, provider, r1Var, iCardStorageProvider, t1Var);
        } else if (i == 4) {
            bannerImageCard = new TextAnnouncementCard(cVar, provider, r1Var, iCardStorageProvider, t1Var);
        } else if (i != 5) {
            return null;
        } else {
            bannerImageCard = new ControlCard(cVar, provider, r1Var, iCardStorageProvider, t1Var);
        }
        return bannerImageCard;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Card a(String str, CardKey.Provider provider, r1 r1Var, ICardStorageProvider iCardStorageProvider, t1 t1Var) {
        return a(new com.amazon.aps.iva.if0.c(str), provider, r1Var, iCardStorageProvider, t1Var);
    }

    public static final List a(com.amazon.aps.iva.if0.a aVar, CardKey.Provider provider, r1 r1Var, ICardStorageProvider iCardStorageProvider, t1 t1Var) {
        com.amazon.aps.iva.yb0.j.f(aVar, "cardJsonStringArray");
        com.amazon.aps.iva.yb0.j.f(provider, "cardKeyProvider");
        com.amazon.aps.iva.yb0.j.f(r1Var, "brazeManager");
        com.amazon.aps.iva.yb0.j.f(iCardStorageProvider, "cardStorageProvider");
        com.amazon.aps.iva.yb0.j.f(t1Var, "cardAnalyticsProvider");
        return com.amazon.aps.iva.ne0.s.f0(com.amazon.aps.iva.ne0.s.c0(com.amazon.aps.iva.ne0.k.O(new u.a(com.amazon.aps.iva.ne0.s.b0(com.amazon.aps.iva.ne0.s.V(com.amazon.aps.iva.lb0.x.k0(com.amazon.aps.iva.aq.j.T(0, aVar.e())), new b(aVar)), new c(aVar)))), new d(provider, r1Var, iCardStorageProvider, t1Var, aVar)));
    }
}
