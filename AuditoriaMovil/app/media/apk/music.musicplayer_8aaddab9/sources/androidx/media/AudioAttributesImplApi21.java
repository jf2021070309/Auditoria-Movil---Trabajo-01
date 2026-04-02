package androidx.media;

import android.media.AudioAttributes;
import androidx.media.AudioAttributesImpl;
/* loaded from: classes.dex */
public class AudioAttributesImplApi21 implements AudioAttributesImpl {
    public AudioAttributes a;

    /* renamed from: b  reason: collision with root package name */
    public int f467b;

    /* loaded from: classes.dex */
    public static class a implements AudioAttributesImpl.a {
        public final AudioAttributes.Builder a = new AudioAttributes.Builder();

        @Override // androidx.media.AudioAttributesImpl.a
        public AudioAttributesImpl.a a(int i2) {
            this.a.setLegacyStreamType(i2);
            return this;
        }

        @Override // androidx.media.AudioAttributesImpl.a
        public AudioAttributesImpl build() {
            return new AudioAttributesImplApi21(this.a.build());
        }
    }

    public AudioAttributesImplApi21() {
        this.f467b = -1;
    }

    public AudioAttributesImplApi21(AudioAttributes audioAttributes) {
        this.f467b = -1;
        this.a = audioAttributes;
        this.f467b = -1;
    }

    public AudioAttributesImplApi21(AudioAttributes audioAttributes, int i2) {
        this.f467b = -1;
        this.a = audioAttributes;
        this.f467b = i2;
    }

    public boolean equals(Object obj) {
        if (obj instanceof AudioAttributesImplApi21) {
            return this.a.equals(((AudioAttributesImplApi21) obj).a);
        }
        return false;
    }

    public int hashCode() {
        return this.a.hashCode();
    }

    public String toString() {
        StringBuilder y = e.a.d.a.a.y("AudioAttributesCompat: audioattributes=");
        y.append(this.a);
        return y.toString();
    }
}
