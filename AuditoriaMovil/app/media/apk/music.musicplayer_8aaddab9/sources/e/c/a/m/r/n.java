package e.c.a.m.r;

import android.content.res.AssetManager;
import java.io.IOException;
import java.io.InputStream;
/* loaded from: classes.dex */
public class n extends b<InputStream> {
    public n(AssetManager assetManager, String str) {
        super(assetManager, str);
    }

    @Override // e.c.a.m.r.d
    public Class<InputStream> a() {
        return InputStream.class;
    }

    @Override // e.c.a.m.r.b
    public void c(InputStream inputStream) throws IOException {
        inputStream.close();
    }

    @Override // e.c.a.m.r.b
    public InputStream f(AssetManager assetManager, String str) throws IOException {
        return assetManager.open(str);
    }
}
