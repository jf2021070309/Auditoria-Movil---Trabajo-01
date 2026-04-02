package bo.app;

import android.content.Context;
import com.braze.enums.inappmessage.MessageType;
import com.braze.models.inappmessage.IInAppMessage;
import com.braze.support.BrazeLogger;
import com.braze.support.JsonUtils;
import java.util.ArrayList;
import java.util.List;
/* loaded from: classes.dex */
public final class w2 extends i6 {
    public static final c l = new c(null);
    private final IInAppMessage i;
    private final com.amazon.aps.iva.if0.c j;
    private final r1 k;

    /* loaded from: classes.dex */
    public static final class a extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a {
        final /* synthetic */ com.amazon.aps.iva.if0.c b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(com.amazon.aps.iva.if0.c cVar) {
            super(0);
            this.b = cVar;
        }

        @Override // com.amazon.aps.iva.xb0.a
        /* renamed from: a */
        public final String invoke() {
            return "Attempting to parse in-app message triggered action with JSON: " + JsonUtils.getPrettyPrintedString(this.b);
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
            return "Failed to parse in-app message triggered action.";
        }
    }

    /* loaded from: classes.dex */
    public static final class c {
        public /* synthetic */ c(com.amazon.aps.iva.yb0.e eVar) {
            this();
        }

        private c() {
        }
    }

    /* loaded from: classes.dex */
    public /* synthetic */ class d {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[MessageType.values().length];
            try {
                iArr[MessageType.HTML_FULL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[MessageType.FULL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[MessageType.MODAL.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[MessageType.SLIDEUP.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[MessageType.HTML.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            a = iArr;
        }
    }

    /* loaded from: classes.dex */
    public static final class e extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a {
        public e() {
            super(0);
        }

        @Override // com.amazon.aps.iva.xb0.a
        /* renamed from: a */
        public final String invoke() {
            return "Attempting to publish in-app message after delay of " + w2.this.n().o() + " seconds.";
        }
    }

    /* loaded from: classes.dex */
    public static final class f extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a {
        final /* synthetic */ l2 b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(l2 l2Var) {
            super(0);
            this.b = l2Var;
        }

        @Override // com.amazon.aps.iva.xb0.a
        /* renamed from: a */
        public final String invoke() {
            return "Cannot perform triggered action for " + this.b + " due to in-app message json being null";
        }
    }

    /* loaded from: classes.dex */
    public static final class g extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a {
        final /* synthetic */ l2 b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(l2 l2Var) {
            super(0);
            this.b = l2Var;
        }

        @Override // com.amazon.aps.iva.xb0.a
        /* renamed from: a */
        public final String invoke() {
            return "Cannot perform triggered action for " + this.b + " due to deserialized in-app message being null";
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
            return "Caught exception while performing triggered action.";
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
            return "In-app message has no remote assets for prefetch. Returning empty list.";
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
            MessageType messageType;
            StringBuilder sb = new StringBuilder("Failed to return remote paths to assets for type: ");
            IInAppMessage iInAppMessage = w2.this.i;
            if (iInAppMessage != null) {
                messageType = iInAppMessage.getMessageType();
            } else {
                messageType = null;
            }
            sb.append(messageType);
            return sb.toString();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w2(com.amazon.aps.iva.if0.c cVar, r1 r1Var) {
        super(cVar);
        com.amazon.aps.iva.yb0.j.f(cVar, "json");
        com.amazon.aps.iva.yb0.j.f(r1Var, "brazeManager");
        BrazeLogger brazeLogger = BrazeLogger.INSTANCE;
        BrazeLogger.brazelog$default(brazeLogger, this, BrazeLogger.Priority.V, (Throwable) null, new a(cVar), 2, (Object) null);
        com.amazon.aps.iva.if0.c jSONObject = cVar.getJSONObject("data");
        this.k = r1Var;
        this.j = jSONObject;
        com.amazon.aps.iva.yb0.j.e(jSONObject, "inAppMessageObject");
        IInAppMessage a2 = com.braze.support.h.a(jSONObject, r1Var);
        this.i = a2;
        if (a2 != null) {
            return;
        }
        BrazeLogger.brazelog$default(brazeLogger, this, BrazeLogger.Priority.W, (Throwable) null, b.b, 2, (Object) null);
        throw new IllegalArgumentException("Failed to parse in-app message triggered action with JSON: " + JsonUtils.getPrettyPrintedString(cVar));
    }

    @Override // bo.app.q2
    public List l() {
        List<String> list;
        boolean z;
        int i2;
        ArrayList arrayList = new ArrayList();
        IInAppMessage iInAppMessage = this.i;
        MessageType messageType = null;
        if (iInAppMessage != null) {
            list = iInAppMessage.getRemoteAssetPathsForPrefetch();
        } else {
            list = null;
        }
        if (list != null && !list.isEmpty()) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, (BrazeLogger.Priority) null, (Throwable) null, i.b, 3, (Object) null);
            return arrayList;
        }
        IInAppMessage iInAppMessage2 = this.i;
        if (iInAppMessage2 != null) {
            messageType = iInAppMessage2.getMessageType();
        }
        if (messageType == null) {
            i2 = -1;
        } else {
            i2 = d.a[messageType.ordinal()];
        }
        if (i2 != 1) {
            if (i2 != 2 && i2 != 3 && i2 != 4) {
                if (i2 != 5) {
                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, BrazeLogger.Priority.W, (Throwable) null, new j(), 2, (Object) null);
                } else {
                    for (String str : list) {
                        arrayList.add(new h4(i4.FILE, str));
                    }
                }
            } else {
                arrayList.add(new h4(i4.IMAGE, list.get(0)));
            }
        } else {
            arrayList.add(new h4(i4.ZIP, list.get(0)));
        }
        return arrayList;
    }

    @Override // com.braze.models.IPutIntoJson
    /* renamed from: u */
    public com.amazon.aps.iva.if0.c forJsonPut() {
        com.amazon.aps.iva.if0.c cVar;
        try {
            com.amazon.aps.iva.if0.c u = super.u();
            if (u == null) {
                return null;
            }
            IInAppMessage iInAppMessage = this.i;
            if (iInAppMessage != null) {
                cVar = iInAppMessage.forJsonPut();
            } else {
                cVar = null;
            }
            u.put("data", cVar);
            u.put("type", "inapp");
            return u;
        } catch (com.amazon.aps.iva.if0.b unused) {
            return null;
        }
    }

    @Override // bo.app.q2
    public void a(Context context, z1 z1Var, l2 l2Var, long j2) {
        com.amazon.aps.iva.yb0.j.f(context, "context");
        com.amazon.aps.iva.yb0.j.f(z1Var, "internalEventPublisher");
        com.amazon.aps.iva.yb0.j.f(l2Var, "triggerEvent");
        try {
            BrazeLogger brazeLogger = BrazeLogger.INSTANCE;
            BrazeLogger.brazelog$default(brazeLogger, this, (BrazeLogger.Priority) null, (Throwable) null, new e(), 3, (Object) null);
            com.amazon.aps.iva.if0.c cVar = this.j;
            if (cVar == null) {
                BrazeLogger.brazelog$default(brazeLogger, this, BrazeLogger.Priority.W, (Throwable) null, new f(l2Var), 2, (Object) null);
                return;
            }
            IInAppMessage a2 = com.braze.support.h.a(cVar, this.k);
            if (a2 == null) {
                BrazeLogger.brazelog$default(brazeLogger, this, BrazeLogger.Priority.W, (Throwable) null, new g(l2Var), 2, (Object) null);
                return;
            }
            a2.setLocalPrefetchedAssetPaths(y());
            a2.setExpirationTimestamp(j2);
            z1Var.a(new u2(l2Var, this, a2, this.k.a()), u2.class);
        } catch (Exception e2) {
            BrazeLogger.INSTANCE.brazelog(this, BrazeLogger.Priority.W, e2, h.b);
        }
    }
}
