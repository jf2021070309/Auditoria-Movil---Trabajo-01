package com.amazon.aps.iva.se0;
/* compiled from: JobSupport.kt */
/* loaded from: classes4.dex */
public final class w0 implements f1 {
    public final boolean b;

    public w0(boolean z) {
        this.b = z;
    }

    @Override // com.amazon.aps.iva.se0.f1
    public final u1 d() {
        return null;
    }

    @Override // com.amazon.aps.iva.se0.f1
    public final boolean isActive() {
        return this.b;
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("Empty{");
        if (this.b) {
            str = "Active";
        } else {
            str = "New";
        }
        return com.amazon.aps.iva.o0.t1.b(sb, str, '}');
    }
}
