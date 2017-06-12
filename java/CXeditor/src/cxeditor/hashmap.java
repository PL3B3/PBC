/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cxeditor;

import java.math.BigInteger;
import java.nio.charset.Charset;

/**
 *
 * @author root
 */
public class hashmap {
    
    private static final BigInteger INIT64 = new BigInteger("14695981039346656037");
    private static final BigInteger PRIME64 = new BigInteger("1099511628211");
    private static final BigInteger MOD64   = new BigInteger("2").pow(64);
    
    private BigInteger length;
    
    public hashmap(BigInteger l) {
        length = l;
    }
    
    public int getHash(String key) {
        byte[] data = key.getBytes(Charset.defaultCharset());
        
        BigInteger hash = INIT64;
        
        for(byte b : data) {
            hash = hash.xor(BigInteger.valueOf((int) b & 0xff));
            hash = hash.multiply(PRIME64).mod(MOD64);
        }
        
        return (hash.mod(length)).intValueExact();
    }
    
}
