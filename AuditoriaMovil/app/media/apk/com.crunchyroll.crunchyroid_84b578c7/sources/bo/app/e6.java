package bo.app;

import com.braze.models.inappmessage.IInAppMessage;
import com.braze.support.BrazeLogger;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.ArrayList;
import java.util.List;
/* loaded from: classes.dex */
public final class e6 {
    public static final e6 a = new e6();
    private static final String b = BrazeLogger.getBrazeLogTag(e6.class);

    /* loaded from: classes.dex */
    public static final class a extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a {
        public static final a b = new a();

        public a() {
            super(0);
        }

        @Override // com.amazon.aps.iva.xb0.a
        /* renamed from: a */
        public final String invoke() {
            return "Templated message Json was null. Not de-serializing templated message.";
        }
    }

    /* loaded from: classes.dex */
    public static final class b extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a {
        final /* synthetic */ String b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(String str) {
            super(0);
            this.b = str;
        }

        @Override // com.amazon.aps.iva.xb0.a
        /* renamed from: a */
        public final String invoke() {
            return defpackage.b.c(new StringBuilder("Received templated message Json with unknown type: "), this.b, ". Not parsing.");
        }
    }

    /* loaded from: classes.dex */
    public static final class c extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a {
        final /* synthetic */ com.amazon.aps.iva.if0.c b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(com.amazon.aps.iva.if0.c cVar) {
            super(0);
            this.b = cVar;
        }

        @Override // com.amazon.aps.iva.xb0.a
        /* renamed from: a */
        public final String invoke() {
            return "Encountered exception processing templated message: " + this.b;
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
            return "Received null or blank trigger condition Json. Not parsing.";
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
            return defpackage.b.c(new StringBuilder("Received triggered condition Json with unknown type: "), this.b, ". Not parsing.");
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
            return "Received unknown trigger type: " + this.b;
        }
    }

    /* loaded from: classes.dex */
    public static final class g extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a {
        final /* synthetic */ com.amazon.aps.iva.if0.c b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(com.amazon.aps.iva.if0.c cVar) {
            super(0);
            this.b = cVar;
        }

        @Override // com.amazon.aps.iva.xb0.a
        /* renamed from: a */
        public final String invoke() {
            return "Failed to deserialize triggered action Json: " + this.b;
        }
    }

    /* loaded from: classes.dex */
    public static final class h extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a {
        public static final h b = new h();

        public h() {
            super(0);
        }

        @Override // com.amazon.aps.iva.xb0.a
        /* renamed from: a */
        public final String invoke() {
            return "Triggered actions Json array was null. Not de-serializing triggered actions.";
        }
    }

    /* loaded from: classes.dex */
    public static final class i extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a {
        final /* synthetic */ com.amazon.aps.iva.if0.a b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(com.amazon.aps.iva.if0.a aVar) {
            super(0);
            this.b = aVar;
        }

        @Override // com.amazon.aps.iva.xb0.a
        /* renamed from: a */
        public final String invoke() {
            return "Failed to deserialize triggered actions Json array: " + this.b;
        }
    }

    private e6() {
    }

    public final IInAppMessage a(com.amazon.aps.iva.if0.c cVar, r1 r1Var) {
        com.amazon.aps.iva.yb0.j.f(r1Var, "brazeManager");
        try {
            if (cVar == null) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, b, (BrazeLogger.Priority) null, (Throwable) null, (com.amazon.aps.iva.xb0.a) a.b, 6, (Object) null);
                return null;
            }
            String string = cVar.getString("type");
            if (com.amazon.aps.iva.yb0.j.a(string, "inapp")) {
                com.amazon.aps.iva.if0.c jSONObject = cVar.getJSONObject("data");
                if (jSONObject == null) {
                    return null;
                }
                return com.braze.support.h.a(jSONObject, r1Var);
            }
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, b, BrazeLogger.Priority.W, (Throwable) null, (com.amazon.aps.iva.xb0.a) new b(string), 4, (Object) null);
            return null;
        } catch (Exception e2) {
            BrazeLogger.INSTANCE.brazelog(b, BrazeLogger.Priority.W, (Throwable) e2, (com.amazon.aps.iva.xb0.a<String>) new c(cVar));
            return null;
        }
    }

    public final q2 b(com.amazon.aps.iva.if0.c cVar, r1 r1Var) {
        String string;
        com.amazon.aps.iva.yb0.j.f(cVar, "actionJson");
        com.amazon.aps.iva.yb0.j.f(r1Var, "brazeManager");
        try {
            string = cVar.getString("type");
        } catch (Exception e2) {
            BrazeLogger.INSTANCE.brazelog(b, BrazeLogger.Priority.W, (Throwable) e2, (com.amazon.aps.iva.xb0.a<String>) new g(cVar));
        }
        if (com.amazon.aps.iva.yb0.j.a(string, "inapp")) {
            return new w2(cVar, r1Var);
        }
        if (com.amazon.aps.iva.yb0.j.a(string, "templated_iam")) {
            return new q5(cVar, r1Var);
        }
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, BrazeLogger.Priority.I, (Throwable) null, new f(string), 2, (Object) null);
        return null;
    }

    public final List a(com.amazon.aps.iva.if0.a aVar, r1 r1Var) {
        com.amazon.aps.iva.yb0.j.f(r1Var, "brazeManager");
        try {
            if (aVar == null) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, b, (BrazeLogger.Priority) null, (Throwable) null, (com.amazon.aps.iva.xb0.a) h.b, 6, (Object) null);
                return null;
            }
            ArrayList arrayList = new ArrayList();
            int e2 = aVar.e();
            for (int i2 = 0; i2 < e2; i2++) {
                q2 b2 = b(aVar.b(i2), r1Var);
                if (b2 != null) {
                    arrayList.add(b2);
                }
            }
            return arrayList;
        } catch (Exception e3) {
            BrazeLogger.INSTANCE.brazelog(b, BrazeLogger.Priority.W, (Throwable) e3, (com.amazon.aps.iva.xb0.a<String>) new i(aVar));
            return null;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public final List a(com.amazon.aps.iva.if0.a aVar) {
        com.amazon.aps.iva.yb0.j.f(aVar, "triggerConditionsJson");
        ArrayList arrayList = new ArrayList();
        int e2 = aVar.e();
        for (int i2 = 0; i2 < e2; i2++) {
            com.amazon.aps.iva.if0.c j = aVar.j(i2);
            if (j == null) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, b, BrazeLogger.Priority.W, (Throwable) null, (com.amazon.aps.iva.xb0.a) d.b, 4, (Object) null);
            } else {
                String string = j.getString("type");
                if (string != null) {
                    switch (string.hashCode()) {
                        case -1679221933:
                            if (string.equals("purchase_property")) {
                                arrayList.add(new u3(j));
                                break;
                            }
                            break;
                        case 3417674:
                            if (string.equals("open")) {
                                arrayList.add(new k3());
                                break;
                            }
                            break;
                        case 3556498:
                            if (string.equals("test")) {
                                arrayList.add(new r5());
                                break;
                            }
                            break;
                        case 447503464:
                            if (string.equals("custom_event_property")) {
                                arrayList.add(new d0(j));
                                break;
                            }
                            break;
                        case 717572172:
                            if (string.equals("custom_event")) {
                                arrayList.add(new b0(j));
                                break;
                            }
                            break;
                        case 1512893214:
                            if (string.equals("iam_click")) {
                                arrayList.add(new s2(j));
                                break;
                            }
                            break;
                        case 1743324417:
                            if (string.equals(FirebaseAnalytics.Event.PURCHASE)) {
                                arrayList.add(new s3(j));
                                break;
                            }
                            break;
                        case 1926863907:
                            if (string.equals("push_click")) {
                                arrayList.add(new w3(j));
                                break;
                            }
                            break;
                    }
                }
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, b, BrazeLogger.Priority.W, (Throwable) null, (com.amazon.aps.iva.xb0.a) new e(string), 4, (Object) null);
            }
        }
        return arrayList;
    }
}
