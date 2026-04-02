package com.amazon.aps.iva.r10;

import com.crunchyroll.crunchyroid.R;
/* compiled from: HistoryPresenter.kt */
/* loaded from: classes2.dex */
public final class i0 {
    public static final com.amazon.aps.iva.j60.d a = new com.amazon.aps.iva.j60.d(R.string.history_empty_title, R.string.history_empty_subtitle);

    /* compiled from: HistoryPresenter.kt */
    /* loaded from: classes2.dex */
    public static final class a implements com.amazon.aps.iva.i5.w, com.amazon.aps.iva.yb0.f {
        public final /* synthetic */ com.amazon.aps.iva.xb0.l a;

        public a(com.amazon.aps.iva.xb0.l lVar) {
            this.a = lVar;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof com.amazon.aps.iva.i5.w) || !(obj instanceof com.amazon.aps.iva.yb0.f)) {
                return false;
            }
            return com.amazon.aps.iva.yb0.j.a(this.a, ((com.amazon.aps.iva.yb0.f) obj).getFunctionDelegate());
        }

        @Override // com.amazon.aps.iva.yb0.f
        public final com.amazon.aps.iva.kb0.a<?> getFunctionDelegate() {
            return this.a;
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        @Override // com.amazon.aps.iva.i5.w
        public final /* synthetic */ void onChanged(Object obj) {
            this.a.invoke(obj);
        }
    }

    static {
        new com.amazon.aps.iva.j60.c(R.string.empty_cta_primary_text, R.string.empty_cta_primary_text);
    }
}
