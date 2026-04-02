package com.amazon.aps.iva.gv;

import com.amazon.aps.iva.yb0.j;
import java.io.Serializable;
/* compiled from: ModifyCrunchylistAction.kt */
/* loaded from: classes2.dex */
public abstract class i implements Serializable {

    /* compiled from: ModifyCrunchylistAction.kt */
    /* loaded from: classes2.dex */
    public static final class a extends i {
        public final com.amazon.aps.iva.bv.d b;

        public a(com.amazon.aps.iva.bv.d dVar) {
            this.b = dVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if ((obj instanceof a) && j.a(this.b, ((a) obj).b)) {
                return true;
            }
            return false;
        }

        public final int hashCode() {
            return this.b.hashCode();
        }

        public final String toString() {
            return "AddToCrunchylist(input=" + this.b + ")";
        }
    }

    /* compiled from: ModifyCrunchylistAction.kt */
    /* loaded from: classes2.dex */
    public static final class b extends i {
        public static final b b = new b();
    }

    /* compiled from: ModifyCrunchylistAction.kt */
    /* loaded from: classes2.dex */
    public static final class c extends i {
        public final com.amazon.aps.iva.nv.e b;

        public c(com.amazon.aps.iva.nv.e eVar) {
            j.f(eVar, "crunchylistItemUiModel");
            this.b = eVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if ((obj instanceof c) && j.a(this.b, ((c) obj).b)) {
                return true;
            }
            return false;
        }

        public final int hashCode() {
            return this.b.hashCode();
        }

        public final String toString() {
            return "RenameCrunchylist(crunchylistItemUiModel=" + this.b + ")";
        }
    }
}
