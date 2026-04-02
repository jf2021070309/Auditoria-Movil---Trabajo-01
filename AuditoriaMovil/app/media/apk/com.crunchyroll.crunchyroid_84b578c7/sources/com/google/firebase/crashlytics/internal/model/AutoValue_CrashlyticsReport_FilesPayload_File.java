package com.google.firebase.crashlytics.internal.model;

import com.amazon.aps.iva.c80.a;
import com.google.firebase.crashlytics.internal.model.CrashlyticsReport;
import java.util.Arrays;
/* loaded from: classes4.dex */
final class AutoValue_CrashlyticsReport_FilesPayload_File extends CrashlyticsReport.FilesPayload.File {
    private final byte[] contents;
    private final String filename;

    /* loaded from: classes4.dex */
    public static final class Builder extends CrashlyticsReport.FilesPayload.File.Builder {
        private byte[] contents;
        private String filename;

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.FilesPayload.File.Builder
        public CrashlyticsReport.FilesPayload.File build() {
            String str;
            if (this.filename == null) {
                str = " filename";
            } else {
                str = "";
            }
            if (this.contents == null) {
                str = a.f(str, " contents");
            }
            if (str.isEmpty()) {
                return new AutoValue_CrashlyticsReport_FilesPayload_File(this.filename, this.contents);
            }
            throw new IllegalStateException("Missing required properties:".concat(str));
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.FilesPayload.File.Builder
        public CrashlyticsReport.FilesPayload.File.Builder setContents(byte[] bArr) {
            if (bArr != null) {
                this.contents = bArr;
                return this;
            }
            throw new NullPointerException("Null contents");
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.FilesPayload.File.Builder
        public CrashlyticsReport.FilesPayload.File.Builder setFilename(String str) {
            if (str != null) {
                this.filename = str;
                return this;
            }
            throw new NullPointerException("Null filename");
        }
    }

    public boolean equals(Object obj) {
        byte[] contents;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CrashlyticsReport.FilesPayload.File)) {
            return false;
        }
        CrashlyticsReport.FilesPayload.File file = (CrashlyticsReport.FilesPayload.File) obj;
        if (this.filename.equals(file.getFilename())) {
            byte[] bArr = this.contents;
            if (file instanceof AutoValue_CrashlyticsReport_FilesPayload_File) {
                contents = ((AutoValue_CrashlyticsReport_FilesPayload_File) file).contents;
            } else {
                contents = file.getContents();
            }
            if (Arrays.equals(bArr, contents)) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.FilesPayload.File
    public byte[] getContents() {
        return this.contents;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.FilesPayload.File
    public String getFilename() {
        return this.filename;
    }

    public int hashCode() {
        return ((this.filename.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.contents);
    }

    public String toString() {
        return "File{filename=" + this.filename + ", contents=" + Arrays.toString(this.contents) + "}";
    }

    private AutoValue_CrashlyticsReport_FilesPayload_File(String str, byte[] bArr) {
        this.filename = str;
        this.contents = bArr;
    }
}
