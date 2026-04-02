package com.braze.models.outgoing;

import bo.app.q;
import com.amazon.aps.iva.o0.t1;
import com.amazon.aps.iva.oe0.m;
import com.amazon.aps.iva.yb0.e;
import com.amazon.aps.iva.yb0.j;
import com.amazon.aps.iva.yb0.l;
import com.braze.enums.BrazeDateFormat;
import com.braze.models.IPutIntoJson;
import com.braze.support.BrazeLogger;
import com.braze.support.DateTimeUtils;
import com.braze.support.StringUtils;
import com.braze.support.ValidationUtils;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.Map;
import kotlin.Metadata;
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\t\b\u0007\u0018\u0000 \u001d2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001eB\t\b\u0016¢\u0006\u0004\b\u001a\u0010\u001bB\u0011\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u001a\u0010\u001cJ\u001a\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004H\u0002J\u0018\u0010\u000b\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\u00072\b\u0010\n\u001a\u0004\u0018\u00010\tJ\b\u0010\f\u001a\u0004\u0018\u00010\u0000J\b\u0010\r\u001a\u00020\u0002H\u0016R\u0016\u0010\u000e\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0013\u001a\u00020\u00108F¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0014\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\u0019\u001a\u00020\u00168G¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u001f"}, d2 = {"Lcom/braze/models/outgoing/BrazeProperties;", "Lcom/braze/models/IPutIntoJson;", "Lcom/amazon/aps/iva/if0/c;", "jsonObject", "", "doKeyValidation", "clean", "", "key", "", "value", "addProperty", "clone", "forJsonPut", "propertiesJSONObject", "Lcom/amazon/aps/iva/if0/c;", "", "getSize", "()I", "size", "isInvalid", "()Z", "", "getByteSize", "()J", "byteSize", "<init>", "()V", "(Lcom/amazon/aps/iva/if0/c;)V", "Companion", "a", "android-sdk-base_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class BrazeProperties implements IPutIntoJson<com.amazon.aps.iva.if0.c> {
    public static final a Companion = new a(null);
    private com.amazon.aps.iva.if0.c propertiesJSONObject;

    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: com.braze.models.outgoing.BrazeProperties$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static final class C0939a extends l implements com.amazon.aps.iva.xb0.a {
            public static final C0939a b = new C0939a();

            public C0939a() {
                super(0);
            }

            @Override // com.amazon.aps.iva.xb0.a
            /* renamed from: a */
            public final String invoke() {
                return "The BrazeProperties key cannot be null or contain only whitespaces. Not adding property.";
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
                return "The leading character in the key string may not be '$'. Not adding property.";
            }
        }

        public /* synthetic */ a(e eVar) {
            this();
        }

        public final boolean a(String str) {
            j.f(str, "key");
            if (m.b0(str)) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, BrazeLogger.Priority.W, (Throwable) null, C0939a.b, 2, (Object) null);
                return false;
            } else if (m.h0(str, "$", false)) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, BrazeLogger.Priority.W, (Throwable) null, b.b, 2, (Object) null);
                return false;
            } else {
                return true;
            }
        }

        private a() {
        }
    }

    /* loaded from: classes.dex */
    public static final class b extends l implements com.amazon.aps.iva.xb0.a {
        final /* synthetic */ String b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(String str) {
            super(0);
            this.b = str;
        }

        @Override // com.amazon.aps.iva.xb0.a
        /* renamed from: a */
        public final String invoke() {
            return t1.b(new StringBuilder("Value type is not supported. Cannot add property "), this.b, '.');
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
            return "Caught json exception trying to add property.";
        }
    }

    /* loaded from: classes.dex */
    public static final class d extends l implements com.amazon.aps.iva.xb0.a {
        public static final d b = new d();

        public d() {
            super(0);
        }

        @Override // com.amazon.aps.iva.xb0.a
        /* renamed from: a */
        public final String invoke() {
            return "Failed to clone BrazeProperties";
        }
    }

    public BrazeProperties() {
        this.propertiesJSONObject = new com.amazon.aps.iva.if0.c();
    }

    private final com.amazon.aps.iva.if0.c clean(com.amazon.aps.iva.if0.c cVar, boolean z) {
        ArrayList arrayList = new ArrayList();
        Iterator<String> keys = cVar.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            j.e(next, "jsonObjectIterator.next()");
            arrayList.add(next);
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            if (z && !Companion.a(str)) {
                cVar.remove(str);
            } else {
                Object obj = cVar.get(str);
                if (obj instanceof Date) {
                    cVar.put(str, DateTimeUtils.formatDate$default((Date) obj, BrazeDateFormat.LONG, null, 2, null));
                }
                if (obj instanceof com.amazon.aps.iva.if0.a) {
                    cVar.put(str, q.a((com.amazon.aps.iva.if0.a) obj));
                }
                if (obj instanceof com.amazon.aps.iva.if0.c) {
                    cVar.put(str, clean((com.amazon.aps.iva.if0.c) obj, false));
                }
            }
        }
        return cVar;
    }

    public static /* synthetic */ com.amazon.aps.iva.if0.c clean$default(BrazeProperties brazeProperties, com.amazon.aps.iva.if0.c cVar, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = true;
        }
        return brazeProperties.clean(cVar, z);
    }

    public final BrazeProperties addProperty(String str, Object obj) {
        j.f(str, "key");
        if (!Companion.a(str)) {
            return this;
        }
        try {
            if (obj instanceof Long) {
                this.propertiesJSONObject.put(ValidationUtils.ensureBrazeFieldLength(str), ((Number) obj).longValue());
            } else if (obj instanceof Integer) {
                this.propertiesJSONObject.put(ValidationUtils.ensureBrazeFieldLength(str), ((Number) obj).intValue());
            } else if (obj instanceof Double) {
                this.propertiesJSONObject.put(ValidationUtils.ensureBrazeFieldLength(str), ((Number) obj).doubleValue());
            } else if (obj instanceof Boolean) {
                this.propertiesJSONObject.put(ValidationUtils.ensureBrazeFieldLength(str), ((Boolean) obj).booleanValue());
            } else if (obj instanceof Date) {
                this.propertiesJSONObject.put(ValidationUtils.ensureBrazeFieldLength(str), DateTimeUtils.formatDate$default((Date) obj, BrazeDateFormat.LONG, null, 2, null));
            } else if (obj instanceof String) {
                this.propertiesJSONObject.put(ValidationUtils.ensureBrazeFieldLength(str), ValidationUtils.ensureBrazeFieldLength((String) obj));
            } else if (obj instanceof com.amazon.aps.iva.if0.a) {
                this.propertiesJSONObject.put(ValidationUtils.ensureBrazeFieldLength(str), q.a((com.amazon.aps.iva.if0.a) obj));
            } else if (obj instanceof com.amazon.aps.iva.if0.c) {
                this.propertiesJSONObject.put(ValidationUtils.ensureBrazeFieldLength(str), clean$default(this, (com.amazon.aps.iva.if0.c) obj, false, 2, null));
            } else if (obj instanceof Map) {
                this.propertiesJSONObject.put(ValidationUtils.ensureBrazeFieldLength(str), clean$default(this, new com.amazon.aps.iva.if0.c((Map<?, ?>) q.a((Map) obj)), false, 2, null));
            } else if (obj == null) {
                this.propertiesJSONObject.put(ValidationUtils.ensureBrazeFieldLength(str), com.amazon.aps.iva.if0.c.NULL);
            } else {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, BrazeLogger.Priority.W, (Throwable) null, new b(str), 2, (Object) null);
            }
        } catch (com.amazon.aps.iva.if0.b e) {
            BrazeLogger.INSTANCE.brazelog(this, BrazeLogger.Priority.E, e, c.b);
        }
        return this;
    }

    public final BrazeProperties clone() {
        try {
            return new BrazeProperties(new com.amazon.aps.iva.if0.c(forJsonPut().toString()));
        } catch (Exception e) {
            BrazeLogger.INSTANCE.brazelog(this, BrazeLogger.Priority.W, e, d.b);
            return null;
        }
    }

    public final long getByteSize() {
        String cVar = this.propertiesJSONObject.toString();
        j.e(cVar, "propertiesJSONObject.toString()");
        return StringUtils.getByteSize(cVar);
    }

    public final int getSize() {
        return this.propertiesJSONObject.length();
    }

    public final boolean isInvalid() {
        if (getByteSize() > 51200) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.braze.models.IPutIntoJson
    public com.amazon.aps.iva.if0.c forJsonPut() {
        return this.propertiesJSONObject;
    }

    public BrazeProperties(com.amazon.aps.iva.if0.c cVar) {
        j.f(cVar, "jsonObject");
        this.propertiesJSONObject = new com.amazon.aps.iva.if0.c();
        this.propertiesJSONObject = clean$default(this, cVar, false, 2, null);
    }
}
