package com.amazon.aps.iva.kf;

import com.crunchyroll.crunchyroid.R;
import com.ellation.crunchyroll.api.etp.thirtpartyoauth.ThirdPartyApp;
import java.io.Serializable;
/* compiled from: ThirdPartyAppUiModel.kt */
/* loaded from: classes.dex */
public abstract class c0 implements Serializable {
    public final int c;
    public final int d;
    public final int f;
    public final int g;
    public final ThirdPartyApp k;
    public final boolean l;
    public final int b = R.string.discord;
    public final int e = R.drawable.ic_discord;
    public final int h = R.string.discord_disconnect_confirmation_title;
    public final int i = R.string.discord_disconnect_confirmation_message;
    public final int j = R.string.discord_disconnected_message;

    /* compiled from: ThirdPartyAppUiModel.kt */
    /* loaded from: classes.dex */
    public static final class a extends c0 {
        public final boolean m;

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public a(boolean r9) {
            /*
                r8 = this;
                if (r9 == 0) goto L6
                r0 = 2132017786(0x7f14027a, float:1.967386E38)
                goto L9
            L6:
                r0 = 2132017785(0x7f140279, float:1.9673858E38)
            L9:
                r2 = r0
                if (r9 == 0) goto L10
                r0 = 2132017541(0x7f140185, float:1.9673363E38)
                goto L13
            L10:
                r0 = 2132017540(0x7f140184, float:1.9673361E38)
            L13:
                r3 = r0
                if (r9 == 0) goto L1a
                r0 = 2131231212(0x7f0801ec, float:1.8078499E38)
                goto L1b
            L1a:
                r0 = 0
            L1b:
                r4 = r0
                if (r9 == 0) goto L22
                r0 = 2132018698(0x7f14060a, float:1.967571E38)
                goto L25
            L22:
                r0 = 2132018699(0x7f14060b, float:1.9675712E38)
            L25:
                r5 = r0
                com.ellation.crunchyroll.api.etp.thirtpartyoauth.ThirdPartyApp r6 = new com.ellation.crunchyroll.api.etp.thirtpartyoauth.ThirdPartyApp
                java.lang.String r0 = "discord"
                r6.<init>(r0)
                r1 = r8
                r7 = r9
                r1.<init>(r2, r3, r4, r5, r6, r7)
                r8.m = r9
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.kf.c0.a.<init>(boolean):void");
        }

        @Override // com.amazon.aps.iva.kf.c0
        public final boolean a() {
            return this.m;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if ((obj instanceof a) && this.m == ((a) obj).m) {
                return true;
            }
            return false;
        }

        public final int hashCode() {
            boolean z = this.m;
            if (z) {
                return 1;
            }
            return z ? 1 : 0;
        }

        public final String toString() {
            return "DiscordApp(isConnected=" + this.m + ")";
        }
    }

    public c0(int i, int i2, int i3, int i4, ThirdPartyApp thirdPartyApp, boolean z) {
        this.c = i;
        this.d = i2;
        this.f = i3;
        this.g = i4;
        this.k = thirdPartyApp;
        this.l = z;
    }

    public boolean a() {
        return this.l;
    }
}
