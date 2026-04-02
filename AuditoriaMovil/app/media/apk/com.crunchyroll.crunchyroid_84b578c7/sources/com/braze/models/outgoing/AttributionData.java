package com.braze.models.outgoing;

import com.amazon.aps.iva.if0.c;
import com.amazon.aps.iva.oe0.m;
import com.amazon.aps.iva.yb0.e;
import com.amazon.aps.iva.yb0.j;
import com.amazon.aps.iva.yb0.l;
import com.braze.models.IPutIntoJson;
import com.braze.support.BrazeLogger;
import com.google.firebase.analytics.FirebaseAnalytics;
import kotlin.Metadata;
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\b\u0007\u0018\u0000 \f2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\rB'\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0004\u0012\u0006\u0010\t\u001a\u00020\u0004¢\u0006\u0004\b\n\u0010\u000bJ\b\u0010\u0003\u001a\u00020\u0002H\u0016R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0006¨\u0006\u000e"}, d2 = {"Lcom/braze/models/outgoing/AttributionData;", "Lcom/braze/models/IPutIntoJson;", "Lcom/amazon/aps/iva/if0/c;", "forJsonPut", "", "network", "Ljava/lang/String;", FirebaseAnalytics.Param.CAMPAIGN, "adGroup", "creative", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "Companion", "a", "android-sdk-base_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class AttributionData implements IPutIntoJson<c> {
    public static final a Companion = new a(null);
    private final String adGroup;
    private final String campaign;
    private final String creative;
    private final String network;

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
        public static final b b = new b();

        public b() {
            super(0);
        }

        @Override // com.amazon.aps.iva.xb0.a
        /* renamed from: a */
        public final String invoke() {
            return "Caught exception creating AttributionData Json.";
        }
    }

    public AttributionData(String str, String str2, String str3, String str4) {
        j.f(str, "network");
        j.f(str2, FirebaseAnalytics.Param.CAMPAIGN);
        j.f(str3, "adGroup");
        j.f(str4, "creative");
        this.network = str;
        this.campaign = str2;
        this.adGroup = str3;
        this.creative = str4;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.braze.models.IPutIntoJson
    public c forJsonPut() {
        c cVar = new c();
        try {
            if (!m.b0(this.network)) {
                cVar.put(FirebaseAnalytics.Param.SOURCE, this.network);
            }
            if (!m.b0(this.campaign)) {
                cVar.put(FirebaseAnalytics.Param.CAMPAIGN, this.campaign);
            }
            if (!m.b0(this.adGroup)) {
                cVar.put("adgroup", this.adGroup);
            }
            if (!m.b0(this.creative)) {
                cVar.put("ad", this.creative);
            }
        } catch (com.amazon.aps.iva.if0.b e) {
            BrazeLogger.INSTANCE.brazelog(this, BrazeLogger.Priority.E, e, b.b);
        }
        return cVar;
    }
}
