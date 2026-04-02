package com.worldturner.medeia.api;

import com.amazon.aps.iva.yb0.e;
import com.amazon.aps.iva.yb0.j;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.worldturner.medeia.api.InputSource;
import java.io.InputStream;
import java.io.Reader;
import kotlin.Metadata;
/* compiled from: InputSource.kt */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u001b\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006J\b\u0010\u000f\u001a\u00020\u0005H\u0016R\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\t\u001a\u00020\n8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\fR\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u0010"}, d2 = {"Lcom/worldturner/medeia/api/ReaderInputSource;", "Lcom/worldturner/medeia/api/InputSource;", "reader", "Ljava/io/Reader;", AppMeasurementSdk.ConditionalUserProperty.NAME, "", "(Ljava/io/Reader;Ljava/lang/String;)V", "getName", "()Ljava/lang/String;", "preference", "Lcom/worldturner/medeia/api/InputPreference;", "getPreference", "()Lcom/worldturner/medeia/api/InputPreference;", "getReader", "()Ljava/io/Reader;", "toString", "medeia-validator-core"}, k = 1, mv = {1, 1, 13})
/* loaded from: classes4.dex */
public final class ReaderInputSource implements InputSource {
    private final String name;
    private final Reader reader;

    public ReaderInputSource(Reader reader) {
        this(reader, null, 2, null);
    }

    @Override // com.worldturner.medeia.api.InputSource
    public String getName() {
        return this.name;
    }

    @Override // com.worldturner.medeia.api.InputSource
    public InputPreference getPreference() {
        return InputPreference.READER;
    }

    @Override // com.worldturner.medeia.api.InputSource
    public Reader getReader() {
        return this.reader;
    }

    @Override // com.worldturner.medeia.api.InputSource
    public InputStream getStream() {
        return InputSource.DefaultImpls.getStream(this);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("ReaderInputSource(");
        String name = getName();
        if (name != null) {
            sb.append(name);
        }
        sb.append(")");
        String sb2 = sb.toString();
        j.b(sb2, "builder.append(\")\").toString()");
        return sb2;
    }

    public ReaderInputSource(Reader reader, String str) {
        j.g(reader, "reader");
        this.reader = reader;
        this.name = str;
    }

    public /* synthetic */ ReaderInputSource(Reader reader, String str, int i, e eVar) {
        this(reader, (i & 2) != 0 ? null : str);
    }
}
