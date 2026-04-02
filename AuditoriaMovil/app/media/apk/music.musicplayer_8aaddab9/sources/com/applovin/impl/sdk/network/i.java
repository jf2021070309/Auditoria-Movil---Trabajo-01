package com.applovin.impl.sdk.network;

import android.os.Bundle;
/* loaded from: classes.dex */
public class i {
    private final Bundle a;

    /* renamed from: b  reason: collision with root package name */
    private final String f4246b;

    /* loaded from: classes.dex */
    public static class a {
        private final Bundle a;

        /* renamed from: b  reason: collision with root package name */
        private String f4247b;

        public a() {
            this(null);
        }

        public a(i iVar) {
            this.a = new Bundle();
            if (iVar != null) {
                for (String str : iVar.a().keySet()) {
                    a(str, iVar.a().getString(str));
                }
                this.f4247b = iVar.b();
            }
        }

        public a a(String str) {
            this.f4247b = str;
            return this;
        }

        public a a(String str, String str2) {
            if (str != null) {
                this.a.putString(str, str2);
                return this;
            }
            throw new IllegalArgumentException("No key specified");
        }

        public i a() {
            return new i(this);
        }

        public String b(String str) {
            if (str != null) {
                return this.a.getString(str);
            }
            throw new IllegalArgumentException("No key specified");
        }

        public a c(String str) {
            if (str != null) {
                this.a.remove(str);
                return this;
            }
            throw new IllegalArgumentException("No key specified.");
        }
    }

    private i(a aVar) {
        this.a = new Bundle(aVar.a);
        this.f4246b = aVar.f4247b;
    }

    public Bundle a() {
        return this.a;
    }

    public String b() {
        return this.f4246b;
    }

    public String toString() {
        StringBuilder y = e.a.d.a.a.y("RequestParameters{extraParameters=");
        y.append(this.a);
        y.append('}');
        return y.toString();
    }
}
