package androidx.media;

import com.amazon.aps.iva.c9.b;
import com.amazon.aps.iva.c9.d;
/* loaded from: classes.dex */
public class AudioAttributesCompatParcelizer {
    public static AudioAttributesCompat read(b bVar) {
        AudioAttributesCompat audioAttributesCompat = new AudioAttributesCompat();
        d dVar = audioAttributesCompat.a;
        if (bVar.h(1)) {
            dVar = bVar.n();
        }
        audioAttributesCompat.a = (AudioAttributesImpl) dVar;
        return audioAttributesCompat;
    }

    public static void write(AudioAttributesCompat audioAttributesCompat, b bVar) {
        bVar.getClass();
        AudioAttributesImpl audioAttributesImpl = audioAttributesCompat.a;
        bVar.o(1);
        bVar.w(audioAttributesImpl);
    }
}
