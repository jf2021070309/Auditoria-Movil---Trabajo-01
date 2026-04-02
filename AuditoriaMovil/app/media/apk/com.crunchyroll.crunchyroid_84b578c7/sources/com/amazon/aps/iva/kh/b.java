package com.amazon.aps.iva.kh;

import android.content.Context;
import com.amazon.aps.iva.aq.k;
import com.amazon.aps.iva.yb0.j;
import com.amazon.aps.iva.yb0.l;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
/* compiled from: AudioLanguageOptionsModule.kt */
/* loaded from: classes.dex */
public final class b extends l implements com.amazon.aps.iva.xb0.a<String> {
    public final /* synthetic */ Context h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(Context context) {
        super(0);
        this.h = context;
    }

    @Override // com.amazon.aps.iva.xb0.a
    public final String invoke() {
        BufferedReader bufferedReader;
        InputStream open = this.h.getAssets().open("audio-languages.json");
        j.e(open, "context.assets.open(\"audio-languages.json\")");
        InputStreamReader inputStreamReader = new InputStreamReader(open, com.amazon.aps.iva.oe0.a.b);
        if (inputStreamReader instanceof BufferedReader) {
            bufferedReader = (BufferedReader) inputStreamReader;
        } else {
            bufferedReader = new BufferedReader(inputStreamReader, 8192);
        }
        try {
            String y = k.y(bufferedReader);
            com.amazon.aps.iva.a60.b.k(bufferedReader, null);
            return y;
        } finally {
        }
    }
}
