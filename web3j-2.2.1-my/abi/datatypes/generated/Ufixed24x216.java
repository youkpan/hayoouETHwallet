package org.web3j.abi.datatypes.generated;

import java.math.BigInteger;
import org.web3j.abi.datatypes.Ufixed;

/**
 * <p>Auto generated code.<br>
 * <strong>Do not modifiy!</strong><br>
 * Please use {@link org.web3j.codegen.AbiTypesGenerator} to update.</p>
 */
public class Ufixed24x216 extends Ufixed {
    public static final Ufixed24x216 DEFAULT = new Ufixed24x216(BigInteger.ZERO);

    public Ufixed24x216(BigInteger value) {
        super(24, 216, value);
    }

    public Ufixed24x216(int mBitSize, int nBitSize, BigInteger m, BigInteger n) {
        super(24, 216, m, n);
    }
}
