package com.vungle.publisher;

import android.database.Cursor;
import com.vungle.publisher.da;
import com.vungle.publisher.jj;
/* loaded from: classes4.dex */
public abstract class jl<P extends jj<?, P, ?>> extends da<P> {

    /* loaded from: classes4.dex */
    public enum a implements jf {
        back,
        close,
        custom,
        download,
        cta,
        muted,
        unmuted,
        videoerror,
        videoreset,
        volume,
        volumedown,
        volumeup;
        
        private final String m;

        a() {
            this(null);
        }

        a(String str) {
            this.m = str;
        }

        @Override // java.lang.Enum
        public String toString() {
            return this.m == null ? name() : this.m;
        }

        @Override // com.vungle.publisher.jf
        public boolean a() {
            return false;
        }
    }

    /* loaded from: classes4.dex */
    protected static abstract class b<E extends jl<P>, P extends jj<?, P, E>> extends da.a<P, E> {
        @Override // com.vungle.publisher.da.a
        protected jf a(Cursor cursor) {
            return (jf) ce.a(cursor, "event", a.class);
        }
    }
}
