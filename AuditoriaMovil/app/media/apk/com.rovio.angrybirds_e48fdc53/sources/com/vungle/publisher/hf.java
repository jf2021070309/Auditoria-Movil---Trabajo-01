package com.vungle.publisher;
/* loaded from: classes4.dex */
public class hf implements jf {
    final String a;

    public String toString() {
        return this.a;
    }

    public hf(String str) {
        this.a = str;
    }

    public boolean equals(Object obj) {
        if (obj instanceof hf) {
            return this.a.equals(obj.toString());
        }
        return false;
    }

    public int hashCode() {
        return this.a.hashCode();
    }

    @Override // com.vungle.publisher.jf
    public boolean a() {
        return true;
    }
}
