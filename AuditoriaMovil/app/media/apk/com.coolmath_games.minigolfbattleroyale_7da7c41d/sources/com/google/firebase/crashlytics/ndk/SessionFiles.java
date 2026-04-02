package com.google.firebase.crashlytics.ndk;

import java.io.File;
/* loaded from: classes2.dex */
final class SessionFiles {
    public final File app;
    public final File binaryImages;
    public final File device;
    public final File metadata;
    public final File minidump;
    public final File os;
    public final File session;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static final class Builder {
        private File app;
        private File binaryImages;
        private File device;
        private File metadata;
        private File minidump;
        private File os;
        private File session;

        /* JADX INFO: Access modifiers changed from: package-private */
        public Builder minidumpFile(File file) {
            this.minidump = file;
            return this;
        }

        Builder binaryImagesFile(File file) {
            this.binaryImages = file;
            return this;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public Builder metadataFile(File file) {
            this.metadata = file;
            return this;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public Builder sessionFile(File file) {
            this.session = file;
            return this;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public Builder appFile(File file) {
            this.app = file;
            return this;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public Builder deviceFile(File file) {
            this.device = file;
            return this;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public Builder osFile(File file) {
            this.os = file;
            return this;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public SessionFiles build() {
            return new SessionFiles(this);
        }
    }

    private SessionFiles(Builder builder) {
        this.minidump = builder.minidump;
        this.binaryImages = builder.binaryImages;
        this.metadata = builder.metadata;
        this.session = builder.session;
        this.app = builder.app;
        this.device = builder.device;
        this.os = builder.os;
    }
}
