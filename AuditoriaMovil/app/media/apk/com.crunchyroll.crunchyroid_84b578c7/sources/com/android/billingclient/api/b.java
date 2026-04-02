package com.android.billingclient.api;

import android.text.TextUtils;
import com.google.android.gms.internal.play_billing.zzu;
import java.util.ArrayList;
/* compiled from: com.android.billingclient:billing@@6.0.1 */
/* loaded from: classes.dex */
public final class b {
    public boolean a;
    public String b;
    public String c;
    public c d;
    public zzu e;
    public ArrayList f;
    public boolean g;

    /* compiled from: com.android.billingclient:billing@@6.0.1 */
    /* loaded from: classes.dex */
    public static class a {
        public ArrayList a;
        public c.a b;

        public a(int i) {
            c.a aVar = new c.a();
            aVar.c = true;
            this.b = aVar;
        }
    }

    /* compiled from: com.android.billingclient:billing@@6.0.1 */
    /* renamed from: com.android.billingclient.api.b$b  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C0932b {
        public final d a;
        public final String b;

        /* compiled from: com.android.billingclient:billing@@6.0.1 */
        /* renamed from: com.android.billingclient.api.b$b$a */
        /* loaded from: classes.dex */
        public static class a {
            public d a;
            public String b;
        }

        public /* synthetic */ C0932b(a aVar) {
            this.a = aVar.a;
            this.b = aVar.b;
        }
    }

    /* compiled from: com.android.billingclient:billing@@6.0.1 */
    /* loaded from: classes.dex */
    public static class c {
        public String a;
        public String b;
        public int c = 0;
        public int d = 0;

        /* compiled from: com.android.billingclient:billing@@6.0.1 */
        /* loaded from: classes.dex */
        public static class a {
            public String a;
            public String b;
            public boolean c;
            public int d = 0;
            public int e = 0;

            public final c a() {
                boolean z;
                if (TextUtils.isEmpty(this.a) && TextUtils.isEmpty(null)) {
                    z = false;
                } else {
                    z = true;
                }
                boolean isEmpty = true ^ TextUtils.isEmpty(this.b);
                if (z && isEmpty) {
                    throw new IllegalArgumentException("Please provide Old SKU purchase information(token/id) or original external transaction id, not both.");
                }
                if (!this.c && !z && !isEmpty) {
                    throw new IllegalArgumentException("Old SKU purchase information(token/id) or original external transaction id must be provided.");
                }
                c cVar = new c();
                cVar.a = this.a;
                cVar.c = this.d;
                cVar.d = this.e;
                cVar.b = this.b;
                return cVar;
            }
        }
    }
}
