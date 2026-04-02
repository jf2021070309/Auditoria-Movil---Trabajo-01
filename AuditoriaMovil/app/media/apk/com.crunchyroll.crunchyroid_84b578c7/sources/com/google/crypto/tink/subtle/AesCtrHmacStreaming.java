package com.google.crypto.tink.subtle;

import com.amazon.aps.iva.q.c0;
import com.google.crypto.tink.config.internal.TinkFipsUtil;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.channels.ReadableByteChannel;
import java.nio.channels.SeekableByteChannel;
import java.nio.channels.WritableByteChannel;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.util.Arrays;
import javax.crypto.Cipher;
import javax.crypto.Mac;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
/* loaded from: classes4.dex */
public final class AesCtrHmacStreaming extends NonceBasedStreamingAead {
    public static final TinkFipsUtil.AlgorithmFipsCompatibility FIPS = TinkFipsUtil.AlgorithmFipsCompatibility.ALGORITHM_NOT_FIPS;
    private static final int HMAC_KEY_SIZE_IN_BYTES = 32;
    private static final int NONCE_PREFIX_IN_BYTES = 7;
    private static final int NONCE_SIZE_IN_BYTES = 16;
    private final int ciphertextSegmentSize;
    private final int firstSegmentOffset;
    private final String hkdfAlgo;
    private final byte[] ikm;
    private final int keySizeInBytes;
    private final int plaintextSegmentSize;
    private final String tagAlgo;
    private final int tagSizeInBytes;

    /* loaded from: classes4.dex */
    public class AesCtrHmacStreamDecrypter implements StreamSegmentDecrypter {
        static final /* synthetic */ boolean $assertionsDisabled = false;
        private Cipher cipher;
        private SecretKeySpec hmacKeySpec;
        private SecretKeySpec keySpec;
        private Mac mac;
        private byte[] noncePrefix;

        public AesCtrHmacStreamDecrypter() {
        }

        @Override // com.google.crypto.tink.subtle.StreamSegmentDecrypter
        public synchronized void decryptSegment(ByteBuffer byteBuffer, int i, boolean z, ByteBuffer byteBuffer2) throws GeneralSecurityException {
            int position = byteBuffer.position();
            byte[] nonceForSegment = AesCtrHmacStreaming.this.nonceForSegment(this.noncePrefix, i, z);
            int remaining = byteBuffer.remaining();
            if (remaining >= AesCtrHmacStreaming.this.tagSizeInBytes) {
                int i2 = (remaining - AesCtrHmacStreaming.this.tagSizeInBytes) + position;
                ByteBuffer duplicate = byteBuffer.duplicate();
                duplicate.limit(i2);
                ByteBuffer duplicate2 = byteBuffer.duplicate();
                duplicate2.position(i2);
                this.mac.init(this.hmacKeySpec);
                this.mac.update(nonceForSegment);
                this.mac.update(duplicate);
                byte[] copyOf = Arrays.copyOf(this.mac.doFinal(), AesCtrHmacStreaming.this.tagSizeInBytes);
                byte[] bArr = new byte[AesCtrHmacStreaming.this.tagSizeInBytes];
                duplicate2.get(bArr);
                if (Bytes.equal(bArr, copyOf)) {
                    byteBuffer.limit(i2);
                    this.cipher.init(1, this.keySpec, new IvParameterSpec(nonceForSegment));
                    this.cipher.doFinal(byteBuffer, byteBuffer2);
                } else {
                    throw new GeneralSecurityException("Tag mismatch");
                }
            } else {
                throw new GeneralSecurityException("Ciphertext too short");
            }
        }

        @Override // com.google.crypto.tink.subtle.StreamSegmentDecrypter
        public synchronized void init(ByteBuffer byteBuffer, byte[] bArr) throws GeneralSecurityException {
            if (byteBuffer.remaining() == AesCtrHmacStreaming.this.getHeaderLength()) {
                if (byteBuffer.get() == AesCtrHmacStreaming.this.getHeaderLength()) {
                    this.noncePrefix = new byte[7];
                    byte[] bArr2 = new byte[AesCtrHmacStreaming.this.keySizeInBytes];
                    byteBuffer.get(bArr2);
                    byteBuffer.get(this.noncePrefix);
                    byte[] deriveKeyMaterial = AesCtrHmacStreaming.this.deriveKeyMaterial(bArr2, bArr);
                    this.keySpec = AesCtrHmacStreaming.this.deriveKeySpec(deriveKeyMaterial);
                    this.hmacKeySpec = AesCtrHmacStreaming.this.deriveHmacKeySpec(deriveKeyMaterial);
                    this.cipher = AesCtrHmacStreaming.access$000();
                    this.mac = AesCtrHmacStreaming.this.macInstance();
                } else {
                    throw new GeneralSecurityException("Invalid ciphertext");
                }
            } else {
                throw new InvalidAlgorithmParameterException("Invalid header length");
            }
        }
    }

    public AesCtrHmacStreaming(byte[] bArr, String str, int i, String str2, int i2, int i3, int i4) throws GeneralSecurityException {
        if (FIPS.isCompatible()) {
            validateParameters(bArr.length, i, str2, i2, i3, i4);
            this.ikm = Arrays.copyOf(bArr, bArr.length);
            this.hkdfAlgo = str;
            this.keySizeInBytes = i;
            this.tagAlgo = str2;
            this.tagSizeInBytes = i2;
            this.ciphertextSegmentSize = i3;
            this.firstSegmentOffset = i4;
            this.plaintextSegmentSize = i3 - i2;
            return;
        }
        throw new GeneralSecurityException("Can not use AES-CTR-HMAC streaming in FIPS-mode.");
    }

    public static /* synthetic */ Cipher access$000() throws GeneralSecurityException {
        return cipherInstance();
    }

    private static Cipher cipherInstance() throws GeneralSecurityException {
        return EngineFactory.CIPHER.getInstance("AES/CTR/NoPadding");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public SecretKeySpec deriveHmacKeySpec(byte[] bArr) throws GeneralSecurityException {
        return new SecretKeySpec(bArr, this.keySizeInBytes, 32, this.tagAlgo);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public byte[] deriveKeyMaterial(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        return Hkdf.computeHkdf(this.hkdfAlgo, this.ikm, bArr, bArr2, this.keySizeInBytes + 32);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public SecretKeySpec deriveKeySpec(byte[] bArr) throws GeneralSecurityException {
        return new SecretKeySpec(bArr, 0, this.keySizeInBytes, "AES");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Mac macInstance() throws GeneralSecurityException {
        return EngineFactory.MAC.getInstance(this.tagAlgo);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public byte[] nonceForSegment(byte[] bArr, long j, boolean z) throws GeneralSecurityException {
        ByteBuffer allocate = ByteBuffer.allocate(16);
        allocate.order(ByteOrder.BIG_ENDIAN);
        allocate.put(bArr);
        SubtleUtil.putAsUnsigedInt(allocate, j);
        allocate.put(z ? (byte) 1 : (byte) 0);
        allocate.putInt(0);
        return allocate.array();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public byte[] randomNonce() {
        return Random.randBytes(7);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public byte[] randomSalt() {
        return Random.randBytes(this.keySizeInBytes);
    }

    private static void validateParameters(int i, int i2, String str, int i3, int i4, int i5) throws InvalidAlgorithmParameterException {
        if (i >= 16 && i >= i2) {
            Validators.validateAesKeySize(i2);
            if (i3 >= 10) {
                if ((str.equals("HmacSha1") && i3 > 20) || ((str.equals("HmacSha256") && i3 > 32) || (str.equals("HmacSha512") && i3 > 64))) {
                    throw new InvalidAlgorithmParameterException("tag size too big");
                }
                if (((((i4 - i5) - i3) - i2) - 7) - 1 > 0) {
                    return;
                }
                throw new InvalidAlgorithmParameterException("ciphertextSegmentSize too small");
            }
            throw new InvalidAlgorithmParameterException(c0.a("tag size too small ", i3));
        }
        throw new InvalidAlgorithmParameterException("ikm too short, must be >= " + Math.max(16, i2));
    }

    public long expectedCiphertextSize(long j) {
        long ciphertextOffset = j + getCiphertextOffset();
        int i = this.plaintextSegmentSize;
        long j2 = (ciphertextOffset / i) * this.ciphertextSegmentSize;
        long j3 = ciphertextOffset % i;
        if (j3 > 0) {
            return j2 + j3 + this.tagSizeInBytes;
        }
        return j2;
    }

    @Override // com.google.crypto.tink.subtle.NonceBasedStreamingAead
    public int getCiphertextOffset() {
        return getHeaderLength() + this.firstSegmentOffset;
    }

    @Override // com.google.crypto.tink.subtle.NonceBasedStreamingAead
    public int getCiphertextOverhead() {
        return this.tagSizeInBytes;
    }

    @Override // com.google.crypto.tink.subtle.NonceBasedStreamingAead
    public int getCiphertextSegmentSize() {
        return this.ciphertextSegmentSize;
    }

    public int getFirstSegmentOffset() {
        return this.firstSegmentOffset;
    }

    @Override // com.google.crypto.tink.subtle.NonceBasedStreamingAead
    public int getHeaderLength() {
        return this.keySizeInBytes + 1 + 7;
    }

    @Override // com.google.crypto.tink.subtle.NonceBasedStreamingAead
    public int getPlaintextSegmentSize() {
        return this.plaintextSegmentSize;
    }

    @Override // com.google.crypto.tink.subtle.NonceBasedStreamingAead, com.google.crypto.tink.StreamingAead
    public /* bridge */ /* synthetic */ ReadableByteChannel newDecryptingChannel(ReadableByteChannel readableByteChannel, byte[] bArr) throws GeneralSecurityException, IOException {
        return super.newDecryptingChannel(readableByteChannel, bArr);
    }

    @Override // com.google.crypto.tink.subtle.NonceBasedStreamingAead, com.google.crypto.tink.StreamingAead
    public /* bridge */ /* synthetic */ InputStream newDecryptingStream(InputStream inputStream, byte[] bArr) throws GeneralSecurityException, IOException {
        return super.newDecryptingStream(inputStream, bArr);
    }

    @Override // com.google.crypto.tink.subtle.NonceBasedStreamingAead, com.google.crypto.tink.StreamingAead
    public /* bridge */ /* synthetic */ WritableByteChannel newEncryptingChannel(WritableByteChannel writableByteChannel, byte[] bArr) throws GeneralSecurityException, IOException {
        return super.newEncryptingChannel(writableByteChannel, bArr);
    }

    @Override // com.google.crypto.tink.subtle.NonceBasedStreamingAead, com.google.crypto.tink.StreamingAead
    public /* bridge */ /* synthetic */ OutputStream newEncryptingStream(OutputStream outputStream, byte[] bArr) throws GeneralSecurityException, IOException {
        return super.newEncryptingStream(outputStream, bArr);
    }

    @Override // com.google.crypto.tink.subtle.NonceBasedStreamingAead, com.google.crypto.tink.StreamingAead
    public /* bridge */ /* synthetic */ SeekableByteChannel newSeekableDecryptingChannel(SeekableByteChannel seekableByteChannel, byte[] bArr) throws GeneralSecurityException, IOException {
        return super.newSeekableDecryptingChannel(seekableByteChannel, bArr);
    }

    @Override // com.google.crypto.tink.subtle.NonceBasedStreamingAead
    public AesCtrHmacStreamDecrypter newStreamSegmentDecrypter() throws GeneralSecurityException {
        return new AesCtrHmacStreamDecrypter();
    }

    @Override // com.google.crypto.tink.subtle.NonceBasedStreamingAead
    public AesCtrHmacStreamEncrypter newStreamSegmentEncrypter(byte[] bArr) throws GeneralSecurityException {
        return new AesCtrHmacStreamEncrypter(bArr);
    }

    /* loaded from: classes4.dex */
    public class AesCtrHmacStreamEncrypter implements StreamSegmentEncrypter {
        private final Cipher cipher = AesCtrHmacStreaming.access$000();
        private long encryptedSegments;
        private ByteBuffer header;
        private final SecretKeySpec hmacKeySpec;
        private final SecretKeySpec keySpec;
        private final Mac mac;
        private final byte[] noncePrefix;

        public AesCtrHmacStreamEncrypter(byte[] bArr) throws GeneralSecurityException {
            this.encryptedSegments = 0L;
            this.mac = AesCtrHmacStreaming.this.macInstance();
            this.encryptedSegments = 0L;
            byte[] randomSalt = AesCtrHmacStreaming.this.randomSalt();
            byte[] randomNonce = AesCtrHmacStreaming.this.randomNonce();
            this.noncePrefix = randomNonce;
            ByteBuffer allocate = ByteBuffer.allocate(AesCtrHmacStreaming.this.getHeaderLength());
            this.header = allocate;
            allocate.put((byte) AesCtrHmacStreaming.this.getHeaderLength());
            this.header.put(randomSalt);
            this.header.put(randomNonce);
            this.header.flip();
            byte[] deriveKeyMaterial = AesCtrHmacStreaming.this.deriveKeyMaterial(randomSalt, bArr);
            this.keySpec = AesCtrHmacStreaming.this.deriveKeySpec(deriveKeyMaterial);
            this.hmacKeySpec = AesCtrHmacStreaming.this.deriveHmacKeySpec(deriveKeyMaterial);
        }

        @Override // com.google.crypto.tink.subtle.StreamSegmentEncrypter
        public synchronized void encryptSegment(ByteBuffer byteBuffer, boolean z, ByteBuffer byteBuffer2) throws GeneralSecurityException {
            int position = byteBuffer2.position();
            byte[] nonceForSegment = AesCtrHmacStreaming.this.nonceForSegment(this.noncePrefix, this.encryptedSegments, z);
            this.cipher.init(1, this.keySpec, new IvParameterSpec(nonceForSegment));
            this.encryptedSegments++;
            this.cipher.doFinal(byteBuffer, byteBuffer2);
            ByteBuffer duplicate = byteBuffer2.duplicate();
            duplicate.flip();
            duplicate.position(position);
            this.mac.init(this.hmacKeySpec);
            this.mac.update(nonceForSegment);
            this.mac.update(duplicate);
            byteBuffer2.put(this.mac.doFinal(), 0, AesCtrHmacStreaming.this.tagSizeInBytes);
        }

        @Override // com.google.crypto.tink.subtle.StreamSegmentEncrypter
        public ByteBuffer getHeader() {
            return this.header.asReadOnlyBuffer();
        }

        @Override // com.google.crypto.tink.subtle.StreamSegmentEncrypter
        public synchronized void encryptSegment(ByteBuffer byteBuffer, ByteBuffer byteBuffer2, boolean z, ByteBuffer byteBuffer3) throws GeneralSecurityException {
            int position = byteBuffer3.position();
            byte[] nonceForSegment = AesCtrHmacStreaming.this.nonceForSegment(this.noncePrefix, this.encryptedSegments, z);
            this.cipher.init(1, this.keySpec, new IvParameterSpec(nonceForSegment));
            this.encryptedSegments++;
            this.cipher.update(byteBuffer, byteBuffer3);
            this.cipher.doFinal(byteBuffer2, byteBuffer3);
            ByteBuffer duplicate = byteBuffer3.duplicate();
            duplicate.flip();
            duplicate.position(position);
            this.mac.init(this.hmacKeySpec);
            this.mac.update(nonceForSegment);
            this.mac.update(duplicate);
            byteBuffer3.put(this.mac.doFinal(), 0, AesCtrHmacStreaming.this.tagSizeInBytes);
        }
    }
}
