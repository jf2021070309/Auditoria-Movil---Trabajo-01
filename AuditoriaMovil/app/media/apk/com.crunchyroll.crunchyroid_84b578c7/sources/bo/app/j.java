package bo.app;

import bo.app.a1;
import com.braze.enums.inappmessage.InAppMessageFailureType;
import com.braze.models.IBrazeLocation;
import com.braze.models.inappmessage.MessageButton;
import com.braze.models.outgoing.BrazeProperties;
import com.braze.support.BrazeLogger;
import com.braze.support.DateTimeUtils;
import com.braze.support.JsonUtils;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.math.BigDecimal;
/* loaded from: classes.dex */
public class j implements p1 {
    private final a1 b;
    private final com.amazon.aps.iva.if0.c c;
    private final double d;
    private final String e;
    private final x2 f;
    private final x2 g;
    static final /* synthetic */ com.amazon.aps.iva.fc0.l[] i = {defpackage.e.b(j.class, "userId", "getUserId()Ljava/lang/String;", 0), defpackage.e.b(j.class, "sessionId", "getSessionId()Lcom/braze/models/SessionId;", 0)};
    public static final a h = new a(null);

    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: bo.app.j$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static final class C0075a extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a {
            final /* synthetic */ String b;
            final /* synthetic */ String c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0075a(String str, String str2) {
                super(0);
                this.b = str;
                this.c = str2;
            }

            @Override // com.amazon.aps.iva.xb0.a
            /* renamed from: a */
            public final p1 invoke() {
                com.amazon.aps.iva.if0.c put = new com.amazon.aps.iva.if0.c().put("key", this.b).put("value", this.c);
                a1 a1Var = a1.ADD_TO_CUSTOM_ATTRIBUTE_ARRAY;
                com.amazon.aps.iva.yb0.j.e(put, "eventData");
                return new j(a1Var, put, 0.0d, (String) null, 12, (com.amazon.aps.iva.yb0.e) null);
            }
        }

        /* loaded from: classes.dex */
        public static final class a0 extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a {
            final /* synthetic */ long b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a0(long j) {
                super(0);
                this.b = j;
            }

            @Override // com.amazon.aps.iva.xb0.a
            /* renamed from: a */
            public final p1 invoke() {
                com.amazon.aps.iva.if0.c put = new com.amazon.aps.iva.if0.c().put("d", this.b);
                a1 a1Var = a1.SESSION_END;
                com.amazon.aps.iva.yb0.j.e(put, "eventData");
                return new j(a1Var, put, 0.0d, (String) null, 12, (com.amazon.aps.iva.yb0.e) null);
            }
        }

        /* loaded from: classes.dex */
        public static final class b extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a {
            final /* synthetic */ String b;
            final /* synthetic */ String c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(String str, String str2) {
                super(0);
                this.b = str;
                this.c = str2;
            }

            @Override // com.amazon.aps.iva.xb0.a
            /* renamed from: a */
            public final p1 invoke() {
                com.amazon.aps.iva.if0.c cVar = new com.amazon.aps.iva.if0.c(this.b);
                String string = cVar.getString(AppMeasurementSdk.ConditionalUserProperty.NAME);
                a1.a aVar = a1.c;
                com.amazon.aps.iva.yb0.j.e(string, "eventTypeString");
                a1 a = aVar.a(string);
                com.amazon.aps.iva.if0.c jSONObject = cVar.getJSONObject("data");
                double d = cVar.getDouble("time");
                String optionalString = JsonUtils.getOptionalString(cVar, "user_id");
                String optionalString2 = JsonUtils.getOptionalString(cVar, "session_id");
                com.amazon.aps.iva.yb0.j.e(jSONObject, "data");
                return new j(a, jSONObject, d, this.c, optionalString, optionalString2);
            }
        }

        /* loaded from: classes.dex */
        public static final class b0 extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a {
            final /* synthetic */ e5 b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b0(e5 e5Var) {
                super(0);
                this.b = e5Var;
            }

            @Override // com.amazon.aps.iva.xb0.a
            /* renamed from: a */
            public final p1 invoke() {
                j jVar = new j(a1.SESSION_START, (com.amazon.aps.iva.if0.c) null, 0.0d, (String) null, 14, (com.amazon.aps.iva.yb0.e) null);
                jVar.a(this.b);
                return jVar;
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
            public final p1 invoke() {
                com.amazon.aps.iva.if0.c cVar = new com.amazon.aps.iva.if0.c();
                com.amazon.aps.iva.if0.a aVar = new com.amazon.aps.iva.if0.a();
                aVar.put(this.b);
                cVar.put("ids", aVar);
                return new j(a1.CONTENT_CARDS_CLICK, cVar, 0.0d, (String) null, 12, (com.amazon.aps.iva.yb0.e) null);
            }
        }

        /* loaded from: classes.dex */
        public static final class c0 extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a {
            final /* synthetic */ String b;
            final /* synthetic */ String[] c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public c0(String str, String[] strArr) {
                super(0);
                this.b = str;
                this.c = strArr;
            }

            @Override // com.amazon.aps.iva.xb0.a
            /* renamed from: a */
            public final p1 invoke() {
                com.amazon.aps.iva.if0.c cVar = new com.amazon.aps.iva.if0.c();
                cVar.put("key", this.b);
                String[] strArr = this.c;
                if (strArr == null) {
                    cVar.put("value", com.amazon.aps.iva.if0.c.NULL);
                } else {
                    cVar.put("value", JsonUtils.constructJsonArray(strArr));
                }
                return new j(a1.SET_CUSTOM_ATTRIBUTE_ARRAY, cVar, 0.0d, (String) null, 12, (com.amazon.aps.iva.yb0.e) null);
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
            public final p1 invoke() {
                com.amazon.aps.iva.if0.c cVar = new com.amazon.aps.iva.if0.c();
                com.amazon.aps.iva.if0.a aVar = new com.amazon.aps.iva.if0.a();
                aVar.put(this.b);
                cVar.put("ids", aVar);
                return new j(a1.CONTENT_CARDS_CONTROL_IMPRESSION, cVar, 0.0d, (String) null, 12, (com.amazon.aps.iva.yb0.e) null);
            }
        }

        /* loaded from: classes.dex */
        public static final class d0 extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a {
            final /* synthetic */ String b;
            final /* synthetic */ n5 c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public d0(String str, n5 n5Var) {
                super(0);
                this.b = str;
                this.c = n5Var;
            }

            @Override // com.amazon.aps.iva.xb0.a
            /* renamed from: a */
            public final p1 invoke() {
                com.amazon.aps.iva.if0.c put = new com.amazon.aps.iva.if0.c().put(FirebaseAnalytics.Param.GROUP_ID, this.b).put("status", this.c.forJsonPut());
                a1 a1Var = a1.SUBSCRIPTION_GROUP_UPDATE;
                com.amazon.aps.iva.yb0.j.e(put, "eventData");
                return new j(a1Var, put, 0.0d, (String) null, 12, (com.amazon.aps.iva.yb0.e) null);
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
            public final p1 invoke() {
                com.amazon.aps.iva.if0.c cVar = new com.amazon.aps.iva.if0.c();
                com.amazon.aps.iva.if0.a aVar = new com.amazon.aps.iva.if0.a();
                aVar.put(this.b);
                cVar.put("ids", aVar);
                return new j(a1.CONTENT_CARDS_DISMISS, cVar, 0.0d, (String) null, 12, (com.amazon.aps.iva.yb0.e) null);
            }
        }

        /* loaded from: classes.dex */
        public static final class e0 extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a {
            final /* synthetic */ String b;
            final /* synthetic */ String c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public e0(String str, String str2) {
                super(0);
                this.b = str;
                this.c = str2;
            }

            @Override // com.amazon.aps.iva.xb0.a
            /* renamed from: a */
            public final p1 invoke() {
                com.amazon.aps.iva.if0.c put = new com.amazon.aps.iva.if0.c().put("a", this.b).put("l", this.c);
                a1 a1Var = a1.USER_ALIAS;
                com.amazon.aps.iva.yb0.j.e(put, "eventData");
                return new j(a1Var, put, 0.0d, (String) null, 12, (com.amazon.aps.iva.yb0.e) null);
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
            public final p1 invoke() {
                com.amazon.aps.iva.if0.c cVar = new com.amazon.aps.iva.if0.c();
                com.amazon.aps.iva.if0.a aVar = new com.amazon.aps.iva.if0.a();
                aVar.put(this.b);
                cVar.put("ids", aVar);
                return new j(a1.CONTENT_CARDS_IMPRESSION, cVar, 0.0d, (String) null, 12, (com.amazon.aps.iva.yb0.e) null);
            }
        }

        /* loaded from: classes.dex */
        public static final class f0 extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a {
            public static final f0 b = new f0();

            public f0() {
                super(0);
            }

            @Override // com.amazon.aps.iva.xb0.a
            /* renamed from: a */
            public final String invoke() {
                return "Failed to create event";
            }
        }

        /* loaded from: classes.dex */
        public static final class g extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a {
            final /* synthetic */ String b;
            final /* synthetic */ BrazeProperties c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public g(String str, BrazeProperties brazeProperties) {
                super(0);
                this.b = str;
                this.c = brazeProperties;
            }

            @Override // com.amazon.aps.iva.xb0.a
            /* renamed from: a */
            public final p1 invoke() {
                com.amazon.aps.iva.if0.c put = new com.amazon.aps.iva.if0.c().put("n", this.b);
                BrazeProperties brazeProperties = this.c;
                if (brazeProperties != null && brazeProperties.getSize() > 0) {
                    put.put("p", this.c.forJsonPut());
                }
                a1 a1Var = a1.CUSTOM_EVENT;
                com.amazon.aps.iva.yb0.j.e(put, "eventData");
                return new j(a1Var, put, 0.0d, (String) null, 12, (com.amazon.aps.iva.yb0.e) null);
            }
        }

        /* loaded from: classes.dex */
        public static final class h extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a {
            final /* synthetic */ Throwable b;
            final /* synthetic */ e5 c;
            final /* synthetic */ boolean d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public h(Throwable th, e5 e5Var, boolean z) {
                super(0);
                this.b = th;
                this.c = e5Var;
                this.d = z;
            }

            @Override // com.amazon.aps.iva.xb0.a
            /* renamed from: a */
            public final p1 invoke() {
                String str;
                StringBuilder sb = new StringBuilder("\n                original_sdk_version: 27.0.1\n                exception_class: ");
                sb.append(this.b.getClass().getName());
                sb.append("\n                available_cpus: ");
                sb.append(Runtime.getRuntime().availableProcessors());
                sb.append("\n                ");
                e5 e5Var = this.c;
                if (e5Var != null) {
                    str = "session_id: " + e5Var;
                } else {
                    str = null;
                }
                sb.append(str);
                sb.append("\n                ");
                sb.append(j.h.a(this.b));
                sb.append("\n            ");
                com.amazon.aps.iva.if0.c put = new com.amazon.aps.iva.if0.c().put("e", com.amazon.aps.iva.oe0.i.T(sb.toString()));
                if (!this.d) {
                    put.put("nop", true);
                }
                a1 a1Var = a1.INTERNAL_ERROR;
                com.amazon.aps.iva.yb0.j.e(put, "eventData");
                return new j(a1Var, put, 0.0d, (String) null, 12, (com.amazon.aps.iva.yb0.e) null);
            }
        }

        /* renamed from: bo.app.j$a$j  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static final class C0076j extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a {
            final /* synthetic */ String b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0076j(String str) {
                super(0);
                this.b = str;
            }

            @Override // com.amazon.aps.iva.xb0.a
            /* renamed from: a */
            public final p1 invoke() {
                com.amazon.aps.iva.if0.c cVar = new com.amazon.aps.iva.if0.c();
                com.amazon.aps.iva.if0.a aVar = new com.amazon.aps.iva.if0.a();
                aVar.put(this.b);
                cVar.put("ids", aVar);
                return new j(a1.NEWS_FEED_CARD_CLICK, cVar, 0.0d, (String) null, 12, (com.amazon.aps.iva.yb0.e) null);
            }
        }

        /* loaded from: classes.dex */
        public static final class k extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a {
            final /* synthetic */ String b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public k(String str) {
                super(0);
                this.b = str;
            }

            @Override // com.amazon.aps.iva.xb0.a
            /* renamed from: a */
            public final p1 invoke() {
                com.amazon.aps.iva.if0.c cVar = new com.amazon.aps.iva.if0.c();
                com.amazon.aps.iva.if0.a aVar = new com.amazon.aps.iva.if0.a();
                aVar.put(this.b);
                cVar.put("ids", aVar);
                return new j(a1.NEWS_FEED_CARD_IMPRESSION, cVar, 0.0d, (String) null, 12, (com.amazon.aps.iva.yb0.e) null);
            }
        }

        /* loaded from: classes.dex */
        public static final class m extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a {
            final /* synthetic */ String b;
            final /* synthetic */ String c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public m(String str, String str2) {
                super(0);
                this.b = str;
                this.c = str2;
            }

            @Override // com.amazon.aps.iva.xb0.a
            /* renamed from: a */
            public final p1 invoke() {
                return new j(a1.INAPP_MESSAGE_BUTTON_CLICK, a.a(j.h, this.b, this.c, null, 4, null), 0.0d, (String) null, 12, (com.amazon.aps.iva.yb0.e) null);
            }
        }

        /* loaded from: classes.dex */
        public static final class n extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a {
            final /* synthetic */ String b;
            final /* synthetic */ MessageButton c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public n(String str, MessageButton messageButton) {
                super(0);
                this.b = str;
                this.c = messageButton;
            }

            @Override // com.amazon.aps.iva.xb0.a
            /* renamed from: a */
            public final p1 invoke() {
                return new j(a1.INAPP_MESSAGE_BUTTON_CLICK, a.a(j.h, this.b, this.c.getStringId(), null, 4, null), 0.0d, (String) null, 12, (com.amazon.aps.iva.yb0.e) null);
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
            public final p1 invoke() {
                return new j(a1.INAPP_MESSAGE_CLICK, a.a(j.h, this.b, null, null, 6, null), 0.0d, (String) null, 12, (com.amazon.aps.iva.yb0.e) null);
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
            public final p1 invoke() {
                return new j(a1.INAPP_MESSAGE_CONTROL_IMPRESSION, a.a(j.h, this.b, null, null, 6, null), 0.0d, (String) null, 12, (com.amazon.aps.iva.yb0.e) null);
            }
        }

        /* loaded from: classes.dex */
        public static final class q extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a {
            final /* synthetic */ String b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public q(String str) {
                super(0);
                this.b = str;
            }

            @Override // com.amazon.aps.iva.xb0.a
            /* renamed from: a */
            public final p1 invoke() {
                return new j(a1.INAPP_MESSAGE_IMPRESSION, a.a(j.h, this.b, null, null, 6, null), 0.0d, (String) null, 12, (com.amazon.aps.iva.yb0.e) null);
            }
        }

        /* loaded from: classes.dex */
        public static final class r extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a {
            final /* synthetic */ String b;
            final /* synthetic */ int c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public r(String str, int i) {
                super(0);
                this.b = str;
                this.c = i;
            }

            @Override // com.amazon.aps.iva.xb0.a
            /* renamed from: a */
            public final p1 invoke() {
                com.amazon.aps.iva.if0.c put = new com.amazon.aps.iva.if0.c().put("key", this.b).put("value", this.c);
                a1 a1Var = a1.INCREMENT;
                com.amazon.aps.iva.yb0.j.e(put, "eventData");
                return new j(a1Var, put, 0.0d, (String) null, 12, (com.amazon.aps.iva.yb0.e) null);
            }
        }

        /* loaded from: classes.dex */
        public static final class s extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a {
            final /* synthetic */ String b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public s(String str) {
                super(0);
                this.b = str;
            }

            @Override // com.amazon.aps.iva.xb0.a
            /* renamed from: a */
            public final p1 invoke() {
                com.amazon.aps.iva.if0.c put = new com.amazon.aps.iva.if0.c().put("n", this.b);
                a1 a1Var = a1.INTERNAL;
                com.amazon.aps.iva.yb0.j.e(put, "eventData");
                return new j(a1Var, put, 0.0d, (String) null, 12, (com.amazon.aps.iva.yb0.e) null);
            }
        }

        /* loaded from: classes.dex */
        public static final class t extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a {
            final /* synthetic */ String b;
            final /* synthetic */ double c;
            final /* synthetic */ double d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public t(String str, double d, double d2) {
                super(0);
                this.b = str;
                this.c = d;
                this.d = d2;
            }

            @Override // com.amazon.aps.iva.xb0.a
            /* renamed from: a */
            public final p1 invoke() {
                com.amazon.aps.iva.if0.c put = new com.amazon.aps.iva.if0.c().put("key", this.b).put("latitude", this.c).put("longitude", this.d);
                a1 a1Var = a1.LOCATION_CUSTOM_ATTRIBUTE_ADD;
                com.amazon.aps.iva.yb0.j.e(put, "eventData");
                return new j(a1Var, put, 0.0d, (String) null, 12, (com.amazon.aps.iva.yb0.e) null);
            }
        }

        /* loaded from: classes.dex */
        public static final class v extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a {
            final /* synthetic */ IBrazeLocation b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public v(IBrazeLocation iBrazeLocation) {
                super(0);
                this.b = iBrazeLocation;
            }

            @Override // com.amazon.aps.iva.xb0.a
            /* renamed from: a */
            public final p1 invoke() {
                return new j(a1.LOCATION_RECORDED, this.b.forJsonPut(), 0.0d, (String) null, 12, (com.amazon.aps.iva.yb0.e) null);
            }
        }

        /* loaded from: classes.dex */
        public static final class w extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a {
            final /* synthetic */ String b;
            final /* synthetic */ com.amazon.aps.iva.if0.c c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public w(String str, com.amazon.aps.iva.if0.c cVar) {
                super(0);
                this.b = str;
                this.c = cVar;
            }

            @Override // com.amazon.aps.iva.xb0.a
            /* renamed from: a */
            public final p1 invoke() {
                com.amazon.aps.iva.if0.c put = new com.amazon.aps.iva.if0.c().put("key", this.b).put("value", this.c);
                a1 a1Var = a1.NESTED_CUSTOM_ATTRIBUTE_MERGE;
                com.amazon.aps.iva.yb0.j.e(put, "eventData");
                return new j(a1Var, put, 0.0d, (String) null, 12, (com.amazon.aps.iva.yb0.e) null);
            }
        }

        /* loaded from: classes.dex */
        public static final class x extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a {
            final /* synthetic */ BrazeProperties b;
            final /* synthetic */ String c;
            final /* synthetic */ String d;
            final /* synthetic */ BigDecimal e;
            final /* synthetic */ int f;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public x(BrazeProperties brazeProperties, String str, String str2, BigDecimal bigDecimal, int i) {
                super(0);
                this.b = brazeProperties;
                this.c = str;
                this.d = str2;
                this.e = bigDecimal;
                this.f = i;
            }

            @Override // com.amazon.aps.iva.xb0.a
            /* renamed from: a */
            public final p1 invoke() {
                com.amazon.aps.iva.if0.c cVar = new com.amazon.aps.iva.if0.c();
                String str = this.c;
                String str2 = this.d;
                BigDecimal bigDecimal = this.e;
                int i = this.f;
                cVar.put("pid", str);
                cVar.put("c", str2);
                cVar.put("p", i3.a(bigDecimal).doubleValue());
                cVar.put("q", i);
                BrazeProperties brazeProperties = this.b;
                if (brazeProperties != null && brazeProperties.getSize() > 0) {
                    cVar.put("pr", this.b.forJsonPut());
                }
                return new j(a1.PURCHASE, cVar, 0.0d, (String) null, 12, (com.amazon.aps.iva.yb0.e) null);
            }
        }

        /* loaded from: classes.dex */
        public static final class y extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a {
            final /* synthetic */ String b;
            final /* synthetic */ String c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public y(String str, String str2) {
                super(0);
                this.b = str;
                this.c = str2;
            }

            @Override // com.amazon.aps.iva.xb0.a
            /* renamed from: a */
            public final p1 invoke() {
                com.amazon.aps.iva.if0.c put = new com.amazon.aps.iva.if0.c().put("cid", this.b).put("a", this.c);
                a1 a1Var = a1.PUSH_STORY_PAGE_CLICK;
                com.amazon.aps.iva.yb0.j.e(put, "eventData");
                return new j(a1Var, put, 0.0d, (String) null, 12, (com.amazon.aps.iva.yb0.e) null);
            }
        }

        /* loaded from: classes.dex */
        public static final class z extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a {
            final /* synthetic */ String b;
            final /* synthetic */ String c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public z(String str, String str2) {
                super(0);
                this.b = str;
                this.c = str2;
            }

            @Override // com.amazon.aps.iva.xb0.a
            /* renamed from: a */
            public final p1 invoke() {
                com.amazon.aps.iva.if0.c put = new com.amazon.aps.iva.if0.c().put("key", this.b).put("value", this.c);
                a1 a1Var = a1.REMOVE_FROM_CUSTOM_ATTRIBUTE_ARRAY;
                com.amazon.aps.iva.yb0.j.e(put, "eventData");
                return new j(a1Var, put, 0.0d, (String) null, 12, (com.amazon.aps.iva.yb0.e) null);
            }
        }

        public /* synthetic */ a(com.amazon.aps.iva.yb0.e eVar) {
            this();
        }

        public final p1 a(String str, BrazeProperties brazeProperties) {
            com.amazon.aps.iva.yb0.j.f(str, "eventName");
            return a(new g(str, brazeProperties));
        }

        public final p1 b(String str) {
            com.amazon.aps.iva.yb0.j.f(str, "cardId");
            return a(new d(str));
        }

        public final p1 c(String str) {
            com.amazon.aps.iva.yb0.j.f(str, "cardId");
            return a(new e(str));
        }

        public final p1 d(String str) {
            com.amazon.aps.iva.yb0.j.f(str, "cardId");
            return a(new f(str));
        }

        public final p1 e(String str) {
            com.amazon.aps.iva.yb0.j.f(str, "cardId");
            return a(new C0076j(str));
        }

        public final p1 f(String str) {
            com.amazon.aps.iva.yb0.j.f(str, "cardId");
            return a(new k(str));
        }

        public final p1 g(String str, String str2) {
            com.amazon.aps.iva.yb0.j.f(str, "alias");
            com.amazon.aps.iva.yb0.j.f(str2, "label");
            return a(new e0(str, str2));
        }

        public final p1 h(String str) {
            com.amazon.aps.iva.yb0.j.f(str, "triggerId");
            return a(new p(str));
        }

        public final p1 i(String str) {
            com.amazon.aps.iva.yb0.j.f(str, "triggerId");
            return a(new q(str));
        }

        public final p1 j(String str) {
            com.amazon.aps.iva.yb0.j.f(str, AppMeasurementSdk.ConditionalUserProperty.NAME);
            return a(new s(str));
        }

        private a() {
        }

        public final p1 a(String str, String str2, BigDecimal bigDecimal, int i, BrazeProperties brazeProperties) {
            com.amazon.aps.iva.yb0.j.f(str, "productId");
            com.amazon.aps.iva.yb0.j.f(str2, "currencyCode");
            com.amazon.aps.iva.yb0.j.f(bigDecimal, FirebaseAnalytics.Param.PRICE);
            return a(new x(brazeProperties, str, str2, bigDecimal, i));
        }

        public final p1 b(String str, String str2) {
            com.amazon.aps.iva.yb0.j.f(str, "serializedEvent");
            com.amazon.aps.iva.yb0.j.f(str2, "uniqueIdentifier");
            return a(new b(str, str2));
        }

        public final p1 d(String str, String str2) {
            com.amazon.aps.iva.yb0.j.f(str, "triggerId");
            com.amazon.aps.iva.yb0.j.f(str2, "buttonId");
            return a(new m(str, str2));
        }

        public final p1 e(String str, String str2) {
            com.amazon.aps.iva.yb0.j.f(str, "campaignId");
            com.amazon.aps.iva.yb0.j.f(str2, "pageId");
            return a(new y(str, str2));
        }

        public final p1 f(String str, String str2) {
            com.amazon.aps.iva.yb0.j.f(str, "key");
            com.amazon.aps.iva.yb0.j.f(str2, "value");
            return a(new z(str, str2));
        }

        public final p1 g(String str) {
            com.amazon.aps.iva.yb0.j.f(str, "triggerId");
            return a(new o(str));
        }

        public final p1 a(IBrazeLocation iBrazeLocation) {
            com.amazon.aps.iva.yb0.j.f(iBrazeLocation, FirebaseAnalytics.Param.LOCATION);
            return a(new v(iBrazeLocation));
        }

        public final p1 a(Throwable th, e5 e5Var, boolean z2) {
            com.amazon.aps.iva.yb0.j.f(th, "throwable");
            return a(new h(th, e5Var, z2));
        }

        public final p1 a(String str) {
            com.amazon.aps.iva.yb0.j.f(str, "cardId");
            return a(new c(str));
        }

        public final p1 a(String str, MessageButton messageButton) {
            com.amazon.aps.iva.yb0.j.f(str, "triggerId");
            com.amazon.aps.iva.yb0.j.f(messageButton, "messageButton");
            return a(new n(str, messageButton));
        }

        public final p1 a() {
            return j("feed_displayed");
        }

        public final p1 a(String str, int i) {
            com.amazon.aps.iva.yb0.j.f(str, "customUserAttributeKey");
            return a(new r(str, i));
        }

        public final p1 a(String str, String str2) {
            com.amazon.aps.iva.yb0.j.f(str, "key");
            com.amazon.aps.iva.yb0.j.f(str2, "value");
            return a(new C0075a(str, str2));
        }

        public final p1 a(String str, String[] strArr) {
            com.amazon.aps.iva.yb0.j.f(str, "key");
            return a(new c0(str, strArr));
        }

        public final p1 a(e5 e5Var) {
            com.amazon.aps.iva.yb0.j.f(e5Var, "sessionId");
            return a(new b0(e5Var));
        }

        public final p1 a(long j) {
            return a(new a0(j));
        }

        public final p1 a(String str, double d2, double d3) {
            com.amazon.aps.iva.yb0.j.f(str, "key");
            return a(new t(str, d2, d3));
        }

        public final p1 a(String str, com.amazon.aps.iva.if0.c cVar) {
            com.amazon.aps.iva.yb0.j.f(str, "key");
            com.amazon.aps.iva.yb0.j.f(cVar, "json");
            return a(new w(str, cVar));
        }

        public final p1 a(String str, n5 n5Var) {
            com.amazon.aps.iva.yb0.j.f(str, "subscriptionGroupId");
            com.amazon.aps.iva.yb0.j.f(n5Var, "subscriptionGroupStatus");
            return a(new d0(str, n5Var));
        }

        public final String a(Throwable th) {
            com.amazon.aps.iva.yb0.j.f(th, "throwable");
            StringWriter stringWriter = new StringWriter();
            th.printStackTrace(new PrintWriter(stringWriter));
            String stringWriter2 = stringWriter.toString();
            com.amazon.aps.iva.yb0.j.e(stringWriter2, "result.toString()");
            return com.amazon.aps.iva.oe0.r.Q0(5000, stringWriter2);
        }

        public static /* synthetic */ com.amazon.aps.iva.if0.c a(a aVar, String str, String str2, InAppMessageFailureType inAppMessageFailureType, int i, Object obj) {
            if ((i & 1) != 0) {
                str = null;
            }
            if ((i & 2) != 0) {
                str2 = null;
            }
            if ((i & 4) != 0) {
                inAppMessageFailureType = null;
            }
            return aVar.a(str, str2, inAppMessageFailureType);
        }

        public final com.amazon.aps.iva.if0.c a(String str, String str2, InAppMessageFailureType inAppMessageFailureType) {
            com.amazon.aps.iva.if0.c cVar = new com.amazon.aps.iva.if0.c();
            boolean z2 = false;
            if (!(str == null || str.length() == 0)) {
                com.amazon.aps.iva.if0.a aVar = new com.amazon.aps.iva.if0.a();
                aVar.put(str);
                cVar.put("trigger_ids", aVar);
            }
            if (str2 == null || str2.length() == 0) {
                z2 = true;
            }
            if (!z2) {
                cVar.put("bid", str2);
            }
            if (inAppMessageFailureType != null) {
                cVar.put("error_code", inAppMessageFailureType.forJsonPut());
            }
            return cVar;
        }

        private final p1 a(com.amazon.aps.iva.xb0.a aVar) {
            try {
                return (p1) aVar.invoke();
            } catch (Exception e2) {
                BrazeLogger.INSTANCE.brazelog(this, BrazeLogger.Priority.E, e2, f0.b);
                return null;
            }
        }
    }

    /* loaded from: classes.dex */
    public static final class b extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a {
        public static final b b = new b();

        public b() {
            super(0);
        }

        @Override // com.amazon.aps.iva.xb0.a
        /* renamed from: a */
        public final String invoke() {
            return "Caught exception creating Braze event json";
        }
    }

    public j(a1 a1Var, com.amazon.aps.iva.if0.c cVar, double d, String str) {
        com.amazon.aps.iva.yb0.j.f(a1Var, "type");
        com.amazon.aps.iva.yb0.j.f(cVar, "data");
        com.amazon.aps.iva.yb0.j.f(str, "uniqueIdentifier");
        this.b = a1Var;
        this.c = cVar;
        this.d = d;
        this.e = str;
        this.f = new x2();
        this.g = new x2();
        if (a1Var == a1.UNKNOWN) {
            throw new IllegalArgumentException("Event type cannot be unknown.");
        }
    }

    @Override // bo.app.p1
    public final void a(String str) {
        this.f.setValue(this, i[0], str);
    }

    @Override // bo.app.p1
    public final a1 c() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && com.amazon.aps.iva.yb0.j.a(getClass(), obj.getClass())) {
            return com.amazon.aps.iva.yb0.j.a(t(), ((j) obj).t());
        }
        return false;
    }

    public int hashCode() {
        return t().hashCode();
    }

    @Override // bo.app.p1
    public boolean m() {
        if (this.b != a1.INTERNAL_ERROR || !q().optBoolean("nop", false)) {
            return false;
        }
        return true;
    }

    @Override // bo.app.p1
    public com.amazon.aps.iva.if0.c q() {
        return this.c;
    }

    @Override // bo.app.p1
    public final e5 s() {
        return (e5) this.g.getValue(this, i[1]);
    }

    @Override // bo.app.p1
    public String t() {
        return this.e;
    }

    public String toString() {
        return f();
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0034 A[Catch: b -> 0x004d, TryCatch #0 {b -> 0x004d, blocks: (B:3:0x0005, B:5:0x0028, B:11:0x0034, B:12:0x003d, B:14:0x0043), top: B:19:0x0005 }] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0043 A[Catch: b -> 0x004d, TRY_LEAVE, TryCatch #0 {b -> 0x004d, blocks: (B:3:0x0005, B:5:0x0028, B:11:0x0034, B:12:0x003d, B:14:0x0043), top: B:19:0x0005 }] */
    @Override // com.braze.models.IPutIntoJson
    /* renamed from: u */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public com.amazon.aps.iva.if0.c forJsonPut() {
        /*
            r5 = this;
            com.amazon.aps.iva.if0.c r0 = new com.amazon.aps.iva.if0.c
            r0.<init>()
            java.lang.String r1 = "name"
            bo.app.a1 r2 = r5.b     // Catch: com.amazon.aps.iva.if0.b -> L4d
            java.lang.String r2 = r2.forJsonPut()     // Catch: com.amazon.aps.iva.if0.b -> L4d
            r0.put(r1, r2)     // Catch: com.amazon.aps.iva.if0.b -> L4d
            java.lang.String r1 = "data"
            com.amazon.aps.iva.if0.c r2 = r5.q()     // Catch: com.amazon.aps.iva.if0.b -> L4d
            r0.put(r1, r2)     // Catch: com.amazon.aps.iva.if0.b -> L4d
            java.lang.String r1 = "time"
            double r2 = r5.v()     // Catch: com.amazon.aps.iva.if0.b -> L4d
            r0.put(r1, r2)     // Catch: com.amazon.aps.iva.if0.b -> L4d
            java.lang.String r1 = r5.w()     // Catch: com.amazon.aps.iva.if0.b -> L4d
            if (r1 == 0) goto L31
            int r1 = r1.length()     // Catch: com.amazon.aps.iva.if0.b -> L4d
            if (r1 != 0) goto L2f
            goto L31
        L2f:
            r1 = 0
            goto L32
        L31:
            r1 = 1
        L32:
            if (r1 != 0) goto L3d
            java.lang.String r1 = "user_id"
            java.lang.String r2 = r5.w()     // Catch: com.amazon.aps.iva.if0.b -> L4d
            r0.put(r1, r2)     // Catch: com.amazon.aps.iva.if0.b -> L4d
        L3d:
            bo.app.e5 r1 = r5.s()     // Catch: com.amazon.aps.iva.if0.b -> L4d
            if (r1 == 0) goto L57
            java.lang.String r2 = "session_id"
            java.lang.String r1 = r1.forJsonPut()     // Catch: com.amazon.aps.iva.if0.b -> L4d
            r0.put(r2, r1)     // Catch: com.amazon.aps.iva.if0.b -> L4d
            goto L57
        L4d:
            r1 = move-exception
            com.braze.support.BrazeLogger r2 = com.braze.support.BrazeLogger.INSTANCE
            com.braze.support.BrazeLogger$Priority r3 = com.braze.support.BrazeLogger.Priority.E
            bo.app.j$b r4 = bo.app.j.b.b
            r2.brazelog(r5, r3, r1, r4)
        L57:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: bo.app.j.forJsonPut():com.amazon.aps.iva.if0.c");
    }

    public double v() {
        return this.d;
    }

    public final String w() {
        return (String) this.f.getValue(this, i[0]);
    }

    @Override // bo.app.p1
    public final void a(e5 e5Var) {
        this.g.setValue(this, i[1], e5Var);
    }

    public /* synthetic */ j(a1 a1Var, com.amazon.aps.iva.if0.c cVar, double d, String str, int i2, com.amazon.aps.iva.yb0.e eVar) {
        this(a1Var, (i2 & 2) != 0 ? new com.amazon.aps.iva.if0.c() : cVar, (i2 & 4) != 0 ? DateTimeUtils.nowInSecondsPrecise() : d, (i2 & 8) != 0 ? com.amazon.aps.iva.j0.j0.d("randomUUID().toString()") : str);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public j(a1 a1Var, com.amazon.aps.iva.if0.c cVar, double d, String str, String str2, String str3) {
        this(a1Var, cVar, d, str);
        com.amazon.aps.iva.yb0.j.f(a1Var, "eventType");
        com.amazon.aps.iva.yb0.j.f(cVar, "eventData");
        com.amazon.aps.iva.yb0.j.f(str, "uniqueIdentifier");
        a(str2);
        a(str3 != null ? e5.d.a(str3) : null);
    }
}
