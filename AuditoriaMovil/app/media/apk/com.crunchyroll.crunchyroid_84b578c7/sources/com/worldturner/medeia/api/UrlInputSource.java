package com.worldturner.medeia.api;

import com.amazon.aps.iva.yb0.j;
import com.google.android.gms.common.internal.ImagesContract;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.worldturner.medeia.api.InputSource;
import java.io.InputStream;
import java.io.Reader;
import java.net.URL;
import kotlin.Metadata;
/* compiled from: InputSource.kt */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\u0013\u001a\u00020\u0006H\u0016R\u0014\u0010\u0005\u001a\u00020\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\t\u001a\u00020\n8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\fR\u0014\u0010\r\u001a\u00020\u000e8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0014"}, d2 = {"Lcom/worldturner/medeia/api/UrlInputSource;", "Lcom/worldturner/medeia/api/InputSource;", ImagesContract.URL, "Ljava/net/URL;", "(Ljava/net/URL;)V", AppMeasurementSdk.ConditionalUserProperty.NAME, "", "getName", "()Ljava/lang/String;", "preference", "Lcom/worldturner/medeia/api/InputPreference;", "getPreference", "()Lcom/worldturner/medeia/api/InputPreference;", "stream", "Ljava/io/InputStream;", "getStream", "()Ljava/io/InputStream;", "getUrl", "()Ljava/net/URL;", "toString", "medeia-validator-core"}, k = 1, mv = {1, 1, 13})
/* loaded from: classes4.dex */
public final class UrlInputSource implements InputSource {
    private final String name;
    private final URL url;

    public UrlInputSource(URL url) {
        j.g(url, ImagesContract.URL);
        this.url = url;
        String url2 = url.toString();
        j.b(url2, "url.toString()");
        this.name = url2;
    }

    @Override // com.worldturner.medeia.api.InputSource
    public String getName() {
        return this.name;
    }

    @Override // com.worldturner.medeia.api.InputSource
    public InputPreference getPreference() {
        return InputPreference.STREAM;
    }

    @Override // com.worldturner.medeia.api.InputSource
    public Reader getReader() {
        return InputSource.DefaultImpls.getReader(this);
    }

    @Override // com.worldturner.medeia.api.InputSource
    public InputStream getStream() {
        InputStream openStream = this.url.openStream();
        j.b(openStream, "url.openStream()");
        return openStream;
    }

    public final URL getUrl() {
        return this.url;
    }

    public String toString() {
        return "UrlInputSource(" + this.url + ')';
    }
}
