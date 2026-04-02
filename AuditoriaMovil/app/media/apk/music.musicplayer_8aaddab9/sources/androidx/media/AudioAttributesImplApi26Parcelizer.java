package androidx.media;

import android.media.AudioAttributes;
import c.b0.b;
import java.util.Objects;
/* loaded from: classes.dex */
public class AudioAttributesImplApi26Parcelizer {
    public static AudioAttributesImplApi26 read(b bVar) {
        AudioAttributesImplApi26 audioAttributesImplApi26 = new AudioAttributesImplApi26();
        audioAttributesImplApi26.a = (AudioAttributes) bVar.m(audioAttributesImplApi26.a, 1);
        audioAttributesImplApi26.f467b = bVar.k(audioAttributesImplApi26.f467b, 2);
        return audioAttributesImplApi26;
    }

    public static void write(AudioAttributesImplApi26 audioAttributesImplApi26, b bVar) {
        Objects.requireNonNull(bVar);
        AudioAttributes audioAttributes = audioAttributesImplApi26.a;
        bVar.p(1);
        bVar.u(audioAttributes);
        int i2 = audioAttributesImplApi26.f467b;
        bVar.p(2);
        bVar.t(i2);
    }
}
