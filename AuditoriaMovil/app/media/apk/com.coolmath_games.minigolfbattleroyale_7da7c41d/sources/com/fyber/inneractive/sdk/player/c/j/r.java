package com.fyber.inneractive.sdk.player.c.j;

import android.text.TextUtils;
import com.fyber.inneractive.sdk.player.c.j.g;
import java.io.IOException;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/* loaded from: classes.dex */
public interface r extends g {
    public static final com.fyber.inneractive.sdk.player.c.k.m<String> a = new com.fyber.inneractive.sdk.player.c.k.m<String>() { // from class: com.fyber.inneractive.sdk.player.c.j.r.1
        @Override // com.fyber.inneractive.sdk.player.c.k.m
        public final /* synthetic */ boolean a(String str) {
            String d2 = com.fyber.inneractive.sdk.player.c.k.t.d(str);
            if (TextUtils.isEmpty(d2)) {
                return false;
            }
            return ((d2.contains("text") && !d2.contains("text/vtt")) || d2.contains("html") || d2.contains("xml")) ? false : true;
        }
    };

    /* loaded from: classes.dex */
    public interface b extends g.a {
    }

    /* loaded from: classes.dex */
    public static final class f {
        private final Map<String, String> a = new HashMap();
        private Map<String, String> b;

        public final synchronized Map<String, String> a() {
            if (this.b == null) {
                this.b = Collections.unmodifiableMap(new HashMap(this.a));
            }
            return this.b;
        }
    }

    /* loaded from: classes.dex */
    public static class c extends IOException {
        public final int a;
        public final i b;

        public c(String str, i iVar) {
            super(str);
            this.b = iVar;
            this.a = 1;
        }

        public c(IOException iOException, i iVar, int i) {
            super(iOException);
            this.b = iVar;
            this.a = i;
        }

        public c(String str, IOException iOException, i iVar) {
            super(str, iOException);
            this.b = iVar;
            this.a = 1;
        }
    }

    /* loaded from: classes.dex */
    public static final class d extends c {
        public final String c;

        public d(String str, i iVar) {
            super("Invalid content type: " + str, iVar);
            this.c = str;
        }
    }

    /* loaded from: classes.dex */
    public static final class e extends c {
        public final int c;
        public final Map<String, List<String>> d;

        public e(int i, Map<String, List<String>> map, i iVar) {
            super("Response code: " + i, iVar);
            this.c = i;
            this.d = map;
        }
    }

    /* loaded from: classes.dex */
    public static abstract class a implements b {
        private final f a = new f();

        protected abstract r a(f fVar);

        @Override // com.fyber.inneractive.sdk.player.c.j.g.a
        public final /* bridge */ /* synthetic */ g a() {
            return a(this.a);
        }
    }
}
