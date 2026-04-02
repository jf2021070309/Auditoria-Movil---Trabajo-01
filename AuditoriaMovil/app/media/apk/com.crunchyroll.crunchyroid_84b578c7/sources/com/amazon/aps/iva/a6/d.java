package com.amazon.aps.iva.a6;

import android.content.Context;
import android.media.AudioFocusRequest;
import android.media.AudioManager;
import android.os.Handler;
import com.amazon.aps.iva.a6.m0;
/* compiled from: AudioFocusManager.java */
/* loaded from: classes.dex */
public final class d {
    public final AudioManager a;
    public final a b;
    public b c;
    public com.amazon.aps.iva.q5.f d;
    public int e;
    public int f;
    public float g = 1.0f;
    public AudioFocusRequest h;

    /* compiled from: AudioFocusManager.java */
    /* loaded from: classes.dex */
    public class a implements AudioManager.OnAudioFocusChangeListener {
        public final Handler a;

        public a(Handler handler) {
            this.a = handler;
        }

        @Override // android.media.AudioManager.OnAudioFocusChangeListener
        public final void onAudioFocusChange(int i) {
            this.a.post(new c(i, 0, this));
        }
    }

    /* compiled from: AudioFocusManager.java */
    /* loaded from: classes.dex */
    public interface b {
    }

    public d(Context context, Handler handler, m0.b bVar) {
        AudioManager audioManager = (AudioManager) context.getApplicationContext().getSystemService("audio");
        audioManager.getClass();
        this.a = audioManager;
        this.c = bVar;
        this.b = new a(handler);
        this.e = 0;
    }

    public final void a() {
        if (this.e == 0) {
            return;
        }
        int i = com.amazon.aps.iva.t5.g0.a;
        AudioManager audioManager = this.a;
        if (i >= 26) {
            AudioFocusRequest audioFocusRequest = this.h;
            if (audioFocusRequest != null) {
                audioManager.abandonAudioFocusRequest(audioFocusRequest);
            }
        } else {
            audioManager.abandonAudioFocus(this.b);
        }
        d(0);
    }

    public final void b(int i) {
        b bVar = this.c;
        if (bVar != null) {
            m0 m0Var = m0.this;
            boolean k0 = m0Var.k0();
            int i2 = 1;
            if (k0 && i != 1) {
                i2 = 2;
            }
            m0Var.D1(i, i2, k0);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0022, code lost:
        if (r4.b == 1) goto L21;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void c(com.amazon.aps.iva.q5.f r4) {
        /*
            r3 = this;
            com.amazon.aps.iva.q5.f r0 = r3.d
            boolean r0 = com.amazon.aps.iva.t5.g0.a(r0, r4)
            if (r0 != 0) goto L3b
            r3.d = r4
            r0 = 0
            r1 = 1
            if (r4 != 0) goto Lf
            goto L2e
        Lf:
            int r2 = r4.d
            switch(r2) {
                case 0: goto L29;
                case 1: goto L2c;
                case 2: goto L27;
                case 3: goto L2e;
                case 4: goto L27;
                case 5: goto L25;
                case 6: goto L25;
                case 7: goto L25;
                case 8: goto L25;
                case 9: goto L25;
                case 10: goto L25;
                case 11: goto L20;
                case 12: goto L25;
                case 13: goto L25;
                case 14: goto L2c;
                case 15: goto L14;
                case 16: goto L18;
                default: goto L14;
            }
        L14:
            com.amazon.aps.iva.t5.p.g()
            goto L2e
        L18:
            int r4 = com.amazon.aps.iva.t5.g0.a
            r2 = 19
            if (r4 < r2) goto L27
            r4 = 4
            goto L2f
        L20:
            int r4 = r4.b
            if (r4 != r1) goto L25
            goto L27
        L25:
            r4 = 3
            goto L2f
        L27:
            r4 = 2
            goto L2f
        L29:
            com.amazon.aps.iva.t5.p.g()
        L2c:
            r4 = r1
            goto L2f
        L2e:
            r4 = r0
        L2f:
            r3.f = r4
            if (r4 == r1) goto L35
            if (r4 != 0) goto L36
        L35:
            r0 = r1
        L36:
            java.lang.String r4 = "Automatic handling of audio focus is only available for USAGE_MEDIA and USAGE_GAME."
            com.amazon.aps.iva.cq.b.v(r0, r4)
        L3b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.a6.d.c(com.amazon.aps.iva.q5.f):void");
    }

    public final void d(int i) {
        float f;
        if (this.e == i) {
            return;
        }
        this.e = i;
        if (i == 3) {
            f = 0.2f;
        } else {
            f = 1.0f;
        }
        if (this.g == f) {
            return;
        }
        this.g = f;
        b bVar = this.c;
        if (bVar != null) {
            m0 m0Var = m0.this;
            m0Var.w1(1, 2, Float.valueOf(m0Var.c0 * m0Var.A.g));
        }
    }

    public final int e(int i, boolean z) {
        boolean z2;
        int requestAudioFocus;
        AudioFocusRequest.Builder builder;
        boolean z3;
        int i2 = 1;
        if (i != 1 && this.f == 1) {
            z2 = false;
        } else {
            z2 = true;
        }
        if (z2) {
            a();
            if (z) {
                return 1;
            }
            return -1;
        } else if (!z) {
            return -1;
        } else {
            if (this.e != 1) {
                int i3 = com.amazon.aps.iva.t5.g0.a;
                a aVar = this.b;
                AudioManager audioManager = this.a;
                if (i3 >= 26) {
                    AudioFocusRequest audioFocusRequest = this.h;
                    if (audioFocusRequest == null) {
                        if (audioFocusRequest == null) {
                            builder = new AudioFocusRequest.Builder(this.f);
                        } else {
                            builder = new AudioFocusRequest.Builder(this.h);
                        }
                        com.amazon.aps.iva.q5.f fVar = this.d;
                        if (fVar != null && fVar.b == 1) {
                            z3 = true;
                        } else {
                            z3 = false;
                        }
                        fVar.getClass();
                        this.h = builder.setAudioAttributes(fVar.a().a).setWillPauseWhenDucked(z3).setOnAudioFocusChangeListener(aVar).build();
                    }
                    requestAudioFocus = audioManager.requestAudioFocus(this.h);
                } else {
                    com.amazon.aps.iva.q5.f fVar2 = this.d;
                    fVar2.getClass();
                    requestAudioFocus = audioManager.requestAudioFocus(aVar, com.amazon.aps.iva.t5.g0.C(fVar2.d), this.f);
                }
                if (requestAudioFocus == 1) {
                    d(1);
                } else {
                    d(0);
                    i2 = -1;
                }
            }
            return i2;
        }
    }
}
