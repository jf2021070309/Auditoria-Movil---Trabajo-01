package com.amazon.aps.iva.ho;

import com.amazon.aps.iva.yb0.j;
/* compiled from: UserAccountMigrationRouter.kt */
/* loaded from: classes2.dex */
public final class d implements c {
    public final com.amazon.aps.iva.co.d a;
    public final f b;
    public final com.amazon.aps.iva.ho.a c;
    public final com.amazon.aps.iva.eo.b d;

    /* compiled from: UserAccountMigrationRouter.kt */
    /* loaded from: classes2.dex */
    public /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[e.values().length];
            try {
                iArr[e.OWNERSHIP_VERIFICATION.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[e.MIGRATION_WELCOME.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[e.ACCEPT_TOS.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            a = iArr;
        }
    }

    public d(com.amazon.aps.iva.co.d dVar, g gVar, b bVar, com.amazon.aps.iva.eo.b bVar2) {
        this.a = dVar;
        this.b = gVar;
        this.c = bVar;
        this.d = bVar2;
    }

    @Override // com.amazon.aps.iva.ho.c
    public final void a() {
        if (this.a.isEnabled() && this.b.a() == e.MIGRATION_WELCOME) {
            this.c.o0(false);
        }
    }

    @Override // com.amazon.aps.iva.ho.c
    public final void b(String str) {
        e a2;
        j.f(str, "emailText");
        if (this.a.isEnabled() && (a2 = this.b.a()) != null) {
            int i = a.a[a2.ordinal()];
            com.amazon.aps.iva.ho.a aVar = this.c;
            com.amazon.aps.iva.eo.b bVar = this.d;
            if (i != 1) {
                if (i != 2) {
                    if (i == 3) {
                        bVar.setShouldShowTerms(true);
                        aVar.n0();
                        return;
                    }
                    return;
                }
                bVar.setShouldShowTerms(false);
                aVar.o0(false);
                return;
            }
            bVar.setShouldShowTerms(false);
            aVar.p0(str);
        }
    }

    @Override // com.amazon.aps.iva.ho.c
    public final boolean c() {
        if (this.a.isEnabled()) {
            com.amazon.aps.iva.eo.b bVar = this.d;
            if (!bVar.getAcceptedTerms() && bVar.getShouldShowTerms()) {
                return true;
            }
        }
        return false;
    }
}
