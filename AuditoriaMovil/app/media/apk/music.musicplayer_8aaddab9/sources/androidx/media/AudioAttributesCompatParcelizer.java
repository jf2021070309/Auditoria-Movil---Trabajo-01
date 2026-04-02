package androidx.media;

import c.b0.b;
import java.util.Objects;
/* loaded from: classes.dex */
public class AudioAttributesCompatParcelizer {
    public static AudioAttributesCompat read(b bVar) {
        AudioAttributesCompat audioAttributesCompat = new AudioAttributesCompat();
        Object obj = audioAttributesCompat.f466b;
        if (bVar.i(1)) {
            obj = bVar.o();
        }
        audioAttributesCompat.f466b = (AudioAttributesImpl) obj;
        return audioAttributesCompat;
    }

    public static void write(AudioAttributesCompat audioAttributesCompat, b bVar) {
        Objects.requireNonNull(bVar);
        AudioAttributesImpl audioAttributesImpl = audioAttributesCompat.f466b;
        bVar.p(1);
        bVar.w(audioAttributesImpl);
    }
}
