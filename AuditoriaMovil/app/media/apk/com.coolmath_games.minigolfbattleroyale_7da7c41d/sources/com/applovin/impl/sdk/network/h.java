package com.applovin.impl.sdk.network;

import com.applovin.impl.sdk.k;
import com.applovin.impl.sdk.network.c;
import java.util.Map;
import org.json.JSONObject;
/* loaded from: classes.dex */
public class h<T> extends c {
    private String a;
    private boolean b;

    /* loaded from: classes.dex */
    public static class a<T> extends c.a<T> {
        private String p;
        private boolean q;

        public a(k kVar) {
            super(kVar);
            this.h = ((Integer) kVar.a(com.applovin.impl.sdk.c.b.cM)).intValue();
            this.i = ((Integer) kVar.a(com.applovin.impl.sdk.c.b.cL)).intValue();
            this.j = ((Integer) kVar.a(com.applovin.impl.sdk.c.b.cQ)).intValue();
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.applovin.impl.sdk.network.c.a
        public /* synthetic */ c.a a(Object obj) {
            return b((a<T>) obj);
        }

        public a b(T t) {
            this.g = t;
            return this;
        }

        @Override // com.applovin.impl.sdk.network.c.a
        /* renamed from: b */
        public a a(JSONObject jSONObject) {
            this.f = jSONObject;
            return this;
        }

        @Override // com.applovin.impl.sdk.network.c.a
        /* renamed from: b */
        public h<T> a() {
            return new h<>(this);
        }

        @Override // com.applovin.impl.sdk.network.c.a
        /* renamed from: c */
        public a a(Map<String, String> map) {
            this.d = map;
            return this;
        }

        @Override // com.applovin.impl.sdk.network.c.a
        /* renamed from: d */
        public a a(int i) {
            this.h = i;
            return this;
        }

        @Override // com.applovin.impl.sdk.network.c.a
        /* renamed from: d */
        public a a(String str) {
            this.b = str;
            return this;
        }

        @Override // com.applovin.impl.sdk.network.c.a
        /* renamed from: d */
        public a b(Map<String, String> map) {
            this.e = map;
            return this;
        }

        @Override // com.applovin.impl.sdk.network.c.a
        /* renamed from: e */
        public a b(int i) {
            this.i = i;
            return this;
        }

        @Override // com.applovin.impl.sdk.network.c.a
        /* renamed from: e */
        public a c(String str) {
            this.c = str;
            return this;
        }

        @Override // com.applovin.impl.sdk.network.c.a
        /* renamed from: f */
        public a c(int i) {
            this.j = i;
            return this;
        }

        @Override // com.applovin.impl.sdk.network.c.a
        /* renamed from: f */
        public a b(String str) {
            this.a = str;
            return this;
        }

        @Override // com.applovin.impl.sdk.network.c.a
        /* renamed from: f */
        public a c(boolean z) {
            this.m = z;
            return this;
        }

        public a g(String str) {
            this.p = str;
            return this;
        }

        @Override // com.applovin.impl.sdk.network.c.a
        /* renamed from: g */
        public a d(boolean z) {
            this.n = z;
            return this;
        }

        public a h(boolean z) {
            this.q = z;
            return this;
        }
    }

    protected h(a aVar) {
        super(aVar);
        this.a = aVar.p;
        this.b = aVar.q;
    }

    public static a b(k kVar) {
        return new a(kVar);
    }

    public boolean q() {
        return this.a != null;
    }

    public String r() {
        return this.a;
    }

    public boolean s() {
        return this.b;
    }
}
