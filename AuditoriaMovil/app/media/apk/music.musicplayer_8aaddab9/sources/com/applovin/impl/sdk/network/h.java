package com.applovin.impl.sdk.network;

import com.applovin.impl.sdk.m;
import com.applovin.impl.sdk.network.c;
import java.util.Map;
import org.json.JSONObject;
/* loaded from: classes.dex */
public class h<T> extends c {
    private String a;

    /* renamed from: b  reason: collision with root package name */
    private boolean f4245b;

    /* loaded from: classes.dex */
    public static class a<T> extends c.a<T> {
        private String p;
        private boolean q;

        public a(m mVar) {
            super(mVar);
            this.f4208h = ((Integer) mVar.a(com.applovin.impl.sdk.c.b.cM)).intValue();
            this.f4209i = ((Integer) mVar.a(com.applovin.impl.sdk.c.b.cL)).intValue();
            this.f4210j = ((Integer) mVar.a(com.applovin.impl.sdk.c.b.cQ)).intValue();
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.applovin.impl.sdk.network.c.a
        public /* synthetic */ c.a a(Object obj) {
            return b((a<T>) obj);
        }

        public a b(T t) {
            this.f4207g = t;
            return this;
        }

        @Override // com.applovin.impl.sdk.network.c.a
        /* renamed from: b */
        public a a(JSONObject jSONObject) {
            this.f4206f = jSONObject;
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
            this.f4204d = map;
            return this;
        }

        @Override // com.applovin.impl.sdk.network.c.a
        /* renamed from: d */
        public a a(int i2) {
            this.f4208h = i2;
            return this;
        }

        @Override // com.applovin.impl.sdk.network.c.a
        /* renamed from: d */
        public a a(String str) {
            this.f4202b = str;
            return this;
        }

        @Override // com.applovin.impl.sdk.network.c.a
        /* renamed from: d */
        public a b(Map<String, String> map) {
            this.f4205e = map;
            return this;
        }

        @Override // com.applovin.impl.sdk.network.c.a
        /* renamed from: e */
        public a b(int i2) {
            this.f4209i = i2;
            return this;
        }

        @Override // com.applovin.impl.sdk.network.c.a
        /* renamed from: e */
        public a c(String str) {
            this.f4203c = str;
            return this;
        }

        @Override // com.applovin.impl.sdk.network.c.a
        /* renamed from: f */
        public a c(int i2) {
            this.f4210j = i2;
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
            this.f4213m = z;
            return this;
        }

        public a g(String str) {
            this.p = str;
            return this;
        }

        @Override // com.applovin.impl.sdk.network.c.a
        /* renamed from: g */
        public a d(boolean z) {
            this.f4214n = z;
            return this;
        }

        public a h(boolean z) {
            this.q = z;
            return this;
        }
    }

    public h(a aVar) {
        super(aVar);
        this.a = aVar.p;
        this.f4245b = aVar.q;
    }

    public static a b(m mVar) {
        return new a(mVar);
    }

    public boolean q() {
        return this.a != null;
    }

    public String r() {
        return this.a;
    }

    public boolean s() {
        return this.f4245b;
    }
}
