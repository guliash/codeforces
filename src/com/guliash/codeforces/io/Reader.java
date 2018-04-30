package com.guliash.codeforces.io;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Reader {
    private static final String DELIMITER = " ";
    private StringTokenizer st = new StringTokenizer("");
    private final BufferedReader in;

    public Reader(InputStream in) {
        this.in = new BufferedReader(new InputStreamReader(in));
    }

    @SuppressWarnings("WeakerAccess")
    public String next() {
        if (!st.hasMoreTokens()) {
            st = new StringTokenizer(rl());
        }
        return st.nextToken(DELIMITER);
    }

    @SuppressWarnings("WeakerAccess")
    public String rl() {
        try {
            return in.readLine();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public int ni() {
        return Integer.parseInt(next());
    }

    public long nl() {
        return Long.parseLong(next());
    }

    public double nd() {
        return Double.parseDouble(next());
    }

}