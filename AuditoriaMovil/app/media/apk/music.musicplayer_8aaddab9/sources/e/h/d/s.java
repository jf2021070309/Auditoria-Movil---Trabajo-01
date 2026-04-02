package e.h.d;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.media.audiofx.AudioEffect;
import android.media.audiofx.BassBoost;
import android.media.audiofx.Equalizer;
import e.a.c.j6;
import e.h.g.s1;
import java.util.Objects;
@SuppressLint({"NewApi"})
@TargetApi(9)
/* loaded from: classes2.dex */
public class s {
    public volatile int a;

    /* renamed from: b  reason: collision with root package name */
    public volatile BassBoost f8188b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f8189c = true;

    /* renamed from: d  reason: collision with root package name */
    public volatile boolean f8190d = false;

    /* renamed from: e  reason: collision with root package name */
    public volatile Equalizer f8191e;

    public s(int i2) {
        this.a = i2;
        d();
    }

    public void a() {
        try {
            if (this.f8191e != null) {
                s1.b("Disable equalizer ");
                this.f8191e.setEnabled(false);
            }
            if (this.f8188b != null) {
                s1.b("Bass Booster disabled");
                this.f8188b.setEnabled(false);
            }
        } catch (Exception e2) {
            s1.l(e2, true);
            e();
        }
    }

    public void b(boolean z) {
        try {
            if (this.f8191e != null) {
                s1.b("Enable equalizer ");
                this.f8191e.setEnabled(z);
            }
            if (this.f8188b != null) {
                StringBuilder sb = new StringBuilder();
                sb.append("Bass Booster  = ");
                boolean z2 = false;
                sb.append(this.f8190d && z);
                s1.b(sb.toString());
                BassBoost bassBoost = this.f8188b;
                if (this.f8190d && z) {
                    z2 = true;
                }
                bassBoost.setEnabled(z2);
            }
        } catch (Exception e2) {
            s1.l(e2, true);
            e();
        }
    }

    public void c(int i2, boolean z) {
        try {
            if ((i2 != this.a || z) || this.f8191e == null || this.f8188b == null) {
                e();
                this.a = i2;
                d();
            }
            if (this.f8191e == null) {
                s1.c("Failed to create EQ");
                return;
            }
            this.f8191e.setEnabled(true);
            this.f8188b.setEnabled(this.f8190d);
        } catch (Exception e2) {
            s1.l(e2, true);
            e();
        } catch (UnsatisfiedLinkError e3) {
            s1.l(e3, true);
        }
    }

    public final void d() {
        try {
            if (this.a != 0) {
                e();
                this.f8191e = new Equalizer(10, this.a);
                this.f8188b = new BassBoost(10, this.a);
                this.f8189c = this.f8188b.getStrengthSupported();
                s1.b("Equalizer created for " + this.a);
                this.f8191e.setEnableStatusListener(new AudioEffect.OnEnableStatusChangeListener() { // from class: e.h.d.b
                    @Override // android.media.audiofx.AudioEffect.OnEnableStatusChangeListener
                    public final void onEnableStatusChange(AudioEffect audioEffect, boolean z) {
                        Objects.requireNonNull(s.this);
                        s1.c("Equalizer is enabled? = " + z);
                    }
                });
                this.f8191e.setControlStatusListener(new AudioEffect.OnControlStatusChangeListener() { // from class: e.h.d.f
                    @Override // android.media.audiofx.AudioEffect.OnControlStatusChangeListener
                    public final void onControlStatusChange(AudioEffect audioEffect, boolean z) {
                        s sVar = s.this;
                        Objects.requireNonNull(sVar);
                        s1.c("Has control? = " + z);
                        if (sVar.f8191e != null) {
                            sVar.f8191e.setEnabled(true);
                        }
                    }
                });
                this.f8191e.setParameterListener(new Equalizer.OnParameterChangeListener() { // from class: e.h.d.d
                    @Override // android.media.audiofx.Equalizer.OnParameterChangeListener
                    public final void onParameterChange(Equalizer equalizer, int i2, int i3, int i4, int i5) {
                        s1.b("Equalizer paramter changed");
                    }
                });
                this.f8188b.setEnableStatusListener(new AudioEffect.OnEnableStatusChangeListener() { // from class: e.h.d.e
                    @Override // android.media.audiofx.AudioEffect.OnEnableStatusChangeListener
                    public final void onEnableStatusChange(AudioEffect audioEffect, boolean z) {
                        s sVar = s.this;
                        Objects.requireNonNull(sVar);
                        s1.c("Booster is enabled? = " + z);
                        if (sVar.f8190d == z || sVar.f8188b == null) {
                            return;
                        }
                        sVar.f8188b.setEnabled(sVar.f8190d);
                    }
                });
                this.f8188b.setControlStatusListener(new AudioEffect.OnControlStatusChangeListener() { // from class: e.h.d.c
                    @Override // android.media.audiofx.AudioEffect.OnControlStatusChangeListener
                    public final void onControlStatusChange(AudioEffect audioEffect, boolean z) {
                        s sVar = s.this;
                        Objects.requireNonNull(sVar);
                        s1.c("Has control? = " + z);
                        if (sVar.f8188b == null || !sVar.f8190d) {
                            return;
                        }
                        sVar.f8188b.setEnabled(sVar.f8190d);
                    }
                });
                this.f8188b.setParameterListener(new BassBoost.OnParameterChangeListener() { // from class: e.h.d.a
                    @Override // android.media.audiofx.BassBoost.OnParameterChangeListener
                    public final void onParameterChange(BassBoost bassBoost, int i2, int i3, short s) {
                        s1.b("BassBoost effect has changed");
                    }
                });
            }
        } catch (UnsupportedOperationException unused) {
            s1.c("Failed to load equalizer");
            Objects.requireNonNull((j6) c.i.g.b.f());
        } catch (Exception e2) {
            s1.l(e2, true);
            Objects.requireNonNull((j6) c.i.g.b.f());
            e();
        }
    }

    public void e() {
        if (this.f8191e != null) {
            s1.b("Equalizer released");
            this.f8191e.setEnabled(false);
            this.f8191e.release();
            this.f8191e = null;
        }
        if (this.f8188b != null) {
            this.f8188b.setEnabled(false);
            this.f8188b.release();
            this.f8188b = null;
        }
    }

    public void f(short s, short s2, int i2, boolean z) {
        short[] bandLevelRange;
        double d2;
        short[] bandLevelRange2;
        float f2;
        float f3;
        try {
            c(i2, false);
            if (this.f8191e == null || s < 0) {
                return;
            }
            try {
                if (s >= this.f8191e.getNumberOfBands() || (bandLevelRange2 = this.f8191e.getBandLevelRange()) == null || bandLevelRange2.length != 2) {
                    return;
                }
                short ceil = (short) (s2 * ((bandLevelRange2[1] - bandLevelRange2[0]) / 24.0f) < 0.0f ? Math.ceil(f3) : Math.floor(f3));
                if (z && ceil == 0) {
                    ceil = (short) ((f2 / 2.0f) + ceil);
                }
                this.f8191e.setBandLevel(s, ceil);
            } catch (RuntimeException e2) {
                s1.l(e2, true);
                c(this.a, true);
                b(true);
                if (s >= 0) {
                    try {
                        if (s >= this.f8191e.getNumberOfBands() || (bandLevelRange = this.f8191e.getBandLevelRange()) == null || bandLevelRange.length != 2) {
                            return;
                        }
                        double floor = Math.floor((bandLevelRange[1] - bandLevelRange[0]) / 24.0f);
                        Double.isNaN(s2);
                        this.f8191e.setBandLevel(s, (short) (floor * d2));
                    } catch (RuntimeException unused) {
                        s1.l(e2, true);
                        e();
                    }
                }
            }
        } catch (Exception e3) {
            s1.l(e3, true);
            e();
        }
    }
}
