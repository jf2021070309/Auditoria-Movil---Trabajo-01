package androidx.media;

import android.media.AudioAttributes;
/* loaded from: classes.dex */
public class AudioAttributesImplApi21 implements AudioAttributesImpl {
    public AudioAttributes a;
    public int b = -1;

    public AudioAttributesImplApi21() {
    }

    @Override // androidx.media.AudioAttributesImpl
    public final int a() {
        int i = this.b;
        if (i != -1) {
            return i;
        }
        return AudioAttributesCompat.b(this.a.getFlags(), this.a.getUsage());
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof AudioAttributesImplApi21)) {
            return false;
        }
        return this.a.equals(((AudioAttributesImplApi21) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "AudioAttributesCompat: audioattributes=" + this.a;
    }

    public AudioAttributesImplApi21(AudioAttributes audioAttributes) {
        this.a = audioAttributes;
    }
}
