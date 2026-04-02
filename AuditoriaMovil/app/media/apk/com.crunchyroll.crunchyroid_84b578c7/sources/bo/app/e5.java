package bo.app;

import com.braze.models.IPutIntoJson;
import java.util.UUID;
/* loaded from: classes.dex */
public final class e5 implements IPutIntoJson {
    public static final a d = new a(null);
    private final UUID b;
    private final String c;

    /* loaded from: classes.dex */
    public static final class a {
        public /* synthetic */ a(com.amazon.aps.iva.yb0.e eVar) {
            this();
        }

        public final e5 a() {
            UUID randomUUID = UUID.randomUUID();
            com.amazon.aps.iva.yb0.j.e(randomUUID, "randomUUID()");
            return new e5(randomUUID);
        }

        private a() {
        }

        public final e5 a(String str) {
            com.amazon.aps.iva.yb0.j.f(str, "sessionId");
            UUID fromString = UUID.fromString(str);
            com.amazon.aps.iva.yb0.j.e(fromString, "fromString(sessionId)");
            return new e5(fromString);
        }
    }

    public e5(UUID uuid) {
        com.amazon.aps.iva.yb0.j.f(uuid, "sessionIdUuid");
        this.b = uuid;
        String uuid2 = uuid.toString();
        com.amazon.aps.iva.yb0.j.e(uuid2, "sessionIdUuid.toString()");
        this.c = uuid2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof e5) && com.amazon.aps.iva.yb0.j.a(this.b, ((e5) obj).b)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return this.b.hashCode();
    }

    public String toString() {
        return this.c;
    }

    @Override // com.braze.models.IPutIntoJson
    /* renamed from: u */
    public String forJsonPut() {
        return this.c;
    }
}
