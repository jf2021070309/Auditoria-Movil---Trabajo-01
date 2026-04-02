package com.braze.models;

import com.amazon.aps.iva.if0.b;
import com.amazon.aps.iva.yb0.e;
import com.amazon.aps.iva.yb0.j;
import com.amazon.aps.iva.yb0.l;
import com.braze.support.BrazeLogger;
import com.braze.support.JsonUtils;
import kotlin.Metadata;
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0007\u0018\u0000 \u00192\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001:\u0001\u001aB-\b\u0000\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u0011\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\u0017\u0010\u0018J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\u000f\u0010\u0006\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u0017\u0010\r\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0011\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u001c\u0010\u0015\u001a\u0004\u0018\u00010\u00078\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0015\u0010\t\u001a\u0004\b\u0016\u0010\u000b¨\u0006\u001b"}, d2 = {"Lcom/braze/models/FeatureFlag;", "Lcom/braze/models/IPutIntoJson;", "Lcom/amazon/aps/iva/if0/c;", "forJsonPut", "deepcopy$android_sdk_base_release", "()Lcom/braze/models/FeatureFlag;", "deepcopy", "", "id", "Ljava/lang/String;", "getId", "()Ljava/lang/String;", "", "enabled", "Z", "getEnabled", "()Z", "properties", "Lcom/amazon/aps/iva/if0/c;", "getProperties", "()Lcom/amazon/aps/iva/if0/c;", "trackingString", "getTrackingString$android_sdk_base_release", "<init>", "(Ljava/lang/String;ZLcom/amazon/aps/iva/if0/c;Ljava/lang/String;)V", "Companion", "a", "android-sdk-base_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class FeatureFlag implements IPutIntoJson<com.amazon.aps.iva.if0.c> {
    public static final a Companion = new a(null);
    private final boolean enabled;
    private final String id;
    private final com.amazon.aps.iva.if0.c properties;
    private final String trackingString;

    /* loaded from: classes.dex */
    public static final class a {
        public /* synthetic */ a(e eVar) {
            this();
        }

        private a() {
        }
    }

    /* loaded from: classes.dex */
    public static final class c extends l implements com.amazon.aps.iva.xb0.a {
        public static final c b = new c();

        public c() {
            super(0);
        }

        @Override // com.amazon.aps.iva.xb0.a
        /* renamed from: a */
        public final String invoke() {
            return "Caught exception creating FeatureFlag Json.";
        }
    }

    public FeatureFlag(String str, boolean z, com.amazon.aps.iva.if0.c cVar, String str2) {
        j.f(str, "id");
        j.f(cVar, "properties");
        this.id = str;
        this.enabled = z;
        this.properties = cVar;
        this.trackingString = str2;
    }

    public final FeatureFlag deepcopy$android_sdk_base_release() {
        return new FeatureFlag(this.id, this.enabled, JsonUtils.deepcopy(this.properties), this.trackingString);
    }

    public final String getId() {
        return this.id;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.braze.models.IPutIntoJson
    public com.amazon.aps.iva.if0.c forJsonPut() {
        com.amazon.aps.iva.if0.c cVar = new com.amazon.aps.iva.if0.c();
        try {
            cVar.put("id", this.id);
            cVar.put("enabled", this.enabled);
            cVar.put("properties", this.properties);
            cVar.put("fts", this.trackingString);
        } catch (b e) {
            BrazeLogger.INSTANCE.brazelog(this, BrazeLogger.Priority.E, e, c.b);
        }
        return cVar;
    }
}
