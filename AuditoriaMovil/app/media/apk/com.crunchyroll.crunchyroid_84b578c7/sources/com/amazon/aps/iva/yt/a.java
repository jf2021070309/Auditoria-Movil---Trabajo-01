package com.amazon.aps.iva.yt;

import com.amazon.aps.iva.yb0.j;
import com.crunchyroll.crunchyroid.R;
import java.io.Serializable;
/* compiled from: BaseCommentsInputUiModel.kt */
/* loaded from: classes2.dex */
public abstract class a implements Serializable {
    public final int b;
    public final int c;
    public final com.amazon.aps.iva.su.a d;

    /* compiled from: BaseCommentsInputUiModel.kt */
    /* renamed from: com.amazon.aps.iva.yt.a$a  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static final class C0898a extends a {
        public final com.amazon.aps.iva.su.a e;

        public C0898a() {
            this(0);
        }

        @Override // com.amazon.aps.iva.yt.a
        public final com.amazon.aps.iva.su.a a() {
            return this.e;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if ((obj instanceof C0898a) && j.a(this.e, ((C0898a) obj).e)) {
                return true;
            }
            return false;
        }

        public final int hashCode() {
            com.amazon.aps.iva.su.a aVar = this.e;
            if (aVar == null) {
                return 0;
            }
            return aVar.hashCode();
        }

        public final String toString() {
            return "CommentsInputUiModel(username=" + this.e + ")";
        }

        public C0898a(int i) {
            super(R.string.commenting_input_hint_anonymous, R.string.commenting_input_hint_logged_in, null);
            this.e = null;
        }
    }

    /* compiled from: BaseCommentsInputUiModel.kt */
    /* loaded from: classes2.dex */
    public static final class b extends a {
        public final com.amazon.aps.iva.su.a e;

        public b() {
            this(null);
        }

        @Override // com.amazon.aps.iva.yt.a
        public final com.amazon.aps.iva.su.a a() {
            return this.e;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if ((obj instanceof b) && j.a(this.e, ((b) obj).e)) {
                return true;
            }
            return false;
        }

        public final int hashCode() {
            com.amazon.aps.iva.su.a aVar = this.e;
            if (aVar == null) {
                return 0;
            }
            return aVar.hashCode();
        }

        public final String toString() {
            return "ReplyInputUiModel(username=" + this.e + ")";
        }

        public b(com.amazon.aps.iva.su.a aVar) {
            super(R.string.commenting_input_reply_hint_anonymous, R.string.commenting_input_reply_hint_logged_in, aVar);
            this.e = aVar;
        }
    }

    public a(int i, int i2, com.amazon.aps.iva.su.a aVar) {
        this.b = i;
        this.c = i2;
        this.d = aVar;
    }

    public com.amazon.aps.iva.su.a a() {
        return this.d;
    }
}
