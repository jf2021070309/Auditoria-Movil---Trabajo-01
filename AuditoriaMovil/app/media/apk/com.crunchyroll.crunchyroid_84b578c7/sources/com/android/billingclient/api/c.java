package com.android.billingclient.api;

import com.google.android.gms.internal.play_billing.zzb;
/* compiled from: com.android.billingclient:billing@@6.0.1 */
/* loaded from: classes.dex */
public final class c {
    public int a;
    public String b;

    /* compiled from: com.android.billingclient:billing@@6.0.1 */
    /* loaded from: classes.dex */
    public static class a {
        public int a;
        public String b = "";

        public final c a() {
            c cVar = new c();
            cVar.a = this.a;
            cVar.b = this.b;
            return cVar;
        }
    }

    public static a a() {
        return new a();
    }

    public final String toString() {
        return com.amazon.aps.iva.c.b.a("Response Code: ", zzb.zzg(this.a), ", Debug Message: ", this.b);
    }
}
