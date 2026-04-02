package com.applovin.impl.sdk.network;

import android.os.Bundle;
/* loaded from: classes.dex */
public class i {
    private final Bundle a;

    /* loaded from: classes.dex */
    public static class a {
        private final Bundle a;

        public a() {
            this(null);
        }

        public a(i iVar) {
            this.a = new Bundle();
            if (iVar != null) {
                for (String str : iVar.a().keySet()) {
                    a(str, iVar.a().getString(str));
                }
            }
        }

        public a a(String str) {
            if (str != null) {
                this.a.remove(str);
                return this;
            }
            throw new IllegalArgumentException("No key specified.");
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
    }

    private i(a aVar) {
        this.a = new Bundle(aVar.a);
    }

    public Bundle a() {
        return this.a;
    }

    public String toString() {
        return "RequestParameters{extraParameters=" + this.a + '}';
    }
}
