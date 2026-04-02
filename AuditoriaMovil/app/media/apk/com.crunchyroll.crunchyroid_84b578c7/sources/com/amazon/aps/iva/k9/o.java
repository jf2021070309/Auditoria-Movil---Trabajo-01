package com.amazon.aps.iva.k9;

import androidx.work.ListenableWorker;
import androidx.work.OverwritingInputMerger;
import com.amazon.aps.iva.k9.v;
/* compiled from: OneTimeWorkRequest.java */
/* loaded from: classes.dex */
public final class o extends v {
    public o(a aVar) {
        super(aVar.a, aVar.b, aVar.c);
    }

    /* compiled from: OneTimeWorkRequest.java */
    /* loaded from: classes.dex */
    public static final class a extends v.a<a, o> {
        public a(Class<? extends ListenableWorker> cls) {
            super(cls);
            this.b.d = OverwritingInputMerger.class.getName();
        }

        @Override // com.amazon.aps.iva.k9.v.a
        public final o b() {
            return new o(this);
        }

        @Override // com.amazon.aps.iva.k9.v.a
        public final a c() {
            return this;
        }
    }
}
