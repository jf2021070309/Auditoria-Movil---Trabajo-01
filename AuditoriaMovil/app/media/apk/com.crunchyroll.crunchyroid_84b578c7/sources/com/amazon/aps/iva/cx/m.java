package com.amazon.aps.iva.cx;

import com.ellation.crunchyroll.application.a;
import com.google.gson.annotations.SerializedName;
/* compiled from: PersistentMessageCenterConfigImpl.kt */
/* loaded from: classes2.dex */
public final class m implements com.amazon.aps.iva.jf.a {
    public static final a b = new a();
    @SerializedName("is_enabled")
    private final boolean a;

    /* compiled from: PersistentMessageCenterConfigImpl.kt */
    /* loaded from: classes2.dex */
    public static final class a {
        public static m a() {
            com.ellation.crunchyroll.application.a aVar = a.C0959a.a;
            if (aVar != null) {
                Object c = aVar.c().c(m.class, "persistent_message_center");
                if (c != null) {
                    return (m) c;
                }
                throw new NullPointerException("null cannot be cast to non-null type com.ellation.crunchyroll.features.configs.PersistentMessageCenterConfigImpl");
            }
            com.amazon.aps.iva.yb0.j.m("instance");
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof m) && this.a == ((m) obj).a) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        boolean z = this.a;
        if (z) {
            return 1;
        }
        return z ? 1 : 0;
    }

    @Override // com.amazon.aps.iva.jf.a
    public final boolean isEnabled() {
        return this.a;
    }

    public final String toString() {
        boolean z = this.a;
        return "PersistentMessageCenterConfigImpl(isEnabled=" + z + ")";
    }
}
