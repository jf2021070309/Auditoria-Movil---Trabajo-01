package com.amazon.aps.iva.oa0;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import java.util.Objects;
/* compiled from: SLRemoteConfiguration.java */
/* loaded from: classes4.dex */
public final class h0 {
    public static final /* synthetic */ int b = 0;
    @SerializedName("admon_batching")
    private a a = new a();

    /* compiled from: SLRemoteConfiguration.java */
    /* loaded from: classes4.dex */
    public static class a {
        @SerializedName("AggregateAdmonEvents")
        private boolean a = false;
        @SerializedName("debug")
        private boolean b = false;

        public final boolean a() {
            return this.a;
        }

        public final boolean b() {
            return this.b;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || a.class != obj.getClass()) {
                return false;
            }
            a aVar = (a) obj;
            if (this.a == aVar.a && this.b == aVar.b) {
                return true;
            }
            return false;
        }

        public final int hashCode() {
            return Objects.hash(Boolean.valueOf(this.a), Boolean.valueOf(this.b));
        }
    }

    static {
        new com.amazon.aps.iva.b30.j(h0.class.getSimpleName());
    }

    public static h0 a(com.amazon.aps.iva.if0.c cVar) {
        try {
            return (h0) new Gson().fromJson(cVar.toString(), (Class<Object>) h0.class);
        } catch (Throwable th) {
            f1.b(th);
            return new h0();
        }
    }

    public final boolean b() {
        return this.a.b();
    }

    public final boolean c() {
        return this.a.a();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || h0.class != obj.getClass()) {
            return false;
        }
        return this.a.equals(((h0) obj).a);
    }

    public final int hashCode() {
        return Objects.hash(this.a);
    }
}
