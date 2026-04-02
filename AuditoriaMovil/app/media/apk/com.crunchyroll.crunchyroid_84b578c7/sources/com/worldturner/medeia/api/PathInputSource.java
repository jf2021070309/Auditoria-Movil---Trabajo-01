package com.worldturner.medeia.api;

import com.amazon.aps.iva.yb0.j;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.worldturner.medeia.api.InputSource;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.Reader;
import java.nio.file.Path;
import kotlin.Metadata;
/* compiled from: InputSource.kt */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\u0013\u001a\u00020\u0006H\u0016R\u0014\u0010\u0005\u001a\u00020\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0014\u0010\u000b\u001a\u00020\f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000eR\u0014\u0010\u000f\u001a\u00020\u00108VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0014"}, d2 = {"Lcom/worldturner/medeia/api/PathInputSource;", "Lcom/worldturner/medeia/api/InputSource;", "path", "Ljava/nio/file/Path;", "(Ljava/nio/file/Path;)V", AppMeasurementSdk.ConditionalUserProperty.NAME, "", "getName", "()Ljava/lang/String;", "getPath", "()Ljava/nio/file/Path;", "preference", "Lcom/worldturner/medeia/api/InputPreference;", "getPreference", "()Lcom/worldturner/medeia/api/InputPreference;", "stream", "Ljava/io/InputStream;", "getStream", "()Ljava/io/InputStream;", "toString", "medeia-validator-core"}, k = 1, mv = {1, 1, 13})
/* loaded from: classes4.dex */
public final class PathInputSource implements InputSource {
    private final String name;
    private final Path path;

    public PathInputSource(Path path) {
        j.g(path, "path");
        this.path = path;
        this.name = path.toString();
    }

    @Override // com.worldturner.medeia.api.InputSource
    public String getName() {
        return this.name;
    }

    public final Path getPath() {
        return this.path;
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
        return new FileInputStream(new File(this.path.toString()));
    }

    public String toString() {
        return "PathInputSource(" + this.path + ')';
    }
}
