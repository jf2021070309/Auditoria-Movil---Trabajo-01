package androidx.media;

import android.media.AudioAttributes;
import com.amazon.aps.iva.c9.b;
/* loaded from: classes.dex */
public class AudioAttributesImplApi26Parcelizer {
    public static AudioAttributesImplApi26 read(b bVar) {
        AudioAttributesImplApi26 audioAttributesImplApi26 = new AudioAttributesImplApi26();
        audioAttributesImplApi26.a = (AudioAttributes) bVar.l(audioAttributesImplApi26.a, 1);
        audioAttributesImplApi26.b = bVar.j(audioAttributesImplApi26.b, 2);
        return audioAttributesImplApi26;
    }

    public static void write(AudioAttributesImplApi26 audioAttributesImplApi26, b bVar) {
        bVar.getClass();
        AudioAttributes audioAttributes = audioAttributesImplApi26.a;
        bVar.o(1);
        bVar.u(audioAttributes);
        bVar.t(audioAttributesImplApi26.b, 2);
    }
}
