package e.c.a.m;

import com.bumptech.glide.load.ImageHeaderParser;
import java.io.IOException;
import java.nio.ByteBuffer;
/* loaded from: classes.dex */
public class f implements j {
    public final /* synthetic */ ByteBuffer a;

    public f(ByteBuffer byteBuffer) {
        this.a = byteBuffer;
    }

    @Override // e.c.a.m.j
    public ImageHeaderParser.ImageType a(ImageHeaderParser imageHeaderParser) throws IOException {
        return imageHeaderParser.a(this.a);
    }
}
