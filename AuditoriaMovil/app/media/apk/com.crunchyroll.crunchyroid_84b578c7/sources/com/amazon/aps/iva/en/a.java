package com.amazon.aps.iva.en;

import com.crunchyroll.crunchyroid.R;
import java.io.Serializable;
/* compiled from: RestrictionReason.kt */
/* loaded from: classes2.dex */
public abstract class a implements Serializable {
    public final int b;
    public final int c;

    /* compiled from: RestrictionReason.kt */
    /* renamed from: com.amazon.aps.iva.en.a$a  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static final class C0227a extends a {
        public static final C0227a d = new C0227a();

        public C0227a() {
            super(R.string.issue_with_your_account, R.string.please_contact_customer_support);
        }
    }

    /* compiled from: RestrictionReason.kt */
    /* loaded from: classes2.dex */
    public static final class b extends a {
        public static final b d = new b();

        public b() {
            super(R.string.cannot_log_in, R.string.contact_cs_to_troubleshoot);
        }
    }

    public a(int i, int i2) {
        this.b = i;
        this.c = i2;
    }
}
