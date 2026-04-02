package com.worldturner.medeia.api;

import com.amazon.aps.iva.kb0.h;
import com.amazon.aps.iva.oe0.q;
import com.amazon.aps.iva.yb0.e;
import com.amazon.aps.iva.yb0.j;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.worldturner.medeia.api.InputSource;
import java.io.InputStream;
import java.io.Reader;
import kotlin.Metadata;
/* compiled from: InputSource.kt */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 \u00142\u00020\u0001:\u0001\u0014B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\u0013\u001a\u00020\u0006H\u0016R\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u00068VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\t\u001a\u00020\n8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\fR\u0014\u0010\r\u001a\u00020\u000e8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0015"}, d2 = {"Lcom/worldturner/medeia/api/MetaSchemaInputSource;", "Lcom/worldturner/medeia/api/InputSource;", "version", "Lcom/worldturner/medeia/api/JsonSchemaVersion;", "(Lcom/worldturner/medeia/api/JsonSchemaVersion;)V", AppMeasurementSdk.ConditionalUserProperty.NAME, "", "getName", "()Ljava/lang/String;", "preference", "Lcom/worldturner/medeia/api/InputPreference;", "getPreference", "()Lcom/worldturner/medeia/api/InputPreference;", "stream", "Ljava/io/InputStream;", "getStream", "()Ljava/io/InputStream;", "getVersion", "()Lcom/worldturner/medeia/api/JsonSchemaVersion;", "toString", "Companion", "medeia-validator-core"}, k = 1, mv = {1, 1, 13})
/* loaded from: classes4.dex */
public final class MetaSchemaInputSource implements InputSource {
    public static final Companion Companion = new Companion(null);
    private static final MetaSchemaInputSource DRAFT04 = new MetaSchemaInputSource(JsonSchemaVersion.DRAFT04);
    private static final MetaSchemaInputSource DRAFT06 = new MetaSchemaInputSource(JsonSchemaVersion.DRAFT06);
    private static final MetaSchemaInputSource DRAFT07 = new MetaSchemaInputSource(JsonSchemaVersion.DRAFT07);
    private static final String RESOURCE_SCHEMA_DRAFT04 = "/meta-schemas/schema-draft04.json";
    private static final String RESOURCE_SCHEMA_DRAFT06 = "/meta-schemas/schema-draft06.json";
    private static final String RESOURCE_SCHEMA_DRAFT07 = "/meta-schemas/schema-draft07.json";
    private final JsonSchemaVersion version;

    /* compiled from: InputSource.kt */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u0011J\f\u0010\u0012\u001a\u00020\f*\u00020\u0011H\u0002R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0011\u0010\u0007\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0006R\u0011\u0010\t\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u0006R\u000e\u0010\u000b\u001a\u00020\fX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\fX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\fX\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0013"}, d2 = {"Lcom/worldturner/medeia/api/MetaSchemaInputSource$Companion;", "", "()V", "DRAFT04", "Lcom/worldturner/medeia/api/MetaSchemaInputSource;", "getDRAFT04", "()Lcom/worldturner/medeia/api/MetaSchemaInputSource;", "DRAFT06", "getDRAFT06", "DRAFT07", "getDRAFT07", "RESOURCE_SCHEMA_DRAFT04", "", "RESOURCE_SCHEMA_DRAFT06", "RESOURCE_SCHEMA_DRAFT07", "forVersion", "version", "Lcom/worldturner/medeia/api/JsonSchemaVersion;", "toMetaSchemaResource", "medeia-validator-core"}, k = 1, mv = {1, 1, 13})
    /* loaded from: classes4.dex */
    public static final class Companion {

        @Metadata(bv = {1, 0, 3}, k = 3, mv = {1, 1, 13})
        /* loaded from: classes4.dex */
        public final /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;
            public static final /* synthetic */ int[] $EnumSwitchMapping$1;

            static {
                int[] iArr = new int[JsonSchemaVersion.values().length];
                $EnumSwitchMapping$0 = iArr;
                JsonSchemaVersion jsonSchemaVersion = JsonSchemaVersion.DRAFT04;
                iArr[jsonSchemaVersion.ordinal()] = 1;
                JsonSchemaVersion jsonSchemaVersion2 = JsonSchemaVersion.DRAFT06;
                iArr[jsonSchemaVersion2.ordinal()] = 2;
                JsonSchemaVersion jsonSchemaVersion3 = JsonSchemaVersion.DRAFT07;
                iArr[jsonSchemaVersion3.ordinal()] = 3;
                int[] iArr2 = new int[JsonSchemaVersion.values().length];
                $EnumSwitchMapping$1 = iArr2;
                iArr2[jsonSchemaVersion.ordinal()] = 1;
                iArr2[jsonSchemaVersion2.ordinal()] = 2;
                iArr2[jsonSchemaVersion3.ordinal()] = 3;
            }
        }

        private Companion() {
        }

        public /* synthetic */ Companion(e eVar) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final String toMetaSchemaResource(JsonSchemaVersion jsonSchemaVersion) {
            int i = WhenMappings.$EnumSwitchMapping$0[jsonSchemaVersion.ordinal()];
            if (i != 1) {
                if (i != 2) {
                    if (i == 3) {
                        return MetaSchemaInputSource.RESOURCE_SCHEMA_DRAFT07;
                    }
                    throw new h();
                }
                return MetaSchemaInputSource.RESOURCE_SCHEMA_DRAFT06;
            }
            return MetaSchemaInputSource.RESOURCE_SCHEMA_DRAFT04;
        }

        public final MetaSchemaInputSource forVersion(JsonSchemaVersion jsonSchemaVersion) {
            j.g(jsonSchemaVersion, "version");
            int i = WhenMappings.$EnumSwitchMapping$1[jsonSchemaVersion.ordinal()];
            if (i != 1) {
                if (i != 2) {
                    if (i == 3) {
                        return getDRAFT07();
                    }
                    throw new h();
                }
                return getDRAFT06();
            }
            return getDRAFT04();
        }

        public final MetaSchemaInputSource getDRAFT04() {
            return MetaSchemaInputSource.DRAFT04;
        }

        public final MetaSchemaInputSource getDRAFT06() {
            return MetaSchemaInputSource.DRAFT06;
        }

        public final MetaSchemaInputSource getDRAFT07() {
            return MetaSchemaInputSource.DRAFT07;
        }
    }

    private MetaSchemaInputSource(JsonSchemaVersion jsonSchemaVersion) {
        this.version = jsonSchemaVersion;
    }

    @Override // com.worldturner.medeia.api.InputSource
    public String getName() {
        String metaSchemaResource = Companion.toMetaSchemaResource(this.version);
        return q.K0('/', metaSchemaResource, metaSchemaResource);
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
        InputStream resourceAsStream = MetaSchemaInputSource.class.getResourceAsStream(Companion.toMetaSchemaResource(this.version));
        j.b(resourceAsStream, "this::class.java.getReso…n.toMetaSchemaResource())");
        return resourceAsStream;
    }

    public final JsonSchemaVersion getVersion() {
        return this.version;
    }

    public String toString() {
        return "MetaSchemaInputSource(version=" + this.version + ')';
    }
}
